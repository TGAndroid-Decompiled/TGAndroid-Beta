package defpackage;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.os.Build;
import android.view.View;
import java.util.Iterator;
public final class fr8 {
    public static final float[] m = new ColorMatrix().getArray();
    public static final float[] n;
    public static final fgf o;
    public final gy4 a;
    public final fy4 b;
    public final km0 c;
    public final km0 d;
    public final km0 e;
    public final lz4 f;
    public final g79 g;
    public final g79 h;
    public int i;
    public boolean j;
    public float k;
    public float l;

    static {
        ColorMatrix colorMatrix = new ColorMatrix();
        gm.i(colorMatrix, 0.65f);
        gm.l2(colorMatrix, 0.5f);
        n = colorMatrix.getArray();
        o = new fgf((byte) 23);
    }

    public fr8(sy4 sy4Var, eh0 eh0Var) {
        fy4 fy4Var;
        g79 g79Var = new g79(0, false);
        this.g = g79Var;
        g79 g79Var2 = new g79(0, false);
        this.h = g79Var2;
        if (Build.VERSION.SDK_INT >= 31) {
            eh0Var.l = true;
            gy4 gy4Var = eh0Var.g;
            this.a = gy4Var;
            if (gy4Var != null) {
                fy4Var = gy4Var.d(4);
            } else {
                fy4Var = null;
            }
            this.b = fy4Var;
        } else {
            this.a = null;
            this.b = null;
        }
        er8 er8Var = new er8(this, null);
        er8 er8Var2 = new er8(this, new dr8(eh0Var.c));
        km0 km0Var = new km0(er8Var, er8Var, er8Var);
        km0Var.j = sy4Var;
        km0Var.g = g79Var;
        km0Var.f = g79Var2;
        this.c = km0Var;
        km0 km0Var2 = new km0(er8Var2, er8Var2, er8Var2);
        km0Var2.j = sy4Var;
        km0Var2.g = g79Var;
        km0Var2.f = g79Var2;
        this.d = km0Var2;
        km0Var2.k = true;
        lz4 lz4Var = new lz4(er8Var2, new dr8(eh0Var.f));
        this.f = lz4Var;
        km0 km0Var3 = new km0(lz4Var, lz4Var, lz4Var);
        km0Var3.j = sy4Var;
        km0Var3.g = g79Var;
        km0Var3.f = g79Var2;
        this.e = km0Var3;
        km0Var3.k = true;
    }

    public final void a() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((im0) it.next()).updateColors();
        }
        Iterator it2 = this.g.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).invalidate();
        }
    }

    public final void b(float f) {
        gy4 gy4Var;
        ColorMatrixColorFilter colorMatrixColorFilter;
        if (this.k != f) {
            this.k = f;
            if (Build.VERSION.SDK_INT >= 31 && (gy4Var = this.a) != null) {
                if (f > 0.0f) {
                    float[] fArr = m;
                    int length = fArr.length;
                    float[] fArr2 = new float[length];
                    for (int i = 0; i < length; i++) {
                        fArr2[i] = gm.R1(fArr[i], n[i], f);
                    }
                    colorMatrixColorFilter = new ColorMatrixColorFilter(fArr2);
                } else {
                    colorMatrixColorFilter = null;
                }
                if (gy4Var.k != colorMatrixColorFilter) {
                    gy4Var.k = colorMatrixColorFilter;
                    for (int i2 = 0; i2 < gy4Var.b; i2++) {
                        ((ey4) gy4Var.a.get(i2)).c(colorMatrixColorFilter);
                    }
                }
            }
            a();
        }
    }
}
