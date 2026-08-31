package fg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
public class o2 {
    public boolean B;
    public Matrix[] C;
    public float[][] D;
    public int[] E;
    public float[] F;
    public boolean G;
    public g6 O;
    public long Q;
    public long R;
    public boolean f6456g;
    public boolean h;
    public Utilities.CallbackReturn f6460l;
    public boolean f6461m;
    public final int f6464p;
    public boolean f6465q;
    public int f6473z;
    public final RectF f6451a = new RectF();
    public final RectF f6452b = new RectF();
    public final RectF f6453c = new RectF();
    public Bitmap[] d = new Bitmap[3];
    public boolean[] f6454e = new boolean[3];
    public boolean[] f6455f = new boolean[3];
    public final Paint f6457i = new Paint();
    public float f6458j = 0.0f;
    public float f6459k = 0.0f;
    public final ArrayList f6462n = new ArrayList();
    public float f6463o = 1.0f;
    public int f6466r = 14;
    public int f6467s = 12;
    public int f6468t = 10;
    public float f6469u = 0.85f;
    public float v = 0.85f;
    public float f6470w = 0.9f;
    public long f6471x = 2000;
    public int f6472y = 1000;
    public final float A = 1000.0f / AndroidUtilities.screenRefreshRate;
    public boolean H = false;
    public boolean I = true;
    public boolean J = true;
    public boolean K = false;
    public boolean L = false;
    public boolean M = true;
    public int N = -1;
    public int P = k6.Uj;
    public int S = 0;

    public o2(int i10) {
        this.f6464p = i10;
        this.B = i10 < 50;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: fg.o2.a():void");
    }

    public int b() {
        if (this.N == 100) {
            return i0.a.k(k6.v0(this.P, this.O), 200);
        }
        return k6.v0(this.P, this.O);
    }

    public final void c() {
        a();
        boolean z4 = this.G;
        int i10 = this.f6464p;
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
        ArrayList arrayList = this.f6462n;
        if (arrayList.isEmpty()) {
            for (int i12 = 0; i12 < i10; i12++) {
                arrayList.add(new n2(this));
            }
        }
    }

    public final void d(Canvas canvas) {
        e(canvas, 1.0f);
    }

    public final void e(android.graphics.Canvas r19, float r20) {
        throw new UnsupportedOperationException("Method not decompiled: fg.o2.e(android.graphics.Canvas, float):void");
    }

    public final void f() {
        long currentTimeMillis = System.currentTimeMillis();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f6462n;
            if (i10 < arrayList.size()) {
                ((n2) arrayList.get(i10)).b(currentTimeMillis);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void g() {
        int v02 = k6.v0(this.P, this.O);
        if (this.f6473z != v02) {
            this.f6473z = v02;
            a();
        }
    }
}
