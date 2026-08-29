package c2;

import android.os.Bundle;
public final class z0 extends s implements u0 {
    public final String f2941a;
    public final String f2942b;
    public boolean f2943c;
    public int d = -1;
    public int f2944e;
    public t0 f2945f;
    public int f2946g;
    public final a1 h;

    public z0(a1 a1Var, String str, String str2) {
        this.h = a1Var;
        this.f2941a = str;
        this.f2942b = str2;
    }

    @Override
    public final void a(t0 t0Var) {
        this.f2945f = t0Var;
        int i10 = t0Var.f2906e;
        t0Var.f2906e = i10 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.f2941a);
        bundle.putString("routeGroupId", this.f2942b);
        int i11 = t0Var.d;
        t0Var.d = i11 + 1;
        t0Var.b(3, i11, i10, null, bundle);
        this.f2946g = i10;
        if (this.f2943c) {
            t0Var.a(i10);
            int i12 = this.d;
            if (i12 >= 0) {
                t0Var.c(this.f2946g, i12);
                this.d = -1;
            }
            int i13 = this.f2944e;
            if (i13 != 0) {
                t0Var.d(this.f2946g, i13);
                this.f2944e = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f2946g;
    }

    @Override
    public final void c() {
        t0 t0Var = this.f2945f;
        if (t0Var != null) {
            int i10 = this.f2946g;
            int i11 = t0Var.d;
            t0Var.d = i11 + 1;
            t0Var.b(4, i11, i10, null, null);
            this.f2945f = null;
            this.f2946g = 0;
        }
    }

    @Override
    public final void d() {
        a1 a1Var = this.h;
        a1Var.v.remove(this);
        c();
        a1Var.r();
    }

    @Override
    public final void e() {
        this.f2943c = true;
        t0 t0Var = this.f2945f;
        if (t0Var != null) {
            t0Var.a(this.f2946g);
        }
    }

    @Override
    public final void f(int i10) {
        t0 t0Var = this.f2945f;
        if (t0Var != null) {
            t0Var.c(this.f2946g, i10);
            return;
        }
        this.d = i10;
        this.f2944e = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i10) {
        this.f2943c = false;
        t0 t0Var = this.f2945f;
        if (t0Var != null) {
            int i11 = this.f2946g;
            Bundle h = a4.w.h(i10, "unselectReason");
            int i12 = t0Var.d;
            t0Var.d = i12 + 1;
            t0Var.b(6, i12, i11, null, h);
        }
    }

    @Override
    public final void i(int i10) {
        t0 t0Var = this.f2945f;
        if (t0Var != null) {
            t0Var.d(this.f2946g, i10);
        } else {
            this.f2944e += i10;
        }
    }
}
