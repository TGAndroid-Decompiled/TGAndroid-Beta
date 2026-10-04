package j4;

import ai.f9;
import c3.h0;
public final class v implements i {
    public String f13936e;
    public h0 f13937f;
    public boolean f13939i;
    public int f13941k;
    public int f13942l;
    public int f13944n;
    public int f13945o;
    public int f13949s;
    public boolean f13951u;
    public int d = 0;
    public final e2.v f13933a = new e2.v(new byte[15], 2);
    public final a4.h f13934b = new a4.h();
    public final e2.v f13935c = new e2.v();
    public final f9 f13946p = new Object();
    public int f13947q = -2147483647;
    public int f13948r = -1;
    public long f13950t = -1;
    public boolean f13940j = true;
    public boolean f13943m = true;
    public double f13938g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override
    public final void a(e2.v r25) {
        throw new UnsupportedOperationException("Method not decompiled: j4.v.a(e2.v):void");
    }

    @Override
    public final void c() {
        this.d = 0;
        this.f13942l = 0;
        this.f13933a.G(2);
        this.f13944n = 0;
        this.f13945o = 0;
        this.f13947q = -2147483647;
        this.f13948r = -1;
        this.f13949s = 0;
        this.f13950t = -1L;
        this.f13951u = false;
        this.f13939i = false;
        this.f13943m = true;
        this.f13940j = true;
        this.f13938g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f13936e = f0Var.f13772e;
        f0Var.b();
        this.f13937f = qVar.Z1(f0Var.d, 1);
    }

    @Override
    public final void f(int i10, long j3) {
        this.f13941k = i10;
        if (!this.f13940j && (this.f13945o != 0 || !this.f13943m)) {
            this.f13939i = true;
        }
        if (j3 != -9223372036854775807L) {
            if (this.f13939i) {
                this.h = j3;
            } else {
                this.f13938g = j3;
            }
        }
    }

    @Override
    public final void e(boolean z10) {
    }
}
