package defpackage;
public final class z59 extends ym5 {
    public final transient qm5 d;
    public final transient a69 e;

    public z59(qm5 qm5Var, a69 a69Var) {
        this.d = qm5Var;
        this.e = a69Var;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.d.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override
    public final mm5 h() {
        return this.e;
    }

    @Override
    public final int i(int i, Object[] objArr) {
        return this.e.i(i, objArr);
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final v5c iterator() {
        return this.e.listIterator(0);
    }

    @Override
    public final int size() {
        return this.d.size();
    }
}
