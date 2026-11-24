package defpackage;

import java.util.Iterator;
public final class s7e extends q4e {
    public final transient Object s;

    public s7e(Object obj) {
        super((byte) 5);
        this.s = obj;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.s.equals(obj);
    }

    @Override
    public final int hashCode() {
        return this.s.hashCode();
    }

    @Override
    public final Iterator iterator() {
        return new v4e(this.s);
    }

    @Override
    public final int p(Object[] objArr) {
        objArr[0] = this.s;
        return 1;
    }

    @Override
    public final int size() {
        return 1;
    }

    @Override
    public final String toString() {
        return tb4.y("[", this.s.toString(), "]");
    }
}
