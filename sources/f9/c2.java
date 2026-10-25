package f9;

import a8.yb;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
public class c2 extends AbstractCollection implements Set {
    public final Set f10269a;
    public final e9.l f10270b;

    public c2(Set set, e9.l lVar) {
        this.f10269a = set;
        this.f10270b = lVar;
    }

    @Override
    public final boolean add(Object obj) {
        yb.g(this.f10270b.apply(obj));
        return this.f10269a.add(obj);
    }

    @Override
    public final boolean addAll(Collection collection) {
        for (Object obj : collection) {
            yb.g(this.f10270b.apply(obj));
        }
        return this.f10269a.addAll(collection);
    }

    @Override
    public final void clear() {
        Set set = this.f10269a;
        boolean z10 = set instanceof RandomAccess;
        e9.l lVar = this.f10270b;
        if (z10 && (set instanceof List)) {
            List list = (List) set;
            lVar.getClass();
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                Object obj = list.get(i11);
                if (!lVar.apply(obj)) {
                    if (i11 > i10) {
                        try {
                            list.set(i10, obj);
                        } catch (IllegalArgumentException unused) {
                            o.s(list, lVar, i10, i11);
                            return;
                        } catch (UnsupportedOperationException unused2) {
                            o.s(list, lVar, i10, i11);
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
        Set set = this.f10269a;
        set.getClass();
        try {
            z10 = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return this.f10270b.apply(obj);
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
        return o.j(this, obj);
    }

    @Override
    public final int hashCode() {
        return o.n(this);
    }

    @Override
    public final boolean isEmpty() {
        Iterator it = this.f10269a.iterator();
        e9.l lVar = this.f10270b;
        yb.l(lVar, "predicate");
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (it.hasNext()) {
                if (lVar.apply(it.next())) {
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
        Iterator it = this.f10269a.iterator();
        it.getClass();
        e9.l lVar = this.f10270b;
        lVar.getClass();
        return new v0(it, lVar);
    }

    @Override
    public final boolean remove(Object obj) {
        if (contains(obj) && this.f10269a.remove(obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f10269a.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f10270b.apply(next) && collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f10269a.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f10270b.apply(next) && !collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override
    public final int size() {
        int i10 = 0;
        for (Object obj : this.f10269a) {
            if (this.f10270b.apply(obj)) {
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
