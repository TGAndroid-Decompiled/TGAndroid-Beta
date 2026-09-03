package cg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import k7.n6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.mr;
public final class m0 {
    public static final mr B = new mr(0.0d, 0.5d, 0.0d, 1.0d);
    public m A;
    public final p1 f2431a;
    public boolean f2432b;
    public boolean f2433c;
    public long d;
    public boolean e;
    public boolean f2434f;
    public h1 f2435g;
    public h1 h;
    public double f2436i;
    public boolean f2437j;
    public float f2438k;
    public boolean f2439l;
    public int f2441n;
    public int f2442o;
    public double f2443p;
    public double f2444q;
    public ValueAnimator f2445r;
    public final z1 f2446s;
    public Matrix f2447t;
    public long v;
    public float f2449w;
    public ValueAnimator f2450x;
    public boolean f2452z;
    public final h1[] f2440m = new h1[3];
    public final float[] f2448u = new float[2];
    public final g0 f2451y = new g0(this, 1);

    public m0(p1 p1Var) {
        this.f2431a = p1Var;
        Context context = p1Var.getContext();
        h0 h0Var = new h0(this, 0);
        final ?? obj = new Object();
        obj.f2570b = new ArrayList();
        obj.f2571c = new ArrayList();
        obj.f2574i = null;
        obj.f2575j = new AtomicBoolean(false);
        obj.f2576k = new AtomicBoolean(false);
        obj.f2577l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: cg.t1.run():void");
            }
        };
        obj.f2572f = context;
        obj.e = h0Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f2573g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f2569a = sharedPreferences.getInt("scoreall", 0);
        z1.f2567m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: cg.t1.run():void");
            }
        });
        this.f2446s = obj;
    }

    public final void a(d dVar, boolean z4, j1 j1Var) {
        Object obj;
        o1 o1Var;
        if (this.f2439l) {
            p1 p1Var = this.f2431a;
            if (!p1Var.getPainting().G && this.f2435g != null) {
                if (dVar == null) {
                    obj = p1Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f2439l = false;
                if (r42 instanceof d) {
                    p1Var.getPainting().E = false;
                }
                d1 painting = p1Var.getPainting();
                painting.f2320f.f(new z0(painting, 1));
                this.f2441n = 0;
                this.f2442o = 0;
                this.f2437j = false;
                this.f2432b = false;
                if (z4 && (o1Var = p1Var.f2475a) != null) {
                    o1Var.f();
                }
                jv0 jv0Var = p1Var.getPainting().f2321g;
                h1 h1Var = this.f2435g;
                float a2 = n6.a((float) h1Var.f2398a, (float) h1Var.f2399b, 0.0f, 0.0f);
                h1 h1Var2 = this.f2435g;
                float max = Math.max(a2, n6.a((float) h1Var2.f2398a, (float) h1Var2.f2399b, jv0Var.f26062a, 0.0f));
                h1 h1Var3 = this.f2435g;
                float a10 = n6.a((float) h1Var3.f2398a, (float) h1Var3.f2399b, 0.0f, jv0Var.f26063b);
                h1 h1Var4 = this.f2435g;
                final float max2 = Math.max(max, Math.max(a10, n6.a((float) h1Var4.f2398a, (float) h1Var4.f2399b, jv0Var.f26062a, jv0Var.f26063b))) / 0.84f;
                ValueAnimator valueAnimator = this.f2445r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f2445r = null;
                }
                ValueAnimator valueAnimator2 = this.f2450x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f2450x = null;
                }
                h1 h1Var5 = this.f2435g;
                final h1 h1Var6 = new h1(h1Var5.f2398a, h1Var5.f2399b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f2450x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        p1 p1Var2 = m0.this.f2431a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        e1 e1Var = new e1(new h1[]{h1Var6});
                        m mVar = r42;
                        mVar.getClass();
                        if (mVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = p1Var2.getCurrentColor();
                        }
                        e1Var.f2350c = currentColor;
                        e1Var.d = floatValue * max2;
                        e1Var.e = mVar;
                        d1 painting2 = p1Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f2320f.f(new x0(painting2, e1Var, true, true, null, 0));
                    }
                });
                this.f2450x.addListener(new k0(this, h1Var6, max2, r42, z4, j1Var));
                this.f2450x.setDuration(450L);
                this.f2450x.setInterpolator(mr.h);
                this.f2450x.start();
                if (z4) {
                    BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
                }
            }
        }
    }

    public final void b(e1 e1Var) {
        p1 p1Var = this.f2431a;
        int currentColor = p1Var.getCurrentColor();
        float currentWeight = p1Var.getCurrentWeight();
        m currentBrush = p1Var.getCurrentBrush();
        e1Var.f2350c = currentColor;
        e1Var.d = currentWeight;
        e1Var.e = currentBrush;
        if (this.f2434f) {
            this.f2436i = 0.0d;
        }
        e1Var.f2348a = this.f2436i;
        d1 painting = p1Var.getPainting();
        boolean z4 = this.f2434f;
        j0 j0Var = new j0(this, e1Var, 0);
        if (painting.L == null) {
            painting.f2320f.f(new x0(painting, e1Var, z4, false, j0Var, 0));
        }
        this.f2434f = false;
    }

    public final void c(float f10, boolean z4) {
        int i10 = this.f2441n;
        h1[] h1VarArr = this.f2440m;
        if (i10 > 2) {
            Vector vector = new Vector();
            h1 h1Var = h1VarArr[0];
            h1 h1Var2 = h1VarArr[1];
            h1 h1Var3 = h1VarArr[2];
            if (h1Var3 != null && h1Var2 != null && h1Var != null) {
                h1 b10 = h1Var2.b(h1Var);
                h1 b11 = h1Var3.b(h1Var2);
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
                    double d13 = (b11.f2398a * d10) + (h1Var2.f2398a * 2.0d * d12 * d) + (b10.f2398a * d11);
                    double d14 = (b11.f2399b * d10) + (h1Var2.f2399b * 2.0d * d12 * d) + (b10.f2399b * d11);
                    double lerp = ((((b11.f2400c * d10) + ((h1Var2.f2400c * ((2.0f * f14) * f13)) + (b10.f2400c * pow))) - 1.0d) * AndroidUtilities.lerp(f10, 1.0f, k7.n.a(this.f2442o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    h1 h1Var4 = new h1(d13, d14, lerp);
                    if (this.f2433c) {
                        h1Var4.d = true;
                        this.f2433c = false;
                    }
                    vector.add(h1Var4);
                    this.f2443p += lerp;
                    this.f2444q += 1.0d;
                    f13 += f12;
                    i11++;
                    f11 = 1.0f;
                }
                if (z4) {
                    b11.d = true;
                }
                vector.add(b11);
                h1[] h1VarArr2 = new h1[vector.size()];
                vector.toArray(h1VarArr2);
                b(new e1(h1VarArr2));
                System.arraycopy(h1VarArr, 1, h1VarArr, 0, 2);
                if (z4) {
                    this.f2441n = 0;
                    return;
                } else {
                    this.f2441n = 2;
                    return;
                }
            }
            return;
        }
        h1[] h1VarArr3 = new h1[i10];
        System.arraycopy(h1VarArr, 0, h1VarArr3, 0, i10);
        b(new e1(h1VarArr3));
    }
}
