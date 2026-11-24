package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class y28 {
    public boolean f;
    public boolean g;
    public boolean h;
    public Path i;
    public Paint j;
    public Drawable k;
    public final u51 l;
    public boolean m;
    public final ln n;
    public int o;
    public final z28 r;
    public final Paint a = new Paint(1);
    public final Paint b = new Paint(1);
    public final Paint c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF p = new RectF();
    public final RectF q = new RectF();

    public y28(z28 z28Var) {
        this.r = z28Var;
        this.l = new u51(z28Var);
        this.n = new ln(z28Var, 0L, 320L, d53.h);
    }

    public final void a(ec7 ec7Var) {
        boolean a;
        int e;
        int[] iArr;
        boolean z;
        z28 z28Var = this.r;
        ylb ylbVar = z28Var.a;
        if (ec7Var == null) {
            return;
        }
        int[] iArr2 = ec7Var.g;
        int[] iArr3 = ec7Var.h;
        if (ylbVar == null) {
            a = cmb.I.o();
        } else {
            a = ylbVar.a();
        }
        byte b = z28Var.c;
        Paint paint = this.b;
        Paint paint2 = this.a;
        boolean z2 = true;
        if (b == 1) {
            if (a && ec7Var.g() != ec7Var.f() && ec7Var.i() == ec7Var.f()) {
                paint2.setColor(ec7Var.e(1, ylbVar));
                paint.setColor(ec7Var.e(0, ylbVar));
            } else {
                paint2.setColor(ec7Var.e(0, ylbVar));
                paint.setColor(ec7Var.e(1, ylbVar));
            }
            this.c.setColor(ec7Var.e(2, ylbVar));
            int h = ec7Var.h(a);
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
            int j = ec7Var.j(a);
            if (a) {
                iArr2 = iArr3;
            }
            if (j == iArr2[0]) {
                z2 = false;
            }
            this.g = z2;
            return;
        }
        paint2.setColor(ec7Var.e(0, ylbVar));
        if (ec7Var.o(a)) {
            e = ec7Var.e(1, ylbVar);
        } else {
            e = ec7Var.e(0, ylbVar);
        }
        paint.setColor(e);
        this.f = ec7Var.o(a);
        this.g = false;
    }
}
