package g9;

import b8.od;
import b8.zb;
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
    public final int f12110a = 2;

    public static int d(int i3) {
        if (i3 < 3) {
            g(i3, "expectedSize");
            return i3 + 1;
        } else if (i3 < 1073741824) {
            return (int) Math.ceil(i3 / 0.75d);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public static void e(int i3, Object[] objArr) {
        for (int i10 = 0; i10 < i3; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(k2.p1.i(i10, "at index "));
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

    public static void g(int i3, String str) {
        if (i3 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i3);
    }

    public static Object h(int i3) {
        if (i3 >= 2 && i3 <= 1073741824 && Integer.highestOneBit(i3) == i3) {
            if (i3 <= 256) {
                return new byte[i3];
            }
            if (i3 <= 65536) {
                return new short[i3];
            }
            return new int[i3];
        }
        throw new IllegalArgumentException(k2.p1.i(i3, "must be power of 2 between 2^1 and 2^30: "));
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

    public static c2 l(Set set, f9.l lVar) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof c2) {
                c2 c2Var = (c2) sortedSet;
                f9.l lVar2 = c2Var.f12064b;
                lVar2.getClass();
                return new c2((SortedSet) c2Var.f12063a, new f9.m(Arrays.asList(lVar2, lVar)));
            }
            return new c2(sortedSet, lVar);
        } else if (set instanceof c2) {
            c2 c2Var2 = (c2) set;
            f9.l lVar3 = c2Var2.f12064b;
            lVar3.getClass();
            return new c2(c2Var2.f12063a, new f9.m(Arrays.asList(lVar3, lVar)));
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
                return t4.c.d(1, list);
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
        int i3;
        int i10 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i3 = obj.hashCode();
            } else {
                i3 = 0;
            }
            i10 = ~(~(i10 + i3));
        }
        return i10;
    }

    public static b2 p(Set set, t0 t0Var) {
        zb.k(set, "set1");
        zb.k(t0Var, "set2");
        return new b2(set, t0Var);
    }

    public static int q(int i3, int i10, int i11) {
        return (i3 & (~i11)) | (i10 & i11);
    }

    public static ArrayList r(Object... objArr) {
        int length = objArr.length;
        g(length, "arraySize");
        ArrayList arrayList = new ArrayList(od.e(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static int s(java.lang.Object r9, java.lang.Object r10, int r11, java.lang.Object r12, int[] r13, java.lang.Object[] r14, java.lang.Object[] r15) {
        throw new UnsupportedOperationException("Method not decompiled: g9.o.s(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    public static void t(List list, f9.l lVar, int i3, int i10) {
        for (int size = list.size() - 1; size > i10; size--) {
            if (lVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i11 = i10 - 1; i11 >= i3; i11--) {
            list.remove(i11);
        }
    }

    public static int u(int i3) {
        return (int) (Integer.rotateLeft((int) (i3 * (-862048943)), 15) * 461845907);
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

    public static int w(int i3, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i3] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i3] & 65535;
        }
        return ((int[]) obj)[i3];
    }

    public static void x(int i3, int i10, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i3] = (byte) i10;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i3] = (short) i10;
        } else {
            ((int[]) obj)[i3] = i10;
        }
    }

    public static AbstractList y(List list, f9.k kVar) {
        if (list instanceof RandomAccess) {
            return new c1(list, kVar);
        }
        return new d1(list, kVar);
    }

    public abstract Object i();

    public String toString() {
        switch (this.f12110a) {
            case 2:
                return i().toString();
            default:
                return super.toString();
        }
    }
}
