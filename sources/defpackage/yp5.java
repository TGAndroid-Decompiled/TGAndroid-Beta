package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
public final class yp5 {
    public static final d53 B = new d53(0.0d, 0.5d, 0.0d, 1.0d);
    public u11 A;
    public final e99 a;
    public boolean b;
    public boolean c;
    public long d;
    public boolean e;
    public boolean f;
    public jf8 g;
    public jf8 h;
    public double i;
    public boolean j;
    public float k;
    public boolean l;
    public int n;
    public int o;
    public double p;
    public double q;
    public ValueAnimator r;
    public final hba s;
    public Matrix t;
    public long v;
    public float w;
    public ValueAnimator x;
    public boolean z;
    public final jf8[] m = new jf8[3];
    public final float[] u = new float[2];
    public final vp5 y = new vp5(this, (byte) 1);

    public yp5(e99 e99Var) {
        this.a = e99Var;
        Context context = e99Var.getContext();
        sk3 sk3Var = new sk3(this, (byte) 19);
        final ?? obj = new Object();
        obj.b = new ArrayList();
        obj.c = new ArrayList();
        obj.i = null;
        obj.j = new AtomicBoolean(false);
        obj.k = new AtomicBoolean(false);
        obj.l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: defpackage.eba.run():void");
            }
        };
        obj.f = context;
        obj.e = sk3Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.a = sharedPreferences.getInt("scoreall", 0);
        hba.m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: defpackage.eba.run():void");
            }
        });
        this.s = obj;
    }

    public final void a(q11 q11Var, boolean z, y89 y89Var) {
        Object obj;
        d99 d99Var;
        if (this.l) {
            e99 e99Var = this.a;
            if (!e99Var.getPainting().G && this.g != null) {
                if (q11Var == null) {
                    obj = e99Var.getCurrentBrush();
                } else {
                    obj = q11Var;
                }
                if ((obj instanceof p11) || (obj instanceof r11)) {
                    obj = new Object();
                }
                ?? r4 = obj;
                this.l = false;
                if (r4 instanceof q11) {
                    e99Var.getPainting().E = false;
                }
                hw7 painting = e99Var.getPainting();
                painting.f.f(new ew7(painting, (byte) 1));
                this.n = 0;
                this.o = 0;
                this.j = false;
                this.b = false;
                if (z && (d99Var = e99Var.a) != null) {
                    d99Var.T();
                }
                xka xkaVar = e99Var.getPainting().g;
                jf8 jf8Var = this.g;
                float a = oqe.a((float) jf8Var.a, (float) jf8Var.b, 0.0f, 0.0f);
                jf8 jf8Var2 = this.g;
                float max = Math.max(a, oqe.a((float) jf8Var2.a, (float) jf8Var2.b, xkaVar.a, 0.0f));
                jf8 jf8Var3 = this.g;
                float a2 = oqe.a((float) jf8Var3.a, (float) jf8Var3.b, 0.0f, xkaVar.b);
                jf8 jf8Var4 = this.g;
                float max2 = Math.max(max, Math.max(a2, oqe.a((float) jf8Var4.a, (float) jf8Var4.b, xkaVar.a, xkaVar.b))) / 0.84f;
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
                jf8 jf8Var5 = this.g;
                jf8 jf8Var6 = new jf8(jf8Var5.a, jf8Var5.b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.x = ofFloat;
                ofFloat.addUpdateListener(new kx1(this, jf8Var6, (u11) r4, max2));
                this.x.addListener(new xp5(this, jf8Var6, max2, r4, z, y89Var));
                this.x.setDuration(450L);
                this.x.setInterpolator(d53.h);
                this.x.start();
                if (z) {
                    xx0.IMPACT_HEAVY.a();
                }
            }
        }
    }

    public final void b(f08 f08Var) {
        e99 e99Var = this.a;
        int currentColor = e99Var.getCurrentColor();
        float currentWeight = e99Var.getCurrentWeight();
        u11 currentBrush = e99Var.getCurrentBrush();
        f08Var.c = currentColor;
        f08Var.d = currentWeight;
        f08Var.e = currentBrush;
        if (this.f) {
            this.i = 0.0d;
        }
        f08Var.a = this.i;
        hw7 painting = e99Var.getPainting();
        boolean z = this.f;
        wp5 wp5Var = new wp5(this, f08Var, (byte) 0);
        if (painting.L == null) {
            painting.f.f(new hy6(painting, f08Var, z, false, wp5Var, (byte) 1));
        }
        this.f = false;
    }

    public final void c(boolean z, float f) {
        int i = this.n;
        jf8[] jf8VarArr = this.m;
        if (i > 2) {
            Vector vector = new Vector();
            jf8 jf8Var = jf8VarArr[0];
            jf8 jf8Var2 = jf8VarArr[1];
            jf8 jf8Var3 = jf8VarArr[2];
            if (jf8Var3 != null && jf8Var2 != null && jf8Var != null) {
                jf8 b = jf8Var2.b(jf8Var);
                jf8 b2 = jf8Var3.b(jf8Var2);
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
                    double d5 = (b2.a * d2) + (jf8Var2.a * 2.0d * d4 * d) + (b.a * d3);
                    double d6 = (b2.b * d2) + (jf8Var2.b * 2.0d * d4 * d) + (b.b * d3);
                    double R1 = ((((b2.c * d2) + ((jf8Var2.c * ((2.0f * f5) * f4)) + (b.c * pow))) - 1.0d) * gm.R1(f, 1.0f, pqe.a(this.o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    jf8 jf8Var4 = new jf8(d5, d6, R1);
                    if (this.c) {
                        jf8Var4.d = true;
                        this.c = false;
                    }
                    vector.add(jf8Var4);
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
                jf8[] jf8VarArr2 = new jf8[vector.size()];
                vector.toArray(jf8VarArr2);
                b(new f08(jf8VarArr2));
                System.arraycopy(jf8VarArr, 1, jf8VarArr, 0, 2);
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
        jf8[] jf8VarArr3 = new jf8[i];
        System.arraycopy(jf8VarArr, 0, jf8VarArr3, 0, i);
        b(new f08(jf8VarArr3));
    }
}
