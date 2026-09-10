package e9;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
public abstract class m0 extends d0 implements Set, j$.util.Set {
    public static final int f7400c = 0;
    public transient i0 f7401b;

    public static int t(int i10) {
        int max = Math.max(i10, 2);
        boolean z10 = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z10 = false;
        }
        if (z10) {
            return 1073741824;
        }
        throw new IllegalArgumentException("collection too large");
    }

    public static m0 u(int i10, Object... objArr) {
        if (i10 != 0) {
            if (i10 != 1) {
                int t10 = t(i10);
                Object[] objArr2 = new Object[t10];
                int i11 = t10 - 1;
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < i10; i14++) {
                    Object obj = objArr[i14];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int s10 = q.s(hashCode);
                        while (true) {
                            int i15 = s10 & i11;
                            Object obj2 = objArr2[i15];
                            if (obj2 == null) {
                                objArr[i13] = obj;
                                objArr2[i15] = obj;
                                i12 += hashCode;
                                i13++;
                                break;
                            } else if (obj2.equals(obj)) {
                                break;
                            } else {
                                s10++;
                            }
                        }
                    } else {
                        throw new NullPointerException(hc.b.j(i14, "at index "));
                    }
                }
                Arrays.fill(objArr, i13, i10, (Object) null);
                if (i13 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new m1(obj3);
                } else if (t(i13) < t10 / 2) {
                    return u(i13, objArr);
                } else {
                    int length = objArr.length;
                    if (i13 < (length >> 1) + (length >> 2)) {
                        objArr = Arrays.copyOf(objArr, i13);
                    }
                    return new g1(i12, i11, i13, objArr, objArr2);
                }
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new m1(obj4);
        }
        return g1.f7378s;
    }

    public static m0 v(Collection collection) {
        if ((collection instanceof m0) && !(collection instanceof SortedSet)) {
            m0 m0Var = (m0) collection;
            if (!m0Var.r()) {
                return m0Var;
            }
        }
        Object[] array = collection.toArray();
        return u(array.length, array);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof m0) && (this instanceof g1) && (((m0) obj) instanceof g1) && hashCode() != obj.hashCode()) {
            return false;
        }
        return q.i(this, obj);
    }

    @Override
    public int hashCode() {
        return q.m(this);
    }

    @Override
    public i0 i() {
        i0 i0Var = this.f7401b;
        if (i0Var == null) {
            i0 w10 = w();
            this.f7401b = w10;
            return w10;
        }
        return i0Var;
    }

    public i0 w() {
        Object[] array = toArray(d0.f7366a);
        g0 g0Var = i0.f7384b;
        return i0.t(array.length, array);
    }
}
