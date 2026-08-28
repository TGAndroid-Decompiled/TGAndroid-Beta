package j4;
public final class f1 implements g1 {
    public final int f13451a;

    public f1(int i9) {
        this.f13451a = i9;
    }

    @Override
    public final g1 a(int i9, int i10) {
        return new f1((this.f13451a - i10) + i9);
    }

    @Override
    public final int b() {
        if (this.f13451a > 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public final int c(int i9) {
        int i10 = i9 - 1;
        if (i10 < 0) {
            return -1;
        }
        return i10;
    }

    @Override
    public final int d(int i9) {
        int i10 = i9 + 1;
        if (i10 < this.f13451a) {
            return i10;
        }
        return -1;
    }

    @Override
    public final g1 e(int i9, int i10) {
        return new f1(this.f13451a + i10);
    }

    @Override
    public final int f() {
        int i9 = this.f13451a;
        if (i9 > 0) {
            return i9 - 1;
        }
        return -1;
    }

    @Override
    public final g1 g() {
        return new f1(0);
    }

    @Override
    public final int getLength() {
        return this.f13451a;
    }
}
