package f9;

import a8.xb;
import a8.yb;
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
    public static final g0 f10287b = new g0(s1.e, 0);

    public static s1 A(Comparator comparator, List list) {
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
        o.d(array.length, array);
        Arrays.sort(array, comparator);
        return s(array.length, array);
    }

    public static s1 s(int i10, Object[] objArr) {
        if (i10 == 0) {
            return s1.e;
        }
        return new s1(i10, objArr);
    }

    public static f0 t() {
        return new b0(4);
    }

    public static i0 u(Collection collection) {
        if (collection instanceof d0) {
            i0 h = ((d0) collection).h();
            if (h.q()) {
                Object[] array = h.toArray(d0.f10273a);
                return s(array.length, array);
            }
            return h;
        }
        Object[] array2 = collection.toArray();
        o.d(array2.length, array2);
        return s(array2.length, array2);
    }

    public static s1 v(Object[] objArr) {
        if (objArr.length == 0) {
            return s1.e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        o.d(objArr2.length, objArr2);
        return s(objArr2.length, objArr2);
    }

    public static s1 x(Long l4, Long l10, Long l11, Long l12, Long l13) {
        Object[] objArr = {l4, l10, l11, l12, l13};
        o.d(5, objArr);
        return s(5, objArr);
    }

    public static s1 y(Object obj) {
        Object[] objArr = {obj};
        o.d(1, objArr);
        return s(1, objArr);
    }

    public static s1 z(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        o.d(2, objArr);
        return s(2, objArr);
    }

    @Override
    public i0 subList(int i10, int i11) {
        yb.n(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return s1.e;
        }
        return new h0(this, i10, i12);
    }

    @Override
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(int i10, Collection collection) {
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
                        for (int i10 = 0; i10 < size; i10++) {
                            if (xb.a(get(i10), list.get(i10))) {
                            }
                        }
                    } else {
                        Iterator it = list.iterator();
                        for (Object obj2 : this) {
                            if (it.hasNext()) {
                                if (!xb.a(obj2, it.next())) {
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
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~(get(i11).hashCode() + (i10 * 31)));
        }
        return i10;
    }

    @Override
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
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
    public int m(int i10, Object[] objArr) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override
    public final g2 r() {
        return listIterator(0);
    }

    @Override
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override
    public final g0 listIterator(int i10) {
        yb.m(i10, size());
        if (isEmpty()) {
            return f10287b;
        }
        return new g0(this, i10);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override
    public final i0 h() {
        return this;
    }
}
