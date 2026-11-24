package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
public class n9a extends AbstractCollection implements Set {
    public final Set a;
    public final di8 b;

    public n9a(Set set, di8 di8Var) {
        this.a = set;
        this.b = di8Var;
    }

    @Override
    public final boolean add(Object obj) {
        jte.f(this.b.apply(obj));
        return this.a.add(obj);
    }

    @Override
    public final boolean addAll(Collection collection) {
        for (Object obj : collection) {
            jte.f(this.b.apply(obj));
        }
        return this.a.addAll(collection);
    }

    @Override
    public final void clear() {
        Set set = this.a;
        boolean z = set instanceof RandomAccess;
        di8 di8Var = this.b;
        if (z && (set instanceof List)) {
            List list = (List) set;
            di8Var.getClass();
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                Object obj = list.get(i2);
                if (!di8Var.apply(obj)) {
                    if (i2 > i) {
                        try {
                            list.set(i, obj);
                        } catch (IllegalArgumentException unused) {
                            lne.c(list, di8Var, i, i2);
                            return;
                        } catch (UnsupportedOperationException unused2) {
                            lne.c(list, di8Var, i, i2);
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
        di8Var.getClass();
        while (it.hasNext()) {
            if (di8Var.apply(it.next())) {
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
        return bwe.a(this, obj);
    }

    @Override
    public final int hashCode() {
        return bwe.c(this);
    }

    @Override
    public final boolean isEmpty() {
        Iterator it = this.a.iterator();
        di8 di8Var = this.b;
        jte.l(di8Var, "predicate");
        boolean z = false;
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (di8Var.apply(it.next())) {
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
        di8 di8Var = this.b;
        di8Var.getClass();
        return new iu5(it, di8Var);
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
            iu5 iu5Var = (iu5) it;
            if (iu5Var.hasNext()) {
                arrayList.add(iu5Var.next());
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
            iu5 iu5Var = (iu5) it;
            if (iu5Var.hasNext()) {
                arrayList.add(iu5Var.next());
            } else {
                return arrayList.toArray(objArr);
            }
        }
    }
}
