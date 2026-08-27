package j4;

public final class f1 implements g1 {

    public final int f12550a;

    public f1(int i10) {
        this.f12550a = i10;
    }

    @Override
    public final g1 a(int i10, int i11) {
        return new f1((this.f12550a - i11) + i10);
    }

    @Override
    public final int b() {
        return this.f12550a > 0 ? 0 : -1;
    }

    @Override
    public final int c(int i10) {
        int i11 = i10 - 1;
        if (i11 >= 0) {
            return i11;
        }
        return -1;
    }

    @Override
    public final int d(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f12550a) {
            return i11;
        }
        return -1;
    }

    @Override
    public final g1 e(int i10, int i11) {
        return new f1(this.f12550a + i11);
    }

    @Override
    public final int f() {
        int i10 = this.f12550a;
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    @Override
    public final g1 g() {
        return new f1(0);
    }

    @Override
    public final int getLength() {
        return this.f12550a;
    }
}
