package defpackage;
public final class m99 extends bp5 {
    public final transient to5 d;
    public final transient n99 e;

    public m99(to5 to5Var, n99 n99Var) {
        this.d = to5Var;
        this.e = n99Var;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.d.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override
    public final po5 h() {
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
    public final v9c iterator() {
        return this.e.listIterator(0);
    }

    @Override
    public final int size() {
        return this.d.size();
    }
}
