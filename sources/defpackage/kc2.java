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
public final class kc2 implements gk7 {
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
    public hq1 Z;
    public int a;
    public long a0;
    public int b;
    public jq1 b0;
    public int c;
    public boolean c0;
    public float d;
    public final jx2 d0;
    public final Paint e;
    public final int[] e0;
    public final TextPaint f;
    public final int f0;
    public final int g0;
    public final TextPaint h;
    public final int h0;
    public final long i0;
    public final long j0;
    public final wjb k0;
    public vl l0;
    public lm4 m0;
    public final Paint n;
    public int n0;
    public int o0;
    public final Path r;
    public StaticLayout s;
    public StaticLayout w;
    public StaticLayout x;
    public int y;

    public kc2(int i, View view, long j, int i2, int i3, long j2, wjb wjbVar) {
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
        jx2 jx2Var = new jx2(null, true, null);
        this.d0 = jx2Var;
        this.e0 = new int[3];
        this.U = view;
        this.f0 = i;
        this.j0 = j;
        this.g0 = i2;
        this.h0 = i3;
        this.i0 = j2;
        this.Y = na7.q1(i).r2(j);
        this.k0 = wjbVar;
        this.G = new ImageReceiver(view);
        paint.setStrokeWidth(gl.N(2.8f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        jx2Var.z = 3;
        jx2Var.H = (byte) 1;
        jx2Var.g = true;
        jx2Var.d = d("paintChatActionBackground");
        jx2Var.e = textPaint;
        textPaint.setTextSize(gl.L(13.0f));
        textPaint.setTypeface(gl.o());
        textPaint2.setTextSize(gl.L(14.0f));
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static TLRPC.Dialog c(long j, int i, int i2, boolean z, int[] iArr) {
        ArrayList U0;
        TLRPC.Dialog c;
        TLRPC.Dialog c2;
        na7 q1 = na7.q1(j5.a(y6c.t0).a);
        SparseArray sparseArray = q1.w;
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i;
            iArr[2] = i2;
        }
        if (i2 != 0) {
            t97 t97Var = (t97) q1.J0.get(i2);
            if (t97Var != null) {
                U0 = t97Var.k;
            } else {
                return null;
            }
        } else {
            U0 = q1.U0(i);
        }
        for (int i3 = 0; i3 < U0.size(); i3++) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) U0.get(i3);
            TLRPC.Chat K0 = q1.K0(Long.valueOf(-dialog.id));
            if (K0 != null && dialog.id != j && dialog.unread_count > 0 && cf3.x(dialog) && !K0.megagroup && !q1.B2(dialog.id, false) && q1.C1(K0.restriction_reason) == null) {
                return dialog;
            }
        }
        if (z) {
            if (i2 != 0) {
                for (int i4 = 0; i4 < q1.G0.size(); i4++) {
                    int i5 = ((t97) q1.G0.get(i4)).a;
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

    public final void a(android.graphics.Canvas r43, defpackage.jq1 r44, float r45, float r46) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kc2.a(android.graphics.Canvas, jq1, float, float):void");
    }

    public final void b(Canvas canvas, int i, int i2) {
        int v0 = bkb.v0(bkb.Nl, this.k0);
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
                float height = ((((i2 - i) - this.w.getHeight()) / 2.0f) + i) - (gl.L(10.0f) * this.L);
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
                float L = ((1.0f - this.L) * gl.L(10.0f)) + (((i2 - i) - this.x.getHeight()) / 2.0f) + i;
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
        wjb wjbVar = this.k0;
        if (wjbVar != null) {
            paint = wjbVar.d(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return bkb.T0(str);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.Dialog dialog;
        if (this.a0 != 0 && (dialog = (TLRPC.Dialog) na7.q1(this.f0).R.f(this.a0)) != null) {
            int i3 = dialog.unread_count;
            boolean z = true;
            this.d0.c(i3, true);
            if (i3 <= 0) {
                z = false;
            }
            this.c0 = z;
            jq1 jq1Var = this.b0;
            if (jq1Var != null) {
                jq1Var.invalidate();
            }
        }
    }

    public final void e(boolean z, final jq1 jq1Var) {
        AnimatorSet animatorSet = this.K;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.K.cancel();
        }
        float f = this.L;
        if (z) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final kc2 b;

                {
                    this.b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    byte b = r3;
                    jq1 jq1Var2 = jq1Var;
                    kc2 kc2Var = this.b;
                    switch (b) {
                        case 0:
                            kc2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            jq1Var2.invalidate();
                            kc2Var.U.invalidate();
                            return;
                        case 1:
                            kc2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            jq1Var2.invalidate();
                            return;
                        case 2:
                            kc2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            jq1Var2.invalidate();
                            return;
                        case 3:
                            kc2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            jq1Var2.invalidate();
                            return;
                        default:
                            kc2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            kc2Var.U.invalidate();
                            jq1Var2.invalidate();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(s33.h);
            ofFloat.setDuration(250L);
            this.M = 0.0f;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final kc2 b;

                {
                    this.b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    byte b = r3;
                    jq1 jq1Var2 = jq1Var;
                    kc2 kc2Var = this.b;
                    switch (b) {
                        case 0:
                            kc2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            jq1Var2.invalidate();
                            kc2Var.U.invalidate();
                            return;
                        case 1:
                            kc2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            jq1Var2.invalidate();
                            return;
                        case 2:
                            kc2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            jq1Var2.invalidate();
                            return;
                        case 3:
                            kc2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            jq1Var2.invalidate();
                            return;
                        default:
                            kc2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            kc2Var.U.invalidate();
                            jq1Var2.invalidate();
                            return;
                    }
                }
            });
            s33 s33Var = s33.j;
            ofFloat2.setInterpolator(s33Var);
            ofFloat2.setDuration(180L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, -0.5f);
            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final kc2 b;

                {
                    this.b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    byte b = r3;
                    jq1 jq1Var2 = jq1Var;
                    kc2 kc2Var = this.b;
                    switch (b) {
                        case 0:
                            kc2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            jq1Var2.invalidate();
                            kc2Var.U.invalidate();
                            return;
                        case 1:
                            kc2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            jq1Var2.invalidate();
                            return;
                        case 2:
                            kc2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            jq1Var2.invalidate();
                            return;
                        case 3:
                            kc2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            jq1Var2.invalidate();
                            return;
                        default:
                            kc2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            kc2Var.U.invalidate();
                            jq1Var2.invalidate();
                            return;
                    }
                }
            });
            ofFloat3.setInterpolator(s33Var);
            ofFloat3.setDuration(120L);
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(-0.5f, 0.0f);
            ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final kc2 b;

                {
                    this.b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    byte b = r3;
                    jq1 jq1Var2 = jq1Var;
                    kc2 kc2Var = this.b;
                    switch (b) {
                        case 0:
                            kc2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            jq1Var2.invalidate();
                            kc2Var.U.invalidate();
                            return;
                        case 1:
                            kc2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            jq1Var2.invalidate();
                            return;
                        case 2:
                            kc2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            jq1Var2.invalidate();
                            return;
                        case 3:
                            kc2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            jq1Var2.invalidate();
                            return;
                        default:
                            kc2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            kc2Var.U.invalidate();
                            jq1Var2.invalidate();
                            return;
                    }
                }
            });
            ofFloat4.setInterpolator(s33Var);
            ofFloat4.setDuration(100L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.K = animatorSet2;
            animatorSet2.addListener(new u5(this, jq1Var, (byte) 15));
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playSequentially(ofFloat2, ofFloat3, ofFloat4);
            this.K.playTogether(ofFloat, animatorSet3);
            this.K.start();
            return;
        }
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(f, 0.0f);
        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final kc2 b;

            {
                this.b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b = r3;
                jq1 jq1Var2 = jq1Var;
                kc2 kc2Var = this.b;
                switch (b) {
                    case 0:
                        kc2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        jq1Var2.invalidate();
                        kc2Var.U.invalidate();
                        return;
                    case 1:
                        kc2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        jq1Var2.invalidate();
                        return;
                    case 2:
                        kc2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        jq1Var2.invalidate();
                        return;
                    case 3:
                        kc2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        jq1Var2.invalidate();
                        return;
                    default:
                        kc2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        kc2Var.U.invalidate();
                        jq1Var2.invalidate();
                        return;
                }
            }
        });
        ofFloat5.setInterpolator(s33.f);
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
            TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-c.id));
            this.H = K0;
            if (K0 == null) {
                this.H = na7.q1(i).K0(Long.valueOf(c.id));
            }
            pb0 pb0Var = new pb0((wjb) null);
            pb0Var.p(this.H);
            this.G.d0(gl5.a(1, this.H), "50_50", pb0Var, null, y6c.h(0).f(), 0);
            na7.q1(i).p0(c.id, 0, null);
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
        pb0 pb0Var = new pb0((wjb) null);
        pb0Var.p(this.H);
        this.G.d0(gl5.a(1, this.H), "50_50", pb0Var, null, y6c.h(0).f(), 0);
        int i2 = this.f0;
        na7.q1(i2).p0(-chat.id, 0, null);
        TLRPC.Dialog Q0 = na7.q1(i2).Q0(-chat.id);
        if (Q0 == null) {
            i = 0;
        } else {
            i = Q0.unread_count;
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
        vl vlVar;
        jq1 jq1Var;
        jq1 jq1Var2;
        vl vlVar2;
        TLRPC.Message message;
        TLRPC.Message message2;
        boolean z = false;
        this.W = false;
        this.X = false;
        lm4 lm4Var = null;
        this.H = null;
        this.a0 = 0L;
        ImageReceiver imageReceiver = this.G;
        imageReceiver.f();
        int i = this.f0;
        ArrayList l = na7.q1(i).g4.l(-this.j0);
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
            wjb wjbVar = this.k0;
            if (i3 == 1) {
                jq1 jq1Var3 = this.b0;
                if (jq1Var3 != null && (vlVar2 = this.l0) != null) {
                    vlVar2.o(jq1Var3);
                }
                this.l0 = null;
                Context context = this.U.getContext();
                int i4 = bkb.qd;
                lm4 d = mm4.d(context, 1.0f, bkb.v0(i4, wjbVar), true);
                if (d != null) {
                    lm4Var = d;
                }
                this.m0 = lm4Var;
                this.n0 = bkb.v0(i4, wjbVar);
                imageReceiver.g0(d);
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                vl vlVar3 = this.l0;
                if (vlVar3 == null || vlVar3.h() != tL_forumTopic.icon_emoji_id) {
                    vl vlVar4 = this.l0;
                    if (vlVar4 != null && (jq1Var = this.b0) != null) {
                        vlVar4.o(jq1Var);
                    }
                    vl vlVar5 = new vl(22, i, tL_forumTopic.icon_emoji_id);
                    this.l0 = vlVar5;
                    int v0 = bkb.v0(bkb.Yc, wjbVar);
                    this.o0 = v0;
                    vlVar5.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
                }
                vl vlVar6 = this.l0;
                if (vlVar6 != null && (jq1Var2 = this.b0) != null) {
                    vlVar6.b(jq1Var2);
                }
                imageReceiver.g0(null);
            } else {
                jq1 jq1Var4 = this.b0;
                if (jq1Var4 != null && (vlVar = this.l0) != null) {
                    vlVar.o(jq1Var4);
                }
                this.l0 = null;
                imageReceiver.g0(mm4.f(tL_forumTopic));
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
