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
import org.telegram.messenger.f0;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.rr;
import org.telegram.ui.ca1;
import org.telegram.ui.ml0;
public abstract class g extends View implements i {
    public static final boolean A1;
    public static final boolean B1;
    public static final u1.a C1;
    public static final float f11102k1 = AndroidUtilities.dpf2(16.0f);
    public static final float l1 = AndroidUtilities.dpf2(1.5f);
    public static final float f11103m1 = AndroidUtilities.dpf2(12.0f);
    public static final int f11104n1 = AndroidUtilities.dp(18.0f);
    public static final int f11105o1 = AndroidUtilities.dp(14.0f);
    public static final int f11106p1 = AndroidUtilities.dp(10.0f);
    public static final int f11107q1 = AndroidUtilities.dp(16.0f);
    public static final int f11108r1 = AndroidUtilities.dp(24.0f);
    public static final int f11109s1 = AndroidUtilities.dp(16.0f);
    public static final int f11110t1 = AndroidUtilities.dp(10.0f);
    public static final int f11111u1 = AndroidUtilities.dp(12.0f);
    public static final int f11112v1 = AndroidUtilities.dp(8.0f);
    public static final int f11113w1 = AndroidUtilities.dp(6.0f);
    public static final int f11114x1 = AndroidUtilities.dp(5.0f);
    public static final int f11115y1 = AndroidUtilities.dp(2.0f);
    public static final int f11116z1 = AndroidUtilities.dp(1.0f);
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
    public f f11117a;
    public AnimatorSet f11118a0;
    public final ArrayList f11119a1;
    public final ArrayList f11120b;
    public ValueAnimator f11121b0;
    public long f11122b1;
    public final ArrayList f11123c;
    public ValueAnimator f11124c0;
    public int f11125c1;
    public final ArrayList d;
    public Animator f11126d0;
    public int f11127d1;
    public boolean e;
    public ValueAnimator f11128e0;
    public int f11129e1;
    public float f11130f;
    public boolean f11131f0;
    public int f11132f1;
    public final j f11133g0;
    public long f11134g1;
    public float h;
    public jg.b f11135h0;
    public boolean f11136h1;
    public kg.b f11137i0;
    public boolean f11138i1;
    public float f11139j0;
    public kg.c f11140j1;
    public float f11141k0;
    public float f11142l0;
    public int m0;
    public int f11143n;
    public int f11144n0;
    public int f11145o0;
    public Bitmap f11146p0;
    public Canvas f11147q0;
    public int f11148r;
    public boolean f11149r0;
    public int f11150s;
    public int f11151s0;
    public kg.e f11152t0;
    public boolean f11153u0;
    public float v;
    public float f11154v0;
    public float f11155w;
    public boolean f11156w0;
    public float f11157x;
    public boolean f11158x0;
    public float f11159y;
    public int f11160y0;
    public kg.j f11161z0;

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

    public g(Context context, d6 d6Var) {
        super(context);
        this.f11120b = new ArrayList(10);
        this.f11123c = new ArrayList(25);
        this.d = new ArrayList();
        this.e = true;
        this.v = 250.0f;
        this.f11155w = 0.0f;
        this.f11157x = 0.0f;
        this.f11159y = 0.0f;
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
        this.f11131f0 = false;
        ?? obj = new Object();
        obj.h = new Rect();
        obj.f11172i = new Rect();
        obj.f11173j = new Rect();
        obj.f11174k = 0.7f;
        obj.f11175l = 1.0f;
        obj.f11176m = 0.1f;
        obj.f11177n = new h[]{null, null};
        obj.f11167a = this;
        this.f11133g0 = obj;
        this.f11149r0 = false;
        this.f11151s0 = -1;
        this.f11153u0 = false;
        this.f11154v0 = 0.0f;
        this.f11156w0 = false;
        this.f11158x0 = false;
        this.f11160y0 = 0;
        this.B0 = AndroidUtilities.dp(46.0f);
        this.H0 = new RectF();
        this.J0 = new d(this, 0);
        this.K0 = new d(this, 1);
        this.L0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final g f11091b;

            {
                this.f11091b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        g gVar = this.f11091b;
                        gVar.getClass();
                        gVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar.invalidate();
                        return;
                    default:
                        g gVar2 = this.f11091b;
                        gVar2.getClass();
                        gVar2.f11155w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar2.invalidate();
                        return;
                }
            }
        };
        this.M0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final g f11091b;

            {
                this.f11091b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        g gVar = this.f11091b;
                        gVar.getClass();
                        gVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar.invalidate();
                        return;
                    default:
                        g gVar2 = this.f11091b;
                        gVar2.getClass();
                        gVar2.f11155w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
        this.f11119a1 = arrayList;
        arrayList.add(rect);
        this.f11122b1 = 0L;
        this.f11138i1 = false;
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
        if (this.f11135h0 == null) {
            return;
        }
        float f7 = this.F0;
        j jVar = this.f11133g0;
        this.G0 = f7 / (jVar.f11175l - jVar.f11174k);
        H();
        if (this.P0) {
            j3 = s(this.F, this.G);
        } else {
            j3 = 0;
        }
        E(r(this.F, this.G), j3, z10, z11, z12);
        if (this.f11153u0 && !z11) {
            c(false);
            x((this.G0 * jVar.f11174k) - f11102k1);
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
        int i12 = this.f11151s0;
        jg.b bVar = this.f11135h0;
        if (bVar != null) {
            float f7 = this.G0;
            float f10 = (this.f11133g0.f11174k * f7) - f11102k1;
            float f11 = (i10 + f10) / f7;
            if (f11 < 0.0f) {
                this.f11151s0 = 0;
            } else if (f11 > 1.0f) {
                this.f11151s0 = bVar.f12990a.length - 1;
            } else {
                int b10 = bVar.b(f11, this.F, this.G);
                this.f11151s0 = b10;
                int i13 = b10 + 1;
                float[] fArr = this.f11135h0.f12991b;
                if (i13 < fArr.length) {
                    if (Math.abs(this.f11135h0.f12991b[this.f11151s0 + 1] - f11) < Math.abs(fArr[b10] - f11)) {
                        this.f11151s0++;
                    }
                }
            }
            int i14 = this.f11151s0;
            int i15 = this.G;
            if (i14 > i15) {
                this.f11151s0 = i15;
            }
            int i16 = this.f11151s0;
            int i17 = this.F;
            if (i16 < i17) {
                this.f11151s0 = i17;
            }
            if (i12 != this.f11151s0) {
                this.f11153u0 = true;
                c(true);
                x(f10);
                e eVar = this.Q0;
                if (eVar != null) {
                    getSelectedDate();
                    ca1 ca1Var = (ca1) ((ml0) eVar).f35607b;
                    ca1Var.f();
                    ca1Var.f32599b.f11152t0.d(false, false);
                }
                B();
                invalidate();
            }
        }
    }

    public boolean D(jg.b bVar) {
        boolean z10;
        jg.b bVar2 = this.f11135h0;
        long j3 = 0;
        j jVar = this.f11133g0;
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
            this.f11135h0 = bVar;
            if (bVar != null) {
                if (bVar.f12990a[0] == 0) {
                    jVar.f11174k = 0.0f;
                    jVar.f11175l = 1.0f;
                } else {
                    float minDistance = getMinDistance();
                    jVar.f11176m = minDistance;
                    float f7 = jVar.f11175l;
                    if (f7 - jVar.f11174k < minDistance) {
                        float f10 = f7 - minDistance;
                        jVar.f11174k = f10;
                        if (f10 < 0.0f) {
                            jVar.f11174k = 0.0f;
                            jVar.f11175l = 1.0f;
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
            this.f11139j0 = 0.0f;
            this.f11141k0 = 2.1474836E9f;
            u();
            int i11 = bVar.f12996j;
            if (i11 != 1 && i11 != 2) {
                this.f11152t0.setSize(arrayList.size());
            } else {
                this.f11152t0.setSize(arrayList.size() * 2);
            }
            this.H = true;
            I();
            return z10;
        }
        jVar.f11174k = 0.7f;
        jVar.f11175l = 1.0f;
        this.f11141k0 = 0.0f;
        this.f11139j0 = 0.0f;
        this.f11120b.clear();
        AnimatorSet animatorSet = this.f11118a0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator valueAnimator = this.f11121b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f11121b0.cancel();
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
        if ((Math.abs(((float) (((long) Math.ceil(((float) j11) / 5.0f)) * 5)) - this.f11157x) >= this.E && j3 != 0) || ((float) j3) != this.f11159y) {
            kg.d f10 = f(this.f11135h0.f12995i, j3, j10);
            long[] jArr = f10.f13591a;
            long j12 = jArr[jArr.length - 1];
            long j13 = jArr[0];
            if (!z12) {
                float f11 = this.v - this.f11155w;
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
                if (((float) j12) != this.f11157x) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (this.P0 && ((float) j13) != this.f11159y) {
                    z13 = true;
                }
                if (z13) {
                    AnimatorSet animatorSet = this.f11118a0;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        this.f11118a0.cancel();
                    }
                    this.T0 = this.v;
                    this.U0 = this.f11155w;
                    this.R0 = 0.0f;
                    this.S0 = 0.0f;
                    this.V0 = f7;
                }
            }
            float f14 = (float) j12;
            this.f11157x = f14;
            float f15 = (float) j13;
            this.f11159y = f15;
            v();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f11122b1 < 320 && !z11) {
                return;
            }
            this.f11122b1 = currentTimeMillis;
            ValueAnimator valueAnimator = this.f11121b0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f11121b0.cancel();
            }
            ArrayList arrayList = this.f11120b;
            if (!z10) {
                this.v = f14;
                this.f11155w = f15;
                arrayList.clear();
                arrayList.add(f10);
                f10.f13594f = 255;
                return;
            }
            arrayList.add(f10);
            if (z12) {
                AnimatorSet animatorSet2 = this.f11118a0;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    this.f11118a0.cancel();
                }
                this.V0 = 0.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(e(this.v, f14, this.L0));
                if (this.P0) {
                    animatorSet3.playTogether(e(this.f11155w, f15, this.M0));
                }
                this.f11118a0 = animatorSet3;
                animatorSet3.start();
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                kg.d dVar = (kg.d) arrayList.get(i10);
                if (dVar != f10) {
                    dVar.f13595g = dVar.f13594f;
                }
            }
            ValueAnimator e = e(0.0f, 255.0f, new x(3, this, f10));
            this.f11121b0 = e;
            e.addListener(new z(6, this, f10));
            this.f11121b0.start();
        }
    }

    public final void F() {
        float f7 = this.V0;
        if (f7 != 0.0f) {
            float f10 = this.v;
            float f11 = this.f11157x;
            if (f10 != f11) {
                float f12 = this.R0 + f7;
                this.R0 = f12;
                if (f12 > 1.0f) {
                    this.R0 = 1.0f;
                    this.v = f11;
                } else {
                    float f13 = this.T0;
                    this.v = (rr.f28023g.getInterpolation(f12) * (f11 - f13)) + f13;
                }
                invalidate();
            }
            if (this.P0) {
                float f14 = this.f11155w;
                float f15 = this.f11159y;
                if (f14 != f15) {
                    float f16 = this.S0 + this.V0;
                    this.S0 = f16;
                    if (f16 > 1.0f) {
                        this.S0 = 1.0f;
                        this.f11155w = f15;
                    } else {
                        float f17 = this.U0;
                        this.f11155w = (rr.f28023g.getInterpolation(f16) * (f15 - f17)) + f17;
                    }
                    invalidate();
                }
            }
        }
    }

    public final void G() {
        int i10;
        int i11;
        if (this.f11158x0) {
            i10 = h6.Zi;
        } else {
            i10 = h6.Yi;
        }
        d6 d6Var = this.W0;
        int v02 = h6.v0(i10, d6Var);
        TextPaint textPaint = this.N;
        textPaint.setColor(v02);
        if (this.f11158x0) {
            i11 = h6.Zi;
        } else {
            i11 = h6.Yi;
        }
        this.O.setColor(h6.v0(i11, d6Var));
        int v03 = h6.v0(h6.Yi, d6Var);
        TextPaint textPaint2 = this.P;
        textPaint2.setColor(v03);
        int v04 = h6.v0(h6.aj, d6Var);
        Paint paint = this.L;
        paint.setColor(v04);
        int v05 = h6.v0(h6.bj, d6Var);
        Paint paint2 = this.M;
        paint2.setColor(v05);
        this.Q.setColor(h6.v0(h6.dj, d6Var));
        this.R.setColor(h6.v0(h6.cj, d6Var));
        this.S.setColor(h6.v0(h6.f19045d6, d6Var));
        this.T.setColor(h6.v0(h6.ej, d6Var));
        this.f11152t0.b();
        this.f11143n = paint.getAlpha();
        this.f11148r = paint2.getAlpha();
        this.f11130f = textPaint.getAlpha() / 255.0f;
        this.h = textPaint2.getAlpha() / 255.0f;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((kg.f) obj).a();
        }
        if (this.f11153u0) {
            int i13 = this.f11151s0;
            jg.b bVar = this.f11135h0;
            long[] jArr = bVar.f12990a;
            if (i13 < jArr.length) {
                this.f11152t0.c(i13, jArr[i13], arrayList, false, bVar.f12996j, bVar.h);
            }
        }
        this.H = true;
    }

    public final void H() {
        jg.b bVar = this.f11135h0;
        if (bVar == null) {
            return;
        }
        j jVar = this.f11133g0;
        int c10 = bVar.c(Math.max(jVar.f11174k, 0.0f));
        this.F = c10;
        int a2 = this.f11135h0.a(Math.min(jVar.f11175l, 1.0f), c10);
        this.G = a2;
        int i10 = this.F;
        if (a2 < i10) {
            this.G = i10;
        }
        kg.c cVar = this.f11140j1;
        if (cVar != null) {
            long[] jArr = this.f11135h0.f12990a;
            cVar.b(jArr[i10], jArr[this.G]);
        }
        I();
    }

    public final void I() {
        jg.b bVar = this.f11135h0;
        if (bVar != null) {
            float f7 = this.F0;
            if (f7 != 0.0f) {
                int i10 = (int) ((f7 / (this.G0 * bVar.f12994g)) / 6.0f);
                kg.b bVar2 = this.f11137i0;
                if (bVar2 == null || i10 >= bVar2.f13583b || i10 <= bVar2.f13584c) {
                    int highestOneBit = Integer.highestOneBit(i10) << 1;
                    kg.b bVar3 = this.f11137i0;
                    if (bVar3 == null || bVar3.f13582a != highestOneBit) {
                        ValueAnimator valueAnimator = this.f11124c0;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllListeners();
                            this.f11124c0.cancel();
                        }
                        double d = highestOneBit;
                        double d10 = 0.2d * d;
                        kg.b bVar4 = new kg.b(highestOneBit, (int) (d + d10), (int) (d - d10));
                        bVar4.d = 255;
                        kg.b bVar5 = this.f11137i0;
                        ArrayList arrayList = this.f11123c;
                        if (bVar5 == null) {
                            this.f11137i0 = bVar4;
                            bVar4.d = 255;
                            arrayList.add(bVar4);
                            return;
                        }
                        this.f11137i0 = bVar4;
                        this.m0 = arrayList.size();
                        for (int i11 = 0; i11 < this.m0; i11++) {
                            kg.b bVar6 = (kg.b) arrayList.get(i11);
                            bVar6.e = bVar6.d;
                        }
                        arrayList.add(bVar4);
                        if (arrayList.size() > 2) {
                            arrayList.remove(0);
                        }
                        ValueAnimator duration = e(0.0f, 1.0f, new x(4, this, bVar4)).setDuration(200L);
                        this.f11124c0 = duration;
                        duration.addListener(new z(7, this, bVar4));
                        this.f11124c0.start();
                    }
                }
            }
        }
    }

    public void J(jg.b bVar, long j3) {
        int length = bVar.f12990a.length;
        long j10 = j3 - (j3 % 86400000);
        long j11 = 86399999 + j10;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            long j12 = bVar.f12990a[i12];
            if (j10 > j12) {
                i10 = i12;
            }
            if (j11 > j12) {
                i11 = i12;
            }
        }
        float[] fArr = bVar.f12991b;
        float f7 = fArr[i10];
        j jVar = this.f11133g0;
        jVar.f11174k = f7;
        jVar.f11175l = fArr[i11];
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
                kg.f fVar = (kg.f) obj;
                boolean z10 = fVar.f13616n;
                jg.a aVar = fVar.f13606a;
                if (z10) {
                    long j11 = aVar.e;
                    if (j11 > j10) {
                        j10 = j11;
                    }
                }
                if (z10) {
                    long j12 = aVar.f12987f;
                    if (j12 < j3) {
                        j3 = j12;
                    }
                }
            }
            if ((j3 != 2147483647L && ((float) j3) != 0.0f) || (j10 > 0 && ((float) j10) != this.f11142l0)) {
                this.f11142l0 = (float) j10;
                Animator animator = this.f11126d0;
                if (animator != null) {
                    animator.cancel();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(e(this.f11139j0, this.f11142l0, this.J0), e(this.f11141k0, 0.0f, this.K0));
                this.f11126d0 = animatorSet;
                animatorSet.start();
            }
        }
    }

    @Override
    public void a(float f7, float f10, boolean z10) {
        jg.b bVar = this.f11135h0;
        if (bVar == null) {
            return;
        }
        if (z10) {
            int c10 = bVar.c(Math.max(f7, 0.0f));
            int a2 = this.f11135h0.a(Math.min(f10, 1.0f), c10);
            E(r(c10, a2), s(c10, a2), true, true, false);
            c(false);
            return;
        }
        H();
        invalidate();
    }

    public final void c(boolean z10) {
        float f7;
        x((this.G0 * this.f11133g0.f11174k) - f11102k1);
        if (this.f11138i1 == z10) {
            return;
        }
        this.f11138i1 = z10;
        ValueAnimator valueAnimator = this.f11128e0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f11128e0.cancel();
        }
        float f10 = this.f11154v0;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator duration = e(f10, f7, this.N0).setDuration(200L);
        this.f11128e0 = duration;
        duration.addListener(this.O0);
        this.f11128e0.start();
    }

    public final void d() {
        this.f11151s0 = -1;
        this.f11153u0 = false;
        this.f11138i1 = false;
        this.f11152t0.setVisibility(8);
        this.f11154v0 = 0.0f;
    }

    public kg.d f(int i10, long j3, long j10) {
        return new kg.d(j3, j10, this.P0, this.f11135h0.h, i10, this.N, this.O);
    }

    public kg.e g() {
        return new kg.e(getContext(), this.W0);
    }

    public long getEndDate() {
        return this.f11135h0.f12990a[this.G];
    }

    public float getMinDistance() {
        jg.b bVar = this.f11135h0;
        if (bVar == null) {
            return 0.1f;
        }
        int length = bVar.f12990a.length;
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
        int i10 = this.f11151s0;
        if (i10 < 0) {
            return -1L;
        }
        return this.f11135h0.f12990a[i10];
    }

    public long getStartDate() {
        return this.f11135h0.f12990a[this.F];
    }

    public abstract kg.f h(jg.a aVar);

    public void i(Canvas canvas) {
        int measuredHeight;
        if (this.f11135h0 != null) {
            int i10 = this.f11160y0;
            float f7 = 1.0f;
            if (i10 == 2) {
                f7 = 1.0f - this.f11161z0.f13625f;
            } else if (i10 == 1) {
                f7 = this.f11161z0.f13625f;
            } else if (i10 == 3) {
                f7 = this.f11161z0.f13625f;
            }
            Paint paint = this.L;
            paint.setAlpha((int) (this.f11143n * f7));
            TextPaint textPaint = this.N;
            textPaint.setAlpha((int) (this.f11130f * 255.0f * f7));
            this.O.setAlpha((int) (this.f11130f * 255.0f * f7));
            int textSize = (int) (f11104n1 - textPaint.getTextSize());
            float measuredHeight2 = (getMeasuredHeight() - this.f11150s) - 1;
            canvas.drawLine(this.D0, measuredHeight2, this.E0, measuredHeight2, paint);
            if (this.P0) {
                return;
            }
            canvas.drawText("0", f11102k1, measuredHeight - textSize, textPaint);
        }
    }

    public void j(Canvas canvas) {
        float f7;
        int i10;
        if (this.f11135h0 != null) {
            ArrayList arrayList = this.f11123c;
            this.m0 = arrayList.size();
            int i11 = this.f11160y0;
            float f10 = 1.0f;
            int i12 = 1;
            if (i11 == 2) {
                f7 = 1.0f - this.f11161z0.f13625f;
            } else if (i11 == 1) {
                f7 = this.f11161z0.f13625f;
            } else if (i11 == 3) {
                f7 = this.f11161z0.f13625f;
            } else {
                f7 = 1.0f;
            }
            char c10 = 0;
            this.f11144n0 = 0;
            while (true) {
                int i13 = this.f11144n0;
                if (i13 < this.m0) {
                    int i14 = ((kg.b) arrayList.get(i13)).d;
                    int i15 = ((kg.b) arrayList.get(this.f11144n0)).f13582a;
                    if (i15 == 0) {
                        i15 = 1;
                    }
                    int i16 = this.F - this.f11145o0;
                    while (i16 % i15 != 0) {
                        i16--;
                    }
                    int i17 = this.G - this.f11145o0;
                    while (true) {
                        if (i17 % i15 == 0 && i17 >= this.f11135h0.f12990a.length - i12) {
                            break;
                        }
                        i17++;
                        i14 = i14;
                        c10 = 0;
                        f10 = 1.0f;
                        i12 = 1;
                    }
                    int i18 = this.f11145o0;
                    int i19 = i16 + i18;
                    int i20 = i17 + i18;
                    float f11 = this.G0 * this.f11133g0.f11174k;
                    float f12 = f11102k1;
                    float f13 = f11 - f12;
                    while (i19 < i20) {
                        if (i19 >= 0) {
                            long[] jArr = this.f11135h0.f12990a;
                            if (i19 < jArr.length - i12) {
                                long j3 = jArr[i19];
                                long j10 = jArr[c10];
                                i10 = i14;
                                float f14 = ((((float) (j3 - j10)) / ((float) (jArr[jArr.length - i12] - j10))) * this.G0) - f13;
                                float f15 = f14 - f11110t1;
                                if (f15 > 0.0f) {
                                    float f16 = this.F0;
                                    if (f15 <= f16 + f12) {
                                        float f17 = f11106p1;
                                        TextPaint textPaint = this.P;
                                        if (f15 < f17) {
                                            textPaint.setAlpha((int) (i10 * f0.x(f17, f15, f17, f10) * this.h * f7));
                                        } else if (f15 > f16) {
                                            textPaint.setAlpha((int) (i10 * f0.x(f15, f16, f12, f10) * this.h * f7));
                                        } else {
                                            textPaint.setAlpha((int) (i10 * this.h * f7));
                                        }
                                        jg.b bVar = this.f11135h0;
                                        String[] strArr = bVar.f12992c;
                                        long[] jArr2 = bVar.f12990a;
                                        canvas.drawText(strArr[(int) ((jArr2[i19] - jArr2[0]) / bVar.f12997k)], f14, AndroidUtilities.dp(3.0f) + (getMeasuredHeight() - this.f11150s) + f11105o1, textPaint);
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
                    this.f11144n0++;
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

    public void l(android.graphics.Canvas r12, kg.d r13) {
        throw new UnsupportedOperationException("Method not decompiled: ig.g.l(android.graphics.Canvas, kg.d):void");
    }

    public final void m(android.graphics.Canvas r39) {
        throw new UnsupportedOperationException("Method not decompiled: ig.g.m(android.graphics.Canvas):void");
    }

    public abstract void n(Canvas canvas);

    public void o(Canvas canvas) {
        jg.b bVar;
        int i10 = this.f11151s0;
        if (i10 >= 0 && this.f11153u0 && (bVar = this.f11135h0) != null) {
            int i11 = (int) (this.f11148r * this.f11154v0);
            float f7 = this.F0;
            j jVar = this.f11133g0;
            float f10 = jVar.f11175l;
            float f11 = jVar.f11174k;
            float f12 = f7 / (f10 - f11);
            float f13 = (f11 * f12) - f11102k1;
            float[] fArr = bVar.f12991b;
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
                        this.f11144n0 = i12;
                        int i13 = this.f11144n0;
                        if (i13 < this.m0) {
                            kg.f fVar = (kg.f) arrayList.get(i13);
                            boolean z10 = fVar.f13616n;
                            Paint paint2 = fVar.d;
                            if (z10 || fVar.f13617o != 0.0f) {
                                float f15 = (float) fVar.f13606a.f12984a[this.f11151s0];
                                float f16 = this.f11155w;
                                float measuredHeight = (getMeasuredHeight() - this.f11150s) - (((f15 - f16) / (this.v - f16)) * ((getMeasuredHeight() - this.f11150s) - f11104n1));
                                paint2.setAlpha((int) (fVar.f13617o * 255.0f * this.f11154v0));
                                Paint paint3 = this.S;
                                paint3.setAlpha((int) (fVar.f13617o * 255.0f * this.f11154v0));
                                canvas.drawPoint(f14, measuredHeight, paint2);
                                canvas.drawPoint(f14, measuredHeight, paint3);
                            }
                            i12 = this.f11144n0 + 1;
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
        if (this.f11156w0) {
            super.onDraw(canvas);
            return;
        }
        F();
        int save = canvas.save();
        RectF rectF = this.H0;
        canvas.clipRect(0.0f, rectF.top, getMeasuredWidth(), rectF.bottom);
        i(canvas);
        ArrayList arrayList = this.f11120b;
        this.m0 = arrayList.size();
        int i10 = 0;
        this.f11144n0 = 0;
        while (true) {
            int i11 = this.f11144n0;
            if (i11 >= this.m0) {
                break;
            }
            l(canvas, (kg.d) arrayList.get(i11));
            this.f11144n0++;
        }
        k(canvas);
        while (true) {
            this.f11144n0 = i10;
            int i12 = this.f11144n0;
            if (i12 < this.m0) {
                p(canvas, (kg.d) arrayList.get(i12));
                i10 = this.f11144n0 + 1;
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
            float f7 = f11102k1;
            float f10 = 2.0f * f7;
            this.f11146p0 = Bitmap.createBitmap((int) (getMeasuredWidth() - f10), i13, Bitmap.Config.ARGB_4444);
            this.f11147q0 = new Canvas(this.f11146p0);
            this.f11117a.a(i13, (int) (getMeasuredWidth() - f10));
            w();
            if (this.f11153u0) {
                x((this.G0 * this.f11133g0.f11174k) - f7);
            }
            A(false, true, false);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int measuredHeight = getMeasuredHeight();
            int i14 = f11107q1;
            this.Z0.set(0, measuredHeight - ((i13 + i14) + i14), getMeasuredWidth(), getMeasuredHeight());
            setSystemGestureExclusionRects(this.f11119a1);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        long j3;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean z10 = false;
        if (this.f11135h0 != null) {
            boolean z11 = this.J;
            j jVar = this.f11133g0;
            if (!z11) {
                jVar.c(motionEvent.getActionIndex(), motionEvent);
                getParent().requestDisallowInterceptTouchEvent(false);
                this.f11149r0 = false;
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
                        int i10 = x10 - this.f11125c1;
                        int i11 = y3 - this.f11127d1;
                        if (jVar.f11177n[0] == null && !jVar.f11169c) {
                            boolean z12 = this.f11149r0;
                            int i12 = this.A0;
                            if (z12) {
                                if ((this.f11136h1 && System.currentTimeMillis() - this.f11134g1 > 200) || Math.abs(i10) > Math.abs(i11) || Math.abs(i11) < i12) {
                                    z10 = true;
                                }
                                this.f11125c1 = x10;
                                this.f11127d1 = y3;
                                getParent().requestDisallowInterceptTouchEvent(z10);
                                C(x10, y3);
                                return true;
                            }
                            if (rectF.contains(this.f11129e1, this.f11132f1)) {
                                int i13 = this.f11129e1 - x10;
                                int i14 = this.f11132f1 - y3;
                                if (Math.sqrt((i14 * i14) + (i13 * i13)) > i12 || System.currentTimeMillis() - this.f11134g1 > 200) {
                                    this.f11149r0 = true;
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
                    if (rectF.contains(this.f11129e1, this.f11132f1) && !this.f11149r0) {
                        c(false);
                    }
                    h[] hVarArr = jVar.f11177n;
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
                    this.f11149r0 = false;
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
            this.f11134g1 = System.currentTimeMillis();
            getParent().requestDisallowInterceptTouchEvent(true);
            if (!jVar.a(x10, y3, motionEvent.getActionIndex())) {
                this.f11125c1 = x10;
                this.f11129e1 = x10;
                this.f11127d1 = y3;
                this.f11132f1 = y3;
                if (rectF.contains(x10, y3)) {
                    if (this.f11151s0 < 0 || !this.f11138i1) {
                        this.f11149r0 = true;
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
            if (((kg.f) arrayList.get(i12)).f13616n) {
                long rMaxQ = ((kg.f) arrayList.get(i12)).f13606a.f12985b.rMaxQ(i10, i11);
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
            if (((kg.f) arrayList.get(i12)).f13616n) {
                long rMinQ = ((kg.f) arrayList.get(i12)).f13606a.f12985b.rMinQ(i10, i11);
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
        this.f11140j1 = cVar;
    }

    public void setLandscape(boolean z10) {
        this.I = z10;
    }

    public void t() {
        this.L.setStrokeWidth(1.0f);
        this.M.setStrokeWidth(l1);
        TextPaint textPaint = this.N;
        float f7 = f11103m1;
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
        this.f11152t0 = g10;
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
            boolean z10 = fVar.f13616n;
            jg.a aVar = fVar.f13606a;
            if (z10) {
                long j3 = aVar.e;
                if (((float) j3) > this.f11139j0) {
                    this.f11139j0 = (float) j3;
                }
            }
            if (z10) {
                long j10 = aVar.f12987f;
                if (((float) j10) < this.f11141k0) {
                    this.f11141k0 = (float) j10;
                }
            }
            float f7 = this.f11139j0;
            float f10 = this.f11141k0;
            if (f7 == f10) {
                this.f11139j0 = f7 + 1.0f;
                this.f11141k0 = f10 - 1.0f;
            }
        }
    }

    public final void v() {
        int measuredHeight = getMeasuredHeight() - this.f11150s;
        float f7 = this.f11157x;
        if (f7 != 0.0f && measuredHeight != 0) {
            this.E = (f7 / measuredHeight) * f11103m1;
        }
    }

    public final void w() {
        float f7;
        if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            float f10 = f11102k1;
            this.C0 = getMeasuredWidth() - (2.0f * f10);
            this.D0 = f10;
            float measuredWidth = getMeasuredWidth();
            if (this.I) {
                f7 = f11109s1;
            } else {
                f7 = f10;
            }
            float f11 = measuredWidth - f7;
            this.E0 = f11;
            float f12 = f11 - this.D0;
            this.F0 = f12;
            j jVar = this.f11133g0;
            this.G0 = f12 / (jVar.f11175l - jVar.f11174k);
            I();
            this.f11150s = AndroidUtilities.dp(100.0f);
            this.H0.set(this.D0 - f10, 0.0f, this.E0 + f10, getMeasuredHeight() - this.f11150s);
            if (this.f11135h0 != null) {
                this.f11145o0 = (int) (AndroidUtilities.dp(20.0f) / (this.C0 / this.f11135h0.f12990a.length));
            }
            v();
        }
    }

    public final void x(float f7) {
        int i10;
        float f10;
        jg.b bVar = this.f11135h0;
        if (bVar != null && (i10 = this.f11151s0) >= 0) {
            long[] jArr = bVar.f12990a;
            if (i10 < jArr.length && this.f11153u0) {
                this.f11152t0.c(i10, jArr[i10], this.d, false, bVar.f12996j, bVar.h);
                this.f11152t0.setVisibility(0);
                this.f11152t0.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
                float f11 = (this.f11135h0.f12991b[this.f11151s0] * this.G0) - f7;
                int i11 = f11114x1;
                if (f11 > (this.D0 + this.F0) / 2.0f) {
                    f10 = f11 - (this.f11152t0.getWidth() + i11);
                } else {
                    f10 = f11 + i11;
                }
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                } else if (this.f11152t0.getMeasuredWidth() + f10 > getMeasuredWidth()) {
                    f10 = getMeasuredWidth() - this.f11152t0.getMeasuredWidth();
                }
                this.f11152t0.setTranslationX(f10);
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
            this.f11144n0 = i10;
            int i11 = this.f11144n0;
            if (i11 >= this.m0) {
                break;
            }
            final kg.f fVar = (kg.f) arrayList.get(i11);
            if (fVar.f13616n && (valueAnimator3 = fVar.f13611i) != null) {
                valueAnimator3.cancel();
            }
            if (!fVar.f13616n && (valueAnimator2 = fVar.h) != null) {
                valueAnimator2.cancel();
            }
            if (fVar.f13616n && fVar.f13617o != 1.0f) {
                ValueAnimator valueAnimator4 = fVar.h;
                if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                    ValueAnimator e = e(fVar.f13617o, 1.0f, new ValueAnimator.AnimatorUpdateListener(this) {
                        public final g f11093b;

                        {
                            this.f11093b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                            switch (r3) {
                                case 0:
                                    g gVar = this.f11093b;
                                    gVar.getClass();
                                    fVar.f13617o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    gVar.H = true;
                                    gVar.invalidate();
                                    return;
                                default:
                                    g gVar2 = this.f11093b;
                                    gVar2.getClass();
                                    fVar.f13617o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    gVar2.H = true;
                                    gVar2.invalidate();
                                    return;
                            }
                        }
                    });
                    fVar.h = e;
                    e.start();
                } else {
                    i10 = this.f11144n0 + 1;
                }
            }
            if (!fVar.f13616n && fVar.f13617o != 0.0f && ((valueAnimator = fVar.f13611i) == null || !valueAnimator.isRunning())) {
                ValueAnimator e7 = e(fVar.f13617o, 0.0f, new ValueAnimator.AnimatorUpdateListener(this) {
                    public final g f11093b;

                    {
                        this.f11093b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                        switch (r3) {
                            case 0:
                                g gVar = this.f11093b;
                                gVar.getClass();
                                fVar.f13617o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                gVar.H = true;
                                gVar.invalidate();
                                return;
                            default:
                                g gVar2 = this.f11093b;
                                gVar2.getClass();
                                fVar.f13617o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                gVar2.H = true;
                                gVar2.invalidate();
                                return;
                        }
                    }
                });
                fVar.f13611i = e7;
                e7.start();
            }
            i10 = this.f11144n0 + 1;
        }
        K();
        if (this.f11153u0) {
            kg.e eVar = this.f11152t0;
            int i12 = this.f11151s0;
            jg.b bVar = this.f11135h0;
            eVar.c(i12, bVar.f12990a[i12], arrayList, true, bVar.f12996j, bVar.h);
        }
    }

    public void q(kg.j jVar) {
    }

    public void y() {
    }
}
