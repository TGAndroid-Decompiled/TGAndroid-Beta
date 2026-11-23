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
import c8.ma;
import fi.h0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import kg.y;
import oi.i1;
import oi.t;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.s2;
import org.telegram.messenger.t0;
import org.telegram.messenger.w7;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qy0;
import ug.y0;
public class VideoAds {
    private static final LruCache<VideoAdsLocation, VideoAdsCache> cached = new LruCache<>(3);
    private int between_delay;
    private gc bulletin;
    private lc bulletinFactory;
    private long bulletinShowTime;
    private final VideoAdsCache cache;
    private final int currentAccount;
    private long currentBulletinPassedTime;
    private a70 currentMenu;
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
        private final d6 showCrossAnimated;
        private final d6 showTimerAnimated;
        private final long startTime;
        private final n6 timer;
        private final d6 timerScaleAnimated;

        public CloseDrawable(View view, int i7, int i10, long j3) {
            n6 n6Var = new n6(false, true, true);
            this.timer = n6Var;
            Paint paint = new Paint(1);
            this.paint = paint;
            this.paused = false;
            this.alpha = 255;
            this.parentView = view;
            this.startTime = System.currentTimeMillis() - j3;
            this.min_display_duration = i7 * 1000;
            this.max_display_duration = i10 * 1000;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setColor(-1);
            n6Var.setCallback(view);
            n6Var.f37795b = 17;
            n6Var.w(g0.L(12.0f));
            n6Var.x(g0.o1("fonts/num.otf"));
            n6Var.N = g0.f24046q.x;
            n6Var.u(-1);
            nr nrVar = nr.h;
            this.showCrossAnimated = new d6(view, 0L, 420L, nrVar);
            this.showTimerAnimated = new d6(view, 0L, 420L, nrVar);
            this.timerScaleAnimated = new d6(view, 0L, 420L, nrVar);
        }

        @Override
        public void draw(Canvas canvas) {
            long currentTimeMillis;
            boolean z10;
            float f10;
            float centerX = getBounds().centerX();
            float centerY = getBounds().centerY();
            if (this.paused) {
                currentTimeMillis = this.pausedTime;
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            long j3 = (currentTimeMillis - this.minusTime) - this.startTime;
            long max = Math.max(0L, this.min_display_duration - j3);
            long j10 = this.min_display_duration;
            float f11 = ((float) max) / ((float) j10);
            int i7 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
            boolean z11 = false;
            if (i7 < 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            float d = this.showTimerAnimated.d(z10);
            String str = "" + ((int) Math.ceil(max / 1000.0d));
            d6 d6Var = this.timerScaleAnimated;
            if (str.length() >= 3) {
                f10 = 0.825f;
            } else if (str.length() >= 2) {
                f10 = 0.875f;
            } else {
                f10 = 1.0f;
            }
            float e10 = d6Var.e(false, f10);
            canvas.save();
            canvas.scale(e10, e10, centerX, centerY);
            this.timer.t(str, true, true);
            this.timer.o(centerX - 1.0f, centerY - 1.0f, centerX + 1.0f, centerY + 1.0f);
            n6 n6Var = this.timer;
            n6Var.C = (int) (this.alpha * d);
            n6Var.draw(canvas);
            canvas.restore();
            this.paint.setAlpha((int) (this.alpha * d));
            this.paint.setStrokeWidth(g0.L(2.0f));
            RectF rectF = g0.P;
            rectF.set(centerX - g0.L(9.0f), centerY - g0.L(9.0f), g0.L(9.0f) + centerX, g0.L(9.0f) + centerY);
            canvas.drawArc(rectF, -90.0f, f11 * (-360.0f), false, this.paint);
            d6 d6Var2 = this.showCrossAnimated;
            if ((1.0f - f11) * 360.0f > 75.0f) {
                z11 = true;
            }
            float d2 = d6Var2.d(z11);
            float T1 = g0.T1(centerX, g0.L(8.0f) + centerX, d);
            float T12 = g0.T1(centerY, centerY - g0.L(8.0f), d);
            float T13 = g0.T1(0.35f, 1.0f, d2) * g0.W1(d, g0.L(5.0f), g0.L(3.0f));
            this.paint.setAlpha((int) (this.alpha * d2));
            float f12 = T1 - T13;
            float f13 = T12 - T13;
            float f14 = T1 + T13;
            float f15 = T13 + T12;
            canvas.drawLine(f12, f13, f14, f15, this.paint);
            canvas.drawLine(f12, f15, f14, f13, this.paint);
            if (d > 0.0f) {
                this.parentView.invalidate();
            }
        }

        @Override
        public int getIntrinsicHeight() {
            return g0.L(24.0f);
        }

        @Override
        public int getIntrinsicWidth() {
            return g0.L(24.0f);
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
        public void setAlpha(int i7) {
            this.alpha = i7;
        }

        public void setColor(int i7) {
            this.timer.u(i7);
            this.paint.setColor(i7);
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

        public VideoAdsCache(int i7) {
            this.msgId = i7;
        }
    }

    public static class VideoAdsLocation {
        int currentAccount;
        long dialogId;

        public VideoAdsLocation(int i7, long j3) {
            this.currentAccount = i7;
            this.dialogId = j3;
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

    private VideoAds(int i7, long j3, int i10, lc lcVar, VideoAdsCache videoAdsCache) {
        this.lastTime = 0L;
        this.currentAccount = i7;
        this.dialogId = j3;
        this.msg_id = i10;
        this.cache = videoAdsCache;
        this.lastTime = System.currentTimeMillis();
        init(lcVar);
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

    private void init(lc lcVar) {
        this.bulletinFactory = lcVar;
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
            np.u1(this.currentAccount).f4(tL_messages_sponsoredMessages.users, false);
            np.u1(this.currentAccount).Z3(tL_messages_sponsoredMessages.chats, false);
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
        g0.g3(new t(9, this, tLObject));
    }

    public static void lambda$show$10(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        g0.g(tL_sponsoredMessage.additional_info);
    }

    public void lambda$show$12(a70 a70Var) {
        if (k10.i(this.currentAccount).q()) {
            a70Var.v();
            gc gcVar = this.bulletin;
            if (gcVar != null) {
                gcVar.i(true);
                this.bulletin.b();
            }
            this.bulletinFactory.c(hd.N0(2131754485, null)).j();
            np.u1(this.currentAccount).p0(true);
            return;
        }
        showPremium();
    }

    public void lambda$show$14(Context context, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, a70 a70Var) {
        int i7 = this.currentAccount;
        long j3 = this.dialogId;
        lc lcVar = this.bulletinFactory;
        h0 h0Var = new h0();
        d dVar = new d(this, 0);
        Objects.requireNonNull(a70Var);
        a aVar = new a(a70Var, 1);
        int i10 = qy0.f51394w1;
        if (context == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = tL_sponsoredMessage.random_id;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_reportSponsoredMessage, new ii.c(context, h0Var, j3, bArr, aVar, lcVar, dVar, i7));
    }

    public void lambda$show$15(a70 a70Var) {
        if (k10.i(this.currentAccount).q()) {
            a70Var.v();
            gc gcVar = this.bulletin;
            if (gcVar != null) {
                gcVar.i(true);
                this.bulletin.b();
            }
            this.bulletinFactory.c(hd.N0(2131754485, null)).j();
            np.u1(this.currentAccount).p0(true);
            return;
        }
        showPremium();
    }

    public void lambda$show$16(y10 y10Var) {
        y10Var.a(Boolean.FALSE);
        this.currentMenu = null;
        checkPopupShownCallback();
    }

    public void lambda$show$17(org.telegram.ui.Components.gc r22, final org.telegram.tgnet.TLRPC.TL_sponsoredMessage r23, android.content.Context r24, org.telegram.ui.ActionBar.h6 r25, org.telegram.messenger.video.VideoAds.AdLayout r26, org.telegram.messenger.y10 r27, android.view.View r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.VideoAds.lambda$show$17(org.telegram.ui.Components.gc, org.telegram.tgnet.TLRPC$TL_sponsoredMessage, android.content.Context, org.telegram.ui.ActionBar.h6, org.telegram.messenger.video.VideoAds$AdLayout, org.telegram.messenger.y10, android.view.View):void");
    }

    public void lambda$show$18(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        logSponsoredClicked(tL_sponsoredMessage);
        vf.c.s(view.getContext(), Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, np.u1(k10.f24968t0).f25856g6, false, false);
    }

    public void lambda$show$2(CloseDrawable closeDrawable, View view) {
        if (closeDrawable.isCrossAvailable()) {
            gc gcVar = this.bulletin;
            if (gcVar != null) {
                gcVar.b();
            }
        } else if (k10.i(this.currentAccount).q()) {
            gc gcVar2 = this.bulletin;
            if (gcVar2 != null) {
                gcVar2.b();
                this.bulletin = null;
            }
            np.u1(this.currentAccount).p0(true);
            this.bulletinFactory.c(hd.N0(2131754485, null)).j();
        } else {
            showPremium();
        }
    }

    public void lambda$show$3(gc gcVar, TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        gc gcVar2 = this.bulletin;
        if (gcVar2 != null && gcVar2 == gcVar) {
            gcVar2.f35527j = (tL_sponsoredMessage.max_display_duration - tL_sponsoredMessage.min_display_duration) * 1000;
            gcVar2.i(true);
        }
    }

    public void lambda$show$4(gc gcVar, boolean[] zArr, CloseDrawable closeDrawable, long[] jArr, Runnable runnable, long[] jArr2, long j3, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Boolean bool) {
        gc gcVar2 = this.bulletin;
        if (gcVar2 != null && gcVar2 == gcVar && bool.booleanValue() != zArr[0]) {
            boolean booleanValue = bool.booleanValue();
            zArr[0] = booleanValue;
            closeDrawable.setPaused(booleanValue);
            if (zArr[0]) {
                this.bulletin.i(false);
                jArr[0] = System.currentTimeMillis();
                g0.r(runnable);
                return;
            }
            g0.r(runnable);
            jArr2[0] = (System.currentTimeMillis() - jArr[0]) + jArr2[0];
            long currentTimeMillis = (System.currentTimeMillis() - j3) - jArr2[0];
            long j10 = (tL_sponsoredMessage.min_display_duration * 1000) - currentTimeMillis;
            long j11 = (tL_sponsoredMessage.max_display_duration * 1000) - currentTimeMillis;
            if (j11 <= 0) {
                gc gcVar3 = this.bulletin;
                if (gcVar3 != null) {
                    gcVar3.b();
                    this.bulletin = null;
                }
            } else if (j10 <= 0) {
                gc gcVar4 = this.bulletin;
                gcVar4.f35527j = (int) j11;
                gcVar4.i(true);
            } else {
                g0.h3(runnable, j10);
            }
        }
    }

    public void lambda$show$5(gc gcVar, boolean[] zArr) {
        gc gcVar2 = this.bulletin;
        if (gcVar2 != null && gcVar2 == gcVar && !zArr[0]) {
            zArr[0] = true;
            a70 a70Var = this.currentMenu;
            if (a70Var != null) {
                a70Var.v();
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

    public void lambda$show$7(a70 a70Var, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Context context, View view) {
        a70Var.v();
        logSponsoredClicked(tL_sponsoredMessage);
        vf.c.s(context, Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, np.u1(this.currentAccount).f25856g6, false, false);
    }

    public static boolean lambda$show$8(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        g0.g(tL_sponsoredMessage.url);
        return true;
    }

    public static void lambda$show$9(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        g0.g(tL_sponsoredMessage.sponsor_info);
    }

    public void lambda$showPremium$19(y0 y0Var) {
        if (y0Var == this.premiumSheet) {
            this.premiumSheet = null;
            checkPopupShownCallback();
        }
    }

    private void load() {
        if (!this.loading && !this.loaded) {
            if (!k10.i(this.currentAccount).q() || !np.u1(this.currentAccount).K2()) {
                this.loading = true;
                TLRPC.TL_messages_getSponsoredMessages tL_messages_getSponsoredMessages = new TLRPC.TL_messages_getSponsoredMessages();
                tL_messages_getSponsoredMessages.peer = np.u1(this.currentAccount).l1(this.dialogId);
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

    public static VideoAds make(int i7, long j3, int i10, lc lcVar) {
        VideoAdsLocation videoAdsLocation = new VideoAdsLocation(i7, j3);
        LruCache<VideoAdsLocation, VideoAdsCache> lruCache = cached;
        VideoAdsCache videoAdsCache = lruCache.get(videoAdsLocation);
        if (videoAdsCache == null || videoAdsCache.msgId != i10 || System.currentTimeMillis() - videoAdsCache.loadTime > 180000) {
            videoAdsCache = new VideoAdsCache(i10);
            lruCache.put(videoAdsLocation, videoAdsCache);
        }
        return new VideoAds(i7, j3, i10, lcVar, videoAdsCache);
    }

    private void schedule() {
        int i7;
        g0.r(this.showRunnable);
        if (this.loaded && !this.ads.isEmpty()) {
            if (this.first) {
                i7 = this.start_delay;
            } else {
                i7 = this.between_delay;
            }
            g0.h3(this.showRunnable, Math.max(0L, (i7 * 1000) - (System.currentTimeMillis() - this.lastTime)));
        }
    }

    public void show() {
        if (this.ads.isEmpty()) {
            return;
        }
        final TLRPC.TL_sponsoredMessage tL_sponsoredMessage = this.ads.get(0);
        final long currentTimeMillis = System.currentTimeMillis() - this.currentBulletinPassedTime;
        this.bulletinShowTime = currentTimeMillis;
        gc gcVar = this.bulletin;
        if (gcVar != null) {
            gcVar.b();
            this.bulletin = null;
        }
        Context X = this.bulletinFactory.X();
        h6 h6Var = this.bulletinFactory.f37162c;
        AdLayout adLayout = new AdLayout(X, h6Var) {
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
        m5 m5Var = adLayout.titleTextView;
        Context X2 = this.bulletinFactory.X();
        int i7 = m6.Fi;
        m5Var.i(new AdOptionsDrawable(X2, m6.w0(i7, this.bulletinFactory.f37162c)));
        adLayout.subtitleTextView.setText(tL_sponsoredMessage.message);
        TLRPC.MessageMedia messageMedia = tL_sponsoredMessage.media;
        if (messageMedia != null) {
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                adLayout.imageView.g(0, 0L, null, "48_48", "48_48", null, org.telegram.messenger.gc.b(tL_sponsoredMessage.media.document), org.telegram.messenger.gc.c(w7.w(document.thumbs, 48, false, null, false), tL_sponsoredMessage.media.document));
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w10 = w7.w(photo.sizes, 48, true, null, true);
                    adLayout.imageView.g(0, 0L, null, "48_48", "48_48", null, org.telegram.messenger.gc.i(w10, tL_sponsoredMessage.media.photo), org.telegram.messenger.gc.i(w7.w(tL_sponsoredMessage.media.photo.sizes, 48, true, w10, false), tL_sponsoredMessage.media.photo));
                }
            }
        } else {
            TLRPC.Photo photo2 = tL_sponsoredMessage.photo;
            if (photo2 != null) {
                TLRPC.PhotoSize w11 = w7.w(photo2.sizes, 48, true, null, true);
                adLayout.imageView.g(0, 0L, null, "48_48", "48_48", null, org.telegram.messenger.gc.i(w11, tL_sponsoredMessage.photo), org.telegram.messenger.gc.i(w7.w(tL_sponsoredMessage.photo.sizes, 48, true, w11, false), tL_sponsoredMessage.photo));
            } else {
                adLayout.hideImage();
            }
        }
        final CloseDrawable closeDrawable = new CloseDrawable(adLayout.buttonView, tL_sponsoredMessage.min_display_duration, tL_sponsoredMessage.max_display_duration, this.currentBulletinPassedTime);
        closeDrawable.setColor(m6.w0(i7, this.bulletinFactory.f37162c));
        adLayout.buttonView.setImageDrawable(closeDrawable);
        adLayout.buttonView.setOnClickListener(new i1(1, this, closeDrawable));
        final gc b10 = this.bulletinFactory.b(adLayout, tL_sponsoredMessage.max_display_duration * 1000);
        this.bulletin = b10;
        b10.f35538u = false;
        b10.i(false);
        final y yVar = new y(this, b10, tL_sponsoredMessage, 19);
        final long[] jArr = new long[1];
        final long[] jArr2 = new long[1];
        final boolean[] zArr = new boolean[1];
        y10 y10Var = new y10() {
            @Override
            public final void a(Object obj) {
                VideoAds.this.lambda$show$4(b10, zArr, closeDrawable, jArr2, yVar, jArr, currentTimeMillis, tL_sponsoredMessage, (Boolean) obj);
            }
        };
        g0.h3(yVar, tL_sponsoredMessage.min_display_duration * 1000);
        gc gcVar2 = this.bulletin;
        gcVar2.f35535r = false;
        gcVar2.v = new y(this, b10, new boolean[1], 20);
        adLayout.titleTextView.setRightDrawableOnClick(new f(this, b10, tL_sponsoredMessage, X, h6Var, adLayout, y10Var, 0));
        gc gcVar3 = this.bulletin;
        i1 i1Var = new i1(2, this, tL_sponsoredMessage);
        lb lbVar = gcVar3.f35523e;
        if (lbVar != null) {
            lbVar.setOnClickListener(i1Var);
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
        y0 y0Var2 = new y0(new g2() {
            {
                VideoAds.this = this;
            }

            @Override
            public Context getContext() {
                return g0.W(LaunchActivity.H1);
            }

            @Override
            public int getCurrentAccount() {
                return VideoAds.this.currentAccount;
            }

            @Override
            public Activity getParentActivity() {
                Activity W = g0.W(t0.f26931b);
                if (W == null) {
                    return LaunchActivity.H1;
                }
                return W;
            }
        }, 3, true);
        this.premiumSheet = y0Var2;
        y0Var2.n(new t(8, this, y0Var2));
        y0Var2.show();
        checkPopupShownCallback();
    }

    public boolean isPopupShown() {
        a70 a70Var = this.currentMenu;
        if (a70Var == null || !a70Var.E()) {
            y0 y0Var = this.premiumSheet;
            if (y0Var != null && !y0Var.J) {
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
        boolean z10 = s2.f26730a;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_clickSponsoredMessage, null);
    }

    public void logSponsoredShown(TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        if (tL_sponsoredMessage == null) {
            return;
        }
        TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
        tL_messages_viewSponsoredMessage.random_id = tL_sponsoredMessage.random_id;
        boolean z10 = s2.f26730a;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_viewSponsoredMessage, null);
    }

    public void setPauseOnPopupCallback(Runnable runnable) {
        this.onPopupCallback = runnable;
    }

    public void setWaitingPaused(boolean z10) {
        if (this.waitingPaused != z10) {
            this.waitingPaused = z10;
            g0.r(this.showRunnable);
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
        a70 a70Var = this.currentMenu;
        if (a70Var != null) {
            a70Var.v();
            this.currentMenu = null;
        }
        this.bulletin = null;
        if (this.loading) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.requestId, true);
            this.requestId = 0;
            this.loading = false;
        }
        g0.r(this.showRunnable);
        setWaitingPaused(true);
    }

    public static class AdLayout extends eb {
        public final ImageView buttonView;
        public final q9 imageView;
        private final LinearLayout linearLayout;
        public final m80 subtitleTextView;
        public final m5 titleTextView;

        public AdLayout(Context context, h6 h6Var) {
            super(context, h6Var);
            setBackground(getThemedColor(m6.wj));
            q9 q9Var = new q9(context);
            this.imageView = q9Var;
            q9Var.setRoundRadius(g0.L(48.0f));
            addView(q9Var, ma.i(36.0f, 36.0f, 8388627, 9.0f, 0.0f, 0.0f, 0.0f));
            int i7 = m6.yj;
            getThemedColor(i7);
            int i10 = m6.xj;
            getThemedColor(i10);
            LinearLayout linearLayout = new LinearLayout(context);
            this.linearLayout = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, ma.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 54.0f, 8.0f));
            m5 m5Var = new m5(context);
            this.titleTextView = m5Var;
            m5Var.setPadding(g0.L(4.0f), 0, g0.L(4.0f), 0);
            t6.X(m5Var, i7, h6Var);
            m5Var.setTextSize(14);
            m5Var.setTypeface(g0.o());
            linearLayout.addView(m5Var);
            m80 m80Var = new m80(context, null);
            this.subtitleTextView = m80Var;
            m80Var.setPadding(g0.L(4.0f), 0, g0.L(4.0f), 0);
            t6.U(m80Var, i7, h6Var);
            t6.G(m80Var, i10, h6Var);
            m80Var.setTypeface(Typeface.SANS_SERIF);
            m80Var.setTextSize(1, 13.0f);
            linearLayout.addView(m80Var);
            ImageView imageView = new ImageView(context);
            this.buttonView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i11 = m6.Fi;
            org.telegram.ui.Cells.y h02 = m6.h0(m6.r1(0.15f, getThemedColor(i11)), 7, -1);
            p6 K = t6.K(0.15f, i11);
            imageView.setBackground(h02);
            t6.j(imageView, h02, null, K, h6Var);
            addView(imageView, ma.i(32.0f, 32.0f, 8388629, 0.0f, 0.0f, 11.0f, 0.0f));
        }

        @Override
        public CharSequence getAccessibilityText() {
            return ((Object) this.titleTextView.getText()) + ".\n" + ((Object) this.subtitleTextView.getText());
        }

        public void hideImage() {
            this.imageView.setVisibility(8);
            this.linearLayout.setLayoutParams(ma.i(-2.0f, -2.0f, 8388627, 10.0f, 8.0f, 54.0f, 8.0f));
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
        public final xy0 text = new xy0(hd.N0(2131745015, null), 11.0f, g0.o());
        private float alpha = 1.0f;

        public AdOptionsDrawable(Context context, int i7) {
            this.color = i7;
            Drawable g10 = i5.c.g(context, 2131231244);
            this.icon = g10;
            g10.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
        }

        @Override
        public void draw(Canvas canvas) {
            RectF rectF = g0.P;
            rectF.set(getBounds());
            rectF.left += g0.L(4.0f);
            this.backgroundPaint.setColor(m6.r1(this.alpha * 0.2f, this.color));
            canvas.drawRoundRect(rectF, rectF.height(), rectF.height(), this.backgroundPaint);
            this.text.c(rectF.left + g0.L(5.0f), rectF.centerY(), this.alpha, this.color, canvas);
            this.icon.setBounds(getBounds().right - g0.L(12.99f), getBounds().centerY() - g0.L(5.665f), getBounds().right - g0.L(1.66f), g0.L(5.665f) + getBounds().centerY());
            this.icon.setAlpha((int) (this.alpha * 255.0f));
            this.icon.draw(canvas);
        }

        @Override
        public int getIntrinsicHeight() {
            return g0.L(16.0f);
        }

        @Override
        public int getIntrinsicWidth() {
            return (int) (this.text.k() + g0.L(4.0f) + g0.L(18.0f));
        }

        @Override
        public int getOpacity() {
            return -2;
        }

        @Override
        public void setAlpha(int i7) {
            this.alpha = i7 / 255.0f;
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }
}
