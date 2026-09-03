package b7;

import java.util.Iterator;
public final class e0 extends q {
    public final transient Object d;

    public e0(Object obj) {
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
        return new w(this.d);
    }

    @Override
    public final g0 p() {
        return new w(this.d);
    }

    @Override
    public final int size() {
        return 1;
    }

    @Override
    public final o t() {
        Object[] objArr = {this.d};
        for (int i10 = 0; i10 < 1; i10++) {
            k kVar = o.f1725b;
            if (objArr[i10] == null) {
                throw new NullPointerException(kf.k0.j(i10, "at index "));
            }
        }
        return o.t(1, objArr);
    }

    @Override
    public final String toString() {
        return android.support.v4.media.a.o("[", this.d.toString(), "]");
    }
}
