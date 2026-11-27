package defpackage;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Set;
public abstract class dnd extends b4d implements Set, j$.util.Set {
    public static final int r = 0;
    public transient omd n;

    public static dnd y(int i, Object... objArr) {
        if (i != 0) {
            if (i != 1) {
                int z = z(i);
                Object[] objArr2 = new Object[z];
                int i2 = z - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object obj = objArr[i5];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int rotateLeft = (int) (Integer.rotateLeft((int) (hashCode * (-862048943)), 15) * 461845907);
                        while (true) {
                            int i6 = rotateLeft & i2;
                            Object obj2 = objArr2[i6];
                            if (obj2 == null) {
                                objArr[i4] = obj;
                                objArr2[i6] = obj;
                                i3 += hashCode;
                                i4++;
                                break;
                            } else if (!obj2.equals(obj)) {
                                rotateLeft++;
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
                    return new qrd(obj3);
                }
                if (z(i4) < z / 2) {
                    return y(i4, objArr);
                }
                if (i4 <= 0) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new jqd(i3, i2, i4, objArr, objArr2);
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new qrd(obj4);
        }
        return jqd.G;
    }

    public static int z(int i) {
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

    public omd A() {
        omd omdVar = this.n;
        if (omdVar == null) {
            omd B = B();
            this.n = B;
            return B;
        }
        return omdVar;
    }

    public omd B() {
        Object[] array = toArray(b4d.f);
        ukd ukdVar = omd.n;
        return omd.A(array.length, array);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof dnd) || !(this instanceof jqd) || !(((dnd) obj) instanceof jqd) || ((jqd) this).w == obj.hashCode()) {
                if (obj != this) {
                    if (obj instanceof Set) {
                        Set set = (Set) obj;
                        try {
                            if (size() == set.size()) {
                                if (containsAll(set)) {
                                    return true;
                                }
                                return false;
                            }
                            return false;
                        } catch (ClassCastException | NullPointerException unused) {
                            return false;
                        }
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return t5f.a(this);
    }
}
