package defpackage;
public final class oma extends bp5 {
    public final transient Object d;

    public oma(Object obj) {
        obj.getClass();
        this.d = obj;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override
    public final po5 h() {
        return po5.u(this.d);
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override
    public final int i(int i, Object[] objArr) {
        objArr[i] = this.d;
        return i + 1;
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final v9c iterator() {
        return new qu5(this.d);
    }

    @Override
    public final int size() {
        return 1;
    }

    @Override
    public final String toString() {
        return "[" + this.d.toString() + ']';
    }
}
