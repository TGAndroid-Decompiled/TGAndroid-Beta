package m4;

import di.t6;
import f3.j0;
public final class v implements i {
    public String f19823e;
    public j0 f19824f;
    public boolean f19826i;
    public int f19828k;
    public int f19829l;
    public int f19831n;
    public int f19832o;
    public int f19836s;
    public boolean f19838u;
    public int d = 0;
    public final h2.x f19820a = new h2.x(new byte[15], 2);
    public final d4.f f19821b = new d4.f();
    public final h2.x f19822c = new h2.x();
    public final t6 f19833p = new t6();
    public int f19834q = -2147483647;
    public int f19835r = -1;
    public long f19837t = -1;
    public boolean f19827j = true;
    public boolean f19830m = true;
    public double f19825g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override
    public final void c(h2.x r25) {
        throw new UnsupportedOperationException("Method not decompiled: m4.v.c(h2.x):void");
    }

    @Override
    public final void d() {
        this.d = 0;
        this.f19829l = 0;
        this.f19820a.K(2);
        this.f19831n = 0;
        this.f19832o = 0;
        this.f19834q = -2147483647;
        this.f19835r = -1;
        this.f19836s = 0;
        this.f19837t = -1L;
        this.f19838u = false;
        this.f19826i = false;
        this.f19830m = true;
        this.f19827j = true;
        this.f19825g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override
    public final void f(int i7, long j3) {
        this.f19828k = i7;
        if (!this.f19827j && (this.f19832o != 0 || !this.f19830m)) {
            this.f19826i = true;
        }
        if (j3 != -9223372036854775807L) {
            if (this.f19826i) {
                this.h = j3;
            } else {
                this.f19825g = j3;
            }
        }
    }

    @Override
    public final void g(f3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.f19823e = (String) g0Var.f19674e;
        g0Var.c();
        this.f19824f = qVar.O1(g0Var.f19673c, 1);
    }

    @Override
    public final void e(boolean z9) {
    }
}
