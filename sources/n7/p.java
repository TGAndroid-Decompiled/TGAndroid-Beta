package n7;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Set;
public abstract class p extends i implements Set, j$.util.Set {
    public static final int f17299c = 0;
    public transient n f17300b;

    public static p q(int i10, Object... objArr) {
        if (i10 != 0) {
            if (i10 != 1) {
                int r10 = r(i10);
                Object[] objArr2 = new Object[r10];
                int i11 = r10 - 1;
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < i10; i14++) {
                    Object obj = objArr[i14];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int rotateLeft = (int) (Integer.rotateLeft((int) (hashCode * (-862048943)), 15) * 461845907);
                        while (true) {
                            int i15 = rotateLeft & i11;
                            Object obj2 = objArr2[i15];
                            if (obj2 == null) {
                                objArr[i13] = obj;
                                objArr2[i15] = obj;
                                i12 += hashCode;
                                i13++;
                                break;
                            } else if (!obj2.equals(obj)) {
                                rotateLeft++;
                            }
                        }
                    } else {
                        throw new NullPointerException(i0.a.j(i14, "at index "));
                    }
                }
                Arrays.fill(objArr, i13, i10, (Object) null);
                if (i13 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new c0(obj3);
                }
                if (r(i13) < r10 / 2) {
                    return q(i13, objArr);
                }
                if (i13 <= 0) {
                    objArr = Arrays.copyOf(objArr, i13);
                }
                return new z(i12, i11, i13, objArr, objArr2);
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new c0(obj4);
        }
        return z.f17323s;
    }

    public static int r(int i10) {
        int max = Math.max(i10, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        } else if (max < 1073741824) {
            return 1073741824;
        } else {
            throw new IllegalArgumentException("collection too large");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof p) || !(this instanceof z) || !(((p) obj) instanceof z) || ((z) this).e == obj.hashCode()) {
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
        return a.b(this);
    }

    public n s() {
        n nVar = this.f17300b;
        if (nVar == null) {
            n t10 = t();
            this.f17300b = t10;
            return t10;
        }
        return nVar;
    }

    public n t() {
        Object[] array = toArray(i.f17271a);
        j jVar = n.f17290b;
        return n.s(array.length, array);
    }
}
