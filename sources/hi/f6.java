package hi;

import android.app.Activity;
import android.graphics.BlendMode;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ff;
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.ve;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fq;
public final class f6 extends View implements m2 {
    public boolean A0;
    public boolean B0;
    public final org.telegram.ui.Components.u5 C0;
    public final org.telegram.ui.Components.u5 D0;
    public final Paint E;
    public final org.telegram.ui.Components.u5 E0;
    public final Paint F;
    public final org.telegram.ui.Components.u5 F0;
    public final Paint G;
    public final org.telegram.ui.Components.u5 G0;
    public final Paint H;
    public final org.telegram.ui.Components.u5 H0;
    public final Matrix I;
    public float I0;
    public final RadialGradient J;
    public final org.telegram.ui.Components.u5 J0;
    public final dc K;
    public final org.telegram.ui.Components.u5 K0;
    public final dc L;
    public final org.telegram.ui.Components.u5 L0;
    public final dc M;
    public final c6 M0;
    public float N;
    public final c6 N0;
    public final org.telegram.ui.Components.u5 O;
    public final Path O0;
    public boolean P;
    public final Path P0;
    public final org.telegram.ui.Components.u5 Q;
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
    public d6 f14275a;
    public final e6 f14276a0;
    public final ImageReceiver f14277b;
    public boolean f14278b0;
    public final fq f14279c;
    public boolean f14280c0;
    public final Drawable d;
    public boolean f14281d0;
    public final Drawable f14282e;
    public boolean f14283e0;
    public final Drawable f14284f;
    public boolean f14285f0;
    public boolean f14286g0;
    public final Drawable h;
    public float f14287h0;
    public final org.telegram.ui.Components.u5 f14288i0;
    public float f14289j0;
    public float f14290k0;
    public float f14291l0;
    public float m0;
    public final Drawable f14292n;
    public final org.telegram.ui.Components.u5 f14293n0;
    public float f14294o0;
    public boolean f14295p0;
    public final org.telegram.ui.Components.u5 f14296q0;
    public final Paint f14297r;
    public final org.telegram.ui.Components.u5 f14298r0;
    public final Paint f14299s;
    public boolean f14300s0;
    public final float[] f14301t0;
    public final org.telegram.ui.Components.u5 f14302u0;
    public boolean f14303v0;
    public final Paint f14304w;
    public long f14305w0;
    public final Paint f14306x;
    public boolean f14307x0;
    public final Paint f14308y;
    public boolean f14309y0;
    public float f14310z0;

    public f6(Activity activity) {
        super(activity);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f14277b = imageReceiver;
        this.f14297r = new Paint(1);
        Paint paint = new Paint(1);
        this.f14299s = paint;
        Paint paint2 = new Paint(1);
        this.f14304w = paint2;
        Paint paint3 = new Paint(1);
        this.f14306x = paint3;
        Paint paint4 = new Paint(1);
        this.f14308y = paint4;
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
        this.K = new dc(this);
        this.L = new dc(this);
        this.M = new dc(this);
        er erVar = er.h;
        this.O = new org.telegram.ui.Components.u5(this, 0L, 310L, erVar);
        this.Q = new org.telegram.ui.Components.u5(this, 0L, 330L, erVar);
        this.T = new Path();
        this.U = new PointF(-org.telegram.messenger.g0.N(9.666667f), org.telegram.messenger.g0.N(2.3333333f));
        this.V = new PointF(-org.telegram.messenger.g0.N(2.8333333f), org.telegram.messenger.g0.N(8.666667f));
        this.W = new PointF(org.telegram.messenger.g0.N(9.666667f), org.telegram.messenger.g0.N(-3.6666667f));
        this.f14288i0 = new org.telegram.ui.Components.u5(this, 0L, 200L, er.f34420f);
        this.f14293n0 = new org.telegram.ui.Components.u5(this, 0L, 350L, erVar);
        this.f14294o0 = -1.0f;
        this.f14295p0 = true;
        this.f14296q0 = new org.telegram.ui.Components.u5(this, 0L, 350L, erVar);
        this.f14298r0 = new org.telegram.ui.Components.u5(this, 0L, 850L, erVar);
        this.f14301t0 = new float[2];
        this.f14302u0 = new org.telegram.ui.Components.u5(this, 0L, 350L, erVar);
        this.C0 = new org.telegram.ui.Components.u5(this, 0L, 350L, erVar);
        this.D0 = new org.telegram.ui.Components.u5(this, 0L, 650L, erVar);
        this.E0 = new org.telegram.ui.Components.u5(this, 0L, 160L, er.f34422i);
        this.F0 = new org.telegram.ui.Components.u5(this, 0L, 750L, erVar);
        this.G0 = new org.telegram.ui.Components.u5(this, 0L, 650L, erVar);
        this.H0 = new org.telegram.ui.Components.u5(this, 0L, 320L, erVar);
        this.J0 = new org.telegram.ui.Components.u5(this, 0L, 320L, erVar);
        this.K0 = new org.telegram.ui.Components.u5(this, 0L, 320L, erVar);
        this.L0 = new org.telegram.ui.Components.u5(this, 0L, 320L, erVar);
        this.M0 = new c6(this, 2);
        this.N0 = new c6(this, 3);
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
        e6 e6Var = new e6(this, this);
        this.f14276a0 = e6Var;
        r0.i0.j(this, e6Var);
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(48.0f), new int[]{-577231, -577231, -1}, new float[]{0.0f, 0.64f, 1.0f}, Shader.TileMode.CLAMP);
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
        imageReceiver.H0(this);
        imageReceiver.B0 = true;
        imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
        Drawable mutate = activity.getResources().getDrawable(2131232221).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(1308622847, mode));
        fq fqVar = new fq(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(6.0f), -13750737), mutate);
        this.f14279c = fqVar;
        fqVar.f34678x = false;
        int L = org.telegram.messenger.g0.L(24.0f);
        int L2 = org.telegram.messenger.g0.L(24.0f);
        fqVar.f34672e = L;
        fqVar.f34673f = L2;
        Drawable mutate2 = activity.getResources().getDrawable(2131232286).mutate();
        this.d = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate3 = activity.getResources().getDrawable(2131232286).mutate();
        this.f14282e = mutate3;
        mutate3.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate4 = activity.getResources().getDrawable(2131232156).mutate();
        this.f14284f = mutate4;
        mutate4.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate5 = activity.getResources().getDrawable(2131232147).mutate();
        this.h = mutate5;
        mutate5.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate6 = activity.getResources().getDrawable(2131232348).mutate();
        this.f14292n = mutate6;
        mutate6.setColorFilter(new PorterDuffColorFilter(-1, mode));
        h();
    }

    public static void a(float f10, float f11, double d, float f12, PointF pointF) {
        double d2 = f12;
        pointF.x = (float) ((Math.cos(d) * d2) + f10);
        pointF.y = (float) ((Math.sin(d) * d2) + f11);
    }

    public static void f(Drawable drawable, float f10, float f11) {
        float max = Math.max(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()) / 2.0f;
        drawable.setBounds((int) (f10 - max), (int) (f11 - max), (int) (f10 + max), (int) (f11 + max));
    }

    public final boolean b() {
        if (this.I0 >= 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean c(float f10, float f11, float f12, float f13, float f14, boolean z10) {
        if (this.f14300s0) {
            if ((!z10 || f13 - f11 <= org.telegram.messenger.g0.L(100.0f)) && Math.abs(f12 - f10) <= f14) {
                return true;
            }
            return false;
        } else if (a8.t9.a(f10, f11, f12, f13) <= f14) {
            return true;
        } else {
            return false;
        }
    }

    public final void d(float f10) {
        long j3;
        if (f10 > 180.0f) {
            j3 = 620;
        } else {
            j3 = 310;
        }
        this.O.f39906g = j3;
        this.N += f10;
        invalidate();
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        e6 e6Var = this.f14276a0;
        if (e6Var != null && e6Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final void e(boolean z10, float f10) {
        boolean z11;
        if (Math.abs(f10 - this.I0) < 0.01f) {
            return;
        }
        this.I0 = f10;
        if (!z10) {
            if (f10 > 0.0f && !this.f14300s0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.J0.f(z11, true);
            this.K0.e(true, f10);
        }
        invalidate();
    }

    public final void g(boolean z10) {
        this.f14303v0 = false;
        if (!z10) {
            org.telegram.ui.Components.u5 u5Var = this.f14302u0;
            u5Var.getClass();
            u5Var.e(true, 0.0f);
        }
        invalidate();
    }

    public final void h() {
        ff ffVar;
        String str;
        ArrayList arrayList;
        d6 d6Var = this.f14275a;
        fq fqVar = this.f14279c;
        ImageReceiver imageReceiver = this.f14277b;
        if (d6Var != null) {
            ArrayList arrayList2 = np.s1(imageReceiver.d).P1().f12338w.f13862b;
            imageReceiver.G0(0, 0, true);
            if (arrayList2 != null && !arrayList2.isEmpty() && ((d7) arrayList2.get(0)).O0 != null) {
                imageReceiver.r0(gc.g(((d7) arrayList2.get(0)).O0.getAbsolutePath()), "80_80", null, null, fqVar, 0L, null, null, 0);
                return;
            }
        }
        ve veVar = MediaController.f22323a2;
        if (veVar != null && (arrayList = veVar.f26971e) != null && !arrayList.isEmpty()) {
            ffVar = (ff) arrayList.get(0);
        } else {
            ffVar = null;
        }
        if (ffVar != null && (str = ffVar.f27709c) != null) {
            imageReceiver.r0(gc.g(str), "80_80", null, null, fqVar, 0L, null, null, 0);
            return;
        }
        if (ffVar != null) {
            int i7 = ffVar.C;
            String str2 = ffVar.I;
            if (str2 != null) {
                if (ffVar.f27708b) {
                    imageReceiver.r0(gc.g("vthumb://" + i7 + ":" + str2), "80_80", null, null, fqVar, 0L, null, null, 0);
                    return;
                }
                imageReceiver.G0(ffVar.J, ffVar.K, true);
                imageReceiver.r0(gc.g("thumb://" + i7 + ":" + str2), "80_80", null, null, fqVar, 0L, null, null, 0);
                return;
            }
        }
        imageReceiver.w0(fqVar);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f14277b.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f14277b.R();
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r66) {
        throw new UnsupportedOperationException("Method not decompiled: hi.f6.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int L = org.telegram.messenger.g0.L(100.0f);
        float f10 = size;
        this.f14289j0 = f10 / 2.0f;
        this.f14290k0 = L / 2.0f;
        float min = Math.min(org.telegram.messenger.g0.L(135.0f), f10 * 0.35f);
        float f11 = this.f14289j0;
        this.f14291l0 = f11 - min;
        float f12 = f11 + min;
        this.m0 = f12;
        float f13 = this.f14290k0;
        float L2 = org.telegram.messenger.g0.L(14.0f);
        this.d.setBounds((int) (f12 - L2), (int) (f13 - L2), (int) (f12 + L2), (int) (f13 + L2));
        float f14 = this.m0;
        float f15 = this.f14290k0;
        float L3 = org.telegram.messenger.g0.L(14.0f);
        this.f14282e.setBounds((int) (f14 - L3), (int) (f15 - L3), (int) (f14 + L3), (int) (f15 + L3));
        f(this.f14284f, this.f14291l0, this.f14290k0);
        f(this.h, this.f14291l0, this.f14290k0);
        f(this.f14292n, this.f14291l0, this.f14290k0);
        this.f14277b.y0(this.f14291l0 - org.telegram.messenger.g0.L(20.0f), this.f14290k0 - org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
        Matrix matrix = this.I;
        matrix.reset();
        matrix.postTranslate(this.f14289j0, this.f14290k0);
        this.J.setLocalMatrix(matrix);
        setMeasuredDimension(size, L);
        e6 e6Var = this.f14276a0;
        if (e6Var != null) {
            e6Var.i();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int action = motionEvent.getAction();
        float i7 = Utilities.i(motionEvent.getX() + 0.0f, this.m0, this.f14291l0);
        float y10 = motionEvent.getY() + 0.0f;
        boolean c10 = c(i7, y10, this.m0, this.f14290k0, org.telegram.messenger.g0.L(7.0f), true);
        boolean z12 = this.f14303v0;
        dc dcVar = this.M;
        dc dcVar2 = this.K;
        dc dcVar3 = this.L;
        boolean z13 = true;
        boolean z14 = false;
        if (z12) {
            dcVar2.c(false);
            dcVar3.c(false);
            dcVar.c(false);
        } else if (action == 0 || this.f14307x0) {
            dcVar2.c(c(i7, y10, this.f14289j0, this.f14290k0, org.telegram.messenger.g0.L(60.0f), false));
            if (c(i7, y10, this.m0, this.f14290k0, org.telegram.messenger.g0.L(30.0f), true) && !b()) {
                z10 = true;
            } else {
                z10 = false;
            }
            dcVar3.c(z10);
            if (c(i7, y10, this.f14291l0, this.f14290k0, org.telegram.messenger.g0.L(30.0f), false) && !b()) {
                z11 = true;
            } else {
                z11 = false;
            }
            dcVar.c(z11);
        }
        c6 c6Var = this.N0;
        c6 c6Var2 = this.M0;
        if (action == 0) {
            this.f14307x0 = true;
            if (dcVar2.f33917i || dcVar3.f33917i) {
                z14 = true;
            }
            this.f14309y0 = z14;
            System.currentTimeMillis();
            this.f14310z0 = i7;
            if (Math.abs(i7 - this.f14289j0) < org.telegram.messenger.g0.L(50.0f)) {
                org.telegram.messenger.g0.i3(c6Var2, ViewConfiguration.getLongPressTimeout());
            }
            if (dcVar3.f33917i) {
                org.telegram.messenger.g0.i3(c6Var, ViewConfiguration.getLongPressTimeout());
            }
        } else if (action == 2) {
            if (this.f14307x0) {
                this.f14310z0 = Utilities.i(i7, this.m0, this.f14291l0);
                invalidate();
                if (this.f14300s0 && !this.Y0 && c10) {
                    d(180.0f);
                    ((p9) this.f14275a).b();
                }
                if (this.f14300s0 && this.A0) {
                    float i10 = Utilities.i(((this.f14290k0 - org.telegram.messenger.g0.L(48.0f)) - y10) / (org.telegram.messenger.g0.f23609q.y / 2.0f), 1.0f, 0.0f);
                    sa saVar = ((p9) this.f14275a).f14881a;
                    saVar.W0.b(true, i10);
                    saVar.i0(false);
                }
            }
            return false;
        } else if (action != 1 && action != 3) {
            z13 = false;
        } else {
            if (this.f14307x0) {
                this.f14307x0 = false;
                this.f14309y0 = false;
                org.telegram.messenger.g0.r(c6Var2);
                org.telegram.messenger.g0.r(c6Var);
                boolean z15 = this.f14300s0;
                if (!z15 && dcVar.f33917i) {
                    ((p9) this.f14275a).c();
                } else if (z15 && this.A0) {
                    if (dcVar.f33917i) {
                        this.A0 = false;
                        this.H0.e(true, 1.0f);
                        i3 i3Var = ((p9) this.f14275a).f14881a.U0;
                        i3Var.f14416a.t(hd.M0(2131744661, null), true, true);
                        i3Var.invalidate();
                    } else {
                        this.f14300s0 = false;
                        this.f14305w0 = SystemClock.elapsedRealtime();
                        this.f14303v0 = true;
                        ((p9) this.f14275a).e(false);
                    }
                } else if (dcVar2.f33917i) {
                    if (b()) {
                        ((p9) this.f14275a).a();
                    } else if (!this.f14295p0 && !this.f14300s0 && !this.A0) {
                        ((p9) this.f14275a).d();
                    } else if (!this.f14300s0) {
                        if (sa.c(((p9) this.f14275a).f14881a)) {
                            this.S = 0L;
                            this.R = System.currentTimeMillis();
                            this.B0 = false;
                            ((p9) this.f14275a).f(new c6(this, 1), false);
                        }
                    } else {
                        this.f14300s0 = false;
                        this.f14305w0 = SystemClock.elapsedRealtime();
                        this.f14303v0 = true;
                        ((p9) this.f14275a).e(false);
                    }
                }
                this.A0 = false;
                if (dcVar3.f33917i) {
                    d(180.0f);
                    ((p9) this.f14275a).b();
                }
                dcVar2.c(false);
                dcVar3.c(false);
                dcVar.c(false);
                invalidate();
            }
            return false;
        }
        this.Y0 = c10;
        return z13;
    }

    public void setDelegate(d6 d6Var) {
        this.f14275a = d6Var;
    }

    public void setDual(boolean z10) {
        if (z10 != this.P) {
            this.P = z10;
            invalidate();
        }
    }

    @Override
    public void setInvert(float f10) {
        this.f14299s.setColor(i0.a.f(f10, -1, -16777216));
        this.f14306x.setColor(i0.a.f(f10, 1677721600, 369098752));
        this.F.setColor(i0.a.f(f10, 1493172223, 285212671));
        this.G.setColor(i0.a.f(f10, 402653184, 805306368));
        int f11 = i0.a.f(f10, -1, -16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.d.setColorFilter(new PorterDuffColorFilter(f11, mode));
        this.f14284f.setColorFilter(new PorterDuffColorFilter(i0.a.f(f10, -1, -16777216), mode));
    }
}
