package f9;
public final class e2 extends t0 {
    public final transient Object d;

    public e2(Object obj) {
        obj.getClass();
        this.d = obj;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override
    public final i0 h() {
        return i0.y(this.d);
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
    public final g2 r() {
        return new z0(this.d);
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
