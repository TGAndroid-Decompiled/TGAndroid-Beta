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
import ch.w;
import java.util.ArrayList;
import ki.m3;
import org.telegram.messenger.f3;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.m41;
import org.telegram.ui.qi0;
public abstract class g extends View implements i {
    public static final boolean B1;
    public static final boolean C1;
    public static final x1.a D1;
    public ng.j A0;
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
    public final m3 P0;
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
    public final h6 X0;
    public int Y0;
    public int Z0;
    public f f19810a;
    public final Path f19811a0;
    public final Rect f19812a1;
    public final ArrayList f19813b;
    public AnimatorSet f19814b0;
    public final ArrayList f19815b1;
    public final ArrayList f19816c;
    public ValueAnimator f19817c0;
    public long f19818c1;
    public final ArrayList d;
    public ValueAnimator f19819d0;
    public int f19820d1;
    public boolean f19821e;
    public Animator f19822e0;
    public int f19823e1;
    public float f19824f;
    public ValueAnimator f19825f0;
    public int f19826f1;
    public boolean f19827g0;
    public int f19828g1;
    public float h;
    public final j f19829h0;
    public long f19830h1;
    public mg.b f19831i0;
    public boolean f19832i1;
    public ng.b f19833j0;
    public boolean f19834j1;
    public float f19835k0;
    public ng.c f19836k1;
    public float f19837l0;
    public float m0;
    public int f19838n;
    public int f19839n0;
    public int f19840o0;
    public int f19841p0;
    public Bitmap f19842q0;
    public int f19843r;
    public Canvas f19844r0;
    public int f19845s;
    public boolean f19846s0;
    public int f19847t0;
    public ng.e f19848u0;
    public boolean f19849v0;
    public float f19850w;
    public float f19851w0;
    public float f19852x;
    public boolean f19853x0;
    public float f19854y;
    public boolean f19855y0;
    public int f19856z0;
    public static final float l1 = g0.N(16.0f);
    public static final float f19797m1 = g0.N(1.5f);
    public static final float n1 = g0.N(12.0f);
    public static final int f19798o1 = g0.L(18.0f);
    public static final int f19799p1 = g0.L(14.0f);
    public static final int f19800q1 = g0.L(10.0f);
    public static final int f19801r1 = g0.L(16.0f);
    public static final int f19802s1 = g0.L(24.0f);
    public static final int f19803t1 = g0.L(16.0f);
    public static final int f19804u1 = g0.L(10.0f);
    public static final int f19805v1 = g0.L(12.0f);
    public static final int f19806w1 = g0.L(8.0f);
    public static final int f19807x1 = g0.L(6.0f);
    public static final int f19808y1 = g0.L(5.0f);
    public static final int f19809z1 = g0.L(2.0f);
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
        D1 = new x1.a();
    }

    public g(Context context, h6 h6Var) {
        super(context);
        this.f19813b = new ArrayList(10);
        this.f19816c = new ArrayList(25);
        this.d = new ArrayList();
        this.f19821e = true;
        this.f19850w = 250.0f;
        this.f19852x = 0.0f;
        this.f19854y = 0.0f;
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
        this.f19811a0 = new Path();
        this.f19827g0 = false;
        ?? obj = new Object();
        obj.h = new Rect();
        obj.f19869i = new Rect();
        obj.f19870j = new Rect();
        obj.f19871k = 0.7f;
        obj.f19872l = 1.0f;
        obj.f19873m = 0.1f;
        obj.f19874n = new h[]{null, null};
        obj.f19863a = this;
        this.f19829h0 = obj;
        this.f19846s0 = false;
        this.f19847t0 = -1;
        this.f19849v0 = false;
        this.f19851w0 = 0.0f;
        this.f19853x0 = false;
        this.f19855y0 = false;
        this.f19856z0 = 0;
        this.C0 = g0.L(46.0f);
        this.I0 = new RectF();
        this.K0 = new d(this, 0);
        this.L0 = new d(this, 1);
        this.M0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final g f19785b;

            {
                this.f19785b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        g gVar = this.f19785b;
                        gVar.getClass();
                        gVar.f19850w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar.invalidate();
                        return;
                    default:
                        g gVar2 = this.f19785b;
                        gVar2.getClass();
                        gVar2.f19852x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar2.invalidate();
                        return;
                }
            }
        };
        this.N0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final g f19785b;

            {
                this.f19785b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        g gVar = this.f19785b;
                        gVar.getClass();
                        gVar.f19850w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar.invalidate();
                        return;
                    default:
                        g gVar2 = this.f19785b;
                        gVar2.getClass();
                        gVar2.f19852x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar2.invalidate();
                        return;
                }
            }
        };
        this.O0 = new d(this, 2);
        this.P0 = new m3(this, 1);
        this.Q0 = false;
        this.Y0 = 0;
        this.Z0 = 0;
        Rect rect = new Rect();
        this.f19812a1 = rect;
        ArrayList arrayList = new ArrayList();
        this.f19815b1 = arrayList;
        arrayList.add(rect);
        this.f19818c1 = 0L;
        this.f19834j1 = false;
        this.X0 = h6Var;
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
        long j3;
        if (this.f19831i0 == null) {
            return;
        }
        float f10 = this.G0;
        j jVar = this.f19829h0;
        this.H0 = f10 / (jVar.f19872l - jVar.f19871k);
        H();
        if (this.Q0) {
            j3 = s(this.G, this.H);
        } else {
            j3 = 0;
        }
        E(r(this.G, this.H), j3, z10, z11, z12);
        if (this.f19849v0 && !z11) {
            c(false);
            x((this.H0 * jVar.f19871k) - l1);
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

    public void C(int i7, int i10) {
        int i11 = this.f19847t0;
        mg.b bVar = this.f19831i0;
        if (bVar != null) {
            float f10 = this.H0;
            float f11 = (this.f19829h0.f19871k * f10) - l1;
            float f12 = (i7 + f11) / f10;
            if (f12 < 0.0f) {
                this.f19847t0 = 0;
            } else if (f12 > 1.0f) {
                this.f19847t0 = bVar.f21009a.length - 1;
            } else {
                int b10 = bVar.b(f12, this.G, this.H);
                this.f19847t0 = b10;
                int i12 = b10 + 1;
                float[] fArr = this.f19831i0.f21010b;
                if (i12 < fArr.length) {
                    if (Math.abs(this.f19831i0.f21010b[this.f19847t0 + 1] - f12) < Math.abs(fArr[b10] - f12)) {
                        this.f19847t0++;
                    }
                }
            }
            int i13 = this.f19847t0;
            int i14 = this.H;
            if (i13 > i14) {
                this.f19847t0 = i14;
            }
            int i15 = this.f19847t0;
            int i16 = this.G;
            if (i15 < i16) {
                this.f19847t0 = i16;
            }
            if (i11 != this.f19847t0) {
                this.f19849v0 = true;
                c(true);
                x(f11);
                e eVar = this.R0;
                if (eVar != null) {
                    getSelectedDate();
                    m41 m41Var = (m41) ((qi0) eVar).f51288b;
                    m41Var.f();
                    m41Var.f49755b.f19848u0.d(false, false);
                }
                B();
                invalidate();
            }
        }
    }

    public boolean D(mg.b bVar) {
        boolean z10;
        mg.b bVar2 = this.f19831i0;
        long j3 = 0;
        j jVar = this.f19829h0;
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
            this.f19831i0 = bVar;
            if (bVar != null) {
                if (bVar.f21009a[0] == 0) {
                    jVar.f19871k = 0.0f;
                    jVar.f19872l = 1.0f;
                } else {
                    float minDistance = getMinDistance();
                    jVar.f19873m = minDistance;
                    float f10 = jVar.f19872l;
                    if (f10 - jVar.f19871k < minDistance) {
                        float f11 = f10 - minDistance;
                        jVar.f19871k = f11;
                        if (f11 < 0.0f) {
                            jVar.f19871k = 0.0f;
                            jVar.f19872l = 1.0f;
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
                j3 = s(this.G, this.H);
            }
            E(r(this.G, this.H), j3, false, false, false);
            this.f19835k0 = 0.0f;
            this.f19837l0 = 2.1474836E9f;
            u();
            int i10 = bVar.f21016j;
            if (i10 != 1 && i10 != 2) {
                this.f19848u0.setSize(arrayList.size());
            } else {
                this.f19848u0.setSize(arrayList.size() * 2);
            }
            this.I = true;
            I();
            return z10;
        }
        jVar.f19871k = 0.7f;
        jVar.f19872l = 1.0f;
        this.f19837l0 = 0.0f;
        this.f19835k0 = 0.0f;
        this.f19813b.clear();
        AnimatorSet animatorSet = this.f19814b0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator valueAnimator = this.f19817c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f19817c0.cancel();
        }
        return z10;
    }

    public final void E(long j3, long j10, boolean z10, boolean z11, boolean z12) {
        long j11;
        float f10;
        boolean z13;
        if (j3 > 100 && ((float) (j3 / 5)) % 10.0f != 0.0f) {
            j11 = ((j3 / 10) + 1) * 10;
        } else {
            j11 = j3;
        }
        if ((Math.abs(((float) (((long) Math.ceil(((float) j11) / 5.0f)) * 5)) - this.f19854y) >= this.F && j3 != 0) || ((float) j3) != this.E) {
            ng.d f11 = f(j3, this.f19831i0.f21015i, j10);
            long[] jArr = f11.f21510a;
            long j12 = jArr[jArr.length - 1];
            long j13 = jArr[0];
            if (!z12) {
                float f12 = this.f19850w - this.f19852x;
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
                if (((float) j12) != this.f19854y) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (this.Q0 && ((float) j13) != this.E) {
                    z13 = true;
                }
                if (z13) {
                    AnimatorSet animatorSet = this.f19814b0;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        this.f19814b0.cancel();
                    }
                    this.U0 = this.f19850w;
                    this.V0 = this.f19852x;
                    this.S0 = 0.0f;
                    this.T0 = 0.0f;
                    this.W0 = f10;
                }
            }
            float f15 = (float) j12;
            this.f19854y = f15;
            float f16 = (float) j13;
            this.E = f16;
            v();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f19818c1 < 320 && !z11) {
                return;
            }
            this.f19818c1 = currentTimeMillis;
            ValueAnimator valueAnimator = this.f19817c0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f19817c0.cancel();
            }
            ArrayList arrayList = this.f19813b;
            if (!z10) {
                this.f19850w = f15;
                this.f19852x = f16;
                arrayList.clear();
                arrayList.add(f11);
                f11.f21514f = 255;
                return;
            }
            arrayList.add(f11);
            if (z12) {
                AnimatorSet animatorSet2 = this.f19814b0;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    this.f19814b0.cancel();
                }
                this.W0 = 0.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(e(this.f19850w, f15, this.M0));
                if (this.Q0) {
                    animatorSet3.playTogether(e(this.f19852x, f16, this.N0));
                }
                this.f19814b0 = animatorSet3;
                animatorSet3.start();
            }
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ng.d dVar = (ng.d) arrayList.get(i7);
                if (dVar != f11) {
                    dVar.f21515g = dVar.f21514f;
                }
            }
            ValueAnimator e10 = e(0.0f, 255.0f, new w(5, this, f11));
            this.f19817c0 = e10;
            e10.addListener(new ah.l(8, this, f11));
            this.f19817c0.start();
        }
    }

    public final void F() {
        float f10 = this.W0;
        if (f10 != 0.0f) {
            float f11 = this.f19850w;
            float f12 = this.f19854y;
            if (f11 != f12) {
                float f13 = this.S0 + f10;
                this.S0 = f13;
                if (f13 > 1.0f) {
                    this.S0 = 1.0f;
                    this.f19850w = f12;
                } else {
                    float f14 = this.U0;
                    this.f19850w = (nr.f37957g.getInterpolation(f13) * (f12 - f14)) + f14;
                }
                invalidate();
            }
            if (this.Q0) {
                float f15 = this.f19852x;
                float f16 = this.E;
                if (f15 != f16) {
                    float f17 = this.T0 + this.W0;
                    this.T0 = f17;
                    if (f17 > 1.0f) {
                        this.T0 = 1.0f;
                        this.f19852x = f16;
                    } else {
                        float f18 = this.V0;
                        this.f19852x = (nr.f37957g.getInterpolation(f17) * (f16 - f18)) + f18;
                    }
                    invalidate();
                }
            }
        }
    }

    public final void G() {
        int i7;
        int i10;
        if (this.f19855y0) {
            i7 = m6.Qj;
        } else {
            i7 = m6.Pj;
        }
        h6 h6Var = this.X0;
        int w02 = m6.w0(i7, h6Var);
        TextPaint textPaint = this.O;
        textPaint.setColor(w02);
        if (this.f19855y0) {
            i10 = m6.Qj;
        } else {
            i10 = m6.Pj;
        }
        this.P.setColor(m6.w0(i10, h6Var));
        int w03 = m6.w0(m6.Pj, h6Var);
        TextPaint textPaint2 = this.Q;
        textPaint2.setColor(w03);
        int w04 = m6.w0(m6.Rj, h6Var);
        Paint paint = this.M;
        paint.setColor(w04);
        int w05 = m6.w0(m6.Sj, h6Var);
        Paint paint2 = this.N;
        paint2.setColor(w05);
        this.R.setColor(m6.w0(m6.Uj, h6Var));
        this.S.setColor(m6.w0(m6.Tj, h6Var));
        this.T.setColor(m6.w0(m6.f29378d6, h6Var));
        this.U.setColor(m6.w0(m6.Vj, h6Var));
        this.f19848u0.b();
        this.f19838n = paint.getAlpha();
        this.f19843r = paint2.getAlpha();
        this.f19824f = textPaint.getAlpha() / 255.0f;
        this.h = textPaint2.getAlpha() / 255.0f;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((ng.f) obj).a();
        }
        if (this.f19849v0) {
            int i12 = this.f19847t0;
            mg.b bVar = this.f19831i0;
            long[] jArr = bVar.f21009a;
            if (i12 < jArr.length) {
                this.f19848u0.c(i12, jArr[i12], arrayList, false, bVar.f21016j, bVar.h);
            }
        }
        this.I = true;
    }

    public final void H() {
        mg.b bVar = this.f19831i0;
        if (bVar == null) {
            return;
        }
        j jVar = this.f19829h0;
        int c10 = bVar.c(Math.max(jVar.f19871k, 0.0f));
        this.G = c10;
        int a10 = this.f19831i0.a(Math.min(jVar.f19872l, 1.0f), c10);
        this.H = a10;
        int i7 = this.G;
        if (a10 < i7) {
            this.H = i7;
        }
        ng.c cVar = this.f19836k1;
        if (cVar != null) {
            long[] jArr = this.f19831i0.f21009a;
            cVar.b(jArr[i7], jArr[this.H]);
        }
        I();
    }

    public final void I() {
        mg.b bVar = this.f19831i0;
        if (bVar != null) {
            float f10 = this.G0;
            if (f10 != 0.0f) {
                int i7 = (int) ((f10 / (this.H0 * bVar.f21014g)) / 6.0f);
                ng.b bVar2 = this.f19833j0;
                if (bVar2 == null || i7 >= bVar2.f21500b || i7 <= bVar2.f21501c) {
                    int highestOneBit = Integer.highestOneBit(i7) << 1;
                    ng.b bVar3 = this.f19833j0;
                    if (bVar3 == null || bVar3.f21499a != highestOneBit) {
                        ValueAnimator valueAnimator = this.f19819d0;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllListeners();
                            this.f19819d0.cancel();
                        }
                        double d = highestOneBit;
                        double d2 = 0.2d * d;
                        ng.b bVar4 = new ng.b(highestOneBit, (int) (d + d2), (int) (d - d2));
                        bVar4.d = 255;
                        ng.b bVar5 = this.f19833j0;
                        ArrayList arrayList = this.f19816c;
                        if (bVar5 == null) {
                            this.f19833j0 = bVar4;
                            bVar4.d = 255;
                            arrayList.add(bVar4);
                            return;
                        }
                        this.f19833j0 = bVar4;
                        this.f19839n0 = arrayList.size();
                        for (int i10 = 0; i10 < this.f19839n0; i10++) {
                            ng.b bVar6 = (ng.b) arrayList.get(i10);
                            bVar6.f21502e = bVar6.d;
                        }
                        arrayList.add(bVar4);
                        if (arrayList.size() > 2) {
                            arrayList.remove(0);
                        }
                        ValueAnimator duration = e(0.0f, 1.0f, new w(6, this, bVar4)).setDuration(200L);
                        this.f19819d0 = duration;
                        duration.addListener(new ah.l(9, this, bVar4));
                        this.f19819d0.start();
                    }
                }
            }
        }
    }

    public void J(mg.b bVar, long j3) {
        int length = bVar.f21009a.length;
        long j10 = j3 - (j3 % 86400000);
        long j11 = 86399999 + j10;
        int i7 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            long j12 = bVar.f21009a[i11];
            if (j10 > j12) {
                i7 = i11;
            }
            if (j11 > j12) {
                i10 = i11;
            }
        }
        float[] fArr = bVar.f21010b;
        float f10 = fArr[i7];
        j jVar = this.f19829h0;
        jVar.f19871k = f10;
        jVar.f19872l = fArr[i10];
    }

    public void K() {
        if (C1) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j3 = Long.MAX_VALUE;
            int i7 = 0;
            long j10 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ng.f fVar = (ng.f) obj;
                boolean z10 = fVar.f21538n;
                mg.a aVar = fVar.f21527a;
                if (z10) {
                    long j11 = aVar.f21005e;
                    if (j11 > j10) {
                        j10 = j11;
                    }
                }
                if (z10) {
                    long j12 = aVar.f21006f;
                    if (j12 < j3) {
                        j3 = j12;
                    }
                }
            }
            if ((j3 != 2147483647L && ((float) j3) != 0.0f) || (j10 > 0 && ((float) j10) != this.m0)) {
                this.m0 = (float) j10;
                Animator animator = this.f19822e0;
                if (animator != null) {
                    animator.cancel();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(e(this.f19835k0, this.m0, this.K0), e(this.f19837l0, 0.0f, this.L0));
                this.f19822e0 = animatorSet;
                animatorSet.start();
            }
        }
    }

    @Override
    public void a(float f10, float f11, boolean z10) {
        mg.b bVar = this.f19831i0;
        if (bVar == null) {
            return;
        }
        if (z10) {
            int c10 = bVar.c(Math.max(f10, 0.0f));
            int a10 = this.f19831i0.a(Math.min(f11, 1.0f), c10);
            E(r(c10, a10), s(c10, a10), true, true, false);
            c(false);
            return;
        }
        H();
        invalidate();
    }

    public final void c(boolean z10) {
        float f10;
        x((this.H0 * this.f19829h0.f19871k) - l1);
        if (this.f19834j1 == z10) {
            return;
        }
        this.f19834j1 = z10;
        ValueAnimator valueAnimator = this.f19825f0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f19825f0.cancel();
        }
        float f11 = this.f19851w0;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator duration = e(f11, f10, this.O0).setDuration(200L);
        this.f19825f0 = duration;
        duration.addListener(this.P0);
        this.f19825f0.start();
    }

    public final void d() {
        this.f19847t0 = -1;
        this.f19849v0 = false;
        this.f19834j1 = false;
        this.f19848u0.setVisibility(8);
        this.f19851w0 = 0.0f;
    }

    public ng.d f(long j3, int i7, long j10) {
        return new ng.d(j3, j10, this.Q0, this.f19831i0.h, i7, this.O, this.P);
    }

    public ng.e g() {
        return new ng.e(getContext(), this.X0);
    }

    public long getEndDate() {
        return this.f19831i0.f21009a[this.H];
    }

    public float getMinDistance() {
        mg.b bVar = this.f19831i0;
        if (bVar == null) {
            return 0.1f;
        }
        int length = bVar.f21009a.length;
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
        int i7 = this.f19847t0;
        if (i7 < 0) {
            return -1L;
        }
        return this.f19831i0.f21009a[i7];
    }

    public long getStartDate() {
        return this.f19831i0.f21009a[this.G];
    }

    public abstract ng.f h(mg.a aVar);

    public void i(Canvas canvas) {
        int measuredHeight;
        if (this.f19831i0 != null) {
            int i7 = this.f19856z0;
            float f10 = 1.0f;
            if (i7 == 2) {
                f10 = 1.0f - this.A0.f21548f;
            } else if (i7 == 1) {
                f10 = this.A0.f21548f;
            } else if (i7 == 3) {
                f10 = this.A0.f21548f;
            }
            Paint paint = this.M;
            paint.setAlpha((int) (this.f19838n * f10));
            TextPaint textPaint = this.O;
            textPaint.setAlpha((int) (this.f19824f * 255.0f * f10));
            this.P.setAlpha((int) (this.f19824f * 255.0f * f10));
            int textSize = (int) (f19798o1 - textPaint.getTextSize());
            float measuredHeight2 = (getMeasuredHeight() - this.f19845s) - 1;
            canvas.drawLine(this.E0, measuredHeight2, this.F0, measuredHeight2, paint);
            if (this.Q0) {
                return;
            }
            canvas.drawText("0", l1, measuredHeight - textSize, textPaint);
        }
    }

    public void j(Canvas canvas) {
        float f10;
        char c10;
        int i7;
        int i10;
        if (this.f19831i0 != null) {
            ArrayList arrayList = this.f19816c;
            this.f19839n0 = arrayList.size();
            int i11 = this.f19856z0;
            float f11 = 1.0f;
            int i12 = 1;
            if (i11 == 2) {
                f10 = 1.0f - this.A0.f21548f;
            } else if (i11 == 1) {
                f10 = this.A0.f21548f;
            } else if (i11 == 3) {
                f10 = this.A0.f21548f;
            } else {
                f10 = 1.0f;
            }
            char c11 = 0;
            this.f19840o0 = 0;
            while (true) {
                int i13 = this.f19840o0;
                if (i13 < this.f19839n0) {
                    int i14 = ((ng.b) arrayList.get(i13)).d;
                    int i15 = ((ng.b) arrayList.get(this.f19840o0)).f21499a;
                    if (i15 == 0) {
                        i15 = i12;
                    }
                    int i16 = this.G - this.f19841p0;
                    while (i16 % i15 != 0) {
                        i16--;
                    }
                    int i17 = this.H - this.f19841p0;
                    while (true) {
                        if (i17 % i15 == 0 && i17 >= this.f19831i0.f21009a.length - i12) {
                            break;
                        }
                        i17++;
                        i12 = i12;
                        i14 = i14;
                        c11 = c11;
                        f11 = 1.0f;
                    }
                    int i18 = this.f19841p0;
                    int i19 = i16 + i18;
                    int i20 = i17 + i18;
                    float f12 = this.H0 * this.f19829h0.f19871k;
                    float f13 = l1;
                    float f14 = f12 - f13;
                    while (i19 < i20) {
                        if (i19 >= 0) {
                            long[] jArr = this.f19831i0.f21009a;
                            if (i19 < jArr.length - i12) {
                                long j3 = jArr[i19];
                                long j10 = jArr[c11];
                                long j11 = jArr[jArr.length - i12];
                                i7 = i12;
                                i10 = i14;
                                float f15 = ((((float) (j3 - j10)) / ((float) (j11 - j10))) * this.H0) - f14;
                                float f16 = f15 - f19804u1;
                                if (f16 > 0.0f) {
                                    float f17 = this.G0;
                                    if (f16 <= f17 + f13) {
                                        float f18 = f19800q1;
                                        int i21 = (f16 > f18 ? 1 : (f16 == f18 ? 0 : -1));
                                        c10 = c11;
                                        TextPaint textPaint = this.Q;
                                        if (i21 < 0) {
                                            textPaint.setAlpha((int) (i10 * f3.y(f18, f16, f18, f11) * this.h * f10));
                                        } else if (f16 > f17) {
                                            textPaint.setAlpha((int) (i10 * f3.y(f16, f17, f13, f11) * this.h * f10));
                                        } else {
                                            textPaint.setAlpha((int) (i10 * this.h * f10));
                                        }
                                        mg.b bVar = this.f19831i0;
                                        String[] strArr = bVar.f21011c;
                                        long[] jArr2 = bVar.f21009a;
                                        canvas.drawText(strArr[(int) ((jArr2[i19] - jArr2[c10]) / bVar.f21017k)], f15, g0.L(3.0f) + (getMeasuredHeight() - this.f19845s) + f19799p1, textPaint);
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
                    this.f19840o0 += i12;
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
        int i7 = this.f19847t0;
        if (i7 >= 0 && this.f19849v0 && (bVar = this.f19831i0) != null) {
            int i10 = (int) (this.f19843r * this.f19851w0);
            float f10 = this.G0;
            j jVar = this.f19829h0;
            float f11 = jVar.f19872l;
            float f12 = jVar.f19871k;
            float f13 = f10 / (f11 - f12);
            float f14 = (f12 * f13) - l1;
            float[] fArr = bVar.f21010b;
            if (i7 < fArr.length) {
                float f15 = (fArr[i7] * f13) - f14;
                Paint paint = this.N;
                paint.setAlpha(i10);
                canvas.drawLine(f15, 0.0f, f15, this.I0.bottom, paint);
                if (this.f19821e) {
                    ArrayList arrayList = this.d;
                    this.f19839n0 = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        this.f19840o0 = i11;
                        int i12 = this.f19840o0;
                        if (i12 < this.f19839n0) {
                            ng.f fVar = (ng.f) arrayList.get(i12);
                            boolean z10 = fVar.f21538n;
                            Paint paint2 = fVar.d;
                            if (z10 || fVar.f21539o != 0.0f) {
                                float f16 = (float) fVar.f21527a.f21002a[this.f19847t0];
                                float f17 = this.f19852x;
                                float measuredHeight = (getMeasuredHeight() - this.f19845s) - (((f16 - f17) / (this.f19850w - f17)) * ((getMeasuredHeight() - this.f19845s) - f19798o1));
                                paint2.setAlpha((int) (fVar.f21539o * 255.0f * this.f19851w0));
                                Paint paint3 = this.T;
                                paint3.setAlpha((int) (fVar.f21539o * 255.0f * this.f19851w0));
                                canvas.drawPoint(f15, measuredHeight, paint2);
                                canvas.drawPoint(f15, measuredHeight, paint3);
                            }
                            i11 = this.f19840o0 + 1;
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
        if (this.f19853x0) {
            super.onDraw(canvas);
            return;
        }
        F();
        int save = canvas.save();
        RectF rectF = this.I0;
        canvas.clipRect(0.0f, rectF.top, getMeasuredWidth(), rectF.bottom);
        i(canvas);
        ArrayList arrayList = this.f19813b;
        this.f19839n0 = arrayList.size();
        int i7 = 0;
        this.f19840o0 = 0;
        while (true) {
            int i10 = this.f19840o0;
            if (i10 >= this.f19839n0) {
                break;
            }
            l(canvas, (ng.d) arrayList.get(i10));
            this.f19840o0++;
        }
        k(canvas);
        while (true) {
            this.f19840o0 = i7;
            int i11 = this.f19840o0;
            if (i11 < this.f19839n0) {
                p(canvas, (ng.d) arrayList.get(i11));
                i7 = this.f19840o0 + 1;
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
        if (!this.J) {
            setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i7));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i7), g0.f24146q.y - g0.L(56.0f));
        }
        int measuredWidth = getMeasuredWidth();
        int i11 = this.Y0;
        int i12 = this.C0;
        if (measuredWidth != i11 || getMeasuredHeight() != this.Z0) {
            this.Y0 = getMeasuredWidth();
            this.Z0 = getMeasuredHeight();
            float f10 = l1;
            float f11 = 2.0f * f10;
            this.f19842q0 = Bitmap.createBitmap((int) (getMeasuredWidth() - f11), i12, Bitmap.Config.ARGB_4444);
            this.f19844r0 = new Canvas(this.f19842q0);
            this.f19810a.d(i12, (int) (getMeasuredWidth() - f11));
            w();
            if (this.f19849v0) {
                x((this.H0 * this.f19829h0.f19871k) - f10);
            }
            A(false, true, false);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int measuredHeight = getMeasuredHeight();
            int i13 = f19801r1;
            this.f19812a1.set(0, measuredHeight - ((i12 + i13) + i13), getMeasuredWidth(), getMeasuredHeight());
            setSystemGestureExclusionRects(this.f19815b1);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        long j3;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean z10 = false;
        if (this.f19831i0 != null) {
            boolean z11 = this.K;
            j jVar = this.f19829h0;
            if (!z11) {
                jVar.c(motionEvent.getActionIndex(), motionEvent);
                getParent().requestDisallowInterceptTouchEvent(false);
                this.f19846s0 = false;
                return false;
            }
            int x10 = (int) motionEvent.getX(motionEvent.getActionIndex());
            int y10 = (int) motionEvent.getY(motionEvent.getActionIndex());
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
                                return jVar.a(x10, y10, motionEvent.getActionIndex());
                            }
                        }
                    } else {
                        int i7 = x10 - this.f19820d1;
                        int i10 = y10 - this.f19823e1;
                        if (jVar.f19874n[0] == null && !jVar.f19865c) {
                            boolean z12 = this.f19846s0;
                            int i11 = this.B0;
                            if (z12) {
                                if ((this.f19832i1 && System.currentTimeMillis() - this.f19830h1 > 200) || Math.abs(i7) > Math.abs(i10) || Math.abs(i10) < i11) {
                                    z10 = true;
                                }
                                this.f19820d1 = x10;
                                this.f19823e1 = y10;
                                getParent().requestDisallowInterceptTouchEvent(z10);
                                C(x10, y10);
                                return true;
                            }
                            if (rectF.contains(this.f19826f1, this.f19828g1)) {
                                int i12 = this.f19826f1 - x10;
                                int i13 = this.f19828g1 - y10;
                                if (Math.sqrt((i13 * i13) + (i12 * i12)) > i11 || System.currentTimeMillis() - this.f19830h1 > 200) {
                                    this.f19846s0 = true;
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
                    if (rectF.contains(this.f19826f1, this.f19828g1) && !this.f19846s0) {
                        c(false);
                    }
                    h[] hVarArr = jVar.f19874n;
                    h hVar = hVarArr[0];
                    if (hVar != null && (valueAnimator2 = hVar.f19860e) != null) {
                        valueAnimator2.cancel();
                    }
                    h hVar2 = hVarArr[1];
                    if (hVar2 != null && (valueAnimator = hVar2.f19860e) != null) {
                        valueAnimator.cancel();
                    }
                    hVarArr[0] = null;
                    hVarArr[1] = null;
                    I();
                    getParent().requestDisallowInterceptTouchEvent(false);
                    this.f19846s0 = false;
                    y();
                    invalidate();
                    if (this.Q0) {
                        j3 = s(this.G, this.H);
                    } else {
                        j3 = 0;
                    }
                    E(r(this.G, this.H), j3, true, true, false);
                    return true;
                }
                return true;
            }
            this.f19830h1 = System.currentTimeMillis();
            getParent().requestDisallowInterceptTouchEvent(true);
            if (!jVar.a(x10, y10, motionEvent.getActionIndex())) {
                this.f19820d1 = x10;
                this.f19826f1 = x10;
                this.f19823e1 = y10;
                this.f19828g1 = y10;
                if (rectF.contains(x10, y10)) {
                    if (this.f19847t0 < 0 || !this.f19834j1) {
                        this.f19846s0 = true;
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
            if (((ng.f) arrayList.get(i11)).f21538n) {
                long U0 = ((ng.f) arrayList.get(i11)).f21527a.f21003b.U0(i7, i10);
                if (U0 > j3) {
                    j3 = U0;
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
            if (((ng.f) arrayList.get(i11)).f21538n) {
                long Z0 = ((ng.f) arrayList.get(i11)).f21527a.f21003b.Z0(i7, i10);
                if (Z0 < j3) {
                    j3 = Z0;
                }
            }
        }
        return j3;
    }

    public void setDateSelectionListener(e eVar) {
        this.R0 = eVar;
    }

    public void setHeader(ng.c cVar) {
        this.f19836k1 = cVar;
    }

    public void setLandscape(boolean z10) {
        this.J = z10;
    }

    public void t() {
        this.M.setStrokeWidth(1.0f);
        this.N.setStrokeWidth(f19797m1);
        TextPaint textPaint = this.O;
        float f10 = n1;
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
        ng.e g10 = g();
        this.f19848u0 = g10;
        g10.setVisibility(8);
        Paint paint2 = this.V;
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
            boolean z10 = fVar.f21538n;
            mg.a aVar = fVar.f21527a;
            if (z10) {
                long j3 = aVar.f21005e;
                if (((float) j3) > this.f19835k0) {
                    this.f19835k0 = (float) j3;
                }
            }
            if (z10) {
                long j10 = aVar.f21006f;
                if (((float) j10) < this.f19837l0) {
                    this.f19837l0 = (float) j10;
                }
            }
            float f10 = this.f19835k0;
            float f11 = this.f19837l0;
            if (f10 == f11) {
                this.f19835k0 = f10 + 1.0f;
                this.f19837l0 = f11 - 1.0f;
            }
        }
    }

    public final void v() {
        int measuredHeight = getMeasuredHeight() - this.f19845s;
        float f10 = this.f19854y;
        if (f10 != 0.0f && measuredHeight != 0) {
            this.F = (f10 / measuredHeight) * n1;
        }
    }

    public final void w() {
        float f10;
        if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            float f11 = l1;
            this.D0 = getMeasuredWidth() - (2.0f * f11);
            this.E0 = f11;
            float measuredWidth = getMeasuredWidth();
            if (this.J) {
                f10 = f19803t1;
            } else {
                f10 = f11;
            }
            float f12 = measuredWidth - f10;
            this.F0 = f12;
            float f13 = f12 - this.E0;
            this.G0 = f13;
            j jVar = this.f19829h0;
            this.H0 = f13 / (jVar.f19872l - jVar.f19871k);
            I();
            this.f19845s = g0.L(100.0f);
            this.I0.set(this.E0 - f11, 0.0f, this.F0 + f11, getMeasuredHeight() - this.f19845s);
            if (this.f19831i0 != null) {
                this.f19841p0 = (int) (g0.L(20.0f) / (this.D0 / this.f19831i0.f21009a.length));
            }
            v();
        }
    }

    public final void x(float f10) {
        int i7;
        float f11;
        mg.b bVar = this.f19831i0;
        if (bVar != null && (i7 = this.f19847t0) >= 0) {
            long[] jArr = bVar.f21009a;
            if (i7 < jArr.length && this.f19849v0) {
                this.f19848u0.c(i7, jArr[i7], this.d, false, bVar.f21016j, bVar.h);
                this.f19848u0.setVisibility(0);
                this.f19848u0.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
                float f12 = (this.f19831i0.f21010b[this.f19847t0] * this.H0) - f10;
                int i10 = (f12 > ((this.E0 + this.G0) / 2.0f) ? 1 : (f12 == ((this.E0 + this.G0) / 2.0f) ? 0 : -1));
                int i11 = f19808y1;
                if (i10 > 0) {
                    f11 = f12 - (this.f19848u0.getWidth() + i11);
                } else {
                    f11 = f12 + i11;
                }
                if (f11 < 0.0f) {
                    f11 = 0.0f;
                } else if (this.f19848u0.getMeasuredWidth() + f11 > getMeasuredWidth()) {
                    f11 = getMeasuredWidth() - this.f19848u0.getMeasuredWidth();
                }
                this.f19848u0.setTranslationX(f11);
            }
        }
    }

    public void z() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3;
        A(true, true, true);
        ArrayList arrayList = this.d;
        this.f19839n0 = arrayList.size();
        int i7 = 0;
        while (true) {
            this.f19840o0 = i7;
            int i10 = this.f19840o0;
            if (i10 >= this.f19839n0) {
                break;
            }
            final ng.f fVar = (ng.f) arrayList.get(i10);
            if (fVar.f21538n && (valueAnimator3 = fVar.f21533i) != null) {
                valueAnimator3.cancel();
            }
            if (!fVar.f21538n && (valueAnimator2 = fVar.h) != null) {
                valueAnimator2.cancel();
            }
            if (fVar.f21538n && fVar.f21539o != 1.0f) {
                ValueAnimator valueAnimator4 = fVar.h;
                if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                    ValueAnimator e10 = e(fVar.f21539o, 1.0f, new ValueAnimator.AnimatorUpdateListener(this) {
                        public final g f19787b;

                        {
                            this.f19787b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                            switch (r3) {
                                case 0:
                                    g gVar = this.f19787b;
                                    gVar.getClass();
                                    fVar.f21539o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    gVar.I = true;
                                    gVar.invalidate();
                                    return;
                                default:
                                    g gVar2 = this.f19787b;
                                    gVar2.getClass();
                                    fVar.f21539o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    gVar2.I = true;
                                    gVar2.invalidate();
                                    return;
                            }
                        }
                    });
                    fVar.h = e10;
                    e10.start();
                } else {
                    i7 = this.f19840o0 + 1;
                }
            }
            if (!fVar.f21538n && fVar.f21539o != 0.0f && ((valueAnimator = fVar.f21533i) == null || !valueAnimator.isRunning())) {
                ValueAnimator e11 = e(fVar.f21539o, 0.0f, new ValueAnimator.AnimatorUpdateListener(this) {
                    public final g f19787b;

                    {
                        this.f19787b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                        switch (r3) {
                            case 0:
                                g gVar = this.f19787b;
                                gVar.getClass();
                                fVar.f21539o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                gVar.I = true;
                                gVar.invalidate();
                                return;
                            default:
                                g gVar2 = this.f19787b;
                                gVar2.getClass();
                                fVar.f21539o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                gVar2.I = true;
                                gVar2.invalidate();
                                return;
                        }
                    }
                });
                fVar.f21533i = e11;
                e11.start();
            }
            i7 = this.f19840o0 + 1;
        }
        K();
        if (this.f19849v0) {
            ng.e eVar = this.f19848u0;
            int i11 = this.f19847t0;
            mg.b bVar = this.f19831i0;
            eVar.c(i11, bVar.f21009a[i11], arrayList, true, bVar.f21016j, bVar.h);
        }
    }

    public void q(ng.j jVar) {
    }

    public void y() {
    }
}
