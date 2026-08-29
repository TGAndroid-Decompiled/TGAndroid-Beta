package l4;
public final class g1 implements h1 {
    public final int f14322a;

    public g1(int i10) {
        this.f14322a = i10;
    }

    @Override
    public final h1 a(int i10, int i11) {
        return new g1((this.f14322a - i11) + i10);
    }

    @Override
    public final int b() {
        if (this.f14322a > 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public final int c(int i10) {
        int i11 = i10 - 1;
        if (i11 < 0) {
            return -1;
        }
        return i11;
    }

    @Override
    public final int d(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f14322a) {
            return i11;
        }
        return -1;
    }

    @Override
    public final h1 e(int i10, int i11) {
        return new g1(this.f14322a + i11);
    }

    @Override
    public final int f() {
        int i10 = this.f14322a;
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    @Override
    public final h1 g() {
        return new g1(0);
    }

    @Override
    public final int getLength() {
        return this.f14322a;
    }
}
