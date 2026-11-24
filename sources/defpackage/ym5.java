package defpackage;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
public abstract class ym5 extends gm5 implements Set, j$.util.Set {
    public static final int c = 0;
    public transient mm5 b;

    public static int o(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        gre.e("collection too large", z);
        return 1073741824;
    }

    public static ym5 p(int i, Object... objArr) {
        if (i != 0) {
            if (i != 1) {
                int o = o(i);
                Object[] objArr2 = new Object[o];
                int i2 = o - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object obj = objArr[i5];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int a = cje.a(hashCode);
                        while (true) {
                            int i6 = a & i2;
                            Object obj2 = objArr2[i6];
                            if (obj2 == null) {
                                objArr[i4] = obj;
                                objArr2[i6] = obj;
                                i3 += hashCode;
                                i4++;
                                break;
                            } else if (obj2.equals(obj)) {
                                break;
                            } else {
                                a++;
                            }
                        }
                    } else {
                        fvc.f(de9.k(i5, "at index "));
                        return null;
                    }
                }
                Arrays.fill(objArr, i4, i, (Object) null);
                if (i4 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new tia(obj3);
                } else if (o(i4) < o / 2) {
                    return p(i4, objArr);
                } else {
                    int length = objArr.length;
                    if (i4 < (length >> 1) + (length >> 2)) {
                        objArr = Arrays.copyOf(objArr, i4);
                    }
                    return new d69(i3, i2, i4, objArr, objArr2);
                }
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new tia(obj4);
        }
        return d69.s;
    }

    public static ym5 q(Collection collection) {
        if ((collection instanceof ym5) && !(collection instanceof SortedSet)) {
            ym5 ym5Var = (ym5) collection;
            if (!ym5Var.m()) {
                return ym5Var;
            }
        }
        Object[] array = collection.toArray();
        return p(array.length, array);
    }

    public static ym5 s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        boolean z;
        if (objArr.length <= 2147483641) {
            z = true;
        } else {
            z = false;
        }
        gre.e("the total number of elements must fit in an int", z);
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
        if ((obj instanceof ym5) && (this instanceof d69) && (((ym5) obj) instanceof d69) && ((d69) this).e != obj.hashCode()) {
            return false;
        }
        return yte.a(this, obj);
    }

    @Override
    public mm5 h() {
        mm5 mm5Var = this.b;
        if (mm5Var == null) {
            mm5 r = r();
            this.b = r;
            return r;
        }
        return mm5Var;
    }

    @Override
    public int hashCode() {
        return yte.c(this);
    }

    public mm5 r() {
        Object[] array = toArray(gm5.a);
        km5 km5Var = mm5.b;
        return mm5.o(array.length, array);
    }
}
