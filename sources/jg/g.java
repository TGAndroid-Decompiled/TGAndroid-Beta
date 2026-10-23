package jg;

import ah.l0;
import ai.me;
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
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.pp0;
import org.telegram.ui.z81;
public abstract class g extends View implements i {
    public static final boolean A1;
    public static final boolean B1;
    public static final u1.a C1;
    public static final float f14430k1 = AndroidUtilities.dpf2(16.0f);
    public static final float l1 = AndroidUtilities.dpf2(1.5f);
    public static final float f14431m1 = AndroidUtilities.dpf2(12.0f);
    public static final int f14432n1 = AndroidUtilities.dp(18.0f);
    public static final int f14433o1 = AndroidUtilities.dp(14.0f);
    public static final int f14434p1 = AndroidUtilities.dp(10.0f);
    public static final int f14435q1 = AndroidUtilities.dp(16.0f);
    public static final int f14436r1 = AndroidUtilities.dp(24.0f);
    public static final int f14437s1 = AndroidUtilities.dp(16.0f);
    public static final int f14438t1 = AndroidUtilities.dp(10.0f);
    public static final int f14439u1 = AndroidUtilities.dp(12.0f);
    public static final int f14440v1 = AndroidUtilities.dp(8.0f);
    public static final int f14441w1 = AndroidUtilities.dp(6.0f);
    public static final int f14442x1 = AndroidUtilities.dp(5.0f);
    public static final int f14443y1 = AndroidUtilities.dp(2.0f);
    public static final int f14444z1 = AndroidUtilities.dp(1.0f);
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
    public final d6 W0;
    public int X0;
    public int Y0;
    public final Rect Z0;
    public f f14445a;
    public AnimatorSet f14446a0;
    public final ArrayList f14447a1;
    public final ArrayList f14448b;
    public ValueAnimator f14449b0;
    public long f14450b1;
    public final ArrayList f14451c;
    public ValueAnimator f14452c0;
    public int f14453c1;
    public final ArrayList d;
    public Animator f14454d0;
    public int f14455d1;
    public boolean e;
    public ValueAnimator f14456e0;
    public int f14457e1;
    public float f14458f;
    public boolean f14459f0;
    public int f14460f1;
    public final j f14461g0;
    public long f14462g1;
    public float h;
    public kg.b f14463h0;
    public boolean f14464h1;
    public lg.b f14465i0;
    public boolean f14466i1;
    public float f14467j0;
    public lg.c f14468j1;
    public float f14469k0;
    public float f14470l0;
    public int m0;
    public int f14471n;
    public int f14472n0;
    public int f14473o0;
    public Bitmap f14474p0;
    public Canvas f14475q0;
    public int f14476r;
    public boolean f14477r0;
    public int f14478s;
    public int f14479s0;
    public lg.e f14480t0;
    public boolean f14481u0;
    public float v;
    public float f14482v0;
    public float f14483w;
    public boolean f14484w0;
    public float f14485x;
    public boolean f14486x0;
    public float f14487y;
    public int f14488y0;
    public lg.j f14489z0;

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
        this.f14448b = new ArrayList(10);
        this.f14451c = new ArrayList(25);
        this.d = new ArrayList();
        this.e = true;
        this.v = 250.0f;
        this.f14483w = 0.0f;
        this.f14485x = 0.0f;
        this.f14487y = 0.0f;
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
        this.f14459f0 = false;
        ?? obj = new Object();
        obj.h = new Rect();
        obj.f14500i = new Rect();
        obj.f14501j = new Rect();
        obj.f14502k = 0.7f;
        obj.f14503l = 1.0f;
        obj.f14504m = 0.1f;
        obj.f14505n = new h[]{null, null};
        obj.f14495a = this;
        this.f14461g0 = obj;
        this.f14477r0 = false;
        this.f14479s0 = -1;
        this.f14481u0 = false;
        this.f14482v0 = 0.0f;
        this.f14484w0 = false;
        this.f14486x0 = false;
        this.f14488y0 = 0;
        this.B0 = AndroidUtilities.dp(46.0f);
        this.H0 = new RectF();
        this.J0 = new d(this, 0);
        this.K0 = new d(this, 1);
        this.L0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final g f14419b;

            {
                this.f14419b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        g gVar = this.f14419b;
                        gVar.getClass();
                        gVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar.invalidate();
                        return;
                    default:
                        g gVar2 = this.f14419b;
                        gVar2.getClass();
                        gVar2.f14483w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar2.invalidate();
                        return;
                }
            }
        };
        this.M0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final g f14419b;

            {
                this.f14419b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        g gVar = this.f14419b;
                        gVar.getClass();
                        gVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar.invalidate();
                        return;
                    default:
                        g gVar2 = this.f14419b;
                        gVar2.getClass();
                        gVar2.f14483w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
        this.f14447a1 = arrayList;
        arrayList.add(rect);
        this.f14450b1 = 0L;
        this.f14466i1 = false;
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
        long j10;
        if (this.f14463h0 == null) {
            return;
        }
        float f7 = this.F0;
        j jVar = this.f14461g0;
        this.G0 = f7 / (jVar.f14503l - jVar.f14502k);
        H();
        if (this.P0) {
            j10 = s(this.F, this.G);
        } else {
            j10 = 0;
        }
        E(r(this.F, this.G), j10, z10, z11, z12);
        if (this.f14481u0 && !z11) {
            c(false);
            x((this.G0 * jVar.f14502k) - f14430k1);
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
        int i12 = this.f14479s0;
        kg.b bVar = this.f14463h0;
        if (bVar != null) {
            float f7 = this.G0;
            float f10 = (this.f14461g0.f14502k * f7) - f14430k1;
            float f11 = (i10 + f10) / f7;
            if (f11 < 0.0f) {
                this.f14479s0 = 0;
            } else if (f11 > 1.0f) {
                this.f14479s0 = bVar.f15052a.length - 1;
            } else {
                int b10 = bVar.b(f11, this.F, this.G);
                this.f14479s0 = b10;
                int i13 = b10 + 1;
                float[] fArr = this.f14463h0.f15053b;
                if (i13 < fArr.length) {
                    if (Math.abs(this.f14463h0.f15053b[this.f14479s0 + 1] - f11) < Math.abs(fArr[b10] - f11)) {
                        this.f14479s0++;
                    }
                }
            }
            int i14 = this.f14479s0;
            int i15 = this.G;
            if (i14 > i15) {
                this.f14479s0 = i15;
            }
            int i16 = this.f14479s0;
            int i17 = this.F;
            if (i16 < i17) {
                this.f14479s0 = i17;
            }
            if (i12 != this.f14479s0) {
                this.f14481u0 = true;
                c(true);
                x(f10);
                e eVar = this.Q0;
                if (eVar != null) {
                    getSelectedDate();
                    z81 z81Var = (z81) ((pp0) eVar).f40282b;
                    z81Var.f();
                    z81Var.f43675b.f14480t0.d(false, false);
                }
                B();
                invalidate();
            }
        }
    }

    public boolean D(kg.b bVar) {
        boolean z10;
        kg.b bVar2 = this.f14463h0;
        long j10 = 0;
        j jVar = this.f14461g0;
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
            this.f14463h0 = bVar;
            if (bVar != null) {
                if (bVar.f15052a[0] == 0) {
                    jVar.f14502k = 0.0f;
                    jVar.f14503l = 1.0f;
                } else {
                    float minDistance = getMinDistance();
                    jVar.f14504m = minDistance;
                    float f7 = jVar.f14503l;
                    if (f7 - jVar.f14502k < minDistance) {
                        float f10 = f7 - minDistance;
                        jVar.f14502k = f10;
                        if (f10 < 0.0f) {
                            jVar.f14502k = 0.0f;
                            jVar.f14503l = 1.0f;
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
            this.f14467j0 = 0.0f;
            this.f14469k0 = 2.1474836E9f;
            u();
            int i11 = bVar.f15058j;
            if (i11 != 1 && i11 != 2) {
                this.f14480t0.setSize(arrayList.size());
            } else {
                this.f14480t0.setSize(arrayList.size() * 2);
            }
            this.H = true;
            I();
            return z10;
        }
        jVar.f14502k = 0.7f;
        jVar.f14503l = 1.0f;
        this.f14469k0 = 0.0f;
        this.f14467j0 = 0.0f;
        this.f14448b.clear();
        AnimatorSet animatorSet = this.f14446a0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator valueAnimator = this.f14449b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f14449b0.cancel();
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
        if ((Math.abs(((float) (((long) Math.ceil(((float) j12) / 5.0f)) * 5)) - this.f14485x) >= this.E && j10 != 0) || ((float) j10) != this.f14487y) {
            lg.d f10 = f(this.f14463h0.f15057i, j10, j11);
            long[] jArr = f10.f16038a;
            long j13 = jArr[jArr.length - 1];
            long j14 = jArr[0];
            if (!z12) {
                float f11 = this.v - this.f14483w;
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
                if (((float) j13) != this.f14485x) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (this.P0 && ((float) j14) != this.f14487y) {
                    z13 = true;
                }
                if (z13) {
                    AnimatorSet animatorSet = this.f14446a0;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        this.f14446a0.cancel();
                    }
                    this.T0 = this.v;
                    this.U0 = this.f14483w;
                    this.R0 = 0.0f;
                    this.S0 = 0.0f;
                    this.V0 = f7;
                }
            }
            float f14 = (float) j13;
            this.f14485x = f14;
            float f15 = (float) j14;
            this.f14487y = f15;
            v();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f14450b1 < 320 && !z11) {
                return;
            }
            this.f14450b1 = currentTimeMillis;
            ValueAnimator valueAnimator = this.f14449b0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f14449b0.cancel();
            }
            ArrayList arrayList = this.f14448b;
            if (!z10) {
                this.v = f14;
                this.f14483w = f15;
                arrayList.clear();
                arrayList.add(f10);
                f10.f16041f = 255;
                return;
            }
            arrayList.add(f10);
            if (z12) {
                AnimatorSet animatorSet2 = this.f14446a0;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    this.f14446a0.cancel();
                }
                this.V0 = 0.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(e(this.v, f14, this.L0));
                if (this.P0) {
                    animatorSet3.playTogether(e(this.f14483w, f15, this.M0));
                }
                this.f14446a0 = animatorSet3;
                animatorSet3.start();
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                lg.d dVar = (lg.d) arrayList.get(i10);
                if (dVar != f10) {
                    dVar.f16042g = dVar.f16041f;
                }
            }
            ValueAnimator e = e(0.0f, 255.0f, new l0(5, this, f10));
            this.f14449b0 = e;
            e.addListener(new me(7, this, f10));
            this.f14449b0.start();
        }
    }

    public final void F() {
        float f7 = this.V0;
        if (f7 != 0.0f) {
            float f10 = this.v;
            float f11 = this.f14485x;
            if (f10 != f11) {
                float f12 = this.R0 + f7;
                this.R0 = f12;
                if (f12 > 1.0f) {
                    this.R0 = 1.0f;
                    this.v = f11;
                } else {
                    float f13 = this.T0;
                    this.v = (bs.f25026g.getInterpolation(f12) * (f11 - f13)) + f13;
                }
                invalidate();
            }
            if (this.P0) {
                float f14 = this.f14483w;
                float f15 = this.f14487y;
                if (f14 != f15) {
                    float f16 = this.S0 + this.V0;
                    this.S0 = f16;
                    if (f16 > 1.0f) {
                        this.S0 = 1.0f;
                        this.f14483w = f15;
                    } else {
                        float f17 = this.U0;
                        this.f14483w = (bs.f25026g.getInterpolation(f16) * (f15 - f17)) + f17;
                    }
                    invalidate();
                }
            }
        }
    }

    public final void G() {
        int i10;
        int i11;
        if (this.f14486x0) {
            i10 = h6.Zi;
        } else {
            i10 = h6.Yi;
        }
        d6 d6Var = this.W0;
        int w02 = h6.w0(i10, d6Var);
        TextPaint textPaint = this.N;
        textPaint.setColor(w02);
        if (this.f14486x0) {
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
        this.S.setColor(h6.w0(h6.f20994d6, d6Var));
        this.T.setColor(h6.w0(h6.ej, d6Var));
        this.f14480t0.b();
        this.f14471n = paint.getAlpha();
        this.f14476r = paint2.getAlpha();
        this.f14458f = textPaint.getAlpha() / 255.0f;
        this.h = textPaint2.getAlpha() / 255.0f;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((lg.f) obj).a();
        }
        if (this.f14481u0) {
            int i13 = this.f14479s0;
            kg.b bVar = this.f14463h0;
            long[] jArr = bVar.f15052a;
            if (i13 < jArr.length) {
                this.f14480t0.c(i13, jArr[i13], arrayList, false, bVar.f15058j, bVar.h);
            }
        }
        this.H = true;
    }

    public final void H() {
        kg.b bVar = this.f14463h0;
        if (bVar == null) {
            return;
        }
        j jVar = this.f14461g0;
        int c10 = bVar.c(Math.max(jVar.f14502k, 0.0f));
        this.F = c10;
        int a2 = this.f14463h0.a(Math.min(jVar.f14503l, 1.0f), c10);
        this.G = a2;
        int i10 = this.F;
        if (a2 < i10) {
            this.G = i10;
        }
        lg.c cVar = this.f14468j1;
        if (cVar != null) {
            long[] jArr = this.f14463h0.f15052a;
            cVar.b(jArr[i10], jArr[this.G]);
        }
        I();
    }

    public final void I() {
        kg.b bVar = this.f14463h0;
        if (bVar != null) {
            float f7 = this.F0;
            if (f7 != 0.0f) {
                int i10 = (int) ((f7 / (this.G0 * bVar.f15056g)) / 6.0f);
                lg.b bVar2 = this.f14465i0;
                if (bVar2 == null || i10 >= bVar2.f16030b || i10 <= bVar2.f16031c) {
                    int highestOneBit = Integer.highestOneBit(i10) << 1;
                    lg.b bVar3 = this.f14465i0;
                    if (bVar3 == null || bVar3.f16029a != highestOneBit) {
                        ValueAnimator valueAnimator = this.f14452c0;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllListeners();
                            this.f14452c0.cancel();
                        }
                        double d = highestOneBit;
                        double d10 = 0.2d * d;
                        lg.b bVar4 = new lg.b(highestOneBit, (int) (d + d10), (int) (d - d10));
                        bVar4.d = 255;
                        lg.b bVar5 = this.f14465i0;
                        ArrayList arrayList = this.f14451c;
                        if (bVar5 == null) {
                            this.f14465i0 = bVar4;
                            bVar4.d = 255;
                            arrayList.add(bVar4);
                            return;
                        }
                        this.f14465i0 = bVar4;
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
                        this.f14452c0 = duration;
                        duration.addListener(new me(8, this, bVar4));
                        this.f14452c0.start();
                    }
                }
            }
        }
    }

    public void J(kg.b bVar, long j10) {
        int length = bVar.f15052a.length;
        long j11 = j10 - (j10 % 86400000);
        long j12 = 86399999 + j11;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            long j13 = bVar.f15052a[i12];
            if (j11 > j13) {
                i10 = i12;
            }
            if (j12 > j13) {
                i11 = i12;
            }
        }
        float[] fArr = bVar.f15053b;
        float f7 = fArr[i10];
        j jVar = this.f14461g0;
        jVar.f14502k = f7;
        jVar.f14503l = fArr[i11];
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
                boolean z10 = fVar.f16063n;
                kg.a aVar = fVar.f16053a;
                if (z10) {
                    long j12 = aVar.e;
                    if (j12 > j11) {
                        j11 = j12;
                    }
                }
                if (z10) {
                    long j13 = aVar.f15049f;
                    if (j13 < j10) {
                        j10 = j13;
                    }
                }
            }
            if ((j10 != 2147483647L && ((float) j10) != 0.0f) || (j11 > 0 && ((float) j11) != this.f14470l0)) {
                this.f14470l0 = (float) j11;
                Animator animator = this.f14454d0;
                if (animator != null) {
                    animator.cancel();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(e(this.f14467j0, this.f14470l0, this.J0), e(this.f14469k0, 0.0f, this.K0));
                this.f14454d0 = animatorSet;
                animatorSet.start();
            }
        }
    }

    @Override
    public void a(float f7, float f10, boolean z10) {
        kg.b bVar = this.f14463h0;
        if (bVar == null) {
            return;
        }
        if (z10) {
            int c10 = bVar.c(Math.max(f7, 0.0f));
            int a2 = this.f14463h0.a(Math.min(f10, 1.0f), c10);
            E(r(c10, a2), s(c10, a2), true, true, false);
            c(false);
            return;
        }
        H();
        invalidate();
    }

    public final void c(boolean z10) {
        float f7;
        x((this.G0 * this.f14461g0.f14502k) - f14430k1);
        if (this.f14466i1 == z10) {
            return;
        }
        this.f14466i1 = z10;
        ValueAnimator valueAnimator = this.f14456e0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f14456e0.cancel();
        }
        float f10 = this.f14482v0;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator duration = e(f10, f7, this.N0).setDuration(200L);
        this.f14456e0 = duration;
        duration.addListener(this.O0);
        this.f14456e0.start();
    }

    public final void d() {
        this.f14479s0 = -1;
        this.f14481u0 = false;
        this.f14466i1 = false;
        this.f14480t0.setVisibility(8);
        this.f14482v0 = 0.0f;
    }

    public lg.d f(int i10, long j10, long j11) {
        return new lg.d(j10, j11, this.P0, this.f14463h0.h, i10, this.N, this.O);
    }

    public lg.e g() {
        return new lg.e(getContext(), this.W0);
    }

    public long getEndDate() {
        return this.f14463h0.f15052a[this.G];
    }

    public float getMinDistance() {
        kg.b bVar = this.f14463h0;
        if (bVar == null) {
            return 0.1f;
        }
        int length = bVar.f15052a.length;
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
        int i10 = this.f14479s0;
        if (i10 < 0) {
            return -1L;
        }
        return this.f14463h0.f15052a[i10];
    }

    public long getStartDate() {
        return this.f14463h0.f15052a[this.F];
    }

    public abstract lg.f h(kg.a aVar);

    public void i(Canvas canvas) {
        int measuredHeight;
        if (this.f14463h0 != null) {
            int i10 = this.f14488y0;
            float f7 = 1.0f;
            if (i10 == 2) {
                f7 = 1.0f - this.f14489z0.f16072f;
            } else if (i10 == 1) {
                f7 = this.f14489z0.f16072f;
            } else if (i10 == 3) {
                f7 = this.f14489z0.f16072f;
            }
            Paint paint = this.L;
            paint.setAlpha((int) (this.f14471n * f7));
            TextPaint textPaint = this.N;
            textPaint.setAlpha((int) (this.f14458f * 255.0f * f7));
            this.O.setAlpha((int) (this.f14458f * 255.0f * f7));
            int textSize = (int) (f14432n1 - textPaint.getTextSize());
            float measuredHeight2 = (getMeasuredHeight() - this.f14478s) - 1;
            canvas.drawLine(this.D0, measuredHeight2, this.E0, measuredHeight2, paint);
            if (this.P0) {
                return;
            }
            canvas.drawText("0", f14430k1, measuredHeight - textSize, textPaint);
        }
    }

    public void j(Canvas canvas) {
        float f7;
        char c10;
        int i10;
        int i11;
        if (this.f14463h0 != null) {
            ArrayList arrayList = this.f14451c;
            this.m0 = arrayList.size();
            int i12 = this.f14488y0;
            float f10 = 1.0f;
            int i13 = 1;
            if (i12 == 2) {
                f7 = 1.0f - this.f14489z0.f16072f;
            } else if (i12 == 1) {
                f7 = this.f14489z0.f16072f;
            } else if (i12 == 3) {
                f7 = this.f14489z0.f16072f;
            } else {
                f7 = 1.0f;
            }
            char c11 = 0;
            this.f14472n0 = 0;
            while (true) {
                int i14 = this.f14472n0;
                if (i14 < this.m0) {
                    int i15 = ((lg.b) arrayList.get(i14)).d;
                    int i16 = ((lg.b) arrayList.get(this.f14472n0)).f16029a;
                    if (i16 == 0) {
                        i16 = i13;
                    }
                    int i17 = this.F - this.f14473o0;
                    while (i17 % i16 != 0) {
                        i17--;
                    }
                    int i18 = this.G - this.f14473o0;
                    while (true) {
                        if (i18 % i16 == 0 && i18 >= this.f14463h0.f15052a.length - i13) {
                            break;
                        }
                        i18++;
                        i13 = i13;
                        i15 = i15;
                        c11 = c11;
                        f10 = 1.0f;
                    }
                    int i19 = this.f14473o0;
                    int i20 = i17 + i19;
                    int i21 = i18 + i19;
                    float f11 = this.G0 * this.f14461g0.f14502k;
                    float f12 = f14430k1;
                    float f13 = f11 - f12;
                    while (i20 < i21) {
                        if (i20 >= 0) {
                            long[] jArr = this.f14463h0.f15052a;
                            if (i20 < jArr.length - i13) {
                                long j10 = jArr[i20];
                                long j11 = jArr[c11];
                                long j12 = jArr[jArr.length - i13];
                                i10 = i13;
                                i11 = i15;
                                float f14 = ((((float) (j10 - j11)) / ((float) (j12 - j11))) * this.G0) - f13;
                                float f15 = f14 - f14438t1;
                                if (f15 > 0.0f) {
                                    float f16 = this.F0;
                                    if (f15 <= f16 + f12) {
                                        float f17 = f14434p1;
                                        int i22 = (f15 > f17 ? 1 : (f15 == f17 ? 0 : -1));
                                        c10 = c11;
                                        TextPaint textPaint = this.P;
                                        if (i22 < 0) {
                                            textPaint.setAlpha((int) (i11 * g0.x(f17, f15, f17, f10) * this.h * f7));
                                        } else if (f15 > f16) {
                                            textPaint.setAlpha((int) (i11 * g0.x(f15, f16, f12, f10) * this.h * f7));
                                        } else {
                                            textPaint.setAlpha((int) (i11 * this.h * f7));
                                        }
                                        kg.b bVar = this.f14463h0;
                                        String[] strArr = bVar.f15054c;
                                        long[] jArr2 = bVar.f15052a;
                                        canvas.drawText(strArr[(int) ((jArr2[i20] - jArr2[c10]) / bVar.f15059k)], f14, AndroidUtilities.dp(3.0f) + (getMeasuredHeight() - this.f14478s) + f14433o1, textPaint);
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
                    this.f14472n0 += i13;
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
        int i10 = this.f14479s0;
        if (i10 >= 0 && this.f14481u0 && (bVar = this.f14463h0) != null) {
            int i11 = (int) (this.f14476r * this.f14482v0);
            float f7 = this.F0;
            j jVar = this.f14461g0;
            float f10 = jVar.f14503l;
            float f11 = jVar.f14502k;
            float f12 = f7 / (f10 - f11);
            float f13 = (f11 * f12) - f14430k1;
            float[] fArr = bVar.f15053b;
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
                        this.f14472n0 = i12;
                        int i13 = this.f14472n0;
                        if (i13 < this.m0) {
                            lg.f fVar = (lg.f) arrayList.get(i13);
                            boolean z10 = fVar.f16063n;
                            Paint paint2 = fVar.d;
                            if (z10 || fVar.f16064o != 0.0f) {
                                float f15 = (float) fVar.f16053a.f15046a[this.f14479s0];
                                float f16 = this.f14483w;
                                float measuredHeight = (getMeasuredHeight() - this.f14478s) - (((f15 - f16) / (this.v - f16)) * ((getMeasuredHeight() - this.f14478s) - f14432n1));
                                paint2.setAlpha((int) (fVar.f16064o * 255.0f * this.f14482v0));
                                Paint paint3 = this.S;
                                paint3.setAlpha((int) (fVar.f16064o * 255.0f * this.f14482v0));
                                canvas.drawPoint(f14, measuredHeight, paint2);
                                canvas.drawPoint(f14, measuredHeight, paint3);
                            }
                            i12 = this.f14472n0 + 1;
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
        if (this.f14484w0) {
            super.onDraw(canvas);
            return;
        }
        F();
        int save = canvas.save();
        RectF rectF = this.H0;
        canvas.clipRect(0.0f, rectF.top, getMeasuredWidth(), rectF.bottom);
        i(canvas);
        ArrayList arrayList = this.f14448b;
        this.m0 = arrayList.size();
        int i10 = 0;
        this.f14472n0 = 0;
        while (true) {
            int i11 = this.f14472n0;
            if (i11 >= this.m0) {
                break;
            }
            l(canvas, (lg.d) arrayList.get(i11));
            this.f14472n0++;
        }
        k(canvas);
        while (true) {
            this.f14472n0 = i10;
            int i12 = this.f14472n0;
            if (i12 < this.m0) {
                p(canvas, (lg.d) arrayList.get(i12));
                i10 = this.f14472n0 + 1;
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
            float f7 = f14430k1;
            float f10 = 2.0f * f7;
            this.f14474p0 = Bitmap.createBitmap((int) (getMeasuredWidth() - f10), i13, Bitmap.Config.ARGB_4444);
            this.f14475q0 = new Canvas(this.f14474p0);
            this.f14445a.c(i13, (int) (getMeasuredWidth() - f10));
            w();
            if (this.f14481u0) {
                x((this.G0 * this.f14461g0.f14502k) - f7);
            }
            A(false, true, false);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int measuredHeight = getMeasuredHeight();
            int i14 = f14435q1;
            this.Z0.set(0, measuredHeight - ((i13 + i14) + i14), getMeasuredWidth(), getMeasuredHeight());
            setSystemGestureExclusionRects(this.f14447a1);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        long j10;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean z10 = false;
        if (this.f14463h0 != null) {
            boolean z11 = this.J;
            j jVar = this.f14461g0;
            if (!z11) {
                jVar.c(motionEvent.getActionIndex(), motionEvent);
                getParent().requestDisallowInterceptTouchEvent(false);
                this.f14477r0 = false;
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
                        int i10 = x10 - this.f14453c1;
                        int i11 = y3 - this.f14455d1;
                        if (jVar.f14505n[0] == null && !jVar.f14497c) {
                            boolean z12 = this.f14477r0;
                            int i12 = this.A0;
                            if (z12) {
                                if ((this.f14464h1 && System.currentTimeMillis() - this.f14462g1 > 200) || Math.abs(i10) > Math.abs(i11) || Math.abs(i11) < i12) {
                                    z10 = true;
                                }
                                this.f14453c1 = x10;
                                this.f14455d1 = y3;
                                getParent().requestDisallowInterceptTouchEvent(z10);
                                C(x10, y3);
                                return true;
                            }
                            if (rectF.contains(this.f14457e1, this.f14460f1)) {
                                int i13 = this.f14457e1 - x10;
                                int i14 = this.f14460f1 - y3;
                                if (Math.sqrt((i14 * i14) + (i13 * i13)) > i12 || System.currentTimeMillis() - this.f14462g1 > 200) {
                                    this.f14477r0 = true;
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
                    if (rectF.contains(this.f14457e1, this.f14460f1) && !this.f14477r0) {
                        c(false);
                    }
                    h[] hVarArr = jVar.f14505n;
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
                    this.f14477r0 = false;
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
            this.f14462g1 = System.currentTimeMillis();
            getParent().requestDisallowInterceptTouchEvent(true);
            if (!jVar.a(x10, y3, motionEvent.getActionIndex())) {
                this.f14453c1 = x10;
                this.f14457e1 = x10;
                this.f14455d1 = y3;
                this.f14460f1 = y3;
                if (rectF.contains(x10, y3)) {
                    if (this.f14479s0 < 0 || !this.f14466i1) {
                        this.f14477r0 = true;
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
            if (((lg.f) arrayList.get(i12)).f16063n) {
                long rMaxQ = ((lg.f) arrayList.get(i12)).f16053a.f15047b.rMaxQ(i10, i11);
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
            if (((lg.f) arrayList.get(i12)).f16063n) {
                long rMinQ = ((lg.f) arrayList.get(i12)).f16053a.f15047b.rMinQ(i10, i11);
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
        this.f14468j1 = cVar;
    }

    public void setLandscape(boolean z10) {
        this.I = z10;
    }

    public void t() {
        this.L.setStrokeWidth(1.0f);
        this.M.setStrokeWidth(l1);
        TextPaint textPaint = this.N;
        float f7 = f14431m1;
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
        this.f14480t0 = g10;
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
            boolean z10 = fVar.f16063n;
            kg.a aVar = fVar.f16053a;
            if (z10) {
                long j10 = aVar.e;
                if (((float) j10) > this.f14467j0) {
                    this.f14467j0 = (float) j10;
                }
            }
            if (z10) {
                long j11 = aVar.f15049f;
                if (((float) j11) < this.f14469k0) {
                    this.f14469k0 = (float) j11;
                }
            }
            float f7 = this.f14467j0;
            float f10 = this.f14469k0;
            if (f7 == f10) {
                this.f14467j0 = f7 + 1.0f;
                this.f14469k0 = f10 - 1.0f;
            }
        }
    }

    public final void v() {
        int measuredHeight = getMeasuredHeight() - this.f14478s;
        float f7 = this.f14485x;
        if (f7 != 0.0f && measuredHeight != 0) {
            this.E = (f7 / measuredHeight) * f14431m1;
        }
    }

    public final void w() {
        float f7;
        if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            float f10 = f14430k1;
            this.C0 = getMeasuredWidth() - (2.0f * f10);
            this.D0 = f10;
            float measuredWidth = getMeasuredWidth();
            if (this.I) {
                f7 = f14437s1;
            } else {
                f7 = f10;
            }
            float f11 = measuredWidth - f7;
            this.E0 = f11;
            float f12 = f11 - this.D0;
            this.F0 = f12;
            j jVar = this.f14461g0;
            this.G0 = f12 / (jVar.f14503l - jVar.f14502k);
            I();
            this.f14478s = AndroidUtilities.dp(100.0f);
            this.H0.set(this.D0 - f10, 0.0f, this.E0 + f10, getMeasuredHeight() - this.f14478s);
            if (this.f14463h0 != null) {
                this.f14473o0 = (int) (AndroidUtilities.dp(20.0f) / (this.C0 / this.f14463h0.f15052a.length));
            }
            v();
        }
    }

    public final void x(float f7) {
        int i10;
        float f10;
        kg.b bVar = this.f14463h0;
        if (bVar != null && (i10 = this.f14479s0) >= 0) {
            long[] jArr = bVar.f15052a;
            if (i10 < jArr.length && this.f14481u0) {
                this.f14480t0.c(i10, jArr[i10], this.d, false, bVar.f15058j, bVar.h);
                this.f14480t0.setVisibility(0);
                this.f14480t0.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
                float f11 = (this.f14463h0.f15053b[this.f14479s0] * this.G0) - f7;
                int i11 = (f11 > ((this.D0 + this.F0) / 2.0f) ? 1 : (f11 == ((this.D0 + this.F0) / 2.0f) ? 0 : -1));
                int i12 = f14442x1;
                if (i11 > 0) {
                    f10 = f11 - (this.f14480t0.getWidth() + i12);
                } else {
                    f10 = f11 + i12;
                }
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                } else if (this.f14480t0.getMeasuredWidth() + f10 > getMeasuredWidth()) {
                    f10 = getMeasuredWidth() - this.f14480t0.getMeasuredWidth();
                }
                this.f14480t0.setTranslationX(f10);
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
            this.f14472n0 = i10;
            int i11 = this.f14472n0;
            if (i11 >= this.m0) {
                break;
            }
            final lg.f fVar = (lg.f) arrayList.get(i11);
            if (fVar.f16063n && (valueAnimator3 = fVar.f16058i) != null) {
                valueAnimator3.cancel();
            }
            if (!fVar.f16063n && (valueAnimator2 = fVar.h) != null) {
                valueAnimator2.cancel();
            }
            if (fVar.f16063n && fVar.f16064o != 1.0f) {
                ValueAnimator valueAnimator4 = fVar.h;
                if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                    ValueAnimator e = e(fVar.f16064o, 1.0f, new ValueAnimator.AnimatorUpdateListener(this) {
                        public final g f14421b;

                        {
                            this.f14421b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                            switch (r3) {
                                case 0:
                                    g gVar = this.f14421b;
                                    gVar.getClass();
                                    fVar.f16064o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    gVar.H = true;
                                    gVar.invalidate();
                                    return;
                                default:
                                    g gVar2 = this.f14421b;
                                    gVar2.getClass();
                                    fVar.f16064o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    gVar2.H = true;
                                    gVar2.invalidate();
                                    return;
                            }
                        }
                    });
                    fVar.h = e;
                    e.start();
                } else {
                    i10 = this.f14472n0 + 1;
                }
            }
            if (!fVar.f16063n && fVar.f16064o != 0.0f && ((valueAnimator = fVar.f16058i) == null || !valueAnimator.isRunning())) {
                ValueAnimator e7 = e(fVar.f16064o, 0.0f, new ValueAnimator.AnimatorUpdateListener(this) {
                    public final g f14421b;

                    {
                        this.f14421b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                        switch (r3) {
                            case 0:
                                g gVar = this.f14421b;
                                gVar.getClass();
                                fVar.f16064o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                gVar.H = true;
                                gVar.invalidate();
                                return;
                            default:
                                g gVar2 = this.f14421b;
                                gVar2.getClass();
                                fVar.f16064o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                gVar2.H = true;
                                gVar2.invalidate();
                                return;
                        }
                    }
                });
                fVar.f16058i = e7;
                e7.start();
            }
            i10 = this.f14472n0 + 1;
        }
        K();
        if (this.f14481u0) {
            lg.e eVar = this.f14480t0;
            int i12 = this.f14479s0;
            kg.b bVar = this.f14463h0;
            eVar.c(i12, bVar.f15052a[i12], arrayList, true, bVar.f15058j, bVar.h);
        }
    }

    public void q(lg.j jVar) {
    }

    public void y() {
    }
}
