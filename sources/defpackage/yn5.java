package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
public final class yn5 {
    public static final s33 B = new s33(0.0d, 0.5d, 0.0d, 1.0d);
    public m01 A;
    public final c79 a;
    public boolean b;
    public boolean c;
    public long d;
    public boolean e;
    public boolean f;
    public hd8 g;
    public hd8 h;
    public double i;
    public boolean j;
    public float k;
    public boolean l;
    public int n;
    public int o;
    public double p;
    public double q;
    public ValueAnimator r;
    public final h9a s;
    public Matrix t;
    public long v;
    public float w;
    public ValueAnimator x;
    public boolean z;
    public final hd8[] m = new hd8[3];
    public final float[] u = new float[2];
    public final vn5 y = new vn5(this, (byte) 1);

    public yn5(c79 c79Var) {
        this.a = c79Var;
        Context context = c79Var.getContext();
        hj3 hj3Var = new hj3(this, (byte) 19);
        final ?? obj = new Object();
        obj.b = new ArrayList();
        obj.c = new ArrayList();
        obj.i = null;
        obj.j = new AtomicBoolean(false);
        obj.k = new AtomicBoolean(false);
        obj.l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: defpackage.e9a.run():void");
            }
        };
        obj.f = context;
        obj.e = hj3Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.a = sharedPreferences.getInt("scoreall", 0);
        h9a.m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: defpackage.e9a.run():void");
            }
        });
        this.s = obj;
    }

    public final void a(i01 i01Var, boolean z, w69 w69Var) {
        Object obj;
        b79 b79Var;
        if (this.l) {
            c79 c79Var = this.a;
            if (!c79Var.getPainting().G && this.g != null) {
                if (i01Var == null) {
                    obj = c79Var.getCurrentBrush();
                } else {
                    obj = i01Var;
                }
                if ((obj instanceof h01) || (obj instanceof j01)) {
                    obj = new Object();
                }
                ?? r4 = obj;
                this.l = false;
                if (r4 instanceof i01) {
                    c79Var.getPainting().E = false;
                }
                gu7 painting = c79Var.getPainting();
                painting.f.f(new du7(painting, (byte) 1));
                this.n = 0;
                this.o = 0;
                this.j = false;
                this.b = false;
                if (z && (b79Var = c79Var.a) != null) {
                    b79Var.S();
                }
                via viaVar = c79Var.getPainting().g;
                hd8 hd8Var = this.g;
                float a = loe.a((float) hd8Var.a, (float) hd8Var.b, 0.0f, 0.0f);
                hd8 hd8Var2 = this.g;
                float max = Math.max(a, loe.a((float) hd8Var2.a, (float) hd8Var2.b, viaVar.a, 0.0f));
                hd8 hd8Var3 = this.g;
                float a2 = loe.a((float) hd8Var3.a, (float) hd8Var3.b, 0.0f, viaVar.b);
                hd8 hd8Var4 = this.g;
                float max2 = Math.max(max, Math.max(a2, loe.a((float) hd8Var4.a, (float) hd8Var4.b, viaVar.a, viaVar.b))) / 0.84f;
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
                hd8 hd8Var5 = this.g;
                hd8 hd8Var6 = new hd8(hd8Var5.a, hd8Var5.b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.x = ofFloat;
                ofFloat.addUpdateListener(new xv1(this, hd8Var6, (m01) r4, max2));
                this.x.addListener(new xn5(this, hd8Var6, max2, r4, z, w69Var));
                this.x.setDuration(450L);
                this.x.setInterpolator(s33.h);
                this.x.start();
                if (z) {
                    pw0.IMPACT_HEAVY.a();
                }
            }
        }
    }

    public final void b(dy7 dy7Var) {
        c79 c79Var = this.a;
        int currentColor = c79Var.getCurrentColor();
        float currentWeight = c79Var.getCurrentWeight();
        m01 currentBrush = c79Var.getCurrentBrush();
        dy7Var.c = currentColor;
        dy7Var.d = currentWeight;
        dy7Var.e = currentBrush;
        if (this.f) {
            this.i = 0.0d;
        }
        dy7Var.a = this.i;
        gu7 painting = c79Var.getPainting();
        boolean z = this.f;
        wn5 wn5Var = new wn5(this, dy7Var, (byte) 0);
        if (painting.L == null) {
            painting.f.f(new hw6(painting, dy7Var, z, false, wn5Var, (byte) 1));
        }
        this.f = false;
    }

    public final void c(boolean z, float f) {
        int i = this.n;
        hd8[] hd8VarArr = this.m;
        if (i > 2) {
            Vector vector = new Vector();
            hd8 hd8Var = hd8VarArr[0];
            hd8 hd8Var2 = hd8VarArr[1];
            hd8 hd8Var3 = hd8VarArr[2];
            if (hd8Var3 != null && hd8Var2 != null && hd8Var != null) {
                hd8 b = hd8Var2.b(hd8Var);
                hd8 b2 = hd8Var3.b(hd8Var2);
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
                    double d5 = (b2.a * d2) + (hd8Var2.a * 2.0d * d4 * d) + (b.a * d3);
                    double d6 = (b2.b * d2) + (hd8Var2.b * 2.0d * d4 * d) + (b.b * d3);
                    double R1 = ((((b2.c * d2) + ((hd8Var2.c * ((2.0f * f5) * f4)) + (b.c * pow))) - 1.0d) * gl.R1(f, 1.0f, moe.a(this.o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    hd8 hd8Var4 = new hd8(d5, d6, R1);
                    if (this.c) {
                        hd8Var4.d = true;
                        this.c = false;
                    }
                    vector.add(hd8Var4);
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
                hd8[] hd8VarArr2 = new hd8[vector.size()];
                vector.toArray(hd8VarArr2);
                b(new dy7(hd8VarArr2));
                System.arraycopy(hd8VarArr, 1, hd8VarArr, 0, 2);
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
        hd8[] hd8VarArr3 = new hd8[i];
        System.arraycopy(hd8VarArr, 0, hd8VarArr3, 0, i);
        b(new dy7(hd8VarArr3));
    }
}
