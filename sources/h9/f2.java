package h9;
public final class f2 extends t0 {
    public final transient Object d;

    public f2(Object obj) {
        obj.getClass();
        this.d = obj;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override
    public final i0 f() {
        return i0.u(this.d);
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override
    public final int i(int i7, Object[] objArr) {
        objArr[i7] = this.d;
        return i7 + 1;
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final h2 n() {
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
