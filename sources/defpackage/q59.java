package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
public final class q59 extends ut6 implements n59 {
    public final String f;
    public String g;
    public String h;
    public boolean i;
    public int k;
    public m59 l;
    public final s59 n;
    public int j = -1;
    public int m = -1;

    public q59(s59 s59Var, String str) {
        this.n = s59Var;
        this.f = str;
    }

    @Override
    public final int a() {
        return this.m;
    }

    @Override
    public final void b(m59 m59Var) {
        p59 p59Var = new p59(this);
        this.l = m59Var;
        int i = m59Var.e;
        m59Var.e = i + 1;
        int i2 = m59Var.d;
        m59Var.d = i2 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f);
        m59Var.b(11, i2, i, null, bundle);
        m59Var.n.put(i2, p59Var);
        this.m = i;
        if (this.i) {
            m59Var.a(i);
            int i3 = this.j;
            if (i3 >= 0) {
                m59Var.c(this.m, i3);
                this.j = -1;
            }
            int i4 = this.k;
            if (i4 != 0) {
                m59Var.d(this.m, i4);
                this.k = 0;
            }
        }
    }

    @Override
    public final void c() {
        m59 m59Var = this.l;
        if (m59Var != null) {
            int i = this.m;
            int i2 = m59Var.d;
            m59Var.d = i2 + 1;
            m59Var.b(4, i2, i, null, null);
            this.l = null;
            this.m = 0;
        }
    }

    @Override
    public final void d() {
        s59 s59Var = this.n;
        s59Var.w.remove(this);
        c();
        s59Var.r();
    }

    @Override
    public final void e() {
        this.i = true;
        m59 m59Var = this.l;
        if (m59Var != null) {
            m59Var.a(this.m);
        }
    }

    @Override
    public final void f(int i) {
        m59 m59Var = this.l;
        if (m59Var != null) {
            m59Var.c(this.m, i);
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
        m59 m59Var = this.l;
        if (m59Var != null) {
            int i2 = this.m;
            Bundle j = ls6.j(i, "unselectReason");
            int i3 = m59Var.d;
            m59Var.d = i3 + 1;
            m59Var.b(6, i3, i2, null, j);
        }
    }

    @Override
    public final void i(int i) {
        m59 m59Var = this.l;
        if (m59Var != null) {
            m59Var.d(this.m, i);
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
        m59 m59Var = this.l;
        if (m59Var != null) {
            int i = this.m;
            m59Var.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i2 = m59Var.d;
            m59Var.d = i2 + 1;
            m59Var.b(12, i2, i, null, bundle);
        }
    }

    @Override
    public final void n(String str) {
        m59 m59Var = this.l;
        if (m59Var != null) {
            int i = this.m;
            m59Var.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i2 = m59Var.d;
            m59Var.d = i2 + 1;
            m59Var.b(13, i2, i, null, bundle);
        }
    }

    @Override
    public final void o(List list) {
        m59 m59Var = this.l;
        if (m59Var != null) {
            int i = this.m;
            m59Var.getClass();
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i2 = m59Var.d;
            m59Var.d = i2 + 1;
            m59Var.b(14, i2, i, null, bundle);
        }
    }
}
