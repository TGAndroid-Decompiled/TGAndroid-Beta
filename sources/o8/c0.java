package o8;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
public abstract class c0 extends u implements Set {
    public static final int f19033c = 0;
    public transient z f19034b;

    public static int s(int i9) {
        int max = Math.max(i9, 2);
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

    public static c0 t(int i9, Object... objArr) {
        if (i9 != 0) {
            if (i9 != 1) {
                int s10 = s(i9);
                Object[] objArr2 = new Object[s10];
                int i10 = s10 - 1;
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < i9; i13++) {
                    Object obj = objArr[i13];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int o6 = l.o(hashCode);
                        while (true) {
                            int i14 = o6 & i10;
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
                                o6++;
                            }
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder(20);
                        sb2.append("at index ");
                        sb2.append(i13);
                        throw new NullPointerException(sb2.toString());
                    }
                }
                Arrays.fill(objArr, i12, i9, (Object) null);
                if (i12 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new w0(obj3);
                } else if (s(i12) < s10 / 2) {
                    return t(i12, objArr);
                } else {
                    int length = objArr.length;
                    if (i12 < (length >> 1) + (length >> 2)) {
                        objArr = Arrays.copyOf(objArr, i12);
                    }
                    return new r0(i11, i10, i12, objArr, objArr2);
                }
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new w0(obj4);
        }
        return r0.f19082s;
    }

    public static c0 u(Collection collection) {
        if ((collection instanceof c0) && !(collection instanceof SortedSet)) {
            c0 c0Var = (c0) collection;
            if (!c0Var.r()) {
                return c0Var;
            }
        }
        Object[] array = collection.toArray();
        return t(array.length, array);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof c0) && (this instanceof r0) && (((c0) obj) instanceof r0) && hashCode() != obj.hashCode()) {
            return false;
        }
        return l.d(this, obj);
    }

    @Override
    public int hashCode() {
        return l.h(this);
    }

    @Override
    public z i() {
        z zVar = this.f19034b;
        if (zVar == null) {
            z v = v();
            this.f19034b = v;
            return v;
        }
        return zVar;
    }

    public z v() {
        Object[] array = toArray(u.f19092a);
        x xVar = z.f19105b;
        return z.s(array.length, array);
    }

    @Override
    public abstract x0 iterator();
}
