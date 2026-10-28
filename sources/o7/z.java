package o7;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
public final class z extends s {
    public static final z h;
    public final transient m f19270f;

    static {
        i iVar = m.f19233b;
        h = new z(x.e, v.f19259b);
    }

    public z(m mVar, Comparator comparator) {
        super(comparator);
        this.f19270f = mVar;
    }

    @Override
    public final Object ceiling(Object obj) {
        int y3 = y(obj, true);
        m mVar = this.f19270f;
        if (y3 == mVar.size()) {
            return null;
        }
        return mVar.get(y3);
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f19270f, obj, this.d) >= 0) {
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
            i listIterator = this.f19270f.listIterator(0);
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
        return this.f19270f.q().listIterator(0);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                m mVar = this.f19270f;
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
            return this.f19270f.get(0);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final Object floor(Object obj) {
        int x9 = x(obj, true) - 1;
        if (x9 == -1) {
            return null;
        }
        return this.f19270f.get(x9);
    }

    @Override
    public final int h(Object[] objArr) {
        return this.f19270f.h(objArr);
    }

    @Override
    public final Object higher(Object obj) {
        int y3 = y(obj, false);
        m mVar = this.f19270f;
        if (y3 == mVar.size()) {
            return null;
        }
        return mVar.get(y3);
    }

    @Override
    public final Iterator iterator() {
        return this.f19270f.listIterator(0);
    }

    @Override
    public final Object last() {
        if (!isEmpty()) {
            m mVar = this.f19270f;
            return mVar.get(mVar.size() - 1);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final Object lower(Object obj) {
        int x9 = x(obj, false) - 1;
        if (x9 == -1) {
            return null;
        }
        return this.f19270f.get(x9);
    }

    @Override
    public final int m() {
        return this.f19270f.m();
    }

    @Override
    public final int n() {
        return this.f19270f.n();
    }

    @Override
    public final d0 o() {
        return this.f19270f.listIterator(0);
    }

    @Override
    public final Object[] p() {
        return this.f19270f.p();
    }

    @Override
    public final m s() {
        return this.f19270f;
    }

    @Override
    public final int size() {
        return this.f19270f.size();
    }

    public final int x(Object obj, boolean z10) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f19270f, obj, this.d);
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
        int binarySearch = Collections.binarySearch(this.f19270f, obj, this.d);
        if (binarySearch >= 0) {
            if (z10) {
                return binarySearch;
            }
            return binarySearch + 1;
        }
        return ~binarySearch;
    }

    public final z z(int i10, int i11) {
        m mVar = this.f19270f;
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
        return s.w(comparator);
    }
}
