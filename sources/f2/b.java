package f2;
public final class b implements l0 {
    public final l0 f6272a;
    public int f6273b = 0;
    public int f6274c = -1;
    public int d = -1;

    public b(l0 l0Var) {
        this.f6272a = l0Var;
    }

    @Override
    public final void H0(int i10, int i11) {
        int i12;
        if (this.f6273b == 2 && (i12 = this.f6274c) >= i10 && i12 <= i10 + i11) {
            this.d += i11;
            this.f6274c = i10;
            return;
        }
        a();
        this.f6274c = i10;
        this.d = i11;
        this.f6273b = 2;
    }

    public final void a() {
        int i10 = this.f6273b;
        if (i10 == 0) {
            return;
        }
        l0 l0Var = this.f6272a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    l0Var.f1(this.f6274c, this.d);
                }
            } else {
                l0Var.H0(this.f6274c, this.d);
            }
        } else {
            l0Var.i0(this.f6274c, this.d);
        }
        this.f6273b = 0;
    }

    @Override
    public final void f1(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (this.f6273b == 3 && i10 <= (i13 = this.d + (i12 = this.f6274c)) && (i14 = i10 + i11) >= i12) {
            this.f6274c = Math.min(i10, i12);
            this.d = Math.max(i13, i14) - this.f6274c;
            return;
        }
        a();
        this.f6274c = i10;
        this.d = i11;
        this.f6273b = 3;
    }

    @Override
    public final void i0(int i10, int i11) {
        int i12;
        if (this.f6273b == 1 && i10 >= (i12 = this.f6274c)) {
            int i13 = this.d;
            if (i10 <= i12 + i13) {
                this.d = i13 + i11;
                this.f6274c = Math.min(i10, i12);
                return;
            }
        }
        a();
        this.f6274c = i10;
        this.d = i11;
        this.f6273b = 1;
    }

    @Override
    public final void z(int i10, int i11) {
        a();
        this.f6272a.z(i10, i11);
    }
}
