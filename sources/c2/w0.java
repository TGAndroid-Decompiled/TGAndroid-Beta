package c2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
public final class w0 extends r implements t0 {
    public final String f2014f;
    public String f2015g;
    public String h;
    public boolean f2016i;
    public int f2018k;
    public s0 f2019l;
    public final y0 f2021n;
    public int f2017j = -1;
    public int f2020m = -1;

    public w0(y0 y0Var, String str) {
        this.f2021n = y0Var;
        this.f2014f = str;
    }

    @Override
    public final void a(s0 s0Var) {
        v0 v0Var = new v0(this);
        this.f2019l = s0Var;
        int i10 = s0Var.e;
        s0Var.e = i10 + 1;
        int i11 = s0Var.d;
        s0Var.d = i11 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f2014f);
        s0Var.b(11, i11, i10, null, bundle);
        s0Var.h.put(i11, v0Var);
        this.f2020m = i10;
        if (this.f2016i) {
            s0Var.a(i10);
            int i12 = this.f2017j;
            if (i12 >= 0) {
                s0Var.c(this.f2020m, i12);
                this.f2017j = -1;
            }
            int i13 = this.f2018k;
            if (i13 != 0) {
                s0Var.d(this.f2020m, i13);
                this.f2018k = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f2020m;
    }

    @Override
    public final void c() {
        s0 s0Var = this.f2019l;
        if (s0Var != null) {
            int i10 = this.f2020m;
            int i11 = s0Var.d;
            s0Var.d = i11 + 1;
            s0Var.b(4, i11, i10, null, null);
            this.f2019l = null;
            this.f2020m = 0;
        }
    }

    @Override
    public final void d() {
        y0 y0Var = this.f2021n;
        y0Var.v.remove(this);
        c();
        y0Var.r();
    }

    @Override
    public final void e() {
        this.f2016i = true;
        s0 s0Var = this.f2019l;
        if (s0Var != null) {
            s0Var.a(this.f2020m);
        }
    }

    @Override
    public final void f(int i10) {
        s0 s0Var = this.f2019l;
        if (s0Var != null) {
            s0Var.c(this.f2020m, i10);
            return;
        }
        this.f2017j = i10;
        this.f2018k = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i10) {
        this.f2016i = false;
        s0 s0Var = this.f2019l;
        if (s0Var != null) {
            int i11 = this.f2020m;
            Bundle h = android.support.v4.media.a.h(i10, "unselectReason");
            int i12 = s0Var.d;
            s0Var.d = i12 + 1;
            s0Var.b(6, i12, i11, null, h);
        }
    }

    @Override
    public final void i(int i10) {
        s0 s0Var = this.f2019l;
        if (s0Var != null) {
            s0Var.d(this.f2020m, i10);
        } else {
            this.f2018k += i10;
        }
    }

    @Override
    public final String j() {
        return this.f2015g;
    }

    @Override
    public final String k() {
        return this.h;
    }

    @Override
    public final void m(String str) {
        s0 s0Var = this.f2019l;
        if (s0Var != null) {
            int i10 = this.f2020m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = s0Var.d;
            s0Var.d = i11 + 1;
            s0Var.b(12, i11, i10, null, bundle);
        }
    }

    @Override
    public final void n(String str) {
        s0 s0Var = this.f2019l;
        if (s0Var != null) {
            int i10 = this.f2020m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = s0Var.d;
            s0Var.d = i11 + 1;
            s0Var.b(13, i11, i10, null, bundle);
        }
    }

    @Override
    public final void o(List list) {
        s0 s0Var = this.f2019l;
        if (s0Var != null) {
            int i10 = this.f2020m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i11 = s0Var.d;
            s0Var.d = i11 + 1;
            s0Var.b(14, i11, i10, null, bundle);
        }
    }
}
