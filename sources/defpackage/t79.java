package defpackage;

import android.os.Bundle;
public final class t79 extends vv6 implements p79 {
    public final String a;
    public final String b;
    public boolean c;
    public int d = -1;
    public int e;
    public o79 f;
    public int g;
    public final u79 h;

    public t79(u79 u79Var, String str, String str2) {
        this.h = u79Var;
        this.a = str;
        this.b = str2;
    }

    @Override
    public final int a() {
        return this.g;
    }

    @Override
    public final void b(o79 o79Var) {
        this.f = o79Var;
        int i = o79Var.e;
        o79Var.e = i + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.a);
        bundle.putString("routeGroupId", this.b);
        int i2 = o79Var.d;
        o79Var.d = i2 + 1;
        o79Var.b(3, i2, i, null, bundle);
        this.g = i;
        if (this.c) {
            o79Var.a(i);
            int i3 = this.d;
            if (i3 >= 0) {
                o79Var.c(this.g, i3);
                this.d = -1;
            }
            int i4 = this.e;
            if (i4 != 0) {
                o79Var.d(this.g, i4);
                this.e = 0;
            }
        }
    }

    @Override
    public final void c() {
        o79 o79Var = this.f;
        if (o79Var != null) {
            int i = this.g;
            int i2 = o79Var.d;
            o79Var.d = i2 + 1;
            o79Var.b(4, i2, i, null, null);
            this.f = null;
            this.g = 0;
        }
    }

    @Override
    public final void d() {
        u79 u79Var = this.h;
        u79Var.w.remove(this);
        c();
        u79Var.r();
    }

    @Override
    public final void e() {
        this.c = true;
        o79 o79Var = this.f;
        if (o79Var != null) {
            o79Var.a(this.g);
        }
    }

    @Override
    public final void f(int i) {
        o79 o79Var = this.f;
        if (o79Var != null) {
            o79Var.c(this.g, i);
            return;
        }
        this.d = i;
        this.e = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i) {
        this.c = false;
        o79 o79Var = this.f;
        if (o79Var != null) {
            int i2 = this.g;
            Bundle j = kt6.j(i, "unselectReason");
            int i3 = o79Var.d;
            o79Var.d = i3 + 1;
            o79Var.b(6, i3, i2, null, j);
        }
    }

    @Override
    public final void i(int i) {
        o79 o79Var = this.f;
        if (o79Var != null) {
            o79Var.d(this.g, i);
        } else {
            this.e += i;
        }
    }
}
