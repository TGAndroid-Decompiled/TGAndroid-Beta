package defpackage;

import j$.util.List;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;
public abstract class omd extends b4d implements List, RandomAccess, j$.util.List {
    public static final ukd n = new ukd(fqd.w, 0);

    public static fqd A(int i, Object[] objArr) {
        if (i == 0) {
            return fqd.w;
        }
        return new fqd(i, objArr);
    }

    public static fqd B(Object[] objArr) {
        if (objArr.length == 0) {
            return fqd.w;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        for (int i = 0; i < length; i++) {
            if (objArr2[i] == null) {
                p3d.h(uh9.k(i, "at index "));
                return null;
            }
        }
        return A(length, objArr2);
    }

    @Override
    public final ukd listIterator(int i) {
        int size = size();
        if (i >= 0 && i <= size) {
            if (isEmpty()) {
                return n;
            }
            return new ukd(this, i);
        }
        su3.g(c5f.c(i, size, "index"));
        return null;
    }

    @Override
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(Object obj) {
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
                        for (int i = 0; i < size; i++) {
                            if (y4f.a(get(i), list.get(i))) {
                            }
                        }
                        return true;
                    }
                    ukd listIterator = listIterator(0);
                    Iterator it = list.iterator();
                    while (true) {
                        if (listIterator.hasNext()) {
                            if (it.hasNext()) {
                                if (!y4f.a(listIterator.next(), it.next())) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else if (!it.hasNext()) {
                            return true;
                        }
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
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public final Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
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
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override
    public int p(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
        return size;
    }

    @Override
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override
    public final v9c u() {
        return listIterator(0);
    }

    public omd y() {
        if (size() <= 1) {
            return this;
        }
        return new bmd(this);
    }

    @Override
    public omd subList(int i, int i2) {
        c5f.b(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return fqd.w;
        }
        return new hmd(this, i, i3);
    }
}
