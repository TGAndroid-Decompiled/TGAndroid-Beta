package bg;

import ag.p2;
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
import java.util.ArrayList;
import org.telegram.messenger.i0;
import org.telegram.messenger.m5;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.e61;
import org.telegram.ui.tj0;
public abstract class i extends View implements m {
    public static final boolean A1;
    public static final boolean B1;
    public static final u1.a C1;
    public static final float f2689k1 = i0.N(16.0f);
    public static final float l1 = i0.N(1.5f);
    public static final float f2690m1 = i0.N(12.0f);
    public static final int f2691n1 = i0.L(18.0f);
    public static final int f2692o1 = i0.L(14.0f);
    public static final int f2693p1 = i0.L(10.0f);
    public static final int f2694q1 = i0.L(16.0f);
    public static final int f2695r1 = i0.L(24.0f);
    public static final int f2696s1 = i0.L(16.0f);
    public static final int f2697t1 = i0.L(10.0f);
    public static final int f2698u1 = i0.L(12.0f);
    public static final int f2699v1 = i0.L(8.0f);
    public static final int f2700w1 = i0.L(6.0f);
    public static final int f2701x1 = i0.L(5.0f);
    public static final int f2702y1 = i0.L(2.0f);
    public static final int f2703z1 = i0.L(1.0f);
    public final int A0;
    public final int B0;
    public float C0;
    public float D;
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
    public g Q0;
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
    public final p6 W0;
    public int X0;
    public int Y0;
    public final Rect Z0;
    public h f2704a;
    public AnimatorSet f2705a0;
    public final ArrayList f2706a1;
    public final ArrayList f2707b;
    public ValueAnimator f2708b0;
    public long f2709b1;
    public final ArrayList f2710c;
    public ValueAnimator f2711c0;
    public int f2712c1;
    public final ArrayList d;
    public Animator f2713d0;
    public int f2714d1;
    public boolean e;
    public ValueAnimator f2715e0;
    public int f2716e1;
    public float f2717f;
    public boolean f2718f0;
    public int f2719f1;
    public final n f2720g0;
    public long f2721g1;
    public float h;
    public cg.b f2722h0;
    public boolean f2723h1;
    public dg.b f2724i0;
    public boolean f2725i1;
    public float f2726j0;
    public dg.d f2727j1;
    public float f2728k0;
    public float f2729l0;
    public int m0;
    public int f2730n;
    public int f2731n0;
    public int f2732o0;
    public Bitmap f2733p0;
    public Canvas f2734q0;
    public int f2735r;
    public boolean f2736r0;
    public int f2737s;
    public int f2738s0;
    public dg.f f2739t0;
    public boolean f2740u0;
    public float f2741v0;
    public float f2742w;
    public boolean f2743w0;
    public float f2744x;
    public boolean f2745x0;
    public float f2746y;
    public int f2747y0;
    public dg.k f2748z0;

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

    public i(Context context, p6 p6Var) {
        super(context);
        this.f2707b = new ArrayList(10);
        this.f2710c = new ArrayList(25);
        this.d = new ArrayList();
        this.e = true;
        this.f2742w = 250.0f;
        this.f2744x = 0.0f;
        this.f2746y = 0.0f;
        this.D = 0.0f;
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
        this.f2718f0 = false;
        ?? obj = new Object();
        obj.h = new Rect();
        obj.f2765i = new Rect();
        obj.f2766j = new Rect();
        obj.f2767k = 0.7f;
        obj.f2768l = 1.0f;
        obj.f2769m = 0.1f;
        obj.f2770n = new l[]{null, null};
        obj.f2760a = this;
        this.f2720g0 = obj;
        this.f2736r0 = false;
        this.f2738s0 = -1;
        this.f2740u0 = false;
        this.f2741v0 = 0.0f;
        this.f2743w0 = false;
        this.f2745x0 = false;
        this.f2747y0 = 0;
        this.B0 = i0.L(46.0f);
        this.H0 = new RectF();
        this.J0 = new d(this, 0);
        this.K0 = new d(this, 1);
        this.L0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final i f2673b;

            {
                this.f2673b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        i iVar = this.f2673b;
                        iVar.getClass();
                        iVar.f2742w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        iVar.invalidate();
                        return;
                    default:
                        i iVar2 = this.f2673b;
                        iVar2.getClass();
                        iVar2.f2744x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        iVar2.invalidate();
                        return;
                }
            }
        };
        this.M0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final i f2673b;

            {
                this.f2673b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        i iVar = this.f2673b;
                        iVar.getClass();
                        iVar.f2742w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        iVar.invalidate();
                        return;
                    default:
                        i iVar2 = this.f2673b;
                        iVar2.getClass();
                        iVar2.f2744x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        iVar2.invalidate();
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
        this.f2706a1 = arrayList;
        arrayList.add(rect);
        this.f2709b1 = 0L;
        this.f2725i1 = false;
        this.W0 = p6Var;
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
        if (this.f2722h0 == null) {
            return;
        }
        float f7 = this.F0;
        n nVar = this.f2720g0;
        this.G0 = f7 / (nVar.f2768l - nVar.f2767k);
        H();
        if (this.P0) {
            j10 = s(this.F, this.G);
        } else {
            j10 = 0;
        }
        E(r(this.F, this.G), j10, z10, z11, z12);
        if (this.f2740u0 && !z11) {
            c(false);
            x((this.G0 * nVar.f2767k) - f2689k1);
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
        int i12 = this.f2738s0;
        cg.b bVar = this.f2722h0;
        if (bVar != null) {
            float f7 = this.G0;
            float f10 = (this.f2720g0.f2767k * f7) - f2689k1;
            float f11 = (i10 + f10) / f7;
            if (f11 < 0.0f) {
                this.f2738s0 = 0;
            } else if (f11 > 1.0f) {
                this.f2738s0 = bVar.f4164a.length - 1;
            } else {
                int b10 = bVar.b(f11, this.F, this.G);
                this.f2738s0 = b10;
                int i13 = b10 + 1;
                float[] fArr = this.f2722h0.f4165b;
                if (i13 < fArr.length) {
                    if (Math.abs(this.f2722h0.f4165b[this.f2738s0 + 1] - f11) < Math.abs(fArr[b10] - f11)) {
                        this.f2738s0++;
                    }
                }
            }
            int i14 = this.f2738s0;
            int i15 = this.G;
            if (i14 > i15) {
                this.f2738s0 = i15;
            }
            int i16 = this.f2738s0;
            int i17 = this.F;
            if (i16 < i17) {
                this.f2738s0 = i17;
            }
            if (i12 != this.f2738s0) {
                this.f2740u0 = true;
                c(true);
                x(f10);
                g gVar = this.Q0;
                if (gVar != null) {
                    getSelectedDate();
                    e61 e61Var = (e61) ((tj0) gVar).f41852b;
                    e61Var.f();
                    e61Var.f36960b.f2739t0.d(false, false);
                }
                B();
                invalidate();
            }
        }
    }

    public boolean D(cg.b bVar) {
        boolean z10;
        cg.b bVar2 = this.f2722h0;
        long j10 = 0;
        n nVar = this.f2720g0;
        ArrayList arrayList = this.d;
        if (bVar2 != bVar) {
            invalidate();
            arrayList.clear();
            if (bVar != null && bVar.d != null) {
                for (int i10 = 0; i10 < bVar.d.size(); i10++) {
                    arrayList.add(h((cg.a) bVar.d.get(i10)));
                }
            }
            d();
            this.f2722h0 = bVar;
            if (bVar != null) {
                if (bVar.f4164a[0] == 0) {
                    nVar.f2767k = 0.0f;
                    nVar.f2768l = 1.0f;
                } else {
                    float minDistance = getMinDistance();
                    nVar.f2769m = minDistance;
                    float f7 = nVar.f2768l;
                    if (f7 - nVar.f2767k < minDistance) {
                        float f10 = f7 - minDistance;
                        nVar.f2767k = f10;
                        if (f10 < 0.0f) {
                            nVar.f2767k = 0.0f;
                            nVar.f2768l = 1.0f;
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
            this.f2726j0 = 0.0f;
            this.f2728k0 = 2.1474836E9f;
            u();
            int i11 = bVar.f4170j;
            if (i11 != 1 && i11 != 2) {
                this.f2739t0.setSize(arrayList.size());
            } else {
                this.f2739t0.setSize(arrayList.size() * 2);
            }
            this.H = true;
            I();
            return z10;
        }
        nVar.f2767k = 0.7f;
        nVar.f2768l = 1.0f;
        this.f2728k0 = 0.0f;
        this.f2726j0 = 0.0f;
        this.f2707b.clear();
        AnimatorSet animatorSet = this.f2705a0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator valueAnimator = this.f2708b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f2708b0.cancel();
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
        if ((Math.abs(((float) (((long) Math.ceil(((float) j12) / 5.0f)) * 5)) - this.f2746y) >= this.E && j10 != 0) || ((float) j10) != this.D) {
            dg.e f10 = f(j10, this.f2722h0.f4169i, j11);
            long[] jArr = f10.f5894a;
            long j13 = jArr[jArr.length - 1];
            long j14 = jArr[0];
            if (!z12) {
                float f11 = this.f2742w - this.f2744x;
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
                if (((float) j13) != this.f2746y) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (this.P0 && ((float) j14) != this.D) {
                    z13 = true;
                }
                if (z13) {
                    AnimatorSet animatorSet = this.f2705a0;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        this.f2705a0.cancel();
                    }
                    this.T0 = this.f2742w;
                    this.U0 = this.f2744x;
                    this.R0 = 0.0f;
                    this.S0 = 0.0f;
                    this.V0 = f7;
                }
            }
            float f14 = (float) j13;
            this.f2746y = f14;
            float f15 = (float) j14;
            this.D = f15;
            v();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f2709b1 < 320 && !z11) {
                return;
            }
            this.f2709b1 = currentTimeMillis;
            ValueAnimator valueAnimator = this.f2708b0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f2708b0.cancel();
            }
            ArrayList arrayList = this.f2707b;
            if (!z10) {
                this.f2742w = f14;
                this.f2744x = f15;
                arrayList.clear();
                arrayList.add(f10);
                f10.f5897f = 255;
                return;
            }
            arrayList.add(f10);
            if (z12) {
                AnimatorSet animatorSet2 = this.f2705a0;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    this.f2705a0.cancel();
                }
                this.V0 = 0.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(e(this.f2742w, f14, this.L0));
                if (this.P0) {
                    animatorSet3.playTogether(e(this.f2744x, f15, this.M0));
                }
                this.f2705a0 = animatorSet3;
                animatorSet3.start();
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                dg.e eVar = (dg.e) arrayList.get(i10);
                if (eVar != f10) {
                    eVar.f5898g = eVar.f5897f;
                }
            }
            ValueAnimator e = e(0.0f, 255.0f, new p2(1, this, f10));
            this.f2708b0 = e;
            e.addListener(new f(0, this, f10));
            this.f2708b0.start();
        }
    }

    public final void F() {
        float f7 = this.V0;
        if (f7 != 0.0f) {
            float f10 = this.f2742w;
            float f11 = this.f2746y;
            if (f10 != f11) {
                float f12 = this.R0 + f7;
                this.R0 = f12;
                if (f12 > 1.0f) {
                    this.R0 = 1.0f;
                    this.f2742w = f11;
                } else {
                    float f13 = this.T0;
                    this.f2742w = (gr.f26496g.getInterpolation(f12) * (f11 - f13)) + f13;
                }
                invalidate();
            }
            if (this.P0) {
                float f14 = this.f2744x;
                float f15 = this.D;
                if (f14 != f15) {
                    float f16 = this.S0 + this.V0;
                    this.S0 = f16;
                    if (f16 > 1.0f) {
                        this.S0 = 1.0f;
                        this.f2744x = f15;
                    } else {
                        float f17 = this.U0;
                        this.f2744x = (gr.f26496g.getInterpolation(f16) * (f15 - f17)) + f17;
                    }
                    invalidate();
                }
            }
        }
    }

    public final void G() {
        int i10;
        int i11;
        if (this.f2745x0) {
            i10 = t6.Nj;
        } else {
            i10 = t6.Mj;
        }
        p6 p6Var = this.W0;
        int w02 = t6.w0(i10, p6Var);
        TextPaint textPaint = this.N;
        textPaint.setColor(w02);
        if (this.f2745x0) {
            i11 = t6.Nj;
        } else {
            i11 = t6.Mj;
        }
        this.O.setColor(t6.w0(i11, p6Var));
        int w03 = t6.w0(t6.Mj, p6Var);
        TextPaint textPaint2 = this.P;
        textPaint2.setColor(w03);
        int w04 = t6.w0(t6.Oj, p6Var);
        Paint paint = this.L;
        paint.setColor(w04);
        int w05 = t6.w0(t6.Pj, p6Var);
        Paint paint2 = this.M;
        paint2.setColor(w05);
        this.Q.setColor(t6.w0(t6.Rj, p6Var));
        this.R.setColor(t6.w0(t6.Qj, p6Var));
        this.S.setColor(t6.w0(t6.f20929d6, p6Var));
        this.T.setColor(t6.w0(t6.Sj, p6Var));
        this.f2739t0.b();
        this.f2730n = paint.getAlpha();
        this.f2735r = paint2.getAlpha();
        this.f2717f = textPaint.getAlpha() / 255.0f;
        this.h = textPaint2.getAlpha() / 255.0f;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((dg.g) obj).a();
        }
        if (this.f2740u0) {
            int i13 = this.f2738s0;
            cg.b bVar = this.f2722h0;
            long[] jArr = bVar.f4164a;
            if (i13 < jArr.length) {
                this.f2739t0.c(i13, jArr[i13], arrayList, false, bVar.f4170j, bVar.h);
            }
        }
        this.H = true;
    }

    public final void H() {
        cg.b bVar = this.f2722h0;
        if (bVar == null) {
            return;
        }
        n nVar = this.f2720g0;
        int c10 = bVar.c(Math.max(nVar.f2767k, 0.0f));
        this.F = c10;
        int a2 = this.f2722h0.a(Math.min(nVar.f2768l, 1.0f), c10);
        this.G = a2;
        int i10 = this.F;
        if (a2 < i10) {
            this.G = i10;
        }
        dg.d dVar = this.f2727j1;
        if (dVar != null) {
            long[] jArr = this.f2722h0.f4164a;
            dVar.b(jArr[i10], jArr[this.G]);
        }
        I();
    }

    public final void I() {
        cg.b bVar = this.f2722h0;
        if (bVar != null) {
            float f7 = this.F0;
            if (f7 != 0.0f) {
                int i10 = (int) ((f7 / (this.G0 * bVar.f4168g)) / 6.0f);
                dg.b bVar2 = this.f2724i0;
                if (bVar2 == null || i10 >= bVar2.f5884b || i10 <= bVar2.f5885c) {
                    int highestOneBit = Integer.highestOneBit(i10) << 1;
                    dg.b bVar3 = this.f2724i0;
                    if (bVar3 == null || bVar3.f5883a != highestOneBit) {
                        ValueAnimator valueAnimator = this.f2711c0;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllListeners();
                            this.f2711c0.cancel();
                        }
                        double d = highestOneBit;
                        double d10 = 0.2d * d;
                        dg.b bVar4 = new dg.b(highestOneBit, (int) (d + d10), (int) (d - d10));
                        bVar4.d = 255;
                        dg.b bVar5 = this.f2724i0;
                        ArrayList arrayList = this.f2710c;
                        if (bVar5 == null) {
                            this.f2724i0 = bVar4;
                            bVar4.d = 255;
                            arrayList.add(bVar4);
                            return;
                        }
                        this.f2724i0 = bVar4;
                        this.m0 = arrayList.size();
                        for (int i11 = 0; i11 < this.m0; i11++) {
                            dg.b bVar6 = (dg.b) arrayList.get(i11);
                            bVar6.e = bVar6.d;
                        }
                        arrayList.add(bVar4);
                        if (arrayList.size() > 2) {
                            arrayList.remove(0);
                        }
                        ValueAnimator duration = e(0.0f, 1.0f, new p2(2, this, bVar4)).setDuration(200L);
                        this.f2711c0 = duration;
                        duration.addListener(new f(1, this, bVar4));
                        this.f2711c0.start();
                    }
                }
            }
        }
    }

    public void J(cg.b bVar, long j10) {
        int length = bVar.f4164a.length;
        long j11 = j10 - (j10 % 86400000);
        long j12 = 86399999 + j11;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            long j13 = bVar.f4164a[i12];
            if (j11 > j13) {
                i10 = i12;
            }
            if (j12 > j13) {
                i11 = i12;
            }
        }
        float[] fArr = bVar.f4165b;
        float f7 = fArr[i10];
        n nVar = this.f2720g0;
        nVar.f2767k = f7;
        nVar.f2768l = fArr[i11];
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
                dg.g gVar = (dg.g) obj;
                boolean z10 = gVar.f5919n;
                cg.a aVar = gVar.f5909a;
                if (z10) {
                    long j12 = aVar.e;
                    if (j12 > j11) {
                        j11 = j12;
                    }
                }
                if (z10) {
                    long j13 = aVar.f4161f;
                    if (j13 < j10) {
                        j10 = j13;
                    }
                }
            }
            if ((j10 != 2147483647L && ((float) j10) != 0.0f) || (j11 > 0 && ((float) j11) != this.f2729l0)) {
                this.f2729l0 = (float) j11;
                Animator animator = this.f2713d0;
                if (animator != null) {
                    animator.cancel();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(e(this.f2726j0, this.f2729l0, this.J0), e(this.f2728k0, 0.0f, this.K0));
                this.f2713d0 = animatorSet;
                animatorSet.start();
            }
        }
    }

    @Override
    public void a(float f7, float f10, boolean z10) {
        cg.b bVar = this.f2722h0;
        if (bVar == null) {
            return;
        }
        if (z10) {
            int c10 = bVar.c(Math.max(f7, 0.0f));
            int a2 = this.f2722h0.a(Math.min(f10, 1.0f), c10);
            E(r(c10, a2), s(c10, a2), true, true, false);
            c(false);
            return;
        }
        H();
        invalidate();
    }

    public final void c(boolean z10) {
        float f7;
        x((this.G0 * this.f2720g0.f2767k) - f2689k1);
        if (this.f2725i1 == z10) {
            return;
        }
        this.f2725i1 = z10;
        ValueAnimator valueAnimator = this.f2715e0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f2715e0.cancel();
        }
        float f10 = this.f2741v0;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator duration = e(f10, f7, this.N0).setDuration(200L);
        this.f2715e0 = duration;
        duration.addListener(this.O0);
        this.f2715e0.start();
    }

    public final void d() {
        this.f2738s0 = -1;
        this.f2740u0 = false;
        this.f2725i1 = false;
        this.f2739t0.setVisibility(8);
        this.f2741v0 = 0.0f;
    }

    public dg.e f(long j10, int i10, long j11) {
        return new dg.e(j10, j11, this.P0, this.f2722h0.h, i10, this.N, this.O);
    }

    public dg.f g() {
        return new dg.f(getContext(), this.W0);
    }

    public long getEndDate() {
        return this.f2722h0.f4164a[this.G];
    }

    public float getMinDistance() {
        cg.b bVar = this.f2722h0;
        if (bVar == null) {
            return 0.1f;
        }
        int length = bVar.f4164a.length;
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
        int i10 = this.f2738s0;
        if (i10 < 0) {
            return -1L;
        }
        return this.f2722h0.f4164a[i10];
    }

    public long getStartDate() {
        return this.f2722h0.f4164a[this.F];
    }

    public abstract dg.g h(cg.a aVar);

    public void i(Canvas canvas) {
        int measuredHeight;
        if (this.f2722h0 != null) {
            int i10 = this.f2747y0;
            float f7 = 1.0f;
            if (i10 == 2) {
                f7 = 1.0f - this.f2748z0.f5928f;
            } else if (i10 == 1) {
                f7 = this.f2748z0.f5928f;
            } else if (i10 == 3) {
                f7 = this.f2748z0.f5928f;
            }
            Paint paint = this.L;
            paint.setAlpha((int) (this.f2730n * f7));
            TextPaint textPaint = this.N;
            textPaint.setAlpha((int) (this.f2717f * 255.0f * f7));
            this.O.setAlpha((int) (this.f2717f * 255.0f * f7));
            int textSize = (int) (f2691n1 - textPaint.getTextSize());
            float measuredHeight2 = (getMeasuredHeight() - this.f2737s) - 1;
            canvas.drawLine(this.D0, measuredHeight2, this.E0, measuredHeight2, paint);
            if (this.P0) {
                return;
            }
            canvas.drawText("0", f2689k1, measuredHeight - textSize, textPaint);
        }
    }

    public void j(Canvas canvas) {
        float f7;
        char c10;
        int i10;
        int i11;
        if (this.f2722h0 != null) {
            ArrayList arrayList = this.f2710c;
            this.m0 = arrayList.size();
            int i12 = this.f2747y0;
            float f10 = 1.0f;
            int i13 = 1;
            if (i12 == 2) {
                f7 = 1.0f - this.f2748z0.f5928f;
            } else if (i12 == 1) {
                f7 = this.f2748z0.f5928f;
            } else if (i12 == 3) {
                f7 = this.f2748z0.f5928f;
            } else {
                f7 = 1.0f;
            }
            char c11 = 0;
            this.f2731n0 = 0;
            while (true) {
                int i14 = this.f2731n0;
                if (i14 < this.m0) {
                    int i15 = ((dg.b) arrayList.get(i14)).d;
                    int i16 = ((dg.b) arrayList.get(this.f2731n0)).f5883a;
                    if (i16 == 0) {
                        i16 = i13;
                    }
                    int i17 = this.F - this.f2732o0;
                    while (i17 % i16 != 0) {
                        i17--;
                    }
                    int i18 = this.G - this.f2732o0;
                    while (true) {
                        if (i18 % i16 == 0 && i18 >= this.f2722h0.f4164a.length - i13) {
                            break;
                        }
                        i18++;
                        i13 = i13;
                        i15 = i15;
                        c11 = c11;
                        f10 = 1.0f;
                    }
                    int i19 = this.f2732o0;
                    int i20 = i17 + i19;
                    int i21 = i18 + i19;
                    float f11 = this.G0 * this.f2720g0.f2767k;
                    float f12 = f2689k1;
                    float f13 = f11 - f12;
                    while (i20 < i21) {
                        if (i20 >= 0) {
                            long[] jArr = this.f2722h0.f4164a;
                            if (i20 < jArr.length - i13) {
                                long j10 = jArr[i20];
                                long j11 = jArr[c11];
                                long j12 = jArr[jArr.length - i13];
                                i10 = i13;
                                i11 = i15;
                                float f14 = ((((float) (j10 - j11)) / ((float) (j12 - j11))) * this.G0) - f13;
                                float f15 = f14 - f2697t1;
                                if (f15 > 0.0f) {
                                    float f16 = this.F0;
                                    if (f15 <= f16 + f12) {
                                        float f17 = f2693p1;
                                        int i22 = (f15 > f17 ? 1 : (f15 == f17 ? 0 : -1));
                                        c10 = c11;
                                        TextPaint textPaint = this.P;
                                        if (i22 < 0) {
                                            textPaint.setAlpha((int) (i11 * m5.y(f17, f15, f17, f10) * this.h * f7));
                                        } else if (f15 > f16) {
                                            textPaint.setAlpha((int) (i11 * m5.y(f15, f16, f12, f10) * this.h * f7));
                                        } else {
                                            textPaint.setAlpha((int) (i11 * this.h * f7));
                                        }
                                        cg.b bVar = this.f2722h0;
                                        String[] strArr = bVar.f4166c;
                                        long[] jArr2 = bVar.f4164a;
                                        canvas.drawText(strArr[(int) ((jArr2[i20] - jArr2[c10]) / bVar.f4171k)], f14, i0.L(3.0f) + (getMeasuredHeight() - this.f2737s) + f2692o1, textPaint);
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
                    this.f2731n0 += i13;
                    c11 = c11;
                    f10 = 1.0f;
                } else {
                    return;
                }
            }
        }
    }

    public abstract void k(Canvas canvas);

    public void l(android.graphics.Canvas r12, dg.e r13) {
        throw new UnsupportedOperationException("Method not decompiled: bg.i.l(android.graphics.Canvas, dg.e):void");
    }

    public final void m(android.graphics.Canvas r39) {
        throw new UnsupportedOperationException("Method not decompiled: bg.i.m(android.graphics.Canvas):void");
    }

    public abstract void n(Canvas canvas);

    public void o(Canvas canvas) {
        cg.b bVar;
        int i10 = this.f2738s0;
        if (i10 >= 0 && this.f2740u0 && (bVar = this.f2722h0) != null) {
            int i11 = (int) (this.f2735r * this.f2741v0);
            float f7 = this.F0;
            n nVar = this.f2720g0;
            float f10 = nVar.f2768l;
            float f11 = nVar.f2767k;
            float f12 = f7 / (f10 - f11);
            float f13 = (f11 * f12) - f2689k1;
            float[] fArr = bVar.f4165b;
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
                        this.f2731n0 = i12;
                        int i13 = this.f2731n0;
                        if (i13 < this.m0) {
                            dg.g gVar = (dg.g) arrayList.get(i13);
                            boolean z10 = gVar.f5919n;
                            Paint paint2 = gVar.d;
                            if (z10 || gVar.f5920o != 0.0f) {
                                float f15 = (float) gVar.f5909a.f4158a[this.f2738s0];
                                float f16 = this.f2744x;
                                float measuredHeight = (getMeasuredHeight() - this.f2737s) - (((f15 - f16) / (this.f2742w - f16)) * ((getMeasuredHeight() - this.f2737s) - f2691n1));
                                paint2.setAlpha((int) (gVar.f5920o * 255.0f * this.f2741v0));
                                Paint paint3 = this.S;
                                paint3.setAlpha((int) (gVar.f5920o * 255.0f * this.f2741v0));
                                canvas.drawPoint(f14, measuredHeight, paint2);
                                canvas.drawPoint(f14, measuredHeight, paint3);
                            }
                            i12 = this.f2731n0 + 1;
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
        if (this.f2743w0) {
            super.onDraw(canvas);
            return;
        }
        F();
        int save = canvas.save();
        RectF rectF = this.H0;
        canvas.clipRect(0.0f, rectF.top, getMeasuredWidth(), rectF.bottom);
        i(canvas);
        ArrayList arrayList = this.f2707b;
        this.m0 = arrayList.size();
        int i10 = 0;
        this.f2731n0 = 0;
        while (true) {
            int i11 = this.f2731n0;
            if (i11 >= this.m0) {
                break;
            }
            l(canvas, (dg.e) arrayList.get(i11));
            this.f2731n0++;
        }
        k(canvas);
        while (true) {
            this.f2731n0 = i10;
            int i12 = this.f2731n0;
            if (i12 < this.m0) {
                p(canvas, (dg.e) arrayList.get(i12));
                i10 = this.f2731n0 + 1;
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
            setMeasuredDimension(View.MeasureSpec.getSize(i10), i0.f16026q.y - i0.L(56.0f));
        }
        int measuredWidth = getMeasuredWidth();
        int i12 = this.X0;
        int i13 = this.B0;
        if (measuredWidth != i12 || getMeasuredHeight() != this.Y0) {
            this.X0 = getMeasuredWidth();
            this.Y0 = getMeasuredHeight();
            float f7 = f2689k1;
            float f10 = 2.0f * f7;
            this.f2733p0 = Bitmap.createBitmap((int) (getMeasuredWidth() - f10), i13, Bitmap.Config.ARGB_4444);
            this.f2734q0 = new Canvas(this.f2733p0);
            this.f2704a.d(i13, (int) (getMeasuredWidth() - f10));
            w();
            if (this.f2740u0) {
                x((this.G0 * this.f2720g0.f2767k) - f7);
            }
            A(false, true, false);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int measuredHeight = getMeasuredHeight();
            int i14 = f2694q1;
            this.Z0.set(0, measuredHeight - ((i13 + i14) + i14), getMeasuredWidth(), getMeasuredHeight());
            setSystemGestureExclusionRects(this.f2706a1);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        long j10;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean z10 = false;
        if (this.f2722h0 != null) {
            boolean z11 = this.J;
            n nVar = this.f2720g0;
            if (!z11) {
                nVar.c(motionEvent.getActionIndex(), motionEvent);
                getParent().requestDisallowInterceptTouchEvent(false);
                this.f2736r0 = false;
                return false;
            }
            int x10 = (int) motionEvent.getX(motionEvent.getActionIndex());
            int y3 = (int) motionEvent.getY(motionEvent.getActionIndex());
            int actionMasked = motionEvent.getActionMasked();
            RectF rectF = this.H0;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 5) {
                                if (actionMasked == 6) {
                                    nVar.c(motionEvent.getActionIndex(), motionEvent);
                                    return true;
                                }
                            } else {
                                return nVar.a(x10, y3, motionEvent.getActionIndex());
                            }
                        }
                    } else {
                        int i10 = x10 - this.f2712c1;
                        int i11 = y3 - this.f2714d1;
                        if (nVar.f2770n[0] == null && !nVar.f2762c) {
                            boolean z12 = this.f2736r0;
                            int i12 = this.A0;
                            if (z12) {
                                if ((this.f2723h1 && System.currentTimeMillis() - this.f2721g1 > 200) || Math.abs(i10) > Math.abs(i11) || Math.abs(i11) < i12) {
                                    z10 = true;
                                }
                                this.f2712c1 = x10;
                                this.f2714d1 = y3;
                                getParent().requestDisallowInterceptTouchEvent(z10);
                                C(x10, y3);
                                return true;
                            }
                            if (rectF.contains(this.f2716e1, this.f2719f1)) {
                                int i13 = this.f2716e1 - x10;
                                int i14 = this.f2719f1 - y3;
                                if (Math.sqrt((i14 * i14) + (i13 * i13)) > i12 || System.currentTimeMillis() - this.f2721g1 > 200) {
                                    this.f2736r0 = true;
                                    C(x10, y3);
                                    return true;
                                }
                            }
                            return true;
                        }
                        boolean b10 = nVar.b(x10, motionEvent.getActionIndex());
                        if (motionEvent.getPointerCount() > 1) {
                            motionEvent.getY(1);
                            nVar.b((int) motionEvent.getX(1), 1);
                        }
                        getParent().requestDisallowInterceptTouchEvent(b10);
                        return true;
                    }
                }
                if (!nVar.c(motionEvent.getActionIndex(), motionEvent)) {
                    if (rectF.contains(this.f2716e1, this.f2719f1) && !this.f2736r0) {
                        c(false);
                    }
                    l[] lVarArr = nVar.f2770n;
                    l lVar = lVarArr[0];
                    if (lVar != null && (valueAnimator2 = lVar.e) != null) {
                        valueAnimator2.cancel();
                    }
                    l lVar2 = lVarArr[1];
                    if (lVar2 != null && (valueAnimator = lVar2.e) != null) {
                        valueAnimator.cancel();
                    }
                    lVarArr[0] = null;
                    lVarArr[1] = null;
                    I();
                    getParent().requestDisallowInterceptTouchEvent(false);
                    this.f2736r0 = false;
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
            this.f2721g1 = System.currentTimeMillis();
            getParent().requestDisallowInterceptTouchEvent(true);
            if (!nVar.a(x10, y3, motionEvent.getActionIndex())) {
                this.f2712c1 = x10;
                this.f2716e1 = x10;
                this.f2714d1 = y3;
                this.f2719f1 = y3;
                if (rectF.contains(x10, y3)) {
                    if (this.f2738s0 < 0 || !this.f2725i1) {
                        this.f2736r0 = true;
                        C(x10, y3);
                        return true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public void p(android.graphics.Canvas r14, dg.e r15) {
        throw new UnsupportedOperationException("Method not decompiled: bg.i.p(android.graphics.Canvas, dg.e):void");
    }

    public long r(int i10, int i11) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        long j10 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            if (((dg.g) arrayList.get(i12)).f5919n) {
                long j02 = ((dg.g) arrayList.get(i12)).f5909a.f4159b.j0(i10, i11);
                if (j02 > j10) {
                    j10 = j02;
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
            if (((dg.g) arrayList.get(i12)).f5919n) {
                long n02 = ((dg.g) arrayList.get(i12)).f5909a.f4159b.n0(i10, i11);
                if (n02 < j10) {
                    j10 = n02;
                }
            }
        }
        return j10;
    }

    public void setDateSelectionListener(g gVar) {
        this.Q0 = gVar;
    }

    public void setHeader(dg.d dVar) {
        this.f2727j1 = dVar;
    }

    public void setLandscape(boolean z10) {
        this.I = z10;
    }

    public void t() {
        this.L.setStrokeWidth(1.0f);
        this.M.setStrokeWidth(l1);
        TextPaint textPaint = this.N;
        float f7 = f2690m1;
        textPaint.setTextSize(f7);
        TextPaint textPaint2 = this.O;
        textPaint2.setTextSize(f7);
        textPaint2.setTextAlign(Paint.Align.RIGHT);
        TextPaint textPaint3 = this.P;
        textPaint3.setTextSize(f7);
        textPaint3.setTextAlign(Paint.Align.CENTER);
        float N = i0.N(6.0f);
        Paint paint = this.S;
        paint.setStrokeWidth(N);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        setLayerType(2, null);
        setWillNotDraw(false);
        dg.f g10 = g();
        this.f2739t0 = g10;
        g10.setVisibility(8);
        Paint paint2 = this.U;
        paint2.setColor(-1);
        paint2.setStrokeWidth(i0.N(3.0f));
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
            dg.g gVar = (dg.g) obj;
            boolean z10 = gVar.f5919n;
            cg.a aVar = gVar.f5909a;
            if (z10) {
                long j10 = aVar.e;
                if (((float) j10) > this.f2726j0) {
                    this.f2726j0 = (float) j10;
                }
            }
            if (z10) {
                long j11 = aVar.f4161f;
                if (((float) j11) < this.f2728k0) {
                    this.f2728k0 = (float) j11;
                }
            }
            float f7 = this.f2726j0;
            float f10 = this.f2728k0;
            if (f7 == f10) {
                this.f2726j0 = f7 + 1.0f;
                this.f2728k0 = f10 - 1.0f;
            }
        }
    }

    public final void v() {
        int measuredHeight = getMeasuredHeight() - this.f2737s;
        float f7 = this.f2746y;
        if (f7 != 0.0f && measuredHeight != 0) {
            this.E = (f7 / measuredHeight) * f2690m1;
        }
    }

    public final void w() {
        float f7;
        if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            float f10 = f2689k1;
            this.C0 = getMeasuredWidth() - (2.0f * f10);
            this.D0 = f10;
            float measuredWidth = getMeasuredWidth();
            if (this.I) {
                f7 = f2696s1;
            } else {
                f7 = f10;
            }
            float f11 = measuredWidth - f7;
            this.E0 = f11;
            float f12 = f11 - this.D0;
            this.F0 = f12;
            n nVar = this.f2720g0;
            this.G0 = f12 / (nVar.f2768l - nVar.f2767k);
            I();
            this.f2737s = i0.L(100.0f);
            this.H0.set(this.D0 - f10, 0.0f, this.E0 + f10, getMeasuredHeight() - this.f2737s);
            if (this.f2722h0 != null) {
                this.f2732o0 = (int) (i0.L(20.0f) / (this.C0 / this.f2722h0.f4164a.length));
            }
            v();
        }
    }

    public final void x(float f7) {
        int i10;
        float f10;
        cg.b bVar = this.f2722h0;
        if (bVar != null && (i10 = this.f2738s0) >= 0) {
            long[] jArr = bVar.f4164a;
            if (i10 < jArr.length && this.f2740u0) {
                this.f2739t0.c(i10, jArr[i10], this.d, false, bVar.f4170j, bVar.h);
                this.f2739t0.setVisibility(0);
                this.f2739t0.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
                float f11 = (this.f2722h0.f4165b[this.f2738s0] * this.G0) - f7;
                int i11 = (f11 > ((this.D0 + this.F0) / 2.0f) ? 1 : (f11 == ((this.D0 + this.F0) / 2.0f) ? 0 : -1));
                int i12 = f2701x1;
                if (i11 > 0) {
                    f10 = f11 - (this.f2739t0.getWidth() + i12);
                } else {
                    f10 = f11 + i12;
                }
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                } else if (this.f2739t0.getMeasuredWidth() + f10 > getMeasuredWidth()) {
                    f10 = getMeasuredWidth() - this.f2739t0.getMeasuredWidth();
                }
                this.f2739t0.setTranslationX(f10);
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
            this.f2731n0 = i10;
            int i11 = this.f2731n0;
            if (i11 >= this.m0) {
                break;
            }
            final dg.g gVar = (dg.g) arrayList.get(i11);
            if (gVar.f5919n && (valueAnimator3 = gVar.f5914i) != null) {
                valueAnimator3.cancel();
            }
            if (!gVar.f5919n && (valueAnimator2 = gVar.h) != null) {
                valueAnimator2.cancel();
            }
            if (gVar.f5919n && gVar.f5920o != 1.0f) {
                ValueAnimator valueAnimator4 = gVar.h;
                if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                    ValueAnimator e = e(gVar.f5920o, 1.0f, new ValueAnimator.AnimatorUpdateListener(this) {
                        public final i f2675b;

                        {
                            this.f2675b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                            switch (r3) {
                                case 0:
                                    i iVar = this.f2675b;
                                    iVar.getClass();
                                    gVar.f5920o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    iVar.H = true;
                                    iVar.invalidate();
                                    return;
                                default:
                                    i iVar2 = this.f2675b;
                                    iVar2.getClass();
                                    gVar.f5920o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    iVar2.H = true;
                                    iVar2.invalidate();
                                    return;
                            }
                        }
                    });
                    gVar.h = e;
                    e.start();
                } else {
                    i10 = this.f2731n0 + 1;
                }
            }
            if (!gVar.f5919n && gVar.f5920o != 0.0f && ((valueAnimator = gVar.f5914i) == null || !valueAnimator.isRunning())) {
                ValueAnimator e7 = e(gVar.f5920o, 0.0f, new ValueAnimator.AnimatorUpdateListener(this) {
                    public final i f2675b;

                    {
                        this.f2675b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                        switch (r3) {
                            case 0:
                                i iVar = this.f2675b;
                                iVar.getClass();
                                gVar.f5920o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                iVar.H = true;
                                iVar.invalidate();
                                return;
                            default:
                                i iVar2 = this.f2675b;
                                iVar2.getClass();
                                gVar.f5920o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                iVar2.H = true;
                                iVar2.invalidate();
                                return;
                        }
                    }
                });
                gVar.f5914i = e7;
                e7.start();
            }
            i10 = this.f2731n0 + 1;
        }
        K();
        if (this.f2740u0) {
            dg.f fVar = this.f2739t0;
            int i12 = this.f2738s0;
            cg.b bVar = this.f2722h0;
            fVar.c(i12, bVar.f4164a[i12], arrayList, true, bVar.f4170j, bVar.h);
        }
    }

    public void q(dg.k kVar) {
    }

    public void y() {
    }
}
