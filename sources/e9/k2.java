package e9;
public final class k2 extends y0 {
    public final transient Object d;

    public k2(Object obj) {
        obj.getClass();
        this.d = obj;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override
    public final n0 h() {
        return n0.y(this.d);
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override
    public final int m(int i10, Object[] objArr) {
        objArr[i10] = this.d;
        return i10 + 1;
    }

    @Override
    public final boolean q() {
        return false;
    }

    @Override
    public final m2 r() {
        return new e1(this.d);
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
