package h9;

import a8.ia;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
public abstract class t0 extends d0 implements Set, j$.util.Set {
    public static final int f14395c = 0;
    public transient i0 f14396b;

    public static int o(int i7) {
        int max = Math.max(i7, 2);
        boolean z9 = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z9 = false;
        }
        ia.e("collection too large", z9);
        return 1073741824;
    }

    public static t0 p(int i7, Object... objArr) {
        if (i7 != 0) {
            if (i7 != 1) {
                int o4 = o(i7);
                Object[] objArr2 = new Object[o4];
                int i10 = o4 - 1;
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < i7; i13++) {
                    Object obj = objArr[i13];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int u10 = o.u(hashCode);
                        while (true) {
                            int i14 = u10 & i10;
                            Object obj2 = objArr2[i14];
                            if (obj2 == null) {
                                objArr[i12] = obj;
                                objArr2[i14] = obj;
                                i11 += hashCode;
                                i12++;
                                break;
                            } else if (obj2.equals(obj)) {
                                break;
                            } else {
                                u10++;
                            }
                        }
                    } else {
                        throw new NullPointerException(jg.g.j(i13, "at index "));
                    }
                }
                Arrays.fill(objArr, i12, i7, (Object) null);
                if (i12 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new f2(obj3);
                } else if (o(i12) < o4 / 2) {
                    return p(i12, objArr);
                } else {
                    int length = objArr.length;
                    if (i12 < (length >> 1) + (length >> 2)) {
                        objArr = Arrays.copyOf(objArr, i12);
                    }
                    return new a2(i11, i10, i12, objArr, objArr2);
                }
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new f2(obj4);
        }
        return a2.f14288s;
    }

    public static t0 q(Collection collection) {
        if ((collection instanceof t0) && !(collection instanceof SortedSet)) {
            t0 t0Var = (t0) collection;
            if (!t0Var.m()) {
                return t0Var;
            }
        }
        Object[] array = collection.toArray();
        return p(array.length, array);
    }

    public static t0 s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        boolean z9;
        if (objArr.length <= 2147483641) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.e("the total number of elements must fit in an int", z9);
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return p(length, objArr2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof t0) && (this instanceof a2) && (((t0) obj) instanceof a2) && hashCode() != obj.hashCode()) {
            return false;
        }
        return o.k(this, obj);
    }

    @Override
    public i0 f() {
        i0 i0Var = this.f14396b;
        if (i0Var == null) {
            i0 r10 = r();
            this.f14396b = r10;
            return r10;
        }
        return i0Var;
    }

    @Override
    public int hashCode() {
        return o.o(this);
    }

    public i0 r() {
        Object[] array = toArray(d0.f14311a);
        g0 g0Var = i0.f14329b;
        return i0.o(array.length, array);
    }
}
