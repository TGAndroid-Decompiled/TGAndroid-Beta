package h9;

import a8.ia;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
public class d2 extends AbstractCollection implements Set {
    public final Set f14316a;
    public final g9.m f14317b;

    public d2(Set set, g9.m mVar) {
        this.f14316a = set;
        this.f14317b = mVar;
    }

    @Override
    public final boolean add(Object obj) {
        ia.f(this.f14317b.apply(obj));
        return this.f14316a.add(obj);
    }

    @Override
    public final boolean addAll(Collection collection) {
        for (Object obj : collection) {
            ia.f(this.f14317b.apply(obj));
        }
        return this.f14316a.addAll(collection);
    }

    @Override
    public final void clear() {
        Set set = this.f14316a;
        boolean z9 = set instanceof RandomAccess;
        g9.m mVar = this.f14317b;
        if (z9 && (set instanceof List)) {
            List list = (List) set;
            mVar.getClass();
            int i7 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                Object obj = list.get(i10);
                if (!mVar.apply(obj)) {
                    if (i10 > i7) {
                        try {
                            list.set(i7, obj);
                        } catch (IllegalArgumentException unused) {
                            o.t(list, mVar, i7, i10);
                            return;
                        } catch (UnsupportedOperationException unused2) {
                            o.t(list, mVar, i7, i10);
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
        mVar.getClass();
        while (it.hasNext()) {
            if (mVar.apply(it.next())) {
                it.remove();
            }
        }
    }

    @Override
    public final boolean contains(Object obj) {
        boolean z9;
        Set set = this.f14316a;
        set.getClass();
        try {
            z9 = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z9 = false;
        }
        if (!z9) {
            return false;
        }
        return this.f14317b.apply(obj);
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
        Iterator it = this.f14316a.iterator();
        g9.m mVar = this.f14317b;
        ia.k(mVar, "predicate");
        boolean z9 = false;
        int i7 = 0;
        while (true) {
            if (it.hasNext()) {
                if (mVar.apply(it.next())) {
                    break;
                }
                i7++;
            } else {
                i7 = -1;
                break;
            }
        }
        if (i7 != -1) {
            z9 = true;
        }
        return true ^ z9;
    }

    @Override
    public final Iterator iterator() {
        Iterator it = this.f14316a.iterator();
        it.getClass();
        g9.m mVar = this.f14317b;
        mVar.getClass();
        return new v0(it, mVar);
    }

    @Override
    public final boolean remove(Object obj) {
        if (contains(obj) && this.f14316a.remove(obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f14316a.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f14317b.apply(next) && collection.contains(next)) {
                it.remove();
                z9 = true;
            }
        }
        return z9;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f14316a.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f14317b.apply(next) && !collection.contains(next)) {
                it.remove();
                z9 = true;
            }
        }
        return z9;
    }

    @Override
    public final int size() {
        int i7 = 0;
        for (Object obj : this.f14316a) {
            if (this.f14317b.apply(obj)) {
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
