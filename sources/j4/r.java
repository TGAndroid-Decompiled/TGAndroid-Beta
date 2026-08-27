package j4;

import h3.s2;

public final class r extends h3.a {

    public final s2 f12646e;

    public final int f12647f;
    public final int h;

    public final int f12648n;

    public r(s2 s2Var, int i10) {
        super(new f1(i10));
        this.f12646e = s2Var;
        int iH = s2Var.h();
        this.f12647f = iH;
        this.h = s2Var.o();
        this.f12648n = i10;
        if (iH > 0) {
            if (!(i10 <= Integer.MAX_VALUE / iH)) {
                throw new IllegalStateException("LoopingMediaSource contains too many periods");
            }
        }
    }

    @Override
    public final int h() {
        return this.f12647f * this.f12648n;
    }

    @Override
    public final int o() {
        return this.h * this.f12648n;
    }

    @Override
    public final int q(Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return -1;
    }

    @Override
    public final int r(int i10) {
        return i10 / this.f12647f;
    }

    @Override
    public final int s(int i10) {
        return i10 / this.h;
    }

    @Override
    public final Object t(int i10) {
        return Integer.valueOf(i10);
    }

    @Override
    public final int u(int i10) {
        return i10 * this.f12647f;
    }

    @Override
    public final int v(int i10) {
        return i10 * this.h;
    }

    @Override
    public final s2 x(int i10) {
        return this.f12646e;
    }
}
