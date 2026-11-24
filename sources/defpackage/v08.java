package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class v08 {
    public boolean f;
    public boolean g;
    public boolean h;
    public Path i;
    public Paint j;
    public Drawable k;
    public final n41 l;
    public boolean m;
    public final lm n;
    public int o;
    public final w08 r;
    public final Paint a = new Paint(1);
    public final Paint b = new Paint(1);
    public final Paint c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF p = new RectF();
    public final RectF q = new RectF();

    public v08(w08 w08Var) {
        this.r = w08Var;
        this.l = new n41(w08Var);
        this.n = new lm(w08Var, 0L, 320L, s33.h);
    }

    public final void a(da7 da7Var) {
        boolean a;
        int e;
        int[] iArr;
        boolean z;
        w08 w08Var = this.r;
        wjb wjbVar = w08Var.a;
        if (da7Var == null) {
            return;
        }
        int[] iArr2 = da7Var.g;
        int[] iArr3 = da7Var.h;
        if (wjbVar == null) {
            a = bkb.I.o();
        } else {
            a = wjbVar.a();
        }
        byte b = w08Var.c;
        Paint paint = this.b;
        Paint paint2 = this.a;
        boolean z2 = true;
        if (b == 1) {
            if (a && da7Var.g() != da7Var.f() && da7Var.i() == da7Var.f()) {
                paint2.setColor(da7Var.e(1, wjbVar));
                paint.setColor(da7Var.e(0, wjbVar));
            } else {
                paint2.setColor(da7Var.e(0, wjbVar));
                paint.setColor(da7Var.e(1, wjbVar));
            }
            this.c.setColor(da7Var.e(2, wjbVar));
            int h = da7Var.h(a);
            if (a) {
                iArr = iArr3;
            } else {
                iArr = iArr2;
            }
            if (h != iArr[0]) {
                z = true;
            } else {
                z = false;
            }
            this.f = z;
            int j = da7Var.j(a);
            if (a) {
                iArr2 = iArr3;
            }
            if (j == iArr2[0]) {
                z2 = false;
            }
            this.g = z2;
            return;
        }
        paint2.setColor(da7Var.e(0, wjbVar));
        if (da7Var.o(a)) {
            e = da7Var.e(1, wjbVar);
        } else {
            e = da7Var.e(0, wjbVar);
        }
        paint.setColor(e);
        this.f = da7Var.o(a);
        this.g = false;
    }
}
