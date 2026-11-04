package mg;

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
import ci.uc;
import ii.v3;
import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.xq;
import org.telegram.ui.b41;
import org.telegram.ui.ci0;
public abstract class g extends View implements i {
    public static final boolean B1;
    public static final boolean C1;
    public static final w1.a D1;
    public og.j A0;
    public final int B0;
    public final int C0;
    public float D0;
    public float E;
    public float E0;
    public float F;
    public float F0;
    public int G;
    public float G0;
    public int H;
    public float H0;
    public boolean I;
    public final RectF I0;
    public boolean J;
    public VibrationEffect J0;
    public boolean K;
    public final d K0;
    public final Paint L;
    public final d L0;
    public final Paint M;
    public final b M0;
    public final Paint N;
    public final b N0;
    public final TextPaint O;
    public final d O0;
    public final TextPaint P;
    public final v3 P0;
    public final TextPaint Q;
    public boolean Q0;
    public final Paint R;
    public e R0;
    public final Paint S;
    public float S0;
    public final Paint T;
    public float T0;
    public final Paint U;
    public float U0;
    public final Paint V;
    public float V0;
    public final Rect W;
    public float W0;
    public final e6 X0;
    public int Y0;
    public int Z0;
    public f f19325a;
    public final Path f19326a0;
    public final Rect f19327a1;
    public final ArrayList f19328b;
    public AnimatorSet f19329b0;
    public final ArrayList f19330b1;
    public final ArrayList f19331c;
    public ValueAnimator f19332c0;
    public long f19333c1;
    public final ArrayList d;
    public ValueAnimator f19334d0;
    public int f19335d1;
    public boolean f19336e;
    public Animator f19337e0;
    public int f19338e1;
    public float f19339f;
    public ValueAnimator f19340f0;
    public int f19341f1;
    public boolean f19342g0;
    public int f19343g1;
    public float h;
    public final j f19344h0;
    public long f19345h1;
    public ng.b f19346i0;
    public boolean f19347i1;
    public og.b f19348j0;
    public boolean f19349j1;
    public float f19350k0;
    public og.c k1;
    public float f19351l0;
    public float m0;
    public int f19352n;
    public int f19353n0;
    public int f19354o0;
    public int f19355p0;
    public Bitmap f19356q0;
    public int f19357r;
    public Canvas f19358r0;
    public int f19359s;
    public boolean f19360s0;
    public int f19361t0;
    public og.e f19362u0;
    public boolean f19363v0;
    public float f19364w;
    public float f19365w0;
    public float f19366x;
    public boolean f19367x0;
    public float f19368y;
    public boolean f19369y0;
    public int f19370z0;
    public static final float f19311l1 = g0.N(16.0f);
    public static final float m1 = g0.N(1.5f);
    public static final float f19312n1 = g0.N(12.0f);
    public static final int f19313o1 = g0.L(18.0f);
    public static final int f19314p1 = g0.L(14.0f);
    public static final int f19315q1 = g0.L(10.0f);
    public static final int f19316r1 = g0.L(16.0f);
    public static final int f19317s1 = g0.L(24.0f);
    public static final int f19318t1 = g0.L(16.0f);
    public static final int f19319u1 = g0.L(10.0f);
    public static final int f19320v1 = g0.L(12.0f);
    public static final int f19321w1 = g0.L(8.0f);
    public static final int f19322x1 = g0.L(6.0f);
    public static final int f19323y1 = g0.L(5.0f);
    public static final int f19324z1 = g0.L(2.0f);
    public static final int A1 = g0.L(1.0f);

    static {
        boolean z10;
        if (Build.VERSION.SDK_INT < 28) {
            z10 = true;
        } else {
            z10 = false;
        }
        B1 = z10;
        C1 = true;
        D1 = new w1.a();
    }

    public g(Context context, e6 e6Var) {
        super(context);
        this.f19328b = new ArrayList(10);
        this.f19331c = new ArrayList(25);
        this.d = new ArrayList();
        this.f19336e = true;
        this.f19364w = 250.0f;
        this.f19366x = 0.0f;
        this.f19368y = 0.0f;
        this.E = 0.0f;
        this.F = 0.0f;
        this.I = true;
        this.J = false;
        this.K = true;
        this.L = new Paint();
        this.M = new Paint();
        this.N = new Paint();
        this.O = new TextPaint(1);
        this.P = new TextPaint(1);
        this.Q = new TextPaint(1);
        this.R = new Paint(1);
        this.S = new Paint();
        this.T = new Paint(1);
        this.U = new Paint(1);
        this.V = new Paint(1);
        this.W = new Rect();
        this.f19326a0 = new Path();
        this.f19342g0 = false;
        ?? obj = new Object();
        obj.h = new Rect();
        obj.f19383i = new Rect();
        obj.f19384j = new Rect();
        obj.f19385k = 0.7f;
        obj.f19386l = 1.0f;
        obj.f19387m = 0.1f;
        obj.f19388n = new h[]{null, null};
        obj.f19377a = this;
        this.f19344h0 = obj;
        this.f19360s0 = false;
        this.f19361t0 = -1;
        this.f19363v0 = false;
        this.f19365w0 = 0.0f;
        this.f19367x0 = false;
        this.f19369y0 = false;
        this.f19370z0 = 0;
        this.C0 = g0.L(46.0f);
        this.I0 = new RectF();
        this.K0 = new d(this, 0);
        this.L0 = new d(this, 1);
        this.M0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final g f19299b;

            {
                this.f19299b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        g gVar = this.f19299b;
                        gVar.getClass();
                        gVar.f19364w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar.invalidate();
                        return;
                    default:
                        g gVar2 = this.f19299b;
                        gVar2.getClass();
                        gVar2.f19366x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar2.invalidate();
                        return;
                }
            }
        };
        this.N0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final g f19299b;

            {
                this.f19299b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        g gVar = this.f19299b;
                        gVar.getClass();
                        gVar.f19364w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar.invalidate();
                        return;
                    default:
                        g gVar2 = this.f19299b;
                        gVar2.getClass();
                        gVar2.f19366x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar2.invalidate();
                        return;
                }
            }
        };
        this.O0 = new d(this, 2);
        this.P0 = new v3(this, 2);
        this.Q0 = false;
        this.Y0 = 0;
        this.Z0 = 0;
        Rect rect = new Rect();
        this.f19327a1 = rect;
        ArrayList arrayList = new ArrayList();
        this.f19330b1 = arrayList;
        arrayList.add(rect);
        this.f19333c1 = 0L;
        this.f19349j1 = false;
        this.X0 = e6Var;
        t();
        this.B0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public static void b(Path path, float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, boolean z11, boolean z12, boolean z13) {
        path.reset();
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        if (f15 < 0.0f) {
            f15 = 0.0f;
        }
        float f16 = f12 - f10;
        float f17 = f13 - f11;
        float f18 = f16 / 2.0f;
        if (f14 > f18) {
            f14 = f18;
        }
        float f19 = f17 / 2.0f;
        if (f15 > f19) {
            f15 = f19;
        }
        float f20 = f16 - (f14 * 2.0f);
        float f21 = f17 - (2.0f * f15);
        path.moveTo(f12, f11 + f15);
        if (z11) {
            float f22 = -f15;
            path.rQuadTo(0.0f, f22, -f14, f22);
        } else {
            path.rLineTo(0.0f, -f15);
            path.rLineTo(-f14, 0.0f);
        }
        path.rLineTo(-f20, 0.0f);
        if (z10) {
            float f23 = -f14;
            path.rQuadTo(f23, 0.0f, f23, f15);
        } else {
            path.rLineTo(-f14, 0.0f);
            path.rLineTo(0.0f, f15);
        }
        path.rLineTo(0.0f, f21);
        if (z13) {
            path.rQuadTo(0.0f, f15, f14, f15);
        } else {
            path.rLineTo(0.0f, f15);
            path.rLineTo(f14, 0.0f);
        }
        path.rLineTo(f20, 0.0f);
        if (z12) {
            path.rQuadTo(f14, 0.0f, f14, -f15);
        } else {
            path.rLineTo(f14, 0.0f);
            path.rLineTo(0.0f, -f15);
        }
        path.rLineTo(0.0f, -f21);
        path.close();
    }

    public static ValueAnimator e(float f10, float f11, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(D1);
        ofFloat.addUpdateListener(animatorUpdateListener);
        return ofFloat;
    }

    public void A(boolean z10, boolean z11, boolean z12) {
        long j10;
        if (this.f19346i0 == null) {
            return;
        }
        float f10 = this.G0;
        j jVar = this.f19344h0;
        this.H0 = f10 / (jVar.f19386l - jVar.f19385k);
        H();
        if (this.Q0) {
            j10 = s(this.G, this.H);
        } else {
            j10 = 0;
        }
        E(r(this.G, this.H), j10, z10, z11, z12);
        if (this.f19363v0 && !z11) {
            c(false);
            x((this.H0 * jVar.f19385k) - f19311l1);
        }
        invalidate();
    }

    public final void B() {
        if (Build.VERSION.SDK_INT >= 26) {
            Vibrator vibrator = (Vibrator) getContext().getSystemService("vibrator");
            if (this.J0 == null) {
                this.J0 = VibrationEffect.createWaveform(new long[]{0, 2}, -1);
            }
            vibrator.cancel();
            vibrator.vibrate(this.J0);
        }
    }

    public void C(int i3, int i10) {
        int i11 = this.f19361t0;
        ng.b bVar = this.f19346i0;
        if (bVar != null) {
            float f10 = this.H0;
            float f11 = (this.f19344h0.f19385k * f10) - f19311l1;
            float f12 = (i3 + f11) / f10;
            if (f12 < 0.0f) {
                this.f19361t0 = 0;
            } else if (f12 > 1.0f) {
                this.f19361t0 = bVar.f20373a.length - 1;
            } else {
                int b10 = bVar.b(f12, this.G, this.H);
                this.f19361t0 = b10;
                int i12 = b10 + 1;
                float[] fArr = this.f19346i0.f20374b;
                if (i12 < fArr.length) {
                    if (Math.abs(this.f19346i0.f20374b[this.f19361t0 + 1] - f12) < Math.abs(fArr[b10] - f12)) {
                        this.f19361t0++;
                    }
                }
            }
            int i13 = this.f19361t0;
            int i14 = this.H;
            if (i13 > i14) {
                this.f19361t0 = i14;
            }
            int i15 = this.f19361t0;
            int i16 = this.G;
            if (i15 < i16) {
                this.f19361t0 = i16;
            }
            if (i11 != this.f19361t0) {
                this.f19363v0 = true;
                c(true);
                x(f11);
                e eVar = this.R0;
                if (eVar != null) {
                    getSelectedDate();
                    b41 b41Var = (b41) ((ci0) eVar).f44362b;
                    b41Var.f();
                    b41Var.f43918b.f19362u0.d(false, false);
                }
                B();
                invalidate();
            }
        }
    }

    public boolean D(ng.b bVar) {
        boolean z10;
        ng.b bVar2 = this.f19346i0;
        long j10 = 0;
        j jVar = this.f19344h0;
        ArrayList arrayList = this.d;
        if (bVar2 != bVar) {
            invalidate();
            arrayList.clear();
            if (bVar != null && bVar.d != null) {
                for (int i3 = 0; i3 < bVar.d.size(); i3++) {
                    arrayList.add(h((ng.a) bVar.d.get(i3)));
                }
            }
            d();
            this.f19346i0 = bVar;
            if (bVar != null) {
                if (bVar.f20373a[0] == 0) {
                    jVar.f19385k = 0.0f;
                    jVar.f19386l = 1.0f;
                } else {
                    float minDistance = getMinDistance();
                    jVar.f19387m = minDistance;
                    float f10 = jVar.f19386l;
                    if (f10 - jVar.f19385k < minDistance) {
                        float f11 = f10 - minDistance;
                        jVar.f19385k = f11;
                        if (f11 < 0.0f) {
                            jVar.f19385k = 0.0f;
                            jVar.f19386l = 1.0f;
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
            if (this.Q0) {
                j10 = s(this.G, this.H);
            }
            E(r(this.G, this.H), j10, false, false, false);
            this.f19350k0 = 0.0f;
            this.f19351l0 = 2.1474836E9f;
            u();
            int i10 = bVar.f20380j;
            if (i10 != 1 && i10 != 2) {
                this.f19362u0.setSize(arrayList.size());
            } else {
                this.f19362u0.setSize(arrayList.size() * 2);
            }
            this.I = true;
            I();
            return z10;
        }
        jVar.f19385k = 0.7f;
        jVar.f19386l = 1.0f;
        this.f19351l0 = 0.0f;
        this.f19350k0 = 0.0f;
        this.f19328b.clear();
        AnimatorSet animatorSet = this.f19329b0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator valueAnimator = this.f19332c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f19332c0.cancel();
        }
        return z10;
    }

    public final void E(long j10, long j11, boolean z10, boolean z11, boolean z12) {
        long j12;
        float f10;
        boolean z13;
        if (j10 > 100 && ((float) (j10 / 5)) % 10.0f != 0.0f) {
            j12 = ((j10 / 10) + 1) * 10;
        } else {
            j12 = j10;
        }
        if ((Math.abs(((float) (((long) Math.ceil(((float) j12) / 5.0f)) * 5)) - this.f19368y) >= this.F && j10 != 0) || ((float) j10) != this.E) {
            og.d f11 = f(j10, this.f19346i0.f20379i, j11);
            long[] jArr = f11.f21068a;
            long j13 = jArr[jArr.length - 1];
            long j14 = jArr[0];
            if (!z12) {
                float f12 = this.f19364w - this.f19366x;
                float f13 = (float) (j13 - j14);
                float f14 = f12 / f13;
                if (f14 > 1.0f) {
                    f14 = f13 / f12;
                }
                double d = f14;
                if (d > 0.7d) {
                    f10 = 0.1f;
                } else if (d < 0.1d) {
                    f10 = 0.03f;
                } else {
                    f10 = 0.045f;
                }
                if (((float) j13) != this.f19368y) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (this.Q0 && ((float) j14) != this.E) {
                    z13 = true;
                }
                if (z13) {
                    AnimatorSet animatorSet = this.f19329b0;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        this.f19329b0.cancel();
                    }
                    this.U0 = this.f19364w;
                    this.V0 = this.f19366x;
                    this.S0 = 0.0f;
                    this.T0 = 0.0f;
                    this.W0 = f10;
                }
            }
            float f15 = (float) j13;
            this.f19368y = f15;
            float f16 = (float) j14;
            this.E = f16;
            v();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f19333c1 < 320 && !z11) {
                return;
            }
            this.f19333c1 = currentTimeMillis;
            ValueAnimator valueAnimator = this.f19332c0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f19332c0.cancel();
            }
            ArrayList arrayList = this.f19328b;
            if (!z10) {
                this.f19364w = f15;
                this.f19366x = f16;
                arrayList.clear();
                arrayList.add(f11);
                f11.f21072f = 255;
                return;
            }
            arrayList.add(f11);
            if (z12) {
                AnimatorSet animatorSet2 = this.f19329b0;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    this.f19329b0.cancel();
                }
                this.W0 = 0.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(e(this.f19364w, f15, this.M0));
                if (this.Q0) {
                    animatorSet3.playTogether(e(this.f19366x, f16, this.N0));
                }
                this.f19329b0 = animatorSet3;
                animatorSet3.start();
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                og.d dVar = (og.d) arrayList.get(i3);
                if (dVar != f11) {
                    dVar.f21073g = dVar.f21072f;
                }
            }
            ValueAnimator e10 = e(0.0f, 255.0f, new uc(5, this, f11));
            this.f19332c0 = e10;
            e10.addListener(new bh.j(8, this, f11));
            this.f19332c0.start();
        }
    }

    public final void F() {
        float f10 = this.W0;
        if (f10 != 0.0f) {
            float f11 = this.f19364w;
            float f12 = this.f19368y;
            if (f11 != f12) {
                float f13 = this.S0 + f10;
                this.S0 = f13;
                if (f13 > 1.0f) {
                    this.S0 = 1.0f;
                    this.f19364w = f12;
                } else {
                    float f14 = this.U0;
                    this.f19364w = (xq.f40453g.getInterpolation(f13) * (f12 - f14)) + f14;
                }
                invalidate();
            }
            if (this.Q0) {
                float f15 = this.f19366x;
                float f16 = this.E;
                if (f15 != f16) {
                    float f17 = this.T0 + this.W0;
                    this.T0 = f17;
                    if (f17 > 1.0f) {
                        this.T0 = 1.0f;
                        this.f19366x = f16;
                    } else {
                        float f18 = this.V0;
                        this.f19366x = (xq.f40453g.getInterpolation(f17) * (f16 - f18)) + f18;
                    }
                    invalidate();
                }
            }
        }
    }

    public final void G() {
        int i3;
        int i10;
        if (this.f19369y0) {
            i3 = k6.Nj;
        } else {
            i3 = k6.Mj;
        }
        e6 e6Var = this.X0;
        int w02 = k6.w0(i3, e6Var);
        TextPaint textPaint = this.O;
        textPaint.setColor(w02);
        if (this.f19369y0) {
            i10 = k6.Nj;
        } else {
            i10 = k6.Mj;
        }
        this.P.setColor(k6.w0(i10, e6Var));
        int w03 = k6.w0(k6.Mj, e6Var);
        TextPaint textPaint2 = this.Q;
        textPaint2.setColor(w03);
        int w04 = k6.w0(k6.Oj, e6Var);
        Paint paint = this.M;
        paint.setColor(w04);
        int w05 = k6.w0(k6.Pj, e6Var);
        Paint paint2 = this.N;
        paint2.setColor(w05);
        this.R.setColor(k6.w0(k6.Rj, e6Var));
        this.S.setColor(k6.w0(k6.Qj, e6Var));
        this.T.setColor(k6.w0(k6.f27878d6, e6Var));
        this.U.setColor(k6.w0(k6.Sj, e6Var));
        this.f19362u0.b();
        this.f19352n = paint.getAlpha();
        this.f19357r = paint2.getAlpha();
        this.f19339f = textPaint.getAlpha() / 255.0f;
        this.h = textPaint2.getAlpha() / 255.0f;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((og.f) obj).a();
        }
        if (this.f19363v0) {
            int i12 = this.f19361t0;
            ng.b bVar = this.f19346i0;
            long[] jArr = bVar.f20373a;
            if (i12 < jArr.length) {
                this.f19362u0.c(i12, jArr[i12], arrayList, false, bVar.f20380j, bVar.h);
            }
        }
        this.I = true;
    }

    public final void H() {
        ng.b bVar = this.f19346i0;
        if (bVar == null) {
            return;
        }
        j jVar = this.f19344h0;
        int c2 = bVar.c(Math.max(jVar.f19385k, 0.0f));
        this.G = c2;
        int a10 = this.f19346i0.a(Math.min(jVar.f19386l, 1.0f), c2);
        this.H = a10;
        int i3 = this.G;
        if (a10 < i3) {
            this.H = i3;
        }
        og.c cVar = this.k1;
        if (cVar != null) {
            long[] jArr = this.f19346i0.f20373a;
            cVar.b(jArr[i3], jArr[this.H]);
        }
        I();
    }

    public final void I() {
        ng.b bVar = this.f19346i0;
        if (bVar != null) {
            float f10 = this.G0;
            if (f10 != 0.0f) {
                int i3 = (int) ((f10 / (this.H0 * bVar.f20378g)) / 6.0f);
                og.b bVar2 = this.f19348j0;
                if (bVar2 == null || i3 >= bVar2.f21058b || i3 <= bVar2.f21059c) {
                    int highestOneBit = Integer.highestOneBit(i3) << 1;
                    og.b bVar3 = this.f19348j0;
                    if (bVar3 == null || bVar3.f21057a != highestOneBit) {
                        ValueAnimator valueAnimator = this.f19334d0;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllListeners();
                            this.f19334d0.cancel();
                        }
                        double d = highestOneBit;
                        double d10 = 0.2d * d;
                        og.b bVar4 = new og.b(highestOneBit, (int) (d + d10), (int) (d - d10));
                        bVar4.d = 255;
                        og.b bVar5 = this.f19348j0;
                        ArrayList arrayList = this.f19331c;
                        if (bVar5 == null) {
                            this.f19348j0 = bVar4;
                            bVar4.d = 255;
                            arrayList.add(bVar4);
                            return;
                        }
                        this.f19348j0 = bVar4;
                        this.f19353n0 = arrayList.size();
                        for (int i10 = 0; i10 < this.f19353n0; i10++) {
                            og.b bVar6 = (og.b) arrayList.get(i10);
                            bVar6.f21060e = bVar6.d;
                        }
                        arrayList.add(bVar4);
                        if (arrayList.size() > 2) {
                            arrayList.remove(0);
                        }
                        ValueAnimator duration = e(0.0f, 1.0f, new uc(6, this, bVar4)).setDuration(200L);
                        this.f19334d0 = duration;
                        duration.addListener(new bh.j(9, this, bVar4));
                        this.f19334d0.start();
                    }
                }
            }
        }
    }

    public void J(ng.b bVar, long j10) {
        int length = bVar.f20373a.length;
        long j11 = j10 - (j10 % 86400000);
        long j12 = 86399999 + j11;
        int i3 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            long j13 = bVar.f20373a[i11];
            if (j11 > j13) {
                i3 = i11;
            }
            if (j12 > j13) {
                i10 = i11;
            }
        }
        float[] fArr = bVar.f20374b;
        float f10 = fArr[i3];
        j jVar = this.f19344h0;
        jVar.f19385k = f10;
        jVar.f19386l = fArr[i10];
    }

    public void K() {
        if (C1) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j10 = Long.MAX_VALUE;
            int i3 = 0;
            long j11 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                og.f fVar = (og.f) obj;
                boolean z10 = fVar.f21096n;
                ng.a aVar = fVar.f21085a;
                if (z10) {
                    long j12 = aVar.f20369e;
                    if (j12 > j11) {
                        j11 = j12;
                    }
                }
                if (z10) {
                    long j13 = aVar.f20370f;
                    if (j13 < j10) {
                        j10 = j13;
                    }
                }
            }
            if ((j10 != 2147483647L && ((float) j10) != 0.0f) || (j11 > 0 && ((float) j11) != this.m0)) {
                this.m0 = (float) j11;
                Animator animator = this.f19337e0;
                if (animator != null) {
                    animator.cancel();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(e(this.f19350k0, this.m0, this.K0), e(this.f19351l0, 0.0f, this.L0));
                this.f19337e0 = animatorSet;
                animatorSet.start();
            }
        }
    }

    @Override
    public void a(float f10, float f11, boolean z10) {
        ng.b bVar = this.f19346i0;
        if (bVar == null) {
            return;
        }
        if (z10) {
            int c2 = bVar.c(Math.max(f10, 0.0f));
            int a10 = this.f19346i0.a(Math.min(f11, 1.0f), c2);
            E(r(c2, a10), s(c2, a10), true, true, false);
            c(false);
            return;
        }
        H();
        invalidate();
    }

    public final void c(boolean z10) {
        float f10;
        x((this.H0 * this.f19344h0.f19385k) - f19311l1);
        if (this.f19349j1 == z10) {
            return;
        }
        this.f19349j1 = z10;
        ValueAnimator valueAnimator = this.f19340f0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f19340f0.cancel();
        }
        float f11 = this.f19365w0;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator duration = e(f11, f10, this.O0).setDuration(200L);
        this.f19340f0 = duration;
        duration.addListener(this.P0);
        this.f19340f0.start();
    }

    public final void d() {
        this.f19361t0 = -1;
        this.f19363v0 = false;
        this.f19349j1 = false;
        this.f19362u0.setVisibility(8);
        this.f19365w0 = 0.0f;
    }

    public og.d f(long j10, int i3, long j11) {
        return new og.d(j10, j11, this.Q0, this.f19346i0.h, i3, this.O, this.P);
    }

    public og.e g() {
        return new og.e(getContext(), this.X0);
    }

    public long getEndDate() {
        return this.f19346i0.f20373a[this.H];
    }

    public float getMinDistance() {
        ng.b bVar = this.f19346i0;
        if (bVar == null) {
            return 0.1f;
        }
        int length = bVar.f20373a.length;
        if (length < 5) {
            return 1.0f;
        }
        float f10 = 5.0f / length;
        if (f10 < 0.1f) {
            return 0.1f;
        }
        return f10;
    }

    public long getSelectedDate() {
        int i3 = this.f19361t0;
        if (i3 < 0) {
            return -1L;
        }
        return this.f19346i0.f20373a[i3];
    }

    public long getStartDate() {
        return this.f19346i0.f20373a[this.G];
    }

    public abstract og.f h(ng.a aVar);

    public void i(Canvas canvas) {
        int measuredHeight;
        if (this.f19346i0 != null) {
            int i3 = this.f19370z0;
            float f10 = 1.0f;
            if (i3 == 2) {
                f10 = 1.0f - this.A0.f21106f;
            } else if (i3 == 1) {
                f10 = this.A0.f21106f;
            } else if (i3 == 3) {
                f10 = this.A0.f21106f;
            }
            Paint paint = this.M;
            paint.setAlpha((int) (this.f19352n * f10));
            TextPaint textPaint = this.O;
            textPaint.setAlpha((int) (this.f19339f * 255.0f * f10));
            this.P.setAlpha((int) (this.f19339f * 255.0f * f10));
            int textSize = (int) (f19313o1 - textPaint.getTextSize());
            float measuredHeight2 = (getMeasuredHeight() - this.f19359s) - 1;
            canvas.drawLine(this.E0, measuredHeight2, this.F0, measuredHeight2, paint);
            if (this.Q0) {
                return;
            }
            canvas.drawText("0", f19311l1, measuredHeight - textSize, textPaint);
        }
    }

    public void j(Canvas canvas) {
        float f10;
        char c2;
        int i3;
        int i10;
        if (this.f19346i0 != null) {
            ArrayList arrayList = this.f19331c;
            this.f19353n0 = arrayList.size();
            int i11 = this.f19370z0;
            float f11 = 1.0f;
            int i12 = 1;
            if (i11 == 2) {
                f10 = 1.0f - this.A0.f21106f;
            } else if (i11 == 1) {
                f10 = this.A0.f21106f;
            } else if (i11 == 3) {
                f10 = this.A0.f21106f;
            } else {
                f10 = 1.0f;
            }
            char c10 = 0;
            this.f19354o0 = 0;
            while (true) {
                int i13 = this.f19354o0;
                if (i13 < this.f19353n0) {
                    int i14 = ((og.b) arrayList.get(i13)).d;
                    int i15 = ((og.b) arrayList.get(this.f19354o0)).f21057a;
                    if (i15 == 0) {
                        i15 = i12;
                    }
                    int i16 = this.G - this.f19355p0;
                    while (i16 % i15 != 0) {
                        i16--;
                    }
                    int i17 = this.H - this.f19355p0;
                    while (true) {
                        if (i17 % i15 == 0 && i17 >= this.f19346i0.f20373a.length - i12) {
                            break;
                        }
                        i17++;
                        i12 = i12;
                        i14 = i14;
                        c10 = c10;
                        f11 = 1.0f;
                    }
                    int i18 = this.f19355p0;
                    int i19 = i16 + i18;
                    int i20 = i17 + i18;
                    float f12 = this.H0 * this.f19344h0.f19385k;
                    float f13 = f19311l1;
                    float f14 = f12 - f13;
                    while (i19 < i20) {
                        if (i19 >= 0) {
                            long[] jArr = this.f19346i0.f20373a;
                            if (i19 < jArr.length - i12) {
                                long j10 = jArr[i19];
                                long j11 = jArr[c10];
                                long j12 = jArr[jArr.length - i12];
                                i3 = i12;
                                i10 = i14;
                                float f15 = ((((float) (j10 - j11)) / ((float) (j12 - j11))) * this.H0) - f14;
                                float f16 = f15 - f19319u1;
                                if (f16 > 0.0f) {
                                    float f17 = this.G0;
                                    if (f16 <= f17 + f13) {
                                        float f18 = f19315q1;
                                        int i21 = (f16 > f18 ? 1 : (f16 == f18 ? 0 : -1));
                                        c2 = c10;
                                        TextPaint textPaint = this.Q;
                                        if (i21 < 0) {
                                            textPaint.setAlpha((int) (i10 * k5.y(f18, f16, f18, f11) * this.h * f10));
                                        } else if (f16 > f17) {
                                            textPaint.setAlpha((int) (i10 * k5.y(f16, f17, f13, f11) * this.h * f10));
                                        } else {
                                            textPaint.setAlpha((int) (i10 * this.h * f10));
                                        }
                                        ng.b bVar = this.f19346i0;
                                        String[] strArr = bVar.f20375c;
                                        long[] jArr2 = bVar.f20373a;
                                        canvas.drawText(strArr[(int) ((jArr2[i19] - jArr2[c2]) / bVar.f20381k)], f15, g0.L(3.0f) + (getMeasuredHeight() - this.f19359s) + f19314p1, textPaint);
                                        i19 += i15;
                                        i12 = i3;
                                        i14 = i10;
                                        c10 = c2;
                                        f11 = 1.0f;
                                    }
                                }
                                c2 = c10;
                                i19 += i15;
                                i12 = i3;
                                i14 = i10;
                                c10 = c2;
                                f11 = 1.0f;
                            }
                        }
                        c2 = c10;
                        i3 = i12;
                        i10 = i14;
                        i19 += i15;
                        i12 = i3;
                        i14 = i10;
                        c10 = c2;
                        f11 = 1.0f;
                    }
                    this.f19354o0 += i12;
                    c10 = c10;
                    f11 = 1.0f;
                } else {
                    return;
                }
            }
        }
    }

    public abstract void k(Canvas canvas);

    public void l(android.graphics.Canvas r12, og.d r13) {
        throw new UnsupportedOperationException("Method not decompiled: mg.g.l(android.graphics.Canvas, og.d):void");
    }

    public final void m(android.graphics.Canvas r39) {
        throw new UnsupportedOperationException("Method not decompiled: mg.g.m(android.graphics.Canvas):void");
    }

    public abstract void n(Canvas canvas);

    public void o(Canvas canvas) {
        ng.b bVar;
        int i3 = this.f19361t0;
        if (i3 >= 0 && this.f19363v0 && (bVar = this.f19346i0) != null) {
            int i10 = (int) (this.f19357r * this.f19365w0);
            float f10 = this.G0;
            j jVar = this.f19344h0;
            float f11 = jVar.f19386l;
            float f12 = jVar.f19385k;
            float f13 = f10 / (f11 - f12);
            float f14 = (f12 * f13) - f19311l1;
            float[] fArr = bVar.f20374b;
            if (i3 < fArr.length) {
                float f15 = (fArr[i3] * f13) - f14;
                Paint paint = this.N;
                paint.setAlpha(i10);
                canvas.drawLine(f15, 0.0f, f15, this.I0.bottom, paint);
                if (this.f19336e) {
                    ArrayList arrayList = this.d;
                    this.f19353n0 = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        this.f19354o0 = i11;
                        int i12 = this.f19354o0;
                        if (i12 < this.f19353n0) {
                            og.f fVar = (og.f) arrayList.get(i12);
                            boolean z10 = fVar.f21096n;
                            Paint paint2 = fVar.d;
                            if (z10 || fVar.f21097o != 0.0f) {
                                float f16 = (float) fVar.f21085a.f20366a[this.f19361t0];
                                float f17 = this.f19366x;
                                float measuredHeight = (getMeasuredHeight() - this.f19359s) - (((f16 - f17) / (this.f19364w - f17)) * ((getMeasuredHeight() - this.f19359s) - f19313o1));
                                paint2.setAlpha((int) (fVar.f21097o * 255.0f * this.f19365w0));
                                Paint paint3 = this.T;
                                paint3.setAlpha((int) (fVar.f21097o * 255.0f * this.f19365w0));
                                canvas.drawPoint(f15, measuredHeight, paint2);
                                canvas.drawPoint(f15, measuredHeight, paint3);
                            }
                            i11 = this.f19354o0 + 1;
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
        if (this.f19367x0) {
            super.onDraw(canvas);
            return;
        }
        F();
        int save = canvas.save();
        RectF rectF = this.I0;
        canvas.clipRect(0.0f, rectF.top, getMeasuredWidth(), rectF.bottom);
        i(canvas);
        ArrayList arrayList = this.f19328b;
        this.f19353n0 = arrayList.size();
        int i3 = 0;
        this.f19354o0 = 0;
        while (true) {
            int i10 = this.f19354o0;
            if (i10 >= this.f19353n0) {
                break;
            }
            l(canvas, (og.d) arrayList.get(i10));
            this.f19354o0++;
        }
        k(canvas);
        while (true) {
            this.f19354o0 = i3;
            int i11 = this.f19354o0;
            if (i11 < this.f19353n0) {
                p(canvas, (og.d) arrayList.get(i11));
                i3 = this.f19354o0 + 1;
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
    public void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        if (!this.J) {
            setMeasuredDimension(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i3));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i3), g0.f22608q.y - g0.L(56.0f));
        }
        int measuredWidth = getMeasuredWidth();
        int i11 = this.Y0;
        int i12 = this.C0;
        if (measuredWidth != i11 || getMeasuredHeight() != this.Z0) {
            this.Y0 = getMeasuredWidth();
            this.Z0 = getMeasuredHeight();
            float f10 = f19311l1;
            float f11 = 2.0f * f10;
            this.f19356q0 = Bitmap.createBitmap((int) (getMeasuredWidth() - f11), i12, Bitmap.Config.ARGB_4444);
            this.f19358r0 = new Canvas(this.f19356q0);
            this.f19325a.d(i12, (int) (getMeasuredWidth() - f11));
            w();
            if (this.f19363v0) {
                x((this.H0 * this.f19344h0.f19385k) - f10);
            }
            A(false, true, false);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int measuredHeight = getMeasuredHeight();
            int i13 = f19316r1;
            this.f19327a1.set(0, measuredHeight - ((i12 + i13) + i13), getMeasuredWidth(), getMeasuredHeight());
            setSystemGestureExclusionRects(this.f19330b1);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        long j10;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean z10 = false;
        if (this.f19346i0 != null) {
            boolean z11 = this.K;
            j jVar = this.f19344h0;
            if (!z11) {
                jVar.c(motionEvent.getActionIndex(), motionEvent);
                getParent().requestDisallowInterceptTouchEvent(false);
                this.f19360s0 = false;
                return false;
            }
            int x10 = (int) motionEvent.getX(motionEvent.getActionIndex());
            int y9 = (int) motionEvent.getY(motionEvent.getActionIndex());
            int actionMasked = motionEvent.getActionMasked();
            RectF rectF = this.I0;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 5) {
                                if (actionMasked == 6) {
                                    jVar.c(motionEvent.getActionIndex(), motionEvent);
                                    return true;
                                }
                            } else {
                                return jVar.a(x10, y9, motionEvent.getActionIndex());
                            }
                        }
                    } else {
                        int i3 = x10 - this.f19335d1;
                        int i10 = y9 - this.f19338e1;
                        if (jVar.f19388n[0] == null && !jVar.f19379c) {
                            boolean z12 = this.f19360s0;
                            int i11 = this.B0;
                            if (z12) {
                                if ((this.f19347i1 && System.currentTimeMillis() - this.f19345h1 > 200) || Math.abs(i3) > Math.abs(i10) || Math.abs(i10) < i11) {
                                    z10 = true;
                                }
                                this.f19335d1 = x10;
                                this.f19338e1 = y9;
                                getParent().requestDisallowInterceptTouchEvent(z10);
                                C(x10, y9);
                                return true;
                            }
                            if (rectF.contains(this.f19341f1, this.f19343g1)) {
                                int i12 = this.f19341f1 - x10;
                                int i13 = this.f19343g1 - y9;
                                if (Math.sqrt((i13 * i13) + (i12 * i12)) > i11 || System.currentTimeMillis() - this.f19345h1 > 200) {
                                    this.f19360s0 = true;
                                    C(x10, y9);
                                    return true;
                                }
                            }
                            return true;
                        }
                        boolean b10 = jVar.b(x10, motionEvent.getActionIndex());
                        if (motionEvent.getPointerCount() > 1) {
                            motionEvent.getY(1);
                            jVar.b((int) motionEvent.getX(1), 1);
                        }
                        getParent().requestDisallowInterceptTouchEvent(b10);
                        return true;
                    }
                }
                if (!jVar.c(motionEvent.getActionIndex(), motionEvent)) {
                    if (rectF.contains(this.f19341f1, this.f19343g1) && !this.f19360s0) {
                        c(false);
                    }
                    h[] hVarArr = jVar.f19388n;
                    h hVar = hVarArr[0];
                    if (hVar != null && (valueAnimator2 = hVar.f19374e) != null) {
                        valueAnimator2.cancel();
                    }
                    h hVar2 = hVarArr[1];
                    if (hVar2 != null && (valueAnimator = hVar2.f19374e) != null) {
                        valueAnimator.cancel();
                    }
                    hVarArr[0] = null;
                    hVarArr[1] = null;
                    I();
                    getParent().requestDisallowInterceptTouchEvent(false);
                    this.f19360s0 = false;
                    y();
                    invalidate();
                    if (this.Q0) {
                        j10 = s(this.G, this.H);
                    } else {
                        j10 = 0;
                    }
                    E(r(this.G, this.H), j10, true, true, false);
                    return true;
                }
                return true;
            }
            this.f19345h1 = System.currentTimeMillis();
            getParent().requestDisallowInterceptTouchEvent(true);
            if (!jVar.a(x10, y9, motionEvent.getActionIndex())) {
                this.f19335d1 = x10;
                this.f19341f1 = x10;
                this.f19338e1 = y9;
                this.f19343g1 = y9;
                if (rectF.contains(x10, y9)) {
                    if (this.f19361t0 < 0 || !this.f19349j1) {
                        this.f19360s0 = true;
                        C(x10, y9);
                        return true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public void p(android.graphics.Canvas r14, og.d r15) {
        throw new UnsupportedOperationException("Method not decompiled: mg.g.p(android.graphics.Canvas, og.d):void");
    }

    public long r(int i3, int i10) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        long j10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            if (((og.f) arrayList.get(i11)).f21096n) {
                long I0 = ((og.f) arrayList.get(i11)).f21085a.f20367b.I0(i3, i10);
                if (I0 > j10) {
                    j10 = I0;
                }
            }
        }
        return j10;
    }

    public long s(int i3, int i10) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        long j10 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            if (((og.f) arrayList.get(i11)).f21096n) {
                long O0 = ((og.f) arrayList.get(i11)).f21085a.f20367b.O0(i3, i10);
                if (O0 < j10) {
                    j10 = O0;
                }
            }
        }
        return j10;
    }

    public void setDateSelectionListener(e eVar) {
        this.R0 = eVar;
    }

    public void setHeader(og.c cVar) {
        this.k1 = cVar;
    }

    public void setLandscape(boolean z10) {
        this.J = z10;
    }

    public void t() {
        this.M.setStrokeWidth(1.0f);
        this.N.setStrokeWidth(m1);
        TextPaint textPaint = this.O;
        float f10 = f19312n1;
        textPaint.setTextSize(f10);
        TextPaint textPaint2 = this.P;
        textPaint2.setTextSize(f10);
        textPaint2.setTextAlign(Paint.Align.RIGHT);
        TextPaint textPaint3 = this.Q;
        textPaint3.setTextSize(f10);
        textPaint3.setTextAlign(Paint.Align.CENTER);
        float N = g0.N(6.0f);
        Paint paint = this.T;
        paint.setStrokeWidth(N);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        setLayerType(2, null);
        setWillNotDraw(false);
        og.e g7 = g();
        this.f19362u0 = g7;
        g7.setVisibility(8);
        Paint paint2 = this.V;
        paint2.setColor(-1);
        paint2.setStrokeWidth(g0.N(3.0f));
        paint2.setStrokeCap(cap);
        G();
    }

    public void u() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            og.f fVar = (og.f) obj;
            boolean z10 = fVar.f21096n;
            ng.a aVar = fVar.f21085a;
            if (z10) {
                long j10 = aVar.f20369e;
                if (((float) j10) > this.f19350k0) {
                    this.f19350k0 = (float) j10;
                }
            }
            if (z10) {
                long j11 = aVar.f20370f;
                if (((float) j11) < this.f19351l0) {
                    this.f19351l0 = (float) j11;
                }
            }
            float f10 = this.f19350k0;
            float f11 = this.f19351l0;
            if (f10 == f11) {
                this.f19350k0 = f10 + 1.0f;
                this.f19351l0 = f11 - 1.0f;
            }
        }
    }

    public final void v() {
        int measuredHeight = getMeasuredHeight() - this.f19359s;
        float f10 = this.f19368y;
        if (f10 != 0.0f && measuredHeight != 0) {
            this.F = (f10 / measuredHeight) * f19312n1;
        }
    }

    public final void w() {
        float f10;
        if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            float f11 = f19311l1;
            this.D0 = getMeasuredWidth() - (2.0f * f11);
            this.E0 = f11;
            float measuredWidth = getMeasuredWidth();
            if (this.J) {
                f10 = f19318t1;
            } else {
                f10 = f11;
            }
            float f12 = measuredWidth - f10;
            this.F0 = f12;
            float f13 = f12 - this.E0;
            this.G0 = f13;
            j jVar = this.f19344h0;
            this.H0 = f13 / (jVar.f19386l - jVar.f19385k);
            I();
            this.f19359s = g0.L(100.0f);
            this.I0.set(this.E0 - f11, 0.0f, this.F0 + f11, getMeasuredHeight() - this.f19359s);
            if (this.f19346i0 != null) {
                this.f19355p0 = (int) (g0.L(20.0f) / (this.D0 / this.f19346i0.f20373a.length));
            }
            v();
        }
    }

    public final void x(float f10) {
        int i3;
        float f11;
        ng.b bVar = this.f19346i0;
        if (bVar != null && (i3 = this.f19361t0) >= 0) {
            long[] jArr = bVar.f20373a;
            if (i3 < jArr.length && this.f19363v0) {
                this.f19362u0.c(i3, jArr[i3], this.d, false, bVar.f20380j, bVar.h);
                this.f19362u0.setVisibility(0);
                this.f19362u0.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
                float f12 = (this.f19346i0.f20374b[this.f19361t0] * this.H0) - f10;
                int i10 = (f12 > ((this.E0 + this.G0) / 2.0f) ? 1 : (f12 == ((this.E0 + this.G0) / 2.0f) ? 0 : -1));
                int i11 = f19323y1;
                if (i10 > 0) {
                    f11 = f12 - (this.f19362u0.getWidth() + i11);
                } else {
                    f11 = f12 + i11;
                }
                if (f11 < 0.0f) {
                    f11 = 0.0f;
                } else if (this.f19362u0.getMeasuredWidth() + f11 > getMeasuredWidth()) {
                    f11 = getMeasuredWidth() - this.f19362u0.getMeasuredWidth();
                }
                this.f19362u0.setTranslationX(f11);
            }
        }
    }

    public void z() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3;
        A(true, true, true);
        ArrayList arrayList = this.d;
        this.f19353n0 = arrayList.size();
        int i3 = 0;
        while (true) {
            this.f19354o0 = i3;
            int i10 = this.f19354o0;
            if (i10 >= this.f19353n0) {
                break;
            }
            final og.f fVar = (og.f) arrayList.get(i10);
            if (fVar.f21096n && (valueAnimator3 = fVar.f21091i) != null) {
                valueAnimator3.cancel();
            }
            if (!fVar.f21096n && (valueAnimator2 = fVar.h) != null) {
                valueAnimator2.cancel();
            }
            if (fVar.f21096n && fVar.f21097o != 1.0f) {
                ValueAnimator valueAnimator4 = fVar.h;
                if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                    ValueAnimator e10 = e(fVar.f21097o, 1.0f, new ValueAnimator.AnimatorUpdateListener(this) {
                        public final g f19301b;

                        {
                            this.f19301b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                            switch (r3) {
                                case 0:
                                    g gVar = this.f19301b;
                                    gVar.getClass();
                                    fVar.f21097o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    gVar.I = true;
                                    gVar.invalidate();
                                    return;
                                default:
                                    g gVar2 = this.f19301b;
                                    gVar2.getClass();
                                    fVar.f21097o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    gVar2.I = true;
                                    gVar2.invalidate();
                                    return;
                            }
                        }
                    });
                    fVar.h = e10;
                    e10.start();
                } else {
                    i3 = this.f19354o0 + 1;
                }
            }
            if (!fVar.f21096n && fVar.f21097o != 0.0f && ((valueAnimator = fVar.f21091i) == null || !valueAnimator.isRunning())) {
                ValueAnimator e11 = e(fVar.f21097o, 0.0f, new ValueAnimator.AnimatorUpdateListener(this) {
                    public final g f19301b;

                    {
                        this.f19301b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                        switch (r3) {
                            case 0:
                                g gVar = this.f19301b;
                                gVar.getClass();
                                fVar.f21097o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                gVar.I = true;
                                gVar.invalidate();
                                return;
                            default:
                                g gVar2 = this.f19301b;
                                gVar2.getClass();
                                fVar.f21097o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                gVar2.I = true;
                                gVar2.invalidate();
                                return;
                        }
                    }
                });
                fVar.f21091i = e11;
                e11.start();
            }
            i3 = this.f19354o0 + 1;
        }
        K();
        if (this.f19363v0) {
            og.e eVar = this.f19362u0;
            int i11 = this.f19361t0;
            ng.b bVar = this.f19346i0;
            eVar.c(i11, bVar.f20373a[i11], arrayList, true, bVar.f20380j, bVar.h);
        }
    }

    public void q(og.j jVar) {
    }

    public void y() {
    }
}
