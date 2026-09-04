package n7;

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
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override
    public final int i(Object[] objArr) {
        objArr[0] = this.d;
        return 1;
    }

    @Override
    public final Iterator iterator() {
        return new t(this.d);
    }

    @Override
    public final d0 p() {
        return new t(this.d);
    }

    @Override
    public final int size() {
        return 1;
    }

    @Override
    public final m t() {
        Object[] objArr = {this.d};
        for (int i10 = 0; i10 < 1; i10++) {
            i iVar = m.f16659b;
            if (objArr[i10] == null) {
                throw new NullPointerException(i2.g.i(i10, "at index "));
            }
        }
        return m.t(1, objArr);
    }

    @Override
    public final String toString() {
        return a4.a.p("[", this.d.toString(), "]");
    }
}
