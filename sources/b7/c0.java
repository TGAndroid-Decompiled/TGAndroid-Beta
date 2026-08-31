package b7;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
public final class c0 extends v {
    public static final c0 h;
    public final transient o f1812f;

    static {
        k kVar = o.f1856b;
        h = new c0(a0.f1799e, y.f1886b);
    }

    public c0(o oVar, Comparator comparator) {
        super(comparator);
        this.f1812f = oVar;
    }

    public final c0 A(int i10, int i11) {
        o oVar = this.f1812f;
        if (i10 == 0) {
            if (i11 != oVar.size()) {
                i10 = 0;
            } else {
                return this;
            }
        }
        Comparator comparator = this.d;
        if (i10 < i11) {
            return new c0(oVar.subList(i10, i11), comparator);
        }
        return v.x(comparator);
    }

    @Override
    public final Object ceiling(Object obj) {
        int z4 = z(obj, true);
        o oVar = this.f1812f;
        if (z4 == oVar.size()) {
            return null;
        }
        return oVar.get(z4);
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f1812f, obj, this.d) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override
    public final boolean containsAll(Collection collection) {
        if (collection instanceof x) {
            collection = ((x) collection).zza();
        }
        Comparator comparator = this.d;
        if (b.i(comparator, collection) && collection.size() > 1) {
            k listIterator = this.f1812f.listIterator(0);
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
        return this.f1812f.r().listIterator(0);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                o oVar = this.f1812f;
                if (oVar.size() == set.size()) {
                    if (!isEmpty()) {
                        Comparator comparator = this.d;
                        if (b.i(comparator, set)) {
                            Iterator it = set.iterator();
                            try {
                                k listIterator = oVar.listIterator(0);
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
            return this.f1812f.get(0);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final Object floor(Object obj) {
        int y10 = y(obj, true) - 1;
        if (y10 == -1) {
            return null;
        }
        return this.f1812f.get(y10);
    }

    @Override
    public final Object higher(Object obj) {
        int z4 = z(obj, false);
        o oVar = this.f1812f;
        if (z4 == oVar.size()) {
            return null;
        }
        return oVar.get(z4);
    }

    @Override
    public final int i(Object[] objArr) {
        return this.f1812f.i(objArr);
    }

    @Override
    public final Iterator iterator() {
        return this.f1812f.listIterator(0);
    }

    @Override
    public final Object last() {
        if (!isEmpty()) {
            o oVar = this.f1812f;
            return oVar.get(oVar.size() - 1);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final Object lower(Object obj) {
        int y10 = y(obj, false) - 1;
        if (y10 == -1) {
            return null;
        }
        return this.f1812f.get(y10);
    }

    @Override
    public final int n() {
        return this.f1812f.n();
    }

    @Override
    public final int o() {
        return this.f1812f.o();
    }

    @Override
    public final g0 p() {
        return this.f1812f.listIterator(0);
    }

    @Override
    public final Object[] q() {
        return this.f1812f.q();
    }

    @Override
    public final int size() {
        return this.f1812f.size();
    }

    @Override
    public final o t() {
        return this.f1812f;
    }

    public final int y(Object obj, boolean z4) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f1812f, obj, this.d);
        if (binarySearch >= 0) {
            if (z4) {
                return binarySearch + 1;
            }
            return binarySearch;
        }
        return ~binarySearch;
    }

    public final int z(Object obj, boolean z4) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f1812f, obj, this.d);
        if (binarySearch >= 0) {
            if (z4) {
                return binarySearch;
            }
            return binarySearch + 1;
        }
        return ~binarySearch;
    }
}
