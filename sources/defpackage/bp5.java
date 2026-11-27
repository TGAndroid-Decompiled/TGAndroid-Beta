package defpackage;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
public abstract class bp5 extends jo5 implements Set, j$.util.Set {
    public static final int c = 0;
    public transient po5 b;

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
        yve.e("collection too large", z);
        return 1073741824;
    }

    public static bp5 p(int i, Object... objArr) {
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
                        int a = yne.a(hashCode);
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
                        p3d.h(uh9.k(i5, "at index "));
                        return null;
                    }
                }
                Arrays.fill(objArr, i4, i, (Object) null);
                if (i4 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new oma(obj3);
                } else if (o(i4) < o / 2) {
                    return p(i4, objArr);
                } else {
                    int length = objArr.length;
                    if (i4 < (length >> 1) + (length >> 2)) {
                        objArr = Arrays.copyOf(objArr, i4);
                    }
                    return new q99(i3, i2, i4, objArr, objArr2);
                }
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new oma(obj4);
        }
        return q99.s;
    }

    public static bp5 q(Collection collection) {
        if ((collection instanceof bp5) && !(collection instanceof SortedSet)) {
            bp5 bp5Var = (bp5) collection;
            if (!bp5Var.m()) {
                return bp5Var;
            }
        }
        Object[] array = collection.toArray();
        return p(array.length, array);
    }

    public static bp5 s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        boolean z;
        if (objArr.length <= 2147483641) {
            z = true;
        } else {
            z = false;
        }
        yve.e("the total number of elements must fit in an int", z);
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
        if ((obj instanceof bp5) && (this instanceof q99) && (((bp5) obj) instanceof q99) && ((q99) this).e != obj.hashCode()) {
            return false;
        }
        return qye.a(this, obj);
    }

    @Override
    public po5 h() {
        po5 po5Var = this.b;
        if (po5Var == null) {
            po5 r = r();
            this.b = r;
            return r;
        }
        return po5Var;
    }

    @Override
    public int hashCode() {
        return qye.c(this);
    }

    public po5 r() {
        Object[] array = toArray(jo5.a);
        no5 no5Var = po5.b;
        return po5.o(array.length, array);
    }
}
