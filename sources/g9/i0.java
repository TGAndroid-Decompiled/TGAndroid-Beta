package g9;

import b8.yb;
import b8.zb;
import j$.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;
public abstract class i0 extends d0 implements List, RandomAccess, j$.util.List {
    public static final g0 f12083b = new g0(s1.f12146e, 0);

    public static s1 o(int i3, Object[] objArr) {
        if (i3 == 0) {
            return s1.f12146e;
        }
        return new s1(i3, objArr);
    }

    public static f0 p() {
        return new b0(4);
    }

    public static i0 q(Collection collection) {
        if (collection instanceof d0) {
            i0 h = ((d0) collection).h();
            if (h.m()) {
                Object[] array = h.toArray(d0.f12067a);
                return o(array.length, array);
            }
            return h;
        }
        Object[] array2 = collection.toArray();
        o.e(array2.length, array2);
        return o(array2.length, array2);
    }

    public static s1 r(Object[] objArr) {
        if (objArr.length == 0) {
            return s1.f12146e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        o.e(objArr2.length, objArr2);
        return o(objArr2.length, objArr2);
    }

    public static s1 t(Long l10, Long l11, Long l12, Long l13, Long l14) {
        Object[] objArr = {l10, l11, l12, l13, l14};
        o.e(5, objArr);
        return o(5, objArr);
    }

    public static s1 u(Object obj) {
        Object[] objArr = {obj};
        o.e(1, objArr);
        return o(1, objArr);
    }

    public static s1 v(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        o.e(2, objArr);
        return o(2, objArr);
    }

    public static s1 w(Comparator comparator, List list) {
        List list2;
        comparator.getClass();
        if (list instanceof Collection) {
            list2 = list;
        } else {
            Iterator it = list.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            list2 = arrayList;
        }
        Object[] array = list2.toArray();
        o.e(array.length, array);
        Arrays.sort(array, comparator);
        return o(array.length, array);
    }

    @Override
    public final void add(int i3, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(int i3, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (list instanceof RandomAccess) {
                        for (int i3 = 0; i3 < size; i3++) {
                            if (yb.a(get(i3), list.get(i3))) {
                            }
                        }
                    } else {
                        Iterator it = list.iterator();
                        for (Object obj2 : this) {
                            if (it.hasNext()) {
                                if (!yb.a(obj2, it.next())) {
                                }
                            }
                        }
                        return !it.hasNext();
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        int size = size();
        int i3 = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i3 = ~(~(get(i10).hashCode() + (i3 * 31)));
        }
        return i3;
    }

    @Override
    public int i(int i3, Object[] objArr) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i3 + i10] = get(i10);
        }
        return i3 + size;
    }

    @Override
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (obj.equals(get(i3))) {
                return i3;
            }
        }
        return -1;
    }

    @Override
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override
    public final g2 n() {
        return listIterator(0);
    }

    @Override
    public final Object remove(int i3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override
    public final g0 listIterator(int i3) {
        zb.m(i3, size());
        if (isEmpty()) {
            return f12083b;
        }
        return new g0(this, i3);
    }

    @Override
    public final Object set(int i3, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override
    public i0 subList(int i3, int i10) {
        zb.n(i3, i10, size());
        int i11 = i10 - i3;
        if (i11 == size()) {
            return this;
        }
        if (i11 == 0) {
            return s1.f12146e;
        }
        return new h0(this, i3, i11);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override
    public final i0 h() {
        return this;
    }
}
