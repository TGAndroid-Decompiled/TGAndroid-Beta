package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
public class cta {
    public boolean B;
    public Matrix[] C;
    public float[][] D;
    public int[] E;
    public float[] F;
    public boolean G;
    public boolean M;
    public ylb O;
    public long Q;
    public long R;
    public boolean g;
    public boolean h;
    public rac l;
    public boolean m;
    public final short p;
    public boolean q;
    public int z;
    public final RectF a = new RectF();
    public final RectF b = new RectF();
    public final RectF c = new RectF();
    public Bitmap[] d = new Bitmap[3];
    public boolean[] e = new boolean[3];
    public boolean[] f = new boolean[3];
    public final Paint i = new Paint();
    public float j = 0.0f;
    public float k = 0.0f;
    public final ArrayList n = new ArrayList();
    public float o = 1.0f;
    public byte r = 14;
    public byte s = 12;
    public byte t = 10;
    public float u = 0.85f;
    public float v = 0.85f;
    public float w = 0.9f;
    public short x = 2000;
    public short y = 1000;
    public final float A = 1000.0f / gm.r;
    public boolean H = false;
    public boolean I = true;
    public boolean J = false;
    public boolean K = false;
    public boolean L = true;
    public int N = -1;
    public int P = cmb.Kk;
    public int S = 0;

    public cta(int i) {
        this.p = i;
        this.B = i < 50;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cta.a():void");
    }

    public int b() {
        int i = this.N;
        int i2 = this.P;
        ylb ylbVar = this.O;
        if (i == 100) {
            return on2.p(cmb.v0(i2, ylbVar), 200);
        }
        return cmb.v0(i2, ylbVar);
    }

    public final void c() {
        a();
        boolean z = this.G;
        short s = this.p;
        if (z) {
            int length = this.d.length;
            this.C = new Matrix[length];
            this.D = new float[length];
            this.E = new int[length];
            this.F = new float[length];
            for (int i = 0; i < length; i++) {
                this.C[i] = new Matrix();
                this.D[i] = new float[s << 1];
            }
        }
        ArrayList arrayList = this.n;
        if (arrayList.isEmpty()) {
            for (int i2 = 0; i2 < s; i2++) {
                arrayList.add(new bta(this));
            }
        }
    }

    public final void d(Canvas canvas) {
        e(canvas, 1.0f);
    }

    public final void e(android.graphics.Canvas r19, float r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cta.e(android.graphics.Canvas, float):void");
    }

    public final void f() {
        long currentTimeMillis = System.currentTimeMillis();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.n;
            if (i < arrayList.size()) {
                ((bta) arrayList.get(i)).b(currentTimeMillis);
                i++;
            } else {
                return;
            }
        }
    }

    public final void g() {
        int v0 = cmb.v0(this.P, this.O);
        if (this.z != v0) {
            this.z = v0;
            a();
        }
    }
}
