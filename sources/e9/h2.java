package e9;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import v7.u6;
public class h2 extends AbstractCollection implements Set {
    public final Set f8457a;
    public final d9.m f8458b;

    public h2(Set set, d9.m mVar) {
        this.f8457a = set;
        this.f8458b = mVar;
    }

    @Override
    public final boolean add(Object obj) {
        u6.g(this.f8458b.apply(obj));
        return this.f8457a.add(obj);
    }

    @Override
    public final boolean addAll(Collection collection) {
        for (Object obj : collection) {
            u6.g(this.f8458b.apply(obj));
        }
        return this.f8457a.addAll(collection);
    }

    @Override
    public final void clear() {
        Set set = this.f8457a;
        boolean z10 = set instanceof RandomAccess;
        d9.m mVar = this.f8458b;
        if (z10 && (set instanceof List)) {
            List list = (List) set;
            mVar.getClass();
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                Object obj = list.get(i11);
                if (!mVar.apply(obj)) {
                    if (i11 > i10) {
                        try {
                            list.set(i10, obj);
                        } catch (IllegalArgumentException unused) {
                            s.s(list, mVar, i10, i11);
                            return;
                        } catch (UnsupportedOperationException unused2) {
                            s.s(list, mVar, i10, i11);
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
        mVar.getClass();
        while (it.hasNext()) {
            if (mVar.apply(it.next())) {
                it.remove();
            }
        }
    }

    @Override
    public final boolean contains(Object obj) {
        boolean z10;
        Set set = this.f8457a;
        set.getClass();
        try {
            z10 = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return this.f8458b.apply(obj);
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
        return s.j(this, obj);
    }

    @Override
    public final int hashCode() {
        return s.n(this);
    }

    @Override
    public final boolean isEmpty() {
        Iterator it = this.f8457a.iterator();
        d9.m mVar = this.f8458b;
        u6.l(mVar, "predicate");
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (it.hasNext()) {
                if (mVar.apply(it.next())) {
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
        Iterator it = this.f8457a.iterator();
        it.getClass();
        d9.m mVar = this.f8458b;
        mVar.getClass();
        return new a1(it, mVar);
    }

    @Override
    public final boolean remove(Object obj) {
        if (contains(obj) && this.f8457a.remove(obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f8457a.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f8458b.apply(next) && collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f8457a.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f8458b.apply(next) && !collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override
    public final int size() {
        int i10 = 0;
        for (Object obj : this.f8457a) {
            if (this.f8458b.apply(obj)) {
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
            a1 a1Var = (a1) it;
            if (a1Var.hasNext()) {
                arrayList.add(a1Var.next());
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
            a1 a1Var = (a1) it;
            if (a1Var.hasNext()) {
                arrayList.add(a1Var.next());
            } else {
                return arrayList.toArray(objArr);
            }
        }
    }
}
