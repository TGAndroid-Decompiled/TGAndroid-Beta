package defpackage;

import android.graphics.Paint;
import java.util.Random;
public final class bc1 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public short g;
    public float[] k;
    public float[] l;
    public float[] m;
    public float[] n;
    public float[] o;
    public float[] p;
    public float[] q;
    public float[] r;
    public float[] s;
    public float[] t;
    public float[] u;
    public float[] v;
    public float[] w;
    public int x;
    public int h = -11318601;
    public final Paint i = new Paint(1);
    public final Random j = new Random();
    public int y = 255;

    public final void a() {
        int i = this.h;
        Paint paint = this.i;
        paint.setColor(i);
        paint.setAlpha((this.g * this.y) / 255);
    }

    public final void b(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bc1.b(int):void");
    }

    public final void c(int i) {
        this.x = i;
        this.k = new float[i];
        this.l = new float[i];
        this.m = new float[i];
        this.n = new float[i];
        this.o = new float[i];
        this.p = new float[i];
        this.q = new float[i];
        this.r = new float[i];
        this.s = new float[i];
        this.t = new float[i];
        this.u = new float[i];
        this.v = new float[i];
        this.w = new float[i];
        for (int i2 = 0; i2 < this.x; i2++) {
            float[] fArr = this.k;
            Random random = this.j;
            fArr[i2] = random.nextFloat();
            this.m[i2] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.x;
            b(i2);
            this.o[i2] = random.nextFloat();
        }
        a();
    }

    public final void d(float f) {
        for (int i = 0; i < this.x; i++) {
            float[] fArr = this.o;
            float f2 = fArr[i];
            float f3 = this.p[i];
            ac1 ac1Var = cc1.H;
            float f4 = (f3 * f * 8.2f) + (0.8f * f3) + f2;
            fArr[i] = f4;
            if (f4 >= 1.0f) {
                fArr[i] = 0.0f;
                this.k[i] = this.l[i];
                this.m[i] = this.n[i];
                b(i);
            }
        }
    }
}
