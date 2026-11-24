package defpackage;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
public abstract class yo5 extends go5 implements Set, j$.util.Set {
    public static final int c = 0;
    public transient mo5 b;

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
        jte.e("collection too large", z);
        return 1073741824;
    }

    public static yo5 p(int i, Object... objArr) {
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
                        int a = dle.a(hashCode);
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
                        gxc.d(hg9.j(i5, "at index "));
                        return null;
                    }
                }
                Arrays.fill(objArr, i4, i, (Object) null);
                if (i4 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new vka(obj3);
                } else if (o(i4) < o / 2) {
                    return p(i4, objArr);
                } else {
                    int length = objArr.length;
                    if (i4 < (length >> 1) + (length >> 2)) {
                        objArr = Arrays.copyOf(objArr, i4);
                    }
                    return new f89(i3, i2, i4, objArr, objArr2);
                }
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new vka(obj4);
        }
        return f89.s;
    }

    public static yo5 q(Collection collection) {
        if ((collection instanceof yo5) && !(collection instanceof SortedSet)) {
            yo5 yo5Var = (yo5) collection;
            if (!yo5Var.m()) {
                return yo5Var;
            }
        }
        Object[] array = collection.toArray();
        return p(array.length, array);
    }

    public static yo5 s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        boolean z;
        if (objArr.length <= 2147483641) {
            z = true;
        } else {
            z = false;
        }
        jte.e("the total number of elements must fit in an int", z);
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
        if ((obj instanceof yo5) && (this instanceof f89) && (((yo5) obj) instanceof f89) && ((f89) this).e != obj.hashCode()) {
            return false;
        }
        return bwe.a(this, obj);
    }

    @Override
    public mo5 h() {
        mo5 mo5Var = this.b;
        if (mo5Var == null) {
            mo5 r = r();
            this.b = r;
            return r;
        }
        return mo5Var;
    }

    @Override
    public int hashCode() {
        return bwe.c(this);
    }

    public mo5 r() {
        Object[] array = toArray(go5.a);
        ko5 ko5Var = mo5.b;
        return mo5.o(array.length, array);
    }
}
