package hg;

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
import bi.u3;
import gg.t1;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.a2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.wr;
import org.telegram.ui.pa1;
import org.telegram.ui.ul0;
public abstract class g extends View implements i {
    public static final boolean A1;
    public static final boolean B1;
    public static final u1.a C1;
    public static final float f9332k1 = AndroidUtilities.dpf2(16.0f);
    public static final float l1 = AndroidUtilities.dpf2(1.5f);
    public static final float f9333m1 = AndroidUtilities.dpf2(12.0f);
    public static final int f9334n1 = AndroidUtilities.dp(18.0f);
    public static final int f9335o1 = AndroidUtilities.dp(14.0f);
    public static final int f9336p1 = AndroidUtilities.dp(10.0f);
    public static final int f9337q1 = AndroidUtilities.dp(16.0f);
    public static final int f9338r1 = AndroidUtilities.dp(24.0f);
    public static final int f9339s1 = AndroidUtilities.dp(16.0f);
    public static final int f9340t1 = AndroidUtilities.dp(10.0f);
    public static final int f9341u1 = AndroidUtilities.dp(12.0f);
    public static final int f9342v1 = AndroidUtilities.dp(8.0f);
    public static final int f9343w1 = AndroidUtilities.dp(6.0f);
    public static final int f9344x1 = AndroidUtilities.dp(5.0f);
    public static final int f9345y1 = AndroidUtilities.dp(2.0f);
    public static final int f9346z1 = AndroidUtilities.dp(1.0f);
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
    public final bi.h O0;
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
    public f f9347a;
    public AnimatorSet f9348a0;
    public final ArrayList f9349a1;
    public final ArrayList f9350b;
    public ValueAnimator f9351b0;
    public long f9352b1;
    public final ArrayList f9353c;
    public ValueAnimator f9354c0;
    public int f9355c1;
    public final ArrayList d;
    public Animator f9356d0;
    public int f9357d1;
    public boolean e;
    public ValueAnimator f9358e0;
    public int f9359e1;
    public float f9360f;
    public boolean f9361f0;
    public int f9362f1;
    public final j f9363g0;
    public long f9364g1;
    public float h;
    public ig.b f9365h0;
    public boolean f9366h1;
    public jg.b f9367i0;
    public boolean f9368i1;
    public float f9369j0;
    public jg.c f9370j1;
    public float f9371k0;
    public float f9372l0;
    public int m0;
    public int f9373n;
    public int f9374n0;
    public int f9375o0;
    public Bitmap f9376p0;
    public Canvas f9377q0;
    public int f9378r;
    public boolean f9379r0;
    public int f9380s;
    public int f9381s0;
    public jg.e f9382t0;
    public boolean f9383u0;
    public float v;
    public float f9384v0;
    public float f9385w;
    public boolean f9386w0;
    public float f9387x;
    public boolean f9388x0;
    public float f9389y;
    public int f9390y0;
    public jg.j f9391z0;

    static {
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        boolean z11 = false;
        if (i10 < 28) {
            z10 = true;
        } else {
            z10 = false;
        }
        A1 = z10;
        if (i10 > 21) {
            z11 = true;
        }
        B1 = z11;
        C1 = new u1.a();
    }

    public g(Context context, f6 f6Var) {
        super(context);
        this.f9350b = new ArrayList(10);
        this.f9353c = new ArrayList(25);
        this.d = new ArrayList();
        this.e = true;
        this.v = 250.0f;
        this.f9385w = 0.0f;
        this.f9387x = 0.0f;
        this.f9389y = 0.0f;
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
        this.f9361f0 = false;
        ?? obj = new Object();
        obj.h = new Rect();
        obj.f9402i = new Rect();
        obj.f9403j = new Rect();
        obj.f9404k = 0.7f;
        obj.f9405l = 1.0f;
        obj.f9406m = 0.1f;
        obj.f9407n = new h[]{null, null};
        obj.f9397a = this;
        this.f9363g0 = obj;
        this.f9379r0 = false;
        this.f9381s0 = -1;
        this.f9383u0 = false;
        this.f9384v0 = 0.0f;
        this.f9386w0 = false;
        this.f9388x0 = false;
        this.f9390y0 = 0;
        this.B0 = AndroidUtilities.dp(46.0f);
        this.H0 = new RectF();
        this.J0 = new d(this, 0);
        this.K0 = new d(this, 1);
        this.L0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final g f9321b;

            {
                this.f9321b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        g gVar = this.f9321b;
                        gVar.getClass();
                        gVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar.invalidate();
                        return;
                    default:
                        g gVar2 = this.f9321b;
                        gVar2.getClass();
                        gVar2.f9385w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar2.invalidate();
                        return;
                }
            }
        };
        this.M0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final g f9321b;

            {
                this.f9321b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        g gVar = this.f9321b;
                        gVar.getClass();
                        gVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar.invalidate();
                        return;
                    default:
                        g gVar2 = this.f9321b;
                        gVar2.getClass();
                        gVar2.f9385w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar2.invalidate();
                        return;
                }
            }
        };
        this.N0 = new d(this, 2);
        this.O0 = new bi.h(this, 12);
        this.P0 = false;
        this.X0 = 0;
        this.Y0 = 0;
        Rect rect = new Rect();
        this.Z0 = rect;
        ArrayList arrayList = new ArrayList();
        this.f9349a1 = arrayList;
        arrayList.add(rect);
        this.f9352b1 = 0L;
        this.f9368i1 = false;
        this.W0 = f6Var;
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
        if (this.f9365h0 == null) {
            return;
        }
        float f7 = this.F0;
        j jVar = this.f9363g0;
        this.G0 = f7 / (jVar.f9405l - jVar.f9404k);
        H();
        if (this.P0) {
            j3 = s(this.F, this.G);
        } else {
            j3 = 0;
        }
        E(r(this.F, this.G), j3, z10, z11, z12);
        if (this.f9383u0 && !z11) {
            c(false);
            x((this.G0 * jVar.f9404k) - f9332k1);
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
        int i12 = this.f9381s0;
        ig.b bVar = this.f9365h0;
        if (bVar != null) {
            float f7 = this.G0;
            float f10 = (this.f9363g0.f9404k * f7) - f9332k1;
            float f11 = (i10 + f10) / f7;
            if (f11 < 0.0f) {
                this.f9381s0 = 0;
            } else if (f11 > 1.0f) {
                this.f9381s0 = bVar.f10590a.length - 1;
            } else {
                int b10 = bVar.b(f11, this.F, this.G);
                this.f9381s0 = b10;
                int i13 = b10 + 1;
                float[] fArr = this.f9365h0.f10591b;
                if (i13 < fArr.length) {
                    if (Math.abs(this.f9365h0.f10591b[this.f9381s0 + 1] - f11) < Math.abs(fArr[b10] - f11)) {
                        this.f9381s0++;
                    }
                }
            }
            int i14 = this.f9381s0;
            int i15 = this.G;
            if (i14 > i15) {
                this.f9381s0 = i15;
            }
            int i16 = this.f9381s0;
            int i17 = this.F;
            if (i16 < i17) {
                this.f9381s0 = i17;
            }
            if (i12 != this.f9381s0) {
                this.f9383u0 = true;
                c(true);
                x(f10);
                e eVar = this.Q0;
                if (eVar != null) {
                    getSelectedDate();
                    pa1 pa1Var = (pa1) ((ul0) eVar).f37294b;
                    pa1Var.f();
                    pa1Var.f35753b.f9382t0.d(false, false);
                }
                B();
                invalidate();
            }
        }
    }

    public boolean D(ig.b bVar) {
        boolean z10;
        ig.b bVar2 = this.f9365h0;
        long j3 = 0;
        j jVar = this.f9363g0;
        ArrayList arrayList = this.d;
        if (bVar2 != bVar) {
            invalidate();
            arrayList.clear();
            if (bVar != null && bVar.d != null) {
                for (int i10 = 0; i10 < bVar.d.size(); i10++) {
                    arrayList.add(h((ig.a) bVar.d.get(i10)));
                }
            }
            d();
            this.f9365h0 = bVar;
            if (bVar != null) {
                if (bVar.f10590a[0] == 0) {
                    jVar.f9404k = 0.0f;
                    jVar.f9405l = 1.0f;
                } else {
                    float minDistance = getMinDistance();
                    jVar.f9406m = minDistance;
                    float f7 = jVar.f9405l;
                    if (f7 - jVar.f9404k < minDistance) {
                        float f10 = f7 - minDistance;
                        jVar.f9404k = f10;
                        if (f10 < 0.0f) {
                            jVar.f9404k = 0.0f;
                            jVar.f9405l = 1.0f;
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
            this.f9369j0 = 0.0f;
            this.f9371k0 = 2.1474836E9f;
            u();
            int i11 = bVar.f10596j;
            if (i11 != 1 && i11 != 2) {
                this.f9382t0.setSize(arrayList.size());
            } else {
                this.f9382t0.setSize(arrayList.size() * 2);
            }
            this.H = true;
            I();
            return z10;
        }
        jVar.f9404k = 0.7f;
        jVar.f9405l = 1.0f;
        this.f9371k0 = 0.0f;
        this.f9369j0 = 0.0f;
        this.f9350b.clear();
        AnimatorSet animatorSet = this.f9348a0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator valueAnimator = this.f9351b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f9351b0.cancel();
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
        if ((Math.abs(((float) (((long) Math.ceil(((float) j11) / 5.0f)) * 5)) - this.f9387x) >= this.E && j3 != 0) || ((float) j3) != this.f9389y) {
            jg.d f10 = f(this.f9365h0.f10595i, j3, j10);
            long[] jArr = f10.f11899a;
            long j12 = jArr[jArr.length - 1];
            long j13 = jArr[0];
            if (!z12) {
                float f11 = this.v - this.f9385w;
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
                if (((float) j12) != this.f9387x) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (this.P0 && ((float) j13) != this.f9389y) {
                    z13 = true;
                }
                if (z13) {
                    AnimatorSet animatorSet = this.f9348a0;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        this.f9348a0.cancel();
                    }
                    this.T0 = this.v;
                    this.U0 = this.f9385w;
                    this.R0 = 0.0f;
                    this.S0 = 0.0f;
                    this.V0 = f7;
                }
            }
            float f14 = (float) j12;
            this.f9387x = f14;
            float f15 = (float) j13;
            this.f9389y = f15;
            v();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f9352b1 < 320 && !z11) {
                return;
            }
            this.f9352b1 = currentTimeMillis;
            ValueAnimator valueAnimator = this.f9351b0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f9351b0.cancel();
            }
            ArrayList arrayList = this.f9350b;
            if (!z10) {
                this.v = f14;
                this.f9385w = f15;
                arrayList.clear();
                arrayList.add(f10);
                f10.f11902f = 255;
                return;
            }
            arrayList.add(f10);
            if (z12) {
                AnimatorSet animatorSet2 = this.f9348a0;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    this.f9348a0.cancel();
                }
                this.V0 = 0.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(e(this.v, f14, this.L0));
                if (this.P0) {
                    animatorSet3.playTogether(e(this.f9385w, f15, this.M0));
                }
                this.f9348a0 = animatorSet3;
                animatorSet3.start();
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                jg.d dVar = (jg.d) arrayList.get(i10);
                if (dVar != f10) {
                    dVar.f11903g = dVar.f11902f;
                }
            }
            ValueAnimator e = e(0.0f, 255.0f, new t1(1, this, f10));
            this.f9351b0 = e;
            e.addListener(new u3(4, this, f10));
            this.f9351b0.start();
        }
    }

    public final void F() {
        float f7 = this.V0;
        if (f7 != 0.0f) {
            float f10 = this.v;
            float f11 = this.f9387x;
            if (f10 != f11) {
                float f12 = this.R0 + f7;
                this.R0 = f12;
                if (f12 > 1.0f) {
                    this.R0 = 1.0f;
                    this.v = f11;
                } else {
                    float f13 = this.T0;
                    this.v = (wr.f28820g.getInterpolation(f12) * (f11 - f13)) + f13;
                }
                invalidate();
            }
            if (this.P0) {
                float f14 = this.f9385w;
                float f15 = this.f9389y;
                if (f14 != f15) {
                    float f16 = this.S0 + this.V0;
                    this.S0 = f16;
                    if (f16 > 1.0f) {
                        this.S0 = 1.0f;
                        this.f9385w = f15;
                    } else {
                        float f17 = this.U0;
                        this.f9385w = (wr.f28820g.getInterpolation(f16) * (f15 - f17)) + f17;
                    }
                    invalidate();
                }
            }
        }
    }

    public final void G() {
        int i10;
        int i11;
        if (this.f9388x0) {
            i10 = j6.Zi;
        } else {
            i10 = j6.Yi;
        }
        f6 f6Var = this.W0;
        int v02 = j6.v0(i10, f6Var);
        TextPaint textPaint = this.N;
        textPaint.setColor(v02);
        if (this.f9388x0) {
            i11 = j6.Zi;
        } else {
            i11 = j6.Yi;
        }
        this.O.setColor(j6.v0(i11, f6Var));
        int v03 = j6.v0(j6.Yi, f6Var);
        TextPaint textPaint2 = this.P;
        textPaint2.setColor(v03);
        int v04 = j6.v0(j6.aj, f6Var);
        Paint paint = this.L;
        paint.setColor(v04);
        int v05 = j6.v0(j6.bj, f6Var);
        Paint paint2 = this.M;
        paint2.setColor(v05);
        this.Q.setColor(j6.v0(j6.dj, f6Var));
        this.R.setColor(j6.v0(j6.cj, f6Var));
        this.S.setColor(j6.v0(j6.f17928d6, f6Var));
        this.T.setColor(j6.v0(j6.ej, f6Var));
        this.f9382t0.b();
        this.f9373n = paint.getAlpha();
        this.f9378r = paint2.getAlpha();
        this.f9360f = textPaint.getAlpha() / 255.0f;
        this.h = textPaint2.getAlpha() / 255.0f;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((jg.f) obj).a();
        }
        if (this.f9383u0) {
            int i13 = this.f9381s0;
            ig.b bVar = this.f9365h0;
            long[] jArr = bVar.f10590a;
            if (i13 < jArr.length) {
                this.f9382t0.c(i13, jArr[i13], arrayList, false, bVar.f10596j, bVar.h);
            }
        }
        this.H = true;
    }

    public final void H() {
        ig.b bVar = this.f9365h0;
        if (bVar == null) {
            return;
        }
        j jVar = this.f9363g0;
        int c10 = bVar.c(Math.max(jVar.f9404k, 0.0f));
        this.F = c10;
        int a2 = this.f9365h0.a(Math.min(jVar.f9405l, 1.0f), c10);
        this.G = a2;
        int i10 = this.F;
        if (a2 < i10) {
            this.G = i10;
        }
        jg.c cVar = this.f9370j1;
        if (cVar != null) {
            long[] jArr = this.f9365h0.f10590a;
            cVar.b(jArr[i10], jArr[this.G]);
        }
        I();
    }

    public final void I() {
        ig.b bVar = this.f9365h0;
        if (bVar != null) {
            float f7 = this.F0;
            if (f7 != 0.0f) {
                int i10 = (int) ((f7 / (this.G0 * bVar.f10594g)) / 6.0f);
                jg.b bVar2 = this.f9367i0;
                if (bVar2 == null || i10 >= bVar2.f11891b || i10 <= bVar2.f11892c) {
                    int highestOneBit = Integer.highestOneBit(i10) << 1;
                    jg.b bVar3 = this.f9367i0;
                    if (bVar3 == null || bVar3.f11890a != highestOneBit) {
                        ValueAnimator valueAnimator = this.f9354c0;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllListeners();
                            this.f9354c0.cancel();
                        }
                        double d = highestOneBit;
                        double d10 = 0.2d * d;
                        jg.b bVar4 = new jg.b(highestOneBit, (int) (d + d10), (int) (d - d10));
                        bVar4.d = 255;
                        jg.b bVar5 = this.f9367i0;
                        ArrayList arrayList = this.f9353c;
                        if (bVar5 == null) {
                            this.f9367i0 = bVar4;
                            bVar4.d = 255;
                            arrayList.add(bVar4);
                            return;
                        }
                        this.f9367i0 = bVar4;
                        this.m0 = arrayList.size();
                        for (int i11 = 0; i11 < this.m0; i11++) {
                            jg.b bVar6 = (jg.b) arrayList.get(i11);
                            bVar6.e = bVar6.d;
                        }
                        arrayList.add(bVar4);
                        if (arrayList.size() > 2) {
                            arrayList.remove(0);
                        }
                        ValueAnimator duration = e(0.0f, 1.0f, new t1(2, this, bVar4)).setDuration(200L);
                        this.f9354c0 = duration;
                        duration.addListener(new u3(5, this, bVar4));
                        this.f9354c0.start();
                    }
                }
            }
        }
    }

    public void J(ig.b bVar, long j3) {
        int length = bVar.f10590a.length;
        long j10 = j3 - (j3 % 86400000);
        long j11 = 86399999 + j10;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            long j12 = bVar.f10590a[i12];
            if (j10 > j12) {
                i10 = i12;
            }
            if (j11 > j12) {
                i11 = i12;
            }
        }
        float[] fArr = bVar.f10591b;
        float f7 = fArr[i10];
        j jVar = this.f9363g0;
        jVar.f9404k = f7;
        jVar.f9405l = fArr[i11];
    }

    public void K() {
        if (B1) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j3 = Long.MAX_VALUE;
            long j10 = 0;
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                jg.f fVar = (jg.f) obj;
                boolean z10 = fVar.f11924n;
                ig.a aVar = fVar.f11914a;
                if (z10) {
                    long j11 = aVar.e;
                    if (j11 > j10) {
                        j10 = j11;
                    }
                }
                if (z10) {
                    long j12 = aVar.f10587f;
                    if (j12 < j3) {
                        j3 = j12;
                    }
                }
            }
            if ((j3 != 2147483647L && ((float) j3) != 0.0f) || (j10 > 0 && ((float) j10) != this.f9372l0)) {
                this.f9372l0 = (float) j10;
                Animator animator = this.f9356d0;
                if (animator != null) {
                    animator.cancel();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(e(this.f9369j0, this.f9372l0, this.J0), e(this.f9371k0, 0.0f, this.K0));
                this.f9356d0 = animatorSet;
                animatorSet.start();
            }
        }
    }

    @Override
    public void a(float f7, float f10, boolean z10) {
        ig.b bVar = this.f9365h0;
        if (bVar == null) {
            return;
        }
        if (z10) {
            int c10 = bVar.c(Math.max(f7, 0.0f));
            int a2 = this.f9365h0.a(Math.min(f10, 1.0f), c10);
            E(r(c10, a2), s(c10, a2), true, true, false);
            c(false);
            return;
        }
        H();
        invalidate();
    }

    public final void c(boolean z10) {
        float f7;
        x((this.G0 * this.f9363g0.f9404k) - f9332k1);
        if (this.f9368i1 == z10) {
            return;
        }
        this.f9368i1 = z10;
        ValueAnimator valueAnimator = this.f9358e0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f9358e0.cancel();
        }
        float f10 = this.f9384v0;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator duration = e(f10, f7, this.N0).setDuration(200L);
        this.f9358e0 = duration;
        duration.addListener(this.O0);
        this.f9358e0.start();
    }

    public final void d() {
        this.f9381s0 = -1;
        this.f9383u0 = false;
        this.f9368i1 = false;
        this.f9382t0.setVisibility(8);
        this.f9384v0 = 0.0f;
    }

    public jg.d f(int i10, long j3, long j10) {
        return new jg.d(j3, j10, this.P0, this.f9365h0.h, i10, this.N, this.O);
    }

    public jg.e g() {
        return new jg.e(getContext(), this.W0);
    }

    public long getEndDate() {
        return this.f9365h0.f10590a[this.G];
    }

    public float getMinDistance() {
        ig.b bVar = this.f9365h0;
        if (bVar == null) {
            return 0.1f;
        }
        int length = bVar.f10590a.length;
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
        int i10 = this.f9381s0;
        if (i10 < 0) {
            return -1L;
        }
        return this.f9365h0.f10590a[i10];
    }

    public long getStartDate() {
        return this.f9365h0.f10590a[this.F];
    }

    public abstract jg.f h(ig.a aVar);

    public void i(Canvas canvas) {
        int measuredHeight;
        if (this.f9365h0 != null) {
            int i10 = this.f9390y0;
            float f7 = 1.0f;
            if (i10 == 2) {
                f7 = 1.0f - this.f9391z0.f11933f;
            } else if (i10 == 1) {
                f7 = this.f9391z0.f11933f;
            } else if (i10 == 3) {
                f7 = this.f9391z0.f11933f;
            }
            Paint paint = this.L;
            paint.setAlpha((int) (this.f9373n * f7));
            TextPaint textPaint = this.N;
            textPaint.setAlpha((int) (this.f9360f * 255.0f * f7));
            this.O.setAlpha((int) (this.f9360f * 255.0f * f7));
            int textSize = (int) (f9334n1 - textPaint.getTextSize());
            float measuredHeight2 = (getMeasuredHeight() - this.f9380s) - 1;
            canvas.drawLine(this.D0, measuredHeight2, this.E0, measuredHeight2, paint);
            if (this.P0) {
                return;
            }
            canvas.drawText("0", f9332k1, measuredHeight - textSize, textPaint);
        }
    }

    public void j(Canvas canvas) {
        float f7;
        int i10;
        if (this.f9365h0 != null) {
            ArrayList arrayList = this.f9353c;
            this.m0 = arrayList.size();
            int i11 = this.f9390y0;
            float f10 = 1.0f;
            int i12 = 1;
            if (i11 == 2) {
                f7 = 1.0f - this.f9391z0.f11933f;
            } else if (i11 == 1) {
                f7 = this.f9391z0.f11933f;
            } else if (i11 == 3) {
                f7 = this.f9391z0.f11933f;
            } else {
                f7 = 1.0f;
            }
            char c10 = 0;
            this.f9374n0 = 0;
            while (true) {
                int i13 = this.f9374n0;
                if (i13 < this.m0) {
                    int i14 = ((jg.b) arrayList.get(i13)).d;
                    int i15 = ((jg.b) arrayList.get(this.f9374n0)).f11890a;
                    if (i15 == 0) {
                        i15 = 1;
                    }
                    int i16 = this.F - this.f9375o0;
                    while (i16 % i15 != 0) {
                        i16--;
                    }
                    int i17 = this.G - this.f9375o0;
                    while (true) {
                        if (i17 % i15 == 0 && i17 >= this.f9365h0.f10590a.length - i12) {
                            break;
                        }
                        i17++;
                        i14 = i14;
                        c10 = 0;
                        f10 = 1.0f;
                        i12 = 1;
                    }
                    int i18 = this.f9375o0;
                    int i19 = i16 + i18;
                    int i20 = i17 + i18;
                    float f11 = this.G0 * this.f9363g0.f9404k;
                    float f12 = f9332k1;
                    float f13 = f11 - f12;
                    while (i19 < i20) {
                        if (i19 >= 0) {
                            long[] jArr = this.f9365h0.f10590a;
                            if (i19 < jArr.length - i12) {
                                long j3 = jArr[i19];
                                long j10 = jArr[c10];
                                i10 = i14;
                                float f14 = ((((float) (j3 - j10)) / ((float) (jArr[jArr.length - i12] - j10))) * this.G0) - f13;
                                float f15 = f14 - f9340t1;
                                if (f15 > 0.0f) {
                                    float f16 = this.F0;
                                    if (f15 <= f16 + f12) {
                                        float f17 = f9336p1;
                                        TextPaint textPaint = this.P;
                                        if (f15 < f17) {
                                            textPaint.setAlpha((int) (i10 * a2.y(f17, f15, f17, f10) * this.h * f7));
                                        } else if (f15 > f16) {
                                            textPaint.setAlpha((int) (i10 * a2.y(f15, f16, f12, f10) * this.h * f7));
                                        } else {
                                            textPaint.setAlpha((int) (i10 * this.h * f7));
                                        }
                                        ig.b bVar = this.f9365h0;
                                        String[] strArr = bVar.f10592c;
                                        long[] jArr2 = bVar.f10590a;
                                        canvas.drawText(strArr[(int) ((jArr2[i19] - jArr2[0]) / bVar.f10597k)], f14, AndroidUtilities.dp(3.0f) + (getMeasuredHeight() - this.f9380s) + f9335o1, textPaint);
                                        i19 += i15;
                                        i14 = i10;
                                        c10 = 0;
                                        f10 = 1.0f;
                                        i12 = 1;
                                    }
                                }
                                i19 += i15;
                                i14 = i10;
                                c10 = 0;
                                f10 = 1.0f;
                                i12 = 1;
                            }
                        }
                        i10 = i14;
                        i19 += i15;
                        i14 = i10;
                        c10 = 0;
                        f10 = 1.0f;
                        i12 = 1;
                    }
                    this.f9374n0++;
                    c10 = 0;
                    f10 = 1.0f;
                    i12 = 1;
                } else {
                    return;
                }
            }
        }
    }

    public abstract void k(Canvas canvas);

    public void l(android.graphics.Canvas r12, jg.d r13) {
        throw new UnsupportedOperationException("Method not decompiled: hg.g.l(android.graphics.Canvas, jg.d):void");
    }

    public final void m(android.graphics.Canvas r39) {
        throw new UnsupportedOperationException("Method not decompiled: hg.g.m(android.graphics.Canvas):void");
    }

    public abstract void n(Canvas canvas);

    public void o(Canvas canvas) {
        ig.b bVar;
        int i10 = this.f9381s0;
        if (i10 >= 0 && this.f9383u0 && (bVar = this.f9365h0) != null) {
            int i11 = (int) (this.f9378r * this.f9384v0);
            float f7 = this.F0;
            j jVar = this.f9363g0;
            float f10 = jVar.f9405l;
            float f11 = jVar.f9404k;
            float f12 = f7 / (f10 - f11);
            float f13 = (f11 * f12) - f9332k1;
            float[] fArr = bVar.f10591b;
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
                        this.f9374n0 = i12;
                        int i13 = this.f9374n0;
                        if (i13 < this.m0) {
                            jg.f fVar = (jg.f) arrayList.get(i13);
                            boolean z10 = fVar.f11924n;
                            Paint paint2 = fVar.d;
                            if (z10 || fVar.f11925o != 0.0f) {
                                float f15 = (float) fVar.f11914a.f10584a[this.f9381s0];
                                float f16 = this.f9385w;
                                float measuredHeight = (getMeasuredHeight() - this.f9380s) - (((f15 - f16) / (this.v - f16)) * ((getMeasuredHeight() - this.f9380s) - f9334n1));
                                paint2.setAlpha((int) (fVar.f11925o * 255.0f * this.f9384v0));
                                Paint paint3 = this.S;
                                paint3.setAlpha((int) (fVar.f11925o * 255.0f * this.f9384v0));
                                canvas.drawPoint(f14, measuredHeight, paint2);
                                canvas.drawPoint(f14, measuredHeight, paint3);
                            }
                            i12 = this.f9374n0 + 1;
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
        if (this.f9386w0) {
            super.onDraw(canvas);
            return;
        }
        F();
        int save = canvas.save();
        RectF rectF = this.H0;
        canvas.clipRect(0.0f, rectF.top, getMeasuredWidth(), rectF.bottom);
        i(canvas);
        ArrayList arrayList = this.f9350b;
        this.m0 = arrayList.size();
        int i10 = 0;
        this.f9374n0 = 0;
        while (true) {
            int i11 = this.f9374n0;
            if (i11 >= this.m0) {
                break;
            }
            l(canvas, (jg.d) arrayList.get(i11));
            this.f9374n0++;
        }
        k(canvas);
        while (true) {
            this.f9374n0 = i10;
            int i12 = this.f9374n0;
            if (i12 < this.m0) {
                p(canvas, (jg.d) arrayList.get(i12));
                i10 = this.f9374n0 + 1;
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
            float f7 = f9332k1;
            float f10 = 2.0f * f7;
            this.f9376p0 = Bitmap.createBitmap((int) (getMeasuredWidth() - f10), i13, Bitmap.Config.ARGB_4444);
            this.f9377q0 = new Canvas(this.f9376p0);
            this.f9347a.a(i13, (int) (getMeasuredWidth() - f10));
            w();
            if (this.f9383u0) {
                x((this.G0 * this.f9363g0.f9404k) - f7);
            }
            A(false, true, false);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int measuredHeight = getMeasuredHeight();
            int i14 = f9337q1;
            this.Z0.set(0, measuredHeight - ((i13 + i14) + i14), getMeasuredWidth(), getMeasuredHeight());
            setSystemGestureExclusionRects(this.f9349a1);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        long j3;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean z10 = false;
        if (this.f9365h0 != null) {
            boolean z11 = this.J;
            j jVar = this.f9363g0;
            if (!z11) {
                jVar.c(motionEvent.getActionIndex(), motionEvent);
                getParent().requestDisallowInterceptTouchEvent(false);
                this.f9379r0 = false;
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
                        int i10 = x10 - this.f9355c1;
                        int i11 = y3 - this.f9357d1;
                        if (jVar.f9407n[0] == null && !jVar.f9399c) {
                            boolean z12 = this.f9379r0;
                            int i12 = this.A0;
                            if (z12) {
                                if ((this.f9366h1 && System.currentTimeMillis() - this.f9364g1 > 200) || Math.abs(i10) > Math.abs(i11) || Math.abs(i11) < i12) {
                                    z10 = true;
                                }
                                this.f9355c1 = x10;
                                this.f9357d1 = y3;
                                getParent().requestDisallowInterceptTouchEvent(z10);
                                C(x10, y3);
                                return true;
                            }
                            if (rectF.contains(this.f9359e1, this.f9362f1)) {
                                int i13 = this.f9359e1 - x10;
                                int i14 = this.f9362f1 - y3;
                                if (Math.sqrt((i14 * i14) + (i13 * i13)) > i12 || System.currentTimeMillis() - this.f9364g1 > 200) {
                                    this.f9379r0 = true;
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
                    if (rectF.contains(this.f9359e1, this.f9362f1) && !this.f9379r0) {
                        c(false);
                    }
                    h[] hVarArr = jVar.f9407n;
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
                    this.f9379r0 = false;
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
            this.f9364g1 = System.currentTimeMillis();
            getParent().requestDisallowInterceptTouchEvent(true);
            if (!jVar.a(x10, y3, motionEvent.getActionIndex())) {
                this.f9355c1 = x10;
                this.f9359e1 = x10;
                this.f9357d1 = y3;
                this.f9362f1 = y3;
                if (rectF.contains(x10, y3)) {
                    if (this.f9381s0 < 0 || !this.f9368i1) {
                        this.f9379r0 = true;
                        C(x10, y3);
                        return true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public void p(android.graphics.Canvas r14, jg.d r15) {
        throw new UnsupportedOperationException("Method not decompiled: hg.g.p(android.graphics.Canvas, jg.d):void");
    }

    public long r(int i10, int i11) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        long j3 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            if (((jg.f) arrayList.get(i12)).f11924n) {
                long rMaxQ = ((jg.f) arrayList.get(i12)).f11914a.f10585b.rMaxQ(i10, i11);
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
            if (((jg.f) arrayList.get(i12)).f11924n) {
                long rMinQ = ((jg.f) arrayList.get(i12)).f11914a.f10585b.rMinQ(i10, i11);
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

    public void setHeader(jg.c cVar) {
        this.f9370j1 = cVar;
    }

    public void setLandscape(boolean z10) {
        this.I = z10;
    }

    public void t() {
        this.L.setStrokeWidth(1.0f);
        this.M.setStrokeWidth(l1);
        TextPaint textPaint = this.N;
        float f7 = f9333m1;
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
        jg.e g10 = g();
        this.f9382t0 = g10;
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
            jg.f fVar = (jg.f) obj;
            boolean z10 = fVar.f11924n;
            ig.a aVar = fVar.f11914a;
            if (z10) {
                long j3 = aVar.e;
                if (((float) j3) > this.f9369j0) {
                    this.f9369j0 = (float) j3;
                }
            }
            if (z10) {
                long j10 = aVar.f10587f;
                if (((float) j10) < this.f9371k0) {
                    this.f9371k0 = (float) j10;
                }
            }
            float f7 = this.f9369j0;
            float f10 = this.f9371k0;
            if (f7 == f10) {
                this.f9369j0 = f7 + 1.0f;
                this.f9371k0 = f10 - 1.0f;
            }
        }
    }

    public final void v() {
        int measuredHeight = getMeasuredHeight() - this.f9380s;
        float f7 = this.f9387x;
        if (f7 != 0.0f && measuredHeight != 0) {
            this.E = (f7 / measuredHeight) * f9333m1;
        }
    }

    public final void w() {
        float f7;
        if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            float f10 = f9332k1;
            this.C0 = getMeasuredWidth() - (2.0f * f10);
            this.D0 = f10;
            float measuredWidth = getMeasuredWidth();
            if (this.I) {
                f7 = f9339s1;
            } else {
                f7 = f10;
            }
            float f11 = measuredWidth - f7;
            this.E0 = f11;
            float f12 = f11 - this.D0;
            this.F0 = f12;
            j jVar = this.f9363g0;
            this.G0 = f12 / (jVar.f9405l - jVar.f9404k);
            I();
            this.f9380s = AndroidUtilities.dp(100.0f);
            this.H0.set(this.D0 - f10, 0.0f, this.E0 + f10, getMeasuredHeight() - this.f9380s);
            if (this.f9365h0 != null) {
                this.f9375o0 = (int) (AndroidUtilities.dp(20.0f) / (this.C0 / this.f9365h0.f10590a.length));
            }
            v();
        }
    }

    public final void x(float f7) {
        int i10;
        float f10;
        ig.b bVar = this.f9365h0;
        if (bVar != null && (i10 = this.f9381s0) >= 0) {
            long[] jArr = bVar.f10590a;
            if (i10 < jArr.length && this.f9383u0) {
                this.f9382t0.c(i10, jArr[i10], this.d, false, bVar.f10596j, bVar.h);
                this.f9382t0.setVisibility(0);
                this.f9382t0.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
                float f11 = (this.f9365h0.f10591b[this.f9381s0] * this.G0) - f7;
                int i11 = f9344x1;
                if (f11 > (this.D0 + this.F0) / 2.0f) {
                    f10 = f11 - (this.f9382t0.getWidth() + i11);
                } else {
                    f10 = f11 + i11;
                }
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                } else if (this.f9382t0.getMeasuredWidth() + f10 > getMeasuredWidth()) {
                    f10 = getMeasuredWidth() - this.f9382t0.getMeasuredWidth();
                }
                this.f9382t0.setTranslationX(f10);
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
            this.f9374n0 = i10;
            int i11 = this.f9374n0;
            if (i11 >= this.m0) {
                break;
            }
            final jg.f fVar = (jg.f) arrayList.get(i11);
            if (fVar.f11924n && (valueAnimator3 = fVar.f11919i) != null) {
                valueAnimator3.cancel();
            }
            if (!fVar.f11924n && (valueAnimator2 = fVar.h) != null) {
                valueAnimator2.cancel();
            }
            if (fVar.f11924n && fVar.f11925o != 1.0f) {
                ValueAnimator valueAnimator4 = fVar.h;
                if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                    ValueAnimator e = e(fVar.f11925o, 1.0f, new ValueAnimator.AnimatorUpdateListener(this) {
                        public final g f9323b;

                        {
                            this.f9323b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                            switch (r3) {
                                case 0:
                                    g gVar = this.f9323b;
                                    gVar.getClass();
                                    fVar.f11925o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    gVar.H = true;
                                    gVar.invalidate();
                                    return;
                                default:
                                    g gVar2 = this.f9323b;
                                    gVar2.getClass();
                                    fVar.f11925o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    gVar2.H = true;
                                    gVar2.invalidate();
                                    return;
                            }
                        }
                    });
                    fVar.h = e;
                    e.start();
                } else {
                    i10 = this.f9374n0 + 1;
                }
            }
            if (!fVar.f11924n && fVar.f11925o != 0.0f && ((valueAnimator = fVar.f11919i) == null || !valueAnimator.isRunning())) {
                ValueAnimator e7 = e(fVar.f11925o, 0.0f, new ValueAnimator.AnimatorUpdateListener(this) {
                    public final g f9323b;

                    {
                        this.f9323b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                        switch (r3) {
                            case 0:
                                g gVar = this.f9323b;
                                gVar.getClass();
                                fVar.f11925o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                gVar.H = true;
                                gVar.invalidate();
                                return;
                            default:
                                g gVar2 = this.f9323b;
                                gVar2.getClass();
                                fVar.f11925o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                gVar2.H = true;
                                gVar2.invalidate();
                                return;
                        }
                    }
                });
                fVar.f11919i = e7;
                e7.start();
            }
            i10 = this.f9374n0 + 1;
        }
        K();
        if (this.f9383u0) {
            jg.e eVar = this.f9382t0;
            int i12 = this.f9381s0;
            ig.b bVar = this.f9365h0;
            eVar.c(i12, bVar.f10590a[i12], arrayList, true, bVar.f10596j, bVar.h);
        }
    }

    public void q(jg.j jVar) {
    }

    public void y() {
    }
}
