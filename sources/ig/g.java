package ig;

import ai.x;
import ai.z;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.is;
import org.telegram.ui.gq0;
import org.telegram.ui.ka1;
public abstract class g extends View implements i {
    public static final boolean A1;
    public static final boolean B1;
    public static final u1.a C1;
    public static final float f12140k1 = AndroidUtilities.dpf2(16.0f);
    public static final float l1 = AndroidUtilities.dpf2(1.5f);
    public static final float f12141m1 = AndroidUtilities.dpf2(12.0f);
    public static final int f12142n1 = AndroidUtilities.dp(18.0f);
    public static final int f12143o1 = AndroidUtilities.dp(14.0f);
    public static final int f12144p1 = AndroidUtilities.dp(10.0f);
    public static final int f12145q1 = AndroidUtilities.dp(16.0f);
    public static final int f12146r1 = AndroidUtilities.dp(24.0f);
    public static final int f12147s1 = AndroidUtilities.dp(16.0f);
    public static final int f12148t1 = AndroidUtilities.dp(10.0f);
    public static final int f12149u1 = AndroidUtilities.dp(12.0f);
    public static final int f12150v1 = AndroidUtilities.dp(8.0f);
    public static final int f12151w1 = AndroidUtilities.dp(6.0f);
    public static final int f12152x1 = AndroidUtilities.dp(5.0f);
    public static final int f12153y1 = AndroidUtilities.dp(2.0f);
    public static final int f12154z1 = AndroidUtilities.dp(1.0f);
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
    public final ai.b O0;
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
    public final d6 W0;
    public int X0;
    public int Y0;
    public final Rect Z0;
    public f f12155a;
    public AnimatorSet f12156a0;
    public final ArrayList f12157a1;
    public final ArrayList f12158b;
    public ValueAnimator f12159b0;
    public long f12160b1;
    public final ArrayList f12161c;
    public ValueAnimator f12162c0;
    public int f12163c1;
    public final ArrayList d;
    public Animator f12164d0;
    public int f12165d1;
    public boolean f12166e;
    public ValueAnimator f12167e0;
    public int f12168e1;
    public float f12169f;
    public boolean f12170f0;
    public int f12171f1;
    public final j f12172g0;
    public long f12173g1;
    public float h;
    public jg.b f12174h0;
    public boolean f12175h1;
    public kg.b f12176i0;
    public boolean f12177i1;
    public float f12178j0;
    public kg.c f12179j1;
    public float f12180k0;
    public float f12181l0;
    public int m0;
    public int f12182n;
    public int f12183n0;
    public int f12184o0;
    public Bitmap f12185p0;
    public Canvas f12186q0;
    public int f12187r;
    public boolean f12188r0;
    public int f12189s;
    public int f12190s0;
    public kg.e f12191t0;
    public boolean f12192u0;
    public float v;
    public float f12193v0;
    public float f12194w;
    public boolean f12195w0;
    public float f12196x;
    public boolean f12197x0;
    public float f12198y;
    public int f12199y0;
    public kg.j f12200z0;

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

    public g(Context context, d6 d6Var) {
        super(context);
        this.f12158b = new ArrayList(10);
        this.f12161c = new ArrayList(25);
        this.d = new ArrayList();
        this.f12166e = true;
        this.v = 250.0f;
        this.f12194w = 0.0f;
        this.f12196x = 0.0f;
        this.f12198y = 0.0f;
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
        this.f12170f0 = false;
        ?? obj = new Object();
        obj.h = new Rect();
        obj.f12213i = new Rect();
        obj.f12214j = new Rect();
        obj.f12215k = 0.7f;
        obj.f12216l = 1.0f;
        obj.f12217m = 0.1f;
        obj.f12218n = new h[]{null, null};
        obj.f12207a = this;
        this.f12172g0 = obj;
        this.f12188r0 = false;
        this.f12190s0 = -1;
        this.f12192u0 = false;
        this.f12193v0 = 0.0f;
        this.f12195w0 = false;
        this.f12197x0 = false;
        this.f12199y0 = 0;
        this.B0 = AndroidUtilities.dp(46.0f);
        this.H0 = new RectF();
        this.J0 = new d(this, 0);
        this.K0 = new d(this, 1);
        this.L0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final g f12128b;

            {
                this.f12128b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        g gVar = this.f12128b;
                        gVar.getClass();
                        gVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar.invalidate();
                        return;
                    default:
                        g gVar2 = this.f12128b;
                        gVar2.getClass();
                        gVar2.f12194w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar2.invalidate();
                        return;
                }
            }
        };
        this.M0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final g f12128b;

            {
                this.f12128b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        g gVar = this.f12128b;
                        gVar.getClass();
                        gVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar.invalidate();
                        return;
                    default:
                        g gVar2 = this.f12128b;
                        gVar2.getClass();
                        gVar2.f12194w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar2.invalidate();
                        return;
                }
            }
        };
        this.N0 = new d(this, 2);
        this.O0 = new ai.b(this, 23);
        this.P0 = false;
        this.X0 = 0;
        this.Y0 = 0;
        Rect rect = new Rect();
        this.Z0 = rect;
        ArrayList arrayList = new ArrayList();
        this.f12157a1 = arrayList;
        arrayList.add(rect);
        this.f12160b1 = 0L;
        this.f12177i1 = false;
        this.W0 = d6Var;
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
        long j3;
        if (this.f12174h0 == null) {
            return;
        }
        float f7 = this.F0;
        j jVar = this.f12172g0;
        this.G0 = f7 / (jVar.f12216l - jVar.f12215k);
        H();
        if (this.P0) {
            j3 = s(this.F, this.G);
        } else {
            j3 = 0;
        }
        E(r(this.F, this.G), j3, z10, z11, z12);
        if (this.f12192u0 && !z11) {
            c(false);
            x((this.G0 * jVar.f12215k) - f12140k1);
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
        int i12 = this.f12190s0;
        jg.b bVar = this.f12174h0;
        if (bVar != null) {
            float f7 = this.G0;
            float f10 = (this.f12172g0.f12215k * f7) - f12140k1;
            float f11 = (i10 + f10) / f7;
            if (f11 < 0.0f) {
                this.f12190s0 = 0;
            } else if (f11 > 1.0f) {
                this.f12190s0 = bVar.f14157a.length - 1;
            } else {
                int b10 = bVar.b(f11, this.F, this.G);
                this.f12190s0 = b10;
                int i13 = b10 + 1;
                float[] fArr = this.f12174h0.f14158b;
                if (i13 < fArr.length) {
                    if (Math.abs(this.f12174h0.f14158b[this.f12190s0 + 1] - f11) < Math.abs(fArr[b10] - f11)) {
                        this.f12190s0++;
                    }
                }
            }
            int i14 = this.f12190s0;
            int i15 = this.G;
            if (i14 > i15) {
                this.f12190s0 = i15;
            }
            int i16 = this.f12190s0;
            int i17 = this.F;
            if (i16 < i17) {
                this.f12190s0 = i17;
            }
            if (i12 != this.f12190s0) {
                this.f12192u0 = true;
                c(true);
                x(f10);
                e eVar = this.Q0;
                if (eVar != null) {
                    getSelectedDate();
                    ka1 ka1Var = (ka1) ((gq0) eVar).f38186b;
                    ka1Var.f();
                    ka1Var.f39283b.f12191t0.d(false, false);
                }
                B();
                invalidate();
            }
        }
    }

    public boolean D(jg.b bVar) {
        boolean z10;
        jg.b bVar2 = this.f12174h0;
        long j3 = 0;
        j jVar = this.f12172g0;
        ArrayList arrayList = this.d;
        if (bVar2 != bVar) {
            invalidate();
            arrayList.clear();
            if (bVar != null && bVar.d != null) {
                for (int i10 = 0; i10 < bVar.d.size(); i10++) {
                    arrayList.add(h((jg.a) bVar.d.get(i10)));
                }
            }
            d();
            this.f12174h0 = bVar;
            if (bVar != null) {
                if (bVar.f14157a[0] == 0) {
                    jVar.f12215k = 0.0f;
                    jVar.f12216l = 1.0f;
                } else {
                    float minDistance = getMinDistance();
                    jVar.f12217m = minDistance;
                    float f7 = jVar.f12216l;
                    if (f7 - jVar.f12215k < minDistance) {
                        float f10 = f7 - minDistance;
                        jVar.f12215k = f10;
                        if (f10 < 0.0f) {
                            jVar.f12215k = 0.0f;
                            jVar.f12216l = 1.0f;
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
                j3 = s(this.F, this.G);
            }
            E(r(this.F, this.G), j3, false, false, false);
            this.f12178j0 = 0.0f;
            this.f12180k0 = 2.1474836E9f;
            u();
            int i11 = bVar.f14164j;
            if (i11 != 1 && i11 != 2) {
                this.f12191t0.setSize(arrayList.size());
            } else {
                this.f12191t0.setSize(arrayList.size() * 2);
            }
            this.H = true;
            I();
            return z10;
        }
        jVar.f12215k = 0.7f;
        jVar.f12216l = 1.0f;
        this.f12180k0 = 0.0f;
        this.f12178j0 = 0.0f;
        this.f12158b.clear();
        AnimatorSet animatorSet = this.f12156a0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator valueAnimator = this.f12159b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f12159b0.cancel();
        }
        return z10;
    }

    public final void E(long j3, long j10, boolean z10, boolean z11, boolean z12) {
        long j11;
        float f7;
        boolean z13;
        if (j3 > 100 && ((float) (j3 / 5)) % 10.0f != 0.0f) {
            j11 = ((j3 / 10) + 1) * 10;
        } else {
            j11 = j3;
        }
        if ((Math.abs(((float) (((long) Math.ceil(((float) j11) / 5.0f)) * 5)) - this.f12196x) >= this.E && j3 != 0) || ((float) j3) != this.f12198y) {
            kg.d f10 = f(this.f12174h0.f14163i, j3, j10);
            long[] jArr = f10.f14823a;
            long j12 = jArr[jArr.length - 1];
            long j13 = jArr[0];
            if (!z12) {
                float f11 = this.v - this.f12194w;
                float f12 = (float) (j12 - j13);
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
                if (((float) j12) != this.f12196x) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (this.P0 && ((float) j13) != this.f12198y) {
                    z13 = true;
                }
                if (z13) {
                    AnimatorSet animatorSet = this.f12156a0;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        this.f12156a0.cancel();
                    }
                    this.T0 = this.v;
                    this.U0 = this.f12194w;
                    this.R0 = 0.0f;
                    this.S0 = 0.0f;
                    this.V0 = f7;
                }
            }
            float f14 = (float) j12;
            this.f12196x = f14;
            float f15 = (float) j13;
            this.f12198y = f15;
            v();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f12160b1 < 320 && !z11) {
                return;
            }
            this.f12160b1 = currentTimeMillis;
            ValueAnimator valueAnimator = this.f12159b0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f12159b0.cancel();
            }
            ArrayList arrayList = this.f12158b;
            if (!z10) {
                this.v = f14;
                this.f12194w = f15;
                arrayList.clear();
                arrayList.add(f10);
                f10.f14827f = 255;
                return;
            }
            arrayList.add(f10);
            if (z12) {
                AnimatorSet animatorSet2 = this.f12156a0;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    this.f12156a0.cancel();
                }
                this.V0 = 0.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(e(this.v, f14, this.L0));
                if (this.P0) {
                    animatorSet3.playTogether(e(this.f12194w, f15, this.M0));
                }
                this.f12156a0 = animatorSet3;
                animatorSet3.start();
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                kg.d dVar = (kg.d) arrayList.get(i10);
                if (dVar != f10) {
                    dVar.f14828g = dVar.f14827f;
                }
            }
            ValueAnimator e7 = e(0.0f, 255.0f, new x(3, this, f10));
            this.f12159b0 = e7;
            e7.addListener(new z(6, this, f10));
            this.f12159b0.start();
        }
    }

    public final void F() {
        float f7 = this.V0;
        if (f7 != 0.0f) {
            float f10 = this.v;
            float f11 = this.f12196x;
            if (f10 != f11) {
                float f12 = this.R0 + f7;
                this.R0 = f12;
                if (f12 > 1.0f) {
                    this.R0 = 1.0f;
                    this.v = f11;
                } else {
                    float f13 = this.T0;
                    this.v = (is.f27501g.getInterpolation(f12) * (f11 - f13)) + f13;
                }
                invalidate();
            }
            if (this.P0) {
                float f14 = this.f12194w;
                float f15 = this.f12198y;
                if (f14 != f15) {
                    float f16 = this.S0 + this.V0;
                    this.S0 = f16;
                    if (f16 > 1.0f) {
                        this.S0 = 1.0f;
                        this.f12194w = f15;
                    } else {
                        float f17 = this.U0;
                        this.f12194w = (is.f27501g.getInterpolation(f16) * (f15 - f17)) + f17;
                    }
                    invalidate();
                }
            }
        }
    }

    public final void G() {
        int i10;
        int i11;
        if (this.f12197x0) {
            i10 = h6.Zi;
        } else {
            i10 = h6.Yi;
        }
        d6 d6Var = this.W0;
        int w02 = h6.w0(i10, d6Var);
        TextPaint textPaint = this.N;
        textPaint.setColor(w02);
        if (this.f12197x0) {
            i11 = h6.Zi;
        } else {
            i11 = h6.Yi;
        }
        this.O.setColor(h6.w0(i11, d6Var));
        int w03 = h6.w0(h6.Yi, d6Var);
        TextPaint textPaint2 = this.P;
        textPaint2.setColor(w03);
        int w04 = h6.w0(h6.aj, d6Var);
        Paint paint = this.L;
        paint.setColor(w04);
        int w05 = h6.w0(h6.bj, d6Var);
        Paint paint2 = this.M;
        paint2.setColor(w05);
        this.Q.setColor(h6.w0(h6.dj, d6Var));
        this.R.setColor(h6.w0(h6.cj, d6Var));
        this.S.setColor(h6.w0(h6.f20822d6, d6Var));
        this.T.setColor(h6.w0(h6.ej, d6Var));
        this.f12191t0.b();
        this.f12182n = paint.getAlpha();
        this.f12187r = paint2.getAlpha();
        this.f12169f = textPaint.getAlpha() / 255.0f;
        this.h = textPaint2.getAlpha() / 255.0f;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((kg.f) obj).a();
        }
        if (this.f12192u0) {
            int i13 = this.f12190s0;
            jg.b bVar = this.f12174h0;
            long[] jArr = bVar.f14157a;
            if (i13 < jArr.length) {
                this.f12191t0.c(i13, jArr[i13], arrayList, false, bVar.f14164j, bVar.h);
            }
        }
        this.H = true;
    }

    public final void H() {
        jg.b bVar = this.f12174h0;
        if (bVar == null) {
            return;
        }
        j jVar = this.f12172g0;
        int c10 = bVar.c(Math.max(jVar.f12215k, 0.0f));
        this.F = c10;
        int a2 = this.f12174h0.a(Math.min(jVar.f12216l, 1.0f), c10);
        this.G = a2;
        int i10 = this.F;
        if (a2 < i10) {
            this.G = i10;
        }
        kg.c cVar = this.f12179j1;
        if (cVar != null) {
            long[] jArr = this.f12174h0.f14157a;
            cVar.b(jArr[i10], jArr[this.G]);
        }
        I();
    }

    public final void I() {
        jg.b bVar = this.f12174h0;
        if (bVar != null) {
            float f7 = this.F0;
            if (f7 != 0.0f) {
                int i10 = (int) ((f7 / (this.G0 * bVar.f14162g)) / 6.0f);
                kg.b bVar2 = this.f12176i0;
                if (bVar2 == null || i10 >= bVar2.f14813b || i10 <= bVar2.f14814c) {
                    int highestOneBit = Integer.highestOneBit(i10) << 1;
                    kg.b bVar3 = this.f12176i0;
                    if (bVar3 == null || bVar3.f14812a != highestOneBit) {
                        ValueAnimator valueAnimator = this.f12162c0;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllListeners();
                            this.f12162c0.cancel();
                        }
                        double d = highestOneBit;
                        double d10 = 0.2d * d;
                        kg.b bVar4 = new kg.b(highestOneBit, (int) (d + d10), (int) (d - d10));
                        bVar4.d = 255;
                        kg.b bVar5 = this.f12176i0;
                        ArrayList arrayList = this.f12161c;
                        if (bVar5 == null) {
                            this.f12176i0 = bVar4;
                            bVar4.d = 255;
                            arrayList.add(bVar4);
                            return;
                        }
                        this.f12176i0 = bVar4;
                        this.m0 = arrayList.size();
                        for (int i11 = 0; i11 < this.m0; i11++) {
                            kg.b bVar6 = (kg.b) arrayList.get(i11);
                            bVar6.f14815e = bVar6.d;
                        }
                        arrayList.add(bVar4);
                        if (arrayList.size() > 2) {
                            arrayList.remove(0);
                        }
                        ValueAnimator duration = e(0.0f, 1.0f, new x(4, this, bVar4)).setDuration(200L);
                        this.f12162c0 = duration;
                        duration.addListener(new z(7, this, bVar4));
                        this.f12162c0.start();
                    }
                }
            }
        }
    }

    public void J(jg.b bVar, long j3) {
        int length = bVar.f14157a.length;
        long j10 = j3 - (j3 % 86400000);
        long j11 = 86399999 + j10;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            long j12 = bVar.f14157a[i12];
            if (j10 > j12) {
                i10 = i12;
            }
            if (j11 > j12) {
                i11 = i12;
            }
        }
        float[] fArr = bVar.f14158b;
        float f7 = fArr[i10];
        j jVar = this.f12172g0;
        jVar.f12215k = f7;
        jVar.f12216l = fArr[i11];
    }

    public void K() {
        if (B1) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j3 = Long.MAX_VALUE;
            int i10 = 0;
            long j10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                kg.f fVar = (kg.f) obj;
                boolean z10 = fVar.f14851n;
                jg.a aVar = fVar.f14840a;
                if (z10) {
                    long j11 = aVar.f14153e;
                    if (j11 > j10) {
                        j10 = j11;
                    }
                }
                if (z10) {
                    long j12 = aVar.f14154f;
                    if (j12 < j3) {
                        j3 = j12;
                    }
                }
            }
            if ((j3 != 2147483647L && ((float) j3) != 0.0f) || (j10 > 0 && ((float) j10) != this.f12181l0)) {
                this.f12181l0 = (float) j10;
                Animator animator = this.f12164d0;
                if (animator != null) {
                    animator.cancel();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(e(this.f12178j0, this.f12181l0, this.J0), e(this.f12180k0, 0.0f, this.K0));
                this.f12164d0 = animatorSet;
                animatorSet.start();
            }
        }
    }

    @Override
    public void a(float f7, float f10, boolean z10) {
        jg.b bVar = this.f12174h0;
        if (bVar == null) {
            return;
        }
        if (z10) {
            int c10 = bVar.c(Math.max(f7, 0.0f));
            int a2 = this.f12174h0.a(Math.min(f10, 1.0f), c10);
            E(r(c10, a2), s(c10, a2), true, true, false);
            c(false);
            return;
        }
        H();
        invalidate();
    }

    public final void c(boolean z10) {
        float f7;
        x((this.G0 * this.f12172g0.f12215k) - f12140k1);
        if (this.f12177i1 == z10) {
            return;
        }
        this.f12177i1 = z10;
        ValueAnimator valueAnimator = this.f12167e0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f12167e0.cancel();
        }
        float f10 = this.f12193v0;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator duration = e(f10, f7, this.N0).setDuration(200L);
        this.f12167e0 = duration;
        duration.addListener(this.O0);
        this.f12167e0.start();
    }

    public final void d() {
        this.f12190s0 = -1;
        this.f12192u0 = false;
        this.f12177i1 = false;
        this.f12191t0.setVisibility(8);
        this.f12193v0 = 0.0f;
    }

    public kg.d f(int i10, long j3, long j10) {
        return new kg.d(j3, j10, this.P0, this.f12174h0.h, i10, this.N, this.O);
    }

    public kg.e g() {
        return new kg.e(getContext(), this.W0);
    }

    public long getEndDate() {
        return this.f12174h0.f14157a[this.G];
    }

    public float getMinDistance() {
        jg.b bVar = this.f12174h0;
        if (bVar == null) {
            return 0.1f;
        }
        int length = bVar.f14157a.length;
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
        int i10 = this.f12190s0;
        if (i10 < 0) {
            return -1L;
        }
        return this.f12174h0.f14157a[i10];
    }

    public long getStartDate() {
        return this.f12174h0.f14157a[this.F];
    }

    public abstract kg.f h(jg.a aVar);

    public void i(Canvas canvas) {
        int measuredHeight;
        if (this.f12174h0 != null) {
            int i10 = this.f12199y0;
            float f7 = 1.0f;
            if (i10 == 2) {
                f7 = 1.0f - this.f12200z0.f14861f;
            } else if (i10 == 1) {
                f7 = this.f12200z0.f14861f;
            } else if (i10 == 3) {
                f7 = this.f12200z0.f14861f;
            }
            Paint paint = this.L;
            paint.setAlpha((int) (this.f12182n * f7));
            TextPaint textPaint = this.N;
            textPaint.setAlpha((int) (this.f12169f * 255.0f * f7));
            this.O.setAlpha((int) (this.f12169f * 255.0f * f7));
            int textSize = (int) (f12142n1 - textPaint.getTextSize());
            float measuredHeight2 = (getMeasuredHeight() - this.f12189s) - 1;
            canvas.drawLine(this.D0, measuredHeight2, this.E0, measuredHeight2, paint);
            if (this.P0) {
                return;
            }
            canvas.drawText("0", f12140k1, measuredHeight - textSize, textPaint);
        }
    }

    public void j(Canvas canvas) {
        float f7;
        char c10;
        int i10;
        int i11;
        if (this.f12174h0 != null) {
            ArrayList arrayList = this.f12161c;
            this.m0 = arrayList.size();
            int i12 = this.f12199y0;
            float f10 = 1.0f;
            int i13 = 1;
            if (i12 == 2) {
                f7 = 1.0f - this.f12200z0.f14861f;
            } else if (i12 == 1) {
                f7 = this.f12200z0.f14861f;
            } else if (i12 == 3) {
                f7 = this.f12200z0.f14861f;
            } else {
                f7 = 1.0f;
            }
            char c11 = 0;
            this.f12183n0 = 0;
            while (true) {
                int i14 = this.f12183n0;
                if (i14 < this.m0) {
                    int i15 = ((kg.b) arrayList.get(i14)).d;
                    int i16 = ((kg.b) arrayList.get(this.f12183n0)).f14812a;
                    if (i16 == 0) {
                        i16 = i13;
                    }
                    int i17 = this.F - this.f12184o0;
                    while (i17 % i16 != 0) {
                        i17--;
                    }
                    int i18 = this.G - this.f12184o0;
                    while (true) {
                        if (i18 % i16 == 0 && i18 >= this.f12174h0.f14157a.length - i13) {
                            break;
                        }
                        i18++;
                        i13 = i13;
                        i15 = i15;
                        c11 = c11;
                        f10 = 1.0f;
                    }
                    int i19 = this.f12184o0;
                    int i20 = i17 + i19;
                    int i21 = i18 + i19;
                    float f11 = this.G0 * this.f12172g0.f12215k;
                    float f12 = f12140k1;
                    float f13 = f11 - f12;
                    while (i20 < i21) {
                        if (i20 >= 0) {
                            long[] jArr = this.f12174h0.f14157a;
                            if (i20 < jArr.length - i13) {
                                long j3 = jArr[i20];
                                long j10 = jArr[c11];
                                long j11 = jArr[jArr.length - i13];
                                i10 = i13;
                                i11 = i15;
                                float f14 = ((((float) (j3 - j10)) / ((float) (j11 - j10))) * this.G0) - f13;
                                float f15 = f14 - f12148t1;
                                if (f15 > 0.0f) {
                                    float f16 = this.F0;
                                    if (f15 <= f16 + f12) {
                                        float f17 = f12144p1;
                                        int i22 = (f15 > f17 ? 1 : (f15 == f17 ? 0 : -1));
                                        c10 = c11;
                                        TextPaint textPaint = this.P;
                                        if (i22 < 0) {
                                            textPaint.setAlpha((int) (i11 * org.telegram.messenger.q.x(f17, f15, f17, f10) * this.h * f7));
                                        } else if (f15 > f16) {
                                            textPaint.setAlpha((int) (i11 * org.telegram.messenger.q.x(f15, f16, f12, f10) * this.h * f7));
                                        } else {
                                            textPaint.setAlpha((int) (i11 * this.h * f7));
                                        }
                                        jg.b bVar = this.f12174h0;
                                        String[] strArr = bVar.f14159c;
                                        long[] jArr2 = bVar.f14157a;
                                        canvas.drawText(strArr[(int) ((jArr2[i20] - jArr2[c10]) / bVar.f14165k)], f14, AndroidUtilities.dp(3.0f) + (getMeasuredHeight() - this.f12189s) + f12143o1, textPaint);
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
                    this.f12183n0 += i13;
                    c11 = c11;
                    f10 = 1.0f;
                } else {
                    return;
                }
            }
        }
    }

    public abstract void k(Canvas canvas);

    public void l(android.graphics.Canvas r12, kg.d r13) {
        throw new UnsupportedOperationException("Method not decompiled: ig.g.l(android.graphics.Canvas, kg.d):void");
    }

    public final void m(android.graphics.Canvas r39) {
        throw new UnsupportedOperationException("Method not decompiled: ig.g.m(android.graphics.Canvas):void");
    }

    public abstract void n(Canvas canvas);

    public void o(Canvas canvas) {
        jg.b bVar;
        int i10 = this.f12190s0;
        if (i10 >= 0 && this.f12192u0 && (bVar = this.f12174h0) != null) {
            int i11 = (int) (this.f12187r * this.f12193v0);
            float f7 = this.F0;
            j jVar = this.f12172g0;
            float f10 = jVar.f12216l;
            float f11 = jVar.f12215k;
            float f12 = f7 / (f10 - f11);
            float f13 = (f11 * f12) - f12140k1;
            float[] fArr = bVar.f14158b;
            if (i10 < fArr.length) {
                float f14 = (fArr[i10] * f12) - f13;
                Paint paint = this.M;
                paint.setAlpha(i11);
                canvas.drawLine(f14, 0.0f, f14, this.H0.bottom, paint);
                if (this.f12166e) {
                    ArrayList arrayList = this.d;
                    this.m0 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        this.f12183n0 = i12;
                        int i13 = this.f12183n0;
                        if (i13 < this.m0) {
                            kg.f fVar = (kg.f) arrayList.get(i13);
                            boolean z10 = fVar.f14851n;
                            Paint paint2 = fVar.d;
                            if (z10 || fVar.f14852o != 0.0f) {
                                float f15 = (float) fVar.f14840a.f14150a[this.f12190s0];
                                float f16 = this.f12194w;
                                float measuredHeight = (getMeasuredHeight() - this.f12189s) - (((f15 - f16) / (this.v - f16)) * ((getMeasuredHeight() - this.f12189s) - f12142n1));
                                paint2.setAlpha((int) (fVar.f14852o * 255.0f * this.f12193v0));
                                Paint paint3 = this.S;
                                paint3.setAlpha((int) (fVar.f14852o * 255.0f * this.f12193v0));
                                canvas.drawPoint(f14, measuredHeight, paint2);
                                canvas.drawPoint(f14, measuredHeight, paint3);
                            }
                            i12 = this.f12183n0 + 1;
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
        if (this.f12195w0) {
            super.onDraw(canvas);
            return;
        }
        F();
        int save = canvas.save();
        RectF rectF = this.H0;
        canvas.clipRect(0.0f, rectF.top, getMeasuredWidth(), rectF.bottom);
        i(canvas);
        ArrayList arrayList = this.f12158b;
        this.m0 = arrayList.size();
        int i10 = 0;
        this.f12183n0 = 0;
        while (true) {
            int i11 = this.f12183n0;
            if (i11 >= this.m0) {
                break;
            }
            l(canvas, (kg.d) arrayList.get(i11));
            this.f12183n0++;
        }
        k(canvas);
        while (true) {
            this.f12183n0 = i10;
            int i12 = this.f12183n0;
            if (i12 < this.m0) {
                p(canvas, (kg.d) arrayList.get(i12));
                i10 = this.f12183n0 + 1;
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
            float f7 = f12140k1;
            float f10 = 2.0f * f7;
            this.f12185p0 = Bitmap.createBitmap((int) (getMeasuredWidth() - f10), i13, Bitmap.Config.ARGB_4444);
            this.f12186q0 = new Canvas(this.f12185p0);
            this.f12155a.a(i13, (int) (getMeasuredWidth() - f10));
            w();
            if (this.f12192u0) {
                x((this.G0 * this.f12172g0.f12215k) - f7);
            }
            A(false, true, false);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int measuredHeight = getMeasuredHeight();
            int i14 = f12145q1;
            this.Z0.set(0, measuredHeight - ((i13 + i14) + i14), getMeasuredWidth(), getMeasuredHeight());
            setSystemGestureExclusionRects(this.f12157a1);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        long j3;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean z10 = false;
        if (this.f12174h0 != null) {
            boolean z11 = this.J;
            j jVar = this.f12172g0;
            if (!z11) {
                jVar.c(motionEvent.getActionIndex(), motionEvent);
                getParent().requestDisallowInterceptTouchEvent(false);
                this.f12188r0 = false;
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
                                    jVar.c(motionEvent.getActionIndex(), motionEvent);
                                    return true;
                                }
                            } else {
                                return jVar.a(x10, y3, motionEvent.getActionIndex());
                            }
                        }
                    } else {
                        int i10 = x10 - this.f12163c1;
                        int i11 = y3 - this.f12165d1;
                        if (jVar.f12218n[0] == null && !jVar.f12209c) {
                            boolean z12 = this.f12188r0;
                            int i12 = this.A0;
                            if (z12) {
                                if ((this.f12175h1 && System.currentTimeMillis() - this.f12173g1 > 200) || Math.abs(i10) > Math.abs(i11) || Math.abs(i11) < i12) {
                                    z10 = true;
                                }
                                this.f12163c1 = x10;
                                this.f12165d1 = y3;
                                getParent().requestDisallowInterceptTouchEvent(z10);
                                C(x10, y3);
                                return true;
                            }
                            if (rectF.contains(this.f12168e1, this.f12171f1)) {
                                int i13 = this.f12168e1 - x10;
                                int i14 = this.f12171f1 - y3;
                                if (Math.sqrt((i14 * i14) + (i13 * i13)) > i12 || System.currentTimeMillis() - this.f12173g1 > 200) {
                                    this.f12188r0 = true;
                                    C(x10, y3);
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
                    if (rectF.contains(this.f12168e1, this.f12171f1) && !this.f12188r0) {
                        c(false);
                    }
                    h[] hVarArr = jVar.f12218n;
                    h hVar = hVarArr[0];
                    if (hVar != null && (valueAnimator2 = hVar.f12204e) != null) {
                        valueAnimator2.cancel();
                    }
                    h hVar2 = hVarArr[1];
                    if (hVar2 != null && (valueAnimator = hVar2.f12204e) != null) {
                        valueAnimator.cancel();
                    }
                    hVarArr[0] = null;
                    hVarArr[1] = null;
                    I();
                    getParent().requestDisallowInterceptTouchEvent(false);
                    this.f12188r0 = false;
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
            this.f12173g1 = System.currentTimeMillis();
            getParent().requestDisallowInterceptTouchEvent(true);
            if (!jVar.a(x10, y3, motionEvent.getActionIndex())) {
                this.f12163c1 = x10;
                this.f12168e1 = x10;
                this.f12165d1 = y3;
                this.f12171f1 = y3;
                if (rectF.contains(x10, y3)) {
                    if (this.f12190s0 < 0 || !this.f12177i1) {
                        this.f12188r0 = true;
                        C(x10, y3);
                        return true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public void p(android.graphics.Canvas r14, kg.d r15) {
        throw new UnsupportedOperationException("Method not decompiled: ig.g.p(android.graphics.Canvas, kg.d):void");
    }

    public long r(int i10, int i11) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        long j3 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            if (((kg.f) arrayList.get(i12)).f14851n) {
                long rMaxQ = ((kg.f) arrayList.get(i12)).f14840a.f14151b.rMaxQ(i10, i11);
                if (rMaxQ > j3) {
                    j3 = rMaxQ;
                }
            }
        }
        return j3;
    }

    public long s(int i10, int i11) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        long j3 = Long.MAX_VALUE;
        for (int i12 = 0; i12 < size; i12++) {
            if (((kg.f) arrayList.get(i12)).f14851n) {
                long rMinQ = ((kg.f) arrayList.get(i12)).f14840a.f14151b.rMinQ(i10, i11);
                if (rMinQ < j3) {
                    j3 = rMinQ;
                }
            }
        }
        return j3;
    }

    public void setDateSelectionListener(e eVar) {
        this.Q0 = eVar;
    }

    public void setHeader(kg.c cVar) {
        this.f12179j1 = cVar;
    }

    public void setLandscape(boolean z10) {
        this.I = z10;
    }

    public void t() {
        this.L.setStrokeWidth(1.0f);
        this.M.setStrokeWidth(l1);
        TextPaint textPaint = this.N;
        float f7 = f12141m1;
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
        kg.e g10 = g();
        this.f12191t0 = g10;
        g10.setVisibility(8);
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
            kg.f fVar = (kg.f) obj;
            boolean z10 = fVar.f14851n;
            jg.a aVar = fVar.f14840a;
            if (z10) {
                long j3 = aVar.f14153e;
                if (((float) j3) > this.f12178j0) {
                    this.f12178j0 = (float) j3;
                }
            }
            if (z10) {
                long j10 = aVar.f14154f;
                if (((float) j10) < this.f12180k0) {
                    this.f12180k0 = (float) j10;
                }
            }
            float f7 = this.f12178j0;
            float f10 = this.f12180k0;
            if (f7 == f10) {
                this.f12178j0 = f7 + 1.0f;
                this.f12180k0 = f10 - 1.0f;
            }
        }
    }

    public final void v() {
        int measuredHeight = getMeasuredHeight() - this.f12189s;
        float f7 = this.f12196x;
        if (f7 != 0.0f && measuredHeight != 0) {
            this.E = (f7 / measuredHeight) * f12141m1;
        }
    }

    public final void w() {
        float f7;
        if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            float f10 = f12140k1;
            this.C0 = getMeasuredWidth() - (2.0f * f10);
            this.D0 = f10;
            float measuredWidth = getMeasuredWidth();
            if (this.I) {
                f7 = f12147s1;
            } else {
                f7 = f10;
            }
            float f11 = measuredWidth - f7;
            this.E0 = f11;
            float f12 = f11 - this.D0;
            this.F0 = f12;
            j jVar = this.f12172g0;
            this.G0 = f12 / (jVar.f12216l - jVar.f12215k);
            I();
            this.f12189s = AndroidUtilities.dp(100.0f);
            this.H0.set(this.D0 - f10, 0.0f, this.E0 + f10, getMeasuredHeight() - this.f12189s);
            if (this.f12174h0 != null) {
                this.f12184o0 = (int) (AndroidUtilities.dp(20.0f) / (this.C0 / this.f12174h0.f14157a.length));
            }
            v();
        }
    }

    public final void x(float f7) {
        int i10;
        float f10;
        jg.b bVar = this.f12174h0;
        if (bVar != null && (i10 = this.f12190s0) >= 0) {
            long[] jArr = bVar.f14157a;
            if (i10 < jArr.length && this.f12192u0) {
                this.f12191t0.c(i10, jArr[i10], this.d, false, bVar.f14164j, bVar.h);
                this.f12191t0.setVisibility(0);
                this.f12191t0.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
                float f11 = (this.f12174h0.f14158b[this.f12190s0] * this.G0) - f7;
                int i11 = (f11 > ((this.D0 + this.F0) / 2.0f) ? 1 : (f11 == ((this.D0 + this.F0) / 2.0f) ? 0 : -1));
                int i12 = f12152x1;
                if (i11 > 0) {
                    f10 = f11 - (this.f12191t0.getWidth() + i12);
                } else {
                    f10 = f11 + i12;
                }
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                } else if (this.f12191t0.getMeasuredWidth() + f10 > getMeasuredWidth()) {
                    f10 = getMeasuredWidth() - this.f12191t0.getMeasuredWidth();
                }
                this.f12191t0.setTranslationX(f10);
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
            this.f12183n0 = i10;
            int i11 = this.f12183n0;
            if (i11 >= this.m0) {
                break;
            }
            final kg.f fVar = (kg.f) arrayList.get(i11);
            if (fVar.f14851n && (valueAnimator3 = fVar.f14846i) != null) {
                valueAnimator3.cancel();
            }
            if (!fVar.f14851n && (valueAnimator2 = fVar.h) != null) {
                valueAnimator2.cancel();
            }
            if (fVar.f14851n && fVar.f14852o != 1.0f) {
                ValueAnimator valueAnimator4 = fVar.h;
                if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                    ValueAnimator e7 = e(fVar.f14852o, 1.0f, new ValueAnimator.AnimatorUpdateListener(this) {
                        public final g f12130b;

                        {
                            this.f12130b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                            switch (r3) {
                                case 0:
                                    g gVar = this.f12130b;
                                    gVar.getClass();
                                    fVar.f14852o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    gVar.H = true;
                                    gVar.invalidate();
                                    return;
                                default:
                                    g gVar2 = this.f12130b;
                                    gVar2.getClass();
                                    fVar.f14852o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    gVar2.H = true;
                                    gVar2.invalidate();
                                    return;
                            }
                        }
                    });
                    fVar.h = e7;
                    e7.start();
                } else {
                    i10 = this.f12183n0 + 1;
                }
            }
            if (!fVar.f14851n && fVar.f14852o != 0.0f && ((valueAnimator = fVar.f14846i) == null || !valueAnimator.isRunning())) {
                ValueAnimator e10 = e(fVar.f14852o, 0.0f, new ValueAnimator.AnimatorUpdateListener(this) {
                    public final g f12130b;

                    {
                        this.f12130b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                        switch (r3) {
                            case 0:
                                g gVar = this.f12130b;
                                gVar.getClass();
                                fVar.f14852o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                gVar.H = true;
                                gVar.invalidate();
                                return;
                            default:
                                g gVar2 = this.f12130b;
                                gVar2.getClass();
                                fVar.f14852o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                gVar2.H = true;
                                gVar2.invalidate();
                                return;
                        }
                    }
                });
                fVar.f14846i = e10;
                e10.start();
            }
            i10 = this.f12183n0 + 1;
        }
        K();
        if (this.f12192u0) {
            kg.e eVar = this.f12191t0;
            int i12 = this.f12190s0;
            jg.b bVar = this.f12174h0;
            eVar.c(i12, bVar.f14157a[i12], arrayList, true, bVar.f14164j, bVar.h);
        }
    }

    public void q(kg.j jVar) {
    }

    public void y() {
    }
}
