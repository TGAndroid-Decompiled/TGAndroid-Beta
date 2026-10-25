package kg;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import bh.b0;
import bi.ce;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.t;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.g91;
import org.telegram.ui.hl0;
public abstract class h extends View implements j {
    public static final boolean A1;
    public static final boolean B1;
    public static final u1.a C1;
    public static final float f16568k1 = AndroidUtilities.dpf2(16.0f);
    public static final float l1 = AndroidUtilities.dpf2(1.5f);
    public static final float f16569m1 = AndroidUtilities.dpf2(12.0f);
    public static final int f16570n1 = AndroidUtilities.dp(18.0f);
    public static final int f16571o1 = AndroidUtilities.dp(14.0f);
    public static final int f16572p1 = AndroidUtilities.dp(10.0f);
    public static final int f16573q1 = AndroidUtilities.dp(16.0f);
    public static final int f16574r1 = AndroidUtilities.dp(24.0f);
    public static final int f16575s1 = AndroidUtilities.dp(16.0f);
    public static final int f16576t1 = AndroidUtilities.dp(10.0f);
    public static final int f16577u1 = AndroidUtilities.dp(12.0f);
    public static final int f16578v1 = AndroidUtilities.dp(8.0f);
    public static final int f16579w1 = AndroidUtilities.dp(6.0f);
    public static final int f16580x1 = AndroidUtilities.dp(5.0f);
    public static final int f16581y1 = AndroidUtilities.dp(2.0f);
    public static final int f16582z1 = AndroidUtilities.dp(1.0f);
    public final int A0;
    public final int B0;
    public float C0;
    public float D0;
    public float E;
    public float E0;
    public int F;
    public float F0;
    public int G;
    public float G0;
    public boolean H;
    public final RectF H0;
    public boolean I;
    public VibrationEffect I0;
    public boolean J;
    public final d J0;
    public final Paint K;
    public final d K0;
    public final Paint L;
    public final b L0;
    public final Paint M;
    public final b M0;
    public final TextPaint N;
    public final d N0;
    public final TextPaint O;
    public final e O0;
    public final TextPaint P;
    public boolean P0;
    public final Paint Q;
    public f Q0;
    public final Paint R;
    public float R0;
    public final Paint S;
    public float S0;
    public final Paint T;
    public float T0;
    public final Paint U;
    public float U0;
    public final Rect V;
    public float V0;
    public final Path W;
    public final u6 W0;
    public int X0;
    public int Y0;
    public final Rect Z0;
    public g f16583a;
    public AnimatorSet f16584a0;
    public final ArrayList f16585a1;
    public final ArrayList f16586b;
    public ValueAnimator f16587b0;
    public long f16588b1;
    public final ArrayList f16589c;
    public ValueAnimator f16590c0;
    public int f16591c1;
    public final ArrayList d;
    public Animator f16592d0;
    public int f16593d1;
    public boolean e;
    public ValueAnimator f16594e0;
    public int f16595e1;
    public float f16596f;
    public boolean f16597f0;
    public int f16598f1;
    public final k f16599g0;
    public long f16600g1;
    public float h;
    public lg.b f16601h0;
    public boolean f16602h1;
    public mg.b f16603i0;
    public boolean f16604i1;
    public float f16605j0;
    public mg.c f16606j1;
    public float f16607k0;
    public float f16608l0;
    public int m0;
    public int f16609n;
    public int f16610n0;
    public int f16611o0;
    public Bitmap f16612p0;
    public Canvas f16613q0;
    public int f16614r;
    public boolean f16615r0;
    public int f16616s;
    public int f16617s0;
    public mg.e f16618t0;
    public boolean f16619u0;
    public float v;
    public float f16620v0;
    public float f16621w;
    public boolean f16622w0;
    public float f16623x;
    public boolean f16624x0;
    public float f16625y;
    public int f16626y0;
    public mg.j f16627z0;

    static {
        boolean z10;
        if (Build.VERSION.SDK_INT < 28) {
            z10 = true;
        } else {
            z10 = false;
        }
        A1 = z10;
        B1 = true;
        C1 = new u1.a();
    }

    public h(Context context, u6 u6Var) {
        super(context);
        this.f16586b = new ArrayList(10);
        this.f16589c = new ArrayList(25);
        this.d = new ArrayList();
        this.e = true;
        this.v = 250.0f;
        this.f16621w = 0.0f;
        this.f16623x = 0.0f;
        this.f16625y = 0.0f;
        this.E = 0.0f;
        this.H = true;
        this.I = false;
        this.J = true;
        this.K = new Paint();
        this.L = new Paint();
        this.M = new Paint();
        this.N = new TextPaint(1);
        this.O = new TextPaint(1);
        this.P = new TextPaint(1);
        this.Q = new Paint(1);
        this.R = new Paint();
        this.S = new Paint(1);
        this.T = new Paint(1);
        this.U = new Paint(1);
        this.V = new Rect();
        this.W = new Path();
        this.f16597f0 = false;
        ?? obj = new Object();
        obj.h = new Rect();
        obj.f16638i = new Rect();
        obj.f16639j = new Rect();
        obj.f16640k = 0.7f;
        obj.f16641l = 1.0f;
        obj.f16642m = 0.1f;
        obj.f16643n = new i[]{null, null};
        obj.f16633a = this;
        this.f16599g0 = obj;
        this.f16615r0 = false;
        this.f16617s0 = -1;
        this.f16619u0 = false;
        this.f16620v0 = 0.0f;
        this.f16622w0 = false;
        this.f16624x0 = false;
        this.f16626y0 = 0;
        this.B0 = AndroidUtilities.dp(46.0f);
        this.H0 = new RectF();
        this.J0 = new d(this, 0);
        this.K0 = new d(this, 1);
        this.L0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final h f16555b;

            {
                this.f16555b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        h hVar = this.f16555b;
                        hVar.getClass();
                        hVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        hVar.invalidate();
                        return;
                    default:
                        h hVar2 = this.f16555b;
                        hVar2.getClass();
                        hVar2.f16621w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        hVar2.invalidate();
                        return;
                }
            }
        };
        this.M0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final h f16555b;

            {
                this.f16555b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        h hVar = this.f16555b;
                        hVar.getClass();
                        hVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        hVar.invalidate();
                        return;
                    default:
                        h hVar2 = this.f16555b;
                        hVar2.getClass();
                        hVar2.f16621w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        hVar2.invalidate();
                        return;
                }
            }
        };
        this.N0 = new d(this, 2);
        this.O0 = new e(this, 0);
        this.P0 = false;
        this.X0 = 0;
        this.Y0 = 0;
        Rect rect = new Rect();
        this.Z0 = rect;
        ArrayList arrayList = new ArrayList();
        this.f16585a1 = arrayList;
        arrayList.add(rect);
        this.f16588b1 = 0L;
        this.f16604i1 = false;
        this.W0 = u6Var;
        t();
        this.A0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public static void b(Path path, float f7, float f10, float f11, float f12, float f13, float f14, boolean z10, boolean z11, boolean z12, boolean z13) {
        path.reset();
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        float f15 = f11 - f7;
        float f16 = f12 - f10;
        float f17 = f15 / 2.0f;
        if (f13 > f17) {
            f13 = f17;
        }
        float f18 = f16 / 2.0f;
        if (f14 > f18) {
            f14 = f18;
        }
        float f19 = f15 - (f13 * 2.0f);
        float f20 = f16 - (2.0f * f14);
        path.moveTo(f11, f10 + f14);
        if (z11) {
            float f21 = -f14;
            path.rQuadTo(0.0f, f21, -f13, f21);
        } else {
            path.rLineTo(0.0f, -f14);
            path.rLineTo(-f13, 0.0f);
        }
        path.rLineTo(-f19, 0.0f);
        if (z10) {
            float f22 = -f13;
            path.rQuadTo(f22, 0.0f, f22, f14);
        } else {
            path.rLineTo(-f13, 0.0f);
            path.rLineTo(0.0f, f14);
        }
        path.rLineTo(0.0f, f20);
        if (z13) {
            path.rQuadTo(0.0f, f14, f13, f14);
        } else {
            path.rLineTo(0.0f, f14);
            path.rLineTo(f13, 0.0f);
        }
        path.rLineTo(f19, 0.0f);
        if (z12) {
            path.rQuadTo(f13, 0.0f, f13, -f14);
        } else {
            path.rLineTo(f13, 0.0f);
            path.rLineTo(0.0f, -f14);
        }
        path.rLineTo(0.0f, -f20);
        path.close();
    }

    public static ValueAnimator e(float f7, float f10, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f10);
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(C1);
        ofFloat.addUpdateListener(animatorUpdateListener);
        return ofFloat;
    }

    public void A(boolean z10, boolean z11, boolean z12) {
        long j10;
        if (this.f16601h0 == null) {
            return;
        }
        float f7 = this.F0;
        k kVar = this.f16599g0;
        this.G0 = f7 / (kVar.f16641l - kVar.f16640k);
        H();
        if (this.P0) {
            j10 = s(this.F, this.G);
        } else {
            j10 = 0;
        }
        E(r(this.F, this.G), j10, z10, z11, z12);
        if (this.f16619u0 && !z11) {
            c(false);
            x((this.G0 * kVar.f16640k) - f16568k1);
        }
        invalidate();
    }

    public final void B() {
        if (Build.VERSION.SDK_INT >= 26) {
            Vibrator vibrator = (Vibrator) getContext().getSystemService("vibrator");
            if (this.I0 == null) {
                this.I0 = VibrationEffect.createWaveform(new long[]{0, 2}, -1);
            }
            vibrator.cancel();
            vibrator.vibrate(this.I0);
        }
    }

    public void C(int i10, int i11) {
        int i12 = this.f16617s0;
        lg.b bVar = this.f16601h0;
        if (bVar != null) {
            float f7 = this.G0;
            float f10 = (this.f16599g0.f16640k * f7) - f16568k1;
            float f11 = (i10 + f10) / f7;
            if (f11 < 0.0f) {
                this.f16617s0 = 0;
            } else if (f11 > 1.0f) {
                this.f16617s0 = bVar.f17011a.length - 1;
            } else {
                int b10 = bVar.b(f11, this.F, this.G);
                this.f16617s0 = b10;
                int i13 = b10 + 1;
                float[] fArr = this.f16601h0.f17012b;
                if (i13 < fArr.length) {
                    if (Math.abs(this.f16601h0.f17012b[this.f16617s0 + 1] - f11) < Math.abs(fArr[b10] - f11)) {
                        this.f16617s0++;
                    }
                }
            }
            int i14 = this.f16617s0;
            int i15 = this.G;
            if (i14 > i15) {
                this.f16617s0 = i15;
            }
            int i16 = this.f16617s0;
            int i17 = this.F;
            if (i16 < i17) {
                this.f16617s0 = i17;
            }
            if (i12 != this.f16617s0) {
                this.f16619u0 = true;
                c(true);
                x(f10);
                f fVar = this.Q0;
                if (fVar != null) {
                    getSelectedDate();
                    g91 g91Var = (g91) ((hl0) fVar).f40032b;
                    g91Var.f();
                    g91Var.f39569b.f16618t0.d(false, false);
                }
                B();
                invalidate();
            }
        }
    }

    public boolean D(lg.b bVar) {
        boolean z10;
        lg.b bVar2 = this.f16601h0;
        long j10 = 0;
        k kVar = this.f16599g0;
        ArrayList arrayList = this.d;
        if (bVar2 != bVar) {
            invalidate();
            arrayList.clear();
            if (bVar != null && bVar.d != null) {
                for (int i10 = 0; i10 < bVar.d.size(); i10++) {
                    arrayList.add(h((lg.a) bVar.d.get(i10)));
                }
            }
            d();
            this.f16601h0 = bVar;
            if (bVar != null) {
                if (bVar.f17011a[0] == 0) {
                    kVar.f16640k = 0.0f;
                    kVar.f16641l = 1.0f;
                } else {
                    float minDistance = getMinDistance();
                    kVar.f16642m = minDistance;
                    float f7 = kVar.f16641l;
                    if (f7 - kVar.f16640k < minDistance) {
                        float f10 = f7 - minDistance;
                        kVar.f16640k = f10;
                        if (f10 < 0.0f) {
                            kVar.f16640k = 0.0f;
                            kVar.f16641l = 1.0f;
                        }
                    }
                }
            }
            z10 = true;
        } else {
            z10 = false;
        }
        w();
        if (bVar != null) {
            H();
            if (this.P0) {
                j10 = s(this.F, this.G);
            }
            E(r(this.F, this.G), j10, false, false, false);
            this.f16605j0 = 0.0f;
            this.f16607k0 = 2.1474836E9f;
            u();
            int i11 = bVar.f17017j;
            if (i11 != 1 && i11 != 2) {
                this.f16618t0.setSize(arrayList.size());
            } else {
                this.f16618t0.setSize(arrayList.size() * 2);
            }
            this.H = true;
            I();
            return z10;
        }
        kVar.f16640k = 0.7f;
        kVar.f16641l = 1.0f;
        this.f16607k0 = 0.0f;
        this.f16605j0 = 0.0f;
        this.f16586b.clear();
        AnimatorSet animatorSet = this.f16584a0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator valueAnimator = this.f16587b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f16587b0.cancel();
        }
        return z10;
    }

    public final void E(long j10, long j11, boolean z10, boolean z11, boolean z12) {
        long j12;
        float f7;
        boolean z13;
        if (j10 > 100 && ((float) (j10 / 5)) % 10.0f != 0.0f) {
            j12 = ((j10 / 10) + 1) * 10;
        } else {
            j12 = j10;
        }
        if ((Math.abs(((float) (((long) Math.ceil(((float) j12) / 5.0f)) * 5)) - this.f16623x) >= this.E && j10 != 0) || ((float) j10) != this.f16625y) {
            mg.d f10 = f(this.f16601h0.f17016i, j10, j11);
            long[] jArr = f10.f18450a;
            long j13 = jArr[jArr.length - 1];
            long j14 = jArr[0];
            if (!z12) {
                float f11 = this.v - this.f16621w;
                float f12 = (float) (j13 - j14);
                float f13 = f11 / f12;
                if (f13 > 1.0f) {
                    f13 = f12 / f11;
                }
                double d = f13;
                if (d > 0.7d) {
                    f7 = 0.1f;
                } else if (d < 0.1d) {
                    f7 = 0.03f;
                } else {
                    f7 = 0.045f;
                }
                if (((float) j13) != this.f16623x) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (this.P0 && ((float) j14) != this.f16625y) {
                    z13 = true;
                }
                if (z13) {
                    AnimatorSet animatorSet = this.f16584a0;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        this.f16584a0.cancel();
                    }
                    this.T0 = this.v;
                    this.U0 = this.f16621w;
                    this.R0 = 0.0f;
                    this.S0 = 0.0f;
                    this.V0 = f7;
                }
            }
            float f14 = (float) j13;
            this.f16623x = f14;
            float f15 = (float) j14;
            this.f16625y = f15;
            v();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f16588b1 < 320 && !z11) {
                return;
            }
            this.f16588b1 = currentTimeMillis;
            ValueAnimator valueAnimator = this.f16587b0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f16587b0.cancel();
            }
            ArrayList arrayList = this.f16586b;
            if (!z10) {
                this.v = f14;
                this.f16621w = f15;
                arrayList.clear();
                arrayList.add(f10);
                f10.f18453f = 255;
                return;
            }
            arrayList.add(f10);
            if (z12) {
                AnimatorSet animatorSet2 = this.f16584a0;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    this.f16584a0.cancel();
                }
                this.V0 = 0.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(e(this.v, f14, this.L0));
                if (this.P0) {
                    animatorSet3.playTogether(e(this.f16621w, f15, this.M0));
                }
                this.f16584a0 = animatorSet3;
                animatorSet3.start();
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                mg.d dVar = (mg.d) arrayList.get(i10);
                if (dVar != f10) {
                    dVar.f18454g = dVar.f18453f;
                }
            }
            ValueAnimator e = e(0.0f, 255.0f, new b0(5, this, f10));
            this.f16587b0 = e;
            e.addListener(new ce(7, this, f10));
            this.f16587b0.start();
        }
    }

    public final void F() {
        float f7 = this.V0;
        if (f7 != 0.0f) {
            float f10 = this.v;
            float f11 = this.f16623x;
            if (f10 != f11) {
                float f12 = this.R0 + f7;
                this.R0 = f12;
                if (f12 > 1.0f) {
                    this.R0 = 1.0f;
                    this.v = f11;
                } else {
                    float f13 = this.T0;
                    this.v = (ds.f27585g.getInterpolation(f12) * (f11 - f13)) + f13;
                }
                invalidate();
            }
            if (this.P0) {
                float f14 = this.f16621w;
                float f15 = this.f16625y;
                if (f14 != f15) {
                    float f16 = this.S0 + this.V0;
                    this.S0 = f16;
                    if (f16 > 1.0f) {
                        this.S0 = 1.0f;
                        this.f16621w = f15;
                    } else {
                        float f17 = this.U0;
                        this.f16621w = (ds.f27585g.getInterpolation(f16) * (f15 - f17)) + f17;
                    }
                    invalidate();
                }
            }
        }
    }

    public final void G() {
        int i10;
        int i11;
        if (this.f16624x0) {
            i10 = y6.Zi;
        } else {
            i10 = y6.Yi;
        }
        u6 u6Var = this.W0;
        int w02 = y6.w0(i10, u6Var);
        TextPaint textPaint = this.N;
        textPaint.setColor(w02);
        if (this.f16624x0) {
            i11 = y6.Zi;
        } else {
            i11 = y6.Yi;
        }
        this.O.setColor(y6.w0(i11, u6Var));
        int w03 = y6.w0(y6.Yi, u6Var);
        TextPaint textPaint2 = this.P;
        textPaint2.setColor(w03);
        int w04 = y6.w0(y6.aj, u6Var);
        Paint paint = this.L;
        paint.setColor(w04);
        int w05 = y6.w0(y6.bj, u6Var);
        Paint paint2 = this.M;
        paint2.setColor(w05);
        this.Q.setColor(y6.w0(y6.dj, u6Var));
        this.R.setColor(y6.w0(y6.cj, u6Var));
        this.S.setColor(y6.w0(y6.f23354d6, u6Var));
        this.T.setColor(y6.w0(y6.ej, u6Var));
        this.f16618t0.b();
        this.f16609n = paint.getAlpha();
        this.f16614r = paint2.getAlpha();
        this.f16596f = textPaint.getAlpha() / 255.0f;
        this.h = textPaint2.getAlpha() / 255.0f;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((mg.f) obj).a();
        }
        if (this.f16619u0) {
            int i13 = this.f16617s0;
            lg.b bVar = this.f16601h0;
            long[] jArr = bVar.f17011a;
            if (i13 < jArr.length) {
                this.f16618t0.c(i13, jArr[i13], arrayList, false, bVar.f17017j, bVar.h);
            }
        }
        this.H = true;
    }

    public final void H() {
        lg.b bVar = this.f16601h0;
        if (bVar == null) {
            return;
        }
        k kVar = this.f16599g0;
        int c10 = bVar.c(Math.max(kVar.f16640k, 0.0f));
        this.F = c10;
        int a2 = this.f16601h0.a(Math.min(kVar.f16641l, 1.0f), c10);
        this.G = a2;
        int i10 = this.F;
        if (a2 < i10) {
            this.G = i10;
        }
        mg.c cVar = this.f16606j1;
        if (cVar != null) {
            long[] jArr = this.f16601h0.f17011a;
            cVar.b(jArr[i10], jArr[this.G]);
        }
        I();
    }

    public final void I() {
        lg.b bVar = this.f16601h0;
        if (bVar != null) {
            float f7 = this.F0;
            if (f7 != 0.0f) {
                int i10 = (int) ((f7 / (this.G0 * bVar.f17015g)) / 6.0f);
                mg.b bVar2 = this.f16603i0;
                if (bVar2 == null || i10 >= bVar2.f18442b || i10 <= bVar2.f18443c) {
                    int highestOneBit = Integer.highestOneBit(i10) << 1;
                    mg.b bVar3 = this.f16603i0;
                    if (bVar3 == null || bVar3.f18441a != highestOneBit) {
                        ValueAnimator valueAnimator = this.f16590c0;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllListeners();
                            this.f16590c0.cancel();
                        }
                        double d = highestOneBit;
                        double d10 = 0.2d * d;
                        mg.b bVar4 = new mg.b(highestOneBit, (int) (d + d10), (int) (d - d10));
                        bVar4.d = 255;
                        mg.b bVar5 = this.f16603i0;
                        ArrayList arrayList = this.f16589c;
                        if (bVar5 == null) {
                            this.f16603i0 = bVar4;
                            bVar4.d = 255;
                            arrayList.add(bVar4);
                            return;
                        }
                        this.f16603i0 = bVar4;
                        this.m0 = arrayList.size();
                        for (int i11 = 0; i11 < this.m0; i11++) {
                            mg.b bVar6 = (mg.b) arrayList.get(i11);
                            bVar6.e = bVar6.d;
                        }
                        arrayList.add(bVar4);
                        if (arrayList.size() > 2) {
                            arrayList.remove(0);
                        }
                        ValueAnimator duration = e(0.0f, 1.0f, new b0(6, this, bVar4)).setDuration(200L);
                        this.f16590c0 = duration;
                        duration.addListener(new ce(8, this, bVar4));
                        this.f16590c0.start();
                    }
                }
            }
        }
    }

    public void J(lg.b bVar, long j10) {
        int length = bVar.f17011a.length;
        long j11 = j10 - (j10 % 86400000);
        long j12 = 86399999 + j11;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            long j13 = bVar.f17011a[i12];
            if (j11 > j13) {
                i10 = i12;
            }
            if (j12 > j13) {
                i11 = i12;
            }
        }
        float[] fArr = bVar.f17012b;
        float f7 = fArr[i10];
        k kVar = this.f16599g0;
        kVar.f16640k = f7;
        kVar.f16641l = fArr[i11];
    }

    public void K() {
        if (B1) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j10 = Long.MAX_VALUE;
            int i10 = 0;
            long j11 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                mg.f fVar = (mg.f) obj;
                boolean z10 = fVar.f18475n;
                lg.a aVar = fVar.f18465a;
                if (z10) {
                    long j12 = aVar.e;
                    if (j12 > j11) {
                        j11 = j12;
                    }
                }
                if (z10) {
                    long j13 = aVar.f17008f;
                    if (j13 < j10) {
                        j10 = j13;
                    }
                }
            }
            if ((j10 != 2147483647L && ((float) j10) != 0.0f) || (j11 > 0 && ((float) j11) != this.f16608l0)) {
                this.f16608l0 = (float) j11;
                Animator animator = this.f16592d0;
                if (animator != null) {
                    animator.cancel();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(e(this.f16605j0, this.f16608l0, this.J0), e(this.f16607k0, 0.0f, this.K0));
                this.f16592d0 = animatorSet;
                animatorSet.start();
            }
        }
    }

    @Override
    public void a(float f7, float f10, boolean z10) {
        lg.b bVar = this.f16601h0;
        if (bVar == null) {
            return;
        }
        if (z10) {
            int c10 = bVar.c(Math.max(f7, 0.0f));
            int a2 = this.f16601h0.a(Math.min(f10, 1.0f), c10);
            E(r(c10, a2), s(c10, a2), true, true, false);
            c(false);
            return;
        }
        H();
        invalidate();
    }

    public final void c(boolean z10) {
        float f7;
        x((this.G0 * this.f16599g0.f16640k) - f16568k1);
        if (this.f16604i1 == z10) {
            return;
        }
        this.f16604i1 = z10;
        ValueAnimator valueAnimator = this.f16594e0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f16594e0.cancel();
        }
        float f10 = this.f16620v0;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator duration = e(f10, f7, this.N0).setDuration(200L);
        this.f16594e0 = duration;
        duration.addListener(this.O0);
        this.f16594e0.start();
    }

    public final void d() {
        this.f16617s0 = -1;
        this.f16619u0 = false;
        this.f16604i1 = false;
        this.f16618t0.setVisibility(8);
        this.f16620v0 = 0.0f;
    }

    public mg.d f(int i10, long j10, long j11) {
        return new mg.d(j10, j11, this.P0, this.f16601h0.h, i10, this.N, this.O);
    }

    public mg.e g() {
        return new mg.e(getContext(), this.W0);
    }

    public long getEndDate() {
        return this.f16601h0.f17011a[this.G];
    }

    public float getMinDistance() {
        lg.b bVar = this.f16601h0;
        if (bVar == null) {
            return 0.1f;
        }
        int length = bVar.f17011a.length;
        if (length < 5) {
            return 1.0f;
        }
        float f7 = 5.0f / length;
        if (f7 < 0.1f) {
            return 0.1f;
        }
        return f7;
    }

    public long getSelectedDate() {
        int i10 = this.f16617s0;
        if (i10 < 0) {
            return -1L;
        }
        return this.f16601h0.f17011a[i10];
    }

    public long getStartDate() {
        return this.f16601h0.f17011a[this.F];
    }

    public abstract mg.f h(lg.a aVar);

    public void i(Canvas canvas) {
        int measuredHeight;
        if (this.f16601h0 != null) {
            int i10 = this.f16626y0;
            float f7 = 1.0f;
            if (i10 == 2) {
                f7 = 1.0f - this.f16627z0.f18484f;
            } else if (i10 == 1) {
                f7 = this.f16627z0.f18484f;
            } else if (i10 == 3) {
                f7 = this.f16627z0.f18484f;
            }
            Paint paint = this.L;
            paint.setAlpha((int) (this.f16609n * f7));
            TextPaint textPaint = this.N;
            textPaint.setAlpha((int) (this.f16596f * 255.0f * f7));
            this.O.setAlpha((int) (this.f16596f * 255.0f * f7));
            int textSize = (int) (f16570n1 - textPaint.getTextSize());
            float measuredHeight2 = (getMeasuredHeight() - this.f16616s) - 1;
            canvas.drawLine(this.D0, measuredHeight2, this.E0, measuredHeight2, paint);
            if (this.P0) {
                return;
            }
            canvas.drawText("0", f16568k1, measuredHeight - textSize, textPaint);
        }
    }

    public void j(Canvas canvas) {
        float f7;
        char c10;
        int i10;
        int i11;
        if (this.f16601h0 != null) {
            ArrayList arrayList = this.f16589c;
            this.m0 = arrayList.size();
            int i12 = this.f16626y0;
            float f10 = 1.0f;
            int i13 = 1;
            if (i12 == 2) {
                f7 = 1.0f - this.f16627z0.f18484f;
            } else if (i12 == 1) {
                f7 = this.f16627z0.f18484f;
            } else if (i12 == 3) {
                f7 = this.f16627z0.f18484f;
            } else {
                f7 = 1.0f;
            }
            char c11 = 0;
            this.f16610n0 = 0;
            while (true) {
                int i14 = this.f16610n0;
                if (i14 < this.m0) {
                    int i15 = ((mg.b) arrayList.get(i14)).d;
                    int i16 = ((mg.b) arrayList.get(this.f16610n0)).f18441a;
                    if (i16 == 0) {
                        i16 = i13;
                    }
                    int i17 = this.F - this.f16611o0;
                    while (i17 % i16 != 0) {
                        i17--;
                    }
                    int i18 = this.G - this.f16611o0;
                    while (true) {
                        if (i18 % i16 == 0 && i18 >= this.f16601h0.f17011a.length - i13) {
                            break;
                        }
                        i18++;
                        i13 = i13;
                        i15 = i15;
                        c11 = c11;
                        f10 = 1.0f;
                    }
                    int i19 = this.f16611o0;
                    int i20 = i17 + i19;
                    int i21 = i18 + i19;
                    float f11 = this.G0 * this.f16599g0.f16640k;
                    float f12 = f16568k1;
                    float f13 = f11 - f12;
                    while (i20 < i21) {
                        if (i20 >= 0) {
                            long[] jArr = this.f16601h0.f17011a;
                            if (i20 < jArr.length - i13) {
                                long j10 = jArr[i20];
                                long j11 = jArr[c11];
                                long j12 = jArr[jArr.length - i13];
                                i10 = i13;
                                i11 = i15;
                                float f14 = ((((float) (j10 - j11)) / ((float) (j12 - j11))) * this.G0) - f13;
                                float f15 = f14 - f16576t1;
                                if (f15 > 0.0f) {
                                    float f16 = this.F0;
                                    if (f15 <= f16 + f12) {
                                        float f17 = f16572p1;
                                        int i22 = (f15 > f17 ? 1 : (f15 == f17 ? 0 : -1));
                                        c10 = c11;
                                        TextPaint textPaint = this.P;
                                        if (i22 < 0) {
                                            textPaint.setAlpha((int) (i11 * t.y(f17, f15, f17, f10) * this.h * f7));
                                        } else if (f15 > f16) {
                                            textPaint.setAlpha((int) (i11 * t.y(f15, f16, f12, f10) * this.h * f7));
                                        } else {
                                            textPaint.setAlpha((int) (i11 * this.h * f7));
                                        }
                                        lg.b bVar = this.f16601h0;
                                        String[] strArr = bVar.f17013c;
                                        long[] jArr2 = bVar.f17011a;
                                        canvas.drawText(strArr[(int) ((jArr2[i20] - jArr2[c10]) / bVar.f17018k)], f14, AndroidUtilities.dp(3.0f) + (getMeasuredHeight() - this.f16616s) + f16571o1, textPaint);
                                        i20 += i16;
                                        i13 = i10;
                                        i15 = i11;
                                        c11 = c10;
                                        f10 = 1.0f;
                                    }
                                }
                                c10 = c11;
                                i20 += i16;
                                i13 = i10;
                                i15 = i11;
                                c11 = c10;
                                f10 = 1.0f;
                            }
                        }
                        c10 = c11;
                        i10 = i13;
                        i11 = i15;
                        i20 += i16;
                        i13 = i10;
                        i15 = i11;
                        c11 = c10;
                        f10 = 1.0f;
                    }
                    this.f16610n0 += i13;
                    c11 = c11;
                    f10 = 1.0f;
                } else {
                    return;
                }
            }
        }
    }

    public abstract void k(Canvas canvas);

    public void l(android.graphics.Canvas r12, mg.d r13) {
        throw new UnsupportedOperationException("Method not decompiled: kg.h.l(android.graphics.Canvas, mg.d):void");
    }

    public final void m(android.graphics.Canvas r39) {
        throw new UnsupportedOperationException("Method not decompiled: kg.h.m(android.graphics.Canvas):void");
    }

    public abstract void n(Canvas canvas);

    public void o(Canvas canvas) {
        lg.b bVar;
        int i10 = this.f16617s0;
        if (i10 >= 0 && this.f16619u0 && (bVar = this.f16601h0) != null) {
            int i11 = (int) (this.f16614r * this.f16620v0);
            float f7 = this.F0;
            k kVar = this.f16599g0;
            float f10 = kVar.f16641l;
            float f11 = kVar.f16640k;
            float f12 = f7 / (f10 - f11);
            float f13 = (f11 * f12) - f16568k1;
            float[] fArr = bVar.f17012b;
            if (i10 < fArr.length) {
                float f14 = (fArr[i10] * f12) - f13;
                Paint paint = this.M;
                paint.setAlpha(i11);
                canvas.drawLine(f14, 0.0f, f14, this.H0.bottom, paint);
                if (this.e) {
                    ArrayList arrayList = this.d;
                    this.m0 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        this.f16610n0 = i12;
                        int i13 = this.f16610n0;
                        if (i13 < this.m0) {
                            mg.f fVar = (mg.f) arrayList.get(i13);
                            boolean z10 = fVar.f18475n;
                            Paint paint2 = fVar.d;
                            if (z10 || fVar.f18476o != 0.0f) {
                                float f15 = (float) fVar.f18465a.f17005a[this.f16617s0];
                                float f16 = this.f16621w;
                                float measuredHeight = (getMeasuredHeight() - this.f16616s) - (((f15 - f16) / (this.v - f16)) * ((getMeasuredHeight() - this.f16616s) - f16570n1));
                                paint2.setAlpha((int) (fVar.f18476o * 255.0f * this.f16620v0));
                                Paint paint3 = this.S;
                                paint3.setAlpha((int) (fVar.f18476o * 255.0f * this.f16620v0));
                                canvas.drawPoint(f14, measuredHeight, paint2);
                                canvas.drawPoint(f14, measuredHeight, paint3);
                            }
                            i12 = this.f16610n0 + 1;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.f16622w0) {
            super.onDraw(canvas);
            return;
        }
        F();
        int save = canvas.save();
        RectF rectF = this.H0;
        canvas.clipRect(0.0f, rectF.top, getMeasuredWidth(), rectF.bottom);
        i(canvas);
        ArrayList arrayList = this.f16586b;
        this.m0 = arrayList.size();
        int i10 = 0;
        this.f16610n0 = 0;
        while (true) {
            int i11 = this.f16610n0;
            if (i11 >= this.m0) {
                break;
            }
            l(canvas, (mg.d) arrayList.get(i11));
            this.f16610n0++;
        }
        k(canvas);
        while (true) {
            this.f16610n0 = i10;
            int i12 = this.f16610n0;
            if (i12 < this.m0) {
                p(canvas, (mg.d) arrayList.get(i12));
                i10 = this.f16610n0 + 1;
            } else {
                canvas.restoreToCount(save);
                j(canvas);
                m(canvas);
                o(canvas);
                super.onDraw(canvas);
                return;
            }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.I) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i10));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.displaySize.y - AndroidUtilities.dp(56.0f));
        }
        int measuredWidth = getMeasuredWidth();
        int i12 = this.X0;
        int i13 = this.B0;
        if (measuredWidth != i12 || getMeasuredHeight() != this.Y0) {
            this.X0 = getMeasuredWidth();
            this.Y0 = getMeasuredHeight();
            float f7 = f16568k1;
            float f10 = 2.0f * f7;
            this.f16612p0 = Bitmap.createBitmap((int) (getMeasuredWidth() - f10), i13, Bitmap.Config.ARGB_4444);
            this.f16613q0 = new Canvas(this.f16612p0);
            this.f16583a.a(i13, (int) (getMeasuredWidth() - f10));
            w();
            if (this.f16619u0) {
                x((this.G0 * this.f16599g0.f16640k) - f7);
            }
            A(false, true, false);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int measuredHeight = getMeasuredHeight();
            int i14 = f16573q1;
            this.Z0.set(0, measuredHeight - ((i13 + i14) + i14), getMeasuredWidth(), getMeasuredHeight());
            setSystemGestureExclusionRects(this.f16585a1);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        long j10;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean z10 = false;
        if (this.f16601h0 != null) {
            boolean z11 = this.J;
            k kVar = this.f16599g0;
            if (!z11) {
                kVar.c(motionEvent.getActionIndex(), motionEvent);
                getParent().requestDisallowInterceptTouchEvent(false);
                this.f16615r0 = false;
                return false;
            }
            int x9 = (int) motionEvent.getX(motionEvent.getActionIndex());
            int y3 = (int) motionEvent.getY(motionEvent.getActionIndex());
            int actionMasked = motionEvent.getActionMasked();
            RectF rectF = this.H0;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 5) {
                                if (actionMasked == 6) {
                                    kVar.c(motionEvent.getActionIndex(), motionEvent);
                                    return true;
                                }
                            } else {
                                return kVar.a(x9, y3, motionEvent.getActionIndex());
                            }
                        }
                    } else {
                        int i10 = x9 - this.f16591c1;
                        int i11 = y3 - this.f16593d1;
                        if (kVar.f16643n[0] == null && !kVar.f16635c) {
                            boolean z12 = this.f16615r0;
                            int i12 = this.A0;
                            if (z12) {
                                if ((this.f16602h1 && System.currentTimeMillis() - this.f16600g1 > 200) || Math.abs(i10) > Math.abs(i11) || Math.abs(i11) < i12) {
                                    z10 = true;
                                }
                                this.f16591c1 = x9;
                                this.f16593d1 = y3;
                                getParent().requestDisallowInterceptTouchEvent(z10);
                                C(x9, y3);
                                return true;
                            }
                            if (rectF.contains(this.f16595e1, this.f16598f1)) {
                                int i13 = this.f16595e1 - x9;
                                int i14 = this.f16598f1 - y3;
                                if (Math.sqrt((i14 * i14) + (i13 * i13)) > i12 || System.currentTimeMillis() - this.f16600g1 > 200) {
                                    this.f16615r0 = true;
                                    C(x9, y3);
                                    return true;
                                }
                            }
                            return true;
                        }
                        boolean b10 = kVar.b(x9, motionEvent.getActionIndex());
                        if (motionEvent.getPointerCount() > 1) {
                            motionEvent.getY(1);
                            kVar.b((int) motionEvent.getX(1), 1);
                        }
                        getParent().requestDisallowInterceptTouchEvent(b10);
                        return true;
                    }
                }
                if (!kVar.c(motionEvent.getActionIndex(), motionEvent)) {
                    if (rectF.contains(this.f16595e1, this.f16598f1) && !this.f16615r0) {
                        c(false);
                    }
                    i[] iVarArr = kVar.f16643n;
                    i iVar = iVarArr[0];
                    if (iVar != null && (valueAnimator2 = iVar.e) != null) {
                        valueAnimator2.cancel();
                    }
                    i iVar2 = iVarArr[1];
                    if (iVar2 != null && (valueAnimator = iVar2.e) != null) {
                        valueAnimator.cancel();
                    }
                    iVarArr[0] = null;
                    iVarArr[1] = null;
                    I();
                    getParent().requestDisallowInterceptTouchEvent(false);
                    this.f16615r0 = false;
                    y();
                    invalidate();
                    if (this.P0) {
                        j10 = s(this.F, this.G);
                    } else {
                        j10 = 0;
                    }
                    E(r(this.F, this.G), j10, true, true, false);
                    return true;
                }
                return true;
            }
            this.f16600g1 = System.currentTimeMillis();
            getParent().requestDisallowInterceptTouchEvent(true);
            if (!kVar.a(x9, y3, motionEvent.getActionIndex())) {
                this.f16591c1 = x9;
                this.f16595e1 = x9;
                this.f16593d1 = y3;
                this.f16598f1 = y3;
                if (rectF.contains(x9, y3)) {
                    if (this.f16617s0 < 0 || !this.f16604i1) {
                        this.f16615r0 = true;
                        C(x9, y3);
                        return true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public void p(android.graphics.Canvas r14, mg.d r15) {
        throw new UnsupportedOperationException("Method not decompiled: kg.h.p(android.graphics.Canvas, mg.d):void");
    }

    public long r(int i10, int i11) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        long j10 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            if (((mg.f) arrayList.get(i12)).f18475n) {
                long rMaxQ = ((mg.f) arrayList.get(i12)).f18465a.f17006b.rMaxQ(i10, i11);
                if (rMaxQ > j10) {
                    j10 = rMaxQ;
                }
            }
        }
        return j10;
    }

    public long s(int i10, int i11) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        long j10 = Long.MAX_VALUE;
        for (int i12 = 0; i12 < size; i12++) {
            if (((mg.f) arrayList.get(i12)).f18475n) {
                long rMinQ = ((mg.f) arrayList.get(i12)).f18465a.f17006b.rMinQ(i10, i11);
                if (rMinQ < j10) {
                    j10 = rMinQ;
                }
            }
        }
        return j10;
    }

    public void setDateSelectionListener(f fVar) {
        this.Q0 = fVar;
    }

    public void setHeader(mg.c cVar) {
        this.f16606j1 = cVar;
    }

    public void setLandscape(boolean z10) {
        this.I = z10;
    }

    public void t() {
        this.L.setStrokeWidth(1.0f);
        this.M.setStrokeWidth(l1);
        TextPaint textPaint = this.N;
        float f7 = f16569m1;
        textPaint.setTextSize(f7);
        TextPaint textPaint2 = this.O;
        textPaint2.setTextSize(f7);
        textPaint2.setTextAlign(Paint.Align.RIGHT);
        TextPaint textPaint3 = this.P;
        textPaint3.setTextSize(f7);
        textPaint3.setTextAlign(Paint.Align.CENTER);
        float dpf2 = AndroidUtilities.dpf2(6.0f);
        Paint paint = this.S;
        paint.setStrokeWidth(dpf2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        setLayerType(2, null);
        setWillNotDraw(false);
        mg.e g7 = g();
        this.f16618t0 = g7;
        g7.setVisibility(8);
        Paint paint2 = this.U;
        paint2.setColor(-1);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(3.0f));
        paint2.setStrokeCap(cap);
        G();
    }

    public void u() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            mg.f fVar = (mg.f) obj;
            boolean z10 = fVar.f18475n;
            lg.a aVar = fVar.f18465a;
            if (z10) {
                long j10 = aVar.e;
                if (((float) j10) > this.f16605j0) {
                    this.f16605j0 = (float) j10;
                }
            }
            if (z10) {
                long j11 = aVar.f17008f;
                if (((float) j11) < this.f16607k0) {
                    this.f16607k0 = (float) j11;
                }
            }
            float f7 = this.f16605j0;
            float f10 = this.f16607k0;
            if (f7 == f10) {
                this.f16605j0 = f7 + 1.0f;
                this.f16607k0 = f10 - 1.0f;
            }
        }
    }

    public final void v() {
        int measuredHeight = getMeasuredHeight() - this.f16616s;
        float f7 = this.f16623x;
        if (f7 != 0.0f && measuredHeight != 0) {
            this.E = (f7 / measuredHeight) * f16569m1;
        }
    }

    public final void w() {
        float f7;
        if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            float f10 = f16568k1;
            this.C0 = getMeasuredWidth() - (2.0f * f10);
            this.D0 = f10;
            float measuredWidth = getMeasuredWidth();
            if (this.I) {
                f7 = f16575s1;
            } else {
                f7 = f10;
            }
            float f11 = measuredWidth - f7;
            this.E0 = f11;
            float f12 = f11 - this.D0;
            this.F0 = f12;
            k kVar = this.f16599g0;
            this.G0 = f12 / (kVar.f16641l - kVar.f16640k);
            I();
            this.f16616s = AndroidUtilities.dp(100.0f);
            this.H0.set(this.D0 - f10, 0.0f, this.E0 + f10, getMeasuredHeight() - this.f16616s);
            if (this.f16601h0 != null) {
                this.f16611o0 = (int) (AndroidUtilities.dp(20.0f) / (this.C0 / this.f16601h0.f17011a.length));
            }
            v();
        }
    }

    public final void x(float f7) {
        int i10;
        float f10;
        lg.b bVar = this.f16601h0;
        if (bVar != null && (i10 = this.f16617s0) >= 0) {
            long[] jArr = bVar.f17011a;
            if (i10 < jArr.length && this.f16619u0) {
                this.f16618t0.c(i10, jArr[i10], this.d, false, bVar.f17017j, bVar.h);
                this.f16618t0.setVisibility(0);
                this.f16618t0.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
                float f11 = (this.f16601h0.f17012b[this.f16617s0] * this.G0) - f7;
                int i11 = (f11 > ((this.D0 + this.F0) / 2.0f) ? 1 : (f11 == ((this.D0 + this.F0) / 2.0f) ? 0 : -1));
                int i12 = f16580x1;
                if (i11 > 0) {
                    f10 = f11 - (this.f16618t0.getWidth() + i12);
                } else {
                    f10 = f11 + i12;
                }
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                } else if (this.f16618t0.getMeasuredWidth() + f10 > getMeasuredWidth()) {
                    f10 = getMeasuredWidth() - this.f16618t0.getMeasuredWidth();
                }
                this.f16618t0.setTranslationX(f10);
            }
        }
    }

    public void z() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3;
        A(true, true, true);
        ArrayList arrayList = this.d;
        this.m0 = arrayList.size();
        int i10 = 0;
        while (true) {
            this.f16610n0 = i10;
            int i11 = this.f16610n0;
            if (i11 >= this.m0) {
                break;
            }
            final mg.f fVar = (mg.f) arrayList.get(i11);
            if (fVar.f18475n && (valueAnimator3 = fVar.f18470i) != null) {
                valueAnimator3.cancel();
            }
            if (!fVar.f18475n && (valueAnimator2 = fVar.h) != null) {
                valueAnimator2.cancel();
            }
            if (fVar.f18475n && fVar.f18476o != 1.0f) {
                ValueAnimator valueAnimator4 = fVar.h;
                if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                    ValueAnimator e = e(fVar.f18476o, 1.0f, new ValueAnimator.AnimatorUpdateListener(this) {
                        public final h f16557b;

                        {
                            this.f16557b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                            switch (r3) {
                                case 0:
                                    h hVar = this.f16557b;
                                    hVar.getClass();
                                    fVar.f18476o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    hVar.H = true;
                                    hVar.invalidate();
                                    return;
                                default:
                                    h hVar2 = this.f16557b;
                                    hVar2.getClass();
                                    fVar.f18476o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    hVar2.H = true;
                                    hVar2.invalidate();
                                    return;
                            }
                        }
                    });
                    fVar.h = e;
                    e.start();
                } else {
                    i10 = this.f16610n0 + 1;
                }
            }
            if (!fVar.f18475n && fVar.f18476o != 0.0f && ((valueAnimator = fVar.f18470i) == null || !valueAnimator.isRunning())) {
                ValueAnimator e10 = e(fVar.f18476o, 0.0f, new ValueAnimator.AnimatorUpdateListener(this) {
                    public final h f16557b;

                    {
                        this.f16557b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                        switch (r3) {
                            case 0:
                                h hVar = this.f16557b;
                                hVar.getClass();
                                fVar.f18476o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                hVar.H = true;
                                hVar.invalidate();
                                return;
                            default:
                                h hVar2 = this.f16557b;
                                hVar2.getClass();
                                fVar.f18476o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                hVar2.H = true;
                                hVar2.invalidate();
                                return;
                        }
                    }
                });
                fVar.f18470i = e10;
                e10.start();
            }
            i10 = this.f16610n0 + 1;
        }
        K();
        if (this.f16619u0) {
            mg.e eVar = this.f16618t0;
            int i12 = this.f16617s0;
            lg.b bVar = this.f16601h0;
            eVar.c(i12, bVar.f17011a[i12], arrayList, true, bVar.f17017j, bVar.h);
        }
    }

    public void y() {
    }

    public void q(mg.j jVar) {
    }
}
