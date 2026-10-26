package a8;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
public class dh extends AbstractCollection implements List {
    public final int f410a = 0;
    public final Object f411b;
    public Collection f412c;
    public final Collection d;
    public final AbstractCollection e;
    public final Serializable f413f;
    public final Serializable h;

    public dh(gh ghVar, Object obj, List list, dh dhVar) {
        this.h = ghVar;
        this.f413f = ghVar;
        this.f411b = obj;
        this.f412c = list;
        this.e = dhVar;
        this.d = dhVar == null ? null : dhVar.f412c;
    }

    @Override
    public final void add(int i10, Object obj) {
        switch (this.f410a) {
            case 0:
                zzb();
                boolean isEmpty = this.f412c.isEmpty();
                ((List) this.f412c).add(i10, obj);
                if (isEmpty) {
                    o();
                    return;
                }
                return;
            case 1:
                m();
                boolean isEmpty2 = this.f412c.isEmpty();
                ((List) this.f412c).add(i10, obj);
                ((f9.k1) this.h).f10293f++;
                if (isEmpty2) {
                    h();
                    return;
                }
                return;
            default:
                zzb();
                boolean isEmpty3 = this.f412c.isEmpty();
                ((List) this.f412c).add(i10, obj);
                ((y7.e) this.h).d++;
                if (isEmpty3) {
                    o();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean addAll(int i10, Collection collection) {
        switch (this.f410a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean addAll = ((List) this.f412c).addAll(i10, collection);
                if (addAll) {
                    this.f412c.size();
                    if (size == 0) {
                        o();
                        return true;
                    }
                    return addAll;
                }
                return addAll;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                int size2 = size();
                boolean addAll2 = ((List) this.f412c).addAll(i10, collection);
                if (addAll2) {
                    int size3 = this.f412c.size();
                    ((f9.k1) this.h).f10293f += size3 - size2;
                    if (size2 == 0) {
                        h();
                        return addAll2;
                    }
                    return addAll2;
                }
                return addAll2;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size4 = size();
                boolean addAll3 = ((List) this.f412c).addAll(i10, collection);
                if (addAll3) {
                    int size5 = this.f412c.size();
                    ((y7.e) this.h).d += size5 - size4;
                    if (size4 == 0) {
                        o();
                        return true;
                    }
                    return addAll3;
                }
                return addAll3;
        }
    }

    @Override
    public final void clear() {
        switch (this.f410a) {
            case 0:
                if (size() != 0) {
                    this.f412c.clear();
                    p();
                    return;
                }
                return;
            case 1:
                int size = size();
                if (size != 0) {
                    this.f412c.clear();
                    ((f9.k1) this.f413f).f10293f -= size;
                    n();
                    return;
                }
                return;
            default:
                int size2 = size();
                if (size2 != 0) {
                    this.f412c.clear();
                    ((y7.e) this.f413f).d -= size2;
                    p();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f410a) {
            case 0:
                zzb();
                return this.f412c.contains(obj);
            case 1:
                m();
                return this.f412c.contains(obj);
            default:
                zzb();
                return this.f412c.contains(obj);
        }
    }

    @Override
    public final boolean containsAll(Collection collection) {
        switch (this.f410a) {
            case 0:
                zzb();
                return this.f412c.containsAll(collection);
            case 1:
                m();
                return this.f412c.containsAll(collection);
            default:
                zzb();
                return this.f412c.containsAll(collection);
        }
    }

    @Override
    public final boolean equals(Object obj) {
        switch (this.f410a) {
            case 0:
                if (obj == this) {
                    return true;
                }
                zzb();
                return this.f412c.equals(obj);
            case 1:
                if (obj == this) {
                    return true;
                }
                m();
                return this.f412c.equals(obj);
            default:
                if (obj == this) {
                    return true;
                }
                zzb();
                return this.f412c.equals(obj);
        }
    }

    @Override
    public final Object get(int i10) {
        switch (this.f410a) {
            case 0:
                zzb();
                return ((List) this.f412c).get(i10);
            case 1:
                m();
                return ((List) this.f412c).get(i10);
            default:
                zzb();
                return ((List) this.f412c).get(i10);
        }
    }

    public void h() {
        dh dhVar = (dh) this.e;
        if (dhVar != null) {
            dhVar.h();
        } else {
            ((f9.k1) this.f413f).e.put(this.f411b, this.f412c);
        }
    }

    @Override
    public final int hashCode() {
        switch (this.f410a) {
            case 0:
                zzb();
                return this.f412c.hashCode();
            case 1:
                m();
                return this.f412c.hashCode();
            default:
                zzb();
                return this.f412c.hashCode();
        }
    }

    @Override
    public final int indexOf(Object obj) {
        switch (this.f410a) {
            case 0:
                zzb();
                return ((List) this.f412c).indexOf(obj);
            case 1:
                m();
                return ((List) this.f412c).indexOf(obj);
            default:
                zzb();
                return ((List) this.f412c).indexOf(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f410a) {
            case 0:
                zzb();
                return new ta(this);
            case 1:
                m();
                return new ta(this, (byte) 0);
            default:
                zzb();
                return new ta(this, (char) 0);
        }
    }

    @Override
    public final int lastIndexOf(Object obj) {
        switch (this.f410a) {
            case 0:
                zzb();
                return ((List) this.f412c).lastIndexOf(obj);
            case 1:
                m();
                return ((List) this.f412c).lastIndexOf(obj);
            default:
                zzb();
                return ((List) this.f412c).lastIndexOf(obj);
        }
    }

    @Override
    public final ListIterator listIterator() {
        switch (this.f410a) {
            case 0:
                zzb();
                return new ug(this);
            case 1:
                m();
                return new f9.j(this);
            default:
                zzb();
                return new y7.c(this);
        }
    }

    public void m() {
        Collection collection;
        dh dhVar = (dh) this.e;
        if (dhVar != null) {
            dhVar.m();
            if (dhVar.f412c != this.d) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f412c.isEmpty() && (collection = (Collection) ((f9.k1) this.f413f).e.get(this.f411b)) != null) {
            this.f412c = collection;
        }
    }

    public void n() {
        dh dhVar = (dh) this.e;
        if (dhVar != null) {
            dhVar.n();
        } else if (this.f412c.isEmpty()) {
            ((f9.k1) this.f413f).e.remove(this.f411b);
        }
    }

    public void o() {
        switch (this.f410a) {
            case 0:
                dh dhVar = (dh) this.e;
                if (dhVar != null) {
                    dhVar.o();
                    return;
                }
                ((gh) this.f413f).f508c.put(this.f411b, this.f412c);
                return;
            default:
                dh dhVar2 = (dh) this.e;
                if (dhVar2 != null) {
                    dhVar2.o();
                    return;
                } else {
                    ((y7.e) this.f413f).f52124c.put(this.f411b, this.f412c);
                    return;
                }
        }
    }

    public void p() {
        switch (this.f410a) {
            case 0:
                dh dhVar = (dh) this.e;
                if (dhVar != null) {
                    dhVar.p();
                    return;
                } else if (this.f412c.isEmpty()) {
                    ((gh) this.f413f).f508c.remove(this.f411b);
                    return;
                } else {
                    return;
                }
            default:
                dh dhVar2 = (dh) this.e;
                if (dhVar2 != null) {
                    dhVar2.p();
                    return;
                } else if (this.f412c.isEmpty()) {
                    ((y7.e) this.f413f).f52124c.remove(this.f411b);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public final Object remove(int i10) {
        switch (this.f410a) {
            case 0:
                zzb();
                Object remove = ((List) this.f412c).remove(i10);
                p();
                return remove;
            case 1:
                m();
                Object remove2 = ((List) this.f412c).remove(i10);
                f9.k1 k1Var = (f9.k1) this.h;
                k1Var.f10293f--;
                n();
                return remove2;
            default:
                zzb();
                Object remove3 = ((List) this.f412c).remove(i10);
                y7.e eVar = (y7.e) this.h;
                eVar.d--;
                p();
                return remove3;
        }
    }

    @Override
    public final boolean removeAll(Collection collection) {
        switch (this.f410a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                size();
                boolean removeAll = this.f412c.removeAll(collection);
                if (removeAll) {
                    this.f412c.size();
                    p();
                    return removeAll;
                }
                return removeAll;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean removeAll2 = this.f412c.removeAll(collection);
                if (removeAll2) {
                    int size2 = this.f412c.size();
                    ((f9.k1) this.f413f).f10293f += size2 - size;
                    n();
                    return removeAll2;
                }
                return removeAll2;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean removeAll3 = this.f412c.removeAll(collection);
                if (removeAll3) {
                    int size4 = this.f412c.size();
                    ((y7.e) this.f413f).d += size4 - size3;
                    p();
                    return removeAll3;
                }
                return removeAll3;
        }
    }

    @Override
    public final boolean retainAll(Collection collection) {
        switch (this.f410a) {
            case 0:
                collection.getClass();
                size();
                boolean retainAll = this.f412c.retainAll(collection);
                if (retainAll) {
                    this.f412c.size();
                    p();
                }
                return retainAll;
            case 1:
                collection.getClass();
                int size = size();
                boolean retainAll2 = this.f412c.retainAll(collection);
                if (retainAll2) {
                    int size2 = this.f412c.size();
                    ((f9.k1) this.f413f).f10293f += size2 - size;
                    n();
                }
                return retainAll2;
            default:
                collection.getClass();
                int size3 = size();
                boolean retainAll3 = this.f412c.retainAll(collection);
                if (retainAll3) {
                    int size4 = this.f412c.size();
                    ((y7.e) this.f413f).d += size4 - size3;
                    p();
                }
                return retainAll3;
        }
    }

    @Override
    public final Object set(int i10, Object obj) {
        switch (this.f410a) {
            case 0:
                zzb();
                return ((List) this.f412c).set(i10, obj);
            case 1:
                m();
                return ((List) this.f412c).set(i10, obj);
            default:
                zzb();
                return ((List) this.f412c).set(i10, obj);
        }
    }

    @Override
    public final int size() {
        switch (this.f410a) {
            case 0:
                zzb();
                return this.f412c.size();
            case 1:
                m();
                return this.f412c.size();
            default:
                zzb();
                return this.f412c.size();
        }
    }

    @Override
    public final List subList(int i10, int i11) {
        switch (this.f410a) {
            case 0:
                zzb();
                List subList = ((List) this.f412c).subList(i10, i11);
                dh dhVar = (dh) this.e;
                if (dhVar == null) {
                    dhVar = this;
                }
                gh ghVar = (gh) this.h;
                boolean z10 = subList instanceof RandomAccess;
                Object obj = this.f411b;
                if (z10) {
                    return new dh(ghVar, obj, subList, dhVar);
                }
                return new dh(ghVar, obj, subList, dhVar);
            case 1:
                m();
                f9.k1 k1Var = (f9.k1) this.h;
                List subList2 = ((List) this.f412c).subList(i10, i11);
                dh dhVar2 = (dh) this.e;
                if (dhVar2 == null) {
                    dhVar2 = this;
                }
                boolean z11 = subList2 instanceof RandomAccess;
                Object obj2 = this.f411b;
                if (z11) {
                    return new dh(k1Var, obj2, subList2, dhVar2);
                }
                return new dh(k1Var, obj2, subList2, dhVar2);
            default:
                zzb();
                y7.e eVar = (y7.e) this.h;
                List subList3 = ((List) this.f412c).subList(i10, i11);
                dh dhVar3 = (dh) this.e;
                if (dhVar3 == null) {
                    dhVar3 = this;
                }
                boolean z12 = subList3 instanceof RandomAccess;
                Object obj3 = this.f411b;
                if (z12) {
                    return new dh(eVar, obj3, subList3, dhVar3);
                }
                return new dh(eVar, obj3, subList3, dhVar3);
        }
    }

    @Override
    public final String toString() {
        switch (this.f410a) {
            case 0:
                zzb();
                return this.f412c.toString();
            case 1:
                m();
                return this.f412c.toString();
            default:
                zzb();
                return this.f412c.toString();
        }
    }

    public void zzb() {
        Collection collection;
        switch (this.f410a) {
            case 0:
                dh dhVar = (dh) this.e;
                if (dhVar != null) {
                    dhVar.zzb();
                    if (dhVar.f412c != this.d) {
                        throw new ConcurrentModificationException();
                    }
                    return;
                } else if (this.f412c.isEmpty()) {
                    Collection collection2 = (Collection) ((gh) this.f413f).f508c.get(this.f411b);
                    if (collection2 != null) {
                        this.f412c = collection2;
                        return;
                    }
                    return;
                } else {
                    return;
                }
            default:
                dh dhVar2 = (dh) this.e;
                if (dhVar2 != null) {
                    dhVar2.zzb();
                    if (dhVar2.f412c != this.d) {
                        throw new ConcurrentModificationException();
                    }
                    return;
                } else if (this.f412c.isEmpty() && (collection = (Collection) ((y7.e) this.f413f).f52124c.get(this.f411b)) != null) {
                    this.f412c = collection;
                    return;
                } else {
                    return;
                }
        }
    }

    public dh(y7.e eVar, Object obj, List list, dh dhVar) {
        this.h = eVar;
        this.f413f = eVar;
        this.f411b = obj;
        this.f412c = list;
        this.e = dhVar;
        this.d = dhVar == null ? null : dhVar.f412c;
    }

    public dh(f9.k1 k1Var, Object obj, List list, dh dhVar) {
        this.h = k1Var;
        this.f413f = k1Var;
        this.f411b = obj;
        this.f412c = list;
        this.e = dhVar;
        this.d = dhVar == null ? null : dhVar.f412c;
    }

    @Override
    public final ListIterator listIterator(int i10) {
        switch (this.f410a) {
            case 0:
                zzb();
                return new ug(this, i10);
            case 1:
                m();
                return new f9.j(this, i10);
            default:
                zzb();
                return new y7.c(this, i10);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f410a) {
            case 0:
                zzb();
                boolean remove = this.f412c.remove(obj);
                if (remove) {
                    p();
                }
                return remove;
            case 1:
                m();
                boolean remove2 = this.f412c.remove(obj);
                if (remove2) {
                    f9.k1 k1Var = (f9.k1) this.f413f;
                    k1Var.f10293f--;
                    n();
                }
                return remove2;
            default:
                zzb();
                boolean remove3 = this.f412c.remove(obj);
                if (remove3) {
                    y7.e eVar = (y7.e) this.f413f;
                    eVar.d--;
                    p();
                }
                return remove3;
        }
    }

    @Override
    public final boolean add(Object obj) {
        switch (this.f410a) {
            case 0:
                zzb();
                boolean isEmpty = this.f412c.isEmpty();
                boolean add = this.f412c.add(obj);
                if (add && isEmpty) {
                    o();
                    return true;
                }
                return add;
            case 1:
                m();
                boolean isEmpty2 = this.f412c.isEmpty();
                boolean add2 = this.f412c.add(obj);
                if (add2) {
                    ((f9.k1) this.f413f).f10293f++;
                    if (isEmpty2) {
                        h();
                    }
                }
                return add2;
            default:
                zzb();
                boolean isEmpty3 = this.f412c.isEmpty();
                boolean add3 = this.f412c.add(obj);
                if (add3) {
                    ((y7.e) this.f413f).d++;
                    if (isEmpty3) {
                        o();
                        return true;
                    }
                    return add3;
                }
                return add3;
        }
    }

    @Override
    public final boolean addAll(Collection collection) {
        switch (this.f410a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean addAll = this.f412c.addAll(collection);
                if (addAll) {
                    this.f412c.size();
                    if (size == 0) {
                        o();
                        return true;
                    }
                    return addAll;
                }
                return addAll;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                int size2 = size();
                boolean addAll2 = this.f412c.addAll(collection);
                if (addAll2) {
                    int size3 = this.f412c.size();
                    ((f9.k1) this.f413f).f10293f += size3 - size2;
                    if (size2 == 0) {
                        h();
                        return addAll2;
                    }
                    return addAll2;
                }
                return addAll2;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size4 = size();
                boolean addAll3 = this.f412c.addAll(collection);
                if (addAll3) {
                    int size5 = this.f412c.size();
                    ((y7.e) this.f413f).d += size5 - size4;
                    if (size4 == 0) {
                        o();
                        return true;
                    }
                    return addAll3;
                }
                return addAll3;
        }
    }
}
