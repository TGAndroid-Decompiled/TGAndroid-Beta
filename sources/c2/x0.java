package c2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
public final class x0 extends q implements t0 {
    public final String f2246f;
    public String f2247g;
    public String h;
    public boolean f2248i;
    public int f2250k;
    public s0 f2251l;
    public final z0 f2253n;
    public int f2249j = -1;
    public int f2252m = -1;

    public x0(z0 z0Var, String str) {
        this.f2253n = z0Var;
        this.f2246f = str;
    }

    @Override
    public final void a(s0 s0Var) {
        w0 w0Var = new w0(this);
        this.f2251l = s0Var;
        int i9 = s0Var.f2228e;
        s0Var.f2228e = i9 + 1;
        int i10 = s0Var.d;
        s0Var.d = i10 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f2246f);
        s0Var.b(11, i10, i9, null, bundle);
        s0Var.h.put(i10, w0Var);
        this.f2252m = i9;
        if (this.f2248i) {
            s0Var.a(i9);
            int i11 = this.f2249j;
            if (i11 >= 0) {
                s0Var.c(this.f2252m, i11);
                this.f2249j = -1;
            }
            int i12 = this.f2250k;
            if (i12 != 0) {
                s0Var.d(this.f2252m, i12);
                this.f2250k = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f2252m;
    }

    @Override
    public final void c() {
        s0 s0Var = this.f2251l;
        if (s0Var != null) {
            int i9 = this.f2252m;
            int i10 = s0Var.d;
            s0Var.d = i10 + 1;
            s0Var.b(4, i10, i9, null, null);
            this.f2251l = null;
            this.f2252m = 0;
        }
    }

    @Override
    public final void d() {
        z0 z0Var = this.f2253n;
        z0Var.v.remove(this);
        c();
        z0Var.r();
    }

    @Override
    public final void e() {
        this.f2248i = true;
        s0 s0Var = this.f2251l;
        if (s0Var != null) {
            s0Var.a(this.f2252m);
        }
    }

    @Override
    public final void f(int i9) {
        s0 s0Var = this.f2251l;
        if (s0Var != null) {
            s0Var.c(this.f2252m, i9);
            return;
        }
        this.f2249j = i9;
        this.f2250k = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i9) {
        this.f2248i = false;
        s0 s0Var = this.f2251l;
        if (s0Var != null) {
            int i10 = this.f2252m;
            Bundle h = aa.d.h(i9, "unselectReason");
            int i11 = s0Var.d;
            s0Var.d = i11 + 1;
            s0Var.b(6, i11, i10, null, h);
        }
    }

    @Override
    public final void i(int i9) {
        s0 s0Var = this.f2251l;
        if (s0Var != null) {
            s0Var.d(this.f2252m, i9);
        } else {
            this.f2250k += i9;
        }
    }

    @Override
    public final String j() {
        return this.f2247g;
    }

    @Override
    public final String k() {
        return this.h;
    }

    @Override
    public final void m(String str) {
        s0 s0Var = this.f2251l;
        if (s0Var != null) {
            int i9 = this.f2252m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i10 = s0Var.d;
            s0Var.d = i10 + 1;
            s0Var.b(12, i10, i9, null, bundle);
        }
    }

    @Override
    public final void n(String str) {
        s0 s0Var = this.f2251l;
        if (s0Var != null) {
            int i9 = this.f2252m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i10 = s0Var.d;
            s0Var.d = i10 + 1;
            s0Var.b(13, i10, i9, null, bundle);
        }
    }

    @Override
    public final void o(List list) {
        s0 s0Var = this.f2251l;
        if (s0Var != null) {
            int i9 = this.f2252m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i10 = s0Var.d;
            s0Var.d = i10 + 1;
            s0Var.b(14, i10, i9, null, bundle);
        }
    }
}
