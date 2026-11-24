package defpackage;

import android.os.Bundle;
public final class r59 extends vt6 implements n59 {
    public final String a;
    public final String b;
    public boolean c;
    public int d = -1;
    public int e;
    public m59 f;
    public int g;
    public final s59 h;

    public r59(s59 s59Var, String str, String str2) {
        this.h = s59Var;
        this.a = str;
        this.b = str2;
    }

    @Override
    public final int a() {
        return this.g;
    }

    @Override
    public final void b(m59 m59Var) {
        this.f = m59Var;
        int i = m59Var.e;
        m59Var.e = i + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.a);
        bundle.putString("routeGroupId", this.b);
        int i2 = m59Var.d;
        m59Var.d = i2 + 1;
        m59Var.b(3, i2, i, null, bundle);
        this.g = i;
        if (this.c) {
            m59Var.a(i);
            int i3 = this.d;
            if (i3 >= 0) {
                m59Var.c(this.g, i3);
                this.d = -1;
            }
            int i4 = this.e;
            if (i4 != 0) {
                m59Var.d(this.g, i4);
                this.e = 0;
            }
        }
    }

    @Override
    public final void c() {
        m59 m59Var = this.f;
        if (m59Var != null) {
            int i = this.g;
            int i2 = m59Var.d;
            m59Var.d = i2 + 1;
            m59Var.b(4, i2, i, null, null);
            this.f = null;
            this.g = 0;
        }
    }

    @Override
    public final void d() {
        s59 s59Var = this.h;
        s59Var.w.remove(this);
        c();
        s59Var.r();
    }

    @Override
    public final void e() {
        this.c = true;
        m59 m59Var = this.f;
        if (m59Var != null) {
            m59Var.a(this.g);
        }
    }

    @Override
    public final void f(int i) {
        m59 m59Var = this.f;
        if (m59Var != null) {
            m59Var.c(this.g, i);
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
        m59 m59Var = this.f;
        if (m59Var != null) {
            int i2 = this.g;
            Bundle j = ls6.j(i, "unselectReason");
            int i3 = m59Var.d;
            m59Var.d = i3 + 1;
            m59Var.b(6, i3, i2, null, j);
        }
    }

    @Override
    public final void i(int i) {
        m59 m59Var = this.f;
        if (m59Var != null) {
            m59Var.d(this.g, i);
        } else {
            this.e += i;
        }
    }
}
