package defpackage;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.os.Build;
import android.view.View;
import java.util.Iterator;
public final class qs8 {
    public static final float[] m = new ColorMatrix().getArray();
    public static final float[] n;
    public static final uif o;
    public final jy4 a;
    public final iy4 b;
    public final ll0 c;
    public final ll0 d;
    public final ll0 e;
    public final pz4 f;
    public final r89 g;
    public final r89 h;
    public int i;
    public boolean j;
    public float k;
    public float l;

    static {
        ColorMatrix colorMatrix = new ColorMatrix();
        hl.i(colorMatrix, 0.65f);
        hl.l2(colorMatrix, 0.5f);
        n = colorMatrix.getArray();
        o = new uif((byte) 23);
    }

    public qs8(vy4 vy4Var, eg0 eg0Var) {
        iy4 iy4Var;
        r89 r89Var = new r89(0, false);
        this.g = r89Var;
        r89 r89Var2 = new r89(0, false);
        this.h = r89Var2;
        if (Build.VERSION.SDK_INT >= 31) {
            eg0Var.l = true;
            jy4 jy4Var = eg0Var.g;
            this.a = jy4Var;
            if (jy4Var != null) {
                iy4Var = jy4Var.d(4);
            } else {
                iy4Var = null;
            }
            this.b = iy4Var;
        } else {
            this.a = null;
            this.b = null;
        }
        ps8 ps8Var = new ps8(this, null);
        ps8 ps8Var2 = new ps8(this, new os8(eg0Var.c));
        ll0 ll0Var = new ll0(ps8Var, ps8Var, ps8Var);
        ll0Var.j = vy4Var;
        ll0Var.g = r89Var;
        ll0Var.f = r89Var2;
        this.c = ll0Var;
        ll0 ll0Var2 = new ll0(ps8Var2, ps8Var2, ps8Var2);
        ll0Var2.j = vy4Var;
        ll0Var2.g = r89Var;
        ll0Var2.f = r89Var2;
        this.d = ll0Var2;
        ll0Var2.k = true;
        pz4 pz4Var = new pz4(ps8Var2, new os8(eg0Var.f));
        this.f = pz4Var;
        ll0 ll0Var3 = new ll0(pz4Var, pz4Var, pz4Var);
        ll0Var3.j = vy4Var;
        ll0Var3.g = r89Var;
        ll0Var3.f = r89Var2;
        this.e = ll0Var3;
        ll0Var3.k = true;
    }

    public final void a() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((jl0) it.next()).updateColors();
        }
        Iterator it2 = this.g.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).invalidate();
        }
    }

    public final void b(float f) {
        jy4 jy4Var;
        ColorMatrixColorFilter colorMatrixColorFilter;
        if (this.k != f) {
            this.k = f;
            if (Build.VERSION.SDK_INT >= 31 && (jy4Var = this.a) != null) {
                if (f > 0.0f) {
                    float[] fArr = m;
                    int length = fArr.length;
                    float[] fArr2 = new float[length];
                    for (int i = 0; i < length; i++) {
                        fArr2[i] = hl.R1(fArr[i], n[i], f);
                    }
                    colorMatrixColorFilter = new ColorMatrixColorFilter(fArr2);
                } else {
                    colorMatrixColorFilter = null;
                }
                if (jy4Var.k != colorMatrixColorFilter) {
                    jy4Var.k = colorMatrixColorFilter;
                    for (int i2 = 0; i2 < jy4Var.b; i2++) {
                        ((hy4) jy4Var.a.get(i2)).c(colorMatrixColorFilter);
                    }
                }
            }
            a();
        }
    }
}
