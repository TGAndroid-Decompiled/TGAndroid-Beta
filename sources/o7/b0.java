package o7;

import java.util.Iterator;
public final class b0 extends o {
    public final transient Object d;

    public b0(Object obj) {
        this.d = obj;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override
    public final int h(Object[] objArr) {
        objArr[0] = this.d;
        return 1;
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override
    public final Iterator iterator() {
        return new t(this.d);
    }

    @Override
    public final d0 o() {
        return new t(this.d);
    }

    @Override
    public final m s() {
        Object[] objArr = {this.d};
        for (int i10 = 0; i10 < 1; i10++) {
            i iVar = m.f19233b;
            if (objArr[i10] == null) {
                throw new NullPointerException(ic.a.i(i10, "at index "));
            }
        }
        return m.s(1, objArr);
    }

    @Override
    public final int size() {
        return 1;
    }

    @Override
    public final String toString() {
        return a1.g.p("[", this.d.toString(), "]");
    }
}
