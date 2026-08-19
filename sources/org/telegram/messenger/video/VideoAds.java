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
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
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
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiSpan;
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
import org.telegram.ui.RevenueSharingAdsInfoBottomSheet;

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
            this.f$0.show();
        }
    };

    private static class VideoAdsLocation {
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
            if (obj != null && getClass() == obj.getClass()) {
                VideoAdsLocation videoAdsLocation = (VideoAdsLocation) obj;
                if (this.currentAccount == videoAdsLocation.currentAccount && this.dialogId == videoAdsLocation.dialogId) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.currentAccount), Long.valueOf(this.dialogId));
        }
    }

    public static void dropCache() {
        cached.clear();
    }

    public static VideoAds make(int i, long j, int i2, BulletinFactory bulletinFactory) {
        BulletinFactory bulletinFactory2;
        VideoAdsLocation videoAdsLocation = new VideoAdsLocation(i, j);
        VideoAds videoAds = cached.get(videoAdsLocation);
        if (videoAds == null || ((videoAds.msg_id != i2 || System.currentTimeMillis() - videoAds.lastTime > 180000) && videoAds.ads.isEmpty())) {
            HashMap<VideoAdsLocation, VideoAds> map = cached;
            bulletinFactory2 = bulletinFactory;
            VideoAds videoAds2 = new VideoAds(i, j, i2, bulletinFactory2);
            map.put(videoAdsLocation, videoAds2);
            videoAds = videoAds2;
        } else {
            bulletinFactory2 = bulletinFactory;
        }
        videoAds.init(bulletinFactory2);
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
        ItemOptions itemOptions = this.currentMenu;
        if (itemOptions != null && itemOptions.isShown()) {
            return true;
        }
        PremiumFeatureBottomSheet premiumFeatureBottomSheet = this.premiumSheet;
        return premiumFeatureBottomSheet != null && premiumFeatureBottomSheet.isShown();
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
                VideoAds.$r8$lambda$H_qjD4knkr5WW4hG0ed6arb_1Ug(this.f$0, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$H_qjD4knkr5WW4hG0ed6arb_1Ug(final VideoAds videoAds, final TLObject tLObject, TLRPC.TL_error tL_error) {
        videoAds.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                VideoAds.$r8$lambda$LAxqWQUNqASahqYd6LcnJqbkI9Y(this.f$0, tLObject);
            }
        });
    }

    public static void $r8$lambda$LAxqWQUNqASahqYd6LcnJqbkI9Y(VideoAds videoAds, TLObject tLObject) {
        if (videoAds.loading) {
            if (tLObject instanceof TLRPC.TL_messages_sponsoredMessages) {
                TLRPC.TL_messages_sponsoredMessages tL_messages_sponsoredMessages = (TLRPC.TL_messages_sponsoredMessages) tLObject;
                MessagesController.getInstance(videoAds.currentAccount).putUsers(tL_messages_sponsoredMessages.users, false);
                MessagesController.getInstance(videoAds.currentAccount).putChats(tL_messages_sponsoredMessages.chats, false);
                videoAds.ads.addAll(tL_messages_sponsoredMessages.messages);
                videoAds.start_delay = tL_messages_sponsoredMessages.start_delay;
                videoAds.between_delay = tL_messages_sponsoredMessages.between_delay;
            }
            videoAds.loaded = true;
            videoAds.loading = false;
            videoAds.schedule();
        }
    }

    private void schedule() {
        AndroidUtilities.cancelRunOnUIThread(this.showRunnable);
        if (!this.loaded || this.ads.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(this.showRunnable, Math.max(0L, (((long) (this.first ? this.start_delay : this.between_delay)) * 1000) - (System.currentTimeMillis() - this.lastTime)));
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
        final long jCurrentTimeMillis = System.currentTimeMillis() - this.currentBulletinPassedTime;
        this.bulletinShowTime = jCurrentTimeMillis;
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
                adLayout.imageView.setImage(ImageLocation.getForDocument(tL_sponsoredMessage.media.document), "48_48", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 48), tL_sponsoredMessage.media.document), "48_48", (String) null, 0L, 0, (Object) null);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 48, true, null, true);
                    adLayout.imageView.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, tL_sponsoredMessage.media.photo), "48_48", ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(tL_sponsoredMessage.media.photo.sizes, 48, true, closestPhotoSizeWithSize, false), tL_sponsoredMessage.media.photo), "48_48", (String) null, 0L, 0, (Object) null);
                }
            }
        } else {
            TLRPC.Photo photo2 = tL_sponsoredMessage.photo;
            if (photo2 != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 48, true, null, true);
                adLayout.imageView.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize2, tL_sponsoredMessage.photo), "48_48", ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(tL_sponsoredMessage.photo.sizes, 48, true, closestPhotoSizeWithSize2, false), tL_sponsoredMessage.photo), "48_48", (String) null, 0L, 0, (Object) null);
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
                VideoAds.m1137$r8$lambda$YyNckzykbVgqqi_zQ3lSuxQdY(this.f$0, closeDrawable, view);
            }
        });
        final Bulletin bulletinCreate = this.bulletinFactory.create(adLayout, tL_sponsoredMessage.max_display_duration * 1000);
        this.bulletin = bulletinCreate;
        bulletinCreate.setCanHideOnShow = false;
        bulletinCreate.setCanHide(false);
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                VideoAds.m1140$r8$lambda$hbb6V9uq1nw7voaEGbIp2QC3II(this.f$0, bulletinCreate, tL_sponsoredMessage);
            }
        };
        final long[] jArr = new long[1];
        final long[] jArr2 = new long[1];
        final boolean[] zArr = new boolean[1];
        final Utilities.Callback callback = new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                VideoAds.$r8$lambda$EHCCn9A6jHy8lzZ29HEOCMdIG1c(this.f$0, bulletinCreate, zArr, closeDrawable, jArr2, runnable, jArr, jCurrentTimeMillis, tL_sponsoredMessage, (Boolean) obj);
            }
        };
        AndroidUtilities.runOnUIThread(runnable, ((long) tL_sponsoredMessage.min_display_duration) * 1000);
        final boolean[] zArr2 = new boolean[1];
        Bulletin bulletin2 = this.bulletin;
        bulletin2.hideAfterBottomSheet = false;
        bulletin2.setOnHideListener(new Runnable() {
            @Override
            public final void run() {
                VideoAds.m1139$r8$lambda$ge71Y8QmhdygbWpyyn5DVpz7XY(this.f$0, bulletinCreate, zArr2);
            }
        });
        adLayout.titleTextView.setRightDrawableOnClick(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                VideoAds.m1141$r8$lambda$yNwrCL9AhGpB_dtI8isiV_NRsQ(this.f$0, bulletinCreate, tL_sponsoredMessage, context, resourcesProvider, adLayout, callback, view);
            }
        });
        this.bulletin.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                VideoAds.m1138$r8$lambda$gIoe4VZPcAc8CzhrvkQ38fZyzg(this.f$0, tL_sponsoredMessage, view);
            }
        });
        this.bulletin.show();
        logSponsoredShown(tL_sponsoredMessage);
    }

    public static void m1137$r8$lambda$YyNckzykbVgqqi_zQ3lSuxQdY(VideoAds videoAds, CloseDrawable closeDrawable, View view) {
        videoAds.getClass();
        if (closeDrawable.isCrossAvailable()) {
            Bulletin bulletin = videoAds.bulletin;
            if (bulletin != null) {
                bulletin.hide();
                return;
            }
            return;
        }
        if (UserConfig.getInstance(videoAds.currentAccount).isPremium()) {
            Bulletin bulletin2 = videoAds.bulletin;
            if (bulletin2 != null) {
                bulletin2.hide();
                videoAds.bulletin = null;
            }
            MessagesController.getInstance(videoAds.currentAccount).disableAds(true);
            videoAds.bulletinFactory.createAdReportedBulletin(LocaleController.getString(R.string.AdHidden)).show();
            return;
        }
        videoAds.showPremium();
    }

    public static void m1140$r8$lambda$hbb6V9uq1nw7voaEGbIp2QC3II(VideoAds videoAds, Bulletin bulletin, TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        Bulletin bulletin2 = videoAds.bulletin;
        if (bulletin2 == null || bulletin2 != bulletin) {
            return;
        }
        bulletin2.setDuration((tL_sponsoredMessage.max_display_duration - tL_sponsoredMessage.min_display_duration) * 1000);
        videoAds.bulletin.setCanHide(true);
    }

    public static void $r8$lambda$EHCCn9A6jHy8lzZ29HEOCMdIG1c(VideoAds videoAds, Bulletin bulletin, boolean[] zArr, CloseDrawable closeDrawable, long[] jArr, Runnable runnable, long[] jArr2, long j, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Boolean bool) {
        Bulletin bulletin2 = videoAds.bulletin;
        if (bulletin2 == null || bulletin2 != bulletin || bool.booleanValue() == zArr[0]) {
            return;
        }
        boolean zBooleanValue = bool.booleanValue();
        zArr[0] = zBooleanValue;
        closeDrawable.setPaused(zBooleanValue);
        if (zArr[0]) {
            videoAds.bulletin.setCanHide(false);
            jArr[0] = System.currentTimeMillis();
            AndroidUtilities.cancelRunOnUIThread(runnable);
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(runnable);
        jArr2[0] = jArr2[0] + (System.currentTimeMillis() - jArr[0]);
        long jCurrentTimeMillis = (System.currentTimeMillis() - j) - jArr2[0];
        long j2 = (((long) tL_sponsoredMessage.min_display_duration) * 1000) - jCurrentTimeMillis;
        long j3 = (((long) tL_sponsoredMessage.max_display_duration) * 1000) - jCurrentTimeMillis;
        if (j3 <= 0) {
            Bulletin bulletin3 = videoAds.bulletin;
            if (bulletin3 != null) {
                bulletin3.hide();
                videoAds.bulletin = null;
                return;
            }
            return;
        }
        if (j2 <= 0) {
            videoAds.bulletin.setDuration((int) j3);
            videoAds.bulletin.setCanHide(true);
        } else {
            AndroidUtilities.runOnUIThread(runnable, j2);
        }
    }

    public static void m1139$r8$lambda$ge71Y8QmhdygbWpyyn5DVpz7XY(VideoAds videoAds, Bulletin bulletin, boolean[] zArr) {
        Bulletin bulletin2 = videoAds.bulletin;
        if (bulletin2 == null || bulletin2 != bulletin || zArr[0]) {
            return;
        }
        zArr[0] = true;
        ItemOptions itemOptions = videoAds.currentMenu;
        if (itemOptions != null) {
            itemOptions.dismiss();
            videoAds.currentMenu = null;
        }
        videoAds.bulletin = null;
        videoAds.currentBulletinPassedTime = 0L;
        videoAds.lastTime = System.currentTimeMillis();
        if (videoAds.waitingPaused) {
            videoAds.waitingTimeSince = System.currentTimeMillis();
        }
        if (!videoAds.ads.isEmpty()) {
            videoAds.ads.remove(0);
        }
        videoAds.first = false;
        videoAds.schedule();
    }

    public static void m1141$r8$lambda$yNwrCL9AhGpB_dtI8isiV_NRsQ(final VideoAds videoAds, Bulletin bulletin, final TLRPC.TL_sponsoredMessage tL_sponsoredMessage, final Context context, Theme.ResourcesProvider resourcesProvider, AdLayout adLayout, final Utilities.Callback callback, View view) {
        ViewGroup viewGroup;
        final ItemOptions itemOptionsMakeSwipeback;
        int iDp;
        int iDp2;
        ArrayList arrayList;
        String str;
        int i;
        int i2;
        int i3;
        Bulletin bulletin2 = videoAds.bulletin;
        if (bulletin2 == null || bulletin2 != bulletin) {
            return;
        }
        try {
            viewGroup = (ViewGroup) bulletin2.getLayout().getParent().getParent();
        } catch (Exception unused) {
            viewGroup = null;
        }
        if (viewGroup == null) {
            return;
        }
        final DarkBlueThemeResourcesProvider darkBlueThemeResourcesProvider = new DarkBlueThemeResourcesProvider();
        final ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(viewGroup, darkBlueThemeResourcesProvider, videoAds.bulletin.getLayout(), true, false);
        itemOptionsMakeOptions.setSwipebackGravity(true, true);
        itemOptionsMakeOptions.setScaleOut(true);
        itemOptionsMakeOptions.setDimAlpha(0);
        itemOptionsMakeOptions.setDrawScrim(false);
        itemOptionsMakeOptions.setDismissWithButtons(false);
        if (tL_sponsoredMessage.sponsor_info == null && tL_sponsoredMessage.additional_info == null) {
            String str2 = tL_sponsoredMessage.url;
            if (str2 != null) {
                if (!str2.startsWith("https://" + MessagesController.getInstance(videoAds.currentAccount).linkPrefix)) {
                    itemOptionsMakeSwipeback = itemOptionsMakeOptions.makeSwipeback();
                    ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(context, true, false, (Theme.ResourcesProvider) darkBlueThemeResourcesProvider);
                    actionBarMenuSubItem.setItemHeight(44);
                    actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back);
                    AnimatedEmojiSpan.TextViewEmojis textView = actionBarMenuSubItem.getTextView();
                    if (LocaleController.isRTL) {
                        iDp = 0;
                    } else {
                        iDp = AndroidUtilities.dp(40.0f);
                    }
                    if (LocaleController.isRTL) {
                        iDp2 = AndroidUtilities.dp(40.0f);
                    } else {
                        iDp2 = 0;
                    }
                    textView.setPadding(iDp, 0, iDp2, 0);
                    actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            itemOptionsMakeOptions.closeSwipeback();
                        }
                    });
                    itemOptionsMakeSwipeback.addView(actionBarMenuSubItem, LayoutHelper.createLinear(-1, -2));
                    itemOptionsMakeSwipeback.addView(new ActionBarPopupWindow.GapView(context, darkBlueThemeResourcesProvider), LayoutHelper.createLinear(-1, 8));
                    arrayList = new ArrayList();
                    str = tL_sponsoredMessage.url;
                    if (str != null) {
                        TextView textView2 = new TextView(context);
                        textView2.setTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, darkBlueThemeResourcesProvider));
                        textView2.setTextSize(1, 14.0f);
                        textView2.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                        textView2.setMaxWidth(AndroidUtilities.dp(300.0f));
                        Uri uri = Uri.parse(tL_sponsoredMessage.url);
                        textView2.setText(Browser.replaceHostname(uri, Browser.IDN_toUnicode(uri.getHost()), null));
                        int color = Theme.getColor(Theme.key_dialogButtonSelector, darkBlueThemeResourcesProvider);
                        if (tL_sponsoredMessage.additional_info == null) {
                            i3 = 6;
                        } else {
                            i3 = 0;
                        }
                        textView2.setBackground(Theme.createRadSelectorDrawable(color, 0, i3));
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view2) {
                                VideoAds.$r8$lambda$G_GJCdUKrDe7QgUTnOkZ99td2Fs(this.f$0, itemOptionsMakeOptions, tL_sponsoredMessage, context, view2);
                            }
                        });
                        textView2.setOnLongClickListener(new View.OnLongClickListener() {
                            @Override
                            public final boolean onLongClick(View view2) {
                                return VideoAds.$r8$lambda$iVe8i2C8j2Ec5WZfQBkwOCfuyHY(tL_sponsoredMessage, view2);
                            }
                        });
                        arrayList.add(textView2);
                    }
                    if (tL_sponsoredMessage.sponsor_info != null) {
                        TextView textView3 = new TextView(context);
                        textView3.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, darkBlueThemeResourcesProvider));
                        textView3.setTextSize(1, 14.0f);
                        textView3.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                        textView3.setMaxWidth(AndroidUtilities.dp(300.0f));
                        textView3.setText(tL_sponsoredMessage.sponsor_info);
                        int color2 = Theme.getColor(Theme.key_dialogButtonSelector, darkBlueThemeResourcesProvider);
                        if (tL_sponsoredMessage.additional_info == null) {
                            i2 = 6;
                        } else {
                            i2 = 0;
                        }
                        textView3.setBackground(Theme.createRadSelectorDrawable(color2, 0, i2));
                        textView3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view2) {
                                AndroidUtilities.addToClipboard(tL_sponsoredMessage.sponsor_info);
                            }
                        });
                        arrayList.add(textView3);
                    }
                    if (tL_sponsoredMessage.additional_info != null) {
                        TextView textView4 = new TextView(context);
                        textView4.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, darkBlueThemeResourcesProvider));
                        textView4.setTextSize(1, 14.0f);
                        textView4.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                        textView4.setMaxWidth(AndroidUtilities.dp(300.0f));
                        textView4.setText(tL_sponsoredMessage.additional_info);
                        textView4.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_dialogButtonSelector, resourcesProvider), 0, 6));
                        textView4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view2) {
                                AndroidUtilities.addToClipboard(tL_sponsoredMessage.additional_info);
                            }
                        });
                        arrayList.add(textView4);
                    }
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        View view2 = (View) arrayList.get(i4);
                        if (i4 > 0) {
                            FrameLayout frameLayout = new FrameLayout(context);
                            frameLayout.setBackgroundColor(Theme.getColor(Theme.key_divider, darkBlueThemeResourcesProvider));
                            i = -1;
                            LinearLayout.LayoutParams layoutParamsCreateLinear = LayoutHelper.createLinear(-1, 1);
                            layoutParamsCreateLinear.height = 1;
                            itemOptionsMakeSwipeback.addView(frameLayout, layoutParamsCreateLinear);
                        } else {
                            i = -1;
                        }
                        itemOptionsMakeSwipeback.addView(view2, LayoutHelper.createLinear(i, -2));
                    }
                    itemOptionsMakeOptions.add(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new Runnable() {
                        @Override
                        public final void run() {
                            itemOptionsMakeOptions.openSwipeback(itemOptionsMakeSwipeback);
                        }
                    });
                }
            }
        } else {
            itemOptionsMakeSwipeback = itemOptionsMakeOptions.makeSwipeback();
            ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(context, true, false, (Theme.ResourcesProvider) darkBlueThemeResourcesProvider);
            actionBarMenuSubItem2.setItemHeight(44);
            actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back);
            AnimatedEmojiSpan.TextViewEmojis textView5 = actionBarMenuSubItem2.getTextView();
            if (LocaleController.isRTL) {
                iDp = 0;
            } else {
                iDp = AndroidUtilities.dp(40.0f);
            }
            if (LocaleController.isRTL) {
                iDp2 = AndroidUtilities.dp(40.0f);
            } else {
                iDp2 = 0;
            }
            textView5.setPadding(iDp, 0, iDp2, 0);
            actionBarMenuSubItem2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view3) {
                    itemOptionsMakeOptions.closeSwipeback();
                }
            });
            itemOptionsMakeSwipeback.addView(actionBarMenuSubItem2, LayoutHelper.createLinear(-1, -2));
            itemOptionsMakeSwipeback.addView(new ActionBarPopupWindow.GapView(context, darkBlueThemeResourcesProvider), LayoutHelper.createLinear(-1, 8));
            arrayList = new ArrayList();
            str = tL_sponsoredMessage.url;
            if (str != null && !TextUtils.equals(AndroidUtilities.getHostAuthority(str), MessagesController.getInstance(videoAds.currentAccount).linkPrefix)) {
                TextView textView6 = new TextView(context);
                textView6.setTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, darkBlueThemeResourcesProvider));
                textView6.setTextSize(1, 14.0f);
                textView6.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                textView6.setMaxWidth(AndroidUtilities.dp(300.0f));
                Uri uri2 = Uri.parse(tL_sponsoredMessage.url);
                textView6.setText(Browser.replaceHostname(uri2, Browser.IDN_toUnicode(uri2.getHost()), null));
                int color3 = Theme.getColor(Theme.key_dialogButtonSelector, darkBlueThemeResourcesProvider);
                if (tL_sponsoredMessage.additional_info == null) {
                    i3 = 6;
                } else {
                    i3 = 0;
                }
                textView6.setBackground(Theme.createRadSelectorDrawable(color3, 0, i3));
                textView6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        VideoAds.$r8$lambda$G_GJCdUKrDe7QgUTnOkZ99td2Fs(this.f$0, itemOptionsMakeOptions, tL_sponsoredMessage, context, view3);
                    }
                });
                textView6.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view3) {
                        return VideoAds.$r8$lambda$iVe8i2C8j2Ec5WZfQBkwOCfuyHY(tL_sponsoredMessage, view3);
                    }
                });
                arrayList.add(textView6);
            }
            if (tL_sponsoredMessage.sponsor_info != null) {
                TextView textView7 = new TextView(context);
                textView7.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, darkBlueThemeResourcesProvider));
                textView7.setTextSize(1, 14.0f);
                textView7.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                textView7.setMaxWidth(AndroidUtilities.dp(300.0f));
                textView7.setText(tL_sponsoredMessage.sponsor_info);
                int color4 = Theme.getColor(Theme.key_dialogButtonSelector, darkBlueThemeResourcesProvider);
                if (tL_sponsoredMessage.additional_info == null) {
                    i2 = 6;
                } else {
                    i2 = 0;
                }
                textView7.setBackground(Theme.createRadSelectorDrawable(color4, 0, i2));
                textView7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        AndroidUtilities.addToClipboard(tL_sponsoredMessage.sponsor_info);
                    }
                });
                arrayList.add(textView7);
            }
            if (tL_sponsoredMessage.additional_info != null) {
                TextView textView8 = new TextView(context);
                textView8.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, darkBlueThemeResourcesProvider));
                textView8.setTextSize(1, 14.0f);
                textView8.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                textView8.setMaxWidth(AndroidUtilities.dp(300.0f));
                textView8.setText(tL_sponsoredMessage.additional_info);
                textView8.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_dialogButtonSelector, resourcesProvider), 0, 6));
                textView8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        AndroidUtilities.addToClipboard(tL_sponsoredMessage.additional_info);
                    }
                });
                arrayList.add(textView8);
            }
            while (i4 < arrayList.size()) {
                View view3 = (View) arrayList.get(i4);
                if (i4 > 0) {
                    FrameLayout frameLayout2 = new FrameLayout(context);
                    frameLayout2.setBackgroundColor(Theme.getColor(Theme.key_divider, darkBlueThemeResourcesProvider));
                    i = -1;
                    LinearLayout.LayoutParams layoutParamsCreateLinear2 = LayoutHelper.createLinear(-1, 1);
                    layoutParamsCreateLinear2.height = 1;
                    itemOptionsMakeSwipeback.addView(frameLayout2, layoutParamsCreateLinear2);
                } else {
                    i = -1;
                }
                itemOptionsMakeSwipeback.addView(view3, LayoutHelper.createLinear(i, -2));
            }
            itemOptionsMakeOptions.add(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new Runnable() {
                @Override
                public final void run() {
                    itemOptionsMakeOptions.openSwipeback(itemOptionsMakeSwipeback);
                }
            });
        }
        if (!UserConfig.getInstance(videoAds.currentAccount).isPremium() && !MessagesController.getInstance(videoAds.currentAccount).premiumFeaturesBlocked() && !tL_sponsoredMessage.can_report) {
            itemOptionsMakeOptions.add(R.drawable.msg_block2, LocaleController.getString(R.string.HideAd), new Runnable() {
                @Override
                public final void run() {
                    VideoAds.$r8$lambda$u_IlIXB8wvcIdVdHdTPwrZcxPSs(this.f$0, itemOptionsMakeOptions);
                }
            });
        }
        if (tL_sponsoredMessage.can_report) {
            itemOptionsMakeOptions.add(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new Runnable() {
                @Override
                public final void run() {
                    RevenueSharingAdsInfoBottomSheet.showAlert(context, null, false, darkBlueThemeResourcesProvider);
                }
            });
            itemOptionsMakeOptions.add(R.drawable.msg_block2, LocaleController.getString(R.string.ReportAd), new Runnable() {
                @Override
                public final void run() {
                    VideoAds.$r8$lambda$FUs1Rq0tJzP7m5XZrSlar6r0ERY(this.f$0, context, tL_sponsoredMessage, itemOptionsMakeOptions);
                }
            });
            if (!MessagesController.getInstance(videoAds.currentAccount).premiumFeaturesBlocked()) {
                itemOptionsMakeOptions.addGap();
                itemOptionsMakeOptions.add(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new Runnable() {
                    @Override
                    public final void run() {
                        VideoAds.$r8$lambda$Ta2CuFEbF150NkRtGS90341eGUA(this.f$0, itemOptionsMakeOptions);
                    }
                });
            }
        }
        if (itemOptionsMakeOptions.getItemsCount() <= 0) {
            return;
        }
        videoAds.currentMenu = itemOptionsMakeOptions;
        videoAds.currentMenuTranslationY = adLayout.getTranslationY();
        callback.run(Boolean.TRUE);
        itemOptionsMakeOptions.setOnDismiss(new Runnable() {
            @Override
            public final void run() {
                VideoAds.$r8$lambda$kHamZasQa2SemdyW_3KTDyBqmdA(this.f$0, callback);
            }
        });
        itemOptionsMakeOptions.show();
        videoAds.checkPopupShownCallback();
    }

    public static void $r8$lambda$G_GJCdUKrDe7QgUTnOkZ99td2Fs(VideoAds videoAds, ItemOptions itemOptions, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Context context, View view) {
        videoAds.getClass();
        itemOptions.dismiss();
        videoAds.logSponsoredClicked(tL_sponsoredMessage);
        Browser.openUrl(context, Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, MessagesController.getInstance(videoAds.currentAccount).sponsoredLinksInappAllow, false);
    }

    public static boolean $r8$lambda$iVe8i2C8j2Ec5WZfQBkwOCfuyHY(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        AndroidUtilities.addToClipboard(tL_sponsoredMessage.url);
        return true;
    }

    public static void $r8$lambda$u_IlIXB8wvcIdVdHdTPwrZcxPSs(VideoAds videoAds, ItemOptions itemOptions) {
        if (UserConfig.getInstance(videoAds.currentAccount).isPremium()) {
            itemOptions.dismiss();
            Bulletin bulletin = videoAds.bulletin;
            if (bulletin != null) {
                bulletin.setCanHide(true);
                videoAds.bulletin.hide();
            }
            videoAds.bulletinFactory.createAdReportedBulletin(LocaleController.getString(R.string.AdHidden)).show();
            MessagesController.getInstance(videoAds.currentAccount).disableAds(true);
            return;
        }
        videoAds.showPremium();
    }

    public static void $r8$lambda$FUs1Rq0tJzP7m5XZrSlar6r0ERY(final VideoAds videoAds, Context context, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, final ItemOptions itemOptions) {
        int i = videoAds.currentAccount;
        long j = videoAds.dialogId;
        BulletinFactory bulletinFactory = videoAds.bulletinFactory;
        DarkBlueThemeResourcesProvider darkBlueThemeResourcesProvider = new DarkBlueThemeResourcesProvider();
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.showPremium();
            }
        };
        Objects.requireNonNull(itemOptions);
        ReportBottomSheet.openSponsored(i, context, j, tL_sponsoredMessage, bulletinFactory, darkBlueThemeResourcesProvider, runnable, new Runnable() {
            @Override
            public final void run() {
                itemOptions.dismiss();
            }
        });
    }

    public static void $r8$lambda$Ta2CuFEbF150NkRtGS90341eGUA(VideoAds videoAds, ItemOptions itemOptions) {
        if (UserConfig.getInstance(videoAds.currentAccount).isPremium()) {
            itemOptions.dismiss();
            Bulletin bulletin = videoAds.bulletin;
            if (bulletin != null) {
                bulletin.setCanHide(true);
                videoAds.bulletin.hide();
            }
            videoAds.bulletinFactory.createAdReportedBulletin(LocaleController.getString(R.string.AdHidden)).show();
            MessagesController.getInstance(videoAds.currentAccount).disableAds(true);
            return;
        }
        videoAds.showPremium();
    }

    public static void $r8$lambda$kHamZasQa2SemdyW_3KTDyBqmdA(VideoAds videoAds, Utilities.Callback callback) {
        videoAds.getClass();
        callback.run(Boolean.FALSE);
        videoAds.currentMenu = null;
        videoAds.checkPopupShownCallback();
    }

    public static void m1138$r8$lambda$gIoe4VZPcAc8CzhrvkQ38fZyzg(VideoAds videoAds, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        videoAds.logSponsoredClicked(tL_sponsoredMessage);
        Browser.openUrl(view.getContext(), Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, MessagesController.getInstance(UserConfig.selectedAccount).sponsoredLinksInappAllow, false);
    }

    public void stop() {
        if (this.bulletin != null) {
            this.currentBulletinPassedTime = System.currentTimeMillis() - this.bulletinShowTime;
            if (!this.ads.isEmpty()) {
                if (this.currentBulletinPassedTime > ((long) this.ads.get(0).min_display_duration) * 1000) {
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
            Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_other).mutate();
            this.icon = drawableMutate;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
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
            this.min_display_duration = ((long) i) * 1000;
            this.max_display_duration = ((long) i2) * 1000;
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
            float f;
            float fCenterX = getBounds().centerX();
            float fCenterY = getBounds().centerY();
            long jCurrentTimeMillis = ((this.paused ? this.pausedTime : System.currentTimeMillis()) - this.minusTime) - this.startTime;
            long jMax = Math.max(0L, this.min_display_duration - jCurrentTimeMillis);
            long j = this.min_display_duration;
            float f2 = jMax / j;
            float f3 = this.showTimerAnimated.set(jCurrentTimeMillis < j);
            String str = "" + ((int) Math.ceil(jMax / 1000.0d));
            AnimatedFloat animatedFloat = this.timerScaleAnimated;
            if (str.length() >= 3) {
                f = 0.825f;
            } else {
                f = str.length() >= 2 ? 0.875f : 1.0f;
            }
            float f4 = animatedFloat.set(f);
            canvas.save();
            canvas.scale(f4, f4, fCenterX, fCenterY);
            this.timer.setText(str);
            this.timer.setBounds(fCenterX - 1.0f, fCenterY - 1.0f, fCenterX + 1.0f, fCenterY + 1.0f);
            this.timer.setAlpha((int) (this.alpha * f3));
            this.timer.draw(canvas);
            canvas.restore();
            this.paint.setAlpha((int) (this.alpha * f3));
            this.paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(fCenterX - AndroidUtilities.dp(9.0f), fCenterY - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + fCenterX, AndroidUtilities.dp(9.0f) + fCenterY);
            canvas.drawArc(rectF, -90.0f, f2 * (-360.0f), false, this.paint);
            float f5 = this.showCrossAnimated.set((1.0f - f2) * 360.0f > 75.0f);
            float fLerp = AndroidUtilities.lerp(fCenterX, AndroidUtilities.dp(8.0f) + fCenterX, f3);
            float fLerp2 = AndroidUtilities.lerp(fCenterY, fCenterY - AndroidUtilities.dp(8.0f), f3);
            float fLerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.0f), f3) * AndroidUtilities.lerp(0.35f, 1.0f, f5);
            this.paint.setAlpha((int) (this.alpha * f5));
            float f6 = fLerp - fLerp3;
            float f7 = fLerp2 - fLerp3;
            float f8 = fLerp + fLerp3;
            float f9 = fLerp2 + fLerp3;
            canvas.drawLine(f6, f7, f8, f9, this.paint);
            canvas.drawLine(f6, f9, f8, f7, this.paint);
            if (f3 > 0.0f) {
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
            premiumFeatureBottomSheet.dismiss();
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
                Activity activityFindActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
                return activityFindActivity == null ? LaunchActivity.instance : activityFindActivity;
            }
        }, 3, true);
        this.premiumSheet = premiumFeatureBottomSheet2;
        premiumFeatureBottomSheet2.setOnDismissListener(new Runnable() {
            @Override
            public final void run() {
                VideoAds.$r8$lambda$ytWz13xqwNa1zFKqyU1VKNNERUk(this.f$0, premiumFeatureBottomSheet2);
            }
        });
        premiumFeatureBottomSheet2.show();
        checkPopupShownCallback();
    }

    public static void $r8$lambda$ytWz13xqwNa1zFKqyU1VKNNERUk(VideoAds videoAds, PremiumFeatureBottomSheet premiumFeatureBottomSheet) {
        if (premiumFeatureBottomSheet == videoAds.premiumSheet) {
            videoAds.premiumSheet = null;
            videoAds.checkPopupShownCallback();
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
        protected void onShow() {
            super.onShow();
        }

        @Override
        public CharSequence getAccessibilityText() {
            return ((Object) this.titleTextView.getText()) + ".\n" + ((Object) this.subtitleTextView.getText());
        }

        public void hideImage() {
            this.imageView.setVisibility(8);
            this.linearLayout.setLayoutParams(LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388627, 10.0f, 8.0f, 54.0f, 8.0f));
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
