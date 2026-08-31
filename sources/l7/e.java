package l7;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import n7.cg;
import n7.mg;
public class e extends AbstractCollection implements List {
    public final int f11829a = 0;
    public final Object f11830b;
    public Collection f11831c;
    public final Collection d;
    public final AbstractCollection f11832e;
    public final Serializable f11833f;
    public final Serializable h;

    public e(h hVar, Object obj, List list, e eVar) {
        this.h = hVar;
        this.f11833f = hVar;
        this.f11830b = obj;
        this.f11831c = list;
        this.f11832e = eVar;
        this.d = eVar == null ? null : eVar.f11831c;
    }

    @Override
    public final boolean add(Object obj) {
        switch (this.f11829a) {
            case 0:
                zzb();
                boolean isEmpty = this.f11831c.isEmpty();
                boolean add = this.f11831c.add(obj);
                if (add) {
                    ((h) this.f11833f).d++;
                    if (isEmpty) {
                        p();
                        return true;
                    }
                    return add;
                }
                return add;
            case 1:
                zzb();
                boolean isEmpty2 = this.f11831c.isEmpty();
                boolean add2 = this.f11831c.add(obj);
                if (add2 && isEmpty2) {
                    p();
                    return true;
                }
                return add2;
            default:
                n();
                boolean isEmpty3 = this.f11831c.isEmpty();
                boolean add3 = this.f11831c.add(obj);
                if (add3) {
                    ((s8.e0) this.f11833f).f47101e++;
                    if (isEmpty3) {
                        i();
                    }
                }
                return add3;
        }
    }

    @Override
    public final boolean addAll(Collection collection) {
        switch (this.f11829a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean addAll = this.f11831c.addAll(collection);
                if (addAll) {
                    int size2 = this.f11831c.size();
                    ((h) this.f11833f).d += size2 - size;
                    if (size == 0) {
                        p();
                        return true;
                    }
                    return addAll;
                }
                return addAll;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean addAll2 = this.f11831c.addAll(collection);
                if (addAll2) {
                    this.f11831c.size();
                    if (size3 == 0) {
                        p();
                        return true;
                    }
                    return addAll2;
                }
                return addAll2;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size4 = size();
                boolean addAll3 = this.f11831c.addAll(collection);
                if (addAll3) {
                    int size5 = this.f11831c.size();
                    ((s8.e0) this.f11833f).f47101e += size5 - size4;
                    if (size4 == 0) {
                        i();
                        return addAll3;
                    }
                    return addAll3;
                }
                return addAll3;
        }
    }

    @Override
    public final void clear() {
        switch (this.f11829a) {
            case 0:
                int size = size();
                if (size != 0) {
                    this.f11831c.clear();
                    ((h) this.f11833f).d -= size;
                    q();
                    return;
                }
                return;
            case 1:
                if (size() != 0) {
                    this.f11831c.clear();
                    q();
                    return;
                }
                return;
            default:
                int size2 = size();
                if (size2 != 0) {
                    this.f11831c.clear();
                    ((s8.e0) this.f11833f).f47101e -= size2;
                    o();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f11829a) {
            case 0:
                zzb();
                return this.f11831c.contains(obj);
            case 1:
                zzb();
                return this.f11831c.contains(obj);
            default:
                n();
                return this.f11831c.contains(obj);
        }
    }

    @Override
    public final boolean containsAll(Collection collection) {
        switch (this.f11829a) {
            case 0:
                zzb();
                return this.f11831c.containsAll(collection);
            case 1:
                zzb();
                return this.f11831c.containsAll(collection);
            default:
                n();
                return this.f11831c.containsAll(collection);
        }
    }

    @Override
    public final boolean equals(Object obj) {
        switch (this.f11829a) {
            case 0:
                if (obj == this) {
                    return true;
                }
                zzb();
                return this.f11831c.equals(obj);
            case 1:
                if (obj == this) {
                    return true;
                }
                zzb();
                return this.f11831c.equals(obj);
            default:
                if (obj == this) {
                    return true;
                }
                n();
                return this.f11831c.equals(obj);
        }
    }

    @Override
    public final Object get(int i10) {
        switch (this.f11829a) {
            case 0:
                zzb();
                return ((List) this.f11831c).get(i10);
            case 1:
                zzb();
                return ((List) this.f11831c).get(i10);
            default:
                n();
                return ((List) this.f11831c).get(i10);
        }
    }

    @Override
    public final int hashCode() {
        switch (this.f11829a) {
            case 0:
                zzb();
                return this.f11831c.hashCode();
            case 1:
                zzb();
                return this.f11831c.hashCode();
            default:
                n();
                return this.f11831c.hashCode();
        }
    }

    public void i() {
        e eVar = (e) this.f11832e;
        if (eVar != null) {
            eVar.i();
        } else {
            ((s8.e0) this.f11833f).d.put(this.f11830b, this.f11831c);
        }
    }

    @Override
    public final int indexOf(Object obj) {
        switch (this.f11829a) {
            case 0:
                zzb();
                return ((List) this.f11831c).indexOf(obj);
            case 1:
                zzb();
                return ((List) this.f11831c).indexOf(obj);
            default:
                n();
                return ((List) this.f11831c).indexOf(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f11829a) {
            case 0:
                zzb();
                return new c(this);
            case 1:
                zzb();
                return new c(this, (byte) 0);
            default:
                n();
                return new c(this, (char) 0);
        }
    }

    @Override
    public final int lastIndexOf(Object obj) {
        switch (this.f11829a) {
            case 0:
                zzb();
                return ((List) this.f11831c).lastIndexOf(obj);
            case 1:
                zzb();
                return ((List) this.f11831c).lastIndexOf(obj);
            default:
                n();
                return ((List) this.f11831c).lastIndexOf(obj);
        }
    }

    @Override
    public final ListIterator listIterator() {
        switch (this.f11829a) {
            case 0:
                zzb();
                return new d(this);
            case 1:
                zzb();
                return new cg(this);
            default:
                n();
                return new s8.i(this);
        }
    }

    public void n() {
        Collection collection;
        e eVar = (e) this.f11832e;
        if (eVar != null) {
            eVar.n();
            if (eVar.f11831c != this.d) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f11831c.isEmpty() && (collection = (Collection) ((s8.e0) this.f11833f).d.get(this.f11830b)) != null) {
            this.f11831c = collection;
        }
    }

    public void o() {
        e eVar = (e) this.f11832e;
        if (eVar != null) {
            eVar.o();
        } else if (this.f11831c.isEmpty()) {
            ((s8.e0) this.f11833f).d.remove(this.f11830b);
        }
    }

    public void p() {
        switch (this.f11829a) {
            case 0:
                e eVar = (e) this.f11832e;
                if (eVar != null) {
                    eVar.p();
                    return;
                } else {
                    ((h) this.f11833f).f11865c.put(this.f11830b, this.f11831c);
                    return;
                }
            default:
                e eVar2 = (e) this.f11832e;
                if (eVar2 != null) {
                    eVar2.p();
                    return;
                }
                ((mg) this.f11833f).f15661c.put(this.f11830b, this.f11831c);
                return;
        }
    }

    public void q() {
        switch (this.f11829a) {
            case 0:
                e eVar = (e) this.f11832e;
                if (eVar != null) {
                    eVar.q();
                    return;
                } else if (this.f11831c.isEmpty()) {
                    ((h) this.f11833f).f11865c.remove(this.f11830b);
                    return;
                } else {
                    return;
                }
            default:
                e eVar2 = (e) this.f11832e;
                if (eVar2 != null) {
                    eVar2.q();
                    return;
                } else if (this.f11831c.isEmpty()) {
                    ((mg) this.f11833f).f15661c.remove(this.f11830b);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f11829a) {
            case 0:
                zzb();
                boolean remove = this.f11831c.remove(obj);
                if (remove) {
                    h hVar = (h) this.f11833f;
                    hVar.d--;
                    q();
                }
                return remove;
            case 1:
                zzb();
                boolean remove2 = this.f11831c.remove(obj);
                if (remove2) {
                    q();
                }
                return remove2;
            default:
                n();
                boolean remove3 = this.f11831c.remove(obj);
                if (remove3) {
                    s8.e0 e0Var = (s8.e0) this.f11833f;
                    e0Var.f47101e--;
                    o();
                }
                return remove3;
        }
    }

    @Override
    public final boolean removeAll(Collection collection) {
        switch (this.f11829a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean removeAll = this.f11831c.removeAll(collection);
                if (removeAll) {
                    int size2 = this.f11831c.size();
                    ((h) this.f11833f).d += size2 - size;
                    q();
                    return removeAll;
                }
                return removeAll;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                size();
                boolean removeAll2 = this.f11831c.removeAll(collection);
                if (removeAll2) {
                    this.f11831c.size();
                    q();
                    return removeAll2;
                }
                return removeAll2;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean removeAll3 = this.f11831c.removeAll(collection);
                if (removeAll3) {
                    int size4 = this.f11831c.size();
                    ((s8.e0) this.f11833f).f47101e += size4 - size3;
                    o();
                    return removeAll3;
                }
                return removeAll3;
        }
    }

    @Override
    public final boolean retainAll(Collection collection) {
        switch (this.f11829a) {
            case 0:
                collection.getClass();
                int size = size();
                boolean retainAll = this.f11831c.retainAll(collection);
                if (retainAll) {
                    int size2 = this.f11831c.size();
                    ((h) this.f11833f).d += size2 - size;
                    q();
                }
                return retainAll;
            case 1:
                collection.getClass();
                size();
                boolean retainAll2 = this.f11831c.retainAll(collection);
                if (retainAll2) {
                    this.f11831c.size();
                    q();
                }
                return retainAll2;
            default:
                collection.getClass();
                int size3 = size();
                boolean retainAll3 = this.f11831c.retainAll(collection);
                if (retainAll3) {
                    int size4 = this.f11831c.size();
                    ((s8.e0) this.f11833f).f47101e += size4 - size3;
                    o();
                }
                return retainAll3;
        }
    }

    @Override
    public final Object set(int i10, Object obj) {
        switch (this.f11829a) {
            case 0:
                zzb();
                return ((List) this.f11831c).set(i10, obj);
            case 1:
                zzb();
                return ((List) this.f11831c).set(i10, obj);
            default:
                n();
                return ((List) this.f11831c).set(i10, obj);
        }
    }

    @Override
    public final int size() {
        switch (this.f11829a) {
            case 0:
                zzb();
                return this.f11831c.size();
            case 1:
                zzb();
                return this.f11831c.size();
            default:
                n();
                return this.f11831c.size();
        }
    }

    @Override
    public final List subList(int i10, int i11) {
        switch (this.f11829a) {
            case 0:
                zzb();
                h hVar = (h) this.h;
                List subList = ((List) this.f11831c).subList(i10, i11);
                e eVar = (e) this.f11832e;
                if (eVar == null) {
                    eVar = this;
                }
                boolean z4 = subList instanceof RandomAccess;
                Object obj = this.f11830b;
                if (z4) {
                    return new e(hVar, obj, subList, eVar);
                }
                return new e(hVar, obj, subList, eVar);
            case 1:
                zzb();
                List subList2 = ((List) this.f11831c).subList(i10, i11);
                e eVar2 = (e) this.f11832e;
                if (eVar2 == null) {
                    eVar2 = this;
                }
                mg mgVar = (mg) this.h;
                boolean z10 = subList2 instanceof RandomAccess;
                Object obj2 = this.f11830b;
                if (z10) {
                    return new e(mgVar, obj2, subList2, eVar2);
                }
                return new e(mgVar, obj2, subList2, eVar2);
            default:
                n();
                s8.e0 e0Var = (s8.e0) this.h;
                List subList3 = ((List) this.f11831c).subList(i10, i11);
                e eVar3 = (e) this.f11832e;
                if (eVar3 == null) {
                    eVar3 = this;
                }
                boolean z11 = subList3 instanceof RandomAccess;
                Object obj3 = this.f11830b;
                if (z11) {
                    return new e(e0Var, obj3, subList3, eVar3);
                }
                return new e(e0Var, obj3, subList3, eVar3);
        }
    }

    @Override
    public final String toString() {
        switch (this.f11829a) {
            case 0:
                zzb();
                return this.f11831c.toString();
            case 1:
                zzb();
                return this.f11831c.toString();
            default:
                n();
                return this.f11831c.toString();
        }
    }

    public void zzb() {
        Collection collection;
        switch (this.f11829a) {
            case 0:
                e eVar = (e) this.f11832e;
                if (eVar != null) {
                    eVar.zzb();
                    if (eVar.f11831c != this.d) {
                        throw new ConcurrentModificationException();
                    }
                    return;
                } else if (this.f11831c.isEmpty() && (collection = (Collection) ((h) this.f11833f).f11865c.get(this.f11830b)) != null) {
                    this.f11831c = collection;
                    return;
                } else {
                    return;
                }
            default:
                e eVar2 = (e) this.f11832e;
                if (eVar2 != null) {
                    eVar2.zzb();
                    if (eVar2.f11831c != this.d) {
                        throw new ConcurrentModificationException();
                    }
                    return;
                } else if (this.f11831c.isEmpty()) {
                    Collection collection2 = (Collection) ((mg) this.f11833f).f15661c.get(this.f11830b);
                    if (collection2 != null) {
                        this.f11831c = collection2;
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }

    public e(mg mgVar, Object obj, List list, e eVar) {
        this.h = mgVar;
        this.f11833f = mgVar;
        this.f11830b = obj;
        this.f11831c = list;
        this.f11832e = eVar;
        this.d = eVar == null ? null : eVar.f11831c;
    }

    public e(s8.e0 e0Var, Object obj, List list, e eVar) {
        this.h = e0Var;
        this.f11833f = e0Var;
        this.f11830b = obj;
        this.f11831c = list;
        this.f11832e = eVar;
        this.d = eVar == null ? null : eVar.f11831c;
    }

    @Override
    public final ListIterator listIterator(int i10) {
        switch (this.f11829a) {
            case 0:
                zzb();
                return new d(this, i10);
            case 1:
                zzb();
                return new cg(this, i10);
            default:
                n();
                return new s8.i(this, i10);
        }
    }

    @Override
    public final Object remove(int i10) {
        switch (this.f11829a) {
            case 0:
                zzb();
                Object remove = ((List) this.f11831c).remove(i10);
                h hVar = (h) this.h;
                hVar.d--;
                q();
                return remove;
            case 1:
                zzb();
                Object remove2 = ((List) this.f11831c).remove(i10);
                q();
                return remove2;
            default:
                n();
                Object remove3 = ((List) this.f11831c).remove(i10);
                s8.e0 e0Var = (s8.e0) this.h;
                e0Var.f47101e--;
                o();
                return remove3;
        }
    }

    @Override
    public final void add(int i10, Object obj) {
        switch (this.f11829a) {
            case 0:
                zzb();
                boolean isEmpty = this.f11831c.isEmpty();
                ((List) this.f11831c).add(i10, obj);
                ((h) this.h).d++;
                if (isEmpty) {
                    p();
                    return;
                }
                return;
            case 1:
                zzb();
                boolean isEmpty2 = this.f11831c.isEmpty();
                ((List) this.f11831c).add(i10, obj);
                if (isEmpty2) {
                    p();
                    return;
                }
                return;
            default:
                n();
                boolean isEmpty3 = this.f11831c.isEmpty();
                ((List) this.f11831c).add(i10, obj);
                ((s8.e0) this.h).f47101e++;
                if (isEmpty3) {
                    i();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean addAll(int i10, Collection collection) {
        switch (this.f11829a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean addAll = ((List) this.f11831c).addAll(i10, collection);
                if (addAll) {
                    int size2 = this.f11831c.size();
                    ((h) this.h).d += size2 - size;
                    if (size == 0) {
                        p();
                        return true;
                    }
                    return addAll;
                }
                return addAll;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean addAll2 = ((List) this.f11831c).addAll(i10, collection);
                if (addAll2) {
                    this.f11831c.size();
                    if (size3 == 0) {
                        p();
                        return true;
                    }
                    return addAll2;
                }
                return addAll2;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size4 = size();
                boolean addAll3 = ((List) this.f11831c).addAll(i10, collection);
                if (addAll3) {
                    int size5 = this.f11831c.size();
                    ((s8.e0) this.h).f47101e += size5 - size4;
                    if (size4 == 0) {
                        i();
                        return addAll3;
                    }
                    return addAll3;
                }
                return addAll3;
        }
    }
}
