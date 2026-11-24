package defpackage;
public final class vka extends yo5 {
    public final transient Object d;

    public vka(Object obj) {
        obj.getClass();
        this.d = obj;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override
    public final mo5 h() {
        return mo5.u(this.d);
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
    public final v7c iterator() {
        return new mu5(this.d);
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
