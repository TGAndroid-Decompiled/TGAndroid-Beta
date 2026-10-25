package f9;
public final class v1 extends t0 {
    public final transient l0 d;
    public final transient w1 e;

    public v1(l0 l0Var, w1 w1Var) {
        this.d = l0Var;
        this.e = w1Var;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.d.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override
    public final i0 h() {
        return this.e;
    }

    @Override
    public final int m(int i10, Object[] objArr) {
        return this.e.m(i10, objArr);
    }

    @Override
    public final boolean q() {
        return true;
    }

    @Override
    public final g2 r() {
        return this.e.listIterator(0);
    }

    @Override
    public final int size() {
        return this.d.size();
    }
}
