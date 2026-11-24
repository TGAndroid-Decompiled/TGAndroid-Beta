package defpackage;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
public final class v2b {
    public final int a;
    public final uc b;
    public final kz4 c;
    public int d;
    public int e;
    public final kl f;
    public final kl g;
    public boolean h;
    public da7 i;
    public int j;

    public v2b(View view) {
        uc ucVar = new uc(view, (byte) 5);
        this.a = y6c.t0;
        this.b = ucVar;
        s33 s33Var = s33.h;
        this.f = new kl(ucVar, 350L, s33Var);
        this.g = new kl(ucVar, 350L, s33Var);
        kz4 kz4Var = new kz4();
        this.c = kz4Var;
        kz4Var.a = true;
        kz4Var.b = true;
        b(false);
        float N = gl.N(2.0f);
        Paint paint = kz4Var.c;
        paint.setStrokeWidth(N);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int m;
        int n;
        int i = this.j;
        int i2 = zkb.b;
        kl klVar = this.g;
        kl klVar2 = this.f;
        if (i != i2) {
            this.j = i2;
            try {
                if (this.h) {
                    m = bkb.w0(null, bkb.Xk, false);
                    n = bkb.w0(null, bkb.Yk, false);
                } else {
                    da7 da7Var = this.i;
                    if (da7Var != null) {
                        m = da7Var.m(bkb.I.o());
                        n = this.i.n(bkb.I.o());
                    }
                }
                if (m != this.d || n != this.e) {
                    this.d = m;
                    this.e = n;
                    klVar2.a(m, true);
                    klVar.a(n, true);
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        int a = klVar2.a(this.d, false);
        int a2 = klVar.a(this.e, false);
        kz4 kz4Var = this.c;
        kz4Var.d(a, a2, 0, 0);
        kz4Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return kz4Var.c;
    }

    public final void b(boolean z) {
        this.h = true;
        this.i = null;
        this.j = zkb.b;
        d(bkb.w0(null, bkb.Xk, false), bkb.w0(null, bkb.Yk, false), z);
    }

    public final void c(da7 da7Var, boolean z) {
        this.i = da7Var;
        this.j = zkb.b;
        if (da7Var != null) {
            this.h = false;
            d(da7Var.m(bkb.I.o()), da7Var.n(bkb.I.o()), z);
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
        uc ucVar = this.b;
        if (ucVar != null) {
            ucVar.run();
        }
    }
}
