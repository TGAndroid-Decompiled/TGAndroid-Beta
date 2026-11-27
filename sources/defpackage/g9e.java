package defpackage;

import java.util.Arrays;
import java.util.Set;
public abstract class g9e extends b4d implements Set, j$.util.Set {
    public static final int r = 0;
    public transient k8e n;

    public static int y(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit <<= 1;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        } else if (max < 1073741824) {
            return 1073741824;
        } else {
            lq5.j("collection too large");
            return 0;
        }
    }

    public static g9e z(int i, Object... objArr) {
        if (i != 0) {
            if (i != 1) {
                int y = y(i);
                Object[] objArr2 = new Object[y];
                int i2 = y - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object obj = objArr[i5];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int a = o6f.a(hashCode);
                        while (true) {
                            int i6 = a & i2;
                            Object obj2 = objArr2[i6];
                            if (obj2 == null) {
                                objArr[i4] = obj;
                                objArr2[i6] = obj;
                                i3 += hashCode;
                                i4++;
                                break;
                            } else if (!obj2.equals(obj)) {
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
                    obj3.getClass();
                    return new ice(obj3);
                }
                if (y(i4) < y / 2) {
                    return z(i4, objArr);
                }
                int length = objArr.length;
                if (i4 < (length >> 1) + (length >> 2)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new wbe(i3, i2, i4, objArr, objArr2);
            }
            Object obj4 = objArr[0];
            obj4.getClass();
            return new ice(obj4);
        }
        return wbe.G;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof g9e) && (this instanceof wbe) && (((g9e) obj) instanceof wbe) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int i;
        int i2 = 0;
        for (Object obj : this) {
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }
}
