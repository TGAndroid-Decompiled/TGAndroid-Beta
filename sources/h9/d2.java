package h9;

import a8.ma;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
public class d2 extends AbstractCollection implements Set {
    public final Set f13983a;
    public final g9.l f13984b;

    public d2(Set set, g9.l lVar) {
        this.f13983a = set;
        this.f13984b = lVar;
    }

    @Override
    public final boolean add(Object obj) {
        ma.f(this.f13984b.apply(obj));
        return this.f13983a.add(obj);
    }

    @Override
    public final boolean addAll(Collection collection) {
        for (Object obj : collection) {
            ma.f(this.f13984b.apply(obj));
        }
        return this.f13983a.addAll(collection);
    }

    @Override
    public final void clear() {
        Set set = this.f13983a;
        boolean z10 = set instanceof RandomAccess;
        g9.l lVar = this.f13984b;
        if (z10 && (set instanceof List)) {
            List list = (List) set;
            lVar.getClass();
            int i7 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                Object obj = list.get(i10);
                if (!lVar.apply(obj)) {
                    if (i10 > i7) {
                        try {
                            list.set(i7, obj);
                        } catch (IllegalArgumentException unused) {
                            o.t(list, lVar, i7, i10);
                            return;
                        } catch (UnsupportedOperationException unused2) {
                            o.t(list, lVar, i7, i10);
                            return;
                        }
                    }
                    i7++;
                }
            }
            list.subList(i7, list.size()).clear();
            return;
        }
        Iterator it = set.iterator();
        lVar.getClass();
        while (it.hasNext()) {
            if (lVar.apply(it.next())) {
                it.remove();
            }
        }
    }

    @Override
    public final boolean contains(Object obj) {
        boolean z10;
        Set set = this.f13983a;
        set.getClass();
        try {
            z10 = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return this.f13984b.apply(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean equals(Object obj) {
        return o.k(this, obj);
    }

    @Override
    public final int hashCode() {
        return o.o(this);
    }

    @Override
    public final boolean isEmpty() {
        Iterator it = this.f13983a.iterator();
        g9.l lVar = this.f13984b;
        ma.k(lVar, "predicate");
        boolean z10 = false;
        int i7 = 0;
        while (true) {
            if (it.hasNext()) {
                if (lVar.apply(it.next())) {
                    break;
                }
                i7++;
            } else {
                i7 = -1;
                break;
            }
        }
        if (i7 != -1) {
            z10 = true;
        }
        return true ^ z10;
    }

    @Override
    public final Iterator iterator() {
        Iterator it = this.f13983a.iterator();
        it.getClass();
        g9.l lVar = this.f13984b;
        lVar.getClass();
        return new v0(it, lVar);
    }

    @Override
    public final boolean remove(Object obj) {
        if (contains(obj) && this.f13983a.remove(obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f13983a.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f13984b.apply(next) && collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f13983a.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f13984b.apply(next) && !collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override
    public final int size() {
        int i7 = 0;
        for (Object obj : this.f13983a) {
            if (this.f13984b.apply(obj)) {
                i7++;
            }
        }
        return i7;
    }

    @Override
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            v0 v0Var = (v0) it;
            if (v0Var.hasNext()) {
                arrayList.add(v0Var.next());
            } else {
                return arrayList.toArray();
            }
        }
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            v0 v0Var = (v0) it;
            if (v0Var.hasNext()) {
                arrayList.add(v0Var.next());
            } else {
                return arrayList.toArray(objArr);
            }
        }
    }
}
