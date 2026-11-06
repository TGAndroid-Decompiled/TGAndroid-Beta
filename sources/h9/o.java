package h9;

import a8.ia;
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
public abstract class o {
    public final int f14355a = 2;

    public static int d(int i7) {
        if (i7 < 3) {
            g(i7, "expectedSize");
            return i7 + 1;
        } else if (i7 < 1073741824) {
            return (int) Math.ceil(i7 / 0.75d);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public static void e(int i7, Object[] objArr) {
        for (int i10 = 0; i10 < i7; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(jg.g.j(i10, "at index "));
            }
        }
    }

    public static void f(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
        throw new NullPointerException("null key in entry: null=" + obj2);
    }

    public static void g(int i7, String str) {
        if (i7 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i7);
    }

    public static Object h(int i7) {
        if (i7 >= 2 && i7 <= 1073741824 && Integer.highestOneBit(i7) == i7) {
            if (i7 <= 256) {
                return new byte[i7];
            }
            if (i7 <= 65536) {
                return new short[i7];
            }
            return new int[i7];
        }
        throw new IllegalArgumentException(jg.g.j(i7, "must be power of 2 between 2^1 and 2^30: "));
    }

    public static boolean j(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static boolean k(Set set, Object obj) {
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

    public static d2 l(Set set, g9.m mVar) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof d2) {
                d2 d2Var = (d2) sortedSet;
                g9.m mVar2 = d2Var.f14315b;
                mVar2.getClass();
                return new d2((SortedSet) d2Var.f14314a, new g9.n(Arrays.asList(mVar2, mVar)));
            }
            return new d2(sortedSet, mVar);
        } else if (set instanceof d2) {
            d2 d2Var2 = (d2) set;
            g9.m mVar3 = d2Var2.f14315b;
            mVar3.getClass();
            return new d2(d2Var2.f14314a, new g9.n(Arrays.asList(mVar3, mVar)));
        } else {
            set.getClass();
            return new d2(set, mVar);
        }
    }

    public static Object m(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return str;
    }

    public static Object n(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return rf.b.g(1, list);
            }
            throw new NoSuchElementException();
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int o(Set set) {
        int i7;
        int i10 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i7 = obj.hashCode();
            } else {
                i7 = 0;
            }
            i10 = ~(~(i10 + i7));
        }
        return i10;
    }

    public static c2 p(Set set, t0 t0Var) {
        ia.k(set, "set1");
        ia.k(t0Var, "set2");
        return new c2(set, t0Var);
    }

    public static int q(int i7, int i10, int i11) {
        return (i7 & (~i11)) | (i10 & i11);
    }

    public static ArrayList r(Object... objArr) {
        int length = objArr.length;
        g(length, "arraySize");
        ArrayList arrayList = new ArrayList(c8.e1.e(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static int s(java.lang.Object r9, java.lang.Object r10, int r11, java.lang.Object r12, int[] r13, java.lang.Object[] r14, java.lang.Object[] r15) {
        throw new UnsupportedOperationException("Method not decompiled: h9.o.s(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    public static void t(List list, g9.m mVar, int i7, int i10) {
        for (int size = list.size() - 1; size > i10; size--) {
            if (mVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i11 = i10 - 1; i11 >= i7; i11--) {
            list.remove(i11);
        }
    }

    public static int u(int i7) {
        return (int) (Integer.rotateLeft((int) (i7 * (-862048943)), 15) * 461845907);
    }

    public static int v(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return u(hashCode);
    }

    public static int w(int i7, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i7] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i7] & 65535;
        }
        return ((int[]) obj)[i7];
    }

    public static void x(int i7, int i10, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i7] = (byte) i10;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i7] = (short) i10;
        } else {
            ((int[]) obj)[i7] = i10;
        }
    }

    public static AbstractList y(List list, g9.k kVar) {
        if (list instanceof RandomAccess) {
            return new c1(list, kVar);
        }
        return new d1(list, kVar);
    }

    public abstract Object i();

    public String toString() {
        switch (this.f14355a) {
            case 2:
                return i().toString();
            default:
                return super.toString();
        }
    }
}
