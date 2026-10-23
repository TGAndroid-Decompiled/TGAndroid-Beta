package jg;

import ah.l0;
import ai.ne;
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
import org.telegram.messenger.v0;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.e91;
import org.telegram.ui.sp0;
public abstract class g extends View implements i {
    public static final boolean A1;
    public static final boolean B1;
    public static final u1.a C1;
    public static final float f14475k1 = AndroidUtilities.dpf2(16.0f);
    public static final float l1 = AndroidUtilities.dpf2(1.5f);
    public static final float f14476m1 = AndroidUtilities.dpf2(12.0f);
    public static final int f14477n1 = AndroidUtilities.dp(18.0f);
    public static final int f14478o1 = AndroidUtilities.dp(14.0f);
    public static final int f14479p1 = AndroidUtilities.dp(10.0f);
    public static final int f14480q1 = AndroidUtilities.dp(16.0f);
    public static final int f14481r1 = AndroidUtilities.dp(24.0f);
    public static final int f14482s1 = AndroidUtilities.dp(16.0f);
    public static final int f14483t1 = AndroidUtilities.dp(10.0f);
    public static final int f14484u1 = AndroidUtilities.dp(12.0f);
    public static final int f14485v1 = AndroidUtilities.dp(8.0f);
    public static final int f14486w1 = AndroidUtilities.dp(6.0f);
    public static final int f14487x1 = AndroidUtilities.dp(5.0f);
    public static final int f14488y1 = AndroidUtilities.dp(2.0f);
    public static final int f14489z1 = AndroidUtilities.dp(1.0f);
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
    public final ah.b O0;
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
    public final g6 W0;
    public int X0;
    public int Y0;
    public final Rect Z0;
    public f f14490a;
    public AnimatorSet f14491a0;
    public final ArrayList f14492a1;
    public final ArrayList f14493b;
    public ValueAnimator f14494b0;
    public long f14495b1;
    public final ArrayList f14496c;
    public ValueAnimator f14497c0;
    public int f14498c1;
    public final ArrayList d;
    public Animator f14499d0;
    public int f14500d1;
    public boolean e;
    public ValueAnimator f14501e0;
    public int f14502e1;
    public float f14503f;
    public boolean f14504f0;
    public int f14505f1;
    public final j f14506g0;
    public long f14507g1;
    public float h;
    public kg.b f14508h0;
    public boolean f14509h1;
    public lg.b f14510i0;
    public boolean f14511i1;
    public float f14512j0;
    public lg.c f14513j1;
    public float f14514k0;
    public float f14515l0;
    public int m0;
    public int f14516n;
    public int f14517n0;
    public int f14518o0;
    public Bitmap f14519p0;
    public Canvas f14520q0;
    public int f14521r;
    public boolean f14522r0;
    public int f14523s;
    public int f14524s0;
    public lg.e f14525t0;
    public boolean f14526u0;
    public float v;
    public float f14527v0;
    public float f14528w;
    public boolean f14529w0;
    public float f14530x;
    public boolean f14531x0;
    public float f14532y;
    public int f14533y0;
    public lg.j f14534z0;

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

    public g(Context context, g6 g6Var) {
        super(context);
        this.f14493b = new ArrayList(10);
        this.f14496c = new ArrayList(25);
        this.d = new ArrayList();
        this.e = true;
        this.v = 250.0f;
        this.f14528w = 0.0f;
        this.f14530x = 0.0f;
        this.f14532y = 0.0f;
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
        this.f14504f0 = false;
        ?? obj = new Object();
        obj.h = new Rect();
        obj.f14545i = new Rect();
        obj.f14546j = new Rect();
        obj.f14547k = 0.7f;
        obj.f14548l = 1.0f;
        obj.f14549m = 0.1f;
        obj.f14550n = new h[]{null, null};
        obj.f14540a = this;
        this.f14506g0 = obj;
        this.f14522r0 = false;
        this.f14524s0 = -1;
        this.f14526u0 = false;
        this.f14527v0 = 0.0f;
        this.f14529w0 = false;
        this.f14531x0 = false;
        this.f14533y0 = 0;
        this.B0 = AndroidUtilities.dp(46.0f);
        this.H0 = new RectF();
        this.J0 = new d(this, 0);
        this.K0 = new d(this, 1);
        this.L0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final g f14464b;

            {
                this.f14464b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        g gVar = this.f14464b;
                        gVar.getClass();
                        gVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar.invalidate();
                        return;
                    default:
                        g gVar2 = this.f14464b;
                        gVar2.getClass();
                        gVar2.f14528w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar2.invalidate();
                        return;
                }
            }
        };
        this.M0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final g f14464b;

            {
                this.f14464b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        g gVar = this.f14464b;
                        gVar.getClass();
                        gVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar.invalidate();
                        return;
                    default:
                        g gVar2 = this.f14464b;
                        gVar2.getClass();
                        gVar2.f14528w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar2.invalidate();
                        return;
                }
            }
        };
        this.N0 = new d(this, 2);
        this.O0 = new ah.b(this, 28);
        this.P0 = false;
        this.X0 = 0;
        this.Y0 = 0;
        Rect rect = new Rect();
        this.Z0 = rect;
        ArrayList arrayList = new ArrayList();
        this.f14492a1 = arrayList;
        arrayList.add(rect);
        this.f14495b1 = 0L;
        this.f14511i1 = false;
        this.W0 = g6Var;
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
        if (this.f14508h0 == null) {
            return;
        }
        float f7 = this.F0;
        j jVar = this.f14506g0;
        this.G0 = f7 / (jVar.f14548l - jVar.f14547k);
        H();
        if (this.P0) {
            j10 = s(this.F, this.G);
        } else {
            j10 = 0;
        }
        E(r(this.F, this.G), j10, z10, z11, z12);
        if (this.f14526u0 && !z11) {
            c(false);
            x((this.G0 * jVar.f14547k) - f14475k1);
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
        int i12 = this.f14524s0;
        kg.b bVar = this.f14508h0;
        if (bVar != null) {
            float f7 = this.G0;
            float f10 = (this.f14506g0.f14547k * f7) - f14475k1;
            float f11 = (i10 + f10) / f7;
            if (f11 < 0.0f) {
                this.f14524s0 = 0;
            } else if (f11 > 1.0f) {
                this.f14524s0 = bVar.f15098a.length - 1;
            } else {
                int b10 = bVar.b(f11, this.F, this.G);
                this.f14524s0 = b10;
                int i13 = b10 + 1;
                float[] fArr = this.f14508h0.f15099b;
                if (i13 < fArr.length) {
                    if (Math.abs(this.f14508h0.f15099b[this.f14524s0 + 1] - f11) < Math.abs(fArr[b10] - f11)) {
                        this.f14524s0++;
                    }
                }
            }
            int i14 = this.f14524s0;
            int i15 = this.G;
            if (i14 > i15) {
                this.f14524s0 = i15;
            }
            int i16 = this.f14524s0;
            int i17 = this.F;
            if (i16 < i17) {
                this.f14524s0 = i17;
            }
            if (i12 != this.f14524s0) {
                this.f14526u0 = true;
                c(true);
                x(f10);
                e eVar = this.Q0;
                if (eVar != null) {
                    getSelectedDate();
                    e91 e91Var = (e91) ((sp0) eVar).f41783b;
                    e91Var.f();
                    e91Var.f36879b.f14525t0.d(false, false);
                }
                B();
                invalidate();
            }
        }
    }

    public boolean D(kg.b bVar) {
        boolean z10;
        kg.b bVar2 = this.f14508h0;
        long j10 = 0;
        j jVar = this.f14506g0;
        ArrayList arrayList = this.d;
        if (bVar2 != bVar) {
            invalidate();
            arrayList.clear();
            if (bVar != null && bVar.d != null) {
                for (int i10 = 0; i10 < bVar.d.size(); i10++) {
                    arrayList.add(h((kg.a) bVar.d.get(i10)));
                }
            }
            d();
            this.f14508h0 = bVar;
            if (bVar != null) {
                if (bVar.f15098a[0] == 0) {
                    jVar.f14547k = 0.0f;
                    jVar.f14548l = 1.0f;
                } else {
                    float minDistance = getMinDistance();
                    jVar.f14549m = minDistance;
                    float f7 = jVar.f14548l;
                    if (f7 - jVar.f14547k < minDistance) {
                        float f10 = f7 - minDistance;
                        jVar.f14547k = f10;
                        if (f10 < 0.0f) {
                            jVar.f14547k = 0.0f;
                            jVar.f14548l = 1.0f;
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
            this.f14512j0 = 0.0f;
            this.f14514k0 = 2.1474836E9f;
            u();
            int i11 = bVar.f15104j;
            if (i11 != 1 && i11 != 2) {
                this.f14525t0.setSize(arrayList.size());
            } else {
                this.f14525t0.setSize(arrayList.size() * 2);
            }
            this.H = true;
            I();
            return z10;
        }
        jVar.f14547k = 0.7f;
        jVar.f14548l = 1.0f;
        this.f14514k0 = 0.0f;
        this.f14512j0 = 0.0f;
        this.f14493b.clear();
        AnimatorSet animatorSet = this.f14491a0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator valueAnimator = this.f14494b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f14494b0.cancel();
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
        if ((Math.abs(((float) (((long) Math.ceil(((float) j12) / 5.0f)) * 5)) - this.f14530x) >= this.E && j10 != 0) || ((float) j10) != this.f14532y) {
            lg.d f10 = f(this.f14508h0.f15103i, j10, j11);
            long[] jArr = f10.f16101a;
            long j13 = jArr[jArr.length - 1];
            long j14 = jArr[0];
            if (!z12) {
                float f11 = this.v - this.f14528w;
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
                if (((float) j13) != this.f14530x) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (this.P0 && ((float) j14) != this.f14532y) {
                    z13 = true;
                }
                if (z13) {
                    AnimatorSet animatorSet = this.f14491a0;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        this.f14491a0.cancel();
                    }
                    this.T0 = this.v;
                    this.U0 = this.f14528w;
                    this.R0 = 0.0f;
                    this.S0 = 0.0f;
                    this.V0 = f7;
                }
            }
            float f14 = (float) j13;
            this.f14530x = f14;
            float f15 = (float) j14;
            this.f14532y = f15;
            v();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f14495b1 < 320 && !z11) {
                return;
            }
            this.f14495b1 = currentTimeMillis;
            ValueAnimator valueAnimator = this.f14494b0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f14494b0.cancel();
            }
            ArrayList arrayList = this.f14493b;
            if (!z10) {
                this.v = f14;
                this.f14528w = f15;
                arrayList.clear();
                arrayList.add(f10);
                f10.f16104f = 255;
                return;
            }
            arrayList.add(f10);
            if (z12) {
                AnimatorSet animatorSet2 = this.f14491a0;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    this.f14491a0.cancel();
                }
                this.V0 = 0.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(e(this.v, f14, this.L0));
                if (this.P0) {
                    animatorSet3.playTogether(e(this.f14528w, f15, this.M0));
                }
                this.f14491a0 = animatorSet3;
                animatorSet3.start();
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                lg.d dVar = (lg.d) arrayList.get(i10);
                if (dVar != f10) {
                    dVar.f16105g = dVar.f16104f;
                }
            }
            ValueAnimator e = e(0.0f, 255.0f, new l0(5, this, f10));
            this.f14494b0 = e;
            e.addListener(new ne(7, this, f10));
            this.f14494b0.start();
        }
    }

    public final void F() {
        float f7 = this.V0;
        if (f7 != 0.0f) {
            float f10 = this.v;
            float f11 = this.f14530x;
            if (f10 != f11) {
                float f12 = this.R0 + f7;
                this.R0 = f12;
                if (f12 > 1.0f) {
                    this.R0 = 1.0f;
                    this.v = f11;
                } else {
                    float f13 = this.T0;
                    this.v = (bs.f25134g.getInterpolation(f12) * (f11 - f13)) + f13;
                }
                invalidate();
            }
            if (this.P0) {
                float f14 = this.f14528w;
                float f15 = this.f14532y;
                if (f14 != f15) {
                    float f16 = this.S0 + this.V0;
                    this.S0 = f16;
                    if (f16 > 1.0f) {
                        this.S0 = 1.0f;
                        this.f14528w = f15;
                    } else {
                        float f17 = this.U0;
                        this.f14528w = (bs.f25134g.getInterpolation(f16) * (f15 - f17)) + f17;
                    }
                    invalidate();
                }
            }
        }
    }

    public final void G() {
        int i10;
        int i11;
        if (this.f14531x0) {
            i10 = k6.Zi;
        } else {
            i10 = k6.Yi;
        }
        g6 g6Var = this.W0;
        int w02 = k6.w0(i10, g6Var);
        TextPaint textPaint = this.N;
        textPaint.setColor(w02);
        if (this.f14531x0) {
            i11 = k6.Zi;
        } else {
            i11 = k6.Yi;
        }
        this.O.setColor(k6.w0(i11, g6Var));
        int w03 = k6.w0(k6.Yi, g6Var);
        TextPaint textPaint2 = this.P;
        textPaint2.setColor(w03);
        int w04 = k6.w0(k6.aj, g6Var);
        Paint paint = this.L;
        paint.setColor(w04);
        int w05 = k6.w0(k6.bj, g6Var);
        Paint paint2 = this.M;
        paint2.setColor(w05);
        this.Q.setColor(k6.w0(k6.dj, g6Var));
        this.R.setColor(k6.w0(k6.cj, g6Var));
        this.S.setColor(k6.w0(k6.f21183d6, g6Var));
        this.T.setColor(k6.w0(k6.ej, g6Var));
        this.f14525t0.b();
        this.f14516n = paint.getAlpha();
        this.f14521r = paint2.getAlpha();
        this.f14503f = textPaint.getAlpha() / 255.0f;
        this.h = textPaint2.getAlpha() / 255.0f;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((lg.f) obj).a();
        }
        if (this.f14526u0) {
            int i13 = this.f14524s0;
            kg.b bVar = this.f14508h0;
            long[] jArr = bVar.f15098a;
            if (i13 < jArr.length) {
                this.f14525t0.c(i13, jArr[i13], arrayList, false, bVar.f15104j, bVar.h);
            }
        }
        this.H = true;
    }

    public final void H() {
        kg.b bVar = this.f14508h0;
        if (bVar == null) {
            return;
        }
        j jVar = this.f14506g0;
        int c10 = bVar.c(Math.max(jVar.f14547k, 0.0f));
        this.F = c10;
        int a2 = this.f14508h0.a(Math.min(jVar.f14548l, 1.0f), c10);
        this.G = a2;
        int i10 = this.F;
        if (a2 < i10) {
            this.G = i10;
        }
        lg.c cVar = this.f14513j1;
        if (cVar != null) {
            long[] jArr = this.f14508h0.f15098a;
            cVar.b(jArr[i10], jArr[this.G]);
        }
        I();
    }

    public final void I() {
        kg.b bVar = this.f14508h0;
        if (bVar != null) {
            float f7 = this.F0;
            if (f7 != 0.0f) {
                int i10 = (int) ((f7 / (this.G0 * bVar.f15102g)) / 6.0f);
                lg.b bVar2 = this.f14510i0;
                if (bVar2 == null || i10 >= bVar2.f16093b || i10 <= bVar2.f16094c) {
                    int highestOneBit = Integer.highestOneBit(i10) << 1;
                    lg.b bVar3 = this.f14510i0;
                    if (bVar3 == null || bVar3.f16092a != highestOneBit) {
                        ValueAnimator valueAnimator = this.f14497c0;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllListeners();
                            this.f14497c0.cancel();
                        }
                        double d = highestOneBit;
                        double d10 = 0.2d * d;
                        lg.b bVar4 = new lg.b(highestOneBit, (int) (d + d10), (int) (d - d10));
                        bVar4.d = 255;
                        lg.b bVar5 = this.f14510i0;
                        ArrayList arrayList = this.f14496c;
                        if (bVar5 == null) {
                            this.f14510i0 = bVar4;
                            bVar4.d = 255;
                            arrayList.add(bVar4);
                            return;
                        }
                        this.f14510i0 = bVar4;
                        this.m0 = arrayList.size();
                        for (int i11 = 0; i11 < this.m0; i11++) {
                            lg.b bVar6 = (lg.b) arrayList.get(i11);
                            bVar6.e = bVar6.d;
                        }
                        arrayList.add(bVar4);
                        if (arrayList.size() > 2) {
                            arrayList.remove(0);
                        }
                        ValueAnimator duration = e(0.0f, 1.0f, new l0(6, this, bVar4)).setDuration(200L);
                        this.f14497c0 = duration;
                        duration.addListener(new ne(8, this, bVar4));
                        this.f14497c0.start();
                    }
                }
            }
        }
    }

    public void J(kg.b bVar, long j10) {
        int length = bVar.f15098a.length;
        long j11 = j10 - (j10 % 86400000);
        long j12 = 86399999 + j11;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            long j13 = bVar.f15098a[i12];
            if (j11 > j13) {
                i10 = i12;
            }
            if (j12 > j13) {
                i11 = i12;
            }
        }
        float[] fArr = bVar.f15099b;
        float f7 = fArr[i10];
        j jVar = this.f14506g0;
        jVar.f14547k = f7;
        jVar.f14548l = fArr[i11];
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
                lg.f fVar = (lg.f) obj;
                boolean z10 = fVar.f16126n;
                kg.a aVar = fVar.f16116a;
                if (z10) {
                    long j12 = aVar.e;
                    if (j12 > j11) {
                        j11 = j12;
                    }
                }
                if (z10) {
                    long j13 = aVar.f15095f;
                    if (j13 < j10) {
                        j10 = j13;
                    }
                }
            }
            if ((j10 != 2147483647L && ((float) j10) != 0.0f) || (j11 > 0 && ((float) j11) != this.f14515l0)) {
                this.f14515l0 = (float) j11;
                Animator animator = this.f14499d0;
                if (animator != null) {
                    animator.cancel();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(e(this.f14512j0, this.f14515l0, this.J0), e(this.f14514k0, 0.0f, this.K0));
                this.f14499d0 = animatorSet;
                animatorSet.start();
            }
        }
    }

    @Override
    public void a(float f7, float f10, boolean z10) {
        kg.b bVar = this.f14508h0;
        if (bVar == null) {
            return;
        }
        if (z10) {
            int c10 = bVar.c(Math.max(f7, 0.0f));
            int a2 = this.f14508h0.a(Math.min(f10, 1.0f), c10);
            E(r(c10, a2), s(c10, a2), true, true, false);
            c(false);
            return;
        }
        H();
        invalidate();
    }

    public final void c(boolean z10) {
        float f7;
        x((this.G0 * this.f14506g0.f14547k) - f14475k1);
        if (this.f14511i1 == z10) {
            return;
        }
        this.f14511i1 = z10;
        ValueAnimator valueAnimator = this.f14501e0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f14501e0.cancel();
        }
        float f10 = this.f14527v0;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator duration = e(f10, f7, this.N0).setDuration(200L);
        this.f14501e0 = duration;
        duration.addListener(this.O0);
        this.f14501e0.start();
    }

    public final void d() {
        this.f14524s0 = -1;
        this.f14526u0 = false;
        this.f14511i1 = false;
        this.f14525t0.setVisibility(8);
        this.f14527v0 = 0.0f;
    }

    public lg.d f(int i10, long j10, long j11) {
        return new lg.d(j10, j11, this.P0, this.f14508h0.h, i10, this.N, this.O);
    }

    public lg.e g() {
        return new lg.e(getContext(), this.W0);
    }

    public long getEndDate() {
        return this.f14508h0.f15098a[this.G];
    }

    public float getMinDistance() {
        kg.b bVar = this.f14508h0;
        if (bVar == null) {
            return 0.1f;
        }
        int length = bVar.f15098a.length;
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
        int i10 = this.f14524s0;
        if (i10 < 0) {
            return -1L;
        }
        return this.f14508h0.f15098a[i10];
    }

    public long getStartDate() {
        return this.f14508h0.f15098a[this.F];
    }

    public abstract lg.f h(kg.a aVar);

    public void i(Canvas canvas) {
        int measuredHeight;
        if (this.f14508h0 != null) {
            int i10 = this.f14533y0;
            float f7 = 1.0f;
            if (i10 == 2) {
                f7 = 1.0f - this.f14534z0.f16135f;
            } else if (i10 == 1) {
                f7 = this.f14534z0.f16135f;
            } else if (i10 == 3) {
                f7 = this.f14534z0.f16135f;
            }
            Paint paint = this.L;
            paint.setAlpha((int) (this.f14516n * f7));
            TextPaint textPaint = this.N;
            textPaint.setAlpha((int) (this.f14503f * 255.0f * f7));
            this.O.setAlpha((int) (this.f14503f * 255.0f * f7));
            int textSize = (int) (f14477n1 - textPaint.getTextSize());
            float measuredHeight2 = (getMeasuredHeight() - this.f14523s) - 1;
            canvas.drawLine(this.D0, measuredHeight2, this.E0, measuredHeight2, paint);
            if (this.P0) {
                return;
            }
            canvas.drawText("0", f14475k1, measuredHeight - textSize, textPaint);
        }
    }

    public void j(Canvas canvas) {
        float f7;
        char c10;
        int i10;
        int i11;
        if (this.f14508h0 != null) {
            ArrayList arrayList = this.f14496c;
            this.m0 = arrayList.size();
            int i12 = this.f14533y0;
            float f10 = 1.0f;
            int i13 = 1;
            if (i12 == 2) {
                f7 = 1.0f - this.f14534z0.f16135f;
            } else if (i12 == 1) {
                f7 = this.f14534z0.f16135f;
            } else if (i12 == 3) {
                f7 = this.f14534z0.f16135f;
            } else {
                f7 = 1.0f;
            }
            char c11 = 0;
            this.f14517n0 = 0;
            while (true) {
                int i14 = this.f14517n0;
                if (i14 < this.m0) {
                    int i15 = ((lg.b) arrayList.get(i14)).d;
                    int i16 = ((lg.b) arrayList.get(this.f14517n0)).f16092a;
                    if (i16 == 0) {
                        i16 = i13;
                    }
                    int i17 = this.F - this.f14518o0;
                    while (i17 % i16 != 0) {
                        i17--;
                    }
                    int i18 = this.G - this.f14518o0;
                    while (true) {
                        if (i18 % i16 == 0 && i18 >= this.f14508h0.f15098a.length - i13) {
                            break;
                        }
                        i18++;
                        i13 = i13;
                        i15 = i15;
                        c11 = c11;
                        f10 = 1.0f;
                    }
                    int i19 = this.f14518o0;
                    int i20 = i17 + i19;
                    int i21 = i18 + i19;
                    float f11 = this.G0 * this.f14506g0.f14547k;
                    float f12 = f14475k1;
                    float f13 = f11 - f12;
                    while (i20 < i21) {
                        if (i20 >= 0) {
                            long[] jArr = this.f14508h0.f15098a;
                            if (i20 < jArr.length - i13) {
                                long j10 = jArr[i20];
                                long j11 = jArr[c11];
                                long j12 = jArr[jArr.length - i13];
                                i10 = i13;
                                i11 = i15;
                                float f14 = ((((float) (j10 - j11)) / ((float) (j12 - j11))) * this.G0) - f13;
                                float f15 = f14 - f14483t1;
                                if (f15 > 0.0f) {
                                    float f16 = this.F0;
                                    if (f15 <= f16 + f12) {
                                        float f17 = f14479p1;
                                        int i22 = (f15 > f17 ? 1 : (f15 == f17 ? 0 : -1));
                                        c10 = c11;
                                        TextPaint textPaint = this.P;
                                        if (i22 < 0) {
                                            textPaint.setAlpha((int) (i11 * v0.y(f17, f15, f17, f10) * this.h * f7));
                                        } else if (f15 > f16) {
                                            textPaint.setAlpha((int) (i11 * v0.y(f15, f16, f12, f10) * this.h * f7));
                                        } else {
                                            textPaint.setAlpha((int) (i11 * this.h * f7));
                                        }
                                        kg.b bVar = this.f14508h0;
                                        String[] strArr = bVar.f15100c;
                                        long[] jArr2 = bVar.f15098a;
                                        canvas.drawText(strArr[(int) ((jArr2[i20] - jArr2[c10]) / bVar.f15105k)], f14, AndroidUtilities.dp(3.0f) + (getMeasuredHeight() - this.f14523s) + f14478o1, textPaint);
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
                    this.f14517n0 += i13;
                    c11 = c11;
                    f10 = 1.0f;
                } else {
                    return;
                }
            }
        }
    }

    public abstract void k(Canvas canvas);

    public void l(android.graphics.Canvas r12, lg.d r13) {
        throw new UnsupportedOperationException("Method not decompiled: jg.g.l(android.graphics.Canvas, lg.d):void");
    }

    public final void m(android.graphics.Canvas r39) {
        throw new UnsupportedOperationException("Method not decompiled: jg.g.m(android.graphics.Canvas):void");
    }

    public abstract void n(Canvas canvas);

    public void o(Canvas canvas) {
        kg.b bVar;
        int i10 = this.f14524s0;
        if (i10 >= 0 && this.f14526u0 && (bVar = this.f14508h0) != null) {
            int i11 = (int) (this.f14521r * this.f14527v0);
            float f7 = this.F0;
            j jVar = this.f14506g0;
            float f10 = jVar.f14548l;
            float f11 = jVar.f14547k;
            float f12 = f7 / (f10 - f11);
            float f13 = (f11 * f12) - f14475k1;
            float[] fArr = bVar.f15099b;
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
                        this.f14517n0 = i12;
                        int i13 = this.f14517n0;
                        if (i13 < this.m0) {
                            lg.f fVar = (lg.f) arrayList.get(i13);
                            boolean z10 = fVar.f16126n;
                            Paint paint2 = fVar.d;
                            if (z10 || fVar.f16127o != 0.0f) {
                                float f15 = (float) fVar.f16116a.f15092a[this.f14524s0];
                                float f16 = this.f14528w;
                                float measuredHeight = (getMeasuredHeight() - this.f14523s) - (((f15 - f16) / (this.v - f16)) * ((getMeasuredHeight() - this.f14523s) - f14477n1));
                                paint2.setAlpha((int) (fVar.f16127o * 255.0f * this.f14527v0));
                                Paint paint3 = this.S;
                                paint3.setAlpha((int) (fVar.f16127o * 255.0f * this.f14527v0));
                                canvas.drawPoint(f14, measuredHeight, paint2);
                                canvas.drawPoint(f14, measuredHeight, paint3);
                            }
                            i12 = this.f14517n0 + 1;
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
        if (this.f14529w0) {
            super.onDraw(canvas);
            return;
        }
        F();
        int save = canvas.save();
        RectF rectF = this.H0;
        canvas.clipRect(0.0f, rectF.top, getMeasuredWidth(), rectF.bottom);
        i(canvas);
        ArrayList arrayList = this.f14493b;
        this.m0 = arrayList.size();
        int i10 = 0;
        this.f14517n0 = 0;
        while (true) {
            int i11 = this.f14517n0;
            if (i11 >= this.m0) {
                break;
            }
            l(canvas, (lg.d) arrayList.get(i11));
            this.f14517n0++;
        }
        k(canvas);
        while (true) {
            this.f14517n0 = i10;
            int i12 = this.f14517n0;
            if (i12 < this.m0) {
                p(canvas, (lg.d) arrayList.get(i12));
                i10 = this.f14517n0 + 1;
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
            float f7 = f14475k1;
            float f10 = 2.0f * f7;
            this.f14519p0 = Bitmap.createBitmap((int) (getMeasuredWidth() - f10), i13, Bitmap.Config.ARGB_4444);
            this.f14520q0 = new Canvas(this.f14519p0);
            this.f14490a.a(i13, (int) (getMeasuredWidth() - f10));
            w();
            if (this.f14526u0) {
                x((this.G0 * this.f14506g0.f14547k) - f7);
            }
            A(false, true, false);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int measuredHeight = getMeasuredHeight();
            int i14 = f14480q1;
            this.Z0.set(0, measuredHeight - ((i13 + i14) + i14), getMeasuredWidth(), getMeasuredHeight());
            setSystemGestureExclusionRects(this.f14492a1);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        long j10;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean z10 = false;
        if (this.f14508h0 != null) {
            boolean z11 = this.J;
            j jVar = this.f14506g0;
            if (!z11) {
                jVar.c(motionEvent.getActionIndex(), motionEvent);
                getParent().requestDisallowInterceptTouchEvent(false);
                this.f14522r0 = false;
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
                        int i10 = x10 - this.f14498c1;
                        int i11 = y3 - this.f14500d1;
                        if (jVar.f14550n[0] == null && !jVar.f14542c) {
                            boolean z12 = this.f14522r0;
                            int i12 = this.A0;
                            if (z12) {
                                if ((this.f14509h1 && System.currentTimeMillis() - this.f14507g1 > 200) || Math.abs(i10) > Math.abs(i11) || Math.abs(i11) < i12) {
                                    z10 = true;
                                }
                                this.f14498c1 = x10;
                                this.f14500d1 = y3;
                                getParent().requestDisallowInterceptTouchEvent(z10);
                                C(x10, y3);
                                return true;
                            }
                            if (rectF.contains(this.f14502e1, this.f14505f1)) {
                                int i13 = this.f14502e1 - x10;
                                int i14 = this.f14505f1 - y3;
                                if (Math.sqrt((i14 * i14) + (i13 * i13)) > i12 || System.currentTimeMillis() - this.f14507g1 > 200) {
                                    this.f14522r0 = true;
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
                    if (rectF.contains(this.f14502e1, this.f14505f1) && !this.f14522r0) {
                        c(false);
                    }
                    h[] hVarArr = jVar.f14550n;
                    h hVar = hVarArr[0];
                    if (hVar != null && (valueAnimator2 = hVar.e) != null) {
                        valueAnimator2.cancel();
                    }
                    h hVar2 = hVarArr[1];
                    if (hVar2 != null && (valueAnimator = hVar2.e) != null) {
                        valueAnimator.cancel();
                    }
                    hVarArr[0] = null;
                    hVarArr[1] = null;
                    I();
                    getParent().requestDisallowInterceptTouchEvent(false);
                    this.f14522r0 = false;
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
            this.f14507g1 = System.currentTimeMillis();
            getParent().requestDisallowInterceptTouchEvent(true);
            if (!jVar.a(x10, y3, motionEvent.getActionIndex())) {
                this.f14498c1 = x10;
                this.f14502e1 = x10;
                this.f14500d1 = y3;
                this.f14505f1 = y3;
                if (rectF.contains(x10, y3)) {
                    if (this.f14524s0 < 0 || !this.f14511i1) {
                        this.f14522r0 = true;
                        C(x10, y3);
                        return true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public void p(android.graphics.Canvas r14, lg.d r15) {
        throw new UnsupportedOperationException("Method not decompiled: jg.g.p(android.graphics.Canvas, lg.d):void");
    }

    public long r(int i10, int i11) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        long j10 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            if (((lg.f) arrayList.get(i12)).f16126n) {
                long rMaxQ = ((lg.f) arrayList.get(i12)).f16116a.f15093b.rMaxQ(i10, i11);
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
            if (((lg.f) arrayList.get(i12)).f16126n) {
                long rMinQ = ((lg.f) arrayList.get(i12)).f16116a.f15093b.rMinQ(i10, i11);
                if (rMinQ < j10) {
                    j10 = rMinQ;
                }
            }
        }
        return j10;
    }

    public void setDateSelectionListener(e eVar) {
        this.Q0 = eVar;
    }

    public void setHeader(lg.c cVar) {
        this.f14513j1 = cVar;
    }

    public void setLandscape(boolean z10) {
        this.I = z10;
    }

    public void t() {
        this.L.setStrokeWidth(1.0f);
        this.M.setStrokeWidth(l1);
        TextPaint textPaint = this.N;
        float f7 = f14476m1;
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
        lg.e g10 = g();
        this.f14525t0 = g10;
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
            lg.f fVar = (lg.f) obj;
            boolean z10 = fVar.f16126n;
            kg.a aVar = fVar.f16116a;
            if (z10) {
                long j10 = aVar.e;
                if (((float) j10) > this.f14512j0) {
                    this.f14512j0 = (float) j10;
                }
            }
            if (z10) {
                long j11 = aVar.f15095f;
                if (((float) j11) < this.f14514k0) {
                    this.f14514k0 = (float) j11;
                }
            }
            float f7 = this.f14512j0;
            float f10 = this.f14514k0;
            if (f7 == f10) {
                this.f14512j0 = f7 + 1.0f;
                this.f14514k0 = f10 - 1.0f;
            }
        }
    }

    public final void v() {
        int measuredHeight = getMeasuredHeight() - this.f14523s;
        float f7 = this.f14530x;
        if (f7 != 0.0f && measuredHeight != 0) {
            this.E = (f7 / measuredHeight) * f14476m1;
        }
    }

    public final void w() {
        float f7;
        if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            float f10 = f14475k1;
            this.C0 = getMeasuredWidth() - (2.0f * f10);
            this.D0 = f10;
            float measuredWidth = getMeasuredWidth();
            if (this.I) {
                f7 = f14482s1;
            } else {
                f7 = f10;
            }
            float f11 = measuredWidth - f7;
            this.E0 = f11;
            float f12 = f11 - this.D0;
            this.F0 = f12;
            j jVar = this.f14506g0;
            this.G0 = f12 / (jVar.f14548l - jVar.f14547k);
            I();
            this.f14523s = AndroidUtilities.dp(100.0f);
            this.H0.set(this.D0 - f10, 0.0f, this.E0 + f10, getMeasuredHeight() - this.f14523s);
            if (this.f14508h0 != null) {
                this.f14518o0 = (int) (AndroidUtilities.dp(20.0f) / (this.C0 / this.f14508h0.f15098a.length));
            }
            v();
        }
    }

    public final void x(float f7) {
        int i10;
        float f10;
        kg.b bVar = this.f14508h0;
        if (bVar != null && (i10 = this.f14524s0) >= 0) {
            long[] jArr = bVar.f15098a;
            if (i10 < jArr.length && this.f14526u0) {
                this.f14525t0.c(i10, jArr[i10], this.d, false, bVar.f15104j, bVar.h);
                this.f14525t0.setVisibility(0);
                this.f14525t0.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
                float f11 = (this.f14508h0.f15099b[this.f14524s0] * this.G0) - f7;
                int i11 = (f11 > ((this.D0 + this.F0) / 2.0f) ? 1 : (f11 == ((this.D0 + this.F0) / 2.0f) ? 0 : -1));
                int i12 = f14487x1;
                if (i11 > 0) {
                    f10 = f11 - (this.f14525t0.getWidth() + i12);
                } else {
                    f10 = f11 + i12;
                }
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                } else if (this.f14525t0.getMeasuredWidth() + f10 > getMeasuredWidth()) {
                    f10 = getMeasuredWidth() - this.f14525t0.getMeasuredWidth();
                }
                this.f14525t0.setTranslationX(f10);
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
            this.f14517n0 = i10;
            int i11 = this.f14517n0;
            if (i11 >= this.m0) {
                break;
            }
            final lg.f fVar = (lg.f) arrayList.get(i11);
            if (fVar.f16126n && (valueAnimator3 = fVar.f16121i) != null) {
                valueAnimator3.cancel();
            }
            if (!fVar.f16126n && (valueAnimator2 = fVar.h) != null) {
                valueAnimator2.cancel();
            }
            if (fVar.f16126n && fVar.f16127o != 1.0f) {
                ValueAnimator valueAnimator4 = fVar.h;
                if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                    ValueAnimator e = e(fVar.f16127o, 1.0f, new ValueAnimator.AnimatorUpdateListener(this) {
                        public final g f14466b;

                        {
                            this.f14466b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                            switch (r3) {
                                case 0:
                                    g gVar = this.f14466b;
                                    gVar.getClass();
                                    fVar.f16127o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    gVar.H = true;
                                    gVar.invalidate();
                                    return;
                                default:
                                    g gVar2 = this.f14466b;
                                    gVar2.getClass();
                                    fVar.f16127o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    gVar2.H = true;
                                    gVar2.invalidate();
                                    return;
                            }
                        }
                    });
                    fVar.h = e;
                    e.start();
                } else {
                    i10 = this.f14517n0 + 1;
                }
            }
            if (!fVar.f16126n && fVar.f16127o != 0.0f && ((valueAnimator = fVar.f16121i) == null || !valueAnimator.isRunning())) {
                ValueAnimator e7 = e(fVar.f16127o, 0.0f, new ValueAnimator.AnimatorUpdateListener(this) {
                    public final g f14466b;

                    {
                        this.f14466b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                        switch (r3) {
                            case 0:
                                g gVar = this.f14466b;
                                gVar.getClass();
                                fVar.f16127o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                gVar.H = true;
                                gVar.invalidate();
                                return;
                            default:
                                g gVar2 = this.f14466b;
                                gVar2.getClass();
                                fVar.f16127o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                gVar2.H = true;
                                gVar2.invalidate();
                                return;
                        }
                    }
                });
                fVar.f16121i = e7;
                e7.start();
            }
            i10 = this.f14517n0 + 1;
        }
        K();
        if (this.f14526u0) {
            lg.e eVar = this.f14525t0;
            int i12 = this.f14524s0;
            kg.b bVar = this.f14508h0;
            eVar.c(i12, bVar.f15098a[i12], arrayList, true, bVar.f15104j, bVar.h);
        }
    }

    public void q(lg.j jVar) {
    }

    public void y() {
    }
}
