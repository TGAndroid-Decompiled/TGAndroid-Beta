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
import android.util.LruCache;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bi.q;
import di.k0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import jg.f1;
import k2.e0;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.r11;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.y9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.x21;
import tg.y0;
public class VideoAds {
    private static final LruCache<VideoAdsLocation, VideoAdsCache> cached = new LruCache<>(3);
    private int between_delay;
    private qc bulletin;
    private wc bulletinFactory;
    private long bulletinShowTime;
    private final VideoAdsCache cache;
    private final int currentAccount;
    private long currentBulletinPassedTime;
    private l80 currentMenu;
    private float currentMenuTranslationY;
    private final long dialogId;
    private boolean lastPopupShown;
    private long lastTime;
    private boolean loaded;
    private boolean loading;
    private final int msg_id;
    private Runnable onPopupCallback;
    private y0 premiumSheet;
    private int requestId;
    private int start_delay;
    public boolean videoWasPlaying;
    private boolean waitingPaused;
    private long waitingTimeSince;
    private final ArrayList<TLRPC.TL_sponsoredMessage> ads = new ArrayList<>();
    private boolean first = true;
    private final Runnable showRunnable = new d(this, 1);

    public static class CloseDrawable extends Drawable {
        private int alpha;
        private final long max_display_duration;
        private final long min_display_duration;
        private long minusTime;
        private final Paint paint;
        private final View parentView;
        private boolean paused;
        private long pausedTime;
        private final h6 showCrossAnimated;
        private final h6 showTimerAnimated;
        private final long startTime;
        private final r6 timer;
        private final h6 timerScaleAnimated;

        public CloseDrawable(View view, int i10, int i11, long j10) {
            r6 r6Var = new r6(false, true, true);
            this.timer = r6Var;
            Paint paint = new Paint(1);
            this.paint = paint;
            this.paused = false;
            this.alpha = 255;
            this.parentView = view;
            this.startTime = System.currentTimeMillis() - j10;
            this.min_display_duration = i10 * 1000;
            this.max_display_duration = i11 * 1000;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setColor(-1);
            r6Var.setCallback(view);
            r6Var.f32142b = 17;
            r6Var.w(AndroidUtilities.dp(12.0f));
            r6Var.x(AndroidUtilities.getTypeface("fonts/num.otf"));
            r6Var.M = AndroidUtilities.displaySize.x;
            r6Var.u(-1);
            ds dsVar = ds.h;
            this.showCrossAnimated = new h6(view, 0L, 420L, dsVar);
            this.showTimerAnimated = new h6(view, 0L, 420L, dsVar);
            this.timerScaleAnimated = new h6(view, 0L, 420L, dsVar);
        }

        @Override
        public void draw(Canvas canvas) {
            long currentTimeMillis;
            boolean z10;
            float f7;
            float centerX = getBounds().centerX();
            float centerY = getBounds().centerY();
            if (this.paused) {
                currentTimeMillis = this.pausedTime;
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            long j10 = (currentTimeMillis - this.minusTime) - this.startTime;
            long max = Math.max(0L, this.min_display_duration - j10);
            long j11 = this.min_display_duration;
            float f10 = ((float) max) / ((float) j11);
            int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
            boolean z11 = false;
            if (i10 < 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e = this.showTimerAnimated.e(z10);
            String str = "" + ((int) Math.ceil(max / 1000.0d));
            h6 h6Var = this.timerScaleAnimated;
            if (str.length() >= 3) {
                f7 = 0.825f;
            } else if (str.length() >= 2) {
                f7 = 0.875f;
            } else {
                f7 = 1.0f;
            }
            float d = h6Var.d(f7, false);
            canvas.save();
            canvas.scale(d, d, centerX, centerY);
            this.timer.t(str, true, true);
            this.timer.o(centerX - 1.0f, centerY - 1.0f, centerX + 1.0f, centerY + 1.0f);
            r6 r6Var = this.timer;
            r6Var.B = (int) (this.alpha * e);
            r6Var.draw(canvas);
            canvas.restore();
            this.paint.setAlpha((int) (this.alpha * e));
            this.paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(centerX - AndroidUtilities.dp(9.0f), centerY - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + centerX, AndroidUtilities.dp(9.0f) + centerY);
            canvas.drawArc(rectF, -90.0f, f10 * (-360.0f), false, this.paint);
            h6 h6Var2 = this.showCrossAnimated;
            if ((1.0f - f10) * 360.0f > 75.0f) {
                z11 = true;
            }
            float e10 = h6Var2.e(z11);
            float lerp = AndroidUtilities.lerp(centerX, AndroidUtilities.dp(8.0f) + centerX, e);
            float lerp2 = AndroidUtilities.lerp(centerY, centerY - AndroidUtilities.dp(8.0f), e);
            float lerp3 = AndroidUtilities.lerp(0.35f, 1.0f, e10) * AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.0f), e);
            this.paint.setAlpha((int) (this.alpha * e10));
            float f11 = lerp - lerp3;
            float f12 = lerp2 - lerp3;
            float f13 = lerp + lerp3;
            float f14 = lerp3 + lerp2;
            canvas.drawLine(f11, f12, f13, f14, this.paint);
            canvas.drawLine(f11, f14, f13, f12, this.paint);
            if (e > 0.0f) {
                this.parentView.invalidate();
            }
        }

        @Override
        public int getIntrinsicHeight() {
            return AndroidUtilities.dp(24.0f);
        }

        @Override
        public int getIntrinsicWidth() {
            return AndroidUtilities.dp(24.0f);
        }

        @Override
        public int getOpacity() {
            return -2;
        }

        public boolean isCrossAvailable() {
            long currentTimeMillis;
            if (this.paused) {
                currentTimeMillis = this.pausedTime;
            } else {
                currentTimeMillis = System.currentTimeMillis() - this.minusTime;
            }
            if (currentTimeMillis - this.startTime > this.min_display_duration) {
                return true;
            }
            return false;
        }

        @Override
        public void setAlpha(int i10) {
            this.alpha = i10;
        }

        public void setColor(int i10) {
            this.timer.u(i10);
            this.paint.setColor(i10);
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
            this.timer.setColorFilter(colorFilter);
            this.paint.setColorFilter(colorFilter);
        }

        public void setPaused(boolean z10) {
            if (this.paused == z10) {
                return;
            }
            this.paused = z10;
            if (z10) {
                this.pausedTime = System.currentTimeMillis();
                return;
            }
            this.minusTime += System.currentTimeMillis() - this.pausedTime;
        }
    }

    public static class VideoAdsCache {
        final ArrayList<TLRPC.TL_sponsoredMessage> ads = new ArrayList<>();
        int betweenDelay;
        long loadTime;
        boolean loaded;
        final int msgId;
        int startDelay;

        public VideoAdsCache(int i10) {
            this.msgId = i10;
        }
    }

    public static class VideoAdsLocation {
        int currentAccount;
        long dialogId;

        public VideoAdsLocation(int i10, long j10) {
            this.currentAccount = i10;
            this.dialogId = j10;
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

    private VideoAds(int i10, long j10, int i11, wc wcVar, VideoAdsCache videoAdsCache) {
        this.lastTime = 0L;
        this.currentAccount = i10;
        this.dialogId = j10;
        this.msg_id = i11;
        this.cache = videoAdsCache;
        this.lastTime = System.currentTimeMillis();
        init(wcVar);
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

    public static void dropCache() {
        cached.evictAll();
    }

    private void init(wc wcVar) {
        this.bulletinFactory = wcVar;
        this.lastTime = System.currentTimeMillis();
        this.first = true;
        VideoAdsCache videoAdsCache = this.cache;
        if (videoAdsCache.loaded) {
            this.start_delay = videoAdsCache.startDelay;
            this.between_delay = videoAdsCache.betweenDelay;
            this.ads.addAll(videoAdsCache.ads);
            this.loaded = true;
            schedule();
            return;
        }
        load();
    }

    public void lambda$load$0(TLObject tLObject) {
        if (!this.loading) {
            return;
        }
        if (tLObject instanceof TLRPC.TL_messages_sponsoredMessages) {
            TLRPC.TL_messages_sponsoredMessages tL_messages_sponsoredMessages = (TLRPC.TL_messages_sponsoredMessages) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tL_messages_sponsoredMessages.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tL_messages_sponsoredMessages.chats, false);
            this.ads.addAll(tL_messages_sponsoredMessages.messages);
            this.start_delay = tL_messages_sponsoredMessages.start_delay;
            this.between_delay = tL_messages_sponsoredMessages.between_delay;
            this.cache.ads.clear();
            this.cache.ads.addAll(tL_messages_sponsoredMessages.messages);
            VideoAdsCache videoAdsCache = this.cache;
            videoAdsCache.startDelay = tL_messages_sponsoredMessages.start_delay;
            videoAdsCache.betweenDelay = tL_messages_sponsoredMessages.between_delay;
        }
        this.cache.loadTime = System.currentTimeMillis();
        this.cache.loaded = true;
        this.loaded = true;
        this.loading = false;
        schedule();
    }

    public void lambda$load$1(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new e0(21, this, tLObject));
    }

    public static void lambda$show$10(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        AndroidUtilities.addToClipboard(tL_sponsoredMessage.additional_info);
    }

    public void lambda$show$12(l80 l80Var) {
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            l80Var.u();
            qc qcVar = this.bulletin;
            if (qcVar != null) {
                qcVar.i(true);
                this.bulletin.b();
            }
            this.bulletinFactory.c(LocaleController.getString(R.string.AdHidden)).j();
            MessagesController.getInstance(this.currentAccount).disableAds(true);
            return;
        }
        showPremium();
    }

    public void lambda$show$14(Context context, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, l80 l80Var) {
        int i10 = this.currentAccount;
        long j10 = this.dialogId;
        wc wcVar = this.bulletinFactory;
        k0 k0Var = new k0();
        d dVar = new d(this, 0);
        Objects.requireNonNull(l80Var);
        a aVar = new a(l80Var, 1);
        int i11 = x21.f45461w;
        if (context == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = tL_sponsoredMessage.random_id;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_reportSponsoredMessage, new m80(context, k0Var, j10, bArr, aVar, wcVar, dVar, i10));
    }

    public void lambda$show$15(l80 l80Var) {
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            l80Var.u();
            qc qcVar = this.bulletin;
            if (qcVar != null) {
                qcVar.i(true);
                this.bulletin.b();
            }
            this.bulletinFactory.c(LocaleController.getString(R.string.AdHidden)).j();
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

    public void lambda$show$17(org.telegram.ui.Components.qc r22, final org.telegram.tgnet.TLRPC.TL_sponsoredMessage r23, android.content.Context r24, org.telegram.ui.ActionBar.u6 r25, org.telegram.messenger.video.VideoAds.AdLayout r26, org.telegram.messenger.Utilities.Callback r27, android.view.View r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.VideoAds.lambda$show$17(org.telegram.ui.Components.qc, org.telegram.tgnet.TLRPC$TL_sponsoredMessage, android.content.Context, org.telegram.ui.ActionBar.u6, org.telegram.messenger.video.VideoAds$AdLayout, org.telegram.messenger.Utilities$Callback, android.view.View):void");
    }

    public void lambda$show$18(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        logSponsoredClicked(tL_sponsoredMessage);
        qf.d.q(view.getContext(), Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, MessagesController.getInstance(UserConfig.selectedAccount).sponsoredLinksInappAllow, false);
    }

    public void lambda$show$2(CloseDrawable closeDrawable, View view) {
        if (closeDrawable.isCrossAvailable()) {
            qc qcVar = this.bulletin;
            if (qcVar != null) {
                qcVar.b();
            }
        } else if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            qc qcVar2 = this.bulletin;
            if (qcVar2 != null) {
                qcVar2.b();
                this.bulletin = null;
            }
            MessagesController.getInstance(this.currentAccount).disableAds(true);
            this.bulletinFactory.c(LocaleController.getString(R.string.AdHidden)).j();
        } else {
            showPremium();
        }
    }

    public void lambda$show$3(qc qcVar, TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        qc qcVar2 = this.bulletin;
        if (qcVar2 != null && qcVar2 == qcVar) {
            qcVar2.f31861j = (tL_sponsoredMessage.max_display_duration - tL_sponsoredMessage.min_display_duration) * 1000;
            qcVar2.i(true);
        }
    }

    public void lambda$show$4(qc qcVar, boolean[] zArr, CloseDrawable closeDrawable, long[] jArr, Runnable runnable, long[] jArr2, long j10, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Boolean bool) {
        qc qcVar2 = this.bulletin;
        if (qcVar2 != null && qcVar2 == qcVar && bool.booleanValue() != zArr[0]) {
            boolean booleanValue = bool.booleanValue();
            zArr[0] = booleanValue;
            closeDrawable.setPaused(booleanValue);
            if (zArr[0]) {
                this.bulletin.i(false);
                jArr[0] = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(runnable);
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(runnable);
            jArr2[0] = (System.currentTimeMillis() - jArr[0]) + jArr2[0];
            long currentTimeMillis = (System.currentTimeMillis() - j10) - jArr2[0];
            long j11 = (tL_sponsoredMessage.min_display_duration * 1000) - currentTimeMillis;
            long j12 = (tL_sponsoredMessage.max_display_duration * 1000) - currentTimeMillis;
            if (j12 <= 0) {
                qc qcVar3 = this.bulletin;
                if (qcVar3 != null) {
                    qcVar3.b();
                    this.bulletin = null;
                }
            } else if (j11 <= 0) {
                qc qcVar4 = this.bulletin;
                qcVar4.f31861j = (int) j12;
                qcVar4.i(true);
            } else {
                AndroidUtilities.runOnUIThread(runnable, j11);
            }
        }
    }

    public void lambda$show$5(qc qcVar, boolean[] zArr) {
        qc qcVar2 = this.bulletin;
        if (qcVar2 != null && qcVar2 == qcVar && !zArr[0]) {
            zArr[0] = true;
            l80 l80Var = this.currentMenu;
            if (l80Var != null) {
                l80Var.u();
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
    }

    public void lambda$show$7(l80 l80Var, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Context context, View view) {
        l80Var.u();
        logSponsoredClicked(tL_sponsoredMessage);
        qf.d.q(context, Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, MessagesController.getInstance(this.currentAccount).sponsoredLinksInappAllow, false);
    }

    public static boolean lambda$show$8(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        AndroidUtilities.addToClipboard(tL_sponsoredMessage.url);
        return true;
    }

    public static void lambda$show$9(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        AndroidUtilities.addToClipboard(tL_sponsoredMessage.sponsor_info);
    }

    public void lambda$showPremium$19(y0 y0Var) {
        if (y0Var == this.premiumSheet) {
            this.premiumSheet = null;
            checkPopupShownCallback();
        }
    }

    private void load() {
        if (!this.loading && !this.loaded) {
            if (!UserConfig.getInstance(this.currentAccount).isPremium() || !MessagesController.getInstance(this.currentAccount).isSponsoredDisabled()) {
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
        }
    }

    public static VideoAds make(int i10, long j10, int i11, wc wcVar) {
        VideoAdsLocation videoAdsLocation = new VideoAdsLocation(i10, j10);
        LruCache<VideoAdsLocation, VideoAdsCache> lruCache = cached;
        VideoAdsCache videoAdsCache = lruCache.get(videoAdsLocation);
        if (videoAdsCache == null || videoAdsCache.msgId != i11 || System.currentTimeMillis() - videoAdsCache.loadTime > 180000) {
            videoAdsCache = new VideoAdsCache(i11);
            lruCache.put(videoAdsLocation, videoAdsCache);
        }
        return new VideoAds(i10, j10, i11, wcVar, videoAdsCache);
    }

    private void schedule() {
        int i10;
        AndroidUtilities.cancelRunOnUIThread(this.showRunnable);
        if (this.loaded && !this.ads.isEmpty()) {
            if (this.first) {
                i10 = this.start_delay;
            } else {
                i10 = this.between_delay;
            }
            AndroidUtilities.runOnUIThread(this.showRunnable, Math.max(0L, (i10 * 1000) - (System.currentTimeMillis() - this.lastTime)));
        }
    }

    public void show() {
        if (this.ads.isEmpty()) {
            return;
        }
        final TLRPC.TL_sponsoredMessage tL_sponsoredMessage = this.ads.get(0);
        final long currentTimeMillis = System.currentTimeMillis() - this.currentBulletinPassedTime;
        this.bulletinShowTime = currentTimeMillis;
        qc qcVar = this.bulletin;
        if (qcVar != null) {
            qcVar.b();
            this.bulletin = null;
        }
        Context X = this.bulletinFactory.X();
        u6 u6Var = this.bulletinFactory.f34498c;
        AdLayout adLayout = new AdLayout(X, u6Var) {
            {
                VideoAds.this = this;
            }

            @Override
            public void updatePosition() {
                super.updatePosition();
                if (VideoAds.this.currentMenu != null) {
                    VideoAds.this.currentMenu.X(getTranslationY() - VideoAds.this.currentMenuTranslationY);
                }
            }

            @Override
            public void addColorKeys(HashSet hashSet) {
            }
        };
        adLayout.titleTextView.k(tL_sponsoredMessage.title);
        b6 b6Var = adLayout.titleTextView;
        Context X2 = this.bulletinFactory.X();
        int i10 = y6.Oh;
        b6Var.i(new AdOptionsDrawable(X2, y6.w0(i10, this.bulletinFactory.f34498c)));
        adLayout.subtitleTextView.setText(tL_sponsoredMessage.message);
        TLRPC.MessageMedia messageMedia = tL_sponsoredMessage.media;
        if (messageMedia != null) {
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                adLayout.imageView.k(ImageLocation.getForDocument(tL_sponsoredMessage.media.document), "48_48", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 48), tL_sponsoredMessage.media.document), "48_48", 0L, null, null, 0);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 48, true, null, true);
                    adLayout.imageView.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize, tL_sponsoredMessage.media.photo), "48_48", ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(tL_sponsoredMessage.media.photo.sizes, 48, true, closestPhotoSizeWithSize, false), tL_sponsoredMessage.media.photo), "48_48", 0L, null, null, 0);
                }
            }
        } else {
            TLRPC.Photo photo2 = tL_sponsoredMessage.photo;
            if (photo2 != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 48, true, null, true);
                adLayout.imageView.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize2, tL_sponsoredMessage.photo), "48_48", ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(tL_sponsoredMessage.photo.sizes, 48, true, closestPhotoSizeWithSize2, false), tL_sponsoredMessage.photo), "48_48", 0L, null, null, 0);
            } else {
                adLayout.hideImage();
            }
        }
        final CloseDrawable closeDrawable = new CloseDrawable(adLayout.buttonView, tL_sponsoredMessage.min_display_duration, tL_sponsoredMessage.max_display_duration, this.currentBulletinPassedTime);
        closeDrawable.setColor(y6.w0(i10, this.bulletinFactory.f34498c));
        adLayout.buttonView.setImageDrawable(closeDrawable);
        adLayout.buttonView.setOnClickListener(new q(24, this, closeDrawable));
        final qc b10 = this.bulletinFactory.b(adLayout, tL_sponsoredMessage.max_display_duration * 1000);
        this.bulletin = b10;
        b10.v = false;
        b10.i(false);
        final f1 f1Var = new f1(this, b10, tL_sponsoredMessage, 15);
        final long[] jArr = new long[1];
        final long[] jArr2 = new long[1];
        final boolean[] zArr = new boolean[1];
        Utilities.Callback callback = new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                VideoAds.this.lambda$show$4(b10, zArr, closeDrawable, jArr2, f1Var, jArr, currentTimeMillis, tL_sponsoredMessage, (Boolean) obj);
            }
        };
        AndroidUtilities.runOnUIThread(f1Var, tL_sponsoredMessage.min_display_duration * 1000);
        qc qcVar2 = this.bulletin;
        qcVar2.f31870s = false;
        qcVar2.f31873w = new f1(this, b10, new boolean[1], 16);
        adLayout.titleTextView.setRightDrawableOnClick(new f(this, b10, tL_sponsoredMessage, X, u6Var, adLayout, callback, 0));
        qc qcVar3 = this.bulletin;
        q qVar = new q(25, this, tL_sponsoredMessage);
        ub ubVar = qcVar3.e;
        if (ubVar != null) {
            ubVar.setOnClickListener(qVar);
        }
        this.bulletin.j();
        logSponsoredShown(tL_sponsoredMessage);
    }

    public void showPremium() {
        y0 y0Var = this.premiumSheet;
        if (y0Var != null) {
            y0Var.dismiss();
            this.premiumSheet = null;
        }
        y0 y0Var2 = new y0(new r2() {
            {
                VideoAds.this = this;
            }

            @Override
            public Context getContext() {
                return AndroidUtilities.findActivity(LaunchActivity.I1);
            }

            @Override
            public int getCurrentAccount() {
                return VideoAds.this.currentAccount;
            }

            @Override
            public Activity getParentActivity() {
                Activity findActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
                if (findActivity == null) {
                    return LaunchActivity.I1;
                }
                return findActivity;
            }
        }, 3, true);
        this.premiumSheet = y0Var2;
        y0Var2.setOnDismissListener(new e0(20, this, y0Var2));
        y0Var2.show();
        checkPopupShownCallback();
    }

    public boolean isPopupShown() {
        l80 l80Var = this.currentMenu;
        if (l80Var == null || !l80Var.D()) {
            y0 y0Var = this.premiumSheet;
            if (y0Var != null && y0Var.isShown()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void logSponsoredClicked(TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        if (tL_sponsoredMessage != null) {
            TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
            tL_messages_clickSponsoredMessage.random_id = tL_sponsoredMessage.random_id;
            tL_messages_clickSponsoredMessage.media = false;
            tL_messages_clickSponsoredMessage.fullscreen = false;
            if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_clickSponsoredMessage, null);
            }
        }
    }

    public void logSponsoredShown(TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        if (tL_sponsoredMessage != null) {
            TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
            tL_messages_viewSponsoredMessage.random_id = tL_sponsoredMessage.random_id;
            if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_viewSponsoredMessage, null);
            }
        }
    }

    public void setPauseOnPopupCallback(Runnable runnable) {
        this.onPopupCallback = runnable;
    }

    public void setWaitingPaused(boolean z10) {
        if (this.waitingPaused != z10) {
            this.waitingPaused = z10;
            AndroidUtilities.cancelRunOnUIThread(this.showRunnable);
            if (z10) {
                this.waitingTimeSince = System.currentTimeMillis();
                return;
            }
            this.lastTime += System.currentTimeMillis() - this.waitingTimeSince;
            if (this.bulletin == null) {
                schedule();
            }
        }
    }

    public void stop() {
        if (this.bulletin != null) {
            this.currentBulletinPassedTime = System.currentTimeMillis() - this.bulletinShowTime;
            if (!this.ads.isEmpty() && this.currentBulletinPassedTime > this.ads.get(0).min_display_duration * 1000) {
                this.currentBulletinPassedTime = 0L;
                this.ads.remove(0);
                this.first = false;
            }
            this.bulletin.b();
            this.bulletin = null;
        } else {
            this.currentBulletinPassedTime = 0L;
        }
        l80 l80Var = this.currentMenu;
        if (l80Var != null) {
            l80Var.u();
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

    public static class AdLayout extends nb {
        public final ImageView buttonView;
        public final y9 imageView;
        private final LinearLayout linearLayout;
        public final aa0 subtitleTextView;
        public final b6 titleTextView;

        public AdLayout(Context context, u6 u6Var) {
            super(context, u6Var);
            setBackground(getThemedColor(y6.Fi));
            y9 y9Var = new y9(context);
            this.imageView = y9Var;
            y9Var.setRoundRadius(AndroidUtilities.dp(48.0f));
            addView(y9Var, kb1.m(36.0f, 36.0f, 8388627, 9.0f, 0.0f, 0.0f, 0.0f));
            int i10 = y6.Hi;
            getThemedColor(i10);
            int i11 = y6.Gi;
            getThemedColor(i11);
            LinearLayout linearLayout = new LinearLayout(context);
            this.linearLayout = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, kb1.m(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 54.0f, 8.0f));
            b6 b6Var = new b6(context);
            this.titleTextView = b6Var;
            b6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            f7.Y(b6Var, i10, u6Var);
            b6Var.setTextSize(14);
            b6Var.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(b6Var);
            aa0 aa0Var = new aa0(context, null);
            this.subtitleTextView = aa0Var;
            aa0Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            f7.V(aa0Var, i10, u6Var);
            f7.H(aa0Var, i11, u6Var);
            aa0Var.setTypeface(Typeface.SANS_SERIF);
            aa0Var.setTextSize(1, 13.0f);
            linearLayout.addView(aa0Var);
            ImageView imageView = new ImageView(context);
            this.buttonView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i12 = y6.Oh;
            y g02 = y6.g0(y6.o1(0.15f, getThemedColor(i12)), 7, -1);
            b7 L = f7.L(0.15f, i12);
            imageView.setBackground(g02);
            f7.k(imageView, g02, null, L, u6Var);
            addView(imageView, kb1.m(32.0f, 32.0f, 8388629, 0.0f, 0.0f, 11.0f, 0.0f));
        }

        @Override
        public CharSequence getAccessibilityText() {
            return ((Object) this.titleTextView.getText()) + ".\n" + ((Object) this.subtitleTextView.getText());
        }

        public void hideImage() {
            this.imageView.setVisibility(8);
            this.linearLayout.setLayoutParams(kb1.m(-2.0f, -2.0f, 8388627, 10.0f, 8.0f, 54.0f, 8.0f));
        }

        @Override
        public void onShow() {
            super.onShow();
        }

        @Override
        public void addColorKeys(HashSet hashSet) {
        }
    }

    public static class AdOptionsDrawable extends Drawable {
        public final int color;
        public final Drawable icon;
        public final Paint backgroundPaint = new Paint(1);
        public final r11 text = new r11(LocaleController.getString(R.string.SponsoredMessageAd), 11.0f, AndroidUtilities.bold());
        private float alpha = 1.0f;

        public AdOptionsDrawable(Context context, int i10) {
            this.color = i10;
            Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_other).mutate();
            this.icon = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }

        @Override
        public void draw(Canvas canvas) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getBounds());
            rectF.left += AndroidUtilities.dp(4.0f);
            this.backgroundPaint.setColor(y6.o1(this.alpha * 0.2f, this.color));
            canvas.drawRoundRect(rectF, rectF.height(), rectF.height(), this.backgroundPaint);
            this.text.c(rectF.left + AndroidUtilities.dp(5.0f), rectF.centerY(), this.alpha, this.color, canvas);
            this.icon.setBounds(getBounds().right - AndroidUtilities.dp(12.99f), getBounds().centerY() - AndroidUtilities.dp(5.665f), getBounds().right - AndroidUtilities.dp(1.66f), AndroidUtilities.dp(5.665f) + getBounds().centerY());
            this.icon.setAlpha((int) (this.alpha * 255.0f));
            this.icon.draw(canvas);
        }

        @Override
        public int getIntrinsicHeight() {
            return AndroidUtilities.dp(16.0f);
        }

        @Override
        public int getIntrinsicWidth() {
            return (int) (this.text.l() + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(18.0f));
        }

        @Override
        public int getOpacity() {
            return -2;
        }

        @Override
        public void setAlpha(int i10) {
            this.alpha = i10 / 255.0f;
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }
}
