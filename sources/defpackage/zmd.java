package defpackage;

import java.util.Iterator;
public final class zmd extends mid {
    public final transient Object s;

    public zmd(Object obj) {
        super((byte) 4);
        this.s = obj;
    }

    @Override
    public final xhd A() {
        Object[] objArr = {this.s};
        for (int i = 0; i < 1; i++) {
            dgd dgdVar = xhd.n;
            if (objArr[i] == null) {
                fvc.f(de9.k(i, "at index "));
                return null;
            }
        }
        return xhd.A(1, objArr);
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
        return new gkd(this.s);
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

    @Override
    public final v5c u() {
        return new gkd(this.s);
    }
}
