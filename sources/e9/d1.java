package e9;
public final class d1 extends m0 {
    public final transient k0 d;
    public final transient e1 f8934e;

    public d1(k0 k0Var, e1 e1Var) {
        this.d = k0Var;
        this.f8934e = e1Var;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.d.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override
    public final i0 i() {
        return this.f8934e;
    }

    @Override
    public final int n(int i10, Object[] objArr) {
        return this.f8934e.n(i10, objArr);
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final o1 s() {
        return this.f8934e.listIterator(0);
    }

    @Override
    public final int size() {
        return this.d.size();
    }
}
