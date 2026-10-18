package e9;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;
import v7.b8;
import v7.u6;
public abstract class s {
    public final int f8496a = 2;

    public static int c(int i10) {
        if (i10 < 3) {
            f(i10, "expectedSize");
            return i10 + 1;
        } else if (i10 < 1073741824) {
            return (int) Math.ceil(i10 / 0.75d);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public static void d(int i10, Object[] objArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(i2.d.j(i11, "at index "));
            }
        }
    }

    public static void e(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
        throw new NullPointerException("null key in entry: null=" + obj2);
    }

    public static void f(int i10, String str) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i10);
    }

    public static Object g(int i10) {
        if (i10 >= 2 && i10 <= 1073741824 && Integer.highestOneBit(i10) == i10) {
            if (i10 <= 256) {
                return new byte[i10];
            }
            if (i10 <= 65536) {
                return new short[i10];
            }
            return new int[i10];
        }
        throw new IllegalArgumentException(i2.d.j(i10, "must be power of 2 between 2^1 and 2^30: "));
    }

    public static boolean i(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static boolean j(Set set, Object obj) {
        if (set != obj) {
            if (obj instanceof Set) {
                Set set2 = (Set) obj;
                try {
                    if (set.size() == set2.size()) {
                        if (set.containsAll(set2)) {
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

    public static h2 k(Set set, d9.m mVar) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof h2) {
                h2 h2Var = (h2) sortedSet;
                d9.m mVar2 = h2Var.f8456b;
                mVar2.getClass();
                return new h2((SortedSet) h2Var.f8455a, new d9.n(Arrays.asList(mVar2, mVar)));
            }
            return new h2(sortedSet, mVar);
        } else if (set instanceof h2) {
            h2 h2Var2 = (h2) set;
            d9.m mVar3 = h2Var2.f8456b;
            mVar3.getClass();
            return new h2(h2Var2.f8455a, new d9.n(Arrays.asList(mVar3, mVar)));
        } else {
            set.getClass();
            return new h2(set, mVar);
        }
    }

    public static Object l(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return str;
    }

    public static Object m(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return r4.c.f(1, list);
            }
            throw new NoSuchElementException();
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int n(Set set) {
        int i10;
        int i11 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i10 = obj.hashCode();
            } else {
                i10 = 0;
            }
            i11 = ~(~(i11 + i10));
        }
        return i11;
    }

    public static g2 o(Set set, y0 y0Var) {
        u6.l(set, "set1");
        u6.l(y0Var, "set2");
        return new g2(set, y0Var);
    }

    public static int p(int i10, int i11, int i12) {
        return (i10 & (~i12)) | (i11 & i12);
    }

    public static ArrayList q(Object... objArr) {
        int length = objArr.length;
        f(length, "arraySize");
        ArrayList arrayList = new ArrayList(b8.e(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static int r(java.lang.Object r9, java.lang.Object r10, int r11, java.lang.Object r12, int[] r13, java.lang.Object[] r14, java.lang.Object[] r15) {
        throw new UnsupportedOperationException("Method not decompiled: e9.s.r(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    public static void s(List list, d9.m mVar, int i10, int i11) {
        for (int size = list.size() - 1; size > i11; size--) {
            if (mVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            list.remove(i12);
        }
    }

    public static int t(int i10) {
        return (int) (Integer.rotateLeft((int) (i10 * (-862048943)), 15) * 461845907);
    }

    public static int u(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return t(hashCode);
    }

    public static int v(int i10, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i10] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i10] & 65535;
        }
        return ((int[]) obj)[i10];
    }

    public static void w(int i10, int i11, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }

    public static AbstractList x(List list, d9.k kVar) {
        if (list instanceof RandomAccess) {
            return new h1(list, kVar);
        }
        return new i1(list, kVar);
    }

    public abstract Object h();

    public String toString() {
        switch (this.f8496a) {
            case 2:
                return h().toString();
            default:
                return super.toString();
        }
    }
}
