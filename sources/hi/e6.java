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
import org.telegram.messenger.fc;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.ue;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.mq;
public final class e6 extends View implements n2 {
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
    public final mc K;
    public final org.telegram.ui.Components.c6 K0;
    public final mc L;
    public final org.telegram.ui.Components.c6 L0;
    public final mc M;
    public final b6 M0;
    public float N;
    public final b6 N0;
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
    public c6 f14558a;
    public final d6 f14559a0;
    public final ImageReceiver f14560b;
    public boolean f14561b0;
    public final mq f14562c;
    public boolean f14563c0;
    public final Drawable d;
    public boolean f14564d0;
    public final Drawable f14565e;
    public boolean f14566e0;
    public final Drawable f14567f;
    public boolean f14568f0;
    public boolean f14569g0;
    public final Drawable h;
    public float f14570h0;
    public final org.telegram.ui.Components.c6 f14571i0;
    public float f14572j0;
    public float f14573k0;
    public float f14574l0;
    public float m0;
    public final Drawable f14575n;
    public final org.telegram.ui.Components.c6 f14576n0;
    public float f14577o0;
    public boolean f14578p0;
    public final org.telegram.ui.Components.c6 f14579q0;
    public final Paint f14580r;
    public final org.telegram.ui.Components.c6 f14581r0;
    public final Paint f14582s;
    public boolean f14583s0;
    public final float[] f14584t0;
    public final org.telegram.ui.Components.c6 f14585u0;
    public boolean f14586v0;
    public final Paint f14587w;
    public long f14588w0;
    public final Paint f14589x;
    public boolean f14590x0;
    public final Paint f14591y;
    public boolean f14592y0;
    public float f14593z0;

    public e6(Activity activity) {
        super(activity);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f14560b = imageReceiver;
        this.f14580r = new Paint(1);
        Paint paint = new Paint(1);
        this.f14582s = paint;
        Paint paint2 = new Paint(1);
        this.f14587w = paint2;
        Paint paint3 = new Paint(1);
        this.f14589x = paint3;
        Paint paint4 = new Paint(1);
        this.f14591y = paint4;
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
        this.K = new mc(this);
        this.L = new mc(this);
        this.M = new mc(this);
        lr lrVar = lr.h;
        this.O = new org.telegram.ui.Components.c6(this, 0L, 310L, lrVar);
        this.Q = new org.telegram.ui.Components.c6(this, 0L, 330L, lrVar);
        this.T = new Path();
        this.U = new PointF(-org.telegram.messenger.g0.N(9.666667f), org.telegram.messenger.g0.N(2.3333333f));
        this.V = new PointF(-org.telegram.messenger.g0.N(2.8333333f), org.telegram.messenger.g0.N(8.666667f));
        this.W = new PointF(org.telegram.messenger.g0.N(9.666667f), org.telegram.messenger.g0.N(-3.6666667f));
        this.f14571i0 = new org.telegram.ui.Components.c6(this, 0L, 200L, lr.f37208f);
        this.f14576n0 = new org.telegram.ui.Components.c6(this, 0L, 350L, lrVar);
        this.f14577o0 = -1.0f;
        this.f14578p0 = true;
        this.f14579q0 = new org.telegram.ui.Components.c6(this, 0L, 350L, lrVar);
        this.f14581r0 = new org.telegram.ui.Components.c6(this, 0L, 850L, lrVar);
        this.f14584t0 = new float[2];
        this.f14585u0 = new org.telegram.ui.Components.c6(this, 0L, 350L, lrVar);
        this.C0 = new org.telegram.ui.Components.c6(this, 0L, 350L, lrVar);
        this.D0 = new org.telegram.ui.Components.c6(this, 0L, 650L, lrVar);
        this.E0 = new org.telegram.ui.Components.c6(this, 0L, 160L, lr.f37210i);
        this.F0 = new org.telegram.ui.Components.c6(this, 0L, 750L, lrVar);
        this.G0 = new org.telegram.ui.Components.c6(this, 0L, 650L, lrVar);
        this.H0 = new org.telegram.ui.Components.c6(this, 0L, 320L, lrVar);
        this.J0 = new org.telegram.ui.Components.c6(this, 0L, 320L, lrVar);
        this.K0 = new org.telegram.ui.Components.c6(this, 0L, 320L, lrVar);
        this.L0 = new org.telegram.ui.Components.c6(this, 0L, 320L, lrVar);
        this.M0 = new b6(this, 2);
        this.N0 = new b6(this, 3);
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
        d6 d6Var = new d6(this, this);
        this.f14559a0 = d6Var;
        r0.i0.j(this, d6Var);
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
        Drawable mutate = activity.getResources().getDrawable(2131232222).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(1308622847, mode));
        mq mqVar = new mq(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(6.0f), -13750737), mutate);
        this.f14562c = mqVar;
        mqVar.f37616x = false;
        int L = org.telegram.messenger.g0.L(24.0f);
        int L2 = org.telegram.messenger.g0.L(24.0f);
        mqVar.f37610e = L;
        mqVar.f37611f = L2;
        Drawable mutate2 = activity.getResources().getDrawable(2131232287).mutate();
        this.d = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate3 = activity.getResources().getDrawable(2131232287).mutate();
        this.f14565e = mutate3;
        mutate3.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate4 = activity.getResources().getDrawable(2131232157).mutate();
        this.f14567f = mutate4;
        mutate4.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate5 = activity.getResources().getDrawable(2131232148).mutate();
        this.h = mutate5;
        mutate5.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate6 = activity.getResources().getDrawable(2131232349).mutate();
        this.f14575n = mutate6;
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
        if (this.f14583s0) {
            if ((!z10 || f13 - f11 <= org.telegram.messenger.g0.L(100.0f)) && Math.abs(f12 - f10) <= f14) {
                return true;
            }
            return false;
        } else if (a8.w9.a(f10, f11, f12, f13) <= f14) {
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
        this.O.f33895g = j3;
        this.N += f10;
        invalidate();
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        d6 d6Var = this.f14559a0;
        if (d6Var != null && d6Var.f(motionEvent)) {
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
            if (f10 > 0.0f && !this.f14583s0) {
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
        this.f14586v0 = false;
        if (!z10) {
            org.telegram.ui.Components.c6 c6Var = this.f14585u0;
            c6Var.getClass();
            c6Var.e(true, 0.0f);
        }
        invalidate();
    }

    public final void h() {
        ef efVar;
        String str;
        ArrayList arrayList;
        c6 c6Var = this.f14558a;
        mq mqVar = this.f14562c;
        ImageReceiver imageReceiver = this.f14560b;
        if (c6Var != null) {
            ArrayList arrayList2 = mp.u1(imageReceiver.d).R1().f12401w.f14255b;
            imageReceiver.G0(0, 0, true);
            if (arrayList2 != null && !arrayList2.isEmpty() && ((d7) arrayList2.get(0)).O0 != null) {
                imageReceiver.r0(fc.g(((d7) arrayList2.get(0)).O0.getAbsolutePath()), "80_80", null, null, mqVar, 0L, null, null, 0);
                return;
            }
        }
        ue ueVar = MediaController.f22686a2;
        if (ueVar != null && (arrayList = ueVar.f27158e) != null && !arrayList.isEmpty()) {
            efVar = (ef) arrayList.get(0);
        } else {
            efVar = null;
        }
        if (efVar != null && (str = efVar.f27848c) != null) {
            imageReceiver.r0(fc.g(str), "80_80", null, null, mqVar, 0L, null, null, 0);
            return;
        }
        if (efVar != null) {
            int i7 = efVar.C;
            String str2 = efVar.I;
            if (str2 != null) {
                if (efVar.f27847b) {
                    imageReceiver.r0(fc.g("vthumb://" + i7 + ":" + str2), "80_80", null, null, mqVar, 0L, null, null, 0);
                    return;
                }
                imageReceiver.G0(efVar.J, efVar.K, true);
                imageReceiver.r0(fc.g("thumb://" + i7 + ":" + str2), "80_80", null, null, mqVar, 0L, null, null, 0);
                return;
            }
        }
        imageReceiver.w0(mqVar);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f14560b.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f14560b.R();
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r66) {
        throw new UnsupportedOperationException("Method not decompiled: hi.e6.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int L = org.telegram.messenger.g0.L(100.0f);
        float f10 = size;
        this.f14572j0 = f10 / 2.0f;
        this.f14573k0 = L / 2.0f;
        float min = Math.min(org.telegram.messenger.g0.L(135.0f), f10 * 0.35f);
        float f11 = this.f14572j0;
        this.f14574l0 = f11 - min;
        float f12 = f11 + min;
        this.m0 = f12;
        float f13 = this.f14573k0;
        float L2 = org.telegram.messenger.g0.L(14.0f);
        this.d.setBounds((int) (f12 - L2), (int) (f13 - L2), (int) (f12 + L2), (int) (f13 + L2));
        float f14 = this.m0;
        float f15 = this.f14573k0;
        float L3 = org.telegram.messenger.g0.L(14.0f);
        this.f14565e.setBounds((int) (f14 - L3), (int) (f15 - L3), (int) (f14 + L3), (int) (f15 + L3));
        f(this.f14567f, this.f14574l0, this.f14573k0);
        f(this.h, this.f14574l0, this.f14573k0);
        f(this.f14575n, this.f14574l0, this.f14573k0);
        this.f14560b.y0(this.f14574l0 - org.telegram.messenger.g0.L(20.0f), this.f14573k0 - org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
        Matrix matrix = this.I;
        matrix.reset();
        matrix.postTranslate(this.f14572j0, this.f14573k0);
        this.J.setLocalMatrix(matrix);
        setMeasuredDimension(size, L);
        d6 d6Var = this.f14559a0;
        if (d6Var != null) {
            d6Var.i();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int action = motionEvent.getAction();
        float i7 = Utilities.i(motionEvent.getX() + 0.0f, this.m0, this.f14574l0);
        float y10 = motionEvent.getY() + 0.0f;
        boolean c10 = c(i7, y10, this.m0, this.f14573k0, org.telegram.messenger.g0.L(7.0f), true);
        boolean z12 = this.f14586v0;
        mc mcVar = this.M;
        mc mcVar2 = this.K;
        mc mcVar3 = this.L;
        boolean z13 = true;
        boolean z14 = false;
        if (z12) {
            mcVar2.c(false);
            mcVar3.c(false);
            mcVar.c(false);
        } else if (action == 0 || this.f14590x0) {
            mcVar2.c(c(i7, y10, this.f14572j0, this.f14573k0, org.telegram.messenger.g0.L(60.0f), false));
            if (c(i7, y10, this.m0, this.f14573k0, org.telegram.messenger.g0.L(30.0f), true) && !b()) {
                z10 = true;
            } else {
                z10 = false;
            }
            mcVar3.c(z10);
            if (c(i7, y10, this.f14574l0, this.f14573k0, org.telegram.messenger.g0.L(30.0f), false) && !b()) {
                z11 = true;
            } else {
                z11 = false;
            }
            mcVar.c(z11);
        }
        b6 b6Var = this.N0;
        b6 b6Var2 = this.M0;
        if (action == 0) {
            this.f14590x0 = true;
            if (mcVar2.f37434i || mcVar3.f37434i) {
                z14 = true;
            }
            this.f14592y0 = z14;
            System.currentTimeMillis();
            this.f14593z0 = i7;
            if (Math.abs(i7 - this.f14572j0) < org.telegram.messenger.g0.L(50.0f)) {
                org.telegram.messenger.g0.h3(b6Var2, ViewConfiguration.getLongPressTimeout());
            }
            if (mcVar3.f37434i) {
                org.telegram.messenger.g0.h3(b6Var, ViewConfiguration.getLongPressTimeout());
            }
        } else if (action == 2) {
            if (this.f14590x0) {
                this.f14593z0 = Utilities.i(i7, this.m0, this.f14574l0);
                invalidate();
                if (this.f14583s0 && !this.Y0 && c10) {
                    d(180.0f);
                    ((q9) this.f14558a).b();
                }
                if (this.f14583s0 && this.A0) {
                    float i10 = Utilities.i(((this.f14573k0 - org.telegram.messenger.g0.L(48.0f)) - y10) / (org.telegram.messenger.g0.f24118q.y / 2.0f), 1.0f, 0.0f);
                    ta taVar = ((q9) this.f14558a).f15293a;
                    taVar.W0.b(true, i10);
                    taVar.i0(false);
                }
            }
            return false;
        } else if (action != 1 && action != 3) {
            z13 = false;
        } else {
            if (this.f14590x0) {
                this.f14590x0 = false;
                this.f14592y0 = false;
                org.telegram.messenger.g0.r(b6Var2);
                org.telegram.messenger.g0.r(b6Var);
                boolean z15 = this.f14583s0;
                if (!z15 && mcVar.f37434i) {
                    ((q9) this.f14558a).c();
                } else if (z15 && this.A0) {
                    if (mcVar.f37434i) {
                        this.A0 = false;
                        this.H0.e(true, 1.0f);
                        j3 j3Var = ((q9) this.f14558a).f15293a.U0;
                        j3Var.f14806a.t(gd.M0(2131744426, null), true, true);
                        j3Var.invalidate();
                    } else {
                        this.f14583s0 = false;
                        this.f14588w0 = SystemClock.elapsedRealtime();
                        this.f14586v0 = true;
                        ((q9) this.f14558a).e(false);
                    }
                } else if (mcVar2.f37434i) {
                    if (b()) {
                        ((q9) this.f14558a).a();
                    } else if (!this.f14578p0 && !this.f14583s0 && !this.A0) {
                        ((q9) this.f14558a).d();
                    } else if (!this.f14583s0) {
                        if (ta.c(((q9) this.f14558a).f15293a)) {
                            this.S = 0L;
                            this.R = System.currentTimeMillis();
                            this.B0 = false;
                            ((q9) this.f14558a).f(new b6(this, 1), false);
                        }
                    } else {
                        this.f14583s0 = false;
                        this.f14588w0 = SystemClock.elapsedRealtime();
                        this.f14586v0 = true;
                        ((q9) this.f14558a).e(false);
                    }
                }
                this.A0 = false;
                if (mcVar3.f37434i) {
                    d(180.0f);
                    ((q9) this.f14558a).b();
                }
                mcVar2.c(false);
                mcVar3.c(false);
                mcVar.c(false);
                invalidate();
            }
            return false;
        }
        this.Y0 = c10;
        return z13;
    }

    public void setDelegate(c6 c6Var) {
        this.f14558a = c6Var;
    }

    public void setDual(boolean z10) {
        if (z10 != this.P) {
            this.P = z10;
            invalidate();
        }
    }

    @Override
    public void setInvert(float f10) {
        this.f14582s.setColor(i0.a.f(f10, -1, -16777216));
        this.f14589x.setColor(i0.a.f(f10, 1677721600, 369098752));
        this.F.setColor(i0.a.f(f10, 1493172223, 285212671));
        this.G.setColor(i0.a.f(f10, 402653184, 805306368));
        int f11 = i0.a.f(f10, -1, -16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.d.setColorFilter(new PorterDuffColorFilter(f11, mode));
        this.f14567f.setColorFilter(new PorterDuffColorFilter(i0.a.f(f10, -1, -16777216), mode));
    }
}
