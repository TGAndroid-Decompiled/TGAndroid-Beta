package c2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public final class w0 extends q implements s0 {

    public final String f2358f;

    public String f2359g;
    public String h;

    public boolean f2360i;

    public int f2362k;

    public r0 f2363l;

    public final y0 f2365n;

    public int f2361j = -1;

    public int f2364m = -1;

    public w0(y0 y0Var, String str) {
        this.f2365n = y0Var;
        this.f2358f = str;
    }

    @Override
    public final void a(r0 r0Var) {
        v0 v0Var = new v0(this);
        this.f2363l = r0Var;
        int i10 = r0Var.f2335e;
        r0Var.f2335e = i10 + 1;
        int i11 = r0Var.d;
        r0Var.d = i11 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f2358f);
        r0Var.b(11, i11, i10, null, bundle);
        r0Var.h.put(i11, v0Var);
        this.f2364m = i10;
        if (this.f2360i) {
            r0Var.a(i10);
            int i12 = this.f2361j;
            if (i12 >= 0) {
                r0Var.c(this.f2364m, i12);
                this.f2361j = -1;
            }
            int i13 = this.f2362k;
            if (i13 != 0) {
                r0Var.d(this.f2364m, i13);
                this.f2362k = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f2364m;
    }

    @Override
    public final void c() {
        r0 r0Var = this.f2363l;
        if (r0Var != null) {
            int i10 = this.f2364m;
            int i11 = r0Var.d;
            r0Var.d = i11 + 1;
            r0Var.b(4, i11, i10, null, null);
            this.f2363l = null;
            this.f2364m = 0;
        }
    }

    @Override
    public final void d() {
        y0 y0Var = this.f2365n;
        y0Var.v.remove(this);
        c();
        y0Var.r();
    }

    @Override
    public final void e() {
        this.f2360i = true;
        r0 r0Var = this.f2363l;
        if (r0Var != null) {
            r0Var.a(this.f2364m);
        }
    }

    @Override
    public final void f(int i10) {
        r0 r0Var = this.f2363l;
        if (r0Var != null) {
            r0Var.c(this.f2364m, i10);
        } else {
            this.f2361j = i10;
            this.f2362k = 0;
        }
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i10) {
        this.f2360i = false;
        r0 r0Var = this.f2363l;
        if (r0Var != null) {
            int i11 = this.f2364m;
            Bundle bundleG = a9.p.g(i10, "unselectReason");
            int i12 = r0Var.d;
            r0Var.d = i12 + 1;
            r0Var.b(6, i12, i11, null, bundleG);
        }
    }

    @Override
    public final void i(int i10) {
        r0 r0Var = this.f2363l;
        if (r0Var != null) {
            r0Var.d(this.f2364m, i10);
        } else {
            this.f2362k += i10;
        }
    }

    @Override
    public final String j() {
        return this.f2359g;
    }

    @Override
    public final String k() {
        return this.h;
    }

    @Override
    public final void m(String str) {
        r0 r0Var = this.f2363l;
        if (r0Var != null) {
            int i10 = this.f2364m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = r0Var.d;
            r0Var.d = i11 + 1;
            r0Var.b(12, i11, i10, null, bundle);
        }
    }

    @Override
    public final void n(String str) {
        r0 r0Var = this.f2363l;
        if (r0Var != null) {
            int i10 = this.f2364m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = r0Var.d;
            r0Var.d = i11 + 1;
            r0Var.b(13, i11, i10, null, bundle);
        }
    }

    @Override
    public final void o(List list) {
        r0 r0Var = this.f2363l;
        if (r0Var != null) {
            int i10 = this.f2364m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i11 = r0Var.d;
            r0Var.d = i11 + 1;
            r0Var.b(14, i11, i10, null, bundle);
        }
    }
}
