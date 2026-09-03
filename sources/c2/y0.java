package c2;

import android.os.Bundle;
public final class y0 extends s implements u0 {
    public final String f2056a;
    public final String f2057b;
    public boolean f2058c;
    public int d = -1;
    public int e;
    public t0 f2059f;
    public int f2060g;
    public final z0 h;

    public y0(z0 z0Var, String str, String str2) {
        this.h = z0Var;
        this.f2056a = str;
        this.f2057b = str2;
    }

    @Override
    public final void a(t0 t0Var) {
        this.f2059f = t0Var;
        int i10 = t0Var.e;
        t0Var.e = i10 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.f2056a);
        bundle.putString("routeGroupId", this.f2057b);
        int i11 = t0Var.d;
        t0Var.d = i11 + 1;
        t0Var.b(3, i11, i10, null, bundle);
        this.f2060g = i10;
        if (this.f2058c) {
            t0Var.a(i10);
            int i12 = this.d;
            if (i12 >= 0) {
                t0Var.c(this.f2060g, i12);
                this.d = -1;
            }
            int i13 = this.e;
            if (i13 != 0) {
                t0Var.d(this.f2060g, i13);
                this.e = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f2060g;
    }

    @Override
    public final void c() {
        t0 t0Var = this.f2059f;
        if (t0Var != null) {
            int i10 = this.f2060g;
            int i11 = t0Var.d;
            t0Var.d = i11 + 1;
            t0Var.b(4, i11, i10, null, null);
            this.f2059f = null;
            this.f2060g = 0;
        }
    }

    @Override
    public final void d() {
        z0 z0Var = this.h;
        z0Var.v.remove(this);
        c();
        z0Var.r();
    }

    @Override
    public final void e() {
        this.f2058c = true;
        t0 t0Var = this.f2059f;
        if (t0Var != null) {
            t0Var.a(this.f2060g);
        }
    }

    @Override
    public final void f(int i10) {
        t0 t0Var = this.f2059f;
        if (t0Var != null) {
            t0Var.c(this.f2060g, i10);
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
        this.f2058c = false;
        t0 t0Var = this.f2059f;
        if (t0Var != null) {
            int i11 = this.f2060g;
            Bundle h = android.support.v4.media.a.h(i10, "unselectReason");
            int i12 = t0Var.d;
            t0Var.d = i12 + 1;
            t0Var.b(6, i12, i11, null, h);
        }
    }

    @Override
    public final void i(int i10) {
        t0 t0Var = this.f2059f;
        if (t0Var != null) {
            t0Var.d(this.f2060g, i10);
        } else {
            this.e += i10;
        }
    }
}
