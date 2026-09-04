package e9;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import z7.bg;
import z7.lg;
public class l extends AbstractCollection implements List {
    public final int f8969a = 0;
    public final Object f8970b;
    public Collection f8971c;
    public final Collection d;
    public final AbstractCollection f8972e;
    public final Serializable f8973f;
    public final Serializable h;

    public l(x7.f fVar, Object obj, List list, l lVar) {
        this.h = fVar;
        this.f8973f = fVar;
        this.f8970b = obj;
        this.f8971c = list;
        this.f8972e = lVar;
        this.d = lVar == null ? null : lVar.f8971c;
    }

    @Override
    public final void add(int i10, Object obj) {
        switch (this.f8969a) {
            case 0:
                n();
                boolean isEmpty = this.f8971c.isEmpty();
                ((List) this.f8971c).add(i10, obj);
                ((v0) this.h).f9019e++;
                if (isEmpty) {
                    i();
                    return;
                }
                return;
            case 1:
                zzb();
                boolean isEmpty2 = this.f8971c.isEmpty();
                ((List) this.f8971c).add(i10, obj);
                ((x7.f) this.h).d++;
                if (isEmpty2) {
                    p();
                    return;
                }
                return;
            default:
                zzb();
                boolean isEmpty3 = this.f8971c.isEmpty();
                ((List) this.f8971c).add(i10, obj);
                if (isEmpty3) {
                    p();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean addAll(int i10, Collection collection) {
        switch (this.f8969a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean addAll = ((List) this.f8971c).addAll(i10, collection);
                if (addAll) {
                    int size2 = this.f8971c.size();
                    ((v0) this.h).f9019e += size2 - size;
                    if (size == 0) {
                        i();
                        return addAll;
                    }
                    return addAll;
                }
                return addAll;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean addAll2 = ((List) this.f8971c).addAll(i10, collection);
                if (addAll2) {
                    int size4 = this.f8971c.size();
                    ((x7.f) this.h).d += size4 - size3;
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
                int size5 = size();
                boolean addAll3 = ((List) this.f8971c).addAll(i10, collection);
                if (addAll3) {
                    this.f8971c.size();
                    if (size5 == 0) {
                        p();
                        return true;
                    }
                    return addAll3;
                }
                return addAll3;
        }
    }

    @Override
    public final void clear() {
        switch (this.f8969a) {
            case 0:
                int size = size();
                if (size != 0) {
                    this.f8971c.clear();
                    ((v0) this.f8973f).f9019e -= size;
                    o();
                    return;
                }
                return;
            case 1:
                int size2 = size();
                if (size2 != 0) {
                    this.f8971c.clear();
                    ((x7.f) this.f8973f).d -= size2;
                    q();
                    return;
                }
                return;
            default:
                if (size() != 0) {
                    this.f8971c.clear();
                    q();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f8969a) {
            case 0:
                n();
                return this.f8971c.contains(obj);
            case 1:
                zzb();
                return this.f8971c.contains(obj);
            default:
                zzb();
                return this.f8971c.contains(obj);
        }
    }

    @Override
    public final boolean containsAll(Collection collection) {
        switch (this.f8969a) {
            case 0:
                n();
                return this.f8971c.containsAll(collection);
            case 1:
                zzb();
                return this.f8971c.containsAll(collection);
            default:
                zzb();
                return this.f8971c.containsAll(collection);
        }
    }

    @Override
    public final boolean equals(Object obj) {
        switch (this.f8969a) {
            case 0:
                if (obj == this) {
                    return true;
                }
                n();
                return this.f8971c.equals(obj);
            case 1:
                if (obj == this) {
                    return true;
                }
                zzb();
                return this.f8971c.equals(obj);
            default:
                if (obj == this) {
                    return true;
                }
                zzb();
                return this.f8971c.equals(obj);
        }
    }

    @Override
    public final Object get(int i10) {
        switch (this.f8969a) {
            case 0:
                n();
                return ((List) this.f8971c).get(i10);
            case 1:
                zzb();
                return ((List) this.f8971c).get(i10);
            default:
                zzb();
                return ((List) this.f8971c).get(i10);
        }
    }

    @Override
    public final int hashCode() {
        switch (this.f8969a) {
            case 0:
                n();
                return this.f8971c.hashCode();
            case 1:
                zzb();
                return this.f8971c.hashCode();
            default:
                zzb();
                return this.f8971c.hashCode();
        }
    }

    public void i() {
        l lVar = (l) this.f8972e;
        if (lVar != null) {
            lVar.i();
        } else {
            ((v0) this.f8973f).d.put(this.f8970b, this.f8971c);
        }
    }

    @Override
    public final int indexOf(Object obj) {
        switch (this.f8969a) {
            case 0:
                n();
                return ((List) this.f8971c).indexOf(obj);
            case 1:
                zzb();
                return ((List) this.f8971c).indexOf(obj);
            default:
                zzb();
                return ((List) this.f8971c).indexOf(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f8969a) {
            case 0:
                n();
                return new c(this);
            case 1:
                zzb();
                return new c(this, (byte) 0);
            default:
                zzb();
                return new c(this, (char) 0);
        }
    }

    @Override
    public final int lastIndexOf(Object obj) {
        switch (this.f8969a) {
            case 0:
                n();
                return ((List) this.f8971c).lastIndexOf(obj);
            case 1:
                zzb();
                return ((List) this.f8971c).lastIndexOf(obj);
            default:
                zzb();
                return ((List) this.f8971c).lastIndexOf(obj);
        }
    }

    @Override
    public final ListIterator listIterator() {
        switch (this.f8969a) {
            case 0:
                n();
                return new k(this);
            case 1:
                zzb();
                return new x7.c(this);
            default:
                zzb();
                return new bg(this);
        }
    }

    public void n() {
        Collection collection;
        l lVar = (l) this.f8972e;
        if (lVar != null) {
            lVar.n();
            if (lVar.f8971c != this.d) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f8971c.isEmpty() && (collection = (Collection) ((v0) this.f8973f).d.get(this.f8970b)) != null) {
            this.f8971c = collection;
        }
    }

    public void o() {
        l lVar = (l) this.f8972e;
        if (lVar != null) {
            lVar.o();
        } else if (this.f8971c.isEmpty()) {
            ((v0) this.f8973f).d.remove(this.f8970b);
        }
    }

    public void p() {
        switch (this.f8969a) {
            case 1:
                l lVar = (l) this.f8972e;
                if (lVar != null) {
                    lVar.p();
                    return;
                } else {
                    ((x7.f) this.f8973f).f48977c.put(this.f8970b, this.f8971c);
                    return;
                }
            default:
                l lVar2 = (l) this.f8972e;
                if (lVar2 != null) {
                    lVar2.p();
                    return;
                }
                ((lg) this.f8973f).f51158c.put(this.f8970b, this.f8971c);
                return;
        }
    }

    public void q() {
        switch (this.f8969a) {
            case 1:
                l lVar = (l) this.f8972e;
                if (lVar != null) {
                    lVar.q();
                    return;
                } else if (this.f8971c.isEmpty()) {
                    ((x7.f) this.f8973f).f48977c.remove(this.f8970b);
                    return;
                } else {
                    return;
                }
            default:
                l lVar2 = (l) this.f8972e;
                if (lVar2 != null) {
                    lVar2.q();
                    return;
                } else if (this.f8971c.isEmpty()) {
                    ((lg) this.f8973f).f51158c.remove(this.f8970b);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public final Object remove(int i10) {
        switch (this.f8969a) {
            case 0:
                n();
                Object remove = ((List) this.f8971c).remove(i10);
                v0 v0Var = (v0) this.h;
                v0Var.f9019e--;
                o();
                return remove;
            case 1:
                zzb();
                Object remove2 = ((List) this.f8971c).remove(i10);
                x7.f fVar = (x7.f) this.h;
                fVar.d--;
                q();
                return remove2;
            default:
                zzb();
                Object remove3 = ((List) this.f8971c).remove(i10);
                q();
                return remove3;
        }
    }

    @Override
    public final boolean removeAll(Collection collection) {
        switch (this.f8969a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean removeAll = this.f8971c.removeAll(collection);
                if (removeAll) {
                    int size2 = this.f8971c.size();
                    ((v0) this.f8973f).f9019e += size2 - size;
                    o();
                    return removeAll;
                }
                return removeAll;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean removeAll2 = this.f8971c.removeAll(collection);
                if (removeAll2) {
                    int size4 = this.f8971c.size();
                    ((x7.f) this.f8973f).d += size4 - size3;
                    q();
                    return removeAll2;
                }
                return removeAll2;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                size();
                boolean removeAll3 = this.f8971c.removeAll(collection);
                if (removeAll3) {
                    this.f8971c.size();
                    q();
                    return removeAll3;
                }
                return removeAll3;
        }
    }

    @Override
    public final boolean retainAll(Collection collection) {
        switch (this.f8969a) {
            case 0:
                collection.getClass();
                int size = size();
                boolean retainAll = this.f8971c.retainAll(collection);
                if (retainAll) {
                    int size2 = this.f8971c.size();
                    ((v0) this.f8973f).f9019e += size2 - size;
                    o();
                }
                return retainAll;
            case 1:
                collection.getClass();
                int size3 = size();
                boolean retainAll2 = this.f8971c.retainAll(collection);
                if (retainAll2) {
                    int size4 = this.f8971c.size();
                    ((x7.f) this.f8973f).d += size4 - size3;
                    q();
                }
                return retainAll2;
            default:
                collection.getClass();
                size();
                boolean retainAll3 = this.f8971c.retainAll(collection);
                if (retainAll3) {
                    this.f8971c.size();
                    q();
                }
                return retainAll3;
        }
    }

    @Override
    public final Object set(int i10, Object obj) {
        switch (this.f8969a) {
            case 0:
                n();
                return ((List) this.f8971c).set(i10, obj);
            case 1:
                zzb();
                return ((List) this.f8971c).set(i10, obj);
            default:
                zzb();
                return ((List) this.f8971c).set(i10, obj);
        }
    }

    @Override
    public final int size() {
        switch (this.f8969a) {
            case 0:
                n();
                return this.f8971c.size();
            case 1:
                zzb();
                return this.f8971c.size();
            default:
                zzb();
                return this.f8971c.size();
        }
    }

    @Override
    public final List subList(int i10, int i11) {
        switch (this.f8969a) {
            case 0:
                n();
                v0 v0Var = (v0) this.h;
                List subList = ((List) this.f8971c).subList(i10, i11);
                l lVar = (l) this.f8972e;
                if (lVar == null) {
                    lVar = this;
                }
                boolean z10 = subList instanceof RandomAccess;
                Object obj = this.f8970b;
                if (z10) {
                    return new l(v0Var, obj, subList, lVar);
                }
                return new l(v0Var, obj, subList, lVar);
            case 1:
                zzb();
                x7.f fVar = (x7.f) this.h;
                List subList2 = ((List) this.f8971c).subList(i10, i11);
                l lVar2 = (l) this.f8972e;
                if (lVar2 == null) {
                    lVar2 = this;
                }
                boolean z11 = subList2 instanceof RandomAccess;
                Object obj2 = this.f8970b;
                if (z11) {
                    return new l(fVar, obj2, subList2, lVar2);
                }
                return new l(fVar, obj2, subList2, lVar2);
            default:
                zzb();
                List subList3 = ((List) this.f8971c).subList(i10, i11);
                l lVar3 = (l) this.f8972e;
                if (lVar3 == null) {
                    lVar3 = this;
                }
                lg lgVar = (lg) this.h;
                boolean z12 = subList3 instanceof RandomAccess;
                Object obj3 = this.f8970b;
                if (z12) {
                    return new l(lgVar, obj3, subList3, lVar3);
                }
                return new l(lgVar, obj3, subList3, lVar3);
        }
    }

    @Override
    public final String toString() {
        switch (this.f8969a) {
            case 0:
                n();
                return this.f8971c.toString();
            case 1:
                zzb();
                return this.f8971c.toString();
            default:
                zzb();
                return this.f8971c.toString();
        }
    }

    public void zzb() {
        Collection collection;
        switch (this.f8969a) {
            case 1:
                l lVar = (l) this.f8972e;
                if (lVar != null) {
                    lVar.zzb();
                    if (lVar.f8971c != this.d) {
                        throw new ConcurrentModificationException();
                    }
                    return;
                } else if (this.f8971c.isEmpty() && (collection = (Collection) ((x7.f) this.f8973f).f48977c.get(this.f8970b)) != null) {
                    this.f8971c = collection;
                    return;
                } else {
                    return;
                }
            default:
                l lVar2 = (l) this.f8972e;
                if (lVar2 != null) {
                    lVar2.zzb();
                    if (lVar2.f8971c != this.d) {
                        throw new ConcurrentModificationException();
                    }
                    return;
                } else if (this.f8971c.isEmpty()) {
                    Collection collection2 = (Collection) ((lg) this.f8973f).f51158c.get(this.f8970b);
                    if (collection2 != null) {
                        this.f8971c = collection2;
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }

    public l(lg lgVar, Object obj, List list, l lVar) {
        this.h = lgVar;
        this.f8973f = lgVar;
        this.f8970b = obj;
        this.f8971c = list;
        this.f8972e = lVar;
        this.d = lVar == null ? null : lVar.f8971c;
    }

    public l(v0 v0Var, Object obj, List list, l lVar) {
        this.h = v0Var;
        this.f8973f = v0Var;
        this.f8970b = obj;
        this.f8971c = list;
        this.f8972e = lVar;
        this.d = lVar == null ? null : lVar.f8971c;
    }

    @Override
    public final ListIterator listIterator(int i10) {
        switch (this.f8969a) {
            case 0:
                n();
                return new k(this, i10);
            case 1:
                zzb();
                return new x7.c(this, i10);
            default:
                zzb();
                return new bg(this, i10);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f8969a) {
            case 0:
                n();
                boolean remove = this.f8971c.remove(obj);
                if (remove) {
                    v0 v0Var = (v0) this.f8973f;
                    v0Var.f9019e--;
                    o();
                }
                return remove;
            case 1:
                zzb();
                boolean remove2 = this.f8971c.remove(obj);
                if (remove2) {
                    x7.f fVar = (x7.f) this.f8973f;
                    fVar.d--;
                    q();
                }
                return remove2;
            default:
                zzb();
                boolean remove3 = this.f8971c.remove(obj);
                if (remove3) {
                    q();
                }
                return remove3;
        }
    }

    @Override
    public final boolean add(Object obj) {
        switch (this.f8969a) {
            case 0:
                n();
                boolean isEmpty = this.f8971c.isEmpty();
                boolean add = this.f8971c.add(obj);
                if (add) {
                    ((v0) this.f8973f).f9019e++;
                    if (isEmpty) {
                        i();
                    }
                }
                return add;
            case 1:
                zzb();
                boolean isEmpty2 = this.f8971c.isEmpty();
                boolean add2 = this.f8971c.add(obj);
                if (add2) {
                    ((x7.f) this.f8973f).d++;
                    if (isEmpty2) {
                        p();
                        return true;
                    }
                    return add2;
                }
                return add2;
            default:
                zzb();
                boolean isEmpty3 = this.f8971c.isEmpty();
                boolean add3 = this.f8971c.add(obj);
                if (add3 && isEmpty3) {
                    p();
                    return true;
                }
                return add3;
        }
    }

    @Override
    public final boolean addAll(Collection collection) {
        switch (this.f8969a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean addAll = this.f8971c.addAll(collection);
                if (addAll) {
                    int size2 = this.f8971c.size();
                    ((v0) this.f8973f).f9019e += size2 - size;
                    if (size == 0) {
                        i();
                        return addAll;
                    }
                    return addAll;
                }
                return addAll;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean addAll2 = this.f8971c.addAll(collection);
                if (addAll2) {
                    int size4 = this.f8971c.size();
                    ((x7.f) this.f8973f).d += size4 - size3;
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
                int size5 = size();
                boolean addAll3 = this.f8971c.addAll(collection);
                if (addAll3) {
                    this.f8971c.size();
                    if (size5 == 0) {
                        p();
                        return true;
                    }
                    return addAll3;
                }
                return addAll3;
        }
    }
}
