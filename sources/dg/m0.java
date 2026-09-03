package dg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import k7.o6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.pr;
public final class m0 {
    public static final pr B = new pr(0.0d, 0.5d, 0.0d, 1.0d);
    public m A;
    public final o1 f4582a;
    public boolean f4583b;
    public boolean f4584c;
    public long d;
    public boolean f4585e;
    public boolean f4586f;
    public g1 f4587g;
    public g1 h;
    public double f4588i;
    public boolean f4589j;
    public float f4590k;
    public boolean f4591l;
    public int f4593n;
    public int f4594o;
    public double f4595p;
    public double f4596q;
    public ValueAnimator f4597r;
    public final y1 f4598s;
    public Matrix f4599t;
    public long v;
    public float f4601w;
    public ValueAnimator f4602x;
    public boolean f4604z;
    public final g1[] f4592m = new g1[3];
    public final float[] f4600u = new float[2];
    public final g0 f4603y = new g0(this, 1);

    public m0(o1 o1Var) {
        this.f4582a = o1Var;
        Context context = o1Var.getContext();
        h0 h0Var = new h0(this, 0);
        final ?? obj = new Object();
        obj.f4728b = new ArrayList();
        obj.f4729c = new ArrayList();
        obj.f4733i = null;
        obj.f4734j = new AtomicBoolean(false);
        obj.f4735k = new AtomicBoolean(false);
        obj.f4736l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: dg.s1.run():void");
            }
        };
        obj.f4731f = context;
        obj.f4730e = h0Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f4732g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f4727a = sharedPreferences.getInt("scoreall", 0);
        y1.f4725m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: dg.s1.run():void");
            }
        });
        this.f4598s = obj;
    }

    public final void a(d dVar, boolean z4, i1 i1Var) {
        Object obj;
        n1 n1Var;
        if (this.f4591l) {
            o1 o1Var = this.f4582a;
            if (!o1Var.getPainting().G && this.f4587g != null) {
                if (dVar == null) {
                    obj = o1Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f4591l = false;
                if (r42 instanceof d) {
                    o1Var.getPainting().E = false;
                }
                c1 painting = o1Var.getPainting();
                painting.f4455f.f(new y0(painting, 1));
                this.f4593n = 0;
                this.f4594o = 0;
                this.f4589j = false;
                this.f4583b = false;
                if (z4 && (n1Var = o1Var.f4624a) != null) {
                    n1Var.f();
                }
                jv0 jv0Var = o1Var.getPainting().f4456g;
                g1 g1Var = this.f4587g;
                float a2 = o6.a((float) g1Var.f4543a, (float) g1Var.f4544b, 0.0f, 0.0f);
                g1 g1Var2 = this.f4587g;
                float max = Math.max(a2, o6.a((float) g1Var2.f4543a, (float) g1Var2.f4544b, jv0Var.f28201a, 0.0f));
                g1 g1Var3 = this.f4587g;
                float a10 = o6.a((float) g1Var3.f4543a, (float) g1Var3.f4544b, 0.0f, jv0Var.f28202b);
                g1 g1Var4 = this.f4587g;
                final float max2 = Math.max(max, Math.max(a10, o6.a((float) g1Var4.f4543a, (float) g1Var4.f4544b, jv0Var.f28201a, jv0Var.f28202b))) / 0.84f;
                ValueAnimator valueAnimator = this.f4597r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f4597r = null;
                }
                ValueAnimator valueAnimator2 = this.f4602x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f4602x = null;
                }
                g1 g1Var5 = this.f4587g;
                final g1 g1Var6 = new g1(g1Var5.f4543a, g1Var5.f4544b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f4602x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        o1 o1Var2 = m0.this.f4582a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        d1 d1Var = new d1(new g1[]{g1Var6});
                        m mVar = r42;
                        mVar.getClass();
                        if (mVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = o1Var2.getCurrentColor();
                        }
                        d1Var.f4485c = currentColor;
                        d1Var.d = floatValue * max2;
                        d1Var.f4486e = mVar;
                        c1 painting2 = o1Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f4455f.f(new w0(painting2, d1Var, true, true, null, 0));
                    }
                });
                this.f4602x.addListener(new k0(this, g1Var6, max2, r42, z4, i1Var));
                this.f4602x.setDuration(450L);
                this.f4602x.setInterpolator(pr.h);
                this.f4602x.start();
                if (z4) {
                    BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
                }
            }
        }
    }

    public final void b(d1 d1Var) {
        o1 o1Var = this.f4582a;
        int currentColor = o1Var.getCurrentColor();
        float currentWeight = o1Var.getCurrentWeight();
        m currentBrush = o1Var.getCurrentBrush();
        d1Var.f4485c = currentColor;
        d1Var.d = currentWeight;
        d1Var.f4486e = currentBrush;
        if (this.f4586f) {
            this.f4588i = 0.0d;
        }
        d1Var.f4483a = this.f4588i;
        c1 painting = o1Var.getPainting();
        boolean z4 = this.f4586f;
        j0 j0Var = new j0(this, d1Var, 0);
        if (painting.L == null) {
            painting.f4455f.f(new w0(painting, d1Var, z4, false, j0Var, 0));
        }
        this.f4586f = false;
    }

    public final void c(float f10, boolean z4) {
        int i10 = this.f4593n;
        g1[] g1VarArr = this.f4592m;
        if (i10 > 2) {
            Vector vector = new Vector();
            g1 g1Var = g1VarArr[0];
            g1 g1Var2 = g1VarArr[1];
            g1 g1Var3 = g1VarArr[2];
            if (g1Var3 != null && g1Var2 != null && g1Var != null) {
                g1 b10 = g1Var2.b(g1Var);
                g1 b11 = g1Var3.b(g1Var2);
                int min = (int) Math.min(48.0d, Math.max(Math.floor(b10.a(b11) / 1), 24.0d));
                float f11 = 1.0f;
                float f12 = 1.0f / min;
                int i11 = 0;
                float f13 = 0.0f;
                while (i11 < min) {
                    float f14 = f11 - f13;
                    double d = f14;
                    double pow = Math.pow(d, 2.0d);
                    double d10 = f13 * f13;
                    double d11 = f14 * f14;
                    double d12 = f13;
                    double d13 = (b11.f4543a * d10) + (g1Var2.f4543a * 2.0d * d12 * d) + (b10.f4543a * d11);
                    double d14 = (b11.f4544b * d10) + (g1Var2.f4544b * 2.0d * d12 * d) + (b10.f4544b * d11);
                    double lerp = ((((b11.f4545c * d10) + ((g1Var2.f4545c * ((2.0f * f14) * f13)) + (b10.f4545c * pow))) - 1.0d) * AndroidUtilities.lerp(f10, 1.0f, k7.o.a(this.f4594o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    g1 g1Var4 = new g1(d13, d14, lerp);
                    if (this.f4584c) {
                        g1Var4.d = true;
                        this.f4584c = false;
                    }
                    vector.add(g1Var4);
                    this.f4595p += lerp;
                    this.f4596q += 1.0d;
                    f13 += f12;
                    i11++;
                    f11 = 1.0f;
                }
                if (z4) {
                    b11.d = true;
                }
                vector.add(b11);
                g1[] g1VarArr2 = new g1[vector.size()];
                vector.toArray(g1VarArr2);
                b(new d1(g1VarArr2));
                System.arraycopy(g1VarArr, 1, g1VarArr, 0, 2);
                if (z4) {
                    this.f4593n = 0;
                    return;
                } else {
                    this.f4593n = 2;
                    return;
                }
            }
            return;
        }
        g1[] g1VarArr3 = new g1[i10];
        System.arraycopy(g1VarArr, 0, g1VarArr3, 0, i10);
        b(new d1(g1VarArr3));
    }
}
