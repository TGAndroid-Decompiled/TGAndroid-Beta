package f9;

import a8.ed;
import a8.yb;
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
import org.telegram.ui.Components.b10;
public abstract class o {
    public final int f10310a = 2;

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
                throw new NullPointerException(ic.a.i(i11, "at index "));
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
        throw new IllegalArgumentException(ic.a.i(i10, "must be power of 2 between 2^1 and 2^30: "));
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

    public static c2 k(Set set, e9.l lVar) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof c2) {
                c2 c2Var = (c2) sortedSet;
                e9.l lVar2 = c2Var.f10270b;
                lVar2.getClass();
                return new c2((SortedSet) c2Var.f10269a, new e9.m(Arrays.asList(lVar2, lVar)));
            }
            return new c2(sortedSet, lVar);
        } else if (set instanceof c2) {
            c2 c2Var2 = (c2) set;
            e9.l lVar3 = c2Var2.f10270b;
            lVar3.getClass();
            return new c2(c2Var2.f10269a, new e9.m(Arrays.asList(lVar3, lVar)));
        } else {
            set.getClass();
            return new c2(set, lVar);
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
                return b10.h(1, list);
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

    public static b2 o(Set set, t0 t0Var) {
        yb.l(set, "set1");
        yb.l(t0Var, "set2");
        return new b2(set, t0Var);
    }

    public static int p(int i10, int i11, int i12) {
        return (i10 & (~i12)) | (i11 & i12);
    }

    public static ArrayList q(Object... objArr) {
        int length = objArr.length;
        f(length, "arraySize");
        ArrayList arrayList = new ArrayList(ed.e(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static int r(java.lang.Object r9, java.lang.Object r10, int r11, java.lang.Object r12, int[] r13, java.lang.Object[] r14, java.lang.Object[] r15) {
        throw new UnsupportedOperationException("Method not decompiled: f9.o.r(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    public static void s(List list, e9.l lVar, int i10, int i11) {
        for (int size = list.size() - 1; size > i11; size--) {
            if (lVar.apply(list.get(size))) {
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

    public static AbstractList x(List list, e9.k kVar) {
        if (list instanceof RandomAccess) {
            return new c1(list, kVar);
        }
        return new d1(list, kVar);
    }

    public abstract Object h();

    public String toString() {
        switch (this.f10310a) {
            case 2:
                return h().toString();
            default:
                return super.toString();
        }
    }
}
