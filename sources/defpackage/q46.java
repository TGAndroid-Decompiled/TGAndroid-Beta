package defpackage;

import android.view.View;
public final class q46 {
    public ns2 a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public final void a() {
        int j;
        boolean z = this.d;
        ns2 ns2Var = this.a;
        if (z) {
            j = ns2Var.f();
        } else {
            j = ns2Var.j();
        }
        this.c = j;
    }

    public final void b(int i, View view) {
        int k;
        ns2 ns2Var = this.a;
        int i2 = 0;
        if (Integer.MIN_VALUE == ns2Var.a) {
            k = 0;
        } else {
            k = ns2Var.k() - ns2Var.a;
        }
        if (k >= 0) {
            boolean z = this.d;
            ns2 ns2Var2 = this.a;
            if (z) {
                int a = ns2Var2.a(view);
                ns2 ns2Var3 = this.a;
                if (Integer.MIN_VALUE != ns2Var3.a) {
                    i2 = ns2Var3.k() - ns2Var3.a;
                }
                this.c = i2 + a;
            } else {
                this.c = ns2Var2.d(view);
            }
            this.b = i;
            return;
        }
        this.b = i;
        boolean z2 = this.d;
        ns2 ns2Var4 = this.a;
        if (z2) {
            int f = (ns2Var4.f() - k) - this.a.a(view);
            this.c = this.a.f() - f;
            if (f > 0) {
                int b = this.c - this.a.b(view);
                int j = this.a.j();
                int min = b - (Math.min(this.a.d(view) - j, 0) + j);
                if (min < 0) {
                    this.c = Math.min(f, -min) + this.c;
                    return;
                }
                return;
            }
            return;
        }
        int d = ns2Var4.d(view);
        int j2 = d - this.a.j();
        this.c = d;
        if (j2 > 0) {
            int f2 = (this.a.f() - Math.min(0, (this.a.f() - k) - this.a.a(view))) - (this.a.b(view) + d);
            if (f2 < 0) {
                this.c -= Math.min(j2, -f2);
            }
        }
    }

    public final void c() {
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.d = false;
        this.e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
    }
}
