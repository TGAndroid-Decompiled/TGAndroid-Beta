package e9;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
import v7.u6;
public abstract class y0 extends i0 implements Set, j$.util.Set {
    public static final int f8654c = 0;
    public transient n0 f8655b;

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
        u6.f("collection too large", z10);
        return 1073741824;
    }

    public static y0 t(int i10, Object... objArr) {
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
                        int t10 = s.t(hashCode);
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
                        throw new NullPointerException(i2.d.i(i14, "at index "));
                    }
                }
                Arrays.fill(objArr, i13, i10, (Object) null);
                if (i13 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new k2(obj3);
                } else if (s(i13) < s10 / 2) {
                    return t(i13, objArr);
                } else {
                    int length = objArr.length;
                    if (i13 < (length >> 1) + (length >> 2)) {
                        objArr = Arrays.copyOf(objArr, i13);
                    }
                    return new e2(i12, i11, i13, objArr, objArr2);
                }
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new k2(obj4);
        }
        return e2.f8556s;
    }

    public static y0 u(Collection collection) {
        if ((collection instanceof y0) && !(collection instanceof SortedSet)) {
            y0 y0Var = (y0) collection;
            if (!y0Var.q()) {
                return y0Var;
            }
        }
        Object[] array = collection.toArray();
        return t(array.length, array);
    }

    public static y0 w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        boolean z10;
        if (objArr.length <= 2147483641) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.f("the total number of elements must fit in an int", z10);
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
        if ((obj instanceof y0) && (this instanceof e2) && (((y0) obj) instanceof e2) && hashCode() != obj.hashCode()) {
            return false;
        }
        return s.j(this, obj);
    }

    @Override
    public n0 h() {
        n0 n0Var = this.f8655b;
        if (n0Var == null) {
            n0 v = v();
            this.f8655b = v;
            return v;
        }
        return n0Var;
    }

    @Override
    public int hashCode() {
        return s.n(this);
    }

    public n0 v() {
        Object[] array = toArray(i0.f8574a);
        l0 l0Var = n0.f8592b;
        return n0.s(array.length, array);
    }
}
