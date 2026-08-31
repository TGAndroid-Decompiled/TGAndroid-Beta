package o4;
public final class p0 implements q0 {
    public final int f16544a;

    public p0(int i10) {
        this.f16544a = i10;
    }

    @Override
    public final int a() {
        if (this.f16544a > 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public final q0 b(int i10) {
        return new p0(this.f16544a - i10);
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
        if (i11 < this.f16544a) {
            return i11;
        }
        return -1;
    }

    @Override
    public final q0 e(int i10) {
        return new p0(this.f16544a + i10);
    }

    @Override
    public final int f() {
        int i10 = this.f16544a;
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    @Override
    public final q0 g() {
        return new p0(0);
    }

    @Override
    public final int getLength() {
        return this.f16544a;
    }
}
