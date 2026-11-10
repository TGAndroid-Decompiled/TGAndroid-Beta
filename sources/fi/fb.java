package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.wq;
public final class fb extends View {
    public final Paint A0;
    public final Paint B0;
    public final Paint C0;
    public final Path D;
    public final Paint D0;
    public boolean E;
    public final TextPaint E0;
    public String F;
    public final RectF F0;
    public boolean G;
    public final Path G0;
    public long H;
    public final Paint H0;
    public long I;
    public final eb I0;
    public float J;
    public final Paint J0;
    public float K;
    public final Drawable K0;
    public float L;
    public final TextPaint L0;
    public db M;
    public StaticLayout M0;
    public boolean N;
    public float N0;
    public String O;
    public float O0;
    public boolean P;
    public final TextPaint P0;
    public long Q;
    public StaticLayout Q0;
    public long R;
    public float R0;
    public float S;
    public float S0;
    public float T;
    public final LinearGradient T0;
    public boolean U;
    public final Matrix U0;
    public float V;
    public final Paint V0;
    public boolean W;
    public final wk0 W0;
    public boolean X0;
    public final bi.u0 Y0;
    public long Z0;
    public za f11997a;
    public ya f11998a0;
    public long f11999a1;
    public Runnable f12000b;
    public int f12001b0;
    public final org.telegram.ui.Components.v5 f12002b1;
    public int f12003c;
    public final org.telegram.ui.Components.v5 f12004c0;
    public long f12005c1;
    public Runnable d;
    public final org.telegram.ui.Components.v5 f12006d0;
    public bi.r3 f12007d1;
    public long f12008e;
    public final org.telegram.ui.Components.v5 f12009e0;
    public long f12010e1;
    public long f12011f;
    public final org.telegram.ui.Components.v5 f12012f0;
    public long f12013f1;
    public final org.telegram.ui.Components.v5 f12014g0;
    public float f12015g1;
    public ab h;
    public final org.telegram.ui.Components.v5 f12016h0;
    public int f12017h1;
    public final org.telegram.ui.Components.v5 f12018i0;
    public int f12019i1;
    public boolean f12020j0;
    public int f12021j1;
    public final org.telegram.ui.Components.x9 f12022k0;
    public int f12023k1;
    public final org.telegram.ui.Components.ba f12024l0;
    public boolean l1;
    public final org.telegram.ui.Components.ba m0;
    public boolean f12025m1;
    public int f12026n;
    public final org.telegram.ui.Components.ba f12027n0;
    public float n1;
    public final RectF f12028o0;
    public boolean f12029o1;
    public final Path f12030p0;
    public VelocityTracker f12031p1;
    public final my0 f12032q0;
    public boolean f12033q1;
    public final ArrayList f12034r;
    public final Drawable f12035r0;
    public boolean f12036r1;
    public final ArrayList f12037s;
    public final eb f12038s0;
    public int f12039s1;
    public final RectF f12040t0;
    public final float[] f12041t1;
    public final Paint f12042u0;
    public int f12043u1;
    public final Path f12044v0;
    public int f12045v1;
    public ab f12046w;
    public final Path f12047w0;
    public int f12048w1;
    public final Paint f12049x;
    public final RectF f12050x0;
    public int f12051x1;
    public final Path f12052y;
    public final Path f12053y0;
    public int f12054y1;
    public final Paint f12055z0;
    public int f12056z1;

    public fb(Context context, ViewGroup viewGroup, ha haVar, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.Components.x9 x9Var) {
        super(context);
        this.f12026n = 0;
        this.f12034r = new ArrayList();
        this.f12037s = new ArrayList();
        this.f12049x = new Paint(3);
        this.f12052y = new Path();
        this.D = new Path();
        this.f12001b0 = 1;
        wq wqVar = wq.h;
        this.f12004c0 = new org.telegram.ui.Components.v5(this, 0L, 360L, wqVar);
        this.f12006d0 = new org.telegram.ui.Components.v5(this, 360L, wqVar);
        this.f12009e0 = new org.telegram.ui.Components.v5(this, 0L, 360L, wqVar);
        this.f12012f0 = new org.telegram.ui.Components.v5(this, 360L, wqVar);
        this.f12014g0 = new org.telegram.ui.Components.v5(this, 0L, 360L, wqVar);
        this.f12016h0 = new org.telegram.ui.Components.v5(this, 0L, 360L, wqVar);
        this.f12018i0 = new org.telegram.ui.Components.v5(this, 0L, 320L, wqVar);
        this.f12020j0 = true;
        this.f12028o0 = new RectF();
        this.f12030p0 = new Path();
        this.f12038s0 = new eb();
        this.f12040t0 = new RectF();
        this.f12042u0 = new Paint(3);
        this.f12044v0 = new Path();
        this.f12047w0 = new Path();
        this.f12050x0 = new RectF();
        this.f12053y0 = new Path();
        Paint paint = new Paint(1);
        this.f12055z0 = paint;
        Paint paint2 = new Paint(1);
        this.A0 = paint2;
        Paint paint3 = new Paint(1);
        this.B0 = paint3;
        Paint paint4 = new Paint(1);
        this.C0 = paint4;
        Paint paint5 = new Paint(1);
        this.D0 = paint5;
        TextPaint textPaint = new TextPaint(1);
        this.E0 = textPaint;
        this.F0 = new RectF();
        this.G0 = new Path();
        Paint paint6 = new Paint(1);
        this.H0 = paint6;
        this.I0 = new eb();
        Paint paint7 = new Paint(1);
        this.J0 = paint7;
        TextPaint textPaint2 = new TextPaint(1);
        this.L0 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.P0 = textPaint3;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 16.0f, 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.T0 = linearGradient;
        this.U0 = new Matrix();
        Paint paint8 = new Paint(1);
        this.V0 = paint8;
        this.W0 = new wk0(getContext(), null);
        this.Z0 = -1L;
        this.f11999a1 = -1L;
        this.f12002b1 = new org.telegram.ui.Components.v5(0.0f, this, 0L, 340L, wqVar);
        this.f12005c1 = -1L;
        this.f12017h1 = -1;
        this.f12019i1 = -1;
        this.f12021j1 = -1;
        this.f12023k1 = -1;
        this.n1 = 1.0f;
        this.f12033q1 = true;
        this.f12036r1 = false;
        this.f12041t1 = new float[8];
        paint7.setColor(Integer.MAX_VALUE);
        textPaint2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        textPaint2.setColor(-1);
        textPaint3.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint3.setColor(-1);
        paint6.setColor(1090519039);
        paint8.setShader(linearGradient);
        paint8.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        paint.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), 436207616);
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, org.telegram.messenger.g0.L(2.0f), 1073741824);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint3.setColor(-16777216);
        paint5.setColor(-1);
        paint4.setColor(637534208);
        this.f12032q0 = new my0(id.M0(2131744456, null), 12.0f, org.telegram.messenger.g0.o());
        Drawable mutate = getContext().getResources().getDrawable(2131232780).mutate();
        this.f12035r0 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(2131231188).mutate();
        this.K0 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f12022k0 = x9Var;
        this.f12024l0 = new org.telegram.ui.Components.ba(x9Var, this, 0, false);
        this.m0 = new org.telegram.ui.Components.ba(x9Var, this, 3, false);
        this.f12027n0 = new org.telegram.ui.Components.ba(x9Var, this, 4, false);
        this.Y0 = new bi.u0(this, viewGroup, h6Var, x9Var, haVar, 13);
    }

    public static void a(final fb fbVar, ViewGroup viewGroup, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.Components.x9 x9Var, View view) {
        int i7;
        ArrayList arrayList = fbVar.f12037s;
        int i10 = fbVar.f12021j1;
        try {
            if (i10 == 2 && fbVar.N) {
                y6 y6Var = new y6(fbVar.getContext(), 0);
                y6Var.f13201b = 0.0f;
                y6Var.f13202c = 1.5f;
                y6Var.d(fbVar.V);
                y6Var.h = new c20(fbVar) {
                    public final fb f13106b;

                    {
                        this.f13106b = fbVar;
                    }

                    @Override
                    public final void a(Object obj) {
                        Float f10 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f10.floatValue();
                                fb fbVar2 = this.f13106b;
                                fbVar2.V = floatValue;
                                za zaVar = fbVar2.f11997a;
                                if (zaVar != null) {
                                    zaVar.h(f10.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                fb fbVar3 = this.f13106b;
                                fbVar3.L = floatValue2;
                                za zaVar2 = fbVar3.f11997a;
                                if (zaVar2 != null) {
                                    zaVar2.g(f10.floatValue());
                                    return;
                                }
                                return;
                            default:
                                fb fbVar4 = this.f13106b;
                                fbVar4.h.f11630i = f10.floatValue();
                                za zaVar3 = fbVar4.f11997a;
                                if (zaVar3 != null) {
                                    zaVar3.G(f10.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min = Math.min(fbVar.getBaseDuration(), fbVar.getMaxScrollDuration());
                int i11 = fbVar.f12045v1;
                int i12 = fbVar.f12054y1;
                int i13 = fbVar.f12051x1;
                float min2 = Math.min((i11 - i12) - i13, ((((org.telegram.messenger.g0.T1(fbVar.T, 1.0f, fbVar.f12012f0.f38854c) * ((float) fbVar.R)) + ((float) (fbVar.Q - fbVar.f12011f))) / ((float) min)) * fbVar.f12043u1) + i12 + i13);
                k60 F = k60.F(viewGroup, h6Var, fbVar);
                F.q(y6Var);
                F.o();
                F.c(2131232108, id.M0(2131744720, null), new wa(fbVar, 1), false);
                F.V(5);
                F.U = true;
                F.a0((-(fbVar.f12045v1 - min2)) + org.telegram.messenger.g0.L(18.0f), fbVar.F0.top);
                F.Z();
                F.R(x9Var, -view.getX(), -view.getY());
                fbVar.performHapticFeedback(0, 1);
            } else if (i10 == 1 && fbVar.E) {
                y6 y6Var2 = new y6(fbVar.getContext(), 0);
                y6Var2.f13201b = 0.0f;
                y6Var2.f13202c = 1.5f;
                y6Var2.d(fbVar.L);
                y6Var2.h = new c20(fbVar) {
                    public final fb f13106b;

                    {
                        this.f13106b = fbVar;
                    }

                    @Override
                    public final void a(Object obj) {
                        Float f10 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f10.floatValue();
                                fb fbVar2 = this.f13106b;
                                fbVar2.V = floatValue;
                                za zaVar = fbVar2.f11997a;
                                if (zaVar != null) {
                                    zaVar.h(f10.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                fb fbVar3 = this.f13106b;
                                fbVar3.L = floatValue2;
                                za zaVar2 = fbVar3.f11997a;
                                if (zaVar2 != null) {
                                    zaVar2.g(f10.floatValue());
                                    return;
                                }
                                return;
                            default:
                                fb fbVar4 = this.f13106b;
                                fbVar4.h.f11630i = f10.floatValue();
                                za zaVar3 = fbVar4.f11997a;
                                if (zaVar3 != null) {
                                    zaVar3.G(f10.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min3 = Math.min(fbVar.getBaseDuration(), fbVar.getMaxScrollDuration());
                int i14 = fbVar.f12045v1;
                int i15 = fbVar.f12054y1;
                int i16 = fbVar.f12051x1;
                float min4 = Math.min((i14 - i15) - i16, ((((org.telegram.messenger.g0.T1(fbVar.K, 1.0f, fbVar.f12006d0.f38854c) * ((float) fbVar.H)) + ((float) (fbVar.I - fbVar.f12011f))) / ((float) min3)) * fbVar.f12043u1) + i15 + i16);
                k60 F2 = k60.F(viewGroup, h6Var, fbVar);
                F2.q(y6Var2);
                F2.o();
                F2.c(2131232108, id.M0(2131744487, null), new wa(fbVar, 2), false);
                F2.V(5);
                F2.U = true;
                F2.a0((-(fbVar.f12045v1 - min4)) + org.telegram.messenger.g0.L(18.0f), fbVar.f12050x0.top);
                F2.Z();
                F2.R(x9Var, -view.getX(), -view.getY());
                fbVar.performHapticFeedback(0, 1);
            } else if (i10 == 0 && fbVar.h != null) {
                y6 y6Var3 = new y6(fbVar.getContext(), 0);
                y6Var3.f13201b = 0.0f;
                y6Var3.f13202c = 1.5f;
                y6Var3.d(fbVar.h.f11630i);
                y6Var3.h = new c20(fbVar) {
                    public final fb f13106b;

                    {
                        this.f13106b = fbVar;
                    }

                    @Override
                    public final void a(Object obj) {
                        Float f10 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f10.floatValue();
                                fb fbVar2 = this.f13106b;
                                fbVar2.V = floatValue;
                                za zaVar = fbVar2.f11997a;
                                if (zaVar != null) {
                                    zaVar.h(f10.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                fb fbVar3 = this.f13106b;
                                fbVar3.L = floatValue2;
                                za zaVar2 = fbVar3.f11997a;
                                if (zaVar2 != null) {
                                    zaVar2.g(f10.floatValue());
                                    return;
                                }
                                return;
                            default:
                                fb fbVar4 = this.f13106b;
                                fbVar4.h.f11630i = f10.floatValue();
                                za zaVar3 = fbVar4.f11997a;
                                if (zaVar3 != null) {
                                    zaVar3.G(f10.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                k60 F3 = k60.F(viewGroup, h6Var, fbVar);
                F3.q(y6Var3);
                F3.V(5);
                F3.U = true;
                F3.a0(org.telegram.messenger.g0.L(18.0f), fbVar.f12040t0.top);
                F3.Z();
                F3.R(x9Var, -view.getX(), -view.getY());
                fbVar.performHapticFeedback(0, 1);
            } else if (i10 == 3 && (i7 = fbVar.f12023k1) >= 0 && i7 < arrayList.size()) {
                ab abVar = (ab) arrayList.get(fbVar.f12023k1);
                y6 y6Var4 = new y6(fbVar.getContext(), 0);
                y6Var4.f13201b = 0.0f;
                y6Var4.f13202c = 1.5f;
                y6Var4.d(abVar.f11630i);
                y6Var4.h = new ai.f1(15, fbVar, abVar);
                k60 F4 = k60.F(viewGroup, h6Var, fbVar);
                F4.q(y6Var4);
                F4.V(5);
                F4.U = true;
                F4.a0(org.telegram.messenger.g0.L(18.0f), abVar.f11631j.top);
                F4.Z();
                F4.R(x9Var, -view.getX(), -view.getY());
                fbVar.performHapticFeedback(0, 1);
            }
        } catch (Exception unused) {
        }
    }

    private float getAudioHeight() {
        return org.telegram.messenger.g0.W1(this.f12012f0.d(this.P), org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
    }

    public long getBaseDuration() {
        ab abVar = this.h;
        if (abVar != null) {
            return Math.max(1L, abVar.f11627e);
        }
        ab abVar2 = this.f12046w;
        if (abVar2 != null) {
            return Math.max(1L, abVar2.f11627e);
        }
        if (this.E) {
            return Math.max(1L, this.H);
        }
        return Math.max(1L, this.R);
    }

    private float getCollageHeight() {
        ArrayList arrayList = this.f12037s;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        float f10 = 0.0f;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (f10 > 0.0f) {
                f10 += org.telegram.messenger.g0.L(4.0f);
            }
            f10 += org.telegram.messenger.g0.W1(((ab) arrayList.get(i7)).f11632k.f38854c, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
        }
        return f10;
    }

    private float getRoundHeight() {
        if (!this.E) {
            return 0.0f;
        }
        return org.telegram.messenger.g0.W1(this.f12006d0.d(this.G), org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
    }

    private float getVideoHeight() {
        ab abVar = this.h;
        if (abVar == null) {
            return 0.0f;
        }
        return org.telegram.messenger.g0.W1(abVar.f11632k.f38854c, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
    }

    public final int c(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: fi.fb.c(android.view.MotionEvent):int");
    }

    @Override
    public final void computeScroll() {
        wk0 wk0Var = this.W0;
        if (wk0Var.b()) {
            int i7 = wk0Var.f40002j;
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            if (this.f12033q1) {
                this.f12011f = Math.max(0.0f, (((i7 - this.f12054y1) - this.f12051x1) / this.f12043u1) * ((float) min));
            } else if (!this.P) {
                wk0Var.a();
                return;
            } else {
                int i10 = this.f12054y1;
                int i11 = this.f12051x1;
                float f10 = this.f12043u1;
                float f11 = (float) min;
                h(((((i7 - i10) - i11) / f10) * f11) - ((((this.f12039s1 - i10) - i11) / f10) * f11));
            }
            invalidate();
            this.f12039s1 = i7;
        } else if (this.f12036r1) {
            this.f12036r1 = false;
            za zaVar = this.f11997a;
            if (zaVar != null) {
                zaVar.x(false);
            }
        }
    }

    public final void d(Canvas canvas, float f10, float f11, long j3, float f12) {
        long j10;
        float f13;
        if (this.X0) {
            return;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float k10 = (float) Utilities.k(j3, getBaseDuration(), 0L);
        ab abVar = this.f12046w;
        if (abVar != null) {
            f13 = (abVar.f11629g * ((float) abVar.f11627e)) + ((float) abVar.f11628f);
        } else {
            if (this.h == null) {
                j10 = this.Q;
            } else {
                j10 = 0;
            }
            f13 = (float) j10;
        }
        float f14 = (this.f12043u1 * (((k10 + f13) - ((float) this.f12011f)) / ((float) min))) + this.f12054y1 + this.f12051x1;
        float f15 = (1.0f - f12) * (((f11 - f10) / 2.0f) / 2.0f);
        float f16 = f10 + f15;
        float f17 = f11 - f15;
        Paint paint = this.C0;
        paint.setAlpha((int) (38.0f * f12));
        int i7 = (int) (f12 * 255.0f);
        Paint paint2 = this.D0;
        paint2.setAlpha(i7);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(f14 - org.telegram.messenger.g0.N(1.5f), f16, org.telegram.messenger.g0.N(1.5f) + f14, f17);
        rectF.inset(-org.telegram.messenger.g0.N(0.66f), -org.telegram.messenger.g0.N(0.66f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint);
        rectF.set(f14 - org.telegram.messenger.g0.N(1.5f), f16, org.telegram.messenger.g0.N(1.5f) + f14, f17);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint2);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r59) {
        throw new UnsupportedOperationException("Method not decompiled: fi.fb.dispatchDraw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas, Paint paint, float f10, float f11, float f12, float f13, float f14) {
        float f15;
        Paint paint2;
        float f16;
        float f17;
        float f18;
        if (f14 <= 0.0f) {
            return;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        float f19 = 10.0f;
        rectF.set(f12 - org.telegram.messenger.g0.L(10.0f), f10, org.telegram.messenger.g0.L(10.0f) + f13, f11);
        canvas.saveLayerAlpha(0.0f, 0.0f, this.f12045v1, this.f12048w1, 255, 31);
        int i7 = (int) (255.0f * f14);
        Paint paint3 = this.f12055z0;
        paint3.setAlpha(i7);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint3);
        if (this.X0) {
            f15 = 2.5f;
        } else {
            f15 = 10.0f;
        }
        rectF.inset(org.telegram.messenger.g0.L(f15), org.telegram.messenger.g0.L(2.0f));
        boolean z9 = this.X0;
        Paint paint4 = this.A0;
        if (z9) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), paint4);
        } else {
            canvas.drawRect(rectF, paint4);
        }
        float L = org.telegram.messenger.g0.L(2.0f);
        float L2 = org.telegram.messenger.g0.L(10.0f);
        Paint paint5 = this.B0;
        if (paint != null) {
            paint2 = paint;
        } else {
            paint2 = paint5;
        }
        paint5.setAlpha(255);
        paint2.setAlpha(i7);
        if (this.X0) {
            f16 = 2.0f;
        } else {
            f16 = 10.0f;
        }
        float y10 = org.telegram.messenger.k5.y(org.telegram.messenger.g0.L(f16), L, 2.0f, f12);
        float f20 = f10 + f11;
        float f21 = (f20 - L2) / 2.0f;
        if (this.X0) {
            f17 = 2.0f;
        } else {
            f17 = 10.0f;
        }
        float f22 = (f20 + L2) / 2.0f;
        rectF.set(y10, f21, f12 - ((org.telegram.messenger.g0.L(f17) + L) / 2.0f), f22);
        if (!this.X0) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), paint2);
            if (paint != null && !this.X0) {
                paint5.setAlpha((int) (f14 * 48.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), paint5);
            }
        }
        if (this.X0) {
            f18 = 2.5f;
        } else {
            f18 = 10.0f;
        }
        float A = com.google.android.recaptcha.internal.a.A(org.telegram.messenger.g0.L(f18), L, 2.0f, f13);
        if (this.X0) {
            f19 = 2.5f;
        }
        rectF.set(A, f21, org.telegram.messenger.k5.a(org.telegram.messenger.g0.L(f19), L, 2.0f, f13), f22);
        if (!this.X0) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), paint2);
            if (paint != null) {
                paint5.setAlpha((int) (f14 * 48.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), paint5);
            }
        }
        canvas.restore();
    }

    public final long f() {
        return this.f12001b0 * 59000;
    }

    public final long g() {
        return Math.max(1000.0f, ((float) Math.min(getBaseDuration(), 59000L)) * 0.15f);
    }

    public int getContentHeight() {
        float f10;
        float collageHeight;
        float f11;
        float f12 = this.f12056z1;
        float f13 = 0.0f;
        if (this.h != null) {
            f10 = getVideoHeight() + org.telegram.messenger.g0.L(4.0f);
        } else {
            f10 = 0.0f;
        }
        float f14 = f12 + f10;
        if (this.f12037s.isEmpty()) {
            collageHeight = 0.0f;
        } else {
            collageHeight = getCollageHeight() + org.telegram.messenger.g0.L(4.0f);
        }
        float f15 = f14 + collageHeight;
        if (this.E) {
            f11 = getRoundHeight() + org.telegram.messenger.g0.L(4.0f);
        } else {
            f11 = 0.0f;
        }
        float f16 = f15 + f11;
        if (this.N) {
            f13 = org.telegram.messenger.g0.L(4.0f) + getAudioHeight();
        }
        return (int) (f16 + f13 + this.f12056z1);
    }

    public int getMaxCount() {
        return this.f12001b0;
    }

    public long getMaxScrollDuration() {
        if (this.f12037s.isEmpty()) {
            return Math.max(120000L, ((float) f()) * 1.5f);
        }
        return 70000L;
    }

    public int getTimelineHeight() {
        return org.telegram.messenger.g0.W1(this.f12018i0.f38854c, org.telegram.messenger.g0.L(28.0f) + this.f12056z1 + this.f12056z1, getContentHeight());
    }

    public final void h(float f10) {
        float f11;
        long j3;
        float f12;
        long j10;
        float f13;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        za zaVar;
        long j16;
        long k10;
        ab abVar = this.h;
        if (abVar == null && !this.E) {
            long j17 = this.Q;
            long k11 = Utilities.k(j17 + f10, 0L, -(this.R - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.Q = k11;
            float f14 = (float) (k11 - j17);
            this.S = Utilities.i(this.S - (f14 / ((float) this.R)), 1.0f, 0.0f);
            this.T = Utilities.i(this.T - (f14 / ((float) this.R)), 1.0f, 0.0f);
            za zaVar2 = this.f11997a;
            if (zaVar2 != null) {
                zaVar2.Q(this.S);
                this.f11997a.O(this.T);
            }
        } else if (this.P) {
            if (abVar != null) {
                f11 = abVar.f11629g;
                j3 = abVar.f11627e;
            } else {
                f11 = this.J;
                j3 = this.H;
            }
            float f15 = f11 * ((float) j3);
            if (abVar != null) {
                f12 = abVar.h;
                j10 = abVar.f11627e;
            } else {
                f12 = this.K;
                j10 = this.H;
            }
            float f16 = f12 * ((float) j10);
            if (abVar != null) {
                f13 = (abVar.h - abVar.f11629g) * ((float) abVar.f11627e);
            } else {
                f13 = ((float) this.H) * (this.K - this.J);
            }
            float f17 = this.T;
            float f18 = (float) this.R;
            float f19 = this.S;
            long j18 = f15 - (f19 * f18);
            float min = Math.min(f17 - f19, f13 / f18);
            long j19 = this.Q;
            long j20 = f10;
            long j21 = j19 + j20;
            if (j21 > f16 - (f17 * f18)) {
                float i7 = Utilities.i(((f16 - ((float) j19)) - ((float) j20)) / ((float) this.R), 1.0f, min);
                this.T = i7;
                float i10 = Utilities.i(i7 - min, 1.0f, 0.0f);
                this.S = i10;
                float f20 = this.T;
                float f21 = (float) this.R;
                long j22 = f16 - (f20 * f21);
                long j23 = f15 - (i10 * f21);
                if (j22 < j23) {
                    j14 = j23;
                    j13 = j22;
                } else {
                    j13 = j23;
                    j14 = j22;
                }
                this.Q = Utilities.k(this.Q + j20, j14, j13);
                za zaVar3 = this.f11997a;
                if (zaVar3 != null) {
                    zaVar3.Q(this.S);
                    this.f11997a.O(this.T);
                }
            } else if (j21 < j18) {
                float i11 = Utilities.i(((f15 - ((float) j19)) - ((float) j20)) / ((float) this.R), 1.0f - min, 0.0f);
                this.S = i11;
                float i12 = Utilities.i(i11 + min, 1.0f, 0.0f);
                this.T = i12;
                float f22 = (float) this.R;
                long j24 = f16 - (i12 * f22);
                long j25 = f15 - (this.S * f22);
                if (j24 < j25) {
                    j12 = j25;
                    j11 = j24;
                } else {
                    j11 = j25;
                    j12 = j24;
                }
                this.Q = Utilities.k(this.Q + j20, j12, j11);
                za zaVar4 = this.f11997a;
                if (zaVar4 != null) {
                    zaVar4.Q(this.S);
                    this.f11997a.O(this.T);
                }
            } else {
                this.Q = j21;
            }
        } else {
            long j26 = this.Q + f10;
            float f23 = (float) this.R;
            this.Q = Utilities.k(j26, ((float) getBaseDuration()) - (this.T * f23), (-this.S) * f23);
        }
        invalidate();
        za zaVar5 = this.f11997a;
        if (zaVar5 != null) {
            zaVar5.e0(this.Q + (this.S * ((float) this.R)));
        }
        boolean z9 = this.f12025m1;
        if (!z9 && (zaVar = this.f11997a) != null) {
            zaVar.x(true);
            ab abVar2 = this.h;
            if (abVar2 != null) {
                long j27 = this.Q + (this.S * ((float) this.R));
                float f24 = abVar2.h;
                float f25 = (float) abVar2.f11627e;
                k10 = Utilities.k(j27, f24 * f25, abVar2.f11629g * f25);
            } else if (this.E) {
                long j28 = this.Q + (this.S * ((float) this.R));
                float f26 = this.K;
                float f27 = (float) this.H;
                k10 = Utilities.k(j28, f26 * f27, this.J * f27);
            } else {
                float f28 = this.S;
                k10 = Utilities.k(f28 * ((float) j16), this.R, 0L);
            }
            if (this.h != null && Math.abs(this.f12008e - k10) > 400) {
                this.f12005c1 = this.f12008e;
                this.f12002b1.e(true, 1.0f);
            }
            za zaVar6 = this.f11997a;
            this.f12008e = k10;
            zaVar6.j(k10, false);
        } else if (z9 || this.f12036r1) {
            ab abVar3 = this.h;
            if (abVar3 != null) {
                long j29 = this.Q + (this.S * ((float) this.R));
                float f29 = abVar3.h;
                float f30 = (float) abVar3.f11627e;
                this.f12008e = Utilities.k(j29, f29 * f30, abVar3.f11629g * f30);
            } else if (this.E && abVar3 != null) {
                long j30 = this.Q + (this.S * ((float) this.R));
                float f31 = this.K;
                float f32 = (float) abVar3.f11627e;
                this.f12008e = Utilities.k(j30, f31 * f32, this.J * f32);
            } else {
                float f33 = this.S;
                this.f12008e = Utilities.k(f33 * ((float) j15), this.R, 0L);
            }
            za zaVar7 = this.f11997a;
            if (zaVar7 != null) {
                zaVar7.j(this.f12008e, false);
            }
        }
    }

    public final void i(ab abVar, float f10) {
        long j3;
        za zaVar;
        long j10;
        long k10;
        long j11;
        long j12;
        long j13;
        long j14;
        if (abVar != null) {
            ab abVar2 = this.f12046w;
            if (abVar2 != abVar && abVar2 != null) {
                if (this.f12026n == this.f12037s.indexOf(abVar)) {
                    ab abVar3 = this.f12046w;
                    float f11 = (float) abVar3.f11627e;
                    float f12 = abVar.h;
                    float f13 = (float) abVar.f11627e;
                    float f14 = abVar.f11629g;
                    long j15 = (f11 * 0.0f) - (f14 * f13);
                    float min = Math.min(f12 - f14, ((abVar3.h - abVar3.f11629g) * f11) / f13);
                    long j16 = abVar.f11628f;
                    long j17 = f10;
                    long j18 = j16 + j17;
                    if (j18 > (f11 * 1.0f) - (f12 * f13)) {
                        ab abVar4 = this.f12046w;
                        float i7 = Utilities.i((((abVar4.h * ((float) abVar4.f11627e)) - ((float) j16)) - ((float) j17)) / ((float) abVar.f11627e), 1.0f, min);
                        abVar.h = i7;
                        float i10 = Utilities.i(i7 - min, 1.0f, 0.0f);
                        abVar.f11629g = i10;
                        ab abVar5 = this.f12046w;
                        float f15 = abVar5.h;
                        float f16 = (float) abVar5.f11627e;
                        float f17 = abVar.h;
                        float f18 = (float) abVar.f11627e;
                        long j19 = (f15 * f16) - (f17 * f18);
                        long j20 = (abVar5.f11629g * f16) - (i10 * f18);
                        if (j19 < j20) {
                            j14 = j20;
                            j13 = j19;
                        } else {
                            j13 = j20;
                            j14 = j19;
                        }
                        abVar.f11628f = Utilities.k(abVar.f11628f + j17, j14, j13);
                        za zaVar2 = this.f11997a;
                        if (zaVar2 != null) {
                            zaVar2.N(abVar.f11629g, abVar.f11624a);
                            this.f11997a.S(abVar.h, abVar.f11624a);
                        }
                    } else if (j18 < j15) {
                        ab abVar6 = this.f12046w;
                        float i11 = Utilities.i((((abVar6.f11629g * ((float) abVar6.f11627e)) - ((float) j16)) - ((float) j17)) / ((float) abVar.f11627e), 1.0f - min, 0.0f);
                        abVar.f11629g = i11;
                        float i12 = Utilities.i(i11 + min, 1.0f, 0.0f);
                        abVar.h = i12;
                        ab abVar7 = this.f12046w;
                        float f19 = abVar7.h;
                        float f20 = (float) abVar7.f11627e;
                        float f21 = (float) abVar.f11627e;
                        long j21 = (f19 * f20) - (i12 * f21);
                        long j22 = (abVar7.f11629g * f20) - (abVar.f11629g * f21);
                        if (j21 < j22) {
                            j12 = j22;
                            j11 = j21;
                        } else {
                            j11 = j22;
                            j12 = j21;
                        }
                        abVar.f11628f = Utilities.k(abVar.f11628f + j17, j12, j11);
                        za zaVar3 = this.f11997a;
                        if (zaVar3 != null) {
                            zaVar3.N(abVar.f11629g, abVar.f11624a);
                            this.f11997a.S(abVar.h, abVar.f11624a);
                        }
                    } else {
                        abVar.f11628f = j18;
                    }
                } else {
                    long j23 = abVar.f11628f + f10;
                    float f22 = (float) abVar.f11627e;
                    abVar.f11628f = Utilities.k(j23, ((float) getBaseDuration()) - (abVar.h * f22), (-abVar.f11629g) * f22);
                }
            }
            invalidate();
            za zaVar4 = this.f11997a;
            if (zaVar4 != null) {
                zaVar4.b0(abVar.f11624a, abVar.f11628f);
            }
            boolean z9 = this.f12025m1;
            if (!z9 && (zaVar = this.f11997a) != null) {
                zaVar.x(true);
                ab abVar8 = this.f12046w;
                if (abVar8 != abVar && abVar8 != null) {
                    long j24 = abVar.f11628f + (abVar.f11629g * ((float) abVar.f11627e));
                    float f23 = abVar8.h;
                    float f24 = (float) abVar8.f11627e;
                    k10 = Utilities.k(j24, f23 * f24, abVar8.f11629g * f24);
                } else {
                    float f25 = abVar.f11629g;
                    k10 = Utilities.k(f25 * ((float) j10), abVar.f11627e, 0L);
                }
                ab abVar9 = this.f12046w;
                if (abVar9 != abVar && abVar9 != null && Math.abs(this.f12008e - k10) > 400) {
                    this.f12005c1 = this.f12008e;
                    this.f12002b1.e(true, 1.0f);
                }
                za zaVar5 = this.f11997a;
                this.f12008e = k10;
                zaVar5.j(k10, false);
            } else if (z9 || this.f12036r1) {
                ab abVar10 = this.f12046w;
                if (abVar10 != abVar && abVar10 != null) {
                    long j25 = abVar.f11628f + (abVar.f11629g * ((float) abVar.f11627e));
                    float f26 = abVar10.h;
                    float f27 = (float) abVar10.f11627e;
                    this.f12008e = Utilities.k(j25, f26 * f27, abVar10.f11629g * f27);
                } else {
                    float f28 = abVar.f11629g;
                    this.f12008e = Utilities.k(f28 * ((float) j3), abVar.f11627e, 0L);
                }
                za zaVar6 = this.f11997a;
                if (zaVar6 != null) {
                    zaVar6.j(this.f12008e, false);
                }
            }
        }
    }

    public final void j(float f10) {
        long j3;
        long j10;
        long j11;
        long j12;
        long j13;
        za zaVar;
        long j14;
        long k10;
        ab abVar = this.h;
        if (abVar == null) {
            long j15 = this.I;
            long k11 = Utilities.k(j15 + f10, 0L, -(this.H - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.I = k11;
            float f11 = (float) (k11 - j15);
            this.J = Utilities.i(this.J - (f11 / ((float) this.H)), 1.0f, 0.0f);
            this.K = Utilities.i(this.K - (f11 / ((float) this.H)), 1.0f, 0.0f);
            za zaVar2 = this.f11997a;
            if (zaVar2 != null) {
                zaVar2.u(this.J);
                this.f11997a.a0(this.K);
            }
        } else if (this.G) {
            float f12 = abVar.h;
            float f13 = (float) abVar.f11627e;
            float f14 = this.K;
            float f15 = (float) this.H;
            long j16 = (f12 * f13) - (f14 * f15);
            float f16 = abVar.f11629g;
            float f17 = this.J;
            long j17 = (f16 * f13) - (f17 * f15);
            float min = Math.min(f14 - f17, ((f12 - f16) * f13) / f15);
            long j18 = this.I;
            long j19 = f10;
            long j20 = j18 + j19;
            if (j20 > j16) {
                ab abVar2 = this.h;
                float i7 = Utilities.i((((abVar2.h * ((float) abVar2.f11627e)) - ((float) j18)) - ((float) j19)) / ((float) this.H), 1.0f, min);
                this.K = i7;
                float i10 = Utilities.i(i7 - min, 1.0f, 0.0f);
                this.J = i10;
                ab abVar3 = this.h;
                float f18 = abVar3.h;
                float f19 = (float) abVar3.f11627e;
                float f20 = this.K;
                float f21 = (float) this.H;
                long j21 = (f18 * f19) - (f20 * f21);
                long j22 = (abVar3.f11629g * f19) - (i10 * f21);
                if (j21 < j22) {
                    j12 = j22;
                    j11 = j21;
                } else {
                    j11 = j22;
                    j12 = j21;
                }
                this.I = Utilities.k(this.I + j19, j12, j11);
                za zaVar3 = this.f11997a;
                if (zaVar3 != null) {
                    zaVar3.u(this.J);
                    this.f11997a.a0(this.K);
                }
            } else if (j20 < j17) {
                ab abVar4 = this.h;
                float i11 = Utilities.i((((abVar4.f11629g * ((float) abVar4.f11627e)) - ((float) j18)) - ((float) j19)) / ((float) this.H), 1.0f - min, 0.0f);
                this.J = i11;
                float i12 = Utilities.i(i11 + min, 1.0f, 0.0f);
                this.K = i12;
                ab abVar5 = this.h;
                float f22 = abVar5.h;
                float f23 = (float) abVar5.f11627e;
                float f24 = (float) this.H;
                long j23 = (f22 * f23) - (i12 * f24);
                long j24 = (abVar5.f11629g * f23) - (this.J * f24);
                if (j23 < j24) {
                    j10 = j24;
                    j3 = j23;
                } else {
                    j3 = j24;
                    j10 = j23;
                }
                this.I = Utilities.k(this.I + j19, j10, j3);
                za zaVar4 = this.f11997a;
                if (zaVar4 != null) {
                    zaVar4.u(this.J);
                    this.f11997a.a0(this.K);
                }
            } else {
                this.I = j20;
            }
        } else {
            long j25 = this.I + f10;
            float f25 = (float) this.H;
            this.I = Utilities.k(j25, ((float) getBaseDuration()) - (this.K * f25), (-this.J) * f25);
        }
        invalidate();
        za zaVar5 = this.f11997a;
        if (zaVar5 != null) {
            zaVar5.J(this.I + (this.J * ((float) this.H)));
        }
        boolean z9 = this.f12025m1;
        if (!z9 && (zaVar = this.f11997a) != null) {
            zaVar.x(true);
            ab abVar6 = this.h;
            if (abVar6 != null) {
                long j26 = this.I + (this.J * ((float) this.H));
                float f26 = abVar6.h;
                float f27 = (float) abVar6.f11627e;
                k10 = Utilities.k(j26, f26 * f27, abVar6.f11629g * f27);
            } else {
                float f28 = this.J;
                k10 = Utilities.k(f28 * ((float) j14), this.H, 0L);
            }
            if (this.h != null && Math.abs(this.f12008e - k10) > 400) {
                this.f12005c1 = this.f12008e;
                this.f12002b1.e(true, 1.0f);
            }
            za zaVar6 = this.f11997a;
            this.f12008e = k10;
            zaVar6.j(k10, false);
        } else if (z9 || this.f12036r1) {
            ab abVar7 = this.h;
            if (abVar7 != null) {
                long j27 = this.I + (this.J * ((float) this.H));
                float f29 = abVar7.h;
                float f30 = (float) abVar7.f11627e;
                this.f12008e = Utilities.k(j27, f29 * f30, abVar7.f11629g * f30);
            } else {
                float f31 = this.J;
                this.f12008e = Utilities.k(f31 * ((float) j13), this.H, 0L);
            }
            za zaVar7 = this.f11997a;
            if (zaVar7 != null) {
                zaVar7.j(this.f12008e, false);
            }
        }
    }

    public final void k() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        ab abVar = this.h;
        long j3 = abVar.f11627e;
        this.f12011f = Utilities.k((((abVar.h + abVar.f11629g) / 2.0f) * ((float) j3)) - (((float) min) / 2.0f), j3 - min, 0L);
        invalidate();
    }

    public final void l(boolean z9) {
        boolean z10 = true;
        if (z9 && this.E) {
            this.G = true;
            this.P = false;
        } else {
            this.G = false;
            if (!this.N || this.h != null) {
                z10 = false;
            }
            this.P = z10;
        }
        invalidate();
    }

    public final boolean m(boolean z9, float f10) {
        long j3;
        ab abVar;
        ab abVar2 = this.h;
        ArrayList arrayList = this.f12037s;
        if (abVar2 != null || this.N || !arrayList.isEmpty()) {
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            float f11 = ((f10 - this.f12054y1) - this.f12051x1) / this.f12043u1;
            ab abVar3 = this.f12046w;
            if (abVar3 != null) {
                j3 = (abVar3.f11629g * ((float) abVar3.f11627e)) + ((float) abVar3.f11628f);
            } else {
                j3 = 0;
            }
            float f12 = f11 * ((float) min);
            if (abVar3 == null) {
                if (this.h == null) {
                    j3 = this.Q;
                } else {
                    j3 = 0;
                }
            }
            long i7 = Utilities.i((f12 - ((float) j3)) + ((float) this.f12011f), (float) getBaseDuration(), 0.0f);
            ab abVar4 = this.h;
            if (abVar4 != null) {
                float f13 = ((float) i7) / ((float) abVar4.f11627e);
                if (f13 < abVar4.f11629g || f13 > abVar4.h) {
                    return false;
                }
            }
            if (this.f12046w == null || (i7 >= 0 && i7 < (abVar.h - abVar.f11629g) * ((float) abVar.f11627e))) {
                if (this.N && abVar4 == null && arrayList.isEmpty()) {
                    float f14 = ((float) i7) / ((float) this.R);
                    if (f14 < this.S || f14 > this.T) {
                        return false;
                    }
                }
                this.f12008e = i7;
                invalidate();
                za zaVar = this.f11997a;
                if (zaVar != null) {
                    zaVar.j(i7, z9);
                }
                bi.r3 r3Var = this.f12007d1;
                if (r3Var != null) {
                    org.telegram.messenger.g0.r(r3Var);
                    this.f12007d1 = null;
                }
                if (z9) {
                    bi.r3 r3Var2 = new bi.r3(this, i7, 9);
                    this.f12007d1 = r3Var2;
                    org.telegram.messenger.g0.i3(r3Var2, 150L);
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final void n(String str, long j3, long j10, float f10, float f11, float f12, boolean z9) {
        boolean z10;
        long j11;
        boolean z11;
        boolean z12;
        ab abVar;
        long maxScrollDuration;
        if (TextUtils.equals(this.F, str)) {
            return;
        }
        db dbVar = this.M;
        Long l10 = null;
        if (dbVar != null) {
            dbVar.b();
            this.M = null;
        }
        long j12 = this.H;
        if (str != null) {
            this.F = str;
            this.H = j3;
            this.I = j10 - (((float) j3) * f10);
            this.J = f10;
            this.K = f11;
            this.L = f12;
            if (getMeasuredWidth() <= 0 || this.M != null || ((abVar = this.h) != null && abVar.f11627e < 1)) {
                z10 = false;
                j11 = j12;
                z11 = true;
            } else {
                String str2 = this.F;
                int i7 = this.f12045v1;
                int i10 = this.f12054y1;
                int i11 = (i7 - i10) - i10;
                int L = org.telegram.messenger.g0.L(38.0f);
                long j13 = this.H;
                if (j13 > 2) {
                    l10 = Long.valueOf(j13);
                }
                ab abVar2 = this.h;
                if (abVar2 != null) {
                    maxScrollDuration = abVar2.f11627e;
                } else {
                    maxScrollDuration = getMaxScrollDuration();
                }
                j11 = j12;
                z10 = false;
                z11 = true;
                this.M = new db(this, false, str2, i11, L, l10, maxScrollDuration, -1L, -1L, new wa(this, 0));
            }
            if (this.h == null) {
                this.P = z10;
                this.G = z11;
            }
        } else {
            z10 = false;
            j11 = j12;
            z11 = true;
            this.F = null;
            this.H = 1L;
            this.G = false;
        }
        if (this.F != null) {
            z12 = z11;
        } else {
            z12 = z10;
        }
        this.E = z12;
        if (j11 != j3 && this.h == null && this.f11998a0 != null) {
            this.W = z11;
            p();
        }
        if (this.N && this.E && this.h == null) {
            this.S = 0.0f;
            this.T = Utilities.i(((float) j3) / ((float) this.R), 1.0f, 0.0f);
        }
        if (!z9) {
            this.f12006d0.f(this.G, z11);
            this.f12012f0.f(this.P, z11);
            this.f12004c0.f(this.E, z11);
        }
        invalidate();
    }

    public final void o(boolean z9, String str, long j3, float f10) {
        String str2;
        ab abVar = this.h;
        if (abVar == null) {
            str2 = null;
        } else {
            str2 = abVar.d;
        }
        if (TextUtils.equals(str2, str)) {
            return;
        }
        ab abVar2 = this.h;
        if (abVar2 != null) {
            db dbVar = abVar2.f11626c;
            if (dbVar != null) {
                dbVar.b();
                this.h.f11626c = null;
            }
            this.h = null;
        }
        if (str != null) {
            this.f12011f = 0L;
            ab abVar3 = new ab(this);
            this.h = abVar3;
            abVar3.f11625b = z9;
            abVar3.d = str;
            abVar3.f11627e = j3;
            abVar3.f11630i = f10;
            ab.a(abVar3, false);
        } else {
            this.h = null;
            this.f12011f = 0L;
        }
        if (!this.E) {
            this.G = false;
        }
        this.f12008e = 0L;
        invalidate();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.L0.setTextSize(org.telegram.messenger.g0.L(12.0f));
        this.P0.setTextSize(org.telegram.messenger.g0.L(12.0f));
        int L = org.telegram.messenger.g0.L(12.0f);
        this.f12054y1 = L;
        int L2 = org.telegram.messenger.g0.L(5.0f);
        this.f12056z1 = L2;
        setPadding(L, L2, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(5.0f));
        int size = View.MeasureSpec.getSize(i7);
        this.f12045v1 = size;
        int L3 = org.telegram.messenger.g0.L(388);
        this.f12048w1 = L3;
        setMeasuredDimension(size, L3);
        int L4 = org.telegram.messenger.g0.L(10.0f);
        this.f12051x1 = L4;
        this.f12043u1 = (this.f12045v1 - (L4 * 2)) - (this.f12054y1 * 2);
        ab abVar = this.h;
        if (abVar != null && abVar.d != null && abVar.f11626c == null) {
            ab.a(abVar, false);
        }
        ArrayList arrayList = this.f12037s;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj = arrayList.get(i11);
                i11++;
                ab abVar2 = (ab) obj;
                if (abVar2.d != null && abVar2.f11626c == null) {
                    ab.a(abVar2, false);
                    ab.b(abVar2);
                }
            }
        }
        if (this.O != null && this.f11998a0 == null) {
            p();
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: fi.fb.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (getMeasuredWidth() > 0) {
            if (this.f11998a0 == null || this.W) {
                this.f11998a0 = new ya(this, this.O, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.U = false;
                this.f12014g0.e(true, 1.0f);
            }
        }
    }

    public final void q() {
        ab abVar;
        a3.c cVar = new a3.c(27);
        ArrayList arrayList = this.f12037s;
        Collections.sort(arrayList, cVar);
        if (arrayList.isEmpty()) {
            abVar = null;
        } else {
            abVar = (ab) arrayList.get(0);
        }
        this.f12046w = abVar;
        if (abVar != null) {
            long j3 = abVar.f11628f;
        }
    }

    public void setCollage(ArrayList<e7> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        db dbVar;
        int i7 = 0;
        while (true) {
            arrayList2 = this.f12037s;
            if (i7 >= arrayList2.size()) {
                break;
            }
            ab abVar = (ab) arrayList2.get(i7);
            if (abVar != null && (dbVar = abVar.f11626c) != null) {
                dbVar.b();
            }
            i7++;
        }
        arrayList2.clear();
        int i10 = 0;
        while (true) {
            arrayList3 = this.f12034r;
            if (i10 >= arrayList3.size()) {
                break;
            }
            ya yaVar = (ya) arrayList3.get(i10);
            if (yaVar != null) {
                yaVar.a();
            }
            i10++;
        }
        arrayList3.clear();
        this.f12016h0.e(true, 1.0f);
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                arrayList3.add(null);
                e7 e7Var = arrayList.get(i11);
                if (e7Var.K) {
                    ab abVar2 = new ab(this);
                    abVar2.f11624a = i11;
                    abVar2.f11625b = false;
                    abVar2.d = e7Var.L.getAbsolutePath();
                    abVar2.f11627e = e7Var.f11898h0;
                    abVar2.f11628f = e7Var.X;
                    abVar2.f11630i = e7Var.P;
                    abVar2.f11629g = e7Var.V;
                    abVar2.h = e7Var.W;
                    ab.a(abVar2, false);
                    ab.b(abVar2);
                    arrayList2.add(abVar2);
                }
            }
        }
        q();
        this.f12026n = 0;
    }

    public void setDelegate(za zaVar) {
        this.f11997a = zaVar;
    }

    public void setMaxCount(int i7) {
        this.f12001b0 = i7;
    }

    public void setOnHeightChange(Runnable runnable) {
        this.d = runnable;
    }

    public void setOnTimelineClick(Runnable runnable) {
        this.f12000b = runnable;
    }

    public void setProgress(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: fi.fb.setProgress(long):void");
    }

    public void setRoundNull(boolean z9) {
        n(null, 0L, 0L, 0.0f, 0.0f, 0.0f, z9);
    }

    public void setVideoLeft(float f10) {
        ab abVar = this.h;
        if (abVar == null) {
            return;
        }
        abVar.f11629g = f10;
        invalidate();
    }

    public void setVideoRight(float f10) {
        ab abVar = this.h;
        if (abVar == null) {
            return;
        }
        abVar.h = f10;
        invalidate();
    }
}
