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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public class VideoAds {
    private static final LruCache<VideoAdsLocation, VideoAdsCache> cached = new LruCache<>(3);
    private int between_delay;
    private m21 bulletin;
    private u21 bulletinFactory;
    private long bulletinShowTime;
    private final VideoAdsCache cache;
    private final int currentAccount;
    private long currentBulletinPassedTime;
    private cs5 currentMenu;
    private float currentMenuTranslationY;
    private final long dialogId;
    private boolean lastPopupShown;
    private long lastTime;
    private boolean loaded;
    private boolean loading;
    private final int msg_id;
    private Runnable onPopupCallback;
    private jh8 premiumSheet;
    private int requestId;
    private int start_delay;
    public boolean videoWasPlaying;
    private boolean waitingPaused;
    private long waitingTimeSince;
    private final ArrayList<TLRPC.TL_sponsoredMessage> ads = new ArrayList<>();
    private boolean first = true;
    private final Runnable showRunnable = new dac(this, (byte) 1);

    public static class CloseDrawable extends Drawable {
        private int alpha;
        private final long max_display_duration;
        private final long min_display_duration;
        private long minusTime;
        private final Paint paint;
        private final View parentView;
        private boolean paused;
        private long pausedTime;
        private final lm showCrossAnimated;
        private final lm showTimerAnimated;
        private final long startTime;
        private final gn timer;
        private final lm timerScaleAnimated;

        public CloseDrawable(View view, int i, int i2, long j) {
            gn gnVar = new gn(false, true, true);
            this.timer = gnVar;
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
            gnVar.setCallback(view);
            gnVar.b = 17;
            gnVar.w(gl.L(12.0f));
            gnVar.x(gl.n1("fonts/num.otf"));
            gnVar.N = gl.q.x;
            gnVar.u(-1);
            s33 s33Var = s33.h;
            this.showCrossAnimated = new lm(view, 0L, 420L, s33Var);
            this.showTimerAnimated = new lm(view, 0L, 420L, s33Var);
            this.timerScaleAnimated = new lm(view, 0L, 420L, s33Var);
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
            lm lmVar = this.timerScaleAnimated;
            if (valueOf.length() >= 3) {
                f = 0.825f;
            } else if (valueOf.length() >= 2) {
                f = 0.875f;
            } else {
                f = 1.0f;
            }
            float e = lmVar.e(false, f);
            canvas.save();
            canvas.scale(e, e, centerX, centerY);
            this.timer.t(valueOf, true, true);
            this.timer.o(centerX - 1.0f, centerY - 1.0f, centerX + 1.0f, centerY + 1.0f);
            gn gnVar = this.timer;
            gnVar.C = (int) (this.alpha * d);
            gnVar.draw(canvas);
            canvas.restore();
            this.paint.setAlpha((int) (this.alpha * d));
            this.paint.setStrokeWidth(gl.L(2.0f));
            RectF rectF = gl.P;
            rectF.set(centerX - gl.L(9.0f), centerY - gl.L(9.0f), gl.L(9.0f) + centerX, gl.L(9.0f) + centerY);
            canvas.drawArc(rectF, -90.0f, f2 * (-360.0f), false, this.paint);
            lm lmVar2 = this.showCrossAnimated;
            if ((1.0f - f2) * 360.0f > 75.0f) {
                z2 = true;
            }
            float d2 = lmVar2.d(z2);
            float R1 = gl.R1(centerX, gl.L(8.0f) + centerX, d);
            float R12 = gl.R1(centerY, centerY - gl.L(8.0f), d);
            float R13 = gl.R1(0.35f, 1.0f, d2) * gl.U1(d, gl.L(5.0f), gl.L(3.0f));
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
            return gl.L(24.0f);
        }

        @Override
        public int getIntrinsicWidth() {
            return gl.L(24.0f);
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

    private VideoAds(int i, long j, int i2, u21 u21Var, VideoAdsCache videoAdsCache) {
        this.lastTime = 0L;
        this.currentAccount = i;
        this.dialogId = j;
        this.msg_id = i2;
        this.cache = videoAdsCache;
        this.lastTime = System.currentTimeMillis();
        init(u21Var);
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

    private void init(u21 u21Var) {
        this.bulletinFactory = u21Var;
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
            na7.q1(this.currentAccount).b4(tL_messages_sponsoredMessages.users, false);
            na7.q1(this.currentAccount).V3(tL_messages_sponsoredMessages.chats, false);
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
        gl.c3(new l3c(this, tLObject, (byte) 9));
    }

    public static void lambda$show$10(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        gl.g(tL_sponsoredMessage.additional_info);
    }

    public void lambda$show$12(cs5 cs5Var) {
        if (y6c.h(this.currentAccount).p()) {
            cs5Var.u();
            m21 m21Var = this.bulletin;
            if (m21Var != null) {
                m21Var.i(true);
                this.bulletin.b();
            }
            this.bulletinFactory.c(k96.M0(2131754485, null)).j();
            na7.q1(this.currentAccount).l0(true);
            return;
        }
        showPremium();
    }

    public void lambda$show$14(Context context, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, cs5 cs5Var) {
        int i = this.currentAccount;
        long j = this.dialogId;
        u21 u21Var = this.bulletinFactory;
        e53 e53Var = new e53();
        dac dacVar = new dac(this, (byte) 0);
        Objects.requireNonNull(cs5Var);
        en1 en1Var = new en1(cs5Var, (byte) 11);
        int i2 = b89.v1;
        if (context == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = tL_sponsoredMessage.random_id;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_reportSponsoredMessage, new mz4(context, e53Var, j, bArr, en1Var, u21Var, dacVar, i));
    }

    public void lambda$show$15(cs5 cs5Var) {
        if (y6c.h(this.currentAccount).p()) {
            cs5Var.u();
            m21 m21Var = this.bulletin;
            if (m21Var != null) {
                m21Var.i(true);
                this.bulletin.b();
            }
            this.bulletinFactory.c(k96.M0(2131754485, null)).j();
            na7.q1(this.currentAccount).l0(true);
            return;
        }
        showPremium();
    }

    public void lambda$show$16(p8c p8cVar) {
        p8cVar.a(Boolean.FALSE);
        this.currentMenu = null;
        checkPopupShownCallback();
    }

    public void lambda$show$17(defpackage.m21 r22, final org.telegram.tgnet.TLRPC.TL_sponsoredMessage r23, android.content.Context r24, defpackage.wjb r25, org.telegram.messenger.video.VideoAds.AdLayout r26, defpackage.p8c r27, android.view.View r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.VideoAds.lambda$show$17(m21, org.telegram.tgnet.TLRPC$TL_sponsoredMessage, android.content.Context, wjb, org.telegram.messenger.video.VideoAds$AdLayout, p8c, android.view.View):void");
    }

    public void lambda$show$18(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        logSponsoredClicked(tL_sponsoredMessage);
        d01.s(view.getContext(), Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, na7.q1(y6c.t0).k4.A2.f, false, false);
    }

    public void lambda$show$2(CloseDrawable closeDrawable, View view) {
        if (closeDrawable.isCrossAvailable()) {
            m21 m21Var = this.bulletin;
            if (m21Var != null) {
                m21Var.b();
            }
        } else if (y6c.h(this.currentAccount).p()) {
            m21 m21Var2 = this.bulletin;
            if (m21Var2 != null) {
                m21Var2.b();
                this.bulletin = null;
            }
            na7.q1(this.currentAccount).l0(true);
            this.bulletinFactory.c(k96.M0(2131754485, null)).j();
        } else {
            showPremium();
        }
    }

    public void lambda$show$3(m21 m21Var, TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        m21 m21Var2 = this.bulletin;
        if (m21Var2 != null && m21Var2 == m21Var) {
            m21Var2.j = (tL_sponsoredMessage.max_display_duration - tL_sponsoredMessage.min_display_duration) * 1000;
            m21Var2.i(true);
        }
    }

    public void lambda$show$4(m21 m21Var, boolean[] zArr, CloseDrawable closeDrawable, long[] jArr, Runnable runnable, long[] jArr2, long j, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Boolean bool) {
        m21 m21Var2 = this.bulletin;
        if (m21Var2 != null && m21Var2 == m21Var && bool.booleanValue() != zArr[0]) {
            boolean booleanValue = bool.booleanValue();
            zArr[0] = booleanValue;
            closeDrawable.setPaused(booleanValue);
            if (zArr[0]) {
                this.bulletin.i(false);
                jArr[0] = System.currentTimeMillis();
                gl.r(runnable);
                return;
            }
            gl.r(runnable);
            jArr2[0] = (System.currentTimeMillis() - jArr[0]) + jArr2[0];
            long currentTimeMillis = (System.currentTimeMillis() - j) - jArr2[0];
            long j2 = (tL_sponsoredMessage.min_display_duration * 1000) - currentTimeMillis;
            long j3 = (tL_sponsoredMessage.max_display_duration * 1000) - currentTimeMillis;
            if (j3 <= 0) {
                m21 m21Var3 = this.bulletin;
                if (m21Var3 != null) {
                    m21Var3.b();
                    this.bulletin = null;
                }
            } else if (j2 <= 0) {
                m21 m21Var4 = this.bulletin;
                m21Var4.j = (int) j3;
                m21Var4.i(true);
            } else {
                gl.d3(runnable, j2);
            }
        }
    }

    public void lambda$show$5(m21 m21Var, boolean[] zArr) {
        m21 m21Var2 = this.bulletin;
        if (m21Var2 != null && m21Var2 == m21Var && !zArr[0]) {
            zArr[0] = true;
            cs5 cs5Var = this.currentMenu;
            if (cs5Var != null) {
                cs5Var.u();
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

    public void lambda$show$7(cs5 cs5Var, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Context context, View view) {
        cs5Var.u();
        logSponsoredClicked(tL_sponsoredMessage);
        d01.s(context, Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, na7.q1(this.currentAccount).k4.A2.f, false, false);
    }

    public static boolean lambda$show$8(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        gl.g(tL_sponsoredMessage.url);
        return true;
    }

    public static void lambda$show$9(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        gl.g(tL_sponsoredMessage.sponsor_info);
    }

    public void lambda$showPremium$19(jh8 jh8Var) {
        if (jh8Var == this.premiumSheet) {
            this.premiumSheet = null;
            checkPopupShownCallback();
        }
    }

    private void load() {
        if (!this.loading && !this.loaded) {
            if (!y6c.h(this.currentAccount).p() || !na7.q1(this.currentAccount).D2()) {
                this.loading = true;
                TLRPC.TL_messages_getSponsoredMessages tL_messages_getSponsoredMessages = new TLRPC.TL_messages_getSponsoredMessages();
                tL_messages_getSponsoredMessages.peer = na7.q1(this.currentAccount).h1(this.dialogId);
                tL_messages_getSponsoredMessages.flags |= 1;
                tL_messages_getSponsoredMessages.msg_id = this.msg_id;
                this.requestId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getSponsoredMessages, new wx9(this, (byte) 22));
            }
        }
    }

    public static VideoAds make(int i, long j, int i2, u21 u21Var) {
        VideoAdsLocation videoAdsLocation = new VideoAdsLocation(i, j);
        LruCache<VideoAdsLocation, VideoAdsCache> lruCache = cached;
        VideoAdsCache videoAdsCache = lruCache.get(videoAdsLocation);
        if (videoAdsCache == null || videoAdsCache.msgId != i2 || System.currentTimeMillis() - videoAdsCache.loadTime > 180000) {
            videoAdsCache = new VideoAdsCache(i2);
            lruCache.put(videoAdsLocation, videoAdsCache);
        }
        return new VideoAds(i, j, i2, u21Var, videoAdsCache);
    }

    private void schedule() {
        int i;
        gl.r(this.showRunnable);
        if (this.loaded && !this.ads.isEmpty()) {
            if (this.first) {
                i = this.start_delay;
            } else {
                i = this.between_delay;
            }
            gl.d3(this.showRunnable, Math.max(0L, (i * 1000) - (System.currentTimeMillis() - this.lastTime)));
        }
    }

    public void show() {
        if (this.ads.isEmpty()) {
            return;
        }
        final TLRPC.TL_sponsoredMessage tL_sponsoredMessage = this.ads.get(0);
        final long currentTimeMillis = System.currentTimeMillis() - this.currentBulletinPassedTime;
        this.bulletinShowTime = currentTimeMillis;
        m21 m21Var = this.bulletin;
        if (m21Var != null) {
            m21Var.b();
            this.bulletin = null;
        }
        Context X = this.bulletinFactory.X();
        wjb wjbVar = this.bulletinFactory.c;
        AdLayout adLayout = new AdLayout(X, wjbVar) {
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
        jia jiaVar = adLayout.titleTextView;
        Context X2 = this.bulletinFactory.X();
        int i = bkb.Ei;
        jiaVar.i(new AdOptionsDrawable(X2, bkb.v0(i, this.bulletinFactory.c)));
        adLayout.subtitleTextView.setText(tL_sponsoredMessage.message);
        TLRPC.MessageMedia messageMedia = tL_sponsoredMessage.media;
        if (messageMedia != null) {
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                adLayout.imageView.g(0, 0L, gl5.b(tL_sponsoredMessage.media.document), gl5.c(ba4.w(document.thumbs, 48, false, null, false), tL_sponsoredMessage.media.document), null, "48_48", "48_48", null);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w = ba4.w(photo.sizes, 48, true, null, true);
                    adLayout.imageView.g(0, 0L, gl5.i(w, tL_sponsoredMessage.media.photo), gl5.i(ba4.w(tL_sponsoredMessage.media.photo.sizes, 48, true, w, false), tL_sponsoredMessage.media.photo), null, "48_48", "48_48", null);
                }
            }
        } else {
            TLRPC.Photo photo2 = tL_sponsoredMessage.photo;
            if (photo2 != null) {
                TLRPC.PhotoSize w2 = ba4.w(photo2.sizes, 48, true, null, true);
                adLayout.imageView.g(0, 0L, gl5.i(w2, tL_sponsoredMessage.photo), gl5.i(ba4.w(tL_sponsoredMessage.photo.sizes, 48, true, w2, false), tL_sponsoredMessage.photo), null, "48_48", "48_48", null);
            } else {
                adLayout.hideImage();
            }
        }
        final CloseDrawable closeDrawable = new CloseDrawable(adLayout.buttonView, tL_sponsoredMessage.min_display_duration, tL_sponsoredMessage.max_display_duration, this.currentBulletinPassedTime);
        closeDrawable.setColor(bkb.v0(i, this.bulletinFactory.c));
        adLayout.buttonView.setImageDrawable(closeDrawable);
        adLayout.buttonView.setOnClickListener(new vzb(this, closeDrawable, (byte) 8));
        final m21 b = this.bulletinFactory.b(adLayout, tL_sponsoredMessage.max_display_duration * 1000);
        this.bulletin = b;
        b.u = false;
        b.i(false);
        final r1b r1bVar = new r1b(this, b, tL_sponsoredMessage, (byte) 26);
        final long[] jArr = new long[1];
        final long[] jArr2 = new long[1];
        final boolean[] zArr = new boolean[1];
        p8c p8cVar = new p8c() {
            @Override
            public final void a(Object obj) {
                VideoAds.this.lambda$show$4(b, zArr, closeDrawable, jArr2, r1bVar, jArr, currentTimeMillis, tL_sponsoredMessage, (Boolean) obj);
            }
        };
        gl.d3(r1bVar, tL_sponsoredMessage.min_display_duration * 1000);
        m21 m21Var2 = this.bulletin;
        m21Var2.r = false;
        m21Var2.v = new r1b(this, b, new boolean[1], (byte) 27);
        adLayout.titleTextView.setRightDrawableOnClick(new y35(this, b, tL_sponsoredMessage, X, wjbVar, adLayout, p8cVar, (byte) 1));
        m21 m21Var3 = this.bulletin;
        vzb vzbVar = new vzb(this, tL_sponsoredMessage, (byte) 9);
        q11 q11Var = m21Var3.e;
        if (q11Var != null) {
            q11Var.setOnClickListener(vzbVar);
        }
        this.bulletin.j();
        logSponsoredShown(tL_sponsoredMessage);
    }

    public void showPremium() {
        jh8 jh8Var = this.premiumSheet;
        if (jh8Var != null) {
            jh8Var.dismiss();
            this.premiumSheet = null;
        }
        jh8 jh8Var2 = new jh8(new d() {
            {
                VideoAds.this = this;
            }

            @Override
            public Context getContext() {
                return gl.W(LaunchActivity.H1);
            }

            @Override
            public int getCurrentAccount() {
                return VideoAds.this.currentAccount;
            }

            @Override
            public Activity getParentActivity() {
                Activity W = gl.W(org.telegram.messenger.a.b);
                if (W == null) {
                    return LaunchActivity.H1;
                }
                return W;
            }
        }, 3, true);
        this.premiumSheet = jh8Var2;
        jh8Var2.n(new l3c(this, jh8Var2, (byte) 8));
        jh8Var2.show();
        checkPopupShownCallback();
    }

    public boolean isPopupShown() {
        cs5 cs5Var = this.currentMenu;
        if (cs5Var == null || !cs5Var.E()) {
            jh8 jh8Var = this.premiumSheet;
            if (jh8Var != null && !jh8Var.J) {
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
        boolean z = w01.a;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_clickSponsoredMessage, null);
    }

    public void logSponsoredShown(TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        if (tL_sponsoredMessage == null) {
            return;
        }
        TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
        tL_messages_viewSponsoredMessage.random_id = tL_sponsoredMessage.random_id;
        boolean z = w01.a;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_viewSponsoredMessage, null);
    }

    public void setPauseOnPopupCallback(Runnable runnable) {
        this.onPopupCallback = runnable;
    }

    public void setWaitingPaused(boolean z) {
        if (this.waitingPaused != z) {
            this.waitingPaused = z;
            gl.r(this.showRunnable);
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
        cs5 cs5Var = this.currentMenu;
        if (cs5Var != null) {
            cs5Var.u();
            this.currentMenu = null;
        }
        this.bulletin = null;
        if (this.loading) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.requestId, true);
            this.requestId = 0;
            this.loading = false;
        }
        gl.r(this.showRunnable);
        setWaitingPaused(true);
    }

    public static class AdLayout extends h11 {
        public final ImageView buttonView;
        public final be0 imageView;
        private final LinearLayout linearLayout;
        public final l46 subtitleTextView;
        public final jia titleTextView;

        public AdLayout(Context context, wjb wjbVar) {
            super(context, wjbVar);
            setBackground(getThemedColor(bkb.vj));
            be0 be0Var = new be0(context);
            this.imageView = be0Var;
            be0Var.setRoundRadius(gl.L(48.0f));
            addView(be0Var, nme.i(36.0f, 36.0f, 8388627, 9.0f, 0.0f, 0.0f, 0.0f));
            int i = bkb.xj;
            getThemedColor(i);
            int i2 = bkb.wj;
            getThemedColor(i2);
            LinearLayout linearLayout = new LinearLayout(context);
            this.linearLayout = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, nme.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 54.0f, 8.0f));
            jia jiaVar = new jia(context);
            this.titleTextView = jiaVar;
            jiaVar.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
            zkb.W(jiaVar, i, wjbVar);
            jiaVar.setTextSize(14);
            jiaVar.setTypeface(gl.o());
            linearLayout.addView(jiaVar);
            l46 l46Var = new l46(context, null);
            this.subtitleTextView = l46Var;
            l46Var.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
            zkb.X(l46Var, i, wjbVar);
            zkb.G(l46Var, i2, wjbVar);
            l46Var.setTypeface(Typeface.SANS_SERIF);
            l46Var.setTextSize(1, 13.0f);
            linearLayout.addView(l46Var);
            ImageView imageView = new ImageView(context);
            this.buttonView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i3 = bkb.Ei;
            ff0 f0 = bkb.f0(bkb.p1(0.15f, getThemedColor(i3)), 7, -1);
            vkb K = zkb.K(0.15f, i3);
            imageView.setBackground(f0);
            zkb.j(imageView, f0, null, K, wjbVar);
            addView(imageView, nme.i(32.0f, 32.0f, 8388629, 0.0f, 0.0f, 11.0f, 0.0f));
        }

        @Override
        public CharSequence getAccessibilityText() {
            return ((Object) this.titleTextView.getText()) + ".\n" + ((Object) this.subtitleTextView.getText());
        }

        public void hideImage() {
            this.imageView.setVisibility(8);
            this.linearLayout.setLayoutParams(nme.i(-2.0f, -2.0f, 8388627, 10.0f, 8.0f, 54.0f, 8.0f));
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
        public final tgb text = new tgb(k96.M0(2131745021, null), 11.0f, gl.o());
        private float alpha = 1.0f;

        public AdOptionsDrawable(Context context, int i) {
            this.color = i;
            Drawable d = b00.d(context, 2131231247);
            this.icon = d;
            d.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }

        @Override
        public void draw(Canvas canvas) {
            RectF rectF = gl.P;
            rectF.set(getBounds());
            rectF.left += gl.L(4.0f);
            this.backgroundPaint.setColor(bkb.p1(this.alpha * 0.2f, this.color));
            canvas.drawRoundRect(rectF, rectF.height(), rectF.height(), this.backgroundPaint);
            this.text.c(rectF.left + gl.L(5.0f), rectF.centerY(), this.alpha, this.color, canvas);
            this.icon.setBounds(getBounds().right - gl.L(12.99f), getBounds().centerY() - gl.L(5.665f), getBounds().right - gl.L(1.66f), gl.L(5.665f) + getBounds().centerY());
            this.icon.setAlpha((int) (this.alpha * 255.0f));
            this.icon.draw(canvas);
        }

        @Override
        public int getIntrinsicHeight() {
            return gl.L(16.0f);
        }

        @Override
        public int getIntrinsicWidth() {
            return (int) (this.text.j() + gl.L(4.0f) + gl.L(18.0f));
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
