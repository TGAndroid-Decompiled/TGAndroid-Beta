package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
public final class s79 extends uv6 implements p79 {
    public final String f;
    public String g;
    public String h;
    public boolean i;
    public int k;
    public o79 l;
    public final u79 n;
    public int j = -1;
    public int m = -1;

    public s79(u79 u79Var, String str) {
        this.n = u79Var;
        this.f = str;
    }

    @Override
    public final int a() {
        return this.m;
    }

    @Override
    public final void b(o79 o79Var) {
        r79 r79Var = new r79(this);
        this.l = o79Var;
        int i = o79Var.e;
        o79Var.e = i + 1;
        int i2 = o79Var.d;
        o79Var.d = i2 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f);
        o79Var.b(11, i2, i, null, bundle);
        o79Var.n.put(i2, r79Var);
        this.m = i;
        if (this.i) {
            o79Var.a(i);
            int i3 = this.j;
            if (i3 >= 0) {
                o79Var.c(this.m, i3);
                this.j = -1;
            }
            int i4 = this.k;
            if (i4 != 0) {
                o79Var.d(this.m, i4);
                this.k = 0;
            }
        }
    }

    @Override
    public final void c() {
        o79 o79Var = this.l;
        if (o79Var != null) {
            int i = this.m;
            int i2 = o79Var.d;
            o79Var.d = i2 + 1;
            o79Var.b(4, i2, i, null, null);
            this.l = null;
            this.m = 0;
        }
    }

    @Override
    public final void d() {
        u79 u79Var = this.n;
        u79Var.w.remove(this);
        c();
        u79Var.r();
    }

    @Override
    public final void e() {
        this.i = true;
        o79 o79Var = this.l;
        if (o79Var != null) {
            o79Var.a(this.m);
        }
    }

    @Override
    public final void f(int i) {
        o79 o79Var = this.l;
        if (o79Var != null) {
            o79Var.c(this.m, i);
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
        o79 o79Var = this.l;
        if (o79Var != null) {
            int i2 = this.m;
            Bundle j = kt6.j(i, "unselectReason");
            int i3 = o79Var.d;
            o79Var.d = i3 + 1;
            o79Var.b(6, i3, i2, null, j);
        }
    }

    @Override
    public final void i(int i) {
        o79 o79Var = this.l;
        if (o79Var != null) {
            o79Var.d(this.m, i);
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
        o79 o79Var = this.l;
        if (o79Var != null) {
            int i = this.m;
            o79Var.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i2 = o79Var.d;
            o79Var.d = i2 + 1;
            o79Var.b(12, i2, i, null, bundle);
        }
    }

    @Override
    public final void n(String str) {
        o79 o79Var = this.l;
        if (o79Var != null) {
            int i = this.m;
            o79Var.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i2 = o79Var.d;
            o79Var.d = i2 + 1;
            o79Var.b(13, i2, i, null, bundle);
        }
    }

    @Override
    public final void o(List list) {
        o79 o79Var = this.l;
        if (o79Var != null) {
            int i = this.m;
            o79Var.getClass();
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i2 = o79Var.d;
            o79Var.d = i2 + 1;
            o79Var.b(14, i2, i, null, bundle);
        }
    }
}
