package h9;

import a8.ja;
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
    public final int f13713a = 2;

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
                throw new NullPointerException(i5.c.i(i10, "at index "));
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
        throw new IllegalArgumentException(i5.c.i(i7, "must be power of 2 between 2^1 and 2^30: "));
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

    public static c2 l(Set set, g9.l lVar) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof c2) {
                c2 c2Var = (c2) sortedSet;
                g9.l lVar2 = c2Var.f13667b;
                lVar2.getClass();
                return new c2((SortedSet) c2Var.f13666a, new g9.m(Arrays.asList(lVar2, lVar)));
            }
            return new c2(sortedSet, lVar);
        } else if (set instanceof c2) {
            c2 c2Var2 = (c2) set;
            g9.l lVar3 = c2Var2.f13667b;
            lVar3.getClass();
            return new c2(c2Var2.f13666a, new g9.m(Arrays.asList(lVar3, lVar)));
        } else {
            set.getClass();
            return new c2(set, lVar);
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
                return r.b.h(1, list);
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

    public static b2 p(Set set, t0 t0Var) {
        ja.k(set, "set1");
        ja.k(t0Var, "set2");
        return new b2(set, t0Var);
    }

    public static int q(int i7, int i10, int i11) {
        return (i7 & (~i11)) | (i10 & i11);
    }

    public static ArrayList r(Object... objArr) {
        int length = objArr.length;
        g(length, "arraySize");
        ArrayList arrayList = new ArrayList(c8.g1.e(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static int s(java.lang.Object r9, java.lang.Object r10, int r11, java.lang.Object r12, int[] r13, java.lang.Object[] r14, java.lang.Object[] r15) {
        throw new UnsupportedOperationException("Method not decompiled: h9.o.s(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    public static void t(List list, g9.l lVar, int i7, int i10) {
        for (int size = list.size() - 1; size > i10; size--) {
            if (lVar.apply(list.get(size))) {
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
        switch (this.f13713a) {
            case 2:
                return i().toString();
            default:
                return super.toString();
        }
    }
}
