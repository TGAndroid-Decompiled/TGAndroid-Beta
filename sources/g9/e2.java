package g9;
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
        return i0.u(this.d);
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override
    public final int i(int i3, Object[] objArr) {
        objArr[i3] = this.d;
        return i3 + 1;
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final g2 n() {
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
