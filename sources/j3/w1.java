package j3;

import android.util.SparseBooleanArray;
public final class w1 implements g {
    public final h5.g f9469a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        h5.a.i(!false);
        new h5.g(sparseBooleanArray);
        int i10 = h5.d0.f7237a;
        Integer.toString(0, 36);
    }

    public w1(h5.g gVar) {
        this.f9469a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        return this.f9469a.equals(((w1) obj).f9469a);
    }

    public final int hashCode() {
        return this.f9469a.hashCode();
    }
}
