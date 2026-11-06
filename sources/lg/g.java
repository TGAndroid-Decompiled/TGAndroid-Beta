package lg;

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
import bi.de;
import bi.t5;
import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.xq;
import org.telegram.ui.l41;
import org.telegram.ui.li0;
public abstract class g extends View implements i {
    public static final boolean A1;
    public static final boolean B1;
    public static final x1.a C1;
    public static final float f18269k1 = g0.N(16.0f);
    public static final float l1 = g0.N(1.5f);
    public static final float f18270m1 = g0.N(12.0f);
    public static final int n1 = g0.L(18.0f);
    public static final int f18271o1 = g0.L(14.0f);
    public static final int f18272p1 = g0.L(10.0f);
    public static final int f18273q1 = g0.L(16.0f);
    public static final int f18274r1 = g0.L(24.0f);
    public static final int f18275s1 = g0.L(16.0f);
    public static final int f18276t1 = g0.L(10.0f);
    public static final int f18277u1 = g0.L(12.0f);
    public static final int f18278v1 = g0.L(8.0f);
    public static final int f18279w1 = g0.L(6.0f);
    public static final int f18280x1 = g0.L(5.0f);
    public static final int f18281y1 = g0.L(2.0f);
    public static final int f18282z1 = g0.L(1.0f);
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
    public final t5 O0;
    public final TextPaint P;
    public boolean P0;
    public final Paint Q;
    public e Q0;
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
    public final f6 W0;
    public int X0;
    public int Y0;
    public final Rect Z0;
    public f f18283a;
    public AnimatorSet f18284a0;
    public final ArrayList f18285a1;
    public final ArrayList f18286b;
    public ValueAnimator f18287b0;
    public long f18288b1;
    public final ArrayList f18289c;
    public ValueAnimator f18290c0;
    public int f18291c1;
    public final ArrayList d;
    public Animator f18292d0;
    public int f18293d1;
    public boolean f18294e;
    public ValueAnimator f18295e0;
    public int f18296e1;
    public float f18297f;
    public boolean f18298f0;
    public int f18299f1;
    public final j f18300g0;
    public long f18301g1;
    public float h;
    public mg.b f18302h0;
    public boolean f18303h1;
    public ng.b f18304i0;
    public boolean f18305i1;
    public float f18306j0;
    public ng.c f18307j1;
    public float f18308k0;
    public float f18309l0;
    public int m0;
    public int f18310n;
    public int f18311n0;
    public int f18312o0;
    public Bitmap f18313p0;
    public Canvas f18314q0;
    public int f18315r;
    public boolean f18316r0;
    public int f18317s;
    public int f18318s0;
    public ng.e f18319t0;
    public boolean f18320u0;
    public float f18321v0;
    public float f18322w;
    public boolean f18323w0;
    public float f18324x;
    public boolean f18325x0;
    public float f18326y;
    public int f18327y0;
    public ng.j f18328z0;

    static {
        boolean z9;
        if (Build.VERSION.SDK_INT < 28) {
            z9 = true;
        } else {
            z9 = false;
        }
        A1 = z9;
        B1 = true;
        C1 = new x1.a();
    }

    public g(Context context, f6 f6Var) {
        super(context);
        this.f18286b = new ArrayList(10);
        this.f18289c = new ArrayList(25);
        this.d = new ArrayList();
        this.f18294e = true;
        this.f18322w = 250.0f;
        this.f18324x = 0.0f;
        this.f18326y = 0.0f;
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
        this.f18298f0 = false;
        ?? obj = new Object();
        obj.h = new Rect();
        obj.f18341i = new Rect();
        obj.f18342j = new Rect();
        obj.f18343k = 0.7f;
        obj.f18344l = 1.0f;
        obj.f18345m = 0.1f;
        obj.f18346n = new h[]{null, null};
        obj.f18335a = this;
        this.f18300g0 = obj;
        this.f18316r0 = false;
        this.f18318s0 = -1;
        this.f18320u0 = false;
        this.f18321v0 = 0.0f;
        this.f18323w0 = false;
        this.f18325x0 = false;
        this.f18327y0 = 0;
        this.B0 = g0.L(46.0f);
        this.H0 = new RectF();
        this.J0 = new d(this, 0);
        this.K0 = new d(this, 1);
        this.L0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final g f18257b;

            {
                this.f18257b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        g gVar = this.f18257b;
                        gVar.getClass();
                        gVar.f18322w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar.invalidate();
                        return;
                    default:
                        g gVar2 = this.f18257b;
                        gVar2.getClass();
                        gVar2.f18324x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar2.invalidate();
                        return;
                }
            }
        };
        this.M0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final g f18257b;

            {
                this.f18257b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        g gVar = this.f18257b;
                        gVar.getClass();
                        gVar.f18322w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar.invalidate();
                        return;
                    default:
                        g gVar2 = this.f18257b;
                        gVar2.getClass();
                        gVar2.f18324x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar2.invalidate();
                        return;
                }
            }
        };
        this.N0 = new d(this, 2);
        this.O0 = new t5(this, 29);
        this.P0 = false;
        this.X0 = 0;
        this.Y0 = 0;
        Rect rect = new Rect();
        this.Z0 = rect;
        ArrayList arrayList = new ArrayList();
        this.f18285a1 = arrayList;
        arrayList.add(rect);
        this.f18288b1 = 0L;
        this.f18305i1 = false;
        this.W0 = f6Var;
        t();
        this.A0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public static void b(Path path, float f10, float f11, float f12, float f13, float f14, float f15, boolean z9, boolean z10, boolean z11, boolean z12) {
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
        if (z10) {
            float f22 = -f15;
            path.rQuadTo(0.0f, f22, -f14, f22);
        } else {
            path.rLineTo(0.0f, -f15);
            path.rLineTo(-f14, 0.0f);
        }
        path.rLineTo(-f20, 0.0f);
        if (z9) {
            float f23 = -f14;
            path.rQuadTo(f23, 0.0f, f23, f15);
        } else {
            path.rLineTo(-f14, 0.0f);
            path.rLineTo(0.0f, f15);
        }
        path.rLineTo(0.0f, f21);
        if (z12) {
            path.rQuadTo(0.0f, f15, f14, f15);
        } else {
            path.rLineTo(0.0f, f15);
            path.rLineTo(f14, 0.0f);
        }
        path.rLineTo(f20, 0.0f);
        if (z11) {
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
        ofFloat.setInterpolator(C1);
        ofFloat.addUpdateListener(animatorUpdateListener);
        return ofFloat;
    }

    public void A(boolean z9, boolean z10, boolean z11) {
        long j3;
        if (this.f18302h0 == null) {
            return;
        }
        float f10 = this.F0;
        j jVar = this.f18300g0;
        this.G0 = f10 / (jVar.f18344l - jVar.f18343k);
        H();
        if (this.P0) {
            j3 = s(this.F, this.G);
        } else {
            j3 = 0;
        }
        E(r(this.F, this.G), j3, z9, z10, z11);
        if (this.f18320u0 && !z10) {
            c(false);
            x((this.G0 * jVar.f18343k) - f18269k1);
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

    public void C(int i7, int i10) {
        int i11 = this.f18318s0;
        mg.b bVar = this.f18302h0;
        if (bVar != null) {
            float f10 = this.G0;
            float f11 = (this.f18300g0.f18343k * f10) - f18269k1;
            float f12 = (i7 + f11) / f10;
            if (f12 < 0.0f) {
                this.f18318s0 = 0;
            } else if (f12 > 1.0f) {
                this.f18318s0 = bVar.f20020a.length - 1;
            } else {
                int b10 = bVar.b(f12, this.F, this.G);
                this.f18318s0 = b10;
                int i12 = b10 + 1;
                float[] fArr = this.f18302h0.f20021b;
                if (i12 < fArr.length) {
                    if (Math.abs(this.f18302h0.f20021b[this.f18318s0 + 1] - f12) < Math.abs(fArr[b10] - f12)) {
                        this.f18318s0++;
                    }
                }
            }
            int i13 = this.f18318s0;
            int i14 = this.G;
            if (i13 > i14) {
                this.f18318s0 = i14;
            }
            int i15 = this.f18318s0;
            int i16 = this.F;
            if (i15 < i16) {
                this.f18318s0 = i16;
            }
            if (i11 != this.f18318s0) {
                this.f18320u0 = true;
                c(true);
                x(f11);
                e eVar = this.Q0;
                if (eVar != null) {
                    getSelectedDate();
                    l41 l41Var = (l41) ((li0) eVar).f47551b;
                    l41Var.f();
                    l41Var.f47410b.f18319t0.d(false, false);
                }
                B();
                invalidate();
            }
        }
    }

    public boolean D(mg.b bVar) {
        boolean z9;
        mg.b bVar2 = this.f18302h0;
        long j3 = 0;
        j jVar = this.f18300g0;
        ArrayList arrayList = this.d;
        if (bVar2 != bVar) {
            invalidate();
            arrayList.clear();
            if (bVar != null && bVar.d != null) {
                for (int i7 = 0; i7 < bVar.d.size(); i7++) {
                    arrayList.add(h((mg.a) bVar.d.get(i7)));
                }
            }
            d();
            this.f18302h0 = bVar;
            if (bVar != null) {
                if (bVar.f20020a[0] == 0) {
                    jVar.f18343k = 0.0f;
                    jVar.f18344l = 1.0f;
                } else {
                    float minDistance = getMinDistance();
                    jVar.f18345m = minDistance;
                    float f10 = jVar.f18344l;
                    if (f10 - jVar.f18343k < minDistance) {
                        float f11 = f10 - minDistance;
                        jVar.f18343k = f11;
                        if (f11 < 0.0f) {
                            jVar.f18343k = 0.0f;
                            jVar.f18344l = 1.0f;
                        }
                    }
                }
            }
            z9 = true;
        } else {
            z9 = false;
        }
        w();
        if (bVar != null) {
            H();
            if (this.P0) {
                j3 = s(this.F, this.G);
            }
            E(r(this.F, this.G), j3, false, false, false);
            this.f18306j0 = 0.0f;
            this.f18308k0 = 2.1474836E9f;
            u();
            int i10 = bVar.f20027j;
            if (i10 != 1 && i10 != 2) {
                this.f18319t0.setSize(arrayList.size());
            } else {
                this.f18319t0.setSize(arrayList.size() * 2);
            }
            this.H = true;
            I();
            return z9;
        }
        jVar.f18343k = 0.7f;
        jVar.f18344l = 1.0f;
        this.f18308k0 = 0.0f;
        this.f18306j0 = 0.0f;
        this.f18286b.clear();
        AnimatorSet animatorSet = this.f18284a0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator valueAnimator = this.f18287b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f18287b0.cancel();
        }
        return z9;
    }

    public final void E(long j3, long j10, boolean z9, boolean z10, boolean z11) {
        long j11;
        float f10;
        boolean z12;
        if (j3 > 100 && ((float) (j3 / 5)) % 10.0f != 0.0f) {
            j11 = ((j3 / 10) + 1) * 10;
        } else {
            j11 = j3;
        }
        if ((Math.abs(((float) (((long) Math.ceil(((float) j11) / 5.0f)) * 5)) - this.f18326y) >= this.E && j3 != 0) || ((float) j3) != this.D) {
            ng.d f11 = f(j3, this.f18302h0.f20026i, j10);
            long[] jArr = f11.f20548a;
            long j12 = jArr[jArr.length - 1];
            long j13 = jArr[0];
            if (!z11) {
                float f12 = this.f18322w - this.f18324x;
                float f13 = (float) (j12 - j13);
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
                if (((float) j12) != this.f18326y) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (this.P0 && ((float) j13) != this.D) {
                    z12 = true;
                }
                if (z12) {
                    AnimatorSet animatorSet = this.f18284a0;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        this.f18284a0.cancel();
                    }
                    this.T0 = this.f18322w;
                    this.U0 = this.f18324x;
                    this.R0 = 0.0f;
                    this.S0 = 0.0f;
                    this.V0 = f10;
                }
            }
            float f15 = (float) j12;
            this.f18326y = f15;
            float f16 = (float) j13;
            this.D = f16;
            v();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f18288b1 < 320 && !z10) {
                return;
            }
            this.f18288b1 = currentTimeMillis;
            ValueAnimator valueAnimator = this.f18287b0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f18287b0.cancel();
            }
            ArrayList arrayList = this.f18286b;
            if (!z9) {
                this.f18322w = f15;
                this.f18324x = f16;
                arrayList.clear();
                arrayList.add(f11);
                f11.f20552f = 255;
                return;
            }
            arrayList.add(f11);
            if (z11) {
                AnimatorSet animatorSet2 = this.f18284a0;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    this.f18284a0.cancel();
                }
                this.V0 = 0.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(e(this.f18322w, f15, this.L0));
                if (this.P0) {
                    animatorSet3.playTogether(e(this.f18324x, f16, this.M0));
                }
                this.f18284a0 = animatorSet3;
                animatorSet3.start();
            }
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ng.d dVar = (ng.d) arrayList.get(i7);
                if (dVar != f11) {
                    dVar.f20553g = dVar.f20552f;
                }
            }
            ValueAnimator e10 = e(0.0f, 255.0f, new de(5, this, f11));
            this.f18287b0 = e10;
            e10.addListener(new ah.l(8, this, f11));
            this.f18287b0.start();
        }
    }

    public final void F() {
        float f10 = this.V0;
        if (f10 != 0.0f) {
            float f11 = this.f18322w;
            float f12 = this.f18326y;
            if (f11 != f12) {
                float f13 = this.R0 + f10;
                this.R0 = f13;
                if (f13 > 1.0f) {
                    this.R0 = 1.0f;
                    this.f18322w = f12;
                } else {
                    float f14 = this.T0;
                    this.f18322w = (xq.f40330g.getInterpolation(f13) * (f12 - f14)) + f14;
                }
                invalidate();
            }
            if (this.P0) {
                float f15 = this.f18324x;
                float f16 = this.D;
                if (f15 != f16) {
                    float f17 = this.S0 + this.V0;
                    this.S0 = f17;
                    if (f17 > 1.0f) {
                        this.S0 = 1.0f;
                        this.f18324x = f16;
                    } else {
                        float f18 = this.U0;
                        this.f18324x = (xq.f40330g.getInterpolation(f17) * (f16 - f18)) + f18;
                    }
                    invalidate();
                }
            }
        }
    }

    public final void G() {
        int i7;
        int i10;
        if (this.f18325x0) {
            i7 = k6.Nj;
        } else {
            i7 = k6.Mj;
        }
        f6 f6Var = this.W0;
        int w02 = k6.w0(i7, f6Var);
        TextPaint textPaint = this.N;
        textPaint.setColor(w02);
        if (this.f18325x0) {
            i10 = k6.Nj;
        } else {
            i10 = k6.Mj;
        }
        this.O.setColor(k6.w0(i10, f6Var));
        int w03 = k6.w0(k6.Mj, f6Var);
        TextPaint textPaint2 = this.P;
        textPaint2.setColor(w03);
        int w04 = k6.w0(k6.Oj, f6Var);
        Paint paint = this.L;
        paint.setColor(w04);
        int w05 = k6.w0(k6.Pj, f6Var);
        Paint paint2 = this.M;
        paint2.setColor(w05);
        this.Q.setColor(k6.w0(k6.Rj, f6Var));
        this.R.setColor(k6.w0(k6.Qj, f6Var));
        this.S.setColor(k6.w0(k6.f27848d6, f6Var));
        this.T.setColor(k6.w0(k6.Sj, f6Var));
        this.f18319t0.b();
        this.f18310n = paint.getAlpha();
        this.f18315r = paint2.getAlpha();
        this.f18297f = textPaint.getAlpha() / 255.0f;
        this.h = textPaint2.getAlpha() / 255.0f;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((ng.f) obj).a();
        }
        if (this.f18320u0) {
            int i12 = this.f18318s0;
            mg.b bVar = this.f18302h0;
            long[] jArr = bVar.f20020a;
            if (i12 < jArr.length) {
                this.f18319t0.c(i12, jArr[i12], arrayList, false, bVar.f20027j, bVar.h);
            }
        }
        this.H = true;
    }

    public final void H() {
        mg.b bVar = this.f18302h0;
        if (bVar == null) {
            return;
        }
        j jVar = this.f18300g0;
        int c10 = bVar.c(Math.max(jVar.f18343k, 0.0f));
        this.F = c10;
        int a10 = this.f18302h0.a(Math.min(jVar.f18344l, 1.0f), c10);
        this.G = a10;
        int i7 = this.F;
        if (a10 < i7) {
            this.G = i7;
        }
        ng.c cVar = this.f18307j1;
        if (cVar != null) {
            long[] jArr = this.f18302h0.f20020a;
            cVar.b(jArr[i7], jArr[this.G]);
        }
        I();
    }

    public final void I() {
        mg.b bVar = this.f18302h0;
        if (bVar != null) {
            float f10 = this.F0;
            if (f10 != 0.0f) {
                int i7 = (int) ((f10 / (this.G0 * bVar.f20025g)) / 6.0f);
                ng.b bVar2 = this.f18304i0;
                if (bVar2 == null || i7 >= bVar2.f20538b || i7 <= bVar2.f20539c) {
                    int highestOneBit = Integer.highestOneBit(i7) << 1;
                    ng.b bVar3 = this.f18304i0;
                    if (bVar3 == null || bVar3.f20537a != highestOneBit) {
                        ValueAnimator valueAnimator = this.f18290c0;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllListeners();
                            this.f18290c0.cancel();
                        }
                        double d = highestOneBit;
                        double d2 = 0.2d * d;
                        ng.b bVar4 = new ng.b(highestOneBit, (int) (d + d2), (int) (d - d2));
                        bVar4.d = 255;
                        ng.b bVar5 = this.f18304i0;
                        ArrayList arrayList = this.f18289c;
                        if (bVar5 == null) {
                            this.f18304i0 = bVar4;
                            bVar4.d = 255;
                            arrayList.add(bVar4);
                            return;
                        }
                        this.f18304i0 = bVar4;
                        this.m0 = arrayList.size();
                        for (int i10 = 0; i10 < this.m0; i10++) {
                            ng.b bVar6 = (ng.b) arrayList.get(i10);
                            bVar6.f20540e = bVar6.d;
                        }
                        arrayList.add(bVar4);
                        if (arrayList.size() > 2) {
                            arrayList.remove(0);
                        }
                        ValueAnimator duration = e(0.0f, 1.0f, new de(6, this, bVar4)).setDuration(200L);
                        this.f18290c0 = duration;
                        duration.addListener(new ah.l(9, this, bVar4));
                        this.f18290c0.start();
                    }
                }
            }
        }
    }

    public void J(mg.b bVar, long j3) {
        int length = bVar.f20020a.length;
        long j10 = j3 - (j3 % 86400000);
        long j11 = 86399999 + j10;
        int i7 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            long j12 = bVar.f20020a[i11];
            if (j10 > j12) {
                i7 = i11;
            }
            if (j11 > j12) {
                i10 = i11;
            }
        }
        float[] fArr = bVar.f20021b;
        float f10 = fArr[i7];
        j jVar = this.f18300g0;
        jVar.f18343k = f10;
        jVar.f18344l = fArr[i10];
    }

    public void K() {
        if (B1) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j3 = Long.MAX_VALUE;
            int i7 = 0;
            long j10 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ng.f fVar = (ng.f) obj;
                boolean z9 = fVar.f20576n;
                mg.a aVar = fVar.f20565a;
                if (z9) {
                    long j11 = aVar.f20016e;
                    if (j11 > j10) {
                        j10 = j11;
                    }
                }
                if (z9) {
                    long j12 = aVar.f20017f;
                    if (j12 < j3) {
                        j3 = j12;
                    }
                }
            }
            if ((j3 != 2147483647L && ((float) j3) != 0.0f) || (j10 > 0 && ((float) j10) != this.f18309l0)) {
                this.f18309l0 = (float) j10;
                Animator animator = this.f18292d0;
                if (animator != null) {
                    animator.cancel();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(e(this.f18306j0, this.f18309l0, this.J0), e(this.f18308k0, 0.0f, this.K0));
                this.f18292d0 = animatorSet;
                animatorSet.start();
            }
        }
    }

    @Override
    public void a(float f10, float f11, boolean z9) {
        mg.b bVar = this.f18302h0;
        if (bVar == null) {
            return;
        }
        if (z9) {
            int c10 = bVar.c(Math.max(f10, 0.0f));
            int a10 = this.f18302h0.a(Math.min(f11, 1.0f), c10);
            E(r(c10, a10), s(c10, a10), true, true, false);
            c(false);
            return;
        }
        H();
        invalidate();
    }

    public final void c(boolean z9) {
        float f10;
        x((this.G0 * this.f18300g0.f18343k) - f18269k1);
        if (this.f18305i1 == z9) {
            return;
        }
        this.f18305i1 = z9;
        ValueAnimator valueAnimator = this.f18295e0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f18295e0.cancel();
        }
        float f11 = this.f18321v0;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator duration = e(f11, f10, this.N0).setDuration(200L);
        this.f18295e0 = duration;
        duration.addListener(this.O0);
        this.f18295e0.start();
    }

    public final void d() {
        this.f18318s0 = -1;
        this.f18320u0 = false;
        this.f18305i1 = false;
        this.f18319t0.setVisibility(8);
        this.f18321v0 = 0.0f;
    }

    public ng.d f(long j3, int i7, long j10) {
        return new ng.d(j3, j10, this.P0, this.f18302h0.h, i7, this.N, this.O);
    }

    public ng.e g() {
        return new ng.e(getContext(), this.W0);
    }

    public long getEndDate() {
        return this.f18302h0.f20020a[this.G];
    }

    public float getMinDistance() {
        mg.b bVar = this.f18302h0;
        if (bVar == null) {
            return 0.1f;
        }
        int length = bVar.f20020a.length;
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
        int i7 = this.f18318s0;
        if (i7 < 0) {
            return -1L;
        }
        return this.f18302h0.f20020a[i7];
    }

    public long getStartDate() {
        return this.f18302h0.f20020a[this.F];
    }

    public abstract ng.f h(mg.a aVar);

    public void i(Canvas canvas) {
        int measuredHeight;
        if (this.f18302h0 != null) {
            int i7 = this.f18327y0;
            float f10 = 1.0f;
            if (i7 == 2) {
                f10 = 1.0f - this.f18328z0.f20586f;
            } else if (i7 == 1) {
                f10 = this.f18328z0.f20586f;
            } else if (i7 == 3) {
                f10 = this.f18328z0.f20586f;
            }
            Paint paint = this.L;
            paint.setAlpha((int) (this.f18310n * f10));
            TextPaint textPaint = this.N;
            textPaint.setAlpha((int) (this.f18297f * 255.0f * f10));
            this.O.setAlpha((int) (this.f18297f * 255.0f * f10));
            int textSize = (int) (n1 - textPaint.getTextSize());
            float measuredHeight2 = (getMeasuredHeight() - this.f18317s) - 1;
            canvas.drawLine(this.D0, measuredHeight2, this.E0, measuredHeight2, paint);
            if (this.P0) {
                return;
            }
            canvas.drawText("0", f18269k1, measuredHeight - textSize, textPaint);
        }
    }

    public void j(Canvas canvas) {
        float f10;
        char c10;
        int i7;
        int i10;
        if (this.f18302h0 != null) {
            ArrayList arrayList = this.f18289c;
            this.m0 = arrayList.size();
            int i11 = this.f18327y0;
            float f11 = 1.0f;
            int i12 = 1;
            if (i11 == 2) {
                f10 = 1.0f - this.f18328z0.f20586f;
            } else if (i11 == 1) {
                f10 = this.f18328z0.f20586f;
            } else if (i11 == 3) {
                f10 = this.f18328z0.f20586f;
            } else {
                f10 = 1.0f;
            }
            char c11 = 0;
            this.f18311n0 = 0;
            while (true) {
                int i13 = this.f18311n0;
                if (i13 < this.m0) {
                    int i14 = ((ng.b) arrayList.get(i13)).d;
                    int i15 = ((ng.b) arrayList.get(this.f18311n0)).f20537a;
                    if (i15 == 0) {
                        i15 = i12;
                    }
                    int i16 = this.F - this.f18312o0;
                    while (i16 % i15 != 0) {
                        i16--;
                    }
                    int i17 = this.G - this.f18312o0;
                    while (true) {
                        if (i17 % i15 == 0 && i17 >= this.f18302h0.f20020a.length - i12) {
                            break;
                        }
                        i17++;
                        i12 = i12;
                        i14 = i14;
                        c11 = c11;
                        f11 = 1.0f;
                    }
                    int i18 = this.f18312o0;
                    int i19 = i16 + i18;
                    int i20 = i17 + i18;
                    float f12 = this.G0 * this.f18300g0.f18343k;
                    float f13 = f18269k1;
                    float f14 = f12 - f13;
                    while (i19 < i20) {
                        if (i19 >= 0) {
                            long[] jArr = this.f18302h0.f20020a;
                            if (i19 < jArr.length - i12) {
                                long j3 = jArr[i19];
                                long j10 = jArr[c11];
                                long j11 = jArr[jArr.length - i12];
                                i7 = i12;
                                i10 = i14;
                                float f15 = ((((float) (j3 - j10)) / ((float) (j11 - j10))) * this.G0) - f14;
                                float f16 = f15 - f18276t1;
                                if (f16 > 0.0f) {
                                    float f17 = this.F0;
                                    if (f16 <= f17 + f13) {
                                        float f18 = f18272p1;
                                        int i21 = (f16 > f18 ? 1 : (f16 == f18 ? 0 : -1));
                                        c10 = c11;
                                        TextPaint textPaint = this.P;
                                        if (i21 < 0) {
                                            textPaint.setAlpha((int) (i10 * k5.y(f18, f16, f18, f11) * this.h * f10));
                                        } else if (f16 > f17) {
                                            textPaint.setAlpha((int) (i10 * k5.y(f16, f17, f13, f11) * this.h * f10));
                                        } else {
                                            textPaint.setAlpha((int) (i10 * this.h * f10));
                                        }
                                        mg.b bVar = this.f18302h0;
                                        String[] strArr = bVar.f20022c;
                                        long[] jArr2 = bVar.f20020a;
                                        canvas.drawText(strArr[(int) ((jArr2[i19] - jArr2[c10]) / bVar.f20028k)], f15, g0.L(3.0f) + (getMeasuredHeight() - this.f18317s) + f18271o1, textPaint);
                                        i19 += i15;
                                        i12 = i7;
                                        i14 = i10;
                                        c11 = c10;
                                        f11 = 1.0f;
                                    }
                                }
                                c10 = c11;
                                i19 += i15;
                                i12 = i7;
                                i14 = i10;
                                c11 = c10;
                                f11 = 1.0f;
                            }
                        }
                        c10 = c11;
                        i7 = i12;
                        i10 = i14;
                        i19 += i15;
                        i12 = i7;
                        i14 = i10;
                        c11 = c10;
                        f11 = 1.0f;
                    }
                    this.f18311n0 += i12;
                    c11 = c11;
                    f11 = 1.0f;
                } else {
                    return;
                }
            }
        }
    }

    public abstract void k(Canvas canvas);

    public void l(android.graphics.Canvas r12, ng.d r13) {
        throw new UnsupportedOperationException("Method not decompiled: lg.g.l(android.graphics.Canvas, ng.d):void");
    }

    public final void m(android.graphics.Canvas r39) {
        throw new UnsupportedOperationException("Method not decompiled: lg.g.m(android.graphics.Canvas):void");
    }

    public abstract void n(Canvas canvas);

    public void o(Canvas canvas) {
        mg.b bVar;
        int i7 = this.f18318s0;
        if (i7 >= 0 && this.f18320u0 && (bVar = this.f18302h0) != null) {
            int i10 = (int) (this.f18315r * this.f18321v0);
            float f10 = this.F0;
            j jVar = this.f18300g0;
            float f11 = jVar.f18344l;
            float f12 = jVar.f18343k;
            float f13 = f10 / (f11 - f12);
            float f14 = (f12 * f13) - f18269k1;
            float[] fArr = bVar.f20021b;
            if (i7 < fArr.length) {
                float f15 = (fArr[i7] * f13) - f14;
                Paint paint = this.M;
                paint.setAlpha(i10);
                canvas.drawLine(f15, 0.0f, f15, this.H0.bottom, paint);
                if (this.f18294e) {
                    ArrayList arrayList = this.d;
                    this.m0 = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        this.f18311n0 = i11;
                        int i12 = this.f18311n0;
                        if (i12 < this.m0) {
                            ng.f fVar = (ng.f) arrayList.get(i12);
                            boolean z9 = fVar.f20576n;
                            Paint paint2 = fVar.d;
                            if (z9 || fVar.f20577o != 0.0f) {
                                float f16 = (float) fVar.f20565a.f20013a[this.f18318s0];
                                float f17 = this.f18324x;
                                float measuredHeight = (getMeasuredHeight() - this.f18317s) - (((f16 - f17) / (this.f18322w - f17)) * ((getMeasuredHeight() - this.f18317s) - n1));
                                paint2.setAlpha((int) (fVar.f20577o * 255.0f * this.f18321v0));
                                Paint paint3 = this.S;
                                paint3.setAlpha((int) (fVar.f20577o * 255.0f * this.f18321v0));
                                canvas.drawPoint(f15, measuredHeight, paint2);
                                canvas.drawPoint(f15, measuredHeight, paint3);
                            }
                            i11 = this.f18311n0 + 1;
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
        if (this.f18323w0) {
            super.onDraw(canvas);
            return;
        }
        F();
        int save = canvas.save();
        RectF rectF = this.H0;
        canvas.clipRect(0.0f, rectF.top, getMeasuredWidth(), rectF.bottom);
        i(canvas);
        ArrayList arrayList = this.f18286b;
        this.m0 = arrayList.size();
        int i7 = 0;
        this.f18311n0 = 0;
        while (true) {
            int i10 = this.f18311n0;
            if (i10 >= this.m0) {
                break;
            }
            l(canvas, (ng.d) arrayList.get(i10));
            this.f18311n0++;
        }
        k(canvas);
        while (true) {
            this.f18311n0 = i7;
            int i11 = this.f18311n0;
            if (i11 < this.m0) {
                p(canvas, (ng.d) arrayList.get(i11));
                i7 = this.f18311n0 + 1;
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
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (!this.I) {
            setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i7));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i7), g0.f22537q.y - g0.L(56.0f));
        }
        int measuredWidth = getMeasuredWidth();
        int i11 = this.X0;
        int i12 = this.B0;
        if (measuredWidth != i11 || getMeasuredHeight() != this.Y0) {
            this.X0 = getMeasuredWidth();
            this.Y0 = getMeasuredHeight();
            float f10 = f18269k1;
            float f11 = 2.0f * f10;
            this.f18313p0 = Bitmap.createBitmap((int) (getMeasuredWidth() - f11), i12, Bitmap.Config.ARGB_4444);
            this.f18314q0 = new Canvas(this.f18313p0);
            this.f18283a.d(i12, (int) (getMeasuredWidth() - f11));
            w();
            if (this.f18320u0) {
                x((this.G0 * this.f18300g0.f18343k) - f10);
            }
            A(false, true, false);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int measuredHeight = getMeasuredHeight();
            int i13 = f18273q1;
            this.Z0.set(0, measuredHeight - ((i12 + i13) + i13), getMeasuredWidth(), getMeasuredHeight());
            setSystemGestureExclusionRects(this.f18285a1);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        long j3;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean z9 = false;
        if (this.f18302h0 != null) {
            boolean z10 = this.J;
            j jVar = this.f18300g0;
            if (!z10) {
                jVar.c(motionEvent.getActionIndex(), motionEvent);
                getParent().requestDisallowInterceptTouchEvent(false);
                this.f18316r0 = false;
                return false;
            }
            int x10 = (int) motionEvent.getX(motionEvent.getActionIndex());
            int y10 = (int) motionEvent.getY(motionEvent.getActionIndex());
            int actionMasked = motionEvent.getActionMasked();
            RectF rectF = this.H0;
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
                                return jVar.a(x10, y10, motionEvent.getActionIndex());
                            }
                        }
                    } else {
                        int i7 = x10 - this.f18291c1;
                        int i10 = y10 - this.f18293d1;
                        if (jVar.f18346n[0] == null && !jVar.f18337c) {
                            boolean z11 = this.f18316r0;
                            int i11 = this.A0;
                            if (z11) {
                                if ((this.f18303h1 && System.currentTimeMillis() - this.f18301g1 > 200) || Math.abs(i7) > Math.abs(i10) || Math.abs(i10) < i11) {
                                    z9 = true;
                                }
                                this.f18291c1 = x10;
                                this.f18293d1 = y10;
                                getParent().requestDisallowInterceptTouchEvent(z9);
                                C(x10, y10);
                                return true;
                            }
                            if (rectF.contains(this.f18296e1, this.f18299f1)) {
                                int i12 = this.f18296e1 - x10;
                                int i13 = this.f18299f1 - y10;
                                if (Math.sqrt((i13 * i13) + (i12 * i12)) > i11 || System.currentTimeMillis() - this.f18301g1 > 200) {
                                    this.f18316r0 = true;
                                    C(x10, y10);
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
                    if (rectF.contains(this.f18296e1, this.f18299f1) && !this.f18316r0) {
                        c(false);
                    }
                    h[] hVarArr = jVar.f18346n;
                    h hVar = hVarArr[0];
                    if (hVar != null && (valueAnimator2 = hVar.f18332e) != null) {
                        valueAnimator2.cancel();
                    }
                    h hVar2 = hVarArr[1];
                    if (hVar2 != null && (valueAnimator = hVar2.f18332e) != null) {
                        valueAnimator.cancel();
                    }
                    hVarArr[0] = null;
                    hVarArr[1] = null;
                    I();
                    getParent().requestDisallowInterceptTouchEvent(false);
                    this.f18316r0 = false;
                    y();
                    invalidate();
                    if (this.P0) {
                        j3 = s(this.F, this.G);
                    } else {
                        j3 = 0;
                    }
                    E(r(this.F, this.G), j3, true, true, false);
                    return true;
                }
                return true;
            }
            this.f18301g1 = System.currentTimeMillis();
            getParent().requestDisallowInterceptTouchEvent(true);
            if (!jVar.a(x10, y10, motionEvent.getActionIndex())) {
                this.f18291c1 = x10;
                this.f18296e1 = x10;
                this.f18293d1 = y10;
                this.f18299f1 = y10;
                if (rectF.contains(x10, y10)) {
                    if (this.f18318s0 < 0 || !this.f18305i1) {
                        this.f18316r0 = true;
                        C(x10, y10);
                        return true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public void p(android.graphics.Canvas r14, ng.d r15) {
        throw new UnsupportedOperationException("Method not decompiled: lg.g.p(android.graphics.Canvas, ng.d):void");
    }

    public long r(int i7, int i10) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        long j3 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            if (((ng.f) arrayList.get(i11)).f20576n) {
                long w02 = ((ng.f) arrayList.get(i11)).f20565a.f20014b.w0(i7, i10);
                if (w02 > j3) {
                    j3 = w02;
                }
            }
        }
        return j3;
    }

    public long s(int i7, int i10) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        long j3 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            if (((ng.f) arrayList.get(i11)).f20576n) {
                long H0 = ((ng.f) arrayList.get(i11)).f20565a.f20014b.H0(i7, i10);
                if (H0 < j3) {
                    j3 = H0;
                }
            }
        }
        return j3;
    }

    public void setDateSelectionListener(e eVar) {
        this.Q0 = eVar;
    }

    public void setHeader(ng.c cVar) {
        this.f18307j1 = cVar;
    }

    public void setLandscape(boolean z9) {
        this.I = z9;
    }

    public void t() {
        this.L.setStrokeWidth(1.0f);
        this.M.setStrokeWidth(l1);
        TextPaint textPaint = this.N;
        float f10 = f18270m1;
        textPaint.setTextSize(f10);
        TextPaint textPaint2 = this.O;
        textPaint2.setTextSize(f10);
        textPaint2.setTextAlign(Paint.Align.RIGHT);
        TextPaint textPaint3 = this.P;
        textPaint3.setTextSize(f10);
        textPaint3.setTextAlign(Paint.Align.CENTER);
        float N = g0.N(6.0f);
        Paint paint = this.S;
        paint.setStrokeWidth(N);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        setLayerType(2, null);
        setWillNotDraw(false);
        ng.e g10 = g();
        this.f18319t0 = g10;
        g10.setVisibility(8);
        Paint paint2 = this.U;
        paint2.setColor(-1);
        paint2.setStrokeWidth(g0.N(3.0f));
        paint2.setStrokeCap(cap);
        G();
    }

    public void u() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ng.f fVar = (ng.f) obj;
            boolean z9 = fVar.f20576n;
            mg.a aVar = fVar.f20565a;
            if (z9) {
                long j3 = aVar.f20016e;
                if (((float) j3) > this.f18306j0) {
                    this.f18306j0 = (float) j3;
                }
            }
            if (z9) {
                long j10 = aVar.f20017f;
                if (((float) j10) < this.f18308k0) {
                    this.f18308k0 = (float) j10;
                }
            }
            float f10 = this.f18306j0;
            float f11 = this.f18308k0;
            if (f10 == f11) {
                this.f18306j0 = f10 + 1.0f;
                this.f18308k0 = f11 - 1.0f;
            }
        }
    }

    public final void v() {
        int measuredHeight = getMeasuredHeight() - this.f18317s;
        float f10 = this.f18326y;
        if (f10 != 0.0f && measuredHeight != 0) {
            this.E = (f10 / measuredHeight) * f18270m1;
        }
    }

    public final void w() {
        float f10;
        if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            float f11 = f18269k1;
            this.C0 = getMeasuredWidth() - (2.0f * f11);
            this.D0 = f11;
            float measuredWidth = getMeasuredWidth();
            if (this.I) {
                f10 = f18275s1;
            } else {
                f10 = f11;
            }
            float f12 = measuredWidth - f10;
            this.E0 = f12;
            float f13 = f12 - this.D0;
            this.F0 = f13;
            j jVar = this.f18300g0;
            this.G0 = f13 / (jVar.f18344l - jVar.f18343k);
            I();
            this.f18317s = g0.L(100.0f);
            this.H0.set(this.D0 - f11, 0.0f, this.E0 + f11, getMeasuredHeight() - this.f18317s);
            if (this.f18302h0 != null) {
                this.f18312o0 = (int) (g0.L(20.0f) / (this.C0 / this.f18302h0.f20020a.length));
            }
            v();
        }
    }

    public final void x(float f10) {
        int i7;
        float f11;
        mg.b bVar = this.f18302h0;
        if (bVar != null && (i7 = this.f18318s0) >= 0) {
            long[] jArr = bVar.f20020a;
            if (i7 < jArr.length && this.f18320u0) {
                this.f18319t0.c(i7, jArr[i7], this.d, false, bVar.f20027j, bVar.h);
                this.f18319t0.setVisibility(0);
                this.f18319t0.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
                float f12 = (this.f18302h0.f20021b[this.f18318s0] * this.G0) - f10;
                int i10 = (f12 > ((this.D0 + this.F0) / 2.0f) ? 1 : (f12 == ((this.D0 + this.F0) / 2.0f) ? 0 : -1));
                int i11 = f18280x1;
                if (i10 > 0) {
                    f11 = f12 - (this.f18319t0.getWidth() + i11);
                } else {
                    f11 = f12 + i11;
                }
                if (f11 < 0.0f) {
                    f11 = 0.0f;
                } else if (this.f18319t0.getMeasuredWidth() + f11 > getMeasuredWidth()) {
                    f11 = getMeasuredWidth() - this.f18319t0.getMeasuredWidth();
                }
                this.f18319t0.setTranslationX(f11);
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
        int i7 = 0;
        while (true) {
            this.f18311n0 = i7;
            int i10 = this.f18311n0;
            if (i10 >= this.m0) {
                break;
            }
            final ng.f fVar = (ng.f) arrayList.get(i10);
            if (fVar.f20576n && (valueAnimator3 = fVar.f20571i) != null) {
                valueAnimator3.cancel();
            }
            if (!fVar.f20576n && (valueAnimator2 = fVar.h) != null) {
                valueAnimator2.cancel();
            }
            if (fVar.f20576n && fVar.f20577o != 1.0f) {
                ValueAnimator valueAnimator4 = fVar.h;
                if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                    ValueAnimator e10 = e(fVar.f20577o, 1.0f, new ValueAnimator.AnimatorUpdateListener(this) {
                        public final g f18259b;

                        {
                            this.f18259b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                            switch (r3) {
                                case 0:
                                    g gVar = this.f18259b;
                                    gVar.getClass();
                                    fVar.f20577o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    gVar.H = true;
                                    gVar.invalidate();
                                    return;
                                default:
                                    g gVar2 = this.f18259b;
                                    gVar2.getClass();
                                    fVar.f20577o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    gVar2.H = true;
                                    gVar2.invalidate();
                                    return;
                            }
                        }
                    });
                    fVar.h = e10;
                    e10.start();
                } else {
                    i7 = this.f18311n0 + 1;
                }
            }
            if (!fVar.f20576n && fVar.f20577o != 0.0f && ((valueAnimator = fVar.f20571i) == null || !valueAnimator.isRunning())) {
                ValueAnimator e11 = e(fVar.f20577o, 0.0f, new ValueAnimator.AnimatorUpdateListener(this) {
                    public final g f18259b;

                    {
                        this.f18259b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                        switch (r3) {
                            case 0:
                                g gVar = this.f18259b;
                                gVar.getClass();
                                fVar.f20577o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                gVar.H = true;
                                gVar.invalidate();
                                return;
                            default:
                                g gVar2 = this.f18259b;
                                gVar2.getClass();
                                fVar.f20577o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                gVar2.H = true;
                                gVar2.invalidate();
                                return;
                        }
                    }
                });
                fVar.f20571i = e11;
                e11.start();
            }
            i7 = this.f18311n0 + 1;
        }
        K();
        if (this.f18320u0) {
            ng.e eVar = this.f18319t0;
            int i11 = this.f18318s0;
            mg.b bVar = this.f18302h0;
            eVar.c(i11, bVar.f20020a[i11], arrayList, true, bVar.f20027j, bVar.h);
        }
    }

    public void q(ng.j jVar) {
    }

    public void y() {
    }
}
