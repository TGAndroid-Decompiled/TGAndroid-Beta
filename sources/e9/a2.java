package e9;
public final class a2 extends y0 {
    public final transient q0 d;
    public final transient b2 e;

    public a2(q0 q0Var, b2 b2Var) {
        this.d = q0Var;
        this.e = b2Var;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.d.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override
    public final n0 h() {
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
    public final m2 r() {
        return this.e.listIterator(0);
    }

    @Override
    public final int size() {
        return this.d.size();
    }
}
