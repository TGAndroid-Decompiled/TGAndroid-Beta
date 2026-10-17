package n7;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
public final class a0 extends t {
    public static final a0 h;
    public final transient n f17251f;

    static {
        j jVar = n.f17290b;
        h = new a0(y.e, w.f17316b);
    }

    public a0(n nVar, Comparator comparator) {
        super(comparator);
        this.f17251f = nVar;
    }

    @Override
    public final Object ceiling(Object obj) {
        int y3 = y(obj, true);
        n nVar = this.f17251f;
        if (y3 == nVar.size()) {
            return null;
        }
        return nVar.get(y3);
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f17251f, obj, this.d) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override
    public final boolean containsAll(Collection collection) {
        if (collection instanceof v) {
            collection = ((v) collection).zza();
        }
        Comparator comparator = this.d;
        if (a.i(comparator, collection) && collection.size() > 1) {
            j listIterator = this.f17251f.listIterator(0);
            Iterator it = collection.iterator();
            if (listIterator.hasNext()) {
                Object next = it.next();
                Object next2 = listIterator.next();
                while (true) {
                    try {
                        int compare = comparator.compare(next2, next);
                        if (compare < 0) {
                            if (!listIterator.hasNext()) {
                                break;
                            }
                            next2 = listIterator.next();
                        } else if (compare != 0) {
                            break;
                        } else if (!it.hasNext()) {
                            return true;
                        } else {
                            next = it.next();
                        }
                    } catch (ClassCastException | NullPointerException unused) {
                    }
                }
            }
            return false;
        }
        return super.containsAll(collection);
    }

    @Override
    public final Iterator descendingIterator() {
        return this.f17251f.q().listIterator(0);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                n nVar = this.f17251f;
                if (nVar.size() == set.size()) {
                    if (!isEmpty()) {
                        Comparator comparator = this.d;
                        if (a.i(comparator, set)) {
                            Iterator it = set.iterator();
                            try {
                                j listIterator = nVar.listIterator(0);
                                while (listIterator.hasNext()) {
                                    Object next = listIterator.next();
                                    Object next2 = it.next();
                                    if (next2 != null) {
                                        if (comparator.compare(next, next2) != 0) {
                                        }
                                    }
                                }
                                return true;
                            } catch (ClassCastException | NoSuchElementException unused) {
                            }
                        } else {
                            return containsAll(set);
                        }
                    } else {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object first() {
        if (!isEmpty()) {
            return this.f17251f.get(0);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final Object floor(Object obj) {
        int x10 = x(obj, true) - 1;
        if (x10 == -1) {
            return null;
        }
        return this.f17251f.get(x10);
    }

    @Override
    public final int h(Object[] objArr) {
        return this.f17251f.h(objArr);
    }

    @Override
    public final Object higher(Object obj) {
        int y3 = y(obj, false);
        n nVar = this.f17251f;
        if (y3 == nVar.size()) {
            return null;
        }
        return nVar.get(y3);
    }

    @Override
    public final Iterator iterator() {
        return this.f17251f.listIterator(0);
    }

    @Override
    public final Object last() {
        if (!isEmpty()) {
            n nVar = this.f17251f;
            return nVar.get(nVar.size() - 1);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final Object lower(Object obj) {
        int x10 = x(obj, false) - 1;
        if (x10 == -1) {
            return null;
        }
        return this.f17251f.get(x10);
    }

    @Override
    public final int m() {
        return this.f17251f.m();
    }

    @Override
    public final int n() {
        return this.f17251f.n();
    }

    @Override
    public final e0 o() {
        return this.f17251f.listIterator(0);
    }

    @Override
    public final Object[] p() {
        return this.f17251f.p();
    }

    @Override
    public final n s() {
        return this.f17251f;
    }

    @Override
    public final int size() {
        return this.f17251f.size();
    }

    public final int x(Object obj, boolean z10) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f17251f, obj, this.d);
        if (binarySearch >= 0) {
            if (z10) {
                return binarySearch + 1;
            }
            return binarySearch;
        }
        return ~binarySearch;
    }

    public final int y(Object obj, boolean z10) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f17251f, obj, this.d);
        if (binarySearch >= 0) {
            if (z10) {
                return binarySearch;
            }
            return binarySearch + 1;
        }
        return ~binarySearch;
    }

    public final a0 z(int i10, int i11) {
        n nVar = this.f17251f;
        if (i10 == 0) {
            if (i11 != nVar.size()) {
                i10 = 0;
            } else {
                return this;
            }
        }
        Comparator comparator = this.d;
        if (i10 < i11) {
            return new a0(nVar.subList(i10, i11), comparator);
        }
        return t.w(comparator);
    }
}
