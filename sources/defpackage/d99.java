package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
public final class d99 extends zv6 implements a99 {
    public final String f;
    public String g;
    public String h;
    public boolean i;
    public int k;
    public z89 l;
    public final f99 n;
    public int j = -1;
    public int m = -1;

    public d99(f99 f99Var, String str) {
        this.n = f99Var;
        this.f = str;
    }

    @Override
    public final int a() {
        return this.m;
    }

    @Override
    public final void b(z89 z89Var) {
        c99 c99Var = new c99(this);
        this.l = z89Var;
        int i = z89Var.e;
        z89Var.e = i + 1;
        int i2 = z89Var.d;
        z89Var.d = i2 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f);
        z89Var.b(11, i2, i, null, bundle);
        z89Var.n.put(i2, c99Var);
        this.m = i;
        if (this.i) {
            z89Var.a(i);
            int i3 = this.j;
            if (i3 >= 0) {
                z89Var.c(this.m, i3);
                this.j = -1;
            }
            int i4 = this.k;
            if (i4 != 0) {
                z89Var.d(this.m, i4);
                this.k = 0;
            }
        }
    }

    @Override
    public final void c() {
        z89 z89Var = this.l;
        if (z89Var != null) {
            int i = this.m;
            int i2 = z89Var.d;
            z89Var.d = i2 + 1;
            z89Var.b(4, i2, i, null, null);
            this.l = null;
            this.m = 0;
        }
    }

    @Override
    public final void d() {
        f99 f99Var = this.n;
        f99Var.w.remove(this);
        c();
        f99Var.r();
    }

    @Override
    public final void e() {
        this.i = true;
        z89 z89Var = this.l;
        if (z89Var != null) {
            z89Var.a(this.m);
        }
    }

    @Override
    public final void f(int i) {
        z89 z89Var = this.l;
        if (z89Var != null) {
            z89Var.c(this.m, i);
            return;
        }
        this.j = i;
        this.k = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i) {
        this.i = false;
        z89 z89Var = this.l;
        if (z89Var != null) {
            int i2 = this.m;
            Bundle j = qu6.j(i, "unselectReason");
            int i3 = z89Var.d;
            z89Var.d = i3 + 1;
            z89Var.b(6, i3, i2, null, j);
        }
    }

    @Override
    public final void i(int i) {
        z89 z89Var = this.l;
        if (z89Var != null) {
            z89Var.d(this.m, i);
        } else {
            this.k += i;
        }
    }

    @Override
    public final String j() {
        return this.g;
    }

    @Override
    public final String k() {
        return this.h;
    }

    @Override
    public final void m(String str) {
        z89 z89Var = this.l;
        if (z89Var != null) {
            int i = this.m;
            z89Var.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i2 = z89Var.d;
            z89Var.d = i2 + 1;
            z89Var.b(12, i2, i, null, bundle);
        }
    }

    @Override
    public final void n(String str) {
        z89 z89Var = this.l;
        if (z89Var != null) {
            int i = this.m;
            z89Var.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i2 = z89Var.d;
            z89Var.d = i2 + 1;
            z89Var.b(13, i2, i, null, bundle);
        }
    }

    @Override
    public final void o(List list) {
        z89 z89Var = this.l;
        if (z89Var != null) {
            int i = this.m;
            z89Var.getClass();
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i2 = z89Var.d;
            z89Var.d = i2 + 1;
            z89Var.b(14, i2, i, null, bundle);
        }
    }
}
