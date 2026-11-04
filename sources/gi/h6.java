package gi;

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
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.pe;
import org.telegram.messenger.ye;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
public final class h6 extends View implements m2 {
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
    public final gc K;
    public final org.telegram.ui.Components.u5 K0;
    public final gc L;
    public final org.telegram.ui.Components.u5 L0;
    public final gc M;
    public final d6 M0;
    public float N;
    public final d6 N0;
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
    public e6 f12883a;
    public final g6 f12884a0;
    public final ImageReceiver f12885b;
    public boolean f12886b0;
    public final xp f12887c;
    public boolean f12888c0;
    public final Drawable d;
    public boolean f12889d0;
    public final Drawable f12890e;
    public boolean f12891e0;
    public final Drawable f12892f;
    public boolean f12893f0;
    public boolean f12894g0;
    public final Drawable h;
    public float f12895h0;
    public final org.telegram.ui.Components.u5 f12896i0;
    public float f12897j0;
    public float f12898k0;
    public float f12899l0;
    public float m0;
    public final Drawable f12900n;
    public final org.telegram.ui.Components.u5 f12901n0;
    public float f12902o0;
    public boolean f12903p0;
    public final org.telegram.ui.Components.u5 f12904q0;
    public final Paint f12905r;
    public final org.telegram.ui.Components.u5 f12906r0;
    public final Paint f12907s;
    public boolean f12908s0;
    public final float[] f12909t0;
    public final org.telegram.ui.Components.u5 f12910u0;
    public boolean f12911v0;
    public final Paint f12912w;
    public long f12913w0;
    public final Paint f12914x;
    public boolean f12915x0;
    public final Paint f12916y;
    public boolean f12917y0;
    public float f12918z0;

    public h6(Activity activity) {
        super(activity);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f12885b = imageReceiver;
        this.f12905r = new Paint(1);
        Paint paint = new Paint(1);
        this.f12907s = paint;
        Paint paint2 = new Paint(1);
        this.f12912w = paint2;
        Paint paint3 = new Paint(1);
        this.f12914x = paint3;
        Paint paint4 = new Paint(1);
        this.f12916y = paint4;
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
        this.K = new gc(this);
        this.L = new gc(this);
        this.M = new gc(this);
        xq xqVar = xq.h;
        this.O = new org.telegram.ui.Components.u5(this, 0L, 310L, xqVar);
        this.Q = new org.telegram.ui.Components.u5(this, 0L, 330L, xqVar);
        this.T = new Path();
        this.U = new PointF(-org.telegram.messenger.g0.N(9.666667f), org.telegram.messenger.g0.N(2.3333333f));
        this.V = new PointF(-org.telegram.messenger.g0.N(2.8333333f), org.telegram.messenger.g0.N(8.666667f));
        this.W = new PointF(org.telegram.messenger.g0.N(9.666667f), org.telegram.messenger.g0.N(-3.6666667f));
        this.f12896i0 = new org.telegram.ui.Components.u5(this, 0L, 200L, xq.f40452f);
        this.f12901n0 = new org.telegram.ui.Components.u5(this, 0L, 350L, xqVar);
        this.f12902o0 = -1.0f;
        this.f12903p0 = true;
        this.f12904q0 = new org.telegram.ui.Components.u5(this, 0L, 350L, xqVar);
        this.f12906r0 = new org.telegram.ui.Components.u5(this, 0L, 850L, xqVar);
        this.f12909t0 = new float[2];
        this.f12910u0 = new org.telegram.ui.Components.u5(this, 0L, 350L, xqVar);
        this.C0 = new org.telegram.ui.Components.u5(this, 0L, 350L, xqVar);
        this.D0 = new org.telegram.ui.Components.u5(this, 0L, 650L, xqVar);
        this.E0 = new org.telegram.ui.Components.u5(this, 0L, 160L, xq.f40454i);
        this.F0 = new org.telegram.ui.Components.u5(this, 0L, 750L, xqVar);
        this.G0 = new org.telegram.ui.Components.u5(this, 0L, 650L, xqVar);
        this.H0 = new org.telegram.ui.Components.u5(this, 0L, 320L, xqVar);
        this.J0 = new org.telegram.ui.Components.u5(this, 0L, 320L, xqVar);
        this.K0 = new org.telegram.ui.Components.u5(this, 0L, 320L, xqVar);
        this.L0 = new org.telegram.ui.Components.u5(this, 0L, 320L, xqVar);
        this.M0 = new d6(this, 2);
        this.N0 = new d6(this, 3);
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
        g6 g6Var = new g6(this, this);
        this.f12884a0 = g6Var;
        r0.i0.j(this, g6Var);
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
        Drawable mutate = activity.getResources().getDrawable(2131232220).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(1308622847, mode));
        xp xpVar = new xp(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(6.0f), -13750737), mutate);
        this.f12887c = xpVar;
        xpVar.f40447x = false;
        int L = org.telegram.messenger.g0.L(24.0f);
        int L2 = org.telegram.messenger.g0.L(24.0f);
        xpVar.f40441e = L;
        xpVar.f40442f = L2;
        Drawable mutate2 = activity.getResources().getDrawable(2131232285).mutate();
        this.d = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate3 = activity.getResources().getDrawable(2131232285).mutate();
        this.f12890e = mutate3;
        mutate3.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate4 = activity.getResources().getDrawable(2131232155).mutate();
        this.f12892f = mutate4;
        mutate4.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate5 = activity.getResources().getDrawable(2131232146).mutate();
        this.h = mutate5;
        mutate5.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate6 = activity.getResources().getDrawable(2131232347).mutate();
        this.f12900n = mutate6;
        mutate6.setColorFilter(new PorterDuffColorFilter(-1, mode));
        h();
    }

    public static void a(float f10, float f11, double d, float f12, PointF pointF) {
        double d10 = f12;
        pointF.x = (float) ((Math.cos(d) * d10) + f10);
        pointF.y = (float) ((Math.sin(d) * d10) + f11);
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
        if (this.f12908s0) {
            if ((!z10 || f13 - f11 <= org.telegram.messenger.g0.L(100.0f)) && Math.abs(f12 - f10) <= f14) {
                return true;
            }
            return false;
        } else if (a7.h.a(f10, f11, f12, f13) <= f14) {
            return true;
        } else {
            return false;
        }
    }

    public final void d(float f10) {
        long j10;
        if (f10 > 180.0f) {
            j10 = 620;
        } else {
            j10 = 310;
        }
        this.O.f38648g = j10;
        this.N += f10;
        invalidate();
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        g6 g6Var = this.f12884a0;
        if (g6Var != null && g6Var.f(motionEvent)) {
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
            if (f10 > 0.0f && !this.f12908s0) {
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
        this.f12911v0 = false;
        if (!z10) {
            org.telegram.ui.Components.u5 u5Var = this.f12910u0;
            u5Var.getClass();
            u5Var.e(true, 0.0f);
        }
        invalidate();
    }

    public final void h() {
        ye yeVar;
        String str;
        ArrayList arrayList;
        e6 e6Var = this.f12883a;
        xp xpVar = this.f12887c;
        ImageReceiver imageReceiver = this.f12885b;
        if (e6Var != null) {
            ArrayList arrayList2 = hp.s1(imageReceiver.d).P1().f11293w.f13997b;
            imageReceiver.G0(0, 0, true);
            if (arrayList2 != null && !arrayList2.isEmpty() && ((f7) arrayList2.get(0)).O0 != null) {
                imageReceiver.r0(ac.g(((f7) arrayList2.get(0)).O0.getAbsolutePath()), "80_80", null, null, xpVar, 0L, null, null, 0);
                return;
            }
        }
        pe peVar = MediaController.f21294a2;
        if (peVar != null && (arrayList = peVar.f24738e) != null && !arrayList.isEmpty()) {
            yeVar = (ye) arrayList.get(0);
        } else {
            yeVar = null;
        }
        if (yeVar != null && (str = yeVar.f25311c) != null) {
            imageReceiver.r0(ac.g(str), "80_80", null, null, xpVar, 0L, null, null, 0);
            return;
        }
        if (yeVar != null) {
            int i3 = yeVar.C;
            String str2 = yeVar.I;
            if (str2 != null) {
                if (yeVar.f25310b) {
                    imageReceiver.r0(ac.g("vthumb://" + i3 + ":" + str2), "80_80", null, null, xpVar, 0L, null, null, 0);
                    return;
                }
                imageReceiver.G0(yeVar.J, yeVar.K, true);
                imageReceiver.r0(ac.g("thumb://" + i3 + ":" + str2), "80_80", null, null, xpVar, 0L, null, null, 0);
                return;
            }
        }
        imageReceiver.w0(xpVar);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12885b.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f12885b.R();
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r66) {
        throw new UnsupportedOperationException("Method not decompiled: gi.h6.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int L = org.telegram.messenger.g0.L(100.0f);
        float f10 = size;
        this.f12897j0 = f10 / 2.0f;
        this.f12898k0 = L / 2.0f;
        float min = Math.min(org.telegram.messenger.g0.L(135.0f), f10 * 0.35f);
        float f11 = this.f12897j0;
        this.f12899l0 = f11 - min;
        float f12 = f11 + min;
        this.m0 = f12;
        float f13 = this.f12898k0;
        float L2 = org.telegram.messenger.g0.L(14.0f);
        this.d.setBounds((int) (f12 - L2), (int) (f13 - L2), (int) (f12 + L2), (int) (f13 + L2));
        float f14 = this.m0;
        float f15 = this.f12898k0;
        float L3 = org.telegram.messenger.g0.L(14.0f);
        this.f12890e.setBounds((int) (f14 - L3), (int) (f15 - L3), (int) (f14 + L3), (int) (f15 + L3));
        f(this.f12892f, this.f12899l0, this.f12898k0);
        f(this.h, this.f12899l0, this.f12898k0);
        f(this.f12900n, this.f12899l0, this.f12898k0);
        this.f12885b.y0(this.f12899l0 - org.telegram.messenger.g0.L(20.0f), this.f12898k0 - org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
        Matrix matrix = this.I;
        matrix.reset();
        matrix.postTranslate(this.f12897j0, this.f12898k0);
        this.J.setLocalMatrix(matrix);
        setMeasuredDimension(size, L);
        g6 g6Var = this.f12884a0;
        if (g6Var != null) {
            g6Var.i();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int action = motionEvent.getAction();
        float i3 = Utilities.i(motionEvent.getX() + 0.0f, this.m0, this.f12899l0);
        float y9 = motionEvent.getY() + 0.0f;
        boolean c2 = c(i3, y9, this.m0, this.f12898k0, org.telegram.messenger.g0.L(7.0f), true);
        boolean z12 = this.f12911v0;
        gc gcVar = this.M;
        gc gcVar2 = this.K;
        gc gcVar3 = this.L;
        boolean z13 = true;
        boolean z14 = false;
        if (z12) {
            gcVar2.c(false);
            gcVar3.c(false);
            gcVar.c(false);
        } else if (action == 0 || this.f12915x0) {
            gcVar2.c(c(i3, y9, this.f12897j0, this.f12898k0, org.telegram.messenger.g0.L(60.0f), false));
            if (c(i3, y9, this.m0, this.f12898k0, org.telegram.messenger.g0.L(30.0f), true) && !b()) {
                z10 = true;
            } else {
                z10 = false;
            }
            gcVar3.c(z10);
            if (c(i3, y9, this.f12899l0, this.f12898k0, org.telegram.messenger.g0.L(30.0f), false) && !b()) {
                z11 = true;
            } else {
                z11 = false;
            }
            gcVar.c(z11);
        }
        d6 d6Var = this.N0;
        d6 d6Var2 = this.M0;
        if (action == 0) {
            this.f12915x0 = true;
            if (gcVar2.f34049i || gcVar3.f34049i) {
                z14 = true;
            }
            this.f12917y0 = z14;
            System.currentTimeMillis();
            this.f12918z0 = i3;
            if (Math.abs(i3 - this.f12897j0) < org.telegram.messenger.g0.L(50.0f)) {
                org.telegram.messenger.g0.i3(d6Var2, ViewConfiguration.getLongPressTimeout());
            }
            if (gcVar3.f34049i) {
                org.telegram.messenger.g0.i3(d6Var, ViewConfiguration.getLongPressTimeout());
            }
        } else if (action == 2) {
            if (this.f12915x0) {
                this.f12918z0 = Utilities.i(i3, this.m0, this.f12899l0);
                invalidate();
                if (this.f12908s0 && !this.Y0 && c2) {
                    d(180.0f);
                    ((s9) this.f12883a).b();
                }
                if (this.f12908s0 && this.A0) {
                    float i10 = Utilities.i(((this.f12898k0 - org.telegram.messenger.g0.L(48.0f)) - y9) / (org.telegram.messenger.g0.f22608q.y / 2.0f), 1.0f, 0.0f);
                    va vaVar = ((s9) this.f12883a).f13580a;
                    vaVar.W0.b(true, i10);
                    vaVar.i0(false);
                }
            }
            return false;
        } else if (action != 1 && action != 3) {
            z13 = false;
        } else {
            if (this.f12915x0) {
                this.f12915x0 = false;
                this.f12917y0 = false;
                org.telegram.messenger.g0.r(d6Var2);
                org.telegram.messenger.g0.r(d6Var);
                boolean z15 = this.f12908s0;
                if (!z15 && gcVar.f34049i) {
                    ((s9) this.f12883a).c();
                } else if (z15 && this.A0) {
                    if (gcVar.f34049i) {
                        this.A0 = false;
                        this.H0.e(true, 1.0f);
                        i3 i3Var = ((s9) this.f12883a).f13580a.U0;
                        i3Var.f12965a.t(bd.M0(2131744671, null), true, true);
                        i3Var.invalidate();
                    } else {
                        this.f12908s0 = false;
                        this.f12913w0 = SystemClock.elapsedRealtime();
                        this.f12911v0 = true;
                        ((s9) this.f12883a).e(false);
                    }
                } else if (gcVar2.f34049i) {
                    if (b()) {
                        ((s9) this.f12883a).a();
                    } else if (!this.f12903p0 && !this.f12908s0 && !this.A0) {
                        ((s9) this.f12883a).d();
                    } else if (!this.f12908s0) {
                        if (va.c(((s9) this.f12883a).f13580a)) {
                            this.S = 0L;
                            this.R = System.currentTimeMillis();
                            this.B0 = false;
                            ((s9) this.f12883a).f(new d6(this, 1), false);
                        }
                    } else {
                        this.f12908s0 = false;
                        this.f12913w0 = SystemClock.elapsedRealtime();
                        this.f12911v0 = true;
                        ((s9) this.f12883a).e(false);
                    }
                }
                this.A0 = false;
                if (gcVar3.f34049i) {
                    d(180.0f);
                    ((s9) this.f12883a).b();
                }
                gcVar2.c(false);
                gcVar3.c(false);
                gcVar.c(false);
                invalidate();
            }
            return false;
        }
        this.Y0 = c2;
        return z13;
    }

    public void setDelegate(e6 e6Var) {
        this.f12883a = e6Var;
    }

    public void setDual(boolean z10) {
        if (z10 != this.P) {
            this.P = z10;
            invalidate();
        }
    }

    @Override
    public void setInvert(float f10) {
        this.f12907s.setColor(i0.a.f(f10, -1, -16777216));
        this.f12914x.setColor(i0.a.f(f10, 1677721600, 369098752));
        this.F.setColor(i0.a.f(f10, 1493172223, 285212671));
        this.G.setColor(i0.a.f(f10, 402653184, 805306368));
        int f11 = i0.a.f(f10, -1, -16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.d.setColorFilter(new PorterDuffColorFilter(f11, mode));
        this.f12892f.setColorFilter(new PorterDuffColorFilter(i0.a.f(f10, -1, -16777216), mode));
    }
}
