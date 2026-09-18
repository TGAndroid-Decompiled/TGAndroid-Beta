package n7;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
public final class a0 extends t {
    public static final a0 h;
    public final transient n f15116f;

    static {
        j jVar = n.f15158b;
        h = new a0(y.e, w.f15184b);
    }

    public a0(n nVar, Comparator comparator) {
        super(comparator);
        this.f15116f = nVar;
    }

    public final a0 A(int i10, int i11) {
        n nVar = this.f15116f;
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
        return t.x(comparator);
    }

    @Override
    public final Object ceiling(Object obj) {
        int z10 = z(obj, true);
        n nVar = this.f15116f;
        if (z10 == nVar.size()) {
            return null;
        }
        return nVar.get(z10);
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f15116f, obj, this.d) >= 0) {
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
            j listIterator = this.f15116f.listIterator(0);
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
        return this.f15116f.r().listIterator(0);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                n nVar = this.f15116f;
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
            return this.f15116f.get(0);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final Object floor(Object obj) {
        int y3 = y(obj, true) - 1;
        if (y3 == -1) {
            return null;
        }
        return this.f15116f.get(y3);
    }

    @Override
    public final Object higher(Object obj) {
        int z10 = z(obj, false);
        n nVar = this.f15116f;
        if (z10 == nVar.size()) {
            return null;
        }
        return nVar.get(z10);
    }

    @Override
    public final int i(Object[] objArr) {
        return this.f15116f.i(objArr);
    }

    @Override
    public final Iterator iterator() {
        return this.f15116f.listIterator(0);
    }

    @Override
    public final Object last() {
        if (!isEmpty()) {
            n nVar = this.f15116f;
            return nVar.get(nVar.size() - 1);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final Object lower(Object obj) {
        int y3 = y(obj, false) - 1;
        if (y3 == -1) {
            return null;
        }
        return this.f15116f.get(y3);
    }

    @Override
    public final int n() {
        return this.f15116f.n();
    }

    @Override
    public final int o() {
        return this.f15116f.o();
    }

    @Override
    public final e0 p() {
        return this.f15116f.listIterator(0);
    }

    @Override
    public final Object[] q() {
        return this.f15116f.q();
    }

    @Override
    public final int size() {
        return this.f15116f.size();
    }

    @Override
    public final n t() {
        return this.f15116f;
    }

    public final int y(Object obj, boolean z10) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f15116f, obj, this.d);
        if (binarySearch >= 0) {
            if (z10) {
                return binarySearch + 1;
            }
            return binarySearch;
        }
        return ~binarySearch;
    }

    public final int z(Object obj, boolean z10) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f15116f, obj, this.d);
        if (binarySearch >= 0) {
            if (z10) {
                return binarySearch;
            }
            return binarySearch + 1;
        }
        return ~binarySearch;
    }
}
