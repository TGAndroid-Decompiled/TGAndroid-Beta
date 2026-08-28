package j4;

import h3.r2;
public final class s extends h3.a {
    public final r2 f13549e;
    public final int f13550f;
    public final int h;
    public final int f13551n;

    public s(r2 r2Var, int i9) {
        super(new f1(i9));
        boolean z10;
        this.f13549e = r2Var;
        int h = r2Var.h();
        this.f13550f = h;
        this.h = r2Var.o();
        this.f13551n = i9;
        if (h > 0) {
            if (i9 <= Integer.MAX_VALUE / h) {
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
        return this.f13550f * this.f13551n;
    }

    @Override
    public final int o() {
        return this.h * this.f13551n;
    }

    @Override
    public final int q(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        return ((Integer) obj).intValue();
    }

    @Override
    public final int r(int i9) {
        return i9 / this.f13550f;
    }

    @Override
    public final int s(int i9) {
        return i9 / this.h;
    }

    @Override
    public final Object t(int i9) {
        return Integer.valueOf(i9);
    }

    @Override
    public final int u(int i9) {
        return i9 * this.f13550f;
    }

    @Override
    public final int v(int i9) {
        return i9 * this.h;
    }

    @Override
    public final r2 x(int i9) {
        return this.f13549e;
    }
}
