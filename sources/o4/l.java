package o4;

import j3.o2;
public final class l extends j3.a {
    public final o2 e;
    public final int f16379f;
    public final int h;
    public final int f16380n;

    public l(o2 o2Var, int i10) {
        super(new p0(i10));
        boolean z4;
        this.e = o2Var;
        int h = o2Var.h();
        this.f16379f = h;
        this.h = o2Var.o();
        this.f16380n = i10;
        if (h > 0) {
            if (i10 <= Integer.MAX_VALUE / h) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                throw new IllegalStateException("LoopingMediaSource contains too many periods");
            }
        }
    }

    @Override
    public final int h() {
        return this.f16379f * this.f16380n;
    }

    @Override
    public final int o() {
        return this.h * this.f16380n;
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
        return i10 / this.f16379f;
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
        return i10 * this.f16379f;
    }

    @Override
    public final int v(int i10) {
        return i10 * this.h;
    }

    @Override
    public final o2 x(int i10) {
        return this.e;
    }
}
