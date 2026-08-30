package j3;

import android.util.SparseBooleanArray;
public final class w1 implements g {
    public final h5.g f8872a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        h5.a.i(!false);
        new h5.g(sparseBooleanArray);
        int i10 = h5.d0.f6937a;
        Integer.toString(0, 36);
    }

    public w1(h5.g gVar) {
        this.f8872a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        return this.f8872a.equals(((w1) obj).f8872a);
    }

    public final int hashCode() {
        return this.f8872a.hashCode();
    }
}
