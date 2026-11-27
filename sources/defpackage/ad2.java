package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class ad2 implements fn7 {
    public int E;
    public int F;
    public final ImageReceiver G;
    public TLRPC.Chat H;
    public TLRPC.TL_forumTopic I;
    public long J;
    public AnimatorSet K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public float P;
    public long Q;
    public float R;
    public boolean S;
    public float T;
    public final View U;
    public long V;
    public boolean W;
    public boolean X;
    public final boolean Y;
    public go1 Z;
    public int a;
    public long a0;
    public int b;
    public wq1 b0;
    public int c;
    public boolean c0;
    public float d;
    public final dy2 d0;
    public final Paint e;
    public final int[] e0;
    public final TextPaint f;
    public final int f0;
    public final int g0;
    public final TextPaint h;
    public final int h0;
    public final long i0;
    public final long j0;
    public final vnb k0;
    public wl l0;
    public qo4 m0;
    public final Paint n;
    public int n0;
    public int o0;
    public final Path r;
    public StaticLayout s;
    public StaticLayout w;
    public StaticLayout x;
    public int y;

    public ad2(int i, View view, long j, int i2, int i3, long j2, vnb vnbVar) {
        Paint paint = new Paint(1);
        this.e = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.h = textPaint2;
        Paint paint2 = new Paint(1);
        this.n = paint2;
        this.r = new Path();
        this.J = 0L;
        this.c0 = true;
        dy2 dy2Var = new dy2(null, true, null);
        this.d0 = dy2Var;
        this.e0 = new int[3];
        this.U = view;
        this.f0 = i;
        this.j0 = j;
        this.g0 = i2;
        this.h0 = i3;
        this.i0 = j2;
        this.Y = uc7.s1(i).v2(j);
        this.k0 = vnbVar;
        this.G = new ImageReceiver(view);
        paint.setStrokeWidth(hl.N(2.8f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        dy2Var.z = 3;
        dy2Var.H = (byte) 1;
        dy2Var.g = true;
        dy2Var.d = d("paintChatActionBackground");
        dy2Var.e = textPaint;
        textPaint.setTextSize(hl.L(13.0f));
        textPaint.setTypeface(hl.o());
        textPaint2.setTextSize(hl.L(14.0f));
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static TLRPC.Dialog c(long j, int i, int i2, boolean z, int[] iArr) {
        ArrayList W0;
        TLRPC.Dialog c;
        TLRPC.Dialog c2;
        uc7 s1 = uc7.s1(k5.a(yac.t0).a);
        SparseArray sparseArray = s1.w;
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i;
            iArr[2] = i2;
        }
        if (i2 != 0) {
            ac7 ac7Var = (ac7) s1.J0.get(i2);
            if (ac7Var != null) {
                W0 = ac7Var.k;
            } else {
                return null;
            }
        } else {
            W0 = s1.W0(i);
        }
        for (int i3 = 0; i3 < W0.size(); i3++) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) W0.get(i3);
            TLRPC.Chat M0 = s1.M0(Long.valueOf(-dialog.id));
            if (M0 != null && dialog.id != j && dialog.unread_count > 0 && wf3.x(dialog) && !M0.megagroup && !s1.G2(dialog.id, false) && s1.E1(M0.restriction_reason) == null) {
                return dialog;
            }
        }
        if (z) {
            if (i2 != 0) {
                for (int i4 = 0; i4 < s1.G0.size(); i4++) {
                    int i5 = ((ac7) s1.G0.get(i4)).a;
                    if (i2 != i5 && (c2 = c(j, i, i5, false, iArr)) != null) {
                        if (iArr != null) {
                            iArr[0] = 1;
                        }
                        return c2;
                    }
                }
            }
            for (int i6 = 0; i6 < sparseArray.size(); i6++) {
                int keyAt = sparseArray.keyAt(i6);
                if (i != keyAt && (c = c(j, keyAt, 0, false, iArr)) != null) {
                    if (iArr != null) {
                        iArr[0] = 1;
                    }
                    return c;
                }
            }
            return null;
        }
        return null;
    }

    public final void a(android.graphics.Canvas r43, defpackage.wq1 r44, float r45, float r46) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ad2.a(android.graphics.Canvas, wq1, float, float):void");
    }

    public final void b(Canvas canvas, int i, int i2) {
        int v0 = aob.v0(aob.Ol, this.k0);
        TextPaint textPaint = this.h;
        textPaint.setColor(v0);
        Paint d = d("paintChatComposeBackground");
        int alpha = d.getAlpha();
        int alpha2 = textPaint.getAlpha();
        d.setAlpha((int) (alpha * this.T));
        if (this.w != null) {
            float f = this.L;
            if (f < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f) * alpha2 * this.T));
                float height = ((((i2 - i) - this.w.getHeight()) / 2.0f) + i) - (hl.L(10.0f) * this.L);
                canvas.save();
                canvas.translate((this.c - this.E) / 2.0f, height);
                this.w.draw(canvas);
                canvas.restore();
            }
        }
        if (this.x != null) {
            float f2 = this.L;
            if (f2 > 0.0f) {
                textPaint.setAlpha((int) (alpha2 * f2 * this.T));
                float L = ((1.0f - this.L) * hl.L(10.0f)) + (((i2 - i) - this.x.getHeight()) / 2.0f) + i;
                canvas.save();
                canvas.translate((this.c - this.F) / 2.0f, L);
                this.x.draw(canvas);
                canvas.restore();
            }
        }
        textPaint.setAlpha(alpha2);
        d.setAlpha(alpha);
    }

    public final Paint d(String str) {
        Paint paint;
        vnb vnbVar = this.k0;
        if (vnbVar != null) {
            paint = vnbVar.d(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return aob.T0(str);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.Dialog dialog;
        if (this.a0 != 0 && (dialog = (TLRPC.Dialog) uc7.s1(this.f0).R.f(this.a0)) != null) {
            int i3 = dialog.unread_count;
            boolean z = true;
            this.d0.c(i3, true);
            if (i3 <= 0) {
                z = false;
            }
            this.c0 = z;
            wq1 wq1Var = this.b0;
            if (wq1Var != null) {
                wq1Var.invalidate();
            }
        }
    }

    public final void e(boolean z, final wq1 wq1Var) {
        AnimatorSet animatorSet = this.K;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.K.cancel();
        }
        float f = this.L;
        if (z) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final ad2 b;

                {
                    this.b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    byte b = r3;
                    wq1 wq1Var2 = wq1Var;
                    ad2 ad2Var = this.b;
                    switch (b) {
                        case 0:
                            ad2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            wq1Var2.invalidate();
                            ad2Var.U.invalidate();
                            return;
                        case 1:
                            ad2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            wq1Var2.invalidate();
                            return;
                        case 2:
                            ad2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            wq1Var2.invalidate();
                            return;
                        case 3:
                            ad2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            wq1Var2.invalidate();
                            return;
                        default:
                            ad2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ad2Var.U.invalidate();
                            wq1Var2.invalidate();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(k43.h);
            ofFloat.setDuration(250L);
            this.M = 0.0f;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final ad2 b;

                {
                    this.b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    byte b = r3;
                    wq1 wq1Var2 = wq1Var;
                    ad2 ad2Var = this.b;
                    switch (b) {
                        case 0:
                            ad2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            wq1Var2.invalidate();
                            ad2Var.U.invalidate();
                            return;
                        case 1:
                            ad2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            wq1Var2.invalidate();
                            return;
                        case 2:
                            ad2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            wq1Var2.invalidate();
                            return;
                        case 3:
                            ad2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            wq1Var2.invalidate();
                            return;
                        default:
                            ad2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ad2Var.U.invalidate();
                            wq1Var2.invalidate();
                            return;
                    }
                }
            });
            k43 k43Var = k43.j;
            ofFloat2.setInterpolator(k43Var);
            ofFloat2.setDuration(180L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, -0.5f);
            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final ad2 b;

                {
                    this.b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    byte b = r3;
                    wq1 wq1Var2 = wq1Var;
                    ad2 ad2Var = this.b;
                    switch (b) {
                        case 0:
                            ad2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            wq1Var2.invalidate();
                            ad2Var.U.invalidate();
                            return;
                        case 1:
                            ad2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            wq1Var2.invalidate();
                            return;
                        case 2:
                            ad2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            wq1Var2.invalidate();
                            return;
                        case 3:
                            ad2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            wq1Var2.invalidate();
                            return;
                        default:
                            ad2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ad2Var.U.invalidate();
                            wq1Var2.invalidate();
                            return;
                    }
                }
            });
            ofFloat3.setInterpolator(k43Var);
            ofFloat3.setDuration(120L);
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(-0.5f, 0.0f);
            ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final ad2 b;

                {
                    this.b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    byte b = r3;
                    wq1 wq1Var2 = wq1Var;
                    ad2 ad2Var = this.b;
                    switch (b) {
                        case 0:
                            ad2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            wq1Var2.invalidate();
                            ad2Var.U.invalidate();
                            return;
                        case 1:
                            ad2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            wq1Var2.invalidate();
                            return;
                        case 2:
                            ad2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            wq1Var2.invalidate();
                            return;
                        case 3:
                            ad2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            wq1Var2.invalidate();
                            return;
                        default:
                            ad2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ad2Var.U.invalidate();
                            wq1Var2.invalidate();
                            return;
                    }
                }
            });
            ofFloat4.setInterpolator(k43Var);
            ofFloat4.setDuration(100L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.K = animatorSet2;
            animatorSet2.addListener(new v5(this, wq1Var, (byte) 15));
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playSequentially(ofFloat2, ofFloat3, ofFloat4);
            this.K.playTogether(ofFloat, animatorSet3);
            this.K.start();
            return;
        }
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(f, 0.0f);
        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final ad2 b;

            {
                this.b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b = r3;
                wq1 wq1Var2 = wq1Var;
                ad2 ad2Var = this.b;
                switch (b) {
                    case 0:
                        ad2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        wq1Var2.invalidate();
                        ad2Var.U.invalidate();
                        return;
                    case 1:
                        ad2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        wq1Var2.invalidate();
                        return;
                    case 2:
                        ad2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        wq1Var2.invalidate();
                        return;
                    case 3:
                        ad2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        wq1Var2.invalidate();
                        return;
                    default:
                        ad2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        ad2Var.U.invalidate();
                        wq1Var2.invalidate();
                        return;
                }
            }
        });
        ofFloat5.setInterpolator(k43.f);
        ofFloat5.setDuration(220L);
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.K = animatorSet4;
        animatorSet4.playTogether(ofFloat5);
        this.K.start();
    }

    public final void f() {
        boolean z;
        boolean z2 = false;
        this.W = false;
        this.I = null;
        TLRPC.Dialog c = c(this.j0, this.g0, this.h0, true, this.e0);
        if (c != null) {
            this.a0 = c.id;
            int[] iArr = this.e0;
            if (iArr[0] == 1) {
                z = true;
            } else {
                z = false;
            }
            this.X = z;
            this.a = iArr[1];
            this.b = iArr[2];
            this.S = false;
            int i = this.f0;
            TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-c.id));
            this.H = M0;
            if (M0 == null) {
                this.H = uc7.s1(i).M0(Long.valueOf(c.id));
            }
            rb0 rb0Var = new rb0((vnb) null);
            rb0Var.p(this.H);
            this.G.d0(jn5.a(1, this.H), "50_50", rb0Var, null, yac.h(0).f(), 0);
            uc7.s1(i).r0(c.id, 0, null);
            int i2 = c.unread_count;
            this.d0.c(i2, false);
            if (i2 > 0) {
                z2 = true;
            }
            this.c0 = z2;
            return;
        }
        this.H = null;
        this.X = false;
        this.S = true;
    }

    public final void g(TLRPC.Chat chat) {
        boolean z;
        int i;
        if (chat == null) {
            f();
            return;
        }
        this.a0 = -chat.id;
        int[] iArr = this.e0;
        boolean z2 = false;
        if (iArr[0] == 1) {
            z = true;
        } else {
            z = false;
        }
        this.X = z;
        this.a = iArr[1];
        this.b = iArr[2];
        this.S = false;
        this.H = chat;
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.p(this.H);
        this.G.d0(jn5.a(1, this.H), "50_50", rb0Var, null, yac.h(0).f(), 0);
        int i2 = this.f0;
        uc7.s1(i2).r0(-chat.id, 0, null);
        TLRPC.Dialog S0 = uc7.s1(i2).S0(-chat.id);
        if (S0 == null) {
            i = 0;
        } else {
            i = S0.unread_count;
        }
        this.d0.c(i, false);
        if (i > 0) {
            z2 = true;
        }
        this.c0 = z2;
        this.W = true;
        this.I = null;
    }

    public final void h() {
        TLRPC.TL_forumTopic tL_forumTopic;
        wl wlVar;
        wq1 wq1Var;
        wq1 wq1Var2;
        wl wlVar2;
        TLRPC.Message message;
        TLRPC.Message message2;
        boolean z = false;
        this.W = false;
        this.X = false;
        qo4 qo4Var = null;
        this.H = null;
        this.a0 = 0L;
        ImageReceiver imageReceiver = this.G;
        imageReceiver.f();
        int i = this.f0;
        ArrayList l = uc7.s1(i).g4.l(-this.j0);
        if (l != null && l.size() > 1) {
            tL_forumTopic = null;
            for (int i2 = 0; i2 < l.size(); i2++) {
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) l.get(i2);
                if (tL_forumTopic2.id != this.i0 && !tL_forumTopic2.hidden && tL_forumTopic2.unread_count > 0 && (tL_forumTopic == null || ((message = tL_forumTopic2.topMessage) != null && (message2 = tL_forumTopic.topMessage) != null && message.date > message2.date))) {
                    tL_forumTopic = tL_forumTopic2;
                }
            }
        } else {
            tL_forumTopic = null;
        }
        if (tL_forumTopic != null) {
            this.S = false;
            this.I = tL_forumTopic;
            int i3 = tL_forumTopic.id;
            vnb vnbVar = this.k0;
            if (i3 == 1) {
                wq1 wq1Var3 = this.b0;
                if (wq1Var3 != null && (wlVar2 = this.l0) != null) {
                    wlVar2.o(wq1Var3);
                }
                this.l0 = null;
                Context context = this.U.getContext();
                int i4 = aob.rd;
                qo4 d = ro4.d(context, 1.0f, aob.v0(i4, vnbVar), true);
                if (d != null) {
                    qo4Var = d;
                }
                this.m0 = qo4Var;
                this.n0 = aob.v0(i4, vnbVar);
                imageReceiver.g0(d);
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                wl wlVar3 = this.l0;
                if (wlVar3 == null || wlVar3.h() != tL_forumTopic.icon_emoji_id) {
                    wl wlVar4 = this.l0;
                    if (wlVar4 != null && (wq1Var = this.b0) != null) {
                        wlVar4.o(wq1Var);
                    }
                    wl wlVar5 = new wl(22, i, tL_forumTopic.icon_emoji_id);
                    this.l0 = wlVar5;
                    int v0 = aob.v0(aob.Zc, vnbVar);
                    this.o0 = v0;
                    wlVar5.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
                }
                wl wlVar6 = this.l0;
                if (wlVar6 != null && (wq1Var2 = this.b0) != null) {
                    wlVar6.b(wq1Var2);
                }
                imageReceiver.g0(null);
            } else {
                wq1 wq1Var4 = this.b0;
                if (wq1Var4 != null && (wlVar = this.l0) != null) {
                    wlVar.o(wq1Var4);
                }
                this.l0 = null;
                imageReceiver.g0(ro4.f(tL_forumTopic));
            }
            int i5 = tL_forumTopic.unread_count;
            this.d0.c(i5, false);
            if (i5 > 0) {
                z = true;
            }
            this.c0 = z;
            return;
        }
        this.I = null;
        this.S = true;
    }
}
