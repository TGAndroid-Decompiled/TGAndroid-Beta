package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class c48 {
    public boolean f;
    public boolean g;
    public boolean h;
    public Path i;
    public Paint j;
    public Drawable k;
    public final v41 l;
    public boolean m;
    public final mm n;
    public int o;
    public final d48 r;
    public final Paint a = new Paint(1);
    public final Paint b = new Paint(1);
    public final Paint c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF p = new RectF();
    public final RectF q = new RectF();

    public c48(d48 d48Var) {
        this.r = d48Var;
        this.l = new v41(d48Var);
        this.n = new mm(d48Var, 0L, 320L, k43.h);
    }

    public final void a(kc7 kc7Var) {
        boolean a;
        int e;
        int[] iArr;
        boolean z;
        d48 d48Var = this.r;
        vnb vnbVar = d48Var.a;
        if (kc7Var == null) {
            return;
        }
        int[] iArr2 = kc7Var.g;
        int[] iArr3 = kc7Var.h;
        if (vnbVar == null) {
            a = aob.I.o();
        } else {
            a = vnbVar.a();
        }
        byte b = d48Var.c;
        Paint paint = this.b;
        Paint paint2 = this.a;
        boolean z2 = true;
        if (b == 1) {
            if (a && kc7Var.g() != kc7Var.f() && kc7Var.i() == kc7Var.f()) {
                paint2.setColor(kc7Var.e(1, vnbVar));
                paint.setColor(kc7Var.e(0, vnbVar));
            } else {
                paint2.setColor(kc7Var.e(0, vnbVar));
                paint.setColor(kc7Var.e(1, vnbVar));
            }
            this.c.setColor(kc7Var.e(2, vnbVar));
            int h = kc7Var.h(a);
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
            int j = kc7Var.j(a);
            if (a) {
                iArr2 = iArr3;
            }
            if (j == iArr2[0]) {
                z2 = false;
            }
            this.g = z2;
            return;
        }
        paint2.setColor(kc7Var.e(0, vnbVar));
        if (kc7Var.o(a)) {
            e = kc7Var.e(1, vnbVar);
        } else {
            e = kc7Var.e(0, vnbVar);
        }
        paint.setColor(e);
        this.f = kc7Var.o(a);
        this.g = false;
    }
}
