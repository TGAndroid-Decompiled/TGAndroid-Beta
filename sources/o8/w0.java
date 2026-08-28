package o8;
public final class w0 extends c0 {
    public final transient Object d;

    public w0(Object obj) {
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
    public final z i() {
        return z.y(this.d);
    }

    @Override
    public final int n(int i9, Object[] objArr) {
        objArr[i9] = this.d;
        return i9 + 1;
    }

    @Override
    public final boolean r() {
        return false;
    }

    @Override
    public final int size() {
        return 1;
    }

    @Override
    public final String toString() {
        String obj = this.d.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 2);
        sb2.append('[');
        sb2.append(obj);
        sb2.append(']');
        return sb2.toString();
    }

    @Override
    public final x0 w() {
        return new e0(this.d);
    }
}
