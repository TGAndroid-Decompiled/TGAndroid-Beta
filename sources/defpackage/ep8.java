package defpackage;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.os.Build;
import android.view.View;
import java.util.Iterator;
public final class ep8 {
    public static final float[] m = new ColorMatrix().getArray();
    public static final float[] n;
    public static final eef o;
    public final ew4 a;
    public final dw4 b;
    public final kl0 c;
    public final kl0 d;
    public final kl0 e;
    public final jx4 f;
    public final e59 g;
    public final e59 h;
    public int i;
    public boolean j;
    public float k;
    public float l;

    static {
        ColorMatrix colorMatrix = new ColorMatrix();
        gl.i(colorMatrix, 0.65f);
        gl.l2(colorMatrix, 0.5f);
        n = colorMatrix.getArray();
        o = new eef((byte) 23);
    }

    public ep8(qw4 qw4Var, dg0 dg0Var) {
        dw4 dw4Var;
        e59 e59Var = new e59(0, false);
        this.g = e59Var;
        e59 e59Var2 = new e59(0, false);
        this.h = e59Var2;
        if (Build.VERSION.SDK_INT >= 31) {
            dg0Var.l = true;
            ew4 ew4Var = dg0Var.g;
            this.a = ew4Var;
            if (ew4Var != null) {
                dw4Var = ew4Var.d(4);
            } else {
                dw4Var = null;
            }
            this.b = dw4Var;
        } else {
            this.a = null;
            this.b = null;
        }
        dp8 dp8Var = new dp8(this, null);
        dp8 dp8Var2 = new dp8(this, new cp8(dg0Var.c));
        kl0 kl0Var = new kl0(dp8Var, dp8Var, dp8Var);
        kl0Var.j = qw4Var;
        kl0Var.g = e59Var;
        kl0Var.f = e59Var2;
        this.c = kl0Var;
        kl0 kl0Var2 = new kl0(dp8Var2, dp8Var2, dp8Var2);
        kl0Var2.j = qw4Var;
        kl0Var2.g = e59Var;
        kl0Var2.f = e59Var2;
        this.d = kl0Var2;
        kl0Var2.k = true;
        jx4 jx4Var = new jx4(dp8Var2, new cp8(dg0Var.f));
        this.f = jx4Var;
        kl0 kl0Var3 = new kl0(jx4Var, jx4Var, jx4Var);
        kl0Var3.j = qw4Var;
        kl0Var3.g = e59Var;
        kl0Var3.f = e59Var2;
        this.e = kl0Var3;
        kl0Var3.k = true;
    }

    public final void a() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((il0) it.next()).updateColors();
        }
        Iterator it2 = this.g.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).invalidate();
        }
    }

    public final void b(float f) {
        ew4 ew4Var;
        ColorMatrixColorFilter colorMatrixColorFilter;
        if (this.k != f) {
            this.k = f;
            if (Build.VERSION.SDK_INT >= 31 && (ew4Var = this.a) != null) {
                if (f > 0.0f) {
                    float[] fArr = m;
                    int length = fArr.length;
                    float[] fArr2 = new float[length];
                    for (int i = 0; i < length; i++) {
                        fArr2[i] = gl.R1(fArr[i], n[i], f);
                    }
                    colorMatrixColorFilter = new ColorMatrixColorFilter(fArr2);
                } else {
                    colorMatrixColorFilter = null;
                }
                if (ew4Var.k != colorMatrixColorFilter) {
                    ew4Var.k = colorMatrixColorFilter;
                    for (int i2 = 0; i2 < ew4Var.b; i2++) {
                        ((cw4) ew4Var.a.get(i2)).c(colorMatrixColorFilter);
                    }
                }
            }
            a();
        }
    }
}
