package defpackage;
public final class b89 extends yo5 {
    public final transient qo5 d;
    public final transient c89 e;

    public b89(qo5 qo5Var, c89 c89Var) {
        this.d = qo5Var;
        this.e = c89Var;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.d.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override
    public final mo5 h() {
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
    public final v7c iterator() {
        return this.e.listIterator(0);
    }

    @Override
    public final int size() {
        return this.d.size();
    }
}
