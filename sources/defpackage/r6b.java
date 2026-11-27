package defpackage;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
public final class r6b {
    public final int a;
    public final vc b;
    public final o15 c;
    public int d;
    public int e;
    public final ll f;
    public final ll g;
    public boolean h;
    public kc7 i;
    public int j;

    public r6b(View view) {
        vc vcVar = new vc(view, (byte) 6);
        this.a = yac.t0;
        this.b = vcVar;
        k43 k43Var = k43.h;
        this.f = new ll(vcVar, 350L, k43Var);
        this.g = new ll(vcVar, 350L, k43Var);
        o15 o15Var = new o15();
        this.c = o15Var;
        o15Var.a = true;
        o15Var.b = true;
        b(false);
        float N = hl.N(2.0f);
        Paint paint = o15Var.c;
        paint.setStrokeWidth(N);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int m;
        int n;
        int i = this.j;
        int i2 = yob.b;
        ll llVar = this.g;
        ll llVar2 = this.f;
        if (i != i2) {
            this.j = i2;
            try {
                if (this.h) {
                    m = aob.w0(null, aob.Yk, false);
                    n = aob.w0(null, aob.Zk, false);
                } else {
                    kc7 kc7Var = this.i;
                    if (kc7Var != null) {
                        m = kc7Var.m(aob.I.o());
                        n = this.i.n(aob.I.o());
                    }
                }
                if (m != this.d || n != this.e) {
                    this.d = m;
                    this.e = n;
                    llVar2.a(m, true);
                    llVar.a(n, true);
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        int a = llVar2.a(this.d, false);
        int a2 = llVar.a(this.e, false);
        o15 o15Var = this.c;
        o15Var.d(a, a2, 0, 0);
        o15Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return o15Var.c;
    }

    public final void b(boolean z) {
        this.h = true;
        this.i = null;
        this.j = yob.b;
        d(aob.w0(null, aob.Yk, false), aob.w0(null, aob.Zk, false), z);
    }

    public final void c(kc7 kc7Var, boolean z) {
        this.i = kc7Var;
        this.j = yob.b;
        if (kc7Var != null) {
            this.h = false;
            d(kc7Var.m(aob.I.o()), kc7Var.n(aob.I.o()), z);
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
        vc vcVar = this.b;
        if (vcVar != null) {
            vcVar.run();
        }
    }
}
