package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
public final class aod extends xld {
    public static final aod y;
    public final transient yjd x;

    static {
        eid eidVar = yjd.n;
        y = new aod(qnd.w, end.b);
    }

    public aod(yjd yjdVar, Comparator comparator) {
        super(comparator);
        this.x = yjdVar;
    }

    @Override
    public final yjd A() {
        return this.x;
    }

    public final int F(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.x, obj, this.s);
        if (binarySearch >= 0) {
            if (z) {
                return binarySearch + 1;
            }
            return binarySearch;
        }
        return ~binarySearch;
    }

    public final int G(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.x, obj, this.s);
        if (binarySearch >= 0) {
            if (z) {
                return binarySearch;
            }
            return binarySearch + 1;
        }
        return ~binarySearch;
    }

    public final aod H(int i, int i2) {
        yjd yjdVar = this.x;
        if (i == 0) {
            if (i2 != yjdVar.size()) {
                i = 0;
            } else {
                return this;
            }
        }
        Comparator comparator = this.s;
        if (i < i2) {
            return new aod(yjdVar.subList(i, i2), comparator);
        }
        return xld.E(comparator);
    }

    @Override
    public final Object ceiling(Object obj) {
        int G = G(obj, true);
        yjd yjdVar = this.x;
        if (G == yjdVar.size()) {
            return null;
        }
        return yjdVar.get(G);
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.x, obj, this.s) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override
    public final boolean containsAll(Collection collection) {
        if (collection instanceof dnd) {
            collection = ((dnd) collection).zza();
        }
        Comparator comparator = this.s;
        if (i3f.a(comparator, collection) && collection.size() > 1) {
            eid listIterator = this.x.listIterator(0);
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
        return this.x.y().listIterator(0);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                yjd yjdVar = this.x;
                if (yjdVar.size() == set.size()) {
                    if (!isEmpty()) {
                        Comparator comparator = this.s;
                        if (i3f.a(comparator, set)) {
                            Iterator it = set.iterator();
                            try {
                                eid listIterator = yjdVar.listIterator(0);
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
            return this.x.get(0);
        }
        u36.g();
        return null;
    }

    @Override
    public final Object floor(Object obj) {
        int F = F(obj, true) - 1;
        if (F == -1) {
            return null;
        }
        return this.x.get(F);
    }

    @Override
    public final Object higher(Object obj) {
        int G = G(obj, false);
        yjd yjdVar = this.x;
        if (G == yjdVar.size()) {
            return null;
        }
        return yjdVar.get(G);
    }

    @Override
    public final Iterator iterator() {
        return this.x.listIterator(0);
    }

    @Override
    public final Object last() {
        if (!isEmpty()) {
            yjd yjdVar = this.x;
            return yjdVar.get(yjdVar.size() - 1);
        }
        u36.g();
        return null;
    }

    @Override
    public final Object lower(Object obj) {
        int F = F(obj, false) - 1;
        if (F == -1) {
            return null;
        }
        return this.x.get(F);
    }

    @Override
    public final int p(Object[] objArr) {
        return this.x.p(objArr);
    }

    @Override
    public final int q() {
        return this.x.q();
    }

    @Override
    public final int s() {
        return this.x.s();
    }

    @Override
    public final int size() {
        return this.x.size();
    }

    @Override
    public final v7c u() {
        return this.x.listIterator(0);
    }

    @Override
    public final Object[] v() {
        return this.x.v();
    }
}
