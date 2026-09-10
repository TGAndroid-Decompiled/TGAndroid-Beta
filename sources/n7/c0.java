package n7;

import java.util.Iterator;
public final class c0 extends p {
    public final transient Object d;

    public c0(Object obj) {
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
        return new u(this.d);
    }

    @Override
    public final e0 p() {
        return new u(this.d);
    }

    @Override
    public final int size() {
        return 1;
    }

    @Override
    public final n t() {
        Object[] objArr = {this.d};
        for (int i10 = 0; i10 < 1; i10++) {
            j jVar = n.f13978b;
            if (objArr[i10] == null) {
                throw new NullPointerException(hc.b.j(i10, "at index "));
            }
        }
        return n.t(1, objArr);
    }

    @Override
    public final String toString() {
        return a4.a.p("[", this.d.toString(), "]");
    }
}
