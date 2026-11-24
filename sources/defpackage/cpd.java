package defpackage;

import java.util.Iterator;
public final class cpd extends okd {
    public final transient Object s;

    public cpd(Object obj) {
        super((byte) 4);
        this.s = obj;
    }

    @Override
    public final yjd A() {
        Object[] objArr = {this.s};
        for (int i = 0; i < 1; i++) {
            eid eidVar = yjd.n;
            if (objArr[i] == null) {
                gxc.d(hg9.j(i, "at index "));
                return null;
            }
        }
        return yjd.A(1, objArr);
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
        return new imd(this.s);
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
        return kt6.o("[", this.s.toString(), "]");
    }

    @Override
    public final v7c u() {
        return new imd(this.s);
    }
}
