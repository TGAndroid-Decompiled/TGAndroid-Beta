package defpackage;

import java.util.Iterator;
public final class qrd extends dnd {
    public final transient Object s;

    public qrd(Object obj) {
        super((byte) 4);
        this.s = obj;
    }

    @Override
    public final omd A() {
        Object[] objArr = {this.s};
        for (int i = 0; i < 1; i++) {
            ukd ukdVar = omd.n;
            if (objArr[i] == null) {
                p3d.h(uh9.k(i, "at index "));
                return null;
            }
        }
        return omd.A(1, objArr);
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
        return new xod(this.s);
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

    @Override
    public final v9c u() {
        return new xod(this.s);
    }
}
