package defpackage;

import android.app.Activity;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
public final class j49 extends View implements qk4 {
    public boolean A0;
    public boolean B0;
    public final ln C0;
    public final ln D0;
    public final Paint E;
    public final ln E0;
    public final Paint F;
    public final ln F0;
    public final Paint G;
    public final ln G0;
    public final Paint H;
    public final ln H0;
    public final Matrix I;
    public float I0;
    public final RadialGradient J;
    public final ln J0;
    public final u51 K;
    public final ln K0;
    public final u51 L;
    public final ln L0;
    public final u51 M;
    public final h49 M0;
    public float N;
    public final h49 N0;
    public final ln O;
    public final Path O0;
    public boolean P;
    public final Path P0;
    public final ln Q;
    public final PointF Q0;
    public long R;
    public final PointF R0;
    public long S;
    public final PointF S0;
    public final Path T;
    public final PointF T0;
    public final PointF U;
    public final PointF U0;
    public final PointF V;
    public final PointF V0;
    public final PointF W;
    public final PointF W0;
    public final PointF X0;
    public boolean Y0;
    public i49 a;
    public final bz0 a0;
    public final ImageReceiver b;
    public boolean b0;
    public final sn2 c;
    public boolean c0;
    public final Drawable d;
    public boolean d0;
    public final Drawable e;
    public boolean e0;
    public final Drawable f;
    public boolean f0;
    public boolean g0;
    public final Drawable h;
    public float h0;
    public final ln i0;
    public float j0;
    public float k0;
    public float l0;
    public float m0;
    public final Drawable n;
    public final ln n0;
    public float o0;
    public boolean p0;
    public final ln q0;
    public final Paint r;
    public final ln r0;
    public final Paint s;
    public boolean s0;
    public final float[] t0;
    public final ln u0;
    public boolean v0;
    public final Paint w;
    public long w0;
    public final Paint x;
    public boolean x0;
    public final Paint y;
    public boolean y0;
    public float z0;

    public j49(Activity activity) {
        super(activity);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.b = imageReceiver;
        this.r = new Paint(1);
        Paint paint = new Paint(1);
        this.s = paint;
        Paint paint2 = new Paint(1);
        this.w = paint2;
        Paint paint3 = new Paint(1);
        this.x = paint3;
        Paint paint4 = new Paint(1);
        this.y = paint4;
        Paint paint5 = new Paint(1);
        this.E = paint5;
        Paint paint6 = new Paint(1);
        this.F = paint6;
        Paint paint7 = new Paint(1);
        this.G = paint7;
        Paint paint8 = new Paint(1);
        this.H = paint8;
        Matrix matrix = new Matrix();
        this.I = matrix;
        this.K = new u51(this);
        this.L = new u51(this);
        this.M = new u51(this);
        d53 d53Var = d53.h;
        this.O = new ln(this, 0L, 310L, d53Var);
        this.Q = new ln(this, 0L, 330L, d53Var);
        this.T = new Path();
        this.U = new PointF(-gm.N(9.666667f), gm.N(2.3333333f));
        this.V = new PointF(-gm.N(2.8333333f), gm.N(8.666667f));
        this.W = new PointF(gm.N(9.666667f), gm.N(-3.6666667f));
        this.i0 = new ln(this, 0L, 200L, d53.f);
        this.n0 = new ln(this, 0L, 350L, d53Var);
        this.o0 = -1.0f;
        this.p0 = true;
        this.q0 = new ln(this, 0L, 350L, d53Var);
        this.r0 = new ln(this, 0L, 850L, d53Var);
        this.t0 = new float[2];
        this.u0 = new ln(this, 0L, 350L, d53Var);
        this.C0 = new ln(this, 0L, 350L, d53Var);
        this.D0 = new ln(this, 0L, 650L, d53Var);
        this.E0 = new ln(this, 0L, 160L, d53.i);
        this.F0 = new ln(this, 0L, 750L, d53Var);
        this.G0 = new ln(this, 0L, 650L, d53Var);
        this.H0 = new ln(this, 0L, 320L, d53Var);
        this.J0 = new ln(this, 0L, 320L, d53Var);
        this.K0 = new ln(this, 0L, 320L, d53Var);
        this.L0 = new ln(this, 0L, 320L, d53Var);
        this.M0 = new h49(this, (byte) 2);
        this.N0 = new h49(this, (byte) 3);
        this.O0 = new Path();
        this.P0 = new Path();
        this.Q0 = new PointF();
        this.R0 = new PointF();
        this.S0 = new PointF();
        this.T0 = new PointF();
        this.U0 = new PointF();
        this.V0 = new PointF();
        this.W0 = new PointF();
        this.X0 = new PointF();
        setWillNotDraw(false);
        bz0 bz0Var = new bz0(this, this);
        this.a0 = bz0Var;
        kfc.k(this, bz0Var);
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, gm.L(48.0f), new int[]{-577231, -577231, -1}, new float[]{0.0f, 0.64f, 1.0f}, Shader.TileMode.CLAMP);
        this.J = radialGradient;
        radialGradient.setLocalMatrix(matrix);
        paint5.setShader(radialGradient);
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setColor(-577231);
        paint2.setStrokeCap(cap);
        paint2.setStyle(style);
        paint3.setColor(1677721600);
        paint4.setColor(-1);
        paint6.setColor(1493172223);
        paint7.setColor(402653184);
        paint6.setStyle(style);
        paint6.setStrokeCap(cap);
        paint7.setStyle(style);
        paint7.setStrokeCap(cap);
        paint8.setStyle(style);
        paint8.setStrokeJoin(Paint.Join.ROUND);
        paint8.setStrokeCap(cap);
        if (Build.VERSION.SDK_INT >= 29) {
            paint8.setBlendMode(BlendMode.CLEAR);
        } else {
            paint8.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        imageReceiver.p0(this);
        imageReceiver.B0 = true;
        imageReceiver.q0(gm.L(6.0f));
        Drawable mutate = activity.getResources().getDrawable(2131232226).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(1308622847, mode));
        sn2 sn2Var = new sn2(cmb.b0(gm.L(6.0f), -13750737), mutate);
        this.c = sn2Var;
        sn2Var.x = false;
        int L = gm.L(24.0f);
        int L2 = gm.L(24.0f);
        sn2Var.e = L;
        sn2Var.f = L2;
        Drawable mutate2 = activity.getResources().getDrawable(2131232291).mutate();
        this.d = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate3 = activity.getResources().getDrawable(2131232291).mutate();
        this.e = mutate3;
        mutate3.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate4 = activity.getResources().getDrawable(2131232161).mutate();
        this.f = mutate4;
        mutate4.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate5 = activity.getResources().getDrawable(2131232152).mutate();
        this.h = mutate5;
        mutate5.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate6 = activity.getResources().getDrawable(2131232353).mutate();
        this.n = mutate6;
        mutate6.setColorFilter(new PorterDuffColorFilter(-1, mode));
        h();
    }

    public static void a(float f, float f2, double d, float f3, PointF pointF) {
        double d2 = f3;
        pointF.x = (float) ((Math.cos(d) * d2) + f);
        pointF.y = (float) ((Math.sin(d) * d2) + f2);
    }

    public static void f(Drawable drawable, float f, float f2) {
        float max = Math.max(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()) / 2.0f;
        drawable.setBounds((int) (f - max), (int) (f2 - max), (int) (f + max), (int) (f2 + max));
    }

    public final boolean b() {
        if (this.I0 >= 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean c(float f, float f2, float f3, float f4, float f5, boolean z) {
        if (this.s0) {
            if ((!z || f4 - f2 <= gm.L(100.0f)) && Math.abs(f3 - f) <= f5) {
                return true;
            }
            return false;
        } else if (oqe.a(f, f2, f3, f4) <= f5) {
            return true;
        } else {
            return false;
        }
    }

    public final void d(float f) {
        long j;
        if (f > 180.0f) {
            j = 620;
        } else {
            j = 310;
        }
        this.O.g = j;
        this.N += f;
        invalidate();
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        bz0 bz0Var = this.a0;
        if (bz0Var != null && bz0Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final void e(boolean z, float f) {
        boolean z2;
        if (Math.abs(f - this.I0) < 0.01f) {
            return;
        }
        this.I0 = f;
        if (!z) {
            if (f > 0.0f && !this.s0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.J0.f(z2, true);
            this.K0.e(true, f);
        }
        invalidate();
    }

    public final void g(boolean z) {
        this.v0 = false;
        if (!z) {
            ln lnVar = this.u0;
            lnVar.getClass();
            lnVar.e(true, 0.0f);
        }
        invalidate();
    }

    public final void h() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j49.h():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.I();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.b.K();
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        boolean z;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        ?? r21;
        Canvas canvas2;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        RectF rectF;
        Paint paint;
        float f22;
        float f23;
        RectF rectF2;
        float f24;
        float f25;
        boolean z2;
        boolean z3;
        RectF rectF3;
        float f26;
        long j;
        Canvas canvas3;
        float f27;
        float f28;
        float f29;
        float f30;
        float f31;
        float f32;
        int i;
        Drawable drawable;
        ln lnVar;
        u51 u51Var;
        float f33;
        float f34;
        float f35;
        float f36;
        double d;
        double d2;
        float f37;
        if (this.s0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        float e = this.q0.e(false, f);
        if (this.s0) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        float e2 = this.r0.e(false, f2);
        float f38 = this.o0;
        if (f38 < 0.0f) {
            if (this.p0) {
                f37 = 1.0f;
            } else {
                f37 = 0.0f;
            }
            f38 = this.n0.e(false, f37);
        }
        float max = Math.max(e, f38);
        if (this.x0) {
            f3 = 1.0f;
        } else {
            f3 = 0.0f;
        }
        float e3 = this.C0.e(false, f3);
        int i2 = (Math.abs(this.z0 - this.j0) > gm.L(64.0f) ? 1 : (Math.abs(this.z0 - this.j0) == gm.L(64.0f) ? 0 : -1));
        u51 u51Var2 = this.K;
        if (i2 < 0 && (this.s0 || u51Var2.i)) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        float e4 = this.D0.e(false, f4) * e3;
        if (Math.abs(this.z0 - this.j0) < gm.L(64.0f)) {
            f5 = 1.0f;
        } else {
            f5 = 0.0f;
        }
        float e5 = this.E0.e(false, f5) * e3;
        float i3 = Utilities.i((this.z0 - this.j0) / gm.L(16.0f), 1.0f, -1.0f);
        float i4 = Utilities.i((this.z0 - this.j0) / gm.L(64.0f), 1.0f, -1.0f);
        if (Math.min(Math.abs(this.z0 - this.m0), Math.abs(this.z0 - this.l0)) < gm.L(16.0f)) {
            f6 = 1.0f;
        } else {
            f6 = 0.0f;
        }
        float e6 = this.G0.e(false, f6) * e3;
        if (this.I0 > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        float f39 = 1.0f - e;
        float d3 = this.J0.d(z) * f39;
        float e7 = this.K0.e(false, this.I0);
        float d4 = this.L0.d(b());
        if (this.A0) {
            f7 = e * max * e3;
        } else {
            f7 = 0.0f;
        }
        if (f7 > 0.0f) {
            f11 = 1.0f;
            float L = this.j0 - gm.L(50.0f);
            f12 = 0.0f;
            float L2 = this.j0 + gm.L(50.0f);
            Paint paint2 = this.F;
            paint2.setStrokeWidth(gm.L(2.0f));
            Paint paint3 = this.G;
            paint3.setStrokeWidth(gm.L(2.0f));
            f14 = d3;
            float f40 = f7;
            f13 = e2;
            f9 = e6;
            f8 = e5;
            r21 = 1;
            f10 = d4;
            canvas.drawLine(L2, this.k0, gm.R1(L2, this.m0 - gm.L(30.0f), f7), this.k0, paint3);
            canvas.drawLine(L2, this.k0, gm.R1(L2, this.m0 - gm.L(30.0f), f40), this.k0, paint2);
            canvas.drawLine(L, this.k0, gm.R1(L, this.l0 + gm.L(30.0f), f40), this.k0, paint3);
            canvas2 = canvas;
            canvas2.drawLine(L, this.k0, gm.R1(L, this.l0 + gm.L(30.0f), f40), this.k0, paint2);
        } else {
            f8 = e5;
            f9 = e6;
            f10 = d4;
            f11 = 1.0f;
            f12 = 0.0f;
            f13 = e2;
            r21 = 1;
            canvas2 = canvas;
            f14 = d3;
        }
        float f41 = this.j0;
        float R1 = gm.R1(f41, this.F0.e(false, (gm.L(4.0f) * i3) + f41), e4);
        float R12 = gm.R1(gm.U1(e, gm.L(29.0f), gm.L(12.0f)), gm.L(32.0f) - (Math.abs(i4) * gm.L(4.0f)), e4);
        float U1 = gm.U1(e4, gm.U1(e, gm.L(32.0f), gm.L(7.0f)), gm.L(32.0f));
        if (this.p0) {
            f15 = f12;
        } else {
            f15 = 0.2f;
        }
        float R13 = gm.R1(u51Var2.a(f15), (this.i0.e(false, this.h0) * 0.2f) + f11, e);
        RectF rectF4 = gm.P;
        float f42 = R1 - R12;
        float f43 = this.k0;
        float f44 = R1 + R12;
        rectF4.set(f42, f43 - R12, f44, f43 + R12);
        float f45 = f11 - f10;
        int f46 = on2.f(max * f45, -1, -577231);
        Paint paint4 = this.r;
        paint4.setColor(f46);
        int i5 = (f10 > f12 ? 1 : (f10 == f12 ? 0 : -1));
        if (i5 > 0) {
            canvas2.save();
            canvas2.scale(R13, R13, this.j0, this.k0);
            paint4.setAlpha((int) (f45 * 255.0f));
            canvas2.drawRoundRect(rectF4, U1, U1, paint4);
            canvas2.restore();
            f17 = f44;
            f18 = e;
            f19 = e3;
            f20 = f42;
            f16 = f45;
            paint = paint4;
            f21 = R13;
            rectF = rectF4;
            f22 = max;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            f16 = f45;
            f17 = f44;
            f18 = e;
            f19 = e3;
            f20 = f42;
            f21 = R13;
            rectF = rectF4;
            paint = paint4;
            f22 = max;
            canvas2.save();
        }
        canvas2.scale(f21, f21, this.j0, this.k0);
        paint.setAlpha(255);
        canvas2.drawRoundRect(rectF, U1, U1, paint);
        if (i5 > 0) {
            Paint paint5 = this.H;
            paint5.setStrokeWidth(gm.L(4.0f));
            Path path = this.T;
            path.rewind();
            PointF pointF = this.U;
            f25 = 0.7f;
            path.moveTo(pointF.x, pointF.y);
            float f47 = pointF.x;
            PointF pointF2 = this.V;
            float f48 = f10 / 0.3f;
            f23 = 0.3f;
            rectF2 = rectF;
            f24 = U1;
            float f49 = f11;
            float f50 = f12;
            path.lineTo(gm.R1(f47, pointF2.x, Utilities.i(f48, f49, f50)), gm.R1(pointF.y, pointF2.y, Utilities.i(f48, f49, f50)));
            if (f10 > 0.3f) {
                float f51 = pointF2.x;
                PointF pointF3 = this.W;
                float f52 = (f10 - 0.3f) / 0.7f;
                path.lineTo(gm.R1(f51, pointF3.x, Utilities.i(f52, f49, f50)), gm.R1(pointF2.y, pointF3.y, Utilities.i(f52, f49, f50)));
            }
            canvas2.translate(this.j0, this.k0);
            canvas2.drawPath(path, paint5);
        } else {
            f23 = 0.3f;
            rectF2 = rectF;
            f24 = U1;
            f25 = 0.7f;
        }
        canvas2.restore();
        canvas2.save();
        float max2 = Math.max(f21, 1.0f);
        canvas2.scale(max2, max2, this.j0, this.k0);
        float max3 = Math.max(gm.N(33.5f), ((1.0f - e4) * gm.L(5.0f) * f14) + gm.R1(gm.N(4.5f), gm.L(9.0f), e4) + R12);
        float U12 = gm.U1(f14, gm.L(3.0f), gm.L(4.0f));
        float R14 = gm.R1(max3, (R12 - U12) - gm.L(4.0f), f10);
        float f53 = this.j0;
        float f54 = this.k0;
        RectF rectF5 = rectF2;
        rectF5.set(f53 - R14, f54 - R14, f53 + R14, f54 + R14);
        Paint paint6 = this.s;
        paint6.setStrokeWidth(U12);
        paint6.setAlpha((int) (gm.R1(1.0f, f23, f14) * 255.0f * f16));
        canvas2.drawCircle(this.j0, this.k0, R14, paint6);
        if (f14 > 0.0f) {
            z2 = r21;
        } else {
            z2 = false;
        }
        if (e7 > 0.0f) {
            z3 = r21;
        } else {
            z3 = false;
        }
        if (z2 & z3) {
            paint6.setAlpha(255);
            rectF3 = rectF5;
            canvas2.drawArc(rectF3, -90.0f, e7 * 360.0f, false, paint6);
        } else {
            rectF3 = rectF5;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.R;
        if (this.s0) {
            f26 = 0.0f;
        } else {
            f26 = 1.0f - f13;
        }
        if (this.a != null) {
            j = 177000;
        } else {
            j = 60000;
        }
        long j2 = j;
        float min = Math.min((((float) currentTimeMillis) / 60000.0f) * 360.0f, 360.0f);
        float d5 = this.u0.d(this.v0);
        Paint paint7 = this.w;
        paint7.setStrokeWidth(U12);
        paint7.setAlpha((int) (Math.max(d5 * f25, 1.0f - f26) * 255.0f));
        if (d5 <= 0.0f) {
            canvas3 = canvas;
            canvas3.drawArc(rectF3, -90.0f, min, false, paint7);
        } else {
            float[] fArr = this.t0;
            wi2.a((float) ((SystemClock.elapsedRealtime() - this.w0) % 5400), fArr);
            invalidate();
            float f55 = fArr[0];
            float f56 = fArr[r21];
            float f57 = (f55 + f56) / 2.0f;
            float abs = Math.abs(f56 - f55) / 2.0f;
            if (this.v0) {
                float f58 = min / 2.0f;
                f57 = gm.R1((-90.0f) + f58, f57, d5);
                abs = gm.R1(f58, abs, d5);
            }
            float f59 = f57 - abs;
            float f60 = abs * 2.0f;
            canvas3 = canvas;
            canvas3.drawArc(rectF3, f59, f60, false, paint7);
        }
        if (this.s0) {
            invalidate();
            long j3 = currentTimeMillis / 1000;
            if (j3 != this.S / 1000) {
                ((v8b) this.a).a.K0.a(j3, r21);
            }
            if (j2 > 0 && currentTimeMillis >= j2) {
                post(new h49(this, (byte) 0));
            }
            this.S = currentTimeMillis;
        }
        canvas3.restore();
        boolean z4 = this.B0;
        Paint paint8 = this.x;
        u51 u51Var3 = this.M;
        if (z4) {
            float a = u51Var3.a(0.2f) * f18;
            if (a > 0.0f) {
                canvas3.save();
                canvas3.scale(a, a, this.l0, this.k0);
                canvas3.drawCircle(this.l0, this.k0, gm.L(22.0f), paint8);
                canvas3.rotate(-getRotation(), this.l0, this.k0);
                this.f.draw(canvas3);
                canvas3.restore();
            }
        }
        float a2 = u51Var3.a(0.2f) * f39 * f16;
        if (a2 > 0.0f) {
            canvas3.save();
            canvas3.scale(a2, a2, this.l0, this.k0);
            canvas3.rotate(-getRotation(), this.l0, this.k0);
            this.b.h(canvas3, null);
            canvas3.restore();
        }
        if (this.P) {
            f27 = 1.0f;
        } else {
            f27 = 0.0f;
        }
        float e8 = this.Q.e(false, f27);
        int i6 = (e8 > 0.0f ? 1 : (e8 == 0.0f ? 0 : -1));
        Drawable drawable2 = this.e;
        Paint paint9 = this.y;
        ln lnVar2 = this.O;
        u51 u51Var4 = this.L;
        if (i6 > 0) {
            canvas3.save();
            float a3 = u51Var4.a(0.2f) * e8 * f16;
            canvas3.scale(a3, a3, this.m0, this.k0);
            canvas3.rotate(lnVar2.e(false, this.N) - getRotation(), this.m0, this.k0);
            canvas3.drawCircle(this.m0, this.k0, gm.L(22.0f), paint9);
            drawable2.draw(canvas3);
            canvas3.restore();
        }
        if (e8 < 1.0f) {
            canvas3.save();
            f28 = f16;
            float z5 = td4.z(1.0f, e8, u51Var4.a(0.2f), f28);
            canvas3.scale(z5, z5, this.m0, this.k0);
            canvas3.rotate(lnVar2.e(false, this.N) - getRotation(), this.m0, this.k0);
            canvas3.drawCircle(this.m0, this.k0, gm.L(22.0f), paint8);
            this.d.draw(canvas3);
            canvas3.restore();
        } else {
            f28 = f16;
        }
        if (this.A0 && !b()) {
            float f61 = f9;
            f29 = gm.R1(gm.L(16.0f), gm.R1((Math.abs(i4) * gm.L(8.0f)) + gm.L(8.0f), gm.L(22.0f), f61), Math.max(f61, e4)) * f19 * f22 * f18;
        } else {
            f29 = 0.0f;
        }
        if (!this.A0 && this.s0) {
            f30 = 1.0f;
        } else {
            f30 = 0.0f;
        }
        float e9 = this.H0.e(false, f30);
        int i7 = (f29 > 0.0f ? 1 : (f29 == 0.0f ? 0 : -1));
        if (i7 > 0) {
            Paint paint10 = this.E;
            paint10.setAlpha(255);
            canvas3.drawCircle(this.z0, this.k0, f29, paint10);
            float f62 = this.z0;
            f32 = 22.0f;
            float f63 = f29;
            float i8 = Utilities.i(1.0f - ((Math.abs(i4) * f19) / 1.3f), 1.0f, 0.0f);
            float abs2 = Math.abs(R1 - f62);
            if (abs2 < R12 + (f63 * 2.0f) && i8 < 0.6f) {
                float f64 = R12 + f63;
                double d6 = 0.0d;
                if (abs2 < f64) {
                    float f65 = R12 * R12;
                    float f66 = abs2 * abs2;
                    float f67 = f63 * f63;
                    f36 = abs2;
                    f31 = e9;
                    double acos = Math.acos(((f65 + f66) - f67) / ((R12 * 2.0f) * abs2));
                    d2 = Math.acos(((f67 + f66) - f65) / (f35 * f36));
                    d = acos;
                } else {
                    f36 = abs2;
                    f31 = e9;
                    d = 0.0d;
                    d2 = 0.0d;
                }
                if (f62 <= R1) {
                    d6 = 3.141592653589793d;
                }
                double d7 = d;
                double acos2 = (float) Math.acos((R12 - f63) / f36);
                double d8 = acos2 - d7;
                double d9 = i8;
                double d10 = d8 * d9;
                double d11 = d6 + d7 + d10;
                double d12 = (d6 - d7) - d10;
                double d13 = ((3.141592653589793d - d2) - acos2) * d9;
                double d14 = ((d6 + 3.141592653589793d) - d2) - d13;
                double d15 = (d6 - 3.141592653589793d) + d2 + d13;
                float f68 = this.k0;
                PointF pointF4 = this.Q0;
                a(R1, f68, d11, R12, pointF4);
                float f69 = this.k0;
                PointF pointF5 = this.R0;
                a(R1, f69, d12, R12, pointF5);
                float f70 = this.k0;
                PointF pointF6 = this.S0;
                a(f62, f70, d14, f63, pointF6);
                float f71 = this.k0;
                i = i7;
                PointF pointF7 = this.T0;
                a(f62, f71, d15, f63, pointF7);
                f34 = f63;
                f33 = f28;
                drawable = drawable2;
                lnVar = lnVar2;
                u51Var = u51Var4;
                float min2 = Math.min(1.0f, (f36 * 2.0f) / f64) * Math.min(i8 * 2.4f, oqe.a(pointF4.x, pointF4.y, pointF6.x, pointF6.y) / f64);
                float f72 = R12 * min2;
                float f73 = f34 * min2;
                a(pointF4.x, pointF4.y, d11 - 1.5707963705062866d, f72, this.U0);
                a(pointF5.x, pointF5.y, d12 + 1.5707963705062866d, f72, this.V0);
                a(pointF6.x, pointF6.y, d14 + 1.5707963705062866d, f73, this.W0);
                a(pointF7.x, pointF7.y, d15 - 1.5707963705062866d, f73, this.X0);
                float f74 = f18;
                float C = mlb.C(f19, f22, f74, f8);
                if (C > 0.0f) {
                    Path path2 = this.O0;
                    path2.rewind();
                    path2.moveTo(pointF4.x, pointF4.y);
                    PointF pointF8 = this.U0;
                    float f75 = pointF8.x;
                    float f76 = pointF8.y;
                    f18 = f74;
                    PointF pointF9 = this.W0;
                    path2.cubicTo(f75, f76, pointF9.x, pointF9.y, pointF6.x, pointF6.y);
                    path2.lineTo(pointF7.x, pointF7.y);
                    PointF pointF10 = this.X0;
                    float f77 = pointF10.x;
                    float f78 = pointF10.y;
                    PointF pointF11 = this.V0;
                    path2.cubicTo(f77, f78, pointF11.x, pointF11.y, pointF5.x, pointF5.y);
                    path2.lineTo(pointF4.x, pointF4.y);
                    paint10.setAlpha((int) (C * 255.0f));
                    canvas3.drawPath(path2, paint10);
                    float f79 = this.k0;
                    rectF3.set(f20, f79 - R12, f17, f79 + R12);
                    float f80 = f24;
                    canvas3.drawRoundRect(rectF3, f80, f80, paint10);
                } else {
                    f18 = f74;
                }
            } else {
                f31 = e9;
                i = i7;
                drawable = drawable2;
                lnVar = lnVar2;
                u51Var = u51Var4;
                f33 = f28;
                f34 = f63;
            }
        } else {
            f31 = e9;
            f32 = 22.0f;
            i = i7;
            drawable = drawable2;
            lnVar = lnVar2;
            u51Var = u51Var4;
            f33 = f28;
            f34 = f29;
        }
        if (i > 0 || f31 > 0.0f) {
            float a4 = u51Var3.a(0.2f) * f18 * f33;
            canvas3.save();
            Path path3 = this.P0;
            path3.rewind();
            if (i > 0) {
                path3.addCircle(this.z0, this.k0, f34, Path.Direction.CW);
            }
            if (f31 > 0.0f && this.B0) {
                path3.addCircle(this.l0, this.k0, gm.L(f32) * f31 * a4, Path.Direction.CW);
            }
            canvas3.clipPath(path3);
            if (this.B0) {
                canvas3.save();
                canvas3.scale(a4, a4, this.l0, this.k0);
                canvas3.drawCircle(this.l0, this.k0, gm.L(f32), paint9);
                canvas3.rotate(-getRotation(), this.l0, this.k0);
                this.h.draw(canvas3);
                canvas3.restore();
            }
            float a5 = u51Var.a(0.2f) * f33;
            canvas3.save();
            canvas3.scale(a5, a5, this.m0, this.k0);
            canvas3.rotate(lnVar.e(false, this.N) - getRotation(), this.m0, this.k0);
            canvas3.drawCircle(this.m0, this.k0, gm.L(f32), paint9);
            drawable.draw(canvas3);
            canvas3.restore();
            canvas3.restore();
        }
        bz0 bz0Var = this.a0;
        if (bz0Var != null) {
            boolean b = b();
            boolean z6 = this.b0;
            boolean z7 = this.s0;
            if (z6 == z7 && this.c0 == b && this.d0 == this.P && this.e0 == this.p0 && this.f0 == this.v0 && this.g0 == this.B0) {
                return;
            }
            this.b0 = z7;
            this.c0 = b;
            this.d0 = this.P;
            this.e0 = this.p0;
            this.f0 = this.v0;
            this.g0 = this.B0;
            bz0Var.i();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int L = gm.L(100.0f);
        float f = size;
        this.j0 = f / 2.0f;
        this.k0 = L / 2.0f;
        float min = Math.min(gm.L(135.0f), f * 0.35f);
        float f2 = this.j0;
        this.l0 = f2 - min;
        float f3 = f2 + min;
        this.m0 = f3;
        float f4 = this.k0;
        float L2 = gm.L(14.0f);
        this.d.setBounds((int) (f3 - L2), (int) (f4 - L2), (int) (f3 + L2), (int) (f4 + L2));
        float f5 = this.m0;
        float f6 = this.k0;
        float L3 = gm.L(14.0f);
        this.e.setBounds((int) (f5 - L3), (int) (f6 - L3), (int) (f5 + L3), (int) (f6 + L3));
        f(this.f, this.l0, this.k0);
        f(this.h, this.l0, this.k0);
        f(this.n, this.l0, this.k0);
        this.b.i0(this.l0 - gm.L(20.0f), this.k0 - gm.L(20.0f), gm.L(40.0f), gm.L(40.0f));
        Matrix matrix = this.I;
        matrix.reset();
        matrix.postTranslate(this.j0, this.k0);
        this.J.setLocalMatrix(matrix);
        setMeasuredDimension(size, L);
        bz0 bz0Var = this.a0;
        if (bz0Var != null) {
            bz0Var.i();
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j49.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(i49 i49Var) {
        this.a = i49Var;
    }

    public void setDual(boolean z) {
        if (z != this.P) {
            this.P = z;
            invalidate();
        }
    }

    @Override
    public void setInvert(float f) {
        this.s.setColor(on2.f(f, -1, -16777216));
        this.x.setColor(on2.f(f, 1677721600, 369098752));
        this.F.setColor(on2.f(f, 1493172223, 285212671));
        this.G.setColor(on2.f(f, 402653184, 805306368));
        int f2 = on2.f(f, -1, -16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.d.setColorFilter(new PorterDuffColorFilter(f2, mode));
        this.f.setColorFilter(new PorterDuffColorFilter(on2.f(f, -1, -16777216), mode));
    }
}
