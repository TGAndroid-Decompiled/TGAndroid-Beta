package c2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
public final class y0 extends r implements u0 {
    public final String f2924f;
    public String f2925g;
    public String h;
    public boolean f2926i;
    public int f2928k;
    public t0 f2929l;
    public final a1 f2931n;
    public int f2927j = -1;
    public int f2930m = -1;

    public y0(a1 a1Var, String str) {
        this.f2931n = a1Var;
        this.f2924f = str;
    }

    @Override
    public final void a(t0 t0Var) {
        x0 x0Var = new x0(this);
        this.f2929l = t0Var;
        int i10 = t0Var.f2906e;
        t0Var.f2906e = i10 + 1;
        int i11 = t0Var.d;
        t0Var.d = i11 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f2924f);
        t0Var.b(11, i11, i10, null, bundle);
        t0Var.h.put(i11, x0Var);
        this.f2930m = i10;
        if (this.f2926i) {
            t0Var.a(i10);
            int i12 = this.f2927j;
            if (i12 >= 0) {
                t0Var.c(this.f2930m, i12);
                this.f2927j = -1;
            }
            int i13 = this.f2928k;
            if (i13 != 0) {
                t0Var.d(this.f2930m, i13);
                this.f2928k = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f2930m;
    }

    @Override
    public final void c() {
        t0 t0Var = this.f2929l;
        if (t0Var != null) {
            int i10 = this.f2930m;
            int i11 = t0Var.d;
            t0Var.d = i11 + 1;
            t0Var.b(4, i11, i10, null, null);
            this.f2929l = null;
            this.f2930m = 0;
        }
    }

    @Override
    public final void d() {
        a1 a1Var = this.f2931n;
        a1Var.v.remove(this);
        c();
        a1Var.r();
    }

    @Override
    public final void e() {
        this.f2926i = true;
        t0 t0Var = this.f2929l;
        if (t0Var != null) {
            t0Var.a(this.f2930m);
        }
    }

    @Override
    public final void f(int i10) {
        t0 t0Var = this.f2929l;
        if (t0Var != null) {
            t0Var.c(this.f2930m, i10);
            return;
        }
        this.f2927j = i10;
        this.f2928k = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i10) {
        this.f2926i = false;
        t0 t0Var = this.f2929l;
        if (t0Var != null) {
            int i11 = this.f2930m;
            Bundle h = a4.w.h(i10, "unselectReason");
            int i12 = t0Var.d;
            t0Var.d = i12 + 1;
            t0Var.b(6, i12, i11, null, h);
        }
    }

    @Override
    public final void i(int i10) {
        t0 t0Var = this.f2929l;
        if (t0Var != null) {
            t0Var.d(this.f2930m, i10);
        } else {
            this.f2928k += i10;
        }
    }

    @Override
    public final String j() {
        return this.f2925g;
    }

    @Override
    public final String k() {
        return this.h;
    }

    @Override
    public final void m(String str) {
        t0 t0Var = this.f2929l;
        if (t0Var != null) {
            int i10 = this.f2930m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = t0Var.d;
            t0Var.d = i11 + 1;
            t0Var.b(12, i11, i10, null, bundle);
        }
    }

    @Override
    public final void n(String str) {
        t0 t0Var = this.f2929l;
        if (t0Var != null) {
            int i10 = this.f2930m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = t0Var.d;
            t0Var.d = i11 + 1;
            t0Var.b(13, i11, i10, null, bundle);
        }
    }

    @Override
    public final void o(List list) {
        t0 t0Var = this.f2929l;
        if (t0Var != null) {
            int i10 = this.f2930m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i11 = t0Var.d;
            t0Var.d = i11 + 1;
            t0Var.b(14, i11, i10, null, bundle);
        }
    }
}
