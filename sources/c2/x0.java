package c2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
public final class x0 extends r implements u0 {
    public final String f2045f;
    public String f2046g;
    public String h;
    public boolean f2047i;
    public int f2049k;
    public t0 f2050l;
    public final z0 f2052n;
    public int f2048j = -1;
    public int f2051m = -1;

    public x0(z0 z0Var, String str) {
        this.f2052n = z0Var;
        this.f2045f = str;
    }

    @Override
    public final void a(t0 t0Var) {
        w0 w0Var = new w0(this);
        this.f2050l = t0Var;
        int i10 = t0Var.e;
        t0Var.e = i10 + 1;
        int i11 = t0Var.d;
        t0Var.d = i11 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f2045f);
        t0Var.b(11, i11, i10, null, bundle);
        t0Var.h.put(i11, w0Var);
        this.f2051m = i10;
        if (this.f2047i) {
            t0Var.a(i10);
            int i12 = this.f2048j;
            if (i12 >= 0) {
                t0Var.c(this.f2051m, i12);
                this.f2048j = -1;
            }
            int i13 = this.f2049k;
            if (i13 != 0) {
                t0Var.d(this.f2051m, i13);
                this.f2049k = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f2051m;
    }

    @Override
    public final void c() {
        t0 t0Var = this.f2050l;
        if (t0Var != null) {
            int i10 = this.f2051m;
            int i11 = t0Var.d;
            t0Var.d = i11 + 1;
            t0Var.b(4, i11, i10, null, null);
            this.f2050l = null;
            this.f2051m = 0;
        }
    }

    @Override
    public final void d() {
        z0 z0Var = this.f2052n;
        z0Var.v.remove(this);
        c();
        z0Var.r();
    }

    @Override
    public final void e() {
        this.f2047i = true;
        t0 t0Var = this.f2050l;
        if (t0Var != null) {
            t0Var.a(this.f2051m);
        }
    }

    @Override
    public final void f(int i10) {
        t0 t0Var = this.f2050l;
        if (t0Var != null) {
            t0Var.c(this.f2051m, i10);
            return;
        }
        this.f2048j = i10;
        this.f2049k = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i10) {
        this.f2047i = false;
        t0 t0Var = this.f2050l;
        if (t0Var != null) {
            int i11 = this.f2051m;
            Bundle h = android.support.v4.media.a.h(i10, "unselectReason");
            int i12 = t0Var.d;
            t0Var.d = i12 + 1;
            t0Var.b(6, i12, i11, null, h);
        }
    }

    @Override
    public final void i(int i10) {
        t0 t0Var = this.f2050l;
        if (t0Var != null) {
            t0Var.d(this.f2051m, i10);
        } else {
            this.f2049k += i10;
        }
    }

    @Override
    public final String j() {
        return this.f2046g;
    }

    @Override
    public final String k() {
        return this.h;
    }

    @Override
    public final void m(String str) {
        t0 t0Var = this.f2050l;
        if (t0Var != null) {
            int i10 = this.f2051m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = t0Var.d;
            t0Var.d = i11 + 1;
            t0Var.b(12, i11, i10, null, bundle);
        }
    }

    @Override
    public final void n(String str) {
        t0 t0Var = this.f2050l;
        if (t0Var != null) {
            int i10 = this.f2051m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = t0Var.d;
            t0Var.d = i11 + 1;
            t0Var.b(13, i11, i10, null, bundle);
        }
    }

    @Override
    public final void o(List list) {
        t0 t0Var = this.f2050l;
        if (t0Var != null) {
            int i10 = this.f2051m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i11 = t0Var.d;
            t0Var.d = i11 + 1;
            t0Var.b(14, i11, i10, null, bundle);
        }
    }
}
