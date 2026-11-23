package h9;
public final class v1 extends t0 {
    public final transient l0 d;
    public final transient w1 f14071e;

    public v1(l0 l0Var, w1 w1Var) {
        this.d = l0Var;
        this.f14071e = w1Var;
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
        return this.f14071e;
    }

    @Override
    public final int i(int i7, Object[] objArr) {
        return this.f14071e.i(i7, objArr);
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final g2 n() {
        return this.f14071e.listIterator(0);
    }

    @Override
    public final int size() {
        return this.d.size();
    }
}
