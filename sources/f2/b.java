package f2;
public final class b implements k0 {
    public final k0 f5650a;
    public int f5651b = 0;
    public int f5652c = -1;
    public int d = -1;

    public b(k0 k0Var) {
        this.f5650a = k0Var;
    }

    @Override
    public final void D(int i10, int i11) {
        a();
        this.f5650a.D(i10, i11);
    }

    @Override
    public final void L0(int i10, int i11) {
        int i12;
        if (this.f5651b == 2 && (i12 = this.f5652c) >= i10 && i12 <= i10 + i11) {
            this.d += i11;
            this.f5652c = i10;
            return;
        }
        a();
        this.f5652c = i10;
        this.d = i11;
        this.f5651b = 2;
    }

    public final void a() {
        int i10 = this.f5651b;
        if (i10 == 0) {
            return;
        }
        k0 k0Var = this.f5650a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    k0Var.j1(this.f5652c, this.d);
                }
            } else {
                k0Var.L0(this.f5652c, this.d);
            }
        } else {
            k0Var.h0(this.f5652c, this.d);
        }
        this.f5651b = 0;
    }

    @Override
    public final void h0(int i10, int i11) {
        int i12;
        if (this.f5651b == 1 && i10 >= (i12 = this.f5652c)) {
            int i13 = this.d;
            if (i10 <= i12 + i13) {
                this.d = i13 + i11;
                this.f5652c = Math.min(i10, i12);
                return;
            }
        }
        a();
        this.f5652c = i10;
        this.d = i11;
        this.f5651b = 1;
    }

    @Override
    public final void j1(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (this.f5651b == 3 && i10 <= (i13 = this.d + (i12 = this.f5652c)) && (i14 = i10 + i11) >= i12) {
            this.f5652c = Math.min(i10, i12);
            this.d = Math.max(i13, i14) - this.f5652c;
            return;
        }
        a();
        this.f5652c = i10;
        this.d = i11;
        this.f5651b = 3;
    }
}
