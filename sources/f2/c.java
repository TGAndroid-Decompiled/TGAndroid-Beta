package f2;
public final class c implements o0 {
    public final o0 f5332a;
    public int f5333b = 0;
    public int f5334c = -1;
    public int d = -1;

    public c(o0 o0Var) {
        this.f5332a = o0Var;
    }

    @Override
    public final void I(int i9, int i10) {
        int i11;
        if (this.f5333b == 1 && i9 >= (i11 = this.f5334c)) {
            int i12 = this.d;
            if (i9 <= i11 + i12) {
                this.d = i12 + i10;
                this.f5334c = Math.min(i9, i11);
                return;
            }
        }
        a();
        this.f5334c = i9;
        this.d = i10;
        this.f5333b = 1;
    }

    @Override
    public final void J0(int i9, int i10) {
        int i11;
        if (this.f5333b == 2 && (i11 = this.f5334c) >= i9 && i11 <= i9 + i10) {
            this.d += i10;
            this.f5334c = i9;
            return;
        }
        a();
        this.f5334c = i9;
        this.d = i10;
        this.f5333b = 2;
    }

    public final void a() {
        int i9 = this.f5333b;
        if (i9 == 0) {
            return;
        }
        o0 o0Var = this.f5332a;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 == 3) {
                    o0Var.j1(this.f5334c, this.d);
                }
            } else {
                o0Var.J0(this.f5334c, this.d);
            }
        } else {
            o0Var.I(this.f5334c, this.d);
        }
        this.f5333b = 0;
    }

    @Override
    public final void j1(int i9, int i10) {
        int i11;
        int i12;
        int i13;
        if (this.f5333b == 3 && i9 <= (i12 = this.d + (i11 = this.f5334c)) && (i13 = i9 + i10) >= i11) {
            this.f5334c = Math.min(i9, i11);
            this.d = Math.max(i12, i13) - this.f5334c;
            return;
        }
        a();
        this.f5334c = i9;
        this.d = i10;
        this.f5333b = 3;
    }

    @Override
    public final void t(int i9, int i10) {
        a();
        this.f5332a.t(i9, i10);
    }
}
