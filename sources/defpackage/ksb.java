package defpackage;

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
public final class ksb extends View {
    public final Paint A0;
    public int A1;
    public final Paint B0;
    public final Paint C0;
    public final Paint D0;
    public final Path E;
    public final Paint E0;
    public boolean F;
    public final TextPaint F0;
    public String G;
    public final RectF G0;
    public boolean H;
    public final Path H0;
    public long I;
    public final Paint I0;
    public long J;
    public final jsb J0;
    public float K;
    public final Paint K0;
    public float L;
    public final Drawable L0;
    public float M;
    public final TextPaint M0;
    public isb N;
    public StaticLayout N0;
    public boolean O;
    public float O0;
    public String P;
    public float P0;
    public boolean Q;
    public final TextPaint Q0;
    public long R;
    public StaticLayout R0;
    public long S;
    public float S0;
    public float T;
    public float T0;
    public float U;
    public final LinearGradient U0;
    public boolean V;
    public final Matrix V0;
    public float W;
    public final Paint W0;
    public final dv9 X0;
    public boolean Y0;
    public final uwa Z0;
    public esb a;
    public boolean a0;
    public long a1;
    public Runnable b;
    public dsb b0;
    public long b1;
    public int c;
    public int c0;
    public final mm c1;
    public Runnable d;
    public final mm d0;
    public long d1;
    public long e;
    public final mm e0;
    public pqa e1;
    public long f;
    public final mm f0;
    public long f1;
    public final mm g0;
    public long g1;
    public fsb h;
    public final mm h0;
    public float h1;
    public final mm i0;
    public int i1;
    public final mm j0;
    public int j1;
    public boolean k0;
    public int k1;
    public final tl0 l0;
    public int l1;
    public final xl0 m0;
    public boolean m1;
    public int n;
    public final xl0 n0;
    public boolean n1;
    public final xl0 o0;
    public float o1;
    public final RectF p0;
    public boolean p1;
    public final Path q0;
    public VelocityTracker q1;
    public final ArrayList r;
    public final pkb r0;
    public boolean r1;
    public final ArrayList s;
    public final Drawable s0;
    public boolean s1;
    public final jsb t0;
    public int t1;
    public final RectF u0;
    public final float[] u1;
    public final Paint v0;
    public int v1;
    public fsb w;
    public final Path w0;
    public int w1;
    public final Paint x;
    public final Path x0;
    public int x1;
    public final Path y;
    public final RectF y0;
    public int y1;
    public final Path z0;
    public int z1;

    public ksb(Context context, ViewGroup viewGroup, fbb fbbVar, vnb vnbVar, tl0 tl0Var) {
        super(context);
        this.n = 0;
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.x = new Paint(3);
        this.y = new Path();
        this.E = new Path();
        this.c0 = 1;
        k43 k43Var = k43.h;
        this.d0 = new mm(this, 0L, 360L, k43Var);
        this.e0 = new mm(360L, this, k43Var);
        this.f0 = new mm(this, 0L, 360L, k43Var);
        this.g0 = new mm(360L, this, k43Var);
        this.h0 = new mm(this, 0L, 360L, k43Var);
        this.i0 = new mm(this, 0L, 360L, k43Var);
        this.j0 = new mm(this, 0L, 320L, k43Var);
        this.k0 = true;
        this.p0 = new RectF();
        this.q0 = new Path();
        this.t0 = new jsb();
        this.u0 = new RectF();
        this.v0 = new Paint(3);
        this.w0 = new Path();
        this.x0 = new Path();
        this.y0 = new RectF();
        this.z0 = new Path();
        Paint paint = new Paint(1);
        this.A0 = paint;
        Paint paint2 = new Paint(1);
        this.B0 = paint2;
        Paint paint3 = new Paint(1);
        this.C0 = paint3;
        Paint paint4 = new Paint(1);
        this.D0 = paint4;
        Paint paint5 = new Paint(1);
        this.E0 = paint5;
        TextPaint textPaint = new TextPaint(1);
        this.F0 = textPaint;
        this.G0 = new RectF();
        this.H0 = new Path();
        Paint paint6 = new Paint(1);
        this.I0 = paint6;
        this.J0 = new jsb();
        Paint paint7 = new Paint(1);
        this.K0 = paint7;
        TextPaint textPaint2 = new TextPaint(1);
        this.M0 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.Q0 = textPaint3;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 16.0f, 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.U0 = linearGradient;
        this.V0 = new Matrix();
        Paint paint8 = new Paint(1);
        this.W0 = paint8;
        this.X0 = new dv9(getContext(), null);
        this.a1 = -1L;
        this.b1 = -1L;
        this.c1 = new mm(0.0f, this, 0L, 340L, k43Var);
        this.d1 = -1L;
        this.i1 = -1;
        this.j1 = -1;
        this.k1 = -1;
        this.l1 = -1;
        this.o1 = 1.0f;
        this.r1 = true;
        this.s1 = false;
        this.u1 = new float[8];
        paint7.setColor(Integer.MAX_VALUE);
        textPaint2.setTextSize(hl.L(12.0f));
        textPaint2.setTypeface(hl.o());
        textPaint2.setColor(-1);
        textPaint3.setTextSize(hl.L(12.0f));
        textPaint3.setColor(-1);
        paint6.setColor(1090519039);
        paint8.setShader(linearGradient);
        paint8.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        paint.setShadowLayer(hl.L(1.0f), 0.0f, hl.L(1.0f), 436207616);
        textPaint.setTextSize(hl.L(12.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(hl.L(2.0f), 0.0f, hl.L(2.0f), 1073741824);
        textPaint.setTypeface(hl.o());
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint3.setColor(-16777216);
        paint5.setColor(-1);
        paint4.setColor(637534208);
        this.r0 = new pkb(ob6.M0(2131744110, null), 12.0f, hl.o());
        Drawable mutate = getContext().getResources().getDrawable(2131232804).mutate();
        this.s0 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(2131231191).mutate();
        this.L0 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.l0 = tl0Var;
        this.m0 = new xl0(tl0Var, this, 0, false);
        this.n0 = new xl0(tl0Var, this, 3, false);
        this.o0 = new xl0(tl0Var, this, 4, false);
        this.Z0 = new uwa(this, viewGroup, vnbVar, tl0Var, fbbVar, (byte) 6);
    }

    private float getAudioHeight() {
        return hl.U1(this.g0.d(this.Q), hl.L(28.0f), hl.L(38.0f));
    }

    public long getBaseDuration() {
        fsb fsbVar = this.h;
        if (fsbVar != null) {
            return Math.max(1L, fsbVar.e);
        }
        fsb fsbVar2 = this.w;
        if (fsbVar2 != null) {
            return Math.max(1L, fsbVar2.e);
        }
        if (this.F) {
            return Math.max(1L, this.I);
        }
        return Math.max(1L, this.S);
    }

    private float getCollageHeight() {
        ArrayList arrayList = this.s;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        float f = 0.0f;
        for (int i = 0; i < arrayList.size(); i++) {
            if (f > 0.0f) {
                f += hl.L(4.0f);
            }
            f += hl.U1(((fsb) arrayList.get(i)).k.c, hl.L(28.0f), hl.L(38.0f));
        }
        return f;
    }

    private float getRoundHeight() {
        if (!this.F) {
            return 0.0f;
        }
        return hl.U1(this.e0.d(this.H), hl.L(28.0f), hl.L(38.0f));
    }

    private float getVideoHeight() {
        fsb fsbVar = this.h;
        if (fsbVar == null) {
            return 0.0f;
        }
        return hl.U1(fsbVar.k.c, hl.L(28.0f), hl.L(38.0f));
    }

    public final int b(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ksb.b(android.view.MotionEvent):int");
    }

    public final void c(float f, float f2, float f3, long j, Canvas canvas) {
        long j2;
        float f4;
        if (this.Y0) {
            return;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float k = (float) Utilities.k(j, getBaseDuration(), 0L);
        fsb fsbVar = this.w;
        if (fsbVar != null) {
            f4 = (fsbVar.g * ((float) fsbVar.e)) + ((float) fsbVar.f);
        } else {
            if (this.h == null) {
                j2 = this.R;
            } else {
                j2 = 0;
            }
            f4 = (float) j2;
        }
        float f5 = (this.v1 * (((k + f4) - ((float) this.f)) / ((float) min))) + this.z1 + this.y1;
        float f6 = (1.0f - f3) * (((f2 - f) / 2.0f) / 2.0f);
        float f7 = f + f6;
        float f8 = f2 - f6;
        Paint paint = this.D0;
        paint.setAlpha((int) (38.0f * f3));
        Paint paint2 = this.E0;
        paint2.setAlpha((int) (f3 * 255.0f));
        RectF rectF = hl.P;
        rectF.set(f5 - hl.N(1.5f), f7, hl.N(1.5f) + f5, f8);
        rectF.inset(-hl.N(0.66f), -hl.N(0.66f));
        canvas.drawRoundRect(rectF, hl.L(6.0f), hl.L(6.0f), paint);
        rectF.set(f5 - hl.N(1.5f), f7, hl.N(1.5f) + f5, f8);
        canvas.drawRoundRect(rectF, hl.L(6.0f), hl.L(6.0f), paint2);
    }

    @Override
    public final void computeScroll() {
        dv9 dv9Var = this.X0;
        if (dv9Var.b()) {
            int i = dv9Var.j;
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            if (this.r1) {
                this.f = Math.max(0.0f, (((i - this.z1) - this.y1) / this.v1) * ((float) min));
            } else if (!this.Q) {
                dv9Var.a();
                return;
            } else {
                int i2 = this.z1;
                int i3 = this.y1;
                float f = this.v1;
                float f2 = (float) min;
                h(((((i - i2) - i3) / f) * f2) - ((((this.t1 - i2) - i3) / f) * f2));
            }
            invalidate();
            this.t1 = i;
        } else if (this.s1) {
            this.s1 = false;
            esb esbVar = this.a;
            if (esbVar != null) {
                esbVar.v0(false);
            }
        }
    }

    public final void d(Canvas canvas, Paint paint, float f, float f2, float f3, float f4, float f5) {
        float f6;
        Paint paint2;
        float f7;
        float f8;
        float f9;
        if (f5 <= 0.0f) {
            return;
        }
        RectF rectF = hl.P;
        float f10 = 10.0f;
        rectF.set(f3 - hl.L(10.0f), f, hl.L(10.0f) + f4, f2);
        canvas.saveLayerAlpha(0.0f, 0.0f, this.w1, this.x1, 255, 31);
        int i = (int) (255.0f * f5);
        Paint paint3 = this.A0;
        paint3.setAlpha(i);
        canvas.drawRoundRect(rectF, hl.L(6.0f), hl.L(6.0f), paint3);
        if (this.Y0) {
            f6 = 2.5f;
        } else {
            f6 = 10.0f;
        }
        rectF.inset(hl.L(f6), hl.L(2.0f));
        boolean z = this.Y0;
        Paint paint4 = this.B0;
        if (z) {
            canvas.drawRoundRect(rectF, hl.L(3.0f), hl.L(3.0f), paint4);
        } else {
            canvas.drawRect(rectF, paint4);
        }
        float L = hl.L(2.0f);
        float L2 = hl.L(10.0f);
        Paint paint5 = this.C0;
        if (paint != null) {
            paint2 = paint;
        } else {
            paint2 = paint5;
        }
        paint5.setAlpha(255);
        paint2.setAlpha(i);
        if (this.Y0) {
            f7 = 2.0f;
        } else {
            f7 = 10.0f;
        }
        float x = qd4.x(hl.L(f7), L, 2.0f, f3);
        float f11 = f + f2;
        float f12 = (f11 - L2) / 2.0f;
        if (this.Y0) {
            f8 = 2.0f;
        } else {
            f8 = 10.0f;
        }
        float f13 = (f11 + L2) / 2.0f;
        rectF.set(x, f12, f3 - ((hl.L(f8) + L) / 2.0f), f13);
        if (!this.Y0) {
            canvas.drawRoundRect(rectF, hl.L(1.0f), hl.L(1.0f), paint2);
            if (paint != null && !this.Y0) {
                paint5.setAlpha((int) (f5 * 48.0f));
                canvas.drawRoundRect(rectF, hl.L(1.0f), hl.L(1.0f), paint5);
            }
        }
        if (this.Y0) {
            f9 = 2.5f;
        } else {
            f9 = 10.0f;
        }
        float z2 = bp1.z(hl.L(f9), L, 2.0f, f4);
        if (this.Y0) {
            f10 = 2.5f;
        }
        rectF.set(z2, f12, qd4.e(hl.L(f10), L, 2.0f, f4), f13);
        if (!this.Y0) {
            canvas.drawRoundRect(rectF, hl.L(1.0f), hl.L(1.0f), paint2);
            if (paint != null) {
                paint5.setAlpha((int) (f5 * 48.0f));
                canvas.drawRoundRect(rectF, hl.L(1.0f), hl.L(1.0f), paint5);
            }
        }
        canvas.restore();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r53) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ksb.dispatchDraw(android.graphics.Canvas):void");
    }

    public final void e(ViewGroup viewGroup, vnb vnbVar, tl0 tl0Var, fbb fbbVar) {
        int i;
        int i2 = this.k1;
        try {
            if (i2 == 2 && this.O) {
                ena enaVar = new ena(getContext(), 0);
                enaVar.b = 0.0f;
                enaVar.c = 1.5f;
                enaVar.c(this.W);
                enaVar.h = new pcc(this) {
                    public final ksb b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void a(Object obj) {
                        byte b = r2;
                        ksb ksbVar = this.b;
                        Float f = (Float) obj;
                        switch (b) {
                            case 0:
                                ksbVar.getClass();
                                ksbVar.W = f.floatValue();
                                esb esbVar = ksbVar.a;
                                if (esbVar != null) {
                                    esbVar.y(f.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                ksbVar.getClass();
                                ksbVar.M = f.floatValue();
                                esb esbVar2 = ksbVar.a;
                                if (esbVar2 != null) {
                                    esbVar2.t(f.floatValue());
                                    return;
                                }
                                return;
                            default:
                                ksbVar.h.i = f.floatValue();
                                esb esbVar3 = ksbVar.a;
                                if (esbVar3 != null) {
                                    esbVar3.H0(f.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min = Math.min(getBaseDuration(), getMaxScrollDuration());
                int i3 = this.w1;
                int i4 = this.z1;
                int i5 = this.y1;
                float min2 = Math.min((i3 - i4) - i5, ((((hl.R1(this.U, 1.0f, this.g0.c) * ((float) this.S)) + ((float) (this.R - this.f))) / ((float) min)) * this.v1) + i4 + i5);
                fu5 G = fu5.G(viewGroup, vnbVar, this);
                G.p(enaVar);
                G.n(true);
                G.b(2131232113, ob6.M0(2131744377, null), new bsb(this, (byte) 1), false);
                G.W(5);
                G.a0 = true;
                G.b0((-(this.w1 - min2)) + hl.L(18.0f), this.G0.top);
                G.a0();
                G.S(tl0Var, -fbbVar.getX(), -fbbVar.getY());
                performHapticFeedback(0, 1);
            } else if (i2 == 1 && this.F) {
                ena enaVar2 = new ena(getContext(), 0);
                enaVar2.b = 0.0f;
                enaVar2.c = 1.5f;
                enaVar2.c(this.M);
                enaVar2.h = new pcc(this) {
                    public final ksb b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void a(Object obj) {
                        byte b = r2;
                        ksb ksbVar = this.b;
                        Float f = (Float) obj;
                        switch (b) {
                            case 0:
                                ksbVar.getClass();
                                ksbVar.W = f.floatValue();
                                esb esbVar = ksbVar.a;
                                if (esbVar != null) {
                                    esbVar.y(f.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                ksbVar.getClass();
                                ksbVar.M = f.floatValue();
                                esb esbVar2 = ksbVar.a;
                                if (esbVar2 != null) {
                                    esbVar2.t(f.floatValue());
                                    return;
                                }
                                return;
                            default:
                                ksbVar.h.i = f.floatValue();
                                esb esbVar3 = ksbVar.a;
                                if (esbVar3 != null) {
                                    esbVar3.H0(f.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min3 = Math.min(getBaseDuration(), getMaxScrollDuration());
                int i6 = this.w1;
                int i7 = this.z1;
                int i8 = this.y1;
                float min4 = Math.min((i6 - i7) - i8, ((((hl.R1(this.L, 1.0f, this.e0.c) * ((float) this.I)) + ((float) (this.J - this.f))) / ((float) min3)) * this.v1) + i7 + i8);
                fu5 G2 = fu5.G(viewGroup, vnbVar, this);
                G2.p(enaVar2);
                G2.n(true);
                G2.b(2131232113, ob6.M0(2131744141, null), new bsb(this, (byte) 2), false);
                G2.W(5);
                G2.a0 = true;
                G2.b0((-(this.w1 - min4)) + hl.L(18.0f), this.y0.top);
                G2.a0();
                G2.S(tl0Var, -fbbVar.getX(), -fbbVar.getY());
                performHapticFeedback(0, 1);
            } else if (i2 == 0 && this.h != null) {
                ena enaVar3 = new ena(getContext(), 0);
                enaVar3.b = 0.0f;
                enaVar3.c = 1.5f;
                enaVar3.c(this.h.i);
                enaVar3.h = new pcc(this) {
                    public final ksb b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void a(Object obj) {
                        byte b = r2;
                        ksb ksbVar = this.b;
                        Float f = (Float) obj;
                        switch (b) {
                            case 0:
                                ksbVar.getClass();
                                ksbVar.W = f.floatValue();
                                esb esbVar = ksbVar.a;
                                if (esbVar != null) {
                                    esbVar.y(f.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                ksbVar.getClass();
                                ksbVar.M = f.floatValue();
                                esb esbVar2 = ksbVar.a;
                                if (esbVar2 != null) {
                                    esbVar2.t(f.floatValue());
                                    return;
                                }
                                return;
                            default:
                                ksbVar.h.i = f.floatValue();
                                esb esbVar3 = ksbVar.a;
                                if (esbVar3 != null) {
                                    esbVar3.H0(f.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                fu5 G3 = fu5.G(viewGroup, vnbVar, this);
                G3.p(enaVar3);
                G3.W(5);
                G3.a0 = true;
                G3.b0(hl.L(18.0f), this.u0.top);
                G3.a0();
                G3.S(tl0Var, -fbbVar.getX(), -fbbVar.getY());
                performHapticFeedback(0, 1);
            } else if (i2 == 3 && (i = this.l1) >= 0) {
                ArrayList arrayList = this.s;
                if (i < arrayList.size()) {
                    fsb fsbVar = (fsb) arrayList.get(this.l1);
                    ena enaVar4 = new ena(getContext(), 0);
                    enaVar4.b = 0.0f;
                    enaVar4.c = 1.5f;
                    enaVar4.c(fsbVar.i);
                    enaVar4.h = new ku9(this, fsbVar, (byte) 18);
                    fu5 G4 = fu5.G(viewGroup, vnbVar, this);
                    G4.p(enaVar4);
                    G4.W(5);
                    G4.a0 = true;
                    G4.b0(hl.L(18.0f), fsbVar.j.top);
                    G4.a0();
                    G4.S(tl0Var, -fbbVar.getX(), -fbbVar.getY());
                    performHapticFeedback(0, 1);
                }
            }
        } catch (Exception unused) {
        }
    }

    public final long f() {
        return this.c0 * 59000;
    }

    public final long g() {
        return Math.max(1000.0f, ((float) Math.min(getBaseDuration(), 59000L)) * 0.15f);
    }

    public int getContentHeight() {
        float f;
        float collageHeight;
        float f2;
        float f3 = this.A1;
        float f4 = 0.0f;
        if (this.h != null) {
            f = getVideoHeight() + hl.L(4.0f);
        } else {
            f = 0.0f;
        }
        float f5 = f3 + f;
        if (this.s.isEmpty()) {
            collageHeight = 0.0f;
        } else {
            collageHeight = getCollageHeight() + hl.L(4.0f);
        }
        float f6 = f5 + collageHeight;
        if (this.F) {
            f2 = getRoundHeight() + hl.L(4.0f);
        } else {
            f2 = 0.0f;
        }
        float f7 = f6 + f2;
        if (this.O) {
            f4 = hl.L(4.0f) + getAudioHeight();
        }
        return (int) (f7 + f4 + this.A1);
    }

    public int getMaxCount() {
        return this.c0;
    }

    public long getMaxScrollDuration() {
        if (this.s.isEmpty()) {
            return Math.max(120000L, ((float) f()) * 1.5f);
        }
        return 70000L;
    }

    public int getTimelineHeight() {
        return hl.U1(this.j0.c, hl.L(28.0f) + this.A1 + this.A1, getContentHeight());
    }

    public final void h(float f) {
        float f2;
        float f3;
        float f4;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long k;
        long j6;
        long k2;
        fsb fsbVar = this.h;
        if (fsbVar == null && !this.F) {
            long j7 = this.R;
            long k3 = Utilities.k(j7 + f, 0L, -(this.S - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.R = k3;
            float f5 = (float) (k3 - j7);
            this.T = Utilities.i(this.T - (f5 / ((float) this.S)), 1.0f, 0.0f);
            this.U = Utilities.i(this.U - (f5 / ((float) this.S)), 1.0f, 0.0f);
            esb esbVar = this.a;
            if (esbVar != null) {
                esbVar.E1(this.T);
                this.a.s1(this.U);
            }
        } else if (this.Q) {
            if (fsbVar != null) {
                float f6 = fsbVar.g;
                long j8 = fsbVar.e;
                f2 = ((float) j8) * f6;
                float f7 = fsbVar.h;
                f3 = ((float) j8) * f7;
                f4 = (f7 - f6) * ((float) j8);
            } else {
                float f8 = this.K;
                long j9 = this.I;
                f2 = f8 * ((float) j9);
                float f9 = this.L;
                f3 = ((float) j9) * f9;
                f4 = ((float) j9) * (f9 - f8);
            }
            float f10 = this.U;
            float f11 = (float) this.S;
            long j10 = f3 - (f10 * f11);
            float f12 = this.T;
            long j11 = f2 - (f12 * f11);
            float min = Math.min(f10 - f12, f4 / f11);
            long j12 = this.R;
            long j13 = f;
            long j14 = j12 + j13;
            if (j14 > j10) {
                float i = Utilities.i(((f3 - ((float) j12)) - ((float) j13)) / ((float) this.S), 1.0f, min);
                this.U = i;
                float i2 = Utilities.i(i - min, 1.0f, 0.0f);
                this.T = i2;
                float f13 = this.U;
                float f14 = (float) this.S;
                long j15 = f3 - (f13 * f14);
                long j16 = f2 - (i2 * f14);
                if (j15 < j16) {
                    j4 = j16;
                    j3 = j15;
                } else {
                    j3 = j16;
                    j4 = j15;
                }
                this.R = Utilities.k(this.R + j13, j4, j3);
                esb esbVar2 = this.a;
                if (esbVar2 != null) {
                    esbVar2.E1(this.T);
                    this.a.s1(this.U);
                }
            } else if (j14 < j11) {
                float i3 = Utilities.i(((f2 - ((float) j12)) - ((float) j13)) / ((float) this.S), 1.0f - min, 0.0f);
                this.T = i3;
                float i4 = Utilities.i(i3 + min, 1.0f, 0.0f);
                this.U = i4;
                float f15 = (float) this.S;
                long j17 = f3 - (i4 * f15);
                long j18 = f2 - (this.T * f15);
                if (j17 < j18) {
                    j2 = j18;
                    j = j17;
                } else {
                    j = j18;
                    j2 = j17;
                }
                this.R = Utilities.k(this.R + j13, j2, j);
                esb esbVar3 = this.a;
                if (esbVar3 != null) {
                    esbVar3.E1(this.T);
                    this.a.s1(this.U);
                }
            } else {
                this.R = j14;
            }
        } else {
            long j19 = this.R + f;
            float f16 = (float) this.S;
            this.R = Utilities.k(j19, ((float) getBaseDuration()) - (this.U * f16), (-this.T) * f16);
        }
        invalidate();
        esb esbVar4 = this.a;
        if (esbVar4 != null) {
            esbVar4.g2(this.R + (this.T * ((float) this.S)));
        }
        if (!this.n1) {
            esb esbVar5 = this.a;
            if (esbVar5 != null) {
                esbVar5.v0(true);
                fsb fsbVar2 = this.h;
                if (fsbVar2 != null) {
                    long j20 = this.R + (this.T * ((float) this.S));
                    float f17 = fsbVar2.h;
                    float f18 = (float) fsbVar2.e;
                    k2 = Utilities.k(j20, f17 * f18, fsbVar2.g * f18);
                } else if (this.F) {
                    long j21 = this.R + (this.T * ((float) this.S));
                    float f19 = this.L;
                    float f20 = (float) this.I;
                    k2 = Utilities.k(j21, f19 * f20, this.K * f20);
                } else {
                    float f21 = this.T;
                    k2 = Utilities.k(f21 * ((float) j6), this.S, 0L);
                }
                if (this.h != null && Math.abs(this.e - k2) > 400) {
                    this.d1 = this.e;
                    this.c1.e(true, 1.0f);
                }
                esb esbVar6 = this.a;
                this.e = k2;
                esbVar6.C(k2, false);
                return;
            } else if (!this.s1) {
                return;
            }
        }
        fsb fsbVar3 = this.h;
        if (fsbVar3 != null) {
            long j22 = this.R + (this.T * ((float) this.S));
            float f22 = fsbVar3.h;
            float f23 = (float) fsbVar3.e;
            k = Utilities.k(j22, f22 * f23, fsbVar3.g * f23);
            this.e = k;
        } else if (this.F && fsbVar3 != null) {
            long j23 = this.R + (this.T * ((float) this.S));
            float f24 = this.L;
            float f25 = (float) fsbVar3.e;
            k = Utilities.k(j23, f24 * f25, this.K * f25);
            this.e = k;
        } else {
            float f26 = this.T;
            k = Utilities.k(f26 * ((float) j5), this.S, 0L);
            this.e = k;
        }
        esb esbVar7 = this.a;
        if (esbVar7 != null) {
            esbVar7.C(k, false);
        }
    }

    public final void i(fsb fsbVar, float f) {
        long j;
        long k;
        long j2;
        long k2;
        long j3;
        long j4;
        long j5;
        long j6;
        if (fsbVar != null) {
            fsb fsbVar2 = this.w;
            if (fsbVar2 != fsbVar && fsbVar2 != null) {
                if (this.n == this.s.indexOf(fsbVar)) {
                    fsb fsbVar3 = this.w;
                    float f2 = (float) fsbVar3.e;
                    float f3 = fsbVar.h;
                    float f4 = (float) fsbVar.e;
                    float f5 = fsbVar.g;
                    long j7 = (f2 * 0.0f) - (f5 * f4);
                    float min = Math.min(f3 - f5, ((fsbVar3.h - fsbVar3.g) * f2) / f4);
                    long j8 = fsbVar.f;
                    long j9 = f;
                    long j10 = j8 + j9;
                    if (j10 > (f2 * 1.0f) - (f3 * f4)) {
                        fsb fsbVar4 = this.w;
                        float i = Utilities.i((((fsbVar4.h * ((float) fsbVar4.e)) - ((float) j8)) - ((float) j9)) / ((float) fsbVar.e), 1.0f, min);
                        fsbVar.h = i;
                        float i2 = Utilities.i(i - min, 1.0f, 0.0f);
                        fsbVar.g = i2;
                        fsb fsbVar5 = this.w;
                        float f6 = fsbVar5.h;
                        float f7 = (float) fsbVar5.e;
                        float f8 = fsbVar.h;
                        float f9 = (float) fsbVar.e;
                        long j11 = (f6 * f7) - (f8 * f9);
                        long j12 = (fsbVar5.g * f7) - (i2 * f9);
                        if (j11 < j12) {
                            j6 = j12;
                            j5 = j11;
                        } else {
                            j5 = j12;
                            j6 = j11;
                        }
                        fsbVar.f = Utilities.k(fsbVar.f + j9, j6, j5);
                        esb esbVar = this.a;
                        if (esbVar != null) {
                            esbVar.p1(fsbVar.g, fsbVar.a);
                            this.a.O1(fsbVar.h, fsbVar.a);
                        }
                    } else if (j10 < j7) {
                        fsb fsbVar6 = this.w;
                        float i3 = Utilities.i((((fsbVar6.g * ((float) fsbVar6.e)) - ((float) j8)) - ((float) j9)) / ((float) fsbVar.e), 1.0f - min, 0.0f);
                        fsbVar.g = i3;
                        float i4 = Utilities.i(i3 + min, 1.0f, 0.0f);
                        fsbVar.h = i4;
                        fsb fsbVar7 = this.w;
                        float f10 = fsbVar7.h;
                        float f11 = (float) fsbVar7.e;
                        float f12 = (float) fsbVar.e;
                        long j13 = (f10 * f11) - (i4 * f12);
                        long j14 = (fsbVar7.g * f11) - (fsbVar.g * f12);
                        if (j13 < j14) {
                            j4 = j14;
                            j3 = j13;
                        } else {
                            j3 = j14;
                            j4 = j13;
                        }
                        fsbVar.f = Utilities.k(fsbVar.f + j9, j4, j3);
                        esb esbVar2 = this.a;
                        if (esbVar2 != null) {
                            esbVar2.p1(fsbVar.g, fsbVar.a);
                            this.a.O1(fsbVar.h, fsbVar.a);
                        }
                    } else {
                        fsbVar.f = j10;
                    }
                } else {
                    long j15 = fsbVar.f + f;
                    float f13 = (float) fsbVar.e;
                    fsbVar.f = Utilities.k(j15, ((float) getBaseDuration()) - (fsbVar.h * f13), (-fsbVar.g) * f13);
                }
            }
            invalidate();
            esb esbVar3 = this.a;
            if (esbVar3 != null) {
                esbVar3.b2(fsbVar.a, fsbVar.f);
            }
            if (!this.n1) {
                esb esbVar4 = this.a;
                if (esbVar4 != null) {
                    esbVar4.v0(true);
                    fsb fsbVar8 = this.w;
                    if (fsbVar8 != fsbVar && fsbVar8 != null) {
                        long j16 = fsbVar.f + (fsbVar.g * ((float) fsbVar.e));
                        float f14 = fsbVar8.h;
                        float f15 = (float) fsbVar8.e;
                        k2 = Utilities.k(j16, f14 * f15, fsbVar8.g * f15);
                    } else {
                        float f16 = fsbVar.g;
                        k2 = Utilities.k(f16 * ((float) j2), fsbVar.e, 0L);
                    }
                    fsb fsbVar9 = this.w;
                    if (fsbVar9 != fsbVar && fsbVar9 != null && Math.abs(this.e - k2) > 400) {
                        this.d1 = this.e;
                        this.c1.e(true, 1.0f);
                    }
                    esb esbVar5 = this.a;
                    this.e = k2;
                    esbVar5.C(k2, false);
                    return;
                } else if (!this.s1) {
                    return;
                }
            }
            fsb fsbVar10 = this.w;
            if (fsbVar10 != fsbVar && fsbVar10 != null) {
                long j17 = fsbVar.f + (fsbVar.g * ((float) fsbVar.e));
                float f17 = fsbVar10.h;
                float f18 = (float) fsbVar10.e;
                k = Utilities.k(j17, f17 * f18, fsbVar10.g * f18);
                this.e = k;
            } else {
                float f19 = fsbVar.g;
                k = Utilities.k(f19 * ((float) j), fsbVar.e, 0L);
                this.e = k;
            }
            esb esbVar6 = this.a;
            if (esbVar6 != null) {
                esbVar6.C(k, false);
            }
        }
    }

    public final void j(float f) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long k;
        long j6;
        long k2;
        fsb fsbVar = this.h;
        if (fsbVar == null) {
            long j7 = this.J;
            long k3 = Utilities.k(j7 + f, 0L, -(this.I - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.J = k3;
            float f2 = (float) (k3 - j7);
            this.K = Utilities.i(this.K - (f2 / ((float) this.I)), 1.0f, 0.0f);
            this.L = Utilities.i(this.L - (f2 / ((float) this.I)), 1.0f, 0.0f);
            esb esbVar = this.a;
            if (esbVar != null) {
                esbVar.m0(this.K);
                this.a.Z1(this.L);
            }
        } else if (this.H) {
            float f3 = fsbVar.h;
            float f4 = (float) fsbVar.e;
            float f5 = this.L;
            float f6 = (float) this.I;
            long j8 = (f3 * f4) - (f5 * f6);
            float f7 = fsbVar.g;
            float f8 = this.K;
            long j9 = (f7 * f4) - (f8 * f6);
            float min = Math.min(f5 - f8, ((f3 - f7) * f4) / f6);
            long j10 = this.J;
            long j11 = f;
            long j12 = j10 + j11;
            if (j12 > j8) {
                fsb fsbVar2 = this.h;
                float i = Utilities.i((((fsbVar2.h * ((float) fsbVar2.e)) - ((float) j10)) - ((float) j11)) / ((float) this.I), 1.0f, min);
                this.L = i;
                float i2 = Utilities.i(i - min, 1.0f, 0.0f);
                this.K = i2;
                fsb fsbVar3 = this.h;
                float f9 = fsbVar3.h;
                float f10 = (float) fsbVar3.e;
                float f11 = this.L;
                float f12 = (float) this.I;
                long j13 = (f9 * f10) - (f11 * f12);
                long j14 = (fsbVar3.g * f10) - (i2 * f12);
                if (j13 < j14) {
                    j4 = j14;
                    j3 = j13;
                } else {
                    j3 = j14;
                    j4 = j13;
                }
                this.J = Utilities.k(this.J + j11, j4, j3);
                esb esbVar2 = this.a;
                if (esbVar2 != null) {
                    esbVar2.m0(this.K);
                    this.a.Z1(this.L);
                }
            } else if (j12 < j9) {
                fsb fsbVar4 = this.h;
                float i3 = Utilities.i((((fsbVar4.g * ((float) fsbVar4.e)) - ((float) j10)) - ((float) j11)) / ((float) this.I), 1.0f - min, 0.0f);
                this.K = i3;
                float i4 = Utilities.i(i3 + min, 1.0f, 0.0f);
                this.L = i4;
                fsb fsbVar5 = this.h;
                float f13 = fsbVar5.h;
                float f14 = (float) fsbVar5.e;
                float f15 = (float) this.I;
                long j15 = (f13 * f14) - (i4 * f15);
                long j16 = (fsbVar5.g * f14) - (this.K * f15);
                if (j15 < j16) {
                    j2 = j16;
                    j = j15;
                } else {
                    j = j16;
                    j2 = j15;
                }
                this.J = Utilities.k(this.J + j11, j2, j);
                esb esbVar3 = this.a;
                if (esbVar3 != null) {
                    esbVar3.m0(this.K);
                    this.a.Z1(this.L);
                }
            } else {
                this.J = j12;
            }
        } else {
            long j17 = this.J + f;
            float f16 = (float) this.I;
            this.J = Utilities.k(j17, ((float) getBaseDuration()) - (this.L * f16), (-this.K) * f16);
        }
        invalidate();
        esb esbVar4 = this.a;
        if (esbVar4 != null) {
            esbVar4.b1(this.J + (this.K * ((float) this.I)));
        }
        if (!this.n1) {
            esb esbVar5 = this.a;
            if (esbVar5 != null) {
                esbVar5.v0(true);
                fsb fsbVar6 = this.h;
                if (fsbVar6 != null) {
                    long j18 = this.J + (this.K * ((float) this.I));
                    float f17 = fsbVar6.h;
                    float f18 = (float) fsbVar6.e;
                    k2 = Utilities.k(j18, f17 * f18, fsbVar6.g * f18);
                } else {
                    float f19 = this.K;
                    k2 = Utilities.k(f19 * ((float) j6), this.I, 0L);
                }
                if (this.h != null && Math.abs(this.e - k2) > 400) {
                    this.d1 = this.e;
                    this.c1.e(true, 1.0f);
                }
                esb esbVar6 = this.a;
                this.e = k2;
                esbVar6.C(k2, false);
                return;
            } else if (!this.s1) {
                return;
            }
        }
        fsb fsbVar7 = this.h;
        if (fsbVar7 != null) {
            long j19 = this.J + (this.K * ((float) this.I));
            float f20 = fsbVar7.h;
            float f21 = (float) fsbVar7.e;
            k = Utilities.k(j19, f20 * f21, fsbVar7.g * f21);
            this.e = k;
        } else {
            float f22 = this.K;
            k = Utilities.k(f22 * ((float) j5), this.I, 0L);
            this.e = k;
        }
        esb esbVar7 = this.a;
        if (esbVar7 != null) {
            esbVar7.C(k, false);
        }
    }

    public final void k() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        fsb fsbVar = this.h;
        long j = fsbVar.e;
        this.f = Utilities.k((((fsbVar.h + fsbVar.g) / 2.0f) * ((float) j)) - (((float) min) / 2.0f), j - min, 0L);
        invalidate();
    }

    public final void l(boolean z) {
        boolean z2 = true;
        if (z && this.F) {
            this.H = true;
            this.Q = false;
        } else {
            this.H = false;
            if (!this.O || this.h != null) {
                z2 = false;
            }
            this.Q = z2;
        }
        invalidate();
    }

    public final boolean m(boolean z, float f) {
        long j;
        fsb fsbVar;
        fsb fsbVar2 = this.h;
        ArrayList arrayList = this.s;
        if (fsbVar2 != null || this.O || !arrayList.isEmpty()) {
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            float f2 = ((f - this.z1) - this.y1) / this.v1;
            fsb fsbVar3 = this.w;
            if (fsbVar3 != null) {
                j = (fsbVar3.g * ((float) fsbVar3.e)) + ((float) fsbVar3.f);
            } else {
                j = 0;
            }
            float f3 = f2 * ((float) min);
            if (fsbVar3 == null) {
                if (this.h == null) {
                    j = this.R;
                } else {
                    j = 0;
                }
            }
            long i = Utilities.i((f3 - ((float) j)) + ((float) this.f), (float) getBaseDuration(), 0.0f);
            fsb fsbVar4 = this.h;
            if (fsbVar4 != null) {
                float f4 = ((float) i) / ((float) fsbVar4.e);
                if (f4 < fsbVar4.g || f4 > fsbVar4.h) {
                    return false;
                }
            }
            if (this.w == null || (i >= 0 && i < (fsbVar.h - fsbVar.g) * ((float) fsbVar.e))) {
                if (this.O && fsbVar4 == null && arrayList.isEmpty()) {
                    float f5 = ((float) i) / ((float) this.S);
                    if (f5 < this.T || f5 > this.U) {
                        return false;
                    }
                }
                this.e = i;
                invalidate();
                esb esbVar = this.a;
                if (esbVar != null) {
                    esbVar.C(i, z);
                }
                pqa pqaVar = this.e1;
                if (pqaVar != null) {
                    hl.r(pqaVar);
                    this.e1 = null;
                }
                if (z) {
                    pqa pqaVar2 = new pqa(this, i, (byte) 7);
                    this.e1 = pqaVar2;
                    hl.d3(pqaVar2, 150L);
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final void n(String str, long j, long j2, float f, float f2, float f3, boolean z) {
        boolean z2;
        long j3;
        boolean z3;
        boolean z4;
        fsb fsbVar;
        long maxScrollDuration;
        if (TextUtils.equals(this.G, str)) {
            return;
        }
        isb isbVar = this.N;
        Long l = null;
        if (isbVar != null) {
            isbVar.a();
            this.N = null;
        }
        long j4 = this.I;
        if (str != null) {
            this.G = str;
            this.I = j;
            this.J = j2 - (((float) j) * f);
            this.K = f;
            this.L = f2;
            this.M = f3;
            if (getMeasuredWidth() > 0 && this.N == null && ((fsbVar = this.h) == null || fsbVar.e >= 1)) {
                String str2 = this.G;
                int i = this.w1;
                int i2 = this.z1;
                int i3 = (i - i2) - i2;
                int L = hl.L(38.0f);
                long j5 = this.I;
                if (j5 > 2) {
                    l = Long.valueOf(j5);
                }
                fsb fsbVar2 = this.h;
                if (fsbVar2 != null) {
                    maxScrollDuration = fsbVar2.e;
                } else {
                    maxScrollDuration = getMaxScrollDuration();
                }
                j3 = j4;
                z2 = false;
                z3 = true;
                this.N = new isb(this, false, str2, i3, L, l, maxScrollDuration, -1L, -1L, new bsb(this, (byte) 0));
            } else {
                z2 = false;
                j3 = j4;
                z3 = true;
            }
            if (this.h == null) {
                this.Q = z2;
                this.H = z3;
            }
        } else {
            z2 = false;
            j3 = j4;
            z3 = true;
            this.G = null;
            this.I = 1L;
            this.H = false;
        }
        if (this.G != null) {
            z4 = z3;
        } else {
            z4 = z2;
        }
        this.F = z4;
        if (j3 != j && this.h == null && this.b0 != null) {
            this.a0 = z3;
            p();
        }
        if (this.O && this.F && this.h == null) {
            this.T = 0.0f;
            this.U = Utilities.i(((float) j) / ((float) this.S), 1.0f, 0.0f);
        }
        if (!z) {
            this.e0.f(this.H, z3);
            this.g0.f(this.Q, z3);
            this.d0.f(this.F, z3);
        }
        invalidate();
    }

    public final void o(boolean z, String str, long j, float f) {
        String str2;
        fsb fsbVar = this.h;
        if (fsbVar == null) {
            str2 = null;
        } else {
            str2 = fsbVar.d;
        }
        if (TextUtils.equals(str2, str)) {
            return;
        }
        fsb fsbVar2 = this.h;
        if (fsbVar2 != null) {
            isb isbVar = fsbVar2.c;
            if (isbVar != null) {
                isbVar.a();
                this.h.c = null;
            }
            this.h = null;
        }
        if (str != null) {
            this.f = 0L;
            fsb fsbVar3 = new fsb(this);
            this.h = fsbVar3;
            fsbVar3.b = z;
            fsbVar3.d = str;
            fsbVar3.e = j;
            fsbVar3.i = f;
            fsbVar3.a(false);
        } else {
            this.h = null;
            this.f = 0L;
        }
        if (!this.F) {
            this.H = false;
        }
        this.e = 0L;
        invalidate();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        this.M0.setTextSize(hl.L(12.0f));
        this.Q0.setTextSize(hl.L(12.0f));
        int L = hl.L(12.0f);
        this.z1 = L;
        int L2 = hl.L(5.0f);
        this.A1 = L2;
        setPadding(L, L2, hl.L(12.0f), hl.L(5.0f));
        int size = View.MeasureSpec.getSize(i);
        this.w1 = size;
        int L3 = hl.L(388.0f);
        this.x1 = L3;
        setMeasuredDimension(size, L3);
        int L4 = hl.L(10.0f);
        this.y1 = L4;
        this.v1 = (this.w1 - (L4 << 1)) - (this.z1 << 1);
        fsb fsbVar = this.h;
        if (fsbVar != null && fsbVar.d != null && fsbVar.c == null) {
            fsbVar.a(false);
        }
        ArrayList arrayList = this.s;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj = arrayList.get(i3);
                i3++;
                fsb fsbVar2 = (fsb) obj;
                if (fsbVar2.d != null && fsbVar2.c == null) {
                    fsbVar2.a(false);
                    fsbVar2.b();
                }
            }
        }
        if (this.P != null && this.b0 == null) {
            p();
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ksb.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (getMeasuredWidth() > 0) {
            if (this.b0 == null || this.a0) {
                this.b0 = new dsb(this, this.P, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.V = false;
                this.h0.e(true, 1.0f);
            }
        }
    }

    public final void q() {
        fsb fsbVar;
        fna fnaVar = new fna((byte) 9);
        ArrayList arrayList = this.s;
        Collections.sort(arrayList, fnaVar);
        if (arrayList.isEmpty()) {
            fsbVar = null;
        } else {
            fsbVar = (fsb) arrayList.get(0);
        }
        this.w = fsbVar;
        if (fsbVar != null) {
            long j = fsbVar.f;
        }
    }

    public void setCollage(ArrayList<c8b> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        isb isbVar;
        int i = 0;
        while (true) {
            arrayList2 = this.s;
            if (i >= arrayList2.size()) {
                break;
            }
            fsb fsbVar = (fsb) arrayList2.get(i);
            if (fsbVar != null && (isbVar = fsbVar.c) != null) {
                isbVar.a();
            }
            i++;
        }
        arrayList2.clear();
        int i2 = 0;
        while (true) {
            arrayList3 = this.r;
            if (i2 >= arrayList3.size()) {
                break;
            }
            dsb dsbVar = (dsb) arrayList3.get(i2);
            if (dsbVar != null) {
                dsbVar.a();
            }
            i2++;
        }
        arrayList3.clear();
        this.i0.e(true, 1.0f);
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                arrayList3.add(null);
                c8b c8bVar = arrayList.get(i3);
                if (c8bVar.K) {
                    fsb fsbVar2 = new fsb(this);
                    fsbVar2.a = i3;
                    fsbVar2.b = false;
                    fsbVar2.d = c8bVar.L.getAbsolutePath();
                    fsbVar2.e = c8bVar.h0;
                    fsbVar2.f = c8bVar.X;
                    fsbVar2.i = c8bVar.P;
                    fsbVar2.g = c8bVar.V;
                    fsbVar2.h = c8bVar.W;
                    fsbVar2.a(false);
                    fsbVar2.b();
                    arrayList2.add(fsbVar2);
                }
            }
        }
        q();
        this.n = 0;
    }

    public void setDelegate(esb esbVar) {
        this.a = esbVar;
    }

    public void setMaxCount(int i) {
        this.c0 = i;
    }

    public void setOnHeightChange(Runnable runnable) {
        this.d = runnable;
    }

    public void setOnTimelineClick(Runnable runnable) {
        this.b = runnable;
    }

    public void setProgress(long r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ksb.setProgress(long):void");
    }

    public void setRoundNull(boolean z) {
        n(null, 0L, 0L, 0.0f, 0.0f, 0.0f, z);
    }

    public void setVideoLeft(float f) {
        fsb fsbVar = this.h;
        if (fsbVar == null) {
            return;
        }
        fsbVar.g = f;
        invalidate();
    }

    public void setVideoRight(float f) {
        fsb fsbVar = this.h;
        if (fsbVar == null) {
            return;
        }
        fsbVar.h = f;
        invalidate();
    }
}
