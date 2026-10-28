package f9;

import a8.yb;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
public abstract class t0 extends d0 implements Set, j$.util.Set {
    public static final int f10343c = 0;
    public transient i0 f10344b;

    public static int s(int i10) {
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
        yb.f("collection too large", z10);
        return 1073741824;
    }

    public static t0 t(int i10, Object... objArr) {
        if (i10 != 0) {
            if (i10 != 1) {
                int s10 = s(i10);
                Object[] objArr2 = new Object[s10];
                int i11 = s10 - 1;
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < i10; i14++) {
                    Object obj = objArr[i14];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int t10 = o.t(hashCode);
                        while (true) {
                            int i15 = t10 & i11;
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
                                t10++;
                            }
                        }
                    } else {
                        throw new NullPointerException(ic.a.i(i14, "at index "));
                    }
                }
                Arrays.fill(objArr, i13, i10, (Object) null);
                if (i13 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new e2(obj3);
                } else if (s(i13) < s10 / 2) {
                    return t(i13, objArr);
                } else {
                    int length = objArr.length;
                    if (i13 < (length >> 1) + (length >> 2)) {
                        objArr = Arrays.copyOf(objArr, i13);
                    }
                    return new z1(i12, i11, i13, objArr, objArr2);
                }
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new e2(obj4);
        }
        return z1.f10366s;
    }

    public static t0 u(Collection collection) {
        if ((collection instanceof t0) && !(collection instanceof SortedSet)) {
            t0 t0Var = (t0) collection;
            if (!t0Var.q()) {
                return t0Var;
            }
        }
        Object[] array = collection.toArray();
        return t(array.length, array);
    }

    public static t0 w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        boolean z10;
        if (objArr.length <= 2147483641) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.f("the total number of elements must fit in an int", z10);
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return t(length, objArr2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof t0) && (this instanceof z1) && (((t0) obj) instanceof z1) && hashCode() != obj.hashCode()) {
            return false;
        }
        return o.j(this, obj);
    }

    @Override
    public i0 h() {
        i0 i0Var = this.f10344b;
        if (i0Var == null) {
            i0 v = v();
            this.f10344b = v;
            return v;
        }
        return i0Var;
    }

    @Override
    public int hashCode() {
        return o.n(this);
    }

    public i0 v() {
        Object[] array = toArray(d0.f10272a);
        g0 g0Var = i0.f10286b;
        return i0.s(array.length, array);
    }
}
