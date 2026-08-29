package cg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
public class r2 {
    public boolean B;
    public Matrix[] C;
    public float[][] D;
    public int[] E;
    public float[] F;
    public boolean G;
    public c6 O;
    public long Q;
    public long R;
    public boolean f3335g;
    public boolean h;
    public Utilities.CallbackReturn f3339l;
    public boolean f3340m;
    public final int f3343p;
    public boolean f3344q;
    public int f3352z;
    public final RectF f3330a = new RectF();
    public final RectF f3331b = new RectF();
    public final RectF f3332c = new RectF();
    public Bitmap[] d = new Bitmap[3];
    public boolean[] f3333e = new boolean[3];
    public boolean[] f3334f = new boolean[3];
    public final Paint f3336i = new Paint();
    public float f3337j = 0.0f;
    public float f3338k = 0.0f;
    public final ArrayList f3341n = new ArrayList();
    public float f3342o = 1.0f;
    public int f3345r = 14;
    public int f3346s = 12;
    public int f3347t = 10;
    public float f3348u = 0.85f;
    public float v = 0.85f;
    public float f3349w = 0.9f;
    public long f3350x = 2000;
    public int f3351y = 1000;
    public final float A = 1000.0f / AndroidUtilities.screenRefreshRate;
    public boolean H = false;
    public boolean I = true;
    public boolean J = true;
    public boolean K = false;
    public boolean L = false;
    public boolean M = true;
    public int N = -1;
    public int P = g6.Uj;
    public int S = 0;

    public r2(int i10) {
        this.f3343p = i10;
        this.B = i10 < 50;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: cg.r2.a():void");
    }

    public int b() {
        if (this.N == 100) {
            return i0.a.k(g6.v0(this.P, this.O), 200);
        }
        return g6.v0(this.P, this.O);
    }

    public final void c() {
        a();
        boolean z10 = this.G;
        int i10 = this.f3343p;
        if (z10) {
            int length = this.d.length;
            this.C = new Matrix[length];
            this.D = new float[length];
            this.E = new int[length];
            this.F = new float[length];
            for (int i11 = 0; i11 < length; i11++) {
                this.C[i11] = new Matrix();
                this.D[i11] = new float[i10 * 2];
            }
        }
        ArrayList arrayList = this.f3341n;
        if (arrayList.isEmpty()) {
            for (int i12 = 0; i12 < i10; i12++) {
                arrayList.add(new q2(this));
            }
        }
    }

    public final void d(Canvas canvas) {
        e(canvas, 1.0f);
    }

    public final void e(android.graphics.Canvas r19, float r20) {
        throw new UnsupportedOperationException("Method not decompiled: cg.r2.e(android.graphics.Canvas, float):void");
    }

    public final void f() {
        long currentTimeMillis = System.currentTimeMillis();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f3341n;
            if (i10 < arrayList.size()) {
                ((q2) arrayList.get(i10)).b(currentTimeMillis);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void g() {
        int v02 = g6.v0(this.P, this.O);
        if (this.f3352z != v02) {
            this.f3352z = v02;
            a();
        }
    }
}
