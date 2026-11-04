package g9;

import b8.zb;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
public class c2 extends AbstractCollection implements Set {
    public final Set f12063a;
    public final f9.l f12064b;

    public c2(Set set, f9.l lVar) {
        this.f12063a = set;
        this.f12064b = lVar;
    }

    @Override
    public final boolean add(Object obj) {
        zb.f(this.f12064b.apply(obj));
        return this.f12063a.add(obj);
    }

    @Override
    public final boolean addAll(Collection collection) {
        for (Object obj : collection) {
            zb.f(this.f12064b.apply(obj));
        }
        return this.f12063a.addAll(collection);
    }

    @Override
    public final void clear() {
        Set set = this.f12063a;
        boolean z10 = set instanceof RandomAccess;
        f9.l lVar = this.f12064b;
        if (z10 && (set instanceof List)) {
            List list = (List) set;
            lVar.getClass();
            int i3 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                Object obj = list.get(i10);
                if (!lVar.apply(obj)) {
                    if (i10 > i3) {
                        try {
                            list.set(i3, obj);
                        } catch (IllegalArgumentException unused) {
                            o.t(list, lVar, i3, i10);
                            return;
                        } catch (UnsupportedOperationException unused2) {
                            o.t(list, lVar, i3, i10);
                            return;
                        }
                    }
                    i3++;
                }
            }
            list.subList(i3, list.size()).clear();
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
        Set set = this.f12063a;
        set.getClass();
        try {
            z10 = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return this.f12064b.apply(obj);
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
        Iterator it = this.f12063a.iterator();
        f9.l lVar = this.f12064b;
        zb.k(lVar, "predicate");
        boolean z10 = false;
        int i3 = 0;
        while (true) {
            if (it.hasNext()) {
                if (lVar.apply(it.next())) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        if (i3 != -1) {
            z10 = true;
        }
        return true ^ z10;
    }

    @Override
    public final Iterator iterator() {
        Iterator it = this.f12063a.iterator();
        it.getClass();
        f9.l lVar = this.f12064b;
        lVar.getClass();
        return new v0(it, lVar);
    }

    @Override
    public final boolean remove(Object obj) {
        if (contains(obj) && this.f12063a.remove(obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f12063a.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f12064b.apply(next) && collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f12063a.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f12064b.apply(next) && !collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override
    public final int size() {
        int i3 = 0;
        for (Object obj : this.f12063a) {
            if (this.f12064b.apply(obj)) {
                i3++;
            }
        }
        return i3;
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
