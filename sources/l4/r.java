package l4;

import j3.r2;
public final class r extends j3.a {
    public final r2 f14405e;
    public final int f14406f;
    public final int h;
    public final int f14407n;

    public r(r2 r2Var, int i10) {
        super(new g1(i10));
        boolean z10;
        this.f14405e = r2Var;
        int h = r2Var.h();
        this.f14406f = h;
        this.h = r2Var.o();
        this.f14407n = i10;
        if (h > 0) {
            if (i10 <= Integer.MAX_VALUE / h) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException("LoopingMediaSource contains too many periods");
            }
        }
    }

    @Override
    public final int h() {
        return this.f14406f * this.f14407n;
    }

    @Override
    public final int o() {
        return this.h * this.f14407n;
    }

    @Override
    public final int q(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        return ((Integer) obj).intValue();
    }

    @Override
    public final int r(int i10) {
        return i10 / this.f14406f;
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
        return i10 * this.f14406f;
    }

    @Override
    public final int v(int i10) {
        return i10 * this.h;
    }

    @Override
    public final r2 x(int i10) {
        return this.f14405e;
    }
}
