package o8;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
public class u0 extends AbstractCollection implements Set {
    public final Set f19093a;
    public final n8.f f19094b;

    public u0(Set set, n8.f fVar) {
        this.f19093a = set;
        this.f19094b = fVar;
    }

    @Override
    public final boolean add(Object obj) {
        if (this.f19094b.apply(obj)) {
            return this.f19093a.add(obj);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final boolean addAll(Collection collection) {
        for (Object obj : collection) {
            if (!this.f19094b.apply(obj)) {
                throw new IllegalArgumentException();
            }
        }
        return this.f19093a.addAll(collection);
    }

    @Override
    public final void clear() {
        Set set = this.f19093a;
        boolean z10 = set instanceof RandomAccess;
        n8.f fVar = this.f19094b;
        if (z10 && (set instanceof List)) {
            List list = (List) set;
            fVar.getClass();
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                Object obj = list.get(i10);
                if (!fVar.apply(obj)) {
                    if (i10 > i9) {
                        try {
                            list.set(i9, obj);
                        } catch (IllegalArgumentException unused) {
                            l.n(list, fVar, i9, i10);
                            return;
                        } catch (UnsupportedOperationException unused2) {
                            l.n(list, fVar, i9, i10);
                            return;
                        }
                    }
                    i9++;
                }
            }
            list.subList(i9, list.size()).clear();
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
        Set set = this.f19093a;
        set.getClass();
        try {
            z10 = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return this.f19094b.apply(obj);
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
        return l.d(this, obj);
    }

    @Override
    public final int hashCode() {
        return l.h(this);
    }

    @Override
    public final boolean isEmpty() {
        Iterator it = this.f19093a.iterator();
        n8.f fVar = this.f19094b;
        if (fVar != null) {
            boolean z10 = false;
            int i9 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (fVar.apply(it.next())) {
                        break;
                    }
                    i9++;
                } else {
                    i9 = -1;
                    break;
                }
            }
            if (i9 != -1) {
                z10 = true;
            }
            return true ^ z10;
        }
        throw new NullPointerException("predicate");
    }

    @Override
    public final Iterator iterator() {
        Iterator it = this.f19093a.iterator();
        it.getClass();
        n8.f fVar = this.f19094b;
        fVar.getClass();
        return new d0(it, fVar);
    }

    @Override
    public final boolean remove(Object obj) {
        if (contains(obj) && this.f19093a.remove(obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f19093a.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f19094b.apply(next) && collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f19093a.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f19094b.apply(next) && !collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override
    public final int size() {
        int i9 = 0;
        for (Object obj : this.f19093a) {
            if (this.f19094b.apply(obj)) {
                i9++;
            }
        }
        return i9;
    }

    @Override
    public final Object[] toArray() {
        d0 d0Var = (d0) iterator();
        ArrayList arrayList = new ArrayList();
        while (d0Var.hasNext()) {
            arrayList.add(d0Var.next());
        }
        return arrayList.toArray();
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        d0 d0Var = (d0) iterator();
        ArrayList arrayList = new ArrayList();
        while (d0Var.hasNext()) {
            arrayList.add(d0Var.next());
        }
        return arrayList.toArray(objArr);
    }
}
