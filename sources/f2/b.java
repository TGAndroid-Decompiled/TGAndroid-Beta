package f2;

public final class b implements m0 {

    public final m0 f5625a;

    public int f5626b = 0;

    public int f5627c = -1;
    public int d = -1;

    public b(m0 m0Var) {
        this.f5625a = m0Var;
    }

    @Override
    public final void A(int i10, int i11) {
        a();
        this.f5625a.A(i10, i11);
    }

    @Override
    public final void K0(int i10, int i11) {
        int i12;
        if (this.f5626b == 2 && (i12 = this.f5627c) >= i10 && i12 <= i10 + i11) {
            this.d += i11;
            this.f5627c = i10;
        } else {
            a();
            this.f5627c = i10;
            this.d = i11;
            this.f5626b = 2;
        }
    }

    @Override
    public final void S(int i10, int i11) {
        int i12;
        if (this.f5626b == 1 && i10 >= (i12 = this.f5627c)) {
            int i13 = this.d;
            if (i10 <= i12 + i13) {
                this.d = i13 + i11;
                this.f5627c = Math.min(i10, i12);
                return;
            }
        }
        a();
        this.f5627c = i10;
        this.d = i11;
        this.f5626b = 1;
    }

    public final void a() {
        int i10 = this.f5626b;
        if (i10 == 0) {
            return;
        }
        m0 m0Var = this.f5625a;
        if (i10 == 1) {
            m0Var.S(this.f5627c, this.d);
        } else if (i10 == 2) {
            m0Var.K0(this.f5627c, this.d);
        } else if (i10 == 3) {
            m0Var.k1(this.f5627c, this.d);
        }
        this.f5626b = 0;
    }

    @Override
    public final void k1(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (this.f5626b == 3 && i10 <= (i13 = this.d + (i12 = this.f5627c)) && (i14 = i10 + i11) >= i12) {
            this.f5627c = Math.min(i10, i12);
            this.d = Math.max(i13, i14) - this.f5627c;
        } else {
            a();
            this.f5627c = i10;
            this.d = i11;
            this.f5626b = 3;
        }
    }
}
