package defpackage;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
public final class w4b {
    public final int a;
    public final ud b;
    public final j15 c;
    public int d;
    public int e;
    public final km f;
    public final km g;
    public boolean h;
    public ec7 i;
    public int j;

    public w4b(View view) {
        ud udVar = new ud(view, (byte) 5);
        this.a = z8c.t0;
        this.b = udVar;
        d53 d53Var = d53.h;
        this.f = new km(udVar, 350L, d53Var);
        this.g = new km(udVar, 350L, d53Var);
        j15 j15Var = new j15();
        this.c = j15Var;
        j15Var.a = true;
        j15Var.b = true;
        b(false);
        float N = gm.N(2.0f);
        Paint paint = j15Var.c;
        paint.setStrokeWidth(N);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int m;
        int n;
        int i = this.j;
        int i2 = anb.b;
        km kmVar = this.g;
        km kmVar2 = this.f;
        if (i != i2) {
            this.j = i2;
            try {
                if (this.h) {
                    m = cmb.w0(null, cmb.Xk, false);
                    n = cmb.w0(null, cmb.Yk, false);
                } else {
                    ec7 ec7Var = this.i;
                    if (ec7Var != null) {
                        m = ec7Var.m(cmb.I.o());
                        n = this.i.n(cmb.I.o());
                    }
                }
                if (m != this.d || n != this.e) {
                    this.d = m;
                    this.e = n;
                    kmVar2.a(m, true);
                    kmVar.a(n, true);
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        int a = kmVar2.a(this.d, false);
        int a2 = kmVar.a(this.e, false);
        j15 j15Var = this.c;
        j15Var.d(a, a2, 0, 0);
        j15Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return j15Var.c;
    }

    public final void b(boolean z) {
        this.h = true;
        this.i = null;
        this.j = anb.b;
        d(cmb.w0(null, cmb.Xk, false), cmb.w0(null, cmb.Yk, false), z);
    }

    public final void c(ec7 ec7Var, boolean z) {
        this.i = ec7Var;
        this.j = anb.b;
        if (ec7Var != null) {
            this.h = false;
            d(ec7Var.m(cmb.I.o()), ec7Var.n(cmb.I.o()), z);
            return;
        }
        b(z);
    }

    public final void d(int i, int i2, boolean z) {
        this.d = i;
        this.e = i2;
        if (!z) {
            this.f.a(i, true);
            this.g.a(i2, true);
        }
        ud udVar = this.b;
        if (udVar != null) {
            udVar.run();
        }
    }
}
