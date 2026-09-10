package e9;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import v7.t6;
public class j1 extends AbstractCollection implements Set {
    public final Set f7390a;
    public final d9.f f7391b;

    public j1(Set set, d9.f fVar) {
        this.f7390a = set;
        this.f7391b = fVar;
    }

    @Override
    public final boolean add(Object obj) {
        if (this.f7391b.apply(obj)) {
            return this.f7390a.add(obj);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final boolean addAll(Collection collection) {
        for (Object obj : collection) {
            if (!this.f7391b.apply(obj)) {
                throw new IllegalArgumentException();
            }
        }
        return this.f7390a.addAll(collection);
    }

    @Override
    public final void clear() {
        Set set = this.f7390a;
        boolean z10 = set instanceof RandomAccess;
        d9.f fVar = this.f7391b;
        if (z10 && (set instanceof List)) {
            List list = (List) set;
            fVar.getClass();
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                Object obj = list.get(i11);
                if (!fVar.apply(obj)) {
                    if (i11 > i10) {
                        try {
                            list.set(i10, obj);
                        } catch (IllegalArgumentException unused) {
                            q.r(list, fVar, i10, i11);
                            return;
                        } catch (UnsupportedOperationException unused2) {
                            q.r(list, fVar, i10, i11);
                            return;
                        }
                    }
                    i10++;
                }
            }
            list.subList(i10, list.size()).clear();
            return;
        }
        Iterator it = set.iterator();
        fVar.getClass();
        while (it.hasNext()) {
            if (fVar.apply(it.next())) {
                it.remove();
            }
        }
    }

    @Override
    public final boolean contains(Object obj) {
        boolean z10;
        Set set = this.f7390a;
        set.getClass();
        try {
            z10 = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return this.f7391b.apply(obj);
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
        return q.i(this, obj);
    }

    @Override
    public final int hashCode() {
        return q.m(this);
    }

    @Override
    public final boolean isEmpty() {
        Iterator it = this.f7390a.iterator();
        d9.f fVar = this.f7391b;
        t6.d(fVar, "predicate");
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (it.hasNext()) {
                if (fVar.apply(it.next())) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 != -1) {
            z10 = true;
        }
        return true ^ z10;
    }

    @Override
    public final Iterator iterator() {
        Iterator it = this.f7390a.iterator();
        it.getClass();
        d9.f fVar = this.f7391b;
        fVar.getClass();
        return new n0(it, fVar);
    }

    @Override
    public final boolean remove(Object obj) {
        if (contains(obj) && this.f7390a.remove(obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f7390a.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f7391b.apply(next) && collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f7390a.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f7391b.apply(next) && !collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override
    public final int size() {
        int i10 = 0;
        for (Object obj : this.f7390a) {
            if (this.f7391b.apply(obj)) {
                i10++;
            }
        }
        return i10;
    }

    @Override
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            n0 n0Var = (n0) it;
            if (n0Var.hasNext()) {
                arrayList.add(n0Var.next());
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
            n0 n0Var = (n0) it;
            if (n0Var.hasNext()) {
                arrayList.add(n0Var.next());
            } else {
                return arrayList.toArray(objArr);
            }
        }
    }
}
