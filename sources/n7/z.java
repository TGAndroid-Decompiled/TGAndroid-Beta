package n7;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
public final class z extends s {
    public static final z h;
    public final transient m f16701f;

    static {
        i iVar = m.f16659b;
        h = new z(x.f16693e, v.f16688b);
    }

    public z(m mVar, Comparator comparator) {
        super(comparator);
        this.f16701f = mVar;
    }

    public final z A(int i10, int i11) {
        m mVar = this.f16701f;
        if (i10 == 0) {
            if (i11 != mVar.size()) {
                i10 = 0;
            } else {
                return this;
            }
        }
        Comparator comparator = this.d;
        if (i10 < i11) {
            return new z(mVar.subList(i10, i11), comparator);
        }
        return s.x(comparator);
    }

    @Override
    public final Object ceiling(Object obj) {
        int z10 = z(obj, true);
        m mVar = this.f16701f;
        if (z10 == mVar.size()) {
            return null;
        }
        return mVar.get(z10);
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f16701f, obj, this.d) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override
    public final boolean containsAll(Collection collection) {
        if (collection instanceof u) {
            collection = ((u) collection).zza();
        }
        Comparator comparator = this.d;
        if (a.i(comparator, collection) && collection.size() > 1) {
            i listIterator = this.f16701f.listIterator(0);
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
        return this.f16701f.r().listIterator(0);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                m mVar = this.f16701f;
                if (mVar.size() == set.size()) {
                    if (!isEmpty()) {
                        Comparator comparator = this.d;
                        if (a.i(comparator, set)) {
                            Iterator it = set.iterator();
                            try {
                                i listIterator = mVar.listIterator(0);
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
            return this.f16701f.get(0);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final Object floor(Object obj) {
        int y3 = y(obj, true) - 1;
        if (y3 == -1) {
            return null;
        }
        return this.f16701f.get(y3);
    }

    @Override
    public final Object higher(Object obj) {
        int z10 = z(obj, false);
        m mVar = this.f16701f;
        if (z10 == mVar.size()) {
            return null;
        }
        return mVar.get(z10);
    }

    @Override
    public final int i(Object[] objArr) {
        return this.f16701f.i(objArr);
    }

    @Override
    public final Iterator iterator() {
        return this.f16701f.listIterator(0);
    }

    @Override
    public final Object last() {
        if (!isEmpty()) {
            m mVar = this.f16701f;
            return mVar.get(mVar.size() - 1);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final Object lower(Object obj) {
        int y3 = y(obj, false) - 1;
        if (y3 == -1) {
            return null;
        }
        return this.f16701f.get(y3);
    }

    @Override
    public final int n() {
        return this.f16701f.n();
    }

    @Override
    public final int o() {
        return this.f16701f.o();
    }

    @Override
    public final d0 p() {
        return this.f16701f.listIterator(0);
    }

    @Override
    public final Object[] q() {
        return this.f16701f.q();
    }

    @Override
    public final int size() {
        return this.f16701f.size();
    }

    @Override
    public final m t() {
        return this.f16701f;
    }

    public final int y(Object obj, boolean z10) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f16701f, obj, this.d);
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
        int binarySearch = Collections.binarySearch(this.f16701f, obj, this.d);
        if (binarySearch >= 0) {
            if (z10) {
                return binarySearch;
            }
            return binarySearch + 1;
        }
        return ~binarySearch;
    }
}
