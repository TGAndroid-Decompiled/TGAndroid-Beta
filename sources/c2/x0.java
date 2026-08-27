package c2;

import android.os.Bundle;

public final class x0 extends r implements s0 {

    public final String f2375a;

    public final String f2376b;

    public boolean f2377c;
    public int d = -1;

    public int f2378e;

    public r0 f2379f;

    public int f2380g;
    public final y0 h;

    public x0(y0 y0Var, String str, String str2) {
        this.h = y0Var;
        this.f2375a = str;
        this.f2376b = str2;
    }

    @Override
    public final void a(r0 r0Var) {
        this.f2379f = r0Var;
        int i10 = r0Var.f2335e;
        r0Var.f2335e = i10 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.f2375a);
        bundle.putString("routeGroupId", this.f2376b);
        int i11 = r0Var.d;
        r0Var.d = i11 + 1;
        r0Var.b(3, i11, i10, null, bundle);
        this.f2380g = i10;
        if (this.f2377c) {
            r0Var.a(i10);
            int i12 = this.d;
            if (i12 >= 0) {
                r0Var.c(this.f2380g, i12);
                this.d = -1;
            }
            int i13 = this.f2378e;
            if (i13 != 0) {
                r0Var.d(this.f2380g, i13);
                this.f2378e = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f2380g;
    }

    @Override
    public final void c() {
        r0 r0Var = this.f2379f;
        if (r0Var != null) {
            int i10 = this.f2380g;
            int i11 = r0Var.d;
            r0Var.d = i11 + 1;
            r0Var.b(4, i11, i10, null, null);
            this.f2379f = null;
            this.f2380g = 0;
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
        this.f2377c = true;
        r0 r0Var = this.f2379f;
        if (r0Var != null) {
            r0Var.a(this.f2380g);
        }
    }

    @Override
    public final void f(int i10) {
        r0 r0Var = this.f2379f;
        if (r0Var != null) {
            r0Var.c(this.f2380g, i10);
        } else {
            this.d = i10;
            this.f2378e = 0;
        }
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i10) {
        this.f2377c = false;
        r0 r0Var = this.f2379f;
        if (r0Var != null) {
            int i11 = this.f2380g;
            Bundle bundleG = a9.p.g(i10, "unselectReason");
            int i12 = r0Var.d;
            r0Var.d = i12 + 1;
            r0Var.b(6, i12, i11, null, bundleG);
        }
    }

    @Override
    public final void i(int i10) {
        r0 r0Var = this.f2379f;
        if (r0Var != null) {
            r0Var.d(this.f2380g, i10);
        } else {
            this.f2378e += i10;
        }
    }
}
