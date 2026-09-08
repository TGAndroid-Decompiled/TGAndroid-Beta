package j4;
public final class b0 implements g0 {
    public final a0 f13254a;
    public final e2.v f13255b = new e2.v(32);
    public int f13256c;
    public int d;
    public boolean f13257e;
    public boolean f13258f;

    public b0(a0 a0Var) {
        this.f13254a = a0Var;
    }

    @Override
    public final void a(int i10, e2.v vVar) {
        boolean z10;
        int i11;
        boolean z11;
        if ((i10 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i11 = vVar.f8818b + vVar.x();
        } else {
            i11 = -1;
        }
        if (this.f13258f) {
            if (z10) {
                this.f13258f = false;
                vVar.J(i11);
                this.d = 0;
            } else {
                return;
            }
        }
        while (vVar.a() > 0) {
            int i12 = this.d;
            e2.v vVar2 = this.f13255b;
            if (i12 < 3) {
                if (i12 == 0) {
                    int x10 = vVar.x();
                    vVar.J(vVar.f8818b - 1);
                    if (x10 == 255) {
                        this.f13258f = true;
                        return;
                    }
                }
                int min = Math.min(vVar.a(), 3 - this.d);
                vVar.h(this.d, min, vVar2.f8817a);
                int i13 = this.d + min;
                this.d = i13;
                if (i13 == 3) {
                    vVar2.J(0);
                    vVar2.I(3);
                    vVar2.K(1);
                    int x11 = vVar2.x();
                    int x12 = vVar2.x();
                    if ((x11 & 128) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f13257e = z11;
                    int i14 = (((x11 & 15) << 8) | x12) + 3;
                    this.f13256c = i14;
                    byte[] bArr = vVar2.f8817a;
                    if (bArr.length < i14) {
                        vVar2.c(Math.min(4098, Math.max(i14, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(vVar.a(), this.f13256c - this.d);
                vVar.h(this.d, min2, vVar2.f8817a);
                int i15 = this.d + min2;
                this.d = i15;
                int i16 = this.f13256c;
                if (i15 != i16) {
                    continue;
                } else {
                    if (this.f13257e) {
                        if (e2.d0.n(0, i16, -1, vVar2.f8817a) != 0) {
                            this.f13258f = true;
                            return;
                        }
                        vVar2.I(this.f13256c - 4);
                    } else {
                        vVar2.I(i16);
                    }
                    vVar2.J(0);
                    this.f13254a.b(vVar2);
                    this.d = 0;
                }
            }
        }
    }

    @Override
    public final void c(e2.b0 b0Var, c3.q qVar, f0 f0Var) {
        this.f13254a.c(b0Var, qVar, f0Var);
        this.f13258f = true;
    }

    @Override
    public final void d() {
        this.f13258f = true;
    }
}
