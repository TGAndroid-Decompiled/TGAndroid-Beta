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
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public class VideoAds {
    private static final LruCache<VideoAdsLocation, VideoAdsCache> cached = new LruCache<>(3);
    private int between_delay;
    private v21 bulletin;
    private d31 bulletinFactory;
    private long bulletinShowTime;
    private final VideoAdsCache cache;
    private final int currentAccount;
    private long currentBulletinPassedTime;
    private fu5 currentMenu;
    private float currentMenuTranslationY;
    private final long dialogId;
    private boolean lastPopupShown;
    private long lastTime;
    private boolean loaded;
    private boolean loading;
    private final int msg_id;
    private Runnable onPopupCallback;
    private xk8 premiumSheet;
    private int requestId;
    private int start_delay;
    public boolean videoWasPlaying;
    private boolean waitingPaused;
    private long waitingTimeSince;
    private final ArrayList<TLRPC.TL_sponsoredMessage> ads = new ArrayList<>();
    private boolean first = true;
    private final Runnable showRunnable = new dec(this, (byte) 1);

    public static class CloseDrawable extends Drawable {
        private int alpha;
        private final long max_display_duration;
        private final long min_display_duration;
        private long minusTime;
        private final Paint paint;
        private final View parentView;
        private boolean paused;
        private long pausedTime;
        private final mm showCrossAnimated;
        private final mm showTimerAnimated;
        private final long startTime;
        private final hn timer;
        private final mm timerScaleAnimated;

        public CloseDrawable(View view, int i, int i2, long j) {
            hn hnVar = new hn(false, true, true);
            this.timer = hnVar;
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
            hnVar.setCallback(view);
            hnVar.b = 17;
            hnVar.w(hl.L(12.0f));
            hnVar.x(hl.n1("fonts/num.otf"));
            hnVar.N = hl.q.x;
            hnVar.u(-1);
            k43 k43Var = k43.h;
            this.showCrossAnimated = new mm(view, 0L, 420L, k43Var);
            this.showTimerAnimated = new mm(view, 0L, 420L, k43Var);
            this.timerScaleAnimated = new mm(view, 0L, 420L, k43Var);
        }

        @Override
        public void draw(Canvas canvas) {
            long currentTimeMillis;
            boolean z;
            float f;
            float centerX = getBounds().centerX();
            float centerY = getBounds().centerY();
            if (this.paused) {
                currentTimeMillis = this.pausedTime;
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            long j = (currentTimeMillis - this.minusTime) - this.startTime;
            long max = Math.max(0L, this.min_display_duration - j);
            long j2 = this.min_display_duration;
            float f2 = ((float) max) / ((float) j2);
            int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
            boolean z2 = false;
            if (i < 0) {
                z = true;
            } else {
                z = false;
            }
            float d = this.showTimerAnimated.d(z);
            String valueOf = String.valueOf((int) Math.ceil(max / 1000.0d));
            mm mmVar = this.timerScaleAnimated;
            if (valueOf.length() >= 3) {
                f = 0.825f;
            } else if (valueOf.length() >= 2) {
                f = 0.875f;
            } else {
                f = 1.0f;
            }
            float e = mmVar.e(false, f);
            canvas.save();
            canvas.scale(e, e, centerX, centerY);
            this.timer.t(valueOf, true, true);
            this.timer.o(centerX - 1.0f, centerY - 1.0f, centerX + 1.0f, centerY + 1.0f);
            hn hnVar = this.timer;
            hnVar.C = (int) (this.alpha * d);
            hnVar.draw(canvas);
            canvas.restore();
            this.paint.setAlpha((int) (this.alpha * d));
            this.paint.setStrokeWidth(hl.L(2.0f));
            RectF rectF = hl.P;
            rectF.set(centerX - hl.L(9.0f), centerY - hl.L(9.0f), hl.L(9.0f) + centerX, hl.L(9.0f) + centerY);
            canvas.drawArc(rectF, -90.0f, f2 * (-360.0f), false, this.paint);
            mm mmVar2 = this.showCrossAnimated;
            if ((1.0f - f2) * 360.0f > 75.0f) {
                z2 = true;
            }
            float d2 = mmVar2.d(z2);
            float R1 = hl.R1(centerX, hl.L(8.0f) + centerX, d);
            float R12 = hl.R1(centerY, centerY - hl.L(8.0f), d);
            float R13 = hl.R1(0.35f, 1.0f, d2) * hl.U1(d, hl.L(5.0f), hl.L(3.0f));
            this.paint.setAlpha((int) (this.alpha * d2));
            float f3 = R1 - R13;
            float f4 = R12 - R13;
            float f5 = R1 + R13;
            float f6 = R13 + R12;
            canvas.drawLine(f3, f4, f5, f6, this.paint);
            canvas.drawLine(f3, f6, f5, f4, this.paint);
            if (d > 0.0f) {
                this.parentView.invalidate();
            }
        }

        @Override
        public int getIntrinsicHeight() {
            return hl.L(24.0f);
        }

        @Override
        public int getIntrinsicWidth() {
            return hl.L(24.0f);
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
        public void setAlpha(int i) {
            this.alpha = i;
        }

        public void setColor(int i) {
            this.timer.u(i);
            this.paint.setColor(i);
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
            this.timer.setColorFilter(colorFilter);
            this.paint.setColorFilter(colorFilter);
        }

        public void setPaused(boolean z) {
            if (this.paused == z) {
                return;
            }
            this.paused = z;
            if (z) {
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

        public VideoAdsCache(int i) {
            this.msgId = i;
        }
    }

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

    private VideoAds(int i, long j, int i2, d31 d31Var, VideoAdsCache videoAdsCache) {
        this.lastTime = 0L;
        this.currentAccount = i;
        this.dialogId = j;
        this.msg_id = i2;
        this.cache = videoAdsCache;
        this.lastTime = System.currentTimeMillis();
        init(d31Var);
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

    private void init(d31 d31Var) {
        this.bulletinFactory = d31Var;
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
            uc7.s1(this.currentAccount).j4(tL_messages_sponsoredMessages.users, false);
            uc7.s1(this.currentAccount).c4(tL_messages_sponsoredMessages.chats, false);
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
        hl.c3(new c9c(this, tLObject, (byte) 7));
    }

    public static void lambda$show$10(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        hl.g(tL_sponsoredMessage.additional_info);
    }

    public void lambda$show$12(fu5 fu5Var) {
        if (yac.h(this.currentAccount).p()) {
            fu5Var.u();
            v21 v21Var = this.bulletin;
            if (v21Var != null) {
                v21Var.i(true);
                this.bulletin.b();
            }
            this.bulletinFactory.c(ob6.M0(2131754481, null)).j();
            uc7.s1(this.currentAccount).n0(true);
            return;
        }
        showPremium();
    }

    public void lambda$show$14(Context context, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, fu5 fu5Var) {
        int i = this.currentAccount;
        long j = this.dialogId;
        d31 d31Var = this.bulletinFactory;
        w53 w53Var = new w53();
        dec decVar = new dec(this, (byte) 0);
        Objects.requireNonNull(fu5Var);
        vn1 vn1Var = new vn1(fu5Var, (byte) 12);
        int i2 = nb9.v1;
        if (context == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = tL_sponsoredMessage.random_id;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_reportSponsoredMessage, new q15(context, w53Var, j, bArr, vn1Var, d31Var, decVar, i));
    }

    public void lambda$show$15(fu5 fu5Var) {
        if (yac.h(this.currentAccount).p()) {
            fu5Var.u();
            v21 v21Var = this.bulletin;
            if (v21Var != null) {
                v21Var.i(true);
                this.bulletin.b();
            }
            this.bulletinFactory.c(ob6.M0(2131754481, null)).j();
            uc7.s1(this.currentAccount).n0(true);
            return;
        }
        showPremium();
    }

    public void lambda$show$16(pcc pccVar) {
        pccVar.a(Boolean.FALSE);
        this.currentMenu = null;
        checkPopupShownCallback();
    }

    public void lambda$show$17(defpackage.v21 r23, final org.telegram.tgnet.TLRPC.TL_sponsoredMessage r24, android.content.Context r25, defpackage.vnb r26, org.telegram.messenger.video.VideoAds.AdLayout r27, defpackage.pcc r28, android.view.View r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.VideoAds.lambda$show$17(v21, org.telegram.tgnet.TLRPC$TL_sponsoredMessage, android.content.Context, vnb, org.telegram.messenger.video.VideoAds$AdLayout, pcc, android.view.View):void");
    }

    public void lambda$show$18(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        logSponsoredClicked(tL_sponsoredMessage);
        m01.t(view.getContext(), Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, uc7.s1(yac.t0).l4.I2.f, false, false);
    }

    public void lambda$show$2(CloseDrawable closeDrawable, View view) {
        if (closeDrawable.isCrossAvailable()) {
            v21 v21Var = this.bulletin;
            if (v21Var != null) {
                v21Var.b();
            }
        } else if (yac.h(this.currentAccount).p()) {
            v21 v21Var2 = this.bulletin;
            if (v21Var2 != null) {
                v21Var2.b();
                this.bulletin = null;
            }
            uc7.s1(this.currentAccount).n0(true);
            this.bulletinFactory.c(ob6.M0(2131754481, null)).j();
        } else {
            showPremium();
        }
    }

    public void lambda$show$3(v21 v21Var, TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        v21 v21Var2 = this.bulletin;
        if (v21Var2 != null && v21Var2 == v21Var) {
            v21Var2.j = (tL_sponsoredMessage.max_display_duration - tL_sponsoredMessage.min_display_duration) * 1000;
            v21Var2.i(true);
        }
    }

    public void lambda$show$4(v21 v21Var, boolean[] zArr, CloseDrawable closeDrawable, long[] jArr, Runnable runnable, long[] jArr2, long j, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Boolean bool) {
        v21 v21Var2 = this.bulletin;
        if (v21Var2 != null && v21Var2 == v21Var && bool.booleanValue() != zArr[0]) {
            boolean booleanValue = bool.booleanValue();
            zArr[0] = booleanValue;
            closeDrawable.setPaused(booleanValue);
            if (zArr[0]) {
                this.bulletin.i(false);
                jArr[0] = System.currentTimeMillis();
                hl.r(runnable);
                return;
            }
            hl.r(runnable);
            jArr2[0] = (System.currentTimeMillis() - jArr[0]) + jArr2[0];
            long currentTimeMillis = (System.currentTimeMillis() - j) - jArr2[0];
            long j2 = (tL_sponsoredMessage.min_display_duration * 1000) - currentTimeMillis;
            long j3 = (tL_sponsoredMessage.max_display_duration * 1000) - currentTimeMillis;
            if (j3 <= 0) {
                v21 v21Var3 = this.bulletin;
                if (v21Var3 != null) {
                    v21Var3.b();
                    this.bulletin = null;
                }
            } else if (j2 <= 0) {
                v21 v21Var4 = this.bulletin;
                v21Var4.j = (int) j3;
                v21Var4.i(true);
            } else {
                hl.d3(runnable, j2);
            }
        }
    }

    public void lambda$show$5(v21 v21Var, boolean[] zArr) {
        v21 v21Var2 = this.bulletin;
        if (v21Var2 != null && v21Var2 == v21Var && !zArr[0]) {
            zArr[0] = true;
            fu5 fu5Var = this.currentMenu;
            if (fu5Var != null) {
                fu5Var.u();
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

    public void lambda$show$7(fu5 fu5Var, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Context context, View view) {
        fu5Var.u();
        logSponsoredClicked(tL_sponsoredMessage);
        m01.t(context, Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, uc7.s1(this.currentAccount).l4.I2.f, false, false);
    }

    public static boolean lambda$show$8(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        hl.g(tL_sponsoredMessage.url);
        return true;
    }

    public static void lambda$show$9(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        hl.g(tL_sponsoredMessage.sponsor_info);
    }

    public void lambda$showPremium$19(xk8 xk8Var) {
        if (xk8Var == this.premiumSheet) {
            this.premiumSheet = null;
            checkPopupShownCallback();
        }
    }

    private void load() {
        if (!this.loading && !this.loaded) {
            if (!yac.h(this.currentAccount).p() || !uc7.s1(this.currentAccount).J2()) {
                this.loading = true;
                TLRPC.TL_messages_getSponsoredMessages tL_messages_getSponsoredMessages = new TLRPC.TL_messages_getSponsoredMessages();
                tL_messages_getSponsoredMessages.peer = uc7.s1(this.currentAccount).j1(this.dialogId);
                tL_messages_getSponsoredMessages.flags |= 1;
                tL_messages_getSponsoredMessages.msg_id = this.msg_id;
                this.requestId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getSponsoredMessages, new yp9(this, (byte) 23));
            }
        }
    }

    public static VideoAds make(int i, long j, int i2, d31 d31Var) {
        VideoAdsLocation videoAdsLocation = new VideoAdsLocation(i, j);
        LruCache<VideoAdsLocation, VideoAdsCache> lruCache = cached;
        VideoAdsCache videoAdsCache = lruCache.get(videoAdsLocation);
        if (videoAdsCache == null || videoAdsCache.msgId != i2 || System.currentTimeMillis() - videoAdsCache.loadTime > 180000) {
            videoAdsCache = new VideoAdsCache(i2);
            lruCache.put(videoAdsLocation, videoAdsCache);
        }
        return new VideoAds(i, j, i2, d31Var, videoAdsCache);
    }

    private void schedule() {
        int i;
        hl.r(this.showRunnable);
        if (this.loaded && !this.ads.isEmpty()) {
            if (this.first) {
                i = this.start_delay;
            } else {
                i = this.between_delay;
            }
            hl.d3(this.showRunnable, Math.max(0L, (i * 1000) - (System.currentTimeMillis() - this.lastTime)));
        }
    }

    public void show() {
        if (this.ads.isEmpty()) {
            return;
        }
        final TLRPC.TL_sponsoredMessage tL_sponsoredMessage = this.ads.get(0);
        final long currentTimeMillis = System.currentTimeMillis() - this.currentBulletinPassedTime;
        this.bulletinShowTime = currentTimeMillis;
        v21 v21Var = this.bulletin;
        if (v21Var != null) {
            v21Var.b();
            this.bulletin = null;
        }
        Context X = this.bulletinFactory.X();
        vnb vnbVar = this.bulletinFactory.c;
        AdLayout adLayout = new AdLayout(X, vnbVar) {
            {
                VideoAds.this = this;
            }

            @Override
            public void updatePosition() {
                super.updatePosition();
                if (VideoAds.this.currentMenu != null) {
                    VideoAds.this.currentMenu.Y(getTranslationY() - VideoAds.this.currentMenuTranslationY);
                }
            }

            @Override
            public void addColorKeys(HashSet hashSet) {
            }
        };
        adLayout.titleTextView.k(tL_sponsoredMessage.title);
        ema emaVar = adLayout.titleTextView;
        Context X2 = this.bulletinFactory.X();
        int i = aob.Fi;
        emaVar.i(new AdOptionsDrawable(X2, aob.v0(i, this.bulletinFactory.c)));
        adLayout.subtitleTextView.setText(tL_sponsoredMessage.message);
        TLRPC.MessageMedia messageMedia = tL_sponsoredMessage.media;
        if (messageMedia != null) {
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                adLayout.imageView.g(0, 0L, jn5.b(tL_sponsoredMessage.media.document), jn5.c(xb4.w(document.thumbs, 48, false, null, false), tL_sponsoredMessage.media.document), null, "48_48", "48_48", null);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w = xb4.w(photo.sizes, 48, true, null, true);
                    adLayout.imageView.g(0, 0L, jn5.i(w, tL_sponsoredMessage.media.photo), jn5.i(xb4.w(tL_sponsoredMessage.media.photo.sizes, 48, true, w, false), tL_sponsoredMessage.media.photo), null, "48_48", "48_48", null);
                }
            }
        } else {
            TLRPC.Photo photo2 = tL_sponsoredMessage.photo;
            if (photo2 != null) {
                TLRPC.PhotoSize w2 = xb4.w(photo2.sizes, 48, true, null, true);
                adLayout.imageView.g(0, 0L, jn5.i(w2, tL_sponsoredMessage.photo), jn5.i(xb4.w(tL_sponsoredMessage.photo.sizes, 48, true, w2, false), tL_sponsoredMessage.photo), null, "48_48", "48_48", null);
            } else {
                adLayout.hideImage();
            }
        }
        final CloseDrawable closeDrawable = new CloseDrawable(adLayout.buttonView, tL_sponsoredMessage.min_display_duration, tL_sponsoredMessage.max_display_duration, this.currentBulletinPassedTime);
        closeDrawable.setColor(aob.v0(i, this.bulletinFactory.c));
        adLayout.buttonView.setImageDrawable(closeDrawable);
        adLayout.buttonView.setOnClickListener(new jjb(this, closeDrawable, (byte) 11));
        final v21 b = this.bulletinFactory.b(adLayout, tL_sponsoredMessage.max_display_duration * 1000);
        this.bulletin = b;
        b.v = false;
        b.i(false);
        final b6c b6cVar = new b6c(this, b, tL_sponsoredMessage, (byte) 5);
        final long[] jArr = new long[1];
        final long[] jArr2 = new long[1];
        final boolean[] zArr = new boolean[1];
        pcc pccVar = new pcc() {
            @Override
            public final void a(Object obj) {
                VideoAds.this.lambda$show$4(b, zArr, closeDrawable, jArr2, b6cVar, jArr, currentTimeMillis, tL_sponsoredMessage, (Boolean) obj);
            }
        };
        hl.d3(b6cVar, tL_sponsoredMessage.min_display_duration * 1000);
        v21 v21Var2 = this.bulletin;
        v21Var2.s = false;
        v21Var2.w = new b6c(this, b, new boolean[1], (byte) 6);
        adLayout.titleTextView.setRightDrawableOnClick(new b65(this, b, tL_sponsoredMessage, X, vnbVar, adLayout, pccVar, (byte) 1));
        v21 v21Var3 = this.bulletin;
        jjb jjbVar = new jjb(this, tL_sponsoredMessage, (byte) 12);
        z11 z11Var = v21Var3.e;
        if (z11Var != null) {
            z11Var.setOnClickListener(jjbVar);
        }
        this.bulletin.j();
        logSponsoredShown(tL_sponsoredMessage);
    }

    public void showPremium() {
        xk8 xk8Var = this.premiumSheet;
        if (xk8Var != null) {
            xk8Var.dismiss();
            this.premiumSheet = null;
        }
        xk8 xk8Var2 = new xk8(new e() {
            {
                VideoAds.this = this;
            }

            @Override
            public Context getContext() {
                return hl.W(LaunchActivity.H1);
            }

            @Override
            public int getCurrentAccount() {
                return VideoAds.this.currentAccount;
            }

            @Override
            public Activity getParentActivity() {
                Activity W = hl.W(org.telegram.messenger.a.b);
                if (W == null) {
                    return LaunchActivity.H1;
                }
                return W;
            }
        }, 3, true);
        this.premiumSheet = xk8Var2;
        xk8Var2.n(new c9c(this, xk8Var2, (byte) 6));
        xk8Var2.show();
        checkPopupShownCallback();
    }

    public boolean isPopupShown() {
        fu5 fu5Var = this.currentMenu;
        if (fu5Var == null || !fu5Var.E()) {
            xk8 xk8Var = this.premiumSheet;
            if (xk8Var != null && !xk8Var.J) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void logSponsoredClicked(TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        if (tL_sponsoredMessage == null) {
            return;
        }
        TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
        tL_messages_clickSponsoredMessage.random_id = tL_sponsoredMessage.random_id;
        tL_messages_clickSponsoredMessage.media = false;
        tL_messages_clickSponsoredMessage.fullscreen = false;
        boolean z = f11.a;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_clickSponsoredMessage, null);
    }

    public void logSponsoredShown(TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        if (tL_sponsoredMessage == null) {
            return;
        }
        TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
        tL_messages_viewSponsoredMessage.random_id = tL_sponsoredMessage.random_id;
        boolean z = f11.a;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_viewSponsoredMessage, null);
    }

    public void setPauseOnPopupCallback(Runnable runnable) {
        this.onPopupCallback = runnable;
    }

    public void setWaitingPaused(boolean z) {
        if (this.waitingPaused != z) {
            this.waitingPaused = z;
            hl.r(this.showRunnable);
            if (z) {
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
        fu5 fu5Var = this.currentMenu;
        if (fu5Var != null) {
            fu5Var.u();
            this.currentMenu = null;
        }
        this.bulletin = null;
        if (this.loading) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.requestId, true);
            this.requestId = 0;
            this.loading = false;
        }
        hl.r(this.showRunnable);
        setWaitingPaused(true);
    }

    public static class AdLayout extends q11 {
        public final ImageView buttonView;
        public final de0 imageView;
        private final LinearLayout linearLayout;
        public final p66 subtitleTextView;
        public final ema titleTextView;

        public AdLayout(Context context, vnb vnbVar) {
            super(context, vnbVar);
            setBackground(getThemedColor(aob.wj));
            de0 de0Var = new de0(context);
            this.imageView = de0Var;
            de0Var.setRoundRadius(hl.L(48.0f));
            addView(de0Var, tre.i(36.0f, 36.0f, 8388627, 9.0f, 0.0f, 0.0f, 0.0f));
            int i = aob.yj;
            getThemedColor(i);
            int i2 = aob.xj;
            getThemedColor(i2);
            LinearLayout linearLayout = new LinearLayout(context);
            this.linearLayout = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, tre.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 54.0f, 8.0f));
            ema emaVar = new ema(context);
            this.titleTextView = emaVar;
            emaVar.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
            yob.W(emaVar, i, vnbVar);
            emaVar.setTextSize(14);
            emaVar.setTypeface(hl.o());
            linearLayout.addView(emaVar);
            p66 p66Var = new p66(context, null);
            this.subtitleTextView = p66Var;
            p66Var.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
            yob.X(p66Var, i, vnbVar);
            yob.G(p66Var, i2, vnbVar);
            p66Var.setTypeface(Typeface.SANS_SERIF);
            p66Var.setTextSize(1, 13.0f);
            linearLayout.addView(p66Var);
            ImageView imageView = new ImageView(context);
            this.buttonView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i3 = aob.Fi;
            hf0 f0 = aob.f0(aob.p1(0.15f, getThemedColor(i3)), 7, -1);
            uob K = yob.K(0.15f, i3);
            imageView.setBackground(f0);
            yob.j(imageView, f0, null, K, vnbVar);
            addView(imageView, tre.i(32.0f, 32.0f, 8388629, 0.0f, 0.0f, 11.0f, 0.0f));
        }

        @Override
        public CharSequence getAccessibilityText() {
            return ((Object) this.titleTextView.getText()) + ".\n" + ((Object) this.subtitleTextView.getText());
        }

        public void hideImage() {
            this.imageView.setVisibility(8);
            this.linearLayout.setLayoutParams(tre.i(-2.0f, -2.0f, 8388627, 10.0f, 8.0f, 54.0f, 8.0f));
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
        public final pkb text = new pkb(ob6.M0(2131744915, null), 11.0f, hl.o());
        private float alpha = 1.0f;

        public AdOptionsDrawable(Context context, int i) {
            this.color = i;
            Drawable e = c00.e(context, 2131231247);
            this.icon = e;
            e.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }

        @Override
        public void draw(Canvas canvas) {
            RectF rectF = hl.P;
            rectF.set(getBounds());
            rectF.left += hl.L(4.0f);
            this.backgroundPaint.setColor(aob.p1(this.alpha * 0.2f, this.color));
            canvas.drawRoundRect(rectF, rectF.height(), rectF.height(), this.backgroundPaint);
            this.text.c(rectF.left + hl.L(5.0f), rectF.centerY(), this.alpha, this.color, canvas);
            this.icon.setBounds(getBounds().right - hl.L(12.99f), getBounds().centerY() - hl.L(5.665f), getBounds().right - hl.L(1.66f), hl.L(5.665f) + getBounds().centerY());
            this.icon.setAlpha((int) (this.alpha * 255.0f));
            this.icon.draw(canvas);
        }

        @Override
        public int getIntrinsicHeight() {
            return hl.L(16.0f);
        }

        @Override
        public int getIntrinsicWidth() {
            return (int) (this.text.j() + hl.L(4.0f) + hl.L(18.0f));
        }

        @Override
        public int getOpacity() {
            return -2;
        }

        @Override
        public void setAlpha(int i) {
            this.alpha = i / 255.0f;
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }
}
