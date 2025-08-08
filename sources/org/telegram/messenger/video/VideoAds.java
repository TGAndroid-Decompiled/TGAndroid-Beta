package org.telegram.messenger.video;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Text;
import org.telegram.ui.DarkBlueThemeResourcesProvider;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ReportBottomSheet;

public class VideoAds {
    private static HashMap<VideoAdsLocation, VideoAds> cached = new HashMap<>();
    private int between_delay;
    private Bulletin bulletin;
    private BulletinFactory bulletinFactory;
    private long bulletinShowTime;
    private final int currentAccount;
    private long currentBulletinPassedTime;
    private ItemOptions currentMenu;
    private float currentMenuTranslationY;
    private final long dialogId;
    private boolean lastPopupShown;
    private long lastTime;
    private boolean loaded;
    private boolean loading;
    private final int msg_id;
    private Runnable onPopupCallback;
    private PremiumFeatureBottomSheet premiumSheet;
    private int requestId;
    private int start_delay;
    public boolean videoWasPlaying;
    private boolean waitingPaused;
    private long waitingTimeSince;
    private final ArrayList<TLRPC.TL_sponsoredMessage> ads = new ArrayList<>();
    private boolean first = true;
    private final Runnable showRunnable = new Runnable() {
        @Override
        public final void run() {
            VideoAds.this.show();
        }
    };

    public static class VideoAdsLocation {
        int currentAccount;
        long dialogId;

        public VideoAdsLocation(int i, long j) {
            this.currentAccount = i;
            this.dialogId = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            VideoAdsLocation videoAdsLocation = (VideoAdsLocation) obj;
            return this.currentAccount == videoAdsLocation.currentAccount && this.dialogId == videoAdsLocation.dialogId;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.currentAccount), Long.valueOf(this.dialogId));
        }
    }

    public static VideoAds make(int i, long j, int i2, BulletinFactory bulletinFactory) {
        VideoAdsLocation videoAdsLocation = new VideoAdsLocation(i, j);
        VideoAds videoAds = cached.get(videoAdsLocation);
        if (videoAds == null || ((videoAds.msg_id != i2 || System.currentTimeMillis() - videoAds.lastTime > 180000) && videoAds.ads.isEmpty())) {
            HashMap<VideoAdsLocation, VideoAds> hashMap = cached;
            VideoAds videoAds2 = new VideoAds(i, j, i2, bulletinFactory);
            hashMap.put(videoAdsLocation, videoAds2);
            videoAds = videoAds2;
        }
        videoAds.init(bulletinFactory);
        return videoAds;
    }

    private VideoAds(int i, long j, int i2, BulletinFactory bulletinFactory) {
        this.lastTime = 0L;
        this.currentAccount = i;
        this.dialogId = j;
        this.msg_id = i2;
        this.lastTime = System.currentTimeMillis();
        init(bulletinFactory);
    }

    public void setPauseOnPopupCallback(Runnable runnable) {
        this.onPopupCallback = runnable;
    }

    private void checkPopupShownCallback() {
        if (this.lastPopupShown != isPopupShown()) {
            this.lastPopupShown = isPopupShown();
            Runnable runnable = this.onPopupCallback;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public boolean isPopupShown() {
        PremiumFeatureBottomSheet premiumFeatureBottomSheet;
        ItemOptions itemOptions = this.currentMenu;
        return (itemOptions != null && itemOptions.isShown()) || ((premiumFeatureBottomSheet = this.premiumSheet) != null && premiumFeatureBottomSheet.isShown());
    }

    private void init(BulletinFactory bulletinFactory) {
        this.bulletinFactory = bulletinFactory;
        if (this.currentBulletinPassedTime <= 0) {
            this.lastTime = System.currentTimeMillis();
            if (this.waitingPaused) {
                this.waitingTimeSince = System.currentTimeMillis();
            }
            this.first = true;
        }
        if (!this.loaded) {
            load();
        } else {
            schedule();
        }
    }

    private void load() {
        if (this.loading || this.loaded) {
            return;
        }
        if (UserConfig.getInstance(this.currentAccount).isPremium() && MessagesController.getInstance(this.currentAccount).isSponsoredDisabled()) {
            return;
        }
        this.loading = true;
        TLRPC.TL_messages_getSponsoredMessages tL_messages_getSponsoredMessages = new TLRPC.TL_messages_getSponsoredMessages();
        tL_messages_getSponsoredMessages.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
        tL_messages_getSponsoredMessages.flags = 1 | tL_messages_getSponsoredMessages.flags;
        tL_messages_getSponsoredMessages.msg_id = this.msg_id;
        this.requestId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getSponsoredMessages, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                VideoAds.this.lambda$load$1(tLObject, tL_error);
            }
        });
    }

    public void lambda$load$1(final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                VideoAds.this.lambda$load$0(tLObject);
            }
        });
    }

    public void lambda$load$0(TLObject tLObject) {
        if (this.loading) {
            if (tLObject instanceof TLRPC.TL_messages_sponsoredMessages) {
                TLRPC.TL_messages_sponsoredMessages tL_messages_sponsoredMessages = (TLRPC.TL_messages_sponsoredMessages) tLObject;
                MessagesController.getInstance(this.currentAccount).putUsers(tL_messages_sponsoredMessages.users, false);
                MessagesController.getInstance(this.currentAccount).putChats(tL_messages_sponsoredMessages.chats, false);
                this.ads.addAll(tL_messages_sponsoredMessages.messages);
                this.start_delay = tL_messages_sponsoredMessages.start_delay;
                this.between_delay = tL_messages_sponsoredMessages.between_delay;
            }
            this.loaded = true;
            this.loading = false;
            schedule();
        }
    }

    private void schedule() {
        AndroidUtilities.cancelRunOnUIThread(this.showRunnable);
        if (!this.loaded || this.ads.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(this.showRunnable, Math.max(0L, ((this.first ? this.start_delay : this.between_delay) * 1000) - (System.currentTimeMillis() - this.lastTime)));
    }

    public void setWaitingPaused(boolean z) {
        if (this.waitingPaused == z) {
            return;
        }
        this.waitingPaused = z;
        AndroidUtilities.cancelRunOnUIThread(this.showRunnable);
        if (z) {
            this.waitingTimeSince = System.currentTimeMillis();
            return;
        }
        this.lastTime += System.currentTimeMillis() - this.waitingTimeSince;
        if (this.bulletin == null) {
            schedule();
        }
    }

    public void show() {
        if (this.ads.isEmpty()) {
            return;
        }
        final TLRPC.TL_sponsoredMessage tL_sponsoredMessage = this.ads.get(0);
        final long currentTimeMillis = System.currentTimeMillis() - this.currentBulletinPassedTime;
        this.bulletinShowTime = currentTimeMillis;
        Bulletin bulletin = this.bulletin;
        if (bulletin != null) {
            bulletin.hide();
            this.bulletin = null;
        }
        final Context context = this.bulletinFactory.getContext();
        final Theme.ResourcesProvider resourcesProvider = this.bulletinFactory.getResourcesProvider();
        final AdLayout adLayout = new AdLayout(context, resourcesProvider) {
            @Override
            public void updatePosition() {
                super.updatePosition();
                if (VideoAds.this.currentMenu != null) {
                    VideoAds.this.currentMenu.setTranslationY(getTranslationY() - VideoAds.this.currentMenuTranslationY);
                }
            }
        };
        adLayout.titleTextView.setText(tL_sponsoredMessage.title);
        SimpleTextView simpleTextView = adLayout.titleTextView;
        Context context2 = this.bulletinFactory.getContext();
        int i = Theme.key_featuredStickers_addButton;
        simpleTextView.setRightDrawable(new AdOptionsDrawable(context2, Theme.getColor(i, this.bulletinFactory.getResourcesProvider())));
        adLayout.subtitleTextView.setText(tL_sponsoredMessage.message);
        TLRPC.MessageMedia messageMedia = tL_sponsoredMessage.media;
        if (messageMedia != null) {
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                adLayout.imageView.setImage(ImageLocation.getForDocument(tL_sponsoredMessage.media.document), "48_48", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 48), tL_sponsoredMessage.media.document), "48_48", null, 0L, 0, null);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 48, true, null, true);
                    adLayout.imageView.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, tL_sponsoredMessage.media.photo), "48_48", ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(tL_sponsoredMessage.media.photo.sizes, 48, true, closestPhotoSizeWithSize, false), tL_sponsoredMessage.media.photo), "48_48", null, 0L, 0, null);
                }
            }
        } else {
            TLRPC.Photo photo2 = tL_sponsoredMessage.photo;
            if (photo2 != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 48, true, null, true);
                adLayout.imageView.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize2, tL_sponsoredMessage.photo), "48_48", ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(tL_sponsoredMessage.photo.sizes, 48, true, closestPhotoSizeWithSize2, false), tL_sponsoredMessage.photo), "48_48", null, 0L, 0, null);
            } else {
                adLayout.hideImage();
            }
        }
        final CloseDrawable closeDrawable = new CloseDrawable(adLayout.buttonView, tL_sponsoredMessage.min_display_duration, tL_sponsoredMessage.max_display_duration, this.currentBulletinPassedTime);
        closeDrawable.setColor(Theme.getColor(i, this.bulletinFactory.getResourcesProvider()));
        adLayout.buttonView.setImageDrawable(closeDrawable);
        adLayout.buttonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                VideoAds.this.lambda$show$2(closeDrawable, view);
            }
        });
        final Bulletin create = this.bulletinFactory.create(adLayout, tL_sponsoredMessage.max_display_duration * 1000);
        this.bulletin = create;
        create.setCanHideOnShow = false;
        create.setCanHide(false);
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                VideoAds.this.lambda$show$3(create, tL_sponsoredMessage);
            }
        };
        final long[] jArr = new long[1];
        final long[] jArr2 = new long[1];
        final boolean[] zArr = new boolean[1];
        final Utilities.Callback callback = new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                VideoAds.this.lambda$show$4(create, zArr, closeDrawable, jArr2, runnable, jArr, currentTimeMillis, tL_sponsoredMessage, (Boolean) obj);
            }
        };
        AndroidUtilities.runOnUIThread(runnable, tL_sponsoredMessage.min_display_duration * 1000);
        final boolean[] zArr2 = new boolean[1];
        Bulletin bulletin2 = this.bulletin;
        bulletin2.hideAfterBottomSheet = false;
        bulletin2.setOnHideListener(new Runnable() {
            @Override
            public final void run() {
                VideoAds.this.lambda$show$5(create, zArr2);
            }
        });
        adLayout.titleTextView.setRightDrawableOnClick(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                VideoAds.this.lambda$show$17(create, tL_sponsoredMessage, context, resourcesProvider, adLayout, callback, view);
            }
        });
        this.bulletin.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                VideoAds.this.lambda$show$18(tL_sponsoredMessage, view);
            }
        });
        this.bulletin.show();
        logSponsoredShown(tL_sponsoredMessage);
    }

    public void lambda$show$2(CloseDrawable closeDrawable, View view) {
        if (closeDrawable.isCrossAvailable()) {
            Bulletin bulletin = this.bulletin;
            if (bulletin != null) {
                bulletin.hide();
                return;
            }
            return;
        }
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            Bulletin bulletin2 = this.bulletin;
            if (bulletin2 != null) {
                bulletin2.hide();
                this.bulletin = null;
            }
            MessagesController.getInstance(this.currentAccount).disableAds(true);
            this.bulletinFactory.createAdReportedBulletin(LocaleController.getString(R.string.AdHidden)).show();
            return;
        }
        showPremium();
    }

    public void lambda$show$3(Bulletin bulletin, TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        Bulletin bulletin2 = this.bulletin;
        if (bulletin2 == null || bulletin2 != bulletin) {
            return;
        }
        bulletin2.setDuration((tL_sponsoredMessage.max_display_duration - tL_sponsoredMessage.min_display_duration) * 1000);
        this.bulletin.setCanHide(true);
    }

    public void lambda$show$4(Bulletin bulletin, boolean[] zArr, CloseDrawable closeDrawable, long[] jArr, Runnable runnable, long[] jArr2, long j, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Boolean bool) {
        Bulletin bulletin2 = this.bulletin;
        if (bulletin2 == null || bulletin2 != bulletin || bool.booleanValue() == zArr[0]) {
            return;
        }
        boolean booleanValue = bool.booleanValue();
        zArr[0] = booleanValue;
        closeDrawable.setPaused(booleanValue);
        if (zArr[0]) {
            this.bulletin.setCanHide(false);
            jArr[0] = System.currentTimeMillis();
            AndroidUtilities.cancelRunOnUIThread(runnable);
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(runnable);
        jArr2[0] = jArr2[0] + (System.currentTimeMillis() - jArr[0]);
        long currentTimeMillis = (System.currentTimeMillis() - j) - jArr2[0];
        long j2 = (tL_sponsoredMessage.min_display_duration * 1000) - currentTimeMillis;
        long j3 = (tL_sponsoredMessage.max_display_duration * 1000) - currentTimeMillis;
        if (j3 <= 0) {
            Bulletin bulletin3 = this.bulletin;
            if (bulletin3 != null) {
                bulletin3.hide();
                this.bulletin = null;
                return;
            }
            return;
        }
        if (j2 <= 0) {
            this.bulletin.setDuration((int) j3);
            this.bulletin.setCanHide(true);
        } else {
            AndroidUtilities.runOnUIThread(runnable, j2);
        }
    }

    public void lambda$show$5(Bulletin bulletin, boolean[] zArr) {
        Bulletin bulletin2 = this.bulletin;
        if (bulletin2 == null || bulletin2 != bulletin || zArr[0]) {
            return;
        }
        zArr[0] = true;
        ItemOptions itemOptions = this.currentMenu;
        if (itemOptions != null) {
            itemOptions.dismiss();
            this.currentMenu = null;
        }
        this.bulletin = null;
        this.currentBulletinPassedTime = 0L;
        this.lastTime = System.currentTimeMillis();
        if (this.waitingPaused) {
            this.waitingTimeSince = System.currentTimeMillis();
        }
        if (!this.ads.isEmpty()) {
            this.ads.remove(0);
        }
        this.first = false;
        schedule();
    }

    public void lambda$show$17(org.telegram.ui.Components.Bulletin r19, final org.telegram.tgnet.TLRPC.TL_sponsoredMessage r20, final android.content.Context r21, org.telegram.ui.ActionBar.Theme.ResourcesProvider r22, org.telegram.messenger.video.VideoAds.AdLayout r23, final org.telegram.messenger.Utilities.Callback r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.VideoAds.lambda$show$17(org.telegram.ui.Components.Bulletin, org.telegram.tgnet.TLRPC$TL_sponsoredMessage, android.content.Context, org.telegram.ui.ActionBar.Theme$ResourcesProvider, org.telegram.messenger.video.VideoAds$AdLayout, org.telegram.messenger.Utilities$Callback, android.view.View):void");
    }

    public void lambda$show$7(ItemOptions itemOptions, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Context context, View view) {
        itemOptions.dismiss();
        logSponsoredClicked(tL_sponsoredMessage);
        Browser.openUrl(context, Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, MessagesController.getInstance(this.currentAccount).sponsoredLinksInappAllow, false);
    }

    public static boolean lambda$show$8(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        AndroidUtilities.addToClipboard(tL_sponsoredMessage.url);
        return true;
    }

    public static void lambda$show$9(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        AndroidUtilities.addToClipboard(tL_sponsoredMessage.sponsor_info);
    }

    public static void lambda$show$10(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        AndroidUtilities.addToClipboard(tL_sponsoredMessage.additional_info);
    }

    public void lambda$show$12(ItemOptions itemOptions) {
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            itemOptions.dismiss();
            Bulletin bulletin = this.bulletin;
            if (bulletin != null) {
                bulletin.setCanHide(true);
                this.bulletin.hide();
            }
            this.bulletinFactory.createAdReportedBulletin(LocaleController.getString(R.string.AdHidden)).show();
            MessagesController.getInstance(this.currentAccount).disableAds(true);
            return;
        }
        showPremium();
    }

    public void lambda$show$14(Context context, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, final ItemOptions itemOptions) {
        int i = this.currentAccount;
        long j = this.dialogId;
        BulletinFactory bulletinFactory = this.bulletinFactory;
        DarkBlueThemeResourcesProvider darkBlueThemeResourcesProvider = new DarkBlueThemeResourcesProvider();
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                VideoAds.this.showPremium();
            }
        };
        Objects.requireNonNull(itemOptions);
        ReportBottomSheet.openSponsored(i, context, j, tL_sponsoredMessage, bulletinFactory, darkBlueThemeResourcesProvider, runnable, new Runnable() {
            @Override
            public final void run() {
                ItemOptions.this.dismiss();
            }
        });
    }

    public void lambda$show$15(ItemOptions itemOptions) {
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            itemOptions.dismiss();
            Bulletin bulletin = this.bulletin;
            if (bulletin != null) {
                bulletin.setCanHide(true);
                this.bulletin.hide();
            }
            this.bulletinFactory.createAdReportedBulletin(LocaleController.getString(R.string.AdHidden)).show();
            MessagesController.getInstance(this.currentAccount).disableAds(true);
            return;
        }
        showPremium();
    }

    public void lambda$show$16(Utilities.Callback callback) {
        callback.run(Boolean.FALSE);
        this.currentMenu = null;
        checkPopupShownCallback();
    }

    public void lambda$show$18(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        logSponsoredClicked(tL_sponsoredMessage);
        Browser.openUrl(view.getContext(), Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, MessagesController.getInstance(UserConfig.selectedAccount).sponsoredLinksInappAllow, false);
    }

    public void stop() {
        if (this.bulletin != null) {
            this.currentBulletinPassedTime = System.currentTimeMillis() - this.bulletinShowTime;
            if (!this.ads.isEmpty()) {
                if (this.currentBulletinPassedTime > this.ads.get(0).min_display_duration * 1000) {
                    this.currentBulletinPassedTime = 0L;
                    this.ads.remove(0);
                    this.first = false;
                }
            }
            this.bulletin.hide();
            this.bulletin = null;
        } else {
            this.currentBulletinPassedTime = 0L;
        }
        ItemOptions itemOptions = this.currentMenu;
        if (itemOptions != null) {
            itemOptions.dismiss();
            this.currentMenu = null;
        }
        this.bulletin = null;
        if (this.loading) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.requestId, true);
            this.requestId = 0;
            this.loading = false;
        }
        AndroidUtilities.cancelRunOnUIThread(this.showRunnable);
        setWaitingPaused(true);
    }

    public static class AdOptionsDrawable extends Drawable {
        public final int color;
        public final Drawable icon;
        public final Paint backgroundPaint = new Paint(1);
        public final Text text = new Text(LocaleController.getString(R.string.SponsoredMessageAd), 11.0f, AndroidUtilities.bold());
        private float alpha = 1.0f;

        @Override
        public int getOpacity() {
            return -2;
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }

        public AdOptionsDrawable(Context context, int i) {
            this.color = i;
            Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_other).mutate();
            this.icon = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }

        @Override
        public void draw(Canvas canvas) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getBounds());
            rectF.left += AndroidUtilities.dp(4.0f);
            this.backgroundPaint.setColor(Theme.multAlpha(this.color, this.alpha * 0.2f));
            canvas.drawRoundRect(rectF, rectF.height(), rectF.height(), this.backgroundPaint);
            this.text.draw(canvas, rectF.left + AndroidUtilities.dp(5.0f), rectF.centerY(), this.color, this.alpha);
            this.icon.setBounds(getBounds().right - AndroidUtilities.dp(12.99f), getBounds().centerY() - AndroidUtilities.dp(5.665f), getBounds().right - AndroidUtilities.dp(1.66f), getBounds().centerY() + AndroidUtilities.dp(5.665f));
            this.icon.setAlpha((int) (this.alpha * 255.0f));
            this.icon.draw(canvas);
        }

        @Override
        public void setAlpha(int i) {
            this.alpha = i / 255.0f;
        }

        @Override
        public int getIntrinsicHeight() {
            return AndroidUtilities.dp(16.0f);
        }

        @Override
        public int getIntrinsicWidth() {
            return (int) (AndroidUtilities.dp(4.0f) + this.text.getWidth() + AndroidUtilities.dp(18.0f));
        }
    }

    public static class CloseDrawable extends Drawable {
        private int alpha;
        private final long max_display_duration;
        private final long min_display_duration;
        private long minusTime;
        private final Paint paint;
        private final View parentView;
        private boolean paused;
        private long pausedTime;
        private final AnimatedFloat showCrossAnimated;
        private final AnimatedFloat showTimerAnimated;
        private final long startTime;
        private final AnimatedTextView.AnimatedTextDrawable timer;
        private final AnimatedFloat timerScaleAnimated;

        @Override
        public int getOpacity() {
            return -2;
        }

        public CloseDrawable(View view, int i, int i2, long j) {
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
            this.timer = animatedTextDrawable;
            Paint paint = new Paint(1);
            this.paint = paint;
            this.paused = false;
            this.alpha = 255;
            this.parentView = view;
            this.startTime = System.currentTimeMillis() - j;
            this.min_display_duration = i * 1000;
            this.max_display_duration = i2 * 1000;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setColor(-1);
            animatedTextDrawable.setCallback(view);
            animatedTextDrawable.setGravity(17);
            animatedTextDrawable.setTextSize(AndroidUtilities.dp(12.0f));
            animatedTextDrawable.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
            animatedTextDrawable.setOverrideFullWidth(AndroidUtilities.displaySize.x);
            animatedTextDrawable.setTextColor(-1);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.showCrossAnimated = new AnimatedFloat(view, 0L, 420L, cubicBezierInterpolator);
            this.showTimerAnimated = new AnimatedFloat(view, 0L, 420L, cubicBezierInterpolator);
            this.timerScaleAnimated = new AnimatedFloat(view, 0L, 420L, cubicBezierInterpolator);
        }

        public boolean isCrossAvailable() {
            return (this.paused ? this.pausedTime : System.currentTimeMillis() - this.minusTime) - this.startTime > this.min_display_duration;
        }

        @Override
        public void draw(Canvas canvas) {
            float centerX = getBounds().centerX();
            float centerY = getBounds().centerY();
            long currentTimeMillis = ((this.paused ? this.pausedTime : System.currentTimeMillis()) - this.minusTime) - this.startTime;
            long max = Math.max(0L, this.min_display_duration - currentTimeMillis);
            long j = this.min_display_duration;
            float f = ((float) max) / ((float) j);
            float f2 = this.showTimerAnimated.set(currentTimeMillis < j);
            String str = "" + ((int) Math.ceil(max / 1000.0d));
            float f3 = this.timerScaleAnimated.set(str.length() >= 3 ? 0.825f : str.length() >= 2 ? 0.875f : 1.0f);
            canvas.save();
            canvas.scale(f3, f3, centerX, centerY);
            this.timer.setText(str);
            this.timer.setBounds(centerX - 1.0f, centerY - 1.0f, centerX + 1.0f, centerY + 1.0f);
            this.timer.setAlpha((int) (this.alpha * f2));
            this.timer.draw(canvas);
            canvas.restore();
            this.paint.setAlpha((int) (this.alpha * f2));
            this.paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(centerX - AndroidUtilities.dp(9.0f), centerY - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + centerX, AndroidUtilities.dp(9.0f) + centerY);
            canvas.drawArc(rectF, -90.0f, f * (-360.0f), false, this.paint);
            float f4 = this.showCrossAnimated.set((1.0f - f) * 360.0f > 75.0f);
            float lerp = AndroidUtilities.lerp(centerX, AndroidUtilities.dp(8.0f) + centerX, f2);
            float lerp2 = AndroidUtilities.lerp(centerY, centerY - AndroidUtilities.dp(8.0f), f2);
            float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.0f), f2) * AndroidUtilities.lerp(0.35f, 1.0f, f4);
            this.paint.setAlpha((int) (this.alpha * f4));
            float f5 = lerp - lerp3;
            float f6 = lerp2 - lerp3;
            float f7 = lerp + lerp3;
            float f8 = lerp2 + lerp3;
            canvas.drawLine(f5, f6, f7, f8, this.paint);
            canvas.drawLine(f5, f8, f7, f6, this.paint);
            if (f2 > 0.0f) {
                this.parentView.invalidate();
            }
        }

        public void setPaused(boolean z) {
            if (this.paused == z) {
                return;
            }
            this.paused = z;
            if (z) {
                this.pausedTime = System.currentTimeMillis();
            } else {
                this.minusTime += System.currentTimeMillis() - this.pausedTime;
            }
        }

        @Override
        public void setAlpha(int i) {
            this.alpha = i;
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
            this.timer.setColorFilter(colorFilter);
            this.paint.setColorFilter(colorFilter);
        }

        public void setColor(int i) {
            this.timer.setTextColor(i);
            this.paint.setColor(i);
        }

        @Override
        public int getIntrinsicWidth() {
            return AndroidUtilities.dp(24.0f);
        }

        @Override
        public int getIntrinsicHeight() {
            return AndroidUtilities.dp(24.0f);
        }
    }

    public void showPremium() {
        PremiumFeatureBottomSheet premiumFeatureBottomSheet = this.premiumSheet;
        if (premiumFeatureBottomSheet != null) {
            premiumFeatureBottomSheet.lambda$new$0();
            this.premiumSheet = null;
        }
        final PremiumFeatureBottomSheet premiumFeatureBottomSheet2 = new PremiumFeatureBottomSheet(new BaseFragment() {
            @Override
            public int getCurrentAccount() {
                return VideoAds.this.currentAccount;
            }

            @Override
            public Context getContext() {
                return AndroidUtilities.findActivity(LaunchActivity.instance);
            }

            @Override
            public Activity getParentActivity() {
                Activity findActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
                return findActivity == null ? LaunchActivity.instance : findActivity;
            }
        }, 3, true);
        this.premiumSheet = premiumFeatureBottomSheet2;
        premiumFeatureBottomSheet2.setOnDismissListener(new Runnable() {
            @Override
            public final void run() {
                VideoAds.this.lambda$showPremium$19(premiumFeatureBottomSheet2);
            }
        });
        premiumFeatureBottomSheet2.show();
        checkPopupShownCallback();
    }

    public void lambda$showPremium$19(PremiumFeatureBottomSheet premiumFeatureBottomSheet) {
        if (premiumFeatureBottomSheet == this.premiumSheet) {
            this.premiumSheet = null;
            checkPopupShownCallback();
        }
    }

    public static class AdLayout extends Bulletin.ButtonLayout {
        public final ImageView buttonView;
        public final BackupImageView imageView;
        private final LinearLayout linearLayout;
        public final LinkSpanDrawable.LinksTextView subtitleTextView;
        public final SimpleTextView titleTextView;

        public AdLayout(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            setBackground(getThemedColor(Theme.key_undo_background));
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(48.0f));
            addView(backupImageView, LayoutHelper.createFrameRelatively(36.0f, 36.0f, 8388627, 9.0f, 0.0f, 0.0f, 0.0f));
            int themedColor = getThemedColor(Theme.key_undo_infoColor);
            int themedColor2 = getThemedColor(Theme.key_undo_cancelColor);
            LinearLayout linearLayout = new LinearLayout(context);
            this.linearLayout = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 54.0f, 8.0f));
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.titleTextView = simpleTextView;
            simpleTextView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            simpleTextView.setTextColor(themedColor);
            simpleTextView.setTextSize(14);
            simpleTextView.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(simpleTextView);
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
            this.subtitleTextView = linksTextView;
            linksTextView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            linksTextView.setTextColor(themedColor);
            linksTextView.setLinkTextColor(themedColor2);
            linksTextView.setTypeface(Typeface.SANS_SERIF);
            linksTextView.setTextSize(1, 13.0f);
            linearLayout.addView(linksTextView);
            ImageView imageView = new ImageView(context);
            this.buttonView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setBackground(Theme.createSelectorDrawable(Theme.multAlpha(getThemedColor(Theme.key_featuredStickers_addButton), 0.15f), 7));
            addView(imageView, LayoutHelper.createFrameRelatively(32.0f, 32.0f, 8388629, 0.0f, 0.0f, 11.0f, 0.0f));
        }

        @Override
        public void onShow() {
            super.onShow();
        }

        @Override
        public CharSequence getAccessibilityText() {
            return ((Object) this.titleTextView.getText()) + ".\n" + ((Object) this.subtitleTextView.getText());
        }

        public void hideImage() {
            this.imageView.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) this.linearLayout.getLayoutParams()).setMarginStart(AndroidUtilities.dp(10.0f));
        }
    }

    public void logSponsoredShown(TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        if (tL_sponsoredMessage == null) {
            return;
        }
        TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
        tL_messages_viewSponsoredMessage.random_id = tL_sponsoredMessage.random_id;
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            return;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_viewSponsoredMessage, null);
    }

    public void logSponsoredClicked(TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        if (tL_sponsoredMessage == null) {
            return;
        }
        TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
        tL_messages_clickSponsoredMessage.random_id = tL_sponsoredMessage.random_id;
        tL_messages_clickSponsoredMessage.media = false;
        tL_messages_clickSponsoredMessage.fullscreen = false;
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            return;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_clickSponsoredMessage, null);
    }
}
