package o8;

import g7.r6;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
public abstract class l {
    public static void a(int i9, String str) {
        if (i9 >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 40);
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(i9);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static Object b(int i9) {
        if (i9 >= 2 && i9 <= 1073741824 && Integer.highestOneBit(i9) == i9) {
            if (i9 <= 256) {
                return new byte[i9];
            }
            if (i9 <= 65536) {
                return new short[i9];
            }
            return new int[i9];
        }
        StringBuilder sb2 = new StringBuilder(52);
        sb2.append("must be power of 2 between 2^1 and 2^30: ");
        sb2.append(i9);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static boolean c(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static boolean d(Set set, Object obj) {
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

    public static u0 e(Set set, n8.f fVar) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof u0) {
                u0 u0Var = (u0) sortedSet;
                n8.f fVar2 = u0Var.f19094b;
                fVar2.getClass();
                return new u0((SortedSet) u0Var.f19093a, new n8.g(Arrays.asList(fVar2, fVar)));
            }
            return new u0(sortedSet, fVar);
        } else if (set instanceof u0) {
            u0 u0Var2 = (u0) set;
            n8.f fVar3 = u0Var2.f19094b;
            fVar3.getClass();
            return new u0(u0Var2.f19093a, new n8.g(Arrays.asList(fVar3, fVar)));
        } else {
            set.getClass();
            return new u0(set, fVar);
        }
    }

    public static Object f(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return str;
    }

    public static Object g(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return j3.r0.k(1, list);
            }
            throw new NoSuchElementException();
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int h(Set set) {
        int i9;
        int i10 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i9 = obj.hashCode();
            } else {
                i9 = 0;
            }
            i10 = ~(~(i10 + i9));
        }
        return i10;
    }

    public static t0 i(Set set, c0 c0Var) {
        if (set != null) {
            if (c0Var != null) {
                return new t0(set, c0Var);
            }
            throw new NullPointerException("set2");
        }
        throw new NullPointerException("set1");
    }

    public static int j(int i9, int i10, int i11) {
        return (i9 & (~i11)) | (i10 & i11);
    }

    public static ArrayList k(Object... objArr) {
        int length = objArr.length;
        a(length, "arraySize");
        ArrayList arrayList = new ArrayList(r6.d(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static HashSet l(int i9) {
        int i10;
        if (i9 < 3) {
            a(i9, "expectedSize");
            i10 = i9 + 1;
        } else if (i9 < 1073741824) {
            i10 = (int) ((i9 / 0.75f) + 1.0f);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        return new HashSet(i10);
    }

    public static int m(java.lang.Object r9, java.lang.Object r10, int r11, java.lang.Object r12, int[] r13, java.lang.Object[] r14, java.lang.Object[] r15) {
        throw new UnsupportedOperationException("Method not decompiled: o8.l.m(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    public static void n(List list, n8.f fVar, int i9, int i10) {
        for (int size = list.size() - 1; size > i10; size--) {
            if (fVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i11 = i10 - 1; i11 >= i9; i11--) {
            list.remove(i11);
        }
    }

    public static int o(int i9) {
        return (int) (Integer.rotateLeft((int) (i9 * (-862048943)), 15) * 461845907);
    }

    public static int p(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return o(hashCode);
    }

    public static int q(int i9, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i9] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i9] & 65535;
        }
        return ((int[]) obj)[i9];
    }

    public static void r(int i9, int i10, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i9] = (byte) i10;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i9] = (short) i10;
        } else {
            ((int[]) obj)[i9] = i10;
        }
    }
}
