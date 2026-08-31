package f2;
public final class b implements l0 {
    public final l0 f5729a;
    public int f5730b = 0;
    public int f5731c = -1;
    public int d = -1;

    public b(l0 l0Var) {
        this.f5729a = l0Var;
    }

    @Override
    public final void C(int i10, int i11) {
        a();
        this.f5729a.C(i10, i11);
    }

    @Override
    public final void L0(int i10, int i11) {
        int i12;
        if (this.f5730b == 2 && (i12 = this.f5731c) >= i10 && i12 <= i10 + i11) {
            this.d += i11;
            this.f5731c = i10;
            return;
        }
        a();
        this.f5731c = i10;
        this.d = i11;
        this.f5730b = 2;
    }

    public final void a() {
        int i10 = this.f5730b;
        if (i10 == 0) {
            return;
        }
        l0 l0Var = this.f5729a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    l0Var.i1(this.f5731c, this.d);
                }
            } else {
                l0Var.L0(this.f5731c, this.d);
            }
        } else {
            l0Var.j0(this.f5731c, this.d);
        }
        this.f5730b = 0;
    }

    @Override
    public final void i1(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (this.f5730b == 3 && i10 <= (i13 = this.d + (i12 = this.f5731c)) && (i14 = i10 + i11) >= i12) {
            this.f5731c = Math.min(i10, i12);
            this.d = Math.max(i13, i14) - this.f5731c;
            return;
        }
        a();
        this.f5731c = i10;
        this.d = i11;
        this.f5730b = 3;
    }

    @Override
    public final void j0(int i10, int i11) {
        int i12;
        if (this.f5730b == 1 && i10 >= (i12 = this.f5731c)) {
            int i13 = this.d;
            if (i10 <= i12 + i13) {
                this.d = i13 + i11;
                this.f5731c = Math.min(i10, i12);
                return;
            }
        }
        a();
        this.f5731c = i10;
        this.d = i11;
        this.f5730b = 1;
    }
}
