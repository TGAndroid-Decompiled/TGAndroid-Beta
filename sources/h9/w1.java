package h9;
public final class w1 extends t0 {
    public final transient l0 d;
    public final transient x1 f14411e;

    public w1(l0 l0Var, x1 x1Var) {
        this.d = l0Var;
        this.f14411e = x1Var;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.d.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override
    public final i0 f() {
        return this.f14411e;
    }

    @Override
    public final int i(int i7, Object[] objArr) {
        return this.f14411e.i(i7, objArr);
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final h2 n() {
        return this.f14411e.listIterator(0);
    }

    @Override
    public final int size() {
        return this.d.size();
    }
}
