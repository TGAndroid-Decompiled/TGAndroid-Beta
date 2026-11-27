package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
public class dba extends AbstractCollection implements Set {
    public final Set a;
    public final pj8 b;

    public dba(Set set, pj8 pj8Var) {
        this.a = set;
        this.b = pj8Var;
    }

    @Override
    public final boolean add(Object obj) {
        yve.f(this.b.apply(obj));
        return this.a.add(obj);
    }

    @Override
    public final boolean addAll(Collection collection) {
        for (Object obj : collection) {
            yve.f(this.b.apply(obj));
        }
        return this.a.addAll(collection);
    }

    @Override
    public final void clear() {
        Set set = this.a;
        boolean z = set instanceof RandomAccess;
        pj8 pj8Var = this.b;
        if (z && (set instanceof List)) {
            List list = (List) set;
            pj8Var.getClass();
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                Object obj = list.get(i2);
                if (!pj8Var.apply(obj)) {
                    if (i2 > i) {
                        try {
                            list.set(i, obj);
                        } catch (IllegalArgumentException unused) {
                            dqe.c(list, pj8Var, i, i2);
                            return;
                        } catch (UnsupportedOperationException unused2) {
                            dqe.c(list, pj8Var, i, i2);
                            return;
                        }
                    }
                    i++;
                }
            }
            list.subList(i, list.size()).clear();
            return;
        }
        Iterator it = set.iterator();
        pj8Var.getClass();
        while (it.hasNext()) {
            if (pj8Var.apply(it.next())) {
                it.remove();
            }
        }
    }

    @Override
    public final boolean contains(Object obj) {
        boolean z;
        Set set = this.a;
        set.getClass();
        try {
            z = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z = false;
        }
        if (!z) {
            return false;
        }
        return this.b.apply(obj);
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
        return qye.a(this, obj);
    }

    @Override
    public final int hashCode() {
        return qye.c(this);
    }

    @Override
    public final boolean isEmpty() {
        Iterator it = this.a.iterator();
        pj8 pj8Var = this.b;
        yve.l(pj8Var, "predicate");
        boolean z = false;
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (pj8Var.apply(it.next())) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i != -1) {
            z = true;
        }
        return !z;
    }

    @Override
    public final Iterator iterator() {
        Iterator it = this.a.iterator();
        it.getClass();
        pj8 pj8Var = this.b;
        pj8Var.getClass();
        return new mu5(it, pj8Var);
    }

    @Override
    public final boolean remove(Object obj) {
        if (contains(obj) && this.a.remove(obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        Iterator it = this.a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.b.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        Iterator it = this.a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.b.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override
    public final int size() {
        int i = 0;
        for (Object obj : this.a) {
            if (this.b.apply(obj)) {
                i++;
            }
        }
        return i;
    }

    @Override
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            mu5 mu5Var = (mu5) it;
            if (mu5Var.hasNext()) {
                arrayList.add(mu5Var.next());
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
            mu5 mu5Var = (mu5) it;
            if (mu5Var.hasNext()) {
                arrayList.add(mu5Var.next());
            } else {
                return arrayList.toArray(objArr);
            }
        }
    }
}
