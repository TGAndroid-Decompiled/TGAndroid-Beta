package defpackage;

import java.util.Iterator;
public final class ice extends g9e {
    public final transient Object s;

    public ice(Object obj) {
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
        return new l9e(this.s);
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
        return qd4.y("[", this.s.toString(), "]");
    }
}
