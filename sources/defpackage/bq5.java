package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
public final class bq5 {
    public static final k43 B = new k43(0.0d, 0.5d, 0.0d, 1.0d);
    public v01 A;
    public final pa9 a;
    public boolean b;
    public boolean c;
    public long d;
    public boolean e;
    public boolean f;
    public vg8 g;
    public vg8 h;
    public double i;
    public boolean j;
    public float k;
    public boolean l;
    public int n;
    public int o;
    public double p;
    public double q;
    public ValueAnimator r;
    public final xca s;
    public Matrix t;
    public long v;
    public float w;
    public ValueAnimator x;
    public boolean z;
    public final vg8[] m = new vg8[3];
    public final float[] u = new float[2];
    public final yp5 y = new yp5(this, (byte) 1);

    public bq5(pa9 pa9Var) {
        this.a = pa9Var;
        Context context = pa9Var.getContext();
        zj3 zj3Var = new zj3(this, (byte) 19);
        final ?? obj = new Object();
        obj.b = new ArrayList();
        obj.c = new ArrayList();
        obj.i = null;
        obj.j = new AtomicBoolean(false);
        obj.k = new AtomicBoolean(false);
        obj.l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: defpackage.uca.run():void");
            }
        };
        obj.f = context;
        obj.e = zj3Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.a = sharedPreferences.getInt("scoreall", 0);
        xca.m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: defpackage.uca.run():void");
            }
        });
        this.s = obj;
    }

    public final void a(r01 r01Var, boolean z, ja9 ja9Var) {
        Object obj;
        oa9 oa9Var;
        if (this.l) {
            pa9 pa9Var = this.a;
            if (!pa9Var.getPainting().G && this.g != null) {
                if (r01Var == null) {
                    obj = pa9Var.getCurrentBrush();
                } else {
                    obj = r01Var;
                }
                if ((obj instanceof q01) || (obj instanceof s01)) {
                    obj = new Object();
                }
                ?? r4 = obj;
                this.l = false;
                if (r4 instanceof r01) {
                    pa9Var.getPainting().E = false;
                }
                nx7 painting = pa9Var.getPainting();
                painting.f.f(new kx7(painting, (byte) 1));
                this.n = 0;
                this.o = 0;
                this.j = false;
                this.b = false;
                if (z && (oa9Var = pa9Var.a) != null) {
                    oa9Var.R();
                }
                qma qmaVar = pa9Var.getPainting().g;
                vg8 vg8Var = this.g;
                float a = dte.a((float) vg8Var.a, (float) vg8Var.b, 0.0f, 0.0f);
                vg8 vg8Var2 = this.g;
                float max = Math.max(a, dte.a((float) vg8Var2.a, (float) vg8Var2.b, qmaVar.a, 0.0f));
                vg8 vg8Var3 = this.g;
                float a2 = dte.a((float) vg8Var3.a, (float) vg8Var3.b, 0.0f, qmaVar.b);
                vg8 vg8Var4 = this.g;
                float max2 = Math.max(max, Math.max(a2, dte.a((float) vg8Var4.a, (float) vg8Var4.b, qmaVar.a, qmaVar.b))) / 0.84f;
                ValueAnimator valueAnimator = this.r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.r = null;
                }
                ValueAnimator valueAnimator2 = this.x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.x = null;
                }
                vg8 vg8Var5 = this.g;
                vg8 vg8Var6 = new vg8(vg8Var5.a, vg8Var5.b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.x = ofFloat;
                ofFloat.addUpdateListener(new rv1(this, vg8Var6, (v01) r4, max2));
                this.x.addListener(new aq5(this, vg8Var6, max2, r4, z, ja9Var));
                this.x.setDuration(450L);
                this.x.setInterpolator(k43.h);
                this.x.start();
                if (z) {
                    yw0.IMPACT_HEAVY.a();
                }
            }
        }
    }

    public final void b(j18 j18Var) {
        pa9 pa9Var = this.a;
        int currentColor = pa9Var.getCurrentColor();
        float currentWeight = pa9Var.getCurrentWeight();
        v01 currentBrush = pa9Var.getCurrentBrush();
        j18Var.c = currentColor;
        j18Var.d = currentWeight;
        j18Var.e = currentBrush;
        if (this.f) {
            this.i = 0.0d;
        }
        j18Var.a = this.i;
        nx7 painting = pa9Var.getPainting();
        boolean z = this.f;
        zp5 zp5Var = new zp5(this, j18Var, (byte) 0);
        if (painting.L == null) {
            painting.f.f(new my6(painting, j18Var, z, false, zp5Var, (byte) 1));
        }
        this.f = false;
    }

    public final void c(boolean z, float f) {
        int i = this.n;
        vg8[] vg8VarArr = this.m;
        if (i > 2) {
            Vector vector = new Vector();
            vg8 vg8Var = vg8VarArr[0];
            vg8 vg8Var2 = vg8VarArr[1];
            vg8 vg8Var3 = vg8VarArr[2];
            if (vg8Var3 != null && vg8Var2 != null && vg8Var != null) {
                vg8 b = vg8Var2.b(vg8Var);
                vg8 b2 = vg8Var3.b(vg8Var2);
                float f2 = 1.0f;
                int min = (int) Math.min(48.0d, Math.max(Math.floor(b.a(b2) / 1.0f), 24.0d));
                float f3 = 1.0f / min;
                int i2 = 0;
                float f4 = 0.0f;
                while (i2 < min) {
                    float f5 = f2 - f4;
                    double d = f5;
                    float f6 = f3;
                    double pow = Math.pow(d, 2.0d);
                    int i3 = i2;
                    double d2 = f4 * f4;
                    double d3 = f5 * f5;
                    double d4 = f4;
                    double d5 = (b2.a * d2) + (vg8Var2.a * 2.0d * d4 * d) + (b.a * d3);
                    double d6 = (b2.b * d2) + (vg8Var2.b * 2.0d * d4 * d) + (b.b * d3);
                    double R1 = ((((b2.c * d2) + ((vg8Var2.c * ((2.0f * f5) * f4)) + (b.c * pow))) - 1.0d) * hl.R1(f, 1.0f, ete.a(this.o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    vg8 vg8Var4 = new vg8(d5, d6, R1);
                    if (this.c) {
                        vg8Var4.d = true;
                        this.c = false;
                    }
                    vector.add(vg8Var4);
                    this.p += R1;
                    this.q += 1.0d;
                    f4 += f6;
                    f2 = 1.0f;
                    f3 = f6;
                    i2 = i3 + 1;
                }
                if (z) {
                    b2.d = true;
                }
                vector.add(b2);
                vg8[] vg8VarArr2 = new vg8[vector.size()];
                vector.toArray(vg8VarArr2);
                b(new j18(vg8VarArr2));
                System.arraycopy(vg8VarArr, 1, vg8VarArr, 0, 2);
                if (z) {
                    this.n = 0;
                    return;
                } else {
                    this.n = 2;
                    return;
                }
            }
            return;
        }
        vg8[] vg8VarArr3 = new vg8[i];
        System.arraycopy(vg8VarArr, 0, vg8VarArr3, 0, i);
        b(new j18(vg8VarArr3));
    }
}
