package c2;

import android.os.Bundle;
public final class x0 extends s implements t0 {
    public final String f2025a;
    public final String f2026b;
    public boolean f2027c;
    public int d = -1;
    public int e;
    public s0 f2028f;
    public int f2029g;
    public final y0 h;

    public x0(y0 y0Var, String str, String str2) {
        this.h = y0Var;
        this.f2025a = str;
        this.f2026b = str2;
    }

    @Override
    public final void a(s0 s0Var) {
        this.f2028f = s0Var;
        int i10 = s0Var.e;
        s0Var.e = i10 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.f2025a);
        bundle.putString("routeGroupId", this.f2026b);
        int i11 = s0Var.d;
        s0Var.d = i11 + 1;
        s0Var.b(3, i11, i10, null, bundle);
        this.f2029g = i10;
        if (this.f2027c) {
            s0Var.a(i10);
            int i12 = this.d;
            if (i12 >= 0) {
                s0Var.c(this.f2029g, i12);
                this.d = -1;
            }
            int i13 = this.e;
            if (i13 != 0) {
                s0Var.d(this.f2029g, i13);
                this.e = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f2029g;
    }

    @Override
    public final void c() {
        s0 s0Var = this.f2028f;
        if (s0Var != null) {
            int i10 = this.f2029g;
            int i11 = s0Var.d;
            s0Var.d = i11 + 1;
            s0Var.b(4, i11, i10, null, null);
            this.f2028f = null;
            this.f2029g = 0;
        }
    }

    @Override
    public final void d() {
        y0 y0Var = this.h;
        y0Var.v.remove(this);
        c();
        y0Var.r();
    }

    @Override
    public final void e() {
        this.f2027c = true;
        s0 s0Var = this.f2028f;
        if (s0Var != null) {
            s0Var.a(this.f2029g);
        }
    }

    @Override
    public final void f(int i10) {
        s0 s0Var = this.f2028f;
        if (s0Var != null) {
            s0Var.c(this.f2029g, i10);
            return;
        }
        this.d = i10;
        this.e = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i10) {
        this.f2027c = false;
        s0 s0Var = this.f2028f;
        if (s0Var != null) {
            int i11 = this.f2029g;
            Bundle h = android.support.v4.media.a.h(i10, "unselectReason");
            int i12 = s0Var.d;
            s0Var.d = i12 + 1;
            s0Var.b(6, i12, i11, null, h);
        }
    }

    @Override
    public final void i(int i10) {
        s0 s0Var = this.f2028f;
        if (s0Var != null) {
            s0Var.d(this.f2029g, i10);
        } else {
            this.e += i10;
        }
    }
}
