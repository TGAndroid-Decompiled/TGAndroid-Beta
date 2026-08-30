package eg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public class p2 {
    public boolean B;
    public Matrix[] C;
    public float[][] D;
    public int[] E;
    public float[] F;
    public boolean G;
    public f6 O;
    public long Q;
    public long R;
    public boolean f5431g;
    public boolean h;
    public Utilities.CallbackReturn f5435l;
    public boolean f5436m;
    public final int f5439p;
    public boolean f5440q;
    public int f5448z;
    public final RectF f5427a = new RectF();
    public final RectF f5428b = new RectF();
    public final RectF f5429c = new RectF();
    public Bitmap[] d = new Bitmap[3];
    public boolean[] e = new boolean[3];
    public boolean[] f5430f = new boolean[3];
    public final Paint f5432i = new Paint();
    public float f5433j = 0.0f;
    public float f5434k = 0.0f;
    public final ArrayList f5437n = new ArrayList();
    public float f5438o = 1.0f;
    public int f5441r = 14;
    public int f5442s = 12;
    public int f5443t = 10;
    public float f5444u = 0.85f;
    public float v = 0.85f;
    public float f5445w = 0.9f;
    public long f5446x = 2000;
    public int f5447y = 1000;
    public final float A = 1000.0f / AndroidUtilities.screenRefreshRate;
    public boolean H = false;
    public boolean I = true;
    public boolean J = true;
    public boolean K = false;
    public boolean L = false;
    public boolean M = true;
    public int N = -1;
    public int P = j6.Uj;
    public int S = 0;

    public p2(int i10) {
        this.f5439p = i10;
        this.B = i10 < 50;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: eg.p2.a():void");
    }

    public int b() {
        if (this.N == 100) {
            return i0.a.k(j6.v0(this.P, this.O), 200);
        }
        return j6.v0(this.P, this.O);
    }

    public final void c() {
        a();
        boolean z4 = this.G;
        int i10 = this.f5439p;
        if (z4) {
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
        ArrayList arrayList = this.f5437n;
        if (arrayList.isEmpty()) {
            for (int i12 = 0; i12 < i10; i12++) {
                arrayList.add(new o2(this));
            }
        }
    }

    public final void d(Canvas canvas) {
        e(canvas, 1.0f);
    }

    public final void e(android.graphics.Canvas r19, float r20) {
        throw new UnsupportedOperationException("Method not decompiled: eg.p2.e(android.graphics.Canvas, float):void");
    }

    public final void f() {
        long currentTimeMillis = System.currentTimeMillis();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f5437n;
            if (i10 < arrayList.size()) {
                ((o2) arrayList.get(i10)).b(currentTimeMillis);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void g() {
        int v02 = j6.v0(this.P, this.O);
        if (this.f5448z != v02) {
            this.f5448z = v02;
            a();
        }
    }
}
