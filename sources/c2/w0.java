package c2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
public final class w0 extends r implements t0 {
    public final String f2187f;
    public String f2188g;
    public String h;
    public boolean f2189i;
    public int f2191k;
    public s0 f2192l;
    public final y0 f2194n;
    public int f2190j = -1;
    public int f2193m = -1;

    public w0(y0 y0Var, String str) {
        this.f2194n = y0Var;
        this.f2187f = str;
    }

    @Override
    public final void a(s0 s0Var) {
        v0 v0Var = new v0(this);
        this.f2192l = s0Var;
        int i10 = s0Var.f2168e;
        s0Var.f2168e = i10 + 1;
        int i11 = s0Var.d;
        s0Var.d = i11 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f2187f);
        s0Var.b(11, i11, i10, null, bundle);
        s0Var.h.put(i11, v0Var);
        this.f2193m = i10;
        if (this.f2189i) {
            s0Var.a(i10);
            int i12 = this.f2190j;
            if (i12 >= 0) {
                s0Var.c(this.f2193m, i12);
                this.f2190j = -1;
            }
            int i13 = this.f2191k;
            if (i13 != 0) {
                s0Var.d(this.f2193m, i13);
                this.f2191k = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f2193m;
    }

    @Override
    public final void c() {
        s0 s0Var = this.f2192l;
        if (s0Var != null) {
            int i10 = this.f2193m;
            int i11 = s0Var.d;
            s0Var.d = i11 + 1;
            s0Var.b(4, i11, i10, null, null);
            this.f2192l = null;
            this.f2193m = 0;
        }
    }

    @Override
    public final void d() {
        y0 y0Var = this.f2194n;
        y0Var.v.remove(this);
        c();
        y0Var.r();
    }

    @Override
    public final void e() {
        this.f2189i = true;
        s0 s0Var = this.f2192l;
        if (s0Var != null) {
            s0Var.a(this.f2193m);
        }
    }

    @Override
    public final void f(int i10) {
        s0 s0Var = this.f2192l;
        if (s0Var != null) {
            s0Var.c(this.f2193m, i10);
            return;
        }
        this.f2190j = i10;
        this.f2191k = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i10) {
        this.f2189i = false;
        s0 s0Var = this.f2192l;
        if (s0Var != null) {
            int i11 = this.f2193m;
            Bundle h = android.support.v4.media.a.h(i10, "unselectReason");
            int i12 = s0Var.d;
            s0Var.d = i12 + 1;
            s0Var.b(6, i12, i11, null, h);
        }
    }

    @Override
    public final void i(int i10) {
        s0 s0Var = this.f2192l;
        if (s0Var != null) {
            s0Var.d(this.f2193m, i10);
        } else {
            this.f2191k += i10;
        }
    }

    @Override
    public final String j() {
        return this.f2188g;
    }

    @Override
    public final String k() {
        return this.h;
    }

    @Override
    public final void m(String str) {
        s0 s0Var = this.f2192l;
        if (s0Var != null) {
            int i10 = this.f2193m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = s0Var.d;
            s0Var.d = i11 + 1;
            s0Var.b(12, i11, i10, null, bundle);
        }
    }

    @Override
    public final void n(String str) {
        s0 s0Var = this.f2192l;
        if (s0Var != null) {
            int i10 = this.f2193m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = s0Var.d;
            s0Var.d = i11 + 1;
            s0Var.b(13, i11, i10, null, bundle);
        }
    }

    @Override
    public final void o(List list) {
        s0 s0Var = this.f2192l;
        if (s0Var != null) {
            int i10 = this.f2193m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i11 = s0Var.d;
            s0Var.d = i11 + 1;
            s0Var.b(14, i11, i10, null, bundle);
        }
    }
}
