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
import org.telegram.messenger.ef;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.ue;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lq;
public final class n6 extends View implements v2 {
    public boolean A0;
    public boolean B0;
    public final org.telegram.ui.Components.c6 C0;
    public final org.telegram.ui.Components.c6 D0;
    public final Paint E;
    public final org.telegram.ui.Components.c6 E0;
    public final Paint F;
    public final org.telegram.ui.Components.c6 F0;
    public final Paint G;
    public final org.telegram.ui.Components.c6 G0;
    public final Paint H;
    public final org.telegram.ui.Components.c6 H0;
    public final Matrix I;
    public float I0;
    public final RadialGradient J;
    public final org.telegram.ui.Components.c6 J0;
    public final org.telegram.ui.Components.lc K;
    public final org.telegram.ui.Components.c6 K0;
    public final org.telegram.ui.Components.lc L;
    public final org.telegram.ui.Components.c6 L0;
    public final org.telegram.ui.Components.lc M;
    public final k6 M0;
    public float N;
    public final k6 N0;
    public final org.telegram.ui.Components.c6 O;
    public final Path O0;
    public boolean P;
    public final Path P0;
    public final org.telegram.ui.Components.c6 Q;
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
    public l6 f15013a;
    public final m6 f15014a0;
    public final ImageReceiver f15015b;
    public boolean f15016b0;
    public final lq f15017c;
    public boolean f15018c0;
    public final Drawable d;
    public boolean f15019d0;
    public final Drawable f15020e;
    public boolean f15021e0;
    public final Drawable f15022f;
    public boolean f15023f0;
    public boolean f15024g0;
    public final Drawable h;
    public float f15025h0;
    public final org.telegram.ui.Components.c6 f15026i0;
    public float f15027j0;
    public float f15028k0;
    public float f15029l0;
    public float m0;
    public final Drawable f15030n;
    public final org.telegram.ui.Components.c6 f15031n0;
    public float f15032o0;
    public boolean f15033p0;
    public final org.telegram.ui.Components.c6 f15034q0;
    public final Paint f15035r;
    public final org.telegram.ui.Components.c6 f15036r0;
    public final Paint f15037s;
    public boolean f15038s0;
    public final float[] f15039t0;
    public final org.telegram.ui.Components.c6 f15040u0;
    public boolean f15041v0;
    public final Paint f15042w;
    public long f15043w0;
    public final Paint f15044x;
    public boolean f15045x0;
    public final Paint f15046y;
    public boolean f15047y0;
    public float f15048z0;

    public n6(Activity activity) {
        super(activity);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f15015b = imageReceiver;
        this.f15035r = new Paint(1);
        Paint paint = new Paint(1);
        this.f15037s = paint;
        Paint paint2 = new Paint(1);
        this.f15042w = paint2;
        Paint paint3 = new Paint(1);
        this.f15044x = paint3;
        Paint paint4 = new Paint(1);
        this.f15046y = paint4;
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
        this.K = new org.telegram.ui.Components.lc(this);
        this.L = new org.telegram.ui.Components.lc(this);
        this.M = new org.telegram.ui.Components.lc(this);
        kr krVar = kr.h;
        this.O = new org.telegram.ui.Components.c6(this, 0L, 310L, krVar);
        this.Q = new org.telegram.ui.Components.c6(this, 0L, 330L, krVar);
        this.T = new Path();
        this.U = new PointF(-org.telegram.messenger.g0.N(9.666667f), org.telegram.messenger.g0.N(2.3333333f));
        this.V = new PointF(-org.telegram.messenger.g0.N(2.8333333f), org.telegram.messenger.g0.N(8.666667f));
        this.W = new PointF(org.telegram.messenger.g0.N(9.666667f), org.telegram.messenger.g0.N(-3.6666667f));
        this.f15026i0 = new org.telegram.ui.Components.c6(this, 0L, 200L, kr.f36858f);
        this.f15031n0 = new org.telegram.ui.Components.c6(this, 0L, 350L, krVar);
        this.f15032o0 = -1.0f;
        this.f15033p0 = true;
        this.f15034q0 = new org.telegram.ui.Components.c6(this, 0L, 350L, krVar);
        this.f15036r0 = new org.telegram.ui.Components.c6(this, 0L, 850L, krVar);
        this.f15039t0 = new float[2];
        this.f15040u0 = new org.telegram.ui.Components.c6(this, 0L, 350L, krVar);
        this.C0 = new org.telegram.ui.Components.c6(this, 0L, 350L, krVar);
        this.D0 = new org.telegram.ui.Components.c6(this, 0L, 650L, krVar);
        this.E0 = new org.telegram.ui.Components.c6(this, 0L, 160L, kr.f36860i);
        this.F0 = new org.telegram.ui.Components.c6(this, 0L, 750L, krVar);
        this.G0 = new org.telegram.ui.Components.c6(this, 0L, 650L, krVar);
        this.H0 = new org.telegram.ui.Components.c6(this, 0L, 320L, krVar);
        this.J0 = new org.telegram.ui.Components.c6(this, 0L, 320L, krVar);
        this.K0 = new org.telegram.ui.Components.c6(this, 0L, 320L, krVar);
        this.L0 = new org.telegram.ui.Components.c6(this, 0L, 320L, krVar);
        this.M0 = new k6(this, 2);
        this.N0 = new k6(this, 3);
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
        m6 m6Var = new m6(this, this);
        this.f15014a0 = m6Var;
        r0.i0.j(this, m6Var);
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
        imageReceiver.I0(this);
        imageReceiver.B0 = true;
        imageReceiver.K0(org.telegram.messenger.g0.L(6.0f));
        Drawable mutate = activity.getResources().getDrawable(2131232225).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(1308622847, mode));
        lq lqVar = new lq(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(6.0f), -13750737), mutate);
        this.f15017c = lqVar;
        lqVar.f37204x = false;
        int L = org.telegram.messenger.g0.L(24.0f);
        int L2 = org.telegram.messenger.g0.L(24.0f);
        lqVar.f37198e = L;
        lqVar.f37199f = L2;
        Drawable mutate2 = activity.getResources().getDrawable(2131232290).mutate();
        this.d = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate3 = activity.getResources().getDrawable(2131232290).mutate();
        this.f15020e = mutate3;
        mutate3.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate4 = activity.getResources().getDrawable(2131232160).mutate();
        this.f15022f = mutate4;
        mutate4.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate5 = activity.getResources().getDrawable(2131232151).mutate();
        this.h = mutate5;
        mutate5.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate6 = activity.getResources().getDrawable(2131232352).mutate();
        this.f15030n = mutate6;
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
        if (this.f15038s0) {
            if ((!z10 || f13 - f11 <= org.telegram.messenger.g0.L(100.0f)) && Math.abs(f12 - f10) <= f14) {
                return true;
            }
            return false;
        } else if (a8.x9.a(f10, f11, f12, f13) <= f14) {
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
        this.O.f33934g = j3;
        this.N += f10;
        invalidate();
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        m6 m6Var = this.f15014a0;
        if (m6Var != null && m6Var.f(motionEvent)) {
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
            if (f10 > 0.0f && !this.f15038s0) {
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
        this.f15041v0 = false;
        if (!z10) {
            org.telegram.ui.Components.c6 c6Var = this.f15040u0;
            c6Var.getClass();
            c6Var.e(true, 0.0f);
        }
        invalidate();
    }

    public final void h() {
        ef efVar;
        String str;
        ArrayList arrayList;
        l6 l6Var = this.f15013a;
        lq lqVar = this.f15017c;
        ImageReceiver imageReceiver = this.f15015b;
        if (l6Var != null) {
            ArrayList arrayList2 = mp.u1(imageReceiver.d).R1().f12406w.f14719b;
            imageReceiver.H0(0, 0, true);
            if (arrayList2 != null && !arrayList2.isEmpty() && ((x7) arrayList2.get(0)).O0 != null) {
                imageReceiver.s0(org.telegram.messenger.fc.g(((x7) arrayList2.get(0)).O0.getAbsolutePath()), "80_80", null, null, lqVar, 0L, null, null, 0);
                return;
            }
        }
        ue ueVar = MediaController.f22784a2;
        if (ueVar != null && (arrayList = ueVar.f27262e) != null && !arrayList.isEmpty()) {
            efVar = (ef) arrayList.get(0);
        } else {
            efVar = null;
        }
        if (efVar != null && (str = efVar.f27964c) != null) {
            imageReceiver.s0(org.telegram.messenger.fc.g(str), "80_80", null, null, lqVar, 0L, null, null, 0);
            return;
        }
        if (efVar != null) {
            int i7 = efVar.C;
            String str2 = efVar.I;
            if (str2 != null) {
                if (efVar.f27963b) {
                    imageReceiver.s0(org.telegram.messenger.fc.g("vthumb://" + i7 + ":" + str2), "80_80", null, null, lqVar, 0L, null, null, 0);
                    return;
                }
                imageReceiver.H0(efVar.J, efVar.K, true);
                imageReceiver.s0(org.telegram.messenger.fc.g("thumb://" + i7 + ":" + str2), "80_80", null, null, lqVar, 0L, null, null, 0);
                return;
            }
        }
        imageReceiver.x0(lqVar);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15015b.Q();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f15015b.S();
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r66) {
        throw new UnsupportedOperationException("Method not decompiled: hi.n6.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int L = org.telegram.messenger.g0.L(100.0f);
        float f10 = size;
        this.f15027j0 = f10 / 2.0f;
        this.f15028k0 = L / 2.0f;
        float min = Math.min(org.telegram.messenger.g0.L(135.0f), f10 * 0.35f);
        float f11 = this.f15027j0;
        this.f15029l0 = f11 - min;
        float f12 = f11 + min;
        this.m0 = f12;
        float f13 = this.f15028k0;
        float L2 = org.telegram.messenger.g0.L(14.0f);
        this.d.setBounds((int) (f12 - L2), (int) (f13 - L2), (int) (f12 + L2), (int) (f13 + L2));
        float f14 = this.m0;
        float f15 = this.f15028k0;
        float L3 = org.telegram.messenger.g0.L(14.0f);
        this.f15020e.setBounds((int) (f14 - L3), (int) (f15 - L3), (int) (f14 + L3), (int) (f15 + L3));
        f(this.f15022f, this.f15029l0, this.f15028k0);
        f(this.h, this.f15029l0, this.f15028k0);
        f(this.f15030n, this.f15029l0, this.f15028k0);
        this.f15015b.z0(this.f15029l0 - org.telegram.messenger.g0.L(20.0f), this.f15028k0 - org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
        Matrix matrix = this.I;
        matrix.reset();
        matrix.postTranslate(this.f15027j0, this.f15028k0);
        this.J.setLocalMatrix(matrix);
        setMeasuredDimension(size, L);
        m6 m6Var = this.f15014a0;
        if (m6Var != null) {
            m6Var.i();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int action = motionEvent.getAction();
        float i7 = Utilities.i(motionEvent.getX() + 0.0f, this.m0, this.f15029l0);
        float y10 = motionEvent.getY() + 0.0f;
        boolean c10 = c(i7, y10, this.m0, this.f15028k0, org.telegram.messenger.g0.L(7.0f), true);
        boolean z12 = this.f15041v0;
        org.telegram.ui.Components.lc lcVar = this.M;
        org.telegram.ui.Components.lc lcVar2 = this.K;
        org.telegram.ui.Components.lc lcVar3 = this.L;
        boolean z13 = true;
        boolean z14 = false;
        if (z12) {
            lcVar2.c(false);
            lcVar3.c(false);
            lcVar.c(false);
        } else if (action == 0 || this.f15045x0) {
            lcVar2.c(c(i7, y10, this.f15027j0, this.f15028k0, org.telegram.messenger.g0.L(60.0f), false));
            if (c(i7, y10, this.m0, this.f15028k0, org.telegram.messenger.g0.L(30.0f), true) && !b()) {
                z10 = true;
            } else {
                z10 = false;
            }
            lcVar3.c(z10);
            if (c(i7, y10, this.f15029l0, this.f15028k0, org.telegram.messenger.g0.L(30.0f), false) && !b()) {
                z11 = true;
            } else {
                z11 = false;
            }
            lcVar.c(z11);
        }
        k6 k6Var = this.N0;
        k6 k6Var2 = this.M0;
        if (action == 0) {
            this.f15045x0 = true;
            if (lcVar2.f37109i || lcVar3.f37109i) {
                z14 = true;
            }
            this.f15047y0 = z14;
            System.currentTimeMillis();
            this.f15048z0 = i7;
            if (Math.abs(i7 - this.f15027j0) < org.telegram.messenger.g0.L(50.0f)) {
                org.telegram.messenger.g0.h3(k6Var2, ViewConfiguration.getLongPressTimeout());
            }
            if (lcVar3.f37109i) {
                org.telegram.messenger.g0.h3(k6Var, ViewConfiguration.getLongPressTimeout());
            }
        } else if (action == 2) {
            if (this.f15045x0) {
                this.f15048z0 = Utilities.i(i7, this.m0, this.f15029l0);
                invalidate();
                if (this.f15038s0 && !this.Y0 && c10) {
                    d(180.0f);
                    ((ka) this.f15013a).b();
                }
                if (this.f15038s0 && this.A0) {
                    float i10 = Utilities.i(((this.f15028k0 - org.telegram.messenger.g0.L(48.0f)) - y10) / (org.telegram.messenger.g0.f24226q.y / 2.0f), 1.0f, 0.0f);
                    nb nbVar = ((ka) this.f15013a).f14800a;
                    nbVar.W0.b(true, i10);
                    nbVar.i0(false);
                }
            }
            return false;
        } else if (action != 1 && action != 3) {
            z13 = false;
        } else {
            if (this.f15045x0) {
                this.f15045x0 = false;
                this.f15047y0 = false;
                org.telegram.messenger.g0.r(k6Var2);
                org.telegram.messenger.g0.r(k6Var);
                boolean z15 = this.f15038s0;
                if (!z15 && lcVar.f37109i) {
                    ((ka) this.f15013a).c();
                } else if (z15 && this.A0) {
                    if (lcVar.f37109i) {
                        this.A0 = false;
                        this.H0.e(true, 1.0f);
                        r3 r3Var = ((ka) this.f15013a).f14800a.U0;
                        r3Var.f15289a.t(gd.N0(2131744417, null), true, true);
                        r3Var.invalidate();
                    } else {
                        this.f15038s0 = false;
                        this.f15043w0 = SystemClock.elapsedRealtime();
                        this.f15041v0 = true;
                        ((ka) this.f15013a).e(false);
                    }
                } else if (lcVar2.f37109i) {
                    if (b()) {
                        ((ka) this.f15013a).a();
                    } else if (!this.f15033p0 && !this.f15038s0 && !this.A0) {
                        ((ka) this.f15013a).d();
                    } else if (!this.f15038s0) {
                        if (nb.c(((ka) this.f15013a).f14800a)) {
                            this.S = 0L;
                            this.R = System.currentTimeMillis();
                            this.B0 = false;
                            ((ka) this.f15013a).f(new k6(this, 1), false);
                        }
                    } else {
                        this.f15038s0 = false;
                        this.f15043w0 = SystemClock.elapsedRealtime();
                        this.f15041v0 = true;
                        ((ka) this.f15013a).e(false);
                    }
                }
                this.A0 = false;
                if (lcVar3.f37109i) {
                    d(180.0f);
                    ((ka) this.f15013a).b();
                }
                lcVar2.c(false);
                lcVar3.c(false);
                lcVar.c(false);
                invalidate();
            }
            return false;
        }
        this.Y0 = c10;
        return z13;
    }

    public void setDelegate(l6 l6Var) {
        this.f15013a = l6Var;
    }

    public void setDual(boolean z10) {
        if (z10 != this.P) {
            this.P = z10;
            invalidate();
        }
    }

    @Override
    public void setInvert(float f10) {
        this.f15037s.setColor(i0.a.f(f10, -1, -16777216));
        this.f15044x.setColor(i0.a.f(f10, 1677721600, 369098752));
        this.F.setColor(i0.a.f(f10, 1493172223, 285212671));
        this.G.setColor(i0.a.f(f10, 402653184, 805306368));
        int f11 = i0.a.f(f10, -1, -16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.d.setColorFilter(new PorterDuffColorFilter(f11, mode));
        this.f15022f.setColorFilter(new PorterDuffColorFilter(i0.a.f(f10, -1, -16777216), mode));
    }
}
