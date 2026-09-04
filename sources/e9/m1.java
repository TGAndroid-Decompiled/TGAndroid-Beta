package e9;
public final class m1 extends m0 {
    public final transient Object d;

    public m1(Object obj) {
        obj.getClass();
        this.d = obj;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override
    public final i0 i() {
        return i0.z(this.d);
    }

    @Override
    public final int n(int i10, Object[] objArr) {
        objArr[i10] = this.d;
        return i10 + 1;
    }

    @Override
    public final boolean r() {
        return false;
    }

    @Override
    public final o1 s() {
        return new p0(this.d);
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
