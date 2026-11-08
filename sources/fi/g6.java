package fi;

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
import org.telegram.messenger.gf;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.we;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
public final class g6 extends View implements o2 {
    public boolean A0;
    public final org.telegram.ui.Components.w5 B0;
    public final org.telegram.ui.Components.w5 C0;
    public final Paint D;
    public final org.telegram.ui.Components.w5 D0;
    public final Paint E;
    public final org.telegram.ui.Components.w5 E0;
    public final Paint F;
    public final org.telegram.ui.Components.w5 F0;
    public final Paint G;
    public final org.telegram.ui.Components.w5 G0;
    public final Matrix H;
    public float H0;
    public final RadialGradient I;
    public final org.telegram.ui.Components.w5 I0;
    public final ic J;
    public final org.telegram.ui.Components.w5 J0;
    public final ic K;
    public final org.telegram.ui.Components.w5 K0;
    public final ic L;
    public final d6 L0;
    public float M;
    public final d6 M0;
    public final org.telegram.ui.Components.w5 N;
    public final Path N0;
    public boolean O;
    public final Path O0;
    public final org.telegram.ui.Components.w5 P;
    public final PointF P0;
    public long Q;
    public final PointF Q0;
    public long R;
    public final PointF R0;
    public final Path S;
    public final PointF S0;
    public final PointF T;
    public final PointF T0;
    public final PointF U;
    public final PointF U0;
    public final PointF V;
    public final PointF V0;
    public final f6 W;
    public final PointF W0;
    public boolean X0;
    public e6 f12071a;
    public boolean f12072a0;
    public final ImageReceiver f12073b;
    public boolean f12074b0;
    public final xp f12075c;
    public boolean f12076c0;
    public final Drawable d;
    public boolean f12077d0;
    public final Drawable f12078e;
    public boolean f12079e0;
    public final Drawable f12080f;
    public boolean f12081f0;
    public float f12082g0;
    public final Drawable h;
    public final org.telegram.ui.Components.w5 f12083h0;
    public float f12084i0;
    public float f12085j0;
    public float f12086k0;
    public float f12087l0;
    public final org.telegram.ui.Components.w5 m0;
    public final Drawable f12088n;
    public float f12089n0;
    public boolean f12090o0;
    public final org.telegram.ui.Components.w5 f12091p0;
    public final org.telegram.ui.Components.w5 f12092q0;
    public final Paint f12093r;
    public boolean f12094r0;
    public final Paint f12095s;
    public final float[] f12096s0;
    public final org.telegram.ui.Components.w5 f12097t0;
    public boolean f12098u0;
    public long f12099v0;
    public final Paint f12100w;
    public boolean f12101w0;
    public final Paint f12102x;
    public boolean f12103x0;
    public final Paint f12104y;
    public float f12105y0;
    public boolean f12106z0;

    public g6(Activity activity) {
        super(activity);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f12073b = imageReceiver;
        this.f12093r = new Paint(1);
        Paint paint = new Paint(1);
        this.f12095s = paint;
        Paint paint2 = new Paint(1);
        this.f12100w = paint2;
        Paint paint3 = new Paint(1);
        this.f12102x = paint3;
        Paint paint4 = new Paint(1);
        this.f12104y = paint4;
        Paint paint5 = new Paint(1);
        this.D = paint5;
        Paint paint6 = new Paint(1);
        this.E = paint6;
        Paint paint7 = new Paint(1);
        this.F = paint7;
        Paint paint8 = new Paint(1);
        this.G = paint8;
        Matrix matrix = new Matrix();
        this.H = matrix;
        this.J = new ic(this);
        this.K = new ic(this);
        this.L = new ic(this);
        xq xqVar = xq.h;
        this.N = new org.telegram.ui.Components.w5(this, 0L, 310L, xqVar);
        this.P = new org.telegram.ui.Components.w5(this, 0L, 330L, xqVar);
        this.S = new Path();
        this.T = new PointF(-org.telegram.messenger.g0.N(9.666667f), org.telegram.messenger.g0.N(2.3333333f));
        this.U = new PointF(-org.telegram.messenger.g0.N(2.8333333f), org.telegram.messenger.g0.N(8.666667f));
        this.V = new PointF(org.telegram.messenger.g0.N(9.666667f), org.telegram.messenger.g0.N(-3.6666667f));
        this.f12083h0 = new org.telegram.ui.Components.w5(this, 0L, 200L, xq.f40366f);
        this.m0 = new org.telegram.ui.Components.w5(this, 0L, 350L, xqVar);
        this.f12089n0 = -1.0f;
        this.f12090o0 = true;
        this.f12091p0 = new org.telegram.ui.Components.w5(this, 0L, 350L, xqVar);
        this.f12092q0 = new org.telegram.ui.Components.w5(this, 0L, 850L, xqVar);
        this.f12096s0 = new float[2];
        this.f12097t0 = new org.telegram.ui.Components.w5(this, 0L, 350L, xqVar);
        this.B0 = new org.telegram.ui.Components.w5(this, 0L, 350L, xqVar);
        this.C0 = new org.telegram.ui.Components.w5(this, 0L, 650L, xqVar);
        this.D0 = new org.telegram.ui.Components.w5(this, 0L, 160L, xq.f40368i);
        this.E0 = new org.telegram.ui.Components.w5(this, 0L, 750L, xqVar);
        this.F0 = new org.telegram.ui.Components.w5(this, 0L, 650L, xqVar);
        this.G0 = new org.telegram.ui.Components.w5(this, 0L, 320L, xqVar);
        this.I0 = new org.telegram.ui.Components.w5(this, 0L, 320L, xqVar);
        this.J0 = new org.telegram.ui.Components.w5(this, 0L, 320L, xqVar);
        this.K0 = new org.telegram.ui.Components.w5(this, 0L, 320L, xqVar);
        this.L0 = new d6(this, 2);
        this.M0 = new d6(this, 3);
        this.N0 = new Path();
        this.O0 = new Path();
        this.P0 = new PointF();
        this.Q0 = new PointF();
        this.R0 = new PointF();
        this.S0 = new PointF();
        this.T0 = new PointF();
        this.U0 = new PointF();
        this.V0 = new PointF();
        this.W0 = new PointF();
        setWillNotDraw(false);
        f6 f6Var = new f6(this, this);
        this.W = f6Var;
        r0.i0.j(this, f6Var);
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(48.0f), new int[]{-577231, -577231, -1}, new float[]{0.0f, 0.64f, 1.0f}, Shader.TileMode.CLAMP);
        this.I = radialGradient;
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
        imageReceiver.A0 = true;
        imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
        Drawable mutate = activity.getResources().getDrawable(2131232220).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(1308622847, mode));
        xp xpVar = new xp(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(6.0f), -13750737), mutate);
        this.f12075c = xpVar;
        xpVar.f40361x = false;
        int L = org.telegram.messenger.g0.L(24.0f);
        int L2 = org.telegram.messenger.g0.L(24.0f);
        xpVar.f40355e = L;
        xpVar.f40356f = L2;
        Drawable mutate2 = activity.getResources().getDrawable(2131232285).mutate();
        this.d = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate3 = activity.getResources().getDrawable(2131232285).mutate();
        this.f12078e = mutate3;
        mutate3.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate4 = activity.getResources().getDrawable(2131232155).mutate();
        this.f12080f = mutate4;
        mutate4.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate5 = activity.getResources().getDrawable(2131232146).mutate();
        this.h = mutate5;
        mutate5.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate6 = activity.getResources().getDrawable(2131232347).mutate();
        this.f12088n = mutate6;
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
        if (this.H0 >= 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean c(float f10, float f11, float f12, float f13, float f14, boolean z9) {
        if (this.f12094r0) {
            if ((!z9 || f13 - f11 <= org.telegram.messenger.g0.L(100.0f)) && Math.abs(f12 - f10) <= f14) {
                return true;
            }
            return false;
        } else if (a8.r9.a(f10, f11, f12, f13) <= f14) {
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
        this.N.f39808g = j3;
        this.M += f10;
        invalidate();
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        f6 f6Var = this.W;
        if (f6Var != null && f6Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final void e(boolean z9, float f10) {
        boolean z10;
        if (Math.abs(f10 - this.H0) < 0.01f) {
            return;
        }
        this.H0 = f10;
        if (!z9) {
            if (f10 > 0.0f && !this.f12094r0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.I0.f(z10, true);
            this.J0.e(true, f10);
        }
        invalidate();
    }

    public final void g(boolean z9) {
        this.f12098u0 = false;
        if (!z9) {
            org.telegram.ui.Components.w5 w5Var = this.f12097t0;
            w5Var.getClass();
            w5Var.e(true, 0.0f);
        }
        invalidate();
    }

    public final void h() {
        gf gfVar;
        String str;
        ArrayList arrayList;
        e6 e6Var = this.f12071a;
        xp xpVar = this.f12075c;
        ImageReceiver imageReceiver = this.f12073b;
        if (e6Var != null) {
            ArrayList arrayList2 = qp.s1(imageReceiver.d).P1().f9982w.f13230b;
            imageReceiver.G0(0, 0, true);
            if (arrayList2 != null && !arrayList2.isEmpty() && ((e7) arrayList2.get(0)).O0 != null) {
                imageReceiver.r0(hc.g(((e7) arrayList2.get(0)).O0.getAbsolutePath()), "80_80", null, null, xpVar, 0L, null, null, 0);
                return;
            }
        }
        we weVar = MediaController.Z1;
        if (weVar != null && (arrayList = weVar.f26300e) != null && !arrayList.isEmpty()) {
            gfVar = (gf) arrayList.get(0);
        } else {
            gfVar = null;
        }
        if (gfVar != null && (str = gfVar.f26846c) != null) {
            imageReceiver.r0(hc.g(str), "80_80", null, null, xpVar, 0L, null, null, 0);
            return;
        }
        if (gfVar != null) {
            int i7 = gfVar.C;
            String str2 = gfVar.I;
            if (str2 != null) {
                if (gfVar.f26845b) {
                    imageReceiver.r0(hc.g("vthumb://" + i7 + ":" + str2), "80_80", null, null, xpVar, 0L, null, null, 0);
                    return;
                }
                imageReceiver.G0(gfVar.J, gfVar.K, true);
                imageReceiver.r0(hc.g("thumb://" + i7 + ":" + str2), "80_80", null, null, xpVar, 0L, null, null, 0);
                return;
            }
        }
        imageReceiver.w0(xpVar);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12073b.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f12073b.R();
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r66) {
        throw new UnsupportedOperationException("Method not decompiled: fi.g6.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int L = org.telegram.messenger.g0.L(100.0f);
        float f10 = size;
        this.f12084i0 = f10 / 2.0f;
        this.f12085j0 = L / 2.0f;
        float min = Math.min(org.telegram.messenger.g0.L(135.0f), f10 * 0.35f);
        float f11 = this.f12084i0;
        this.f12086k0 = f11 - min;
        float f12 = f11 + min;
        this.f12087l0 = f12;
        float f13 = this.f12085j0;
        float L2 = org.telegram.messenger.g0.L(14.0f);
        this.d.setBounds((int) (f12 - L2), (int) (f13 - L2), (int) (f12 + L2), (int) (f13 + L2));
        float f14 = this.f12087l0;
        float f15 = this.f12085j0;
        float L3 = org.telegram.messenger.g0.L(14.0f);
        this.f12078e.setBounds((int) (f14 - L3), (int) (f15 - L3), (int) (f14 + L3), (int) (f15 + L3));
        f(this.f12080f, this.f12086k0, this.f12085j0);
        f(this.h, this.f12086k0, this.f12085j0);
        f(this.f12088n, this.f12086k0, this.f12085j0);
        this.f12073b.y0(this.f12086k0 - org.telegram.messenger.g0.L(20.0f), this.f12085j0 - org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
        Matrix matrix = this.H;
        matrix.reset();
        matrix.postTranslate(this.f12084i0, this.f12085j0);
        this.I.setLocalMatrix(matrix);
        setMeasuredDimension(size, L);
        f6 f6Var = this.W;
        if (f6Var != null) {
            f6Var.i();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        boolean z10;
        int action = motionEvent.getAction();
        float i7 = Utilities.i(motionEvent.getX() + 0.0f, this.f12087l0, this.f12086k0);
        float y10 = motionEvent.getY() + 0.0f;
        boolean c10 = c(i7, y10, this.f12087l0, this.f12085j0, org.telegram.messenger.g0.L(7.0f), true);
        boolean z11 = this.f12098u0;
        ic icVar = this.L;
        ic icVar2 = this.J;
        ic icVar3 = this.K;
        boolean z12 = true;
        boolean z13 = false;
        if (z11) {
            icVar2.c(false);
            icVar3.c(false);
            icVar.c(false);
        } else if (action == 0 || this.f12101w0) {
            icVar2.c(c(i7, y10, this.f12084i0, this.f12085j0, org.telegram.messenger.g0.L(60.0f), false));
            if (c(i7, y10, this.f12087l0, this.f12085j0, org.telegram.messenger.g0.L(30.0f), true) && !b()) {
                z9 = true;
            } else {
                z9 = false;
            }
            icVar3.c(z9);
            if (c(i7, y10, this.f12086k0, this.f12085j0, org.telegram.messenger.g0.L(30.0f), false) && !b()) {
                z10 = true;
            } else {
                z10 = false;
            }
            icVar.c(z10);
        }
        d6 d6Var = this.M0;
        d6 d6Var2 = this.L0;
        if (action == 0) {
            this.f12101w0 = true;
            if (icVar2.f34629i || icVar3.f34629i) {
                z13 = true;
            }
            this.f12103x0 = z13;
            System.currentTimeMillis();
            this.f12105y0 = i7;
            if (Math.abs(i7 - this.f12084i0) < org.telegram.messenger.g0.L(50.0f)) {
                org.telegram.messenger.g0.i3(d6Var2, ViewConfiguration.getLongPressTimeout());
            }
            if (icVar3.f34629i) {
                org.telegram.messenger.g0.i3(d6Var, ViewConfiguration.getLongPressTimeout());
            }
        } else if (action == 2) {
            if (this.f12101w0) {
                this.f12105y0 = Utilities.i(i7, this.f12087l0, this.f12086k0);
                invalidate();
                if (this.f12094r0 && !this.X0 && c10) {
                    d(180.0f);
                    ((s9) this.f12071a).b();
                }
                if (this.f12094r0 && this.f12106z0) {
                    float i10 = Utilities.i(((this.f12085j0 - org.telegram.messenger.g0.L(48.0f)) - y10) / (org.telegram.messenger.g0.f22563q.y / 2.0f), 1.0f, 0.0f);
                    va vaVar = ((s9) this.f12071a).f12819a;
                    vaVar.V0.b(true, i10);
                    vaVar.i0(false);
                }
            }
            return false;
        } else if (action != 1 && action != 3) {
            z12 = false;
        } else {
            if (this.f12101w0) {
                this.f12101w0 = false;
                this.f12103x0 = false;
                org.telegram.messenger.g0.r(d6Var2);
                org.telegram.messenger.g0.r(d6Var);
                boolean z14 = this.f12094r0;
                if (!z14 && icVar.f34629i) {
                    ((s9) this.f12071a).c();
                } else if (z14 && this.f12106z0) {
                    if (icVar.f34629i) {
                        this.f12106z0 = false;
                        this.G0.e(true, 1.0f);
                        k3 k3Var = ((s9) this.f12071a).f12819a.T0;
                        k3Var.f12266a.t(id.M0(2131744664, null), true, true);
                        k3Var.invalidate();
                    } else {
                        this.f12094r0 = false;
                        this.f12099v0 = SystemClock.elapsedRealtime();
                        this.f12098u0 = true;
                        ((s9) this.f12071a).e(false);
                    }
                } else if (icVar2.f34629i) {
                    if (b()) {
                        ((s9) this.f12071a).a();
                    } else if (!this.f12090o0 && !this.f12094r0 && !this.f12106z0) {
                        ((s9) this.f12071a).d();
                    } else if (!this.f12094r0) {
                        if (va.c(((s9) this.f12071a).f12819a)) {
                            this.R = 0L;
                            this.Q = System.currentTimeMillis();
                            this.A0 = false;
                            ((s9) this.f12071a).f(new d6(this, 1), false);
                        }
                    } else {
                        this.f12094r0 = false;
                        this.f12099v0 = SystemClock.elapsedRealtime();
                        this.f12098u0 = true;
                        ((s9) this.f12071a).e(false);
                    }
                }
                this.f12106z0 = false;
                if (icVar3.f34629i) {
                    d(180.0f);
                    ((s9) this.f12071a).b();
                }
                icVar2.c(false);
                icVar3.c(false);
                icVar.c(false);
                invalidate();
            }
            return false;
        }
        this.X0 = c10;
        return z12;
    }

    public void setDelegate(e6 e6Var) {
        this.f12071a = e6Var;
    }

    public void setDual(boolean z9) {
        if (z9 != this.O) {
            this.O = z9;
            invalidate();
        }
    }

    @Override
    public void setInvert(float f10) {
        this.f12095s.setColor(i0.a.f(f10, -1, -16777216));
        this.f12102x.setColor(i0.a.f(f10, 1677721600, 369098752));
        this.E.setColor(i0.a.f(f10, 1493172223, 285212671));
        this.F.setColor(i0.a.f(f10, 402653184, 805306368));
        int f11 = i0.a.f(f10, -1, -16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.d.setColorFilter(new PorterDuffColorFilter(f11, mode));
        this.f12080f.setColorFilter(new PorterDuffColorFilter(i0.a.f(f10, -1, -16777216), mode));
    }
}
