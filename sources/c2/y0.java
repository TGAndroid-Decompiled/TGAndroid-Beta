package c2;

import android.os.Bundle;
public final class y0 extends r implements t0 {
    public final String f2263a;
    public final String f2264b;
    public boolean f2265c;
    public int d = -1;
    public int f2266e;
    public s0 f2267f;
    public int f2268g;
    public final z0 h;

    public y0(z0 z0Var, String str, String str2) {
        this.h = z0Var;
        this.f2263a = str;
        this.f2264b = str2;
    }

    @Override
    public final void a(s0 s0Var) {
        this.f2267f = s0Var;
        int i9 = s0Var.f2228e;
        s0Var.f2228e = i9 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.f2263a);
        bundle.putString("routeGroupId", this.f2264b);
        int i10 = s0Var.d;
        s0Var.d = i10 + 1;
        s0Var.b(3, i10, i9, null, bundle);
        this.f2268g = i9;
        if (this.f2265c) {
            s0Var.a(i9);
            int i11 = this.d;
            if (i11 >= 0) {
                s0Var.c(this.f2268g, i11);
                this.d = -1;
            }
            int i12 = this.f2266e;
            if (i12 != 0) {
                s0Var.d(this.f2268g, i12);
                this.f2266e = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f2268g;
    }

    @Override
    public final void c() {
        s0 s0Var = this.f2267f;
        if (s0Var != null) {
            int i9 = this.f2268g;
            int i10 = s0Var.d;
            s0Var.d = i10 + 1;
            s0Var.b(4, i10, i9, null, null);
            this.f2267f = null;
            this.f2268g = 0;
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
        this.f2265c = true;
        s0 s0Var = this.f2267f;
        if (s0Var != null) {
            s0Var.a(this.f2268g);
        }
    }

    @Override
    public final void f(int i9) {
        s0 s0Var = this.f2267f;
        if (s0Var != null) {
            s0Var.c(this.f2268g, i9);
            return;
        }
        this.d = i9;
        this.f2266e = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i9) {
        this.f2265c = false;
        s0 s0Var = this.f2267f;
        if (s0Var != null) {
            int i10 = this.f2268g;
            Bundle h = aa.d.h(i9, "unselectReason");
            int i11 = s0Var.d;
            s0Var.d = i11 + 1;
            s0Var.b(6, i11, i10, null, h);
        }
    }

    @Override
    public final void i(int i9) {
        s0 s0Var = this.f2267f;
        if (s0Var != null) {
            s0Var.d(this.f2268g, i9);
        } else {
            this.f2266e += i9;
        }
    }
}
