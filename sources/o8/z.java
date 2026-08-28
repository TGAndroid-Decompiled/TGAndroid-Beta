package o8;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
public abstract class z extends u implements List, RandomAccess {
    public static final x f19105b = new x(l0.f19056e, 0);

    public static l0 s(int i9, Object[] objArr) {
        if (i9 == 0) {
            return l0.f19056e;
        }
        return new l0(i9, objArr);
    }

    public static l0 t(Object... objArr) {
        int length = objArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            if (objArr[i9] == null) {
                StringBuilder sb2 = new StringBuilder(20);
                sb2.append("at index ");
                sb2.append(i9);
                throw new NullPointerException(sb2.toString());
            }
        }
        return s(objArr.length, objArr);
    }

    public static z u(Collection collection) {
        if (collection instanceof u) {
            z i9 = ((u) collection).i();
            if (i9.r()) {
                Object[] array = i9.toArray(u.f19092a);
                return s(array.length, array);
            }
            return i9;
        }
        return t(collection.toArray());
    }

    public static l0 v(Object[] objArr) {
        if (objArr.length == 0) {
            return l0.f19056e;
        }
        return t((Object[]) objArr.clone());
    }

    public static l0 x(Long l10, Long l11, Long l12, Long l13, Long l14) {
        return t(l10, l11, l12, l13, l14);
    }

    public static l0 y(Object obj) {
        return t(obj);
    }

    @Override
    public final void add(int i9, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(int i9, Collection collection) {
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
                        for (int i9 = 0; i9 < size; i9++) {
                            if (g7.c0.a(get(i9), list.get(i9))) {
                            }
                        }
                    } else {
                        Iterator it = list.iterator();
                        for (Object obj2 : this) {
                            if (it.hasNext()) {
                                if (!g7.c0.a(obj2, it.next())) {
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
        int i9 = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i9 = ~(~(get(i10).hashCode() + (i9 * 31)));
        }
        return i9;
    }

    @Override
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            if (obj.equals(get(i9))) {
                return i9;
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
    public int n(int i9, Object[] objArr) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i9 + i10] = get(i10);
        }
        return i9 + size;
    }

    @Override
    public final Object remove(int i9) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object set(int i9, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final x listIterator(int i9) {
        g7.d0.c(i9, size());
        if (isEmpty()) {
            return f19105b;
        }
        return new x(this, i9);
    }

    @Override
    public z subList(int i9, int i10) {
        g7.d0.d(i9, i10, size());
        int i11 = i10 - i9;
        if (i11 == size()) {
            return this;
        }
        if (i11 == 0) {
            return l0.f19056e;
        }
        return new y(this, i9, i11);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override
    public final z i() {
        return this;
    }
}
