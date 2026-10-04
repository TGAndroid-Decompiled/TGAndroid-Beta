package j4;
public final class b0 implements g0 {
    public final a0 f13704a;
    public final e2.v f13705b = new e2.v(32);
    public int f13706c;
    public int d;
    public boolean f13707e;
    public boolean f13708f;

    public b0(a0 a0Var) {
        this.f13704a = a0Var;
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
            i11 = vVar.f8590b + vVar.x();
        } else {
            i11 = -1;
        }
        if (this.f13708f) {
            if (z10) {
                this.f13708f = false;
                vVar.J(i11);
                this.d = 0;
            } else {
                return;
            }
        }
        while (vVar.a() > 0) {
            int i12 = this.d;
            e2.v vVar2 = this.f13705b;
            if (i12 < 3) {
                if (i12 == 0) {
                    int x10 = vVar.x();
                    vVar.J(vVar.f8590b - 1);
                    if (x10 == 255) {
                        this.f13708f = true;
                        return;
                    }
                }
                int min = Math.min(vVar.a(), 3 - this.d);
                vVar.h(this.d, min, vVar2.f8589a);
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
                    this.f13707e = z11;
                    int i14 = (((x11 & 15) << 8) | x12) + 3;
                    this.f13706c = i14;
                    byte[] bArr = vVar2.f8589a;
                    if (bArr.length < i14) {
                        vVar2.c(Math.min(4098, Math.max(i14, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(vVar.a(), this.f13706c - this.d);
                vVar.h(this.d, min2, vVar2.f8589a);
                int i15 = this.d + min2;
                this.d = i15;
                int i16 = this.f13706c;
                if (i15 != i16) {
                    continue;
                } else {
                    if (this.f13707e) {
                        if (e2.d0.n(0, i16, -1, vVar2.f8589a) != 0) {
                            this.f13708f = true;
                            return;
                        }
                        vVar2.I(this.f13706c - 4);
                    } else {
                        vVar2.I(i16);
                    }
                    vVar2.J(0);
                    this.f13704a.a(vVar2);
                    this.d = 0;
                }
            }
        }
    }

    @Override
    public final void b(e2.b0 b0Var, c3.q qVar, f0 f0Var) {
        this.f13704a.b(b0Var, qVar, f0Var);
        this.f13708f = true;
    }

    @Override
    public final void c() {
        this.f13708f = true;
    }
}
