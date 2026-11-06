package a8;

import c8.jg;
import c8.zf;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
public class f extends AbstractCollection implements List {
    public final int f386a = 0;
    public final Object f387b;
    public Collection f388c;
    public final Collection d;
    public final AbstractCollection f389e;
    public final Serializable f390f;
    public final Serializable h;

    public f(i iVar, Object obj, List list, f fVar) {
        this.h = iVar;
        this.f390f = iVar;
        this.f387b = obj;
        this.f388c = list;
        this.f389e = fVar;
        this.d = fVar == null ? null : fVar.f388c;
    }

    @Override
    public final boolean add(Object obj) {
        switch (this.f386a) {
            case 0:
                zzb();
                boolean isEmpty = this.f388c.isEmpty();
                boolean add = this.f388c.add(obj);
                if (add) {
                    ((i) this.f390f).d++;
                    if (isEmpty) {
                        k();
                        return true;
                    }
                    return add;
                }
                return add;
            case 1:
                zzb();
                boolean isEmpty2 = this.f388c.isEmpty();
                boolean add2 = this.f388c.add(obj);
                if (add2 && isEmpty2) {
                    k();
                    return true;
                }
                return add2;
            default:
                i();
                boolean isEmpty3 = this.f388c.isEmpty();
                boolean add3 = this.f388c.add(obj);
                if (add3) {
                    ((h9.l1) this.f390f).f14346f++;
                    if (isEmpty3) {
                        f();
                    }
                }
                return add3;
        }
    }

    @Override
    public final boolean addAll(Collection collection) {
        switch (this.f386a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean addAll = this.f388c.addAll(collection);
                if (addAll) {
                    int size2 = this.f388c.size();
                    ((i) this.f390f).d += size2 - size;
                    if (size == 0) {
                        k();
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
                boolean addAll2 = this.f388c.addAll(collection);
                if (addAll2) {
                    this.f388c.size();
                    if (size3 == 0) {
                        k();
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
                boolean addAll3 = this.f388c.addAll(collection);
                if (addAll3) {
                    int size5 = this.f388c.size();
                    ((h9.l1) this.f390f).f14346f += size5 - size4;
                    if (size4 == 0) {
                        f();
                        return addAll3;
                    }
                    return addAll3;
                }
                return addAll3;
        }
    }

    @Override
    public final void clear() {
        switch (this.f386a) {
            case 0:
                int size = size();
                if (size != 0) {
                    this.f388c.clear();
                    ((i) this.f390f).d -= size;
                    l();
                    return;
                }
                return;
            case 1:
                if (size() != 0) {
                    this.f388c.clear();
                    l();
                    return;
                }
                return;
            default:
                int size2 = size();
                if (size2 != 0) {
                    this.f388c.clear();
                    ((h9.l1) this.f390f).f14346f -= size2;
                    j();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f386a) {
            case 0:
                zzb();
                return this.f388c.contains(obj);
            case 1:
                zzb();
                return this.f388c.contains(obj);
            default:
                i();
                return this.f388c.contains(obj);
        }
    }

    @Override
    public final boolean containsAll(Collection collection) {
        switch (this.f386a) {
            case 0:
                zzb();
                return this.f388c.containsAll(collection);
            case 1:
                zzb();
                return this.f388c.containsAll(collection);
            default:
                i();
                return this.f388c.containsAll(collection);
        }
    }

    @Override
    public final boolean equals(Object obj) {
        switch (this.f386a) {
            case 0:
                if (obj == this) {
                    return true;
                }
                zzb();
                return this.f388c.equals(obj);
            case 1:
                if (obj == this) {
                    return true;
                }
                zzb();
                return this.f388c.equals(obj);
            default:
                if (obj == this) {
                    return true;
                }
                i();
                return this.f388c.equals(obj);
        }
    }

    public void f() {
        f fVar = (f) this.f389e;
        if (fVar != null) {
            fVar.f();
        } else {
            ((h9.l1) this.f390f).f14345e.put(this.f387b, this.f388c);
        }
    }

    @Override
    public final Object get(int i7) {
        switch (this.f386a) {
            case 0:
                zzb();
                return ((List) this.f388c).get(i7);
            case 1:
                zzb();
                return ((List) this.f388c).get(i7);
            default:
                i();
                return ((List) this.f388c).get(i7);
        }
    }

    @Override
    public final int hashCode() {
        switch (this.f386a) {
            case 0:
                zzb();
                return this.f388c.hashCode();
            case 1:
                zzb();
                return this.f388c.hashCode();
            default:
                i();
                return this.f388c.hashCode();
        }
    }

    public void i() {
        Collection collection;
        f fVar = (f) this.f389e;
        if (fVar != null) {
            fVar.i();
            if (fVar.f388c != this.d) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f388c.isEmpty() && (collection = (Collection) ((h9.l1) this.f390f).f14345e.get(this.f387b)) != null) {
            this.f388c = collection;
        }
    }

    @Override
    public final int indexOf(Object obj) {
        switch (this.f386a) {
            case 0:
                zzb();
                return ((List) this.f388c).indexOf(obj);
            case 1:
                zzb();
                return ((List) this.f388c).indexOf(obj);
            default:
                i();
                return ((List) this.f388c).indexOf(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f386a) {
            case 0:
                zzb();
                return new d(this);
            case 1:
                zzb();
                return new d(this, (byte) 0);
            default:
                i();
                return new d(this, (char) 0);
        }
    }

    public void j() {
        f fVar = (f) this.f389e;
        if (fVar != null) {
            fVar.j();
        } else if (this.f388c.isEmpty()) {
            ((h9.l1) this.f390f).f14345e.remove(this.f387b);
        }
    }

    public void k() {
        switch (this.f386a) {
            case 0:
                f fVar = (f) this.f389e;
                if (fVar != null) {
                    fVar.k();
                    return;
                } else {
                    ((i) this.f390f).f482c.put(this.f387b, this.f388c);
                    return;
                }
            default:
                f fVar2 = (f) this.f389e;
                if (fVar2 != null) {
                    fVar2.k();
                    return;
                }
                ((jg) this.f390f).f5738c.put(this.f387b, this.f388c);
                return;
        }
    }

    public void l() {
        switch (this.f386a) {
            case 0:
                f fVar = (f) this.f389e;
                if (fVar != null) {
                    fVar.l();
                    return;
                } else if (this.f388c.isEmpty()) {
                    ((i) this.f390f).f482c.remove(this.f387b);
                    return;
                } else {
                    return;
                }
            default:
                f fVar2 = (f) this.f389e;
                if (fVar2 != null) {
                    fVar2.l();
                    return;
                } else if (this.f388c.isEmpty()) {
                    ((jg) this.f390f).f5738c.remove(this.f387b);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public final int lastIndexOf(Object obj) {
        switch (this.f386a) {
            case 0:
                zzb();
                return ((List) this.f388c).lastIndexOf(obj);
            case 1:
                zzb();
                return ((List) this.f388c).lastIndexOf(obj);
            default:
                i();
                return ((List) this.f388c).lastIndexOf(obj);
        }
    }

    @Override
    public final ListIterator listIterator() {
        switch (this.f386a) {
            case 0:
                zzb();
                return new e(this);
            case 1:
                zzb();
                return new zf(this);
            default:
                i();
                return new h9.j(this);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f386a) {
            case 0:
                zzb();
                boolean remove = this.f388c.remove(obj);
                if (remove) {
                    i iVar = (i) this.f390f;
                    iVar.d--;
                    l();
                }
                return remove;
            case 1:
                zzb();
                boolean remove2 = this.f388c.remove(obj);
                if (remove2) {
                    l();
                }
                return remove2;
            default:
                i();
                boolean remove3 = this.f388c.remove(obj);
                if (remove3) {
                    h9.l1 l1Var = (h9.l1) this.f390f;
                    l1Var.f14346f--;
                    j();
                }
                return remove3;
        }
    }

    @Override
    public final boolean removeAll(Collection collection) {
        switch (this.f386a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean removeAll = this.f388c.removeAll(collection);
                if (removeAll) {
                    int size2 = this.f388c.size();
                    ((i) this.f390f).d += size2 - size;
                    l();
                    return removeAll;
                }
                return removeAll;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                size();
                boolean removeAll2 = this.f388c.removeAll(collection);
                if (removeAll2) {
                    this.f388c.size();
                    l();
                    return removeAll2;
                }
                return removeAll2;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean removeAll3 = this.f388c.removeAll(collection);
                if (removeAll3) {
                    int size4 = this.f388c.size();
                    ((h9.l1) this.f390f).f14346f += size4 - size3;
                    j();
                    return removeAll3;
                }
                return removeAll3;
        }
    }

    @Override
    public final boolean retainAll(Collection collection) {
        switch (this.f386a) {
            case 0:
                collection.getClass();
                int size = size();
                boolean retainAll = this.f388c.retainAll(collection);
                if (retainAll) {
                    int size2 = this.f388c.size();
                    ((i) this.f390f).d += size2 - size;
                    l();
                }
                return retainAll;
            case 1:
                collection.getClass();
                size();
                boolean retainAll2 = this.f388c.retainAll(collection);
                if (retainAll2) {
                    this.f388c.size();
                    l();
                }
                return retainAll2;
            default:
                collection.getClass();
                int size3 = size();
                boolean retainAll3 = this.f388c.retainAll(collection);
                if (retainAll3) {
                    int size4 = this.f388c.size();
                    ((h9.l1) this.f390f).f14346f += size4 - size3;
                    j();
                }
                return retainAll3;
        }
    }

    @Override
    public final Object set(int i7, Object obj) {
        switch (this.f386a) {
            case 0:
                zzb();
                return ((List) this.f388c).set(i7, obj);
            case 1:
                zzb();
                return ((List) this.f388c).set(i7, obj);
            default:
                i();
                return ((List) this.f388c).set(i7, obj);
        }
    }

    @Override
    public final int size() {
        switch (this.f386a) {
            case 0:
                zzb();
                return this.f388c.size();
            case 1:
                zzb();
                return this.f388c.size();
            default:
                i();
                return this.f388c.size();
        }
    }

    @Override
    public final List subList(int i7, int i10) {
        switch (this.f386a) {
            case 0:
                zzb();
                i iVar = (i) this.h;
                List subList = ((List) this.f388c).subList(i7, i10);
                f fVar = (f) this.f389e;
                if (fVar == null) {
                    fVar = this;
                }
                boolean z9 = subList instanceof RandomAccess;
                Object obj = this.f387b;
                if (z9) {
                    return new f(iVar, obj, subList, fVar);
                }
                return new f(iVar, obj, subList, fVar);
            case 1:
                zzb();
                List subList2 = ((List) this.f388c).subList(i7, i10);
                f fVar2 = (f) this.f389e;
                if (fVar2 == null) {
                    fVar2 = this;
                }
                jg jgVar = (jg) this.h;
                boolean z10 = subList2 instanceof RandomAccess;
                Object obj2 = this.f387b;
                if (z10) {
                    return new f(jgVar, obj2, subList2, fVar2);
                }
                return new f(jgVar, obj2, subList2, fVar2);
            default:
                i();
                h9.l1 l1Var = (h9.l1) this.h;
                List subList3 = ((List) this.f388c).subList(i7, i10);
                f fVar3 = (f) this.f389e;
                if (fVar3 == null) {
                    fVar3 = this;
                }
                boolean z11 = subList3 instanceof RandomAccess;
                Object obj3 = this.f387b;
                if (z11) {
                    return new f(l1Var, obj3, subList3, fVar3);
                }
                return new f(l1Var, obj3, subList3, fVar3);
        }
    }

    @Override
    public final String toString() {
        switch (this.f386a) {
            case 0:
                zzb();
                return this.f388c.toString();
            case 1:
                zzb();
                return this.f388c.toString();
            default:
                i();
                return this.f388c.toString();
        }
    }

    public void zzb() {
        Collection collection;
        switch (this.f386a) {
            case 0:
                f fVar = (f) this.f389e;
                if (fVar != null) {
                    fVar.zzb();
                    if (fVar.f388c != this.d) {
                        throw new ConcurrentModificationException();
                    }
                    return;
                } else if (this.f388c.isEmpty() && (collection = (Collection) ((i) this.f390f).f482c.get(this.f387b)) != null) {
                    this.f388c = collection;
                    return;
                } else {
                    return;
                }
            default:
                f fVar2 = (f) this.f389e;
                if (fVar2 != null) {
                    fVar2.zzb();
                    if (fVar2.f388c != this.d) {
                        throw new ConcurrentModificationException();
                    }
                    return;
                } else if (this.f388c.isEmpty()) {
                    Collection collection2 = (Collection) ((jg) this.f390f).f5738c.get(this.f387b);
                    if (collection2 != null) {
                        this.f388c = collection2;
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }

    public f(jg jgVar, Object obj, List list, f fVar) {
        this.h = jgVar;
        this.f390f = jgVar;
        this.f387b = obj;
        this.f388c = list;
        this.f389e = fVar;
        this.d = fVar == null ? null : fVar.f388c;
    }

    public f(h9.l1 l1Var, Object obj, List list, f fVar) {
        this.h = l1Var;
        this.f390f = l1Var;
        this.f387b = obj;
        this.f388c = list;
        this.f389e = fVar;
        this.d = fVar == null ? null : fVar.f388c;
    }

    @Override
    public final ListIterator listIterator(int i7) {
        switch (this.f386a) {
            case 0:
                zzb();
                return new e(this, i7);
            case 1:
                zzb();
                return new zf(this, i7);
            default:
                i();
                return new h9.j(this, i7);
        }
    }

    @Override
    public final Object remove(int i7) {
        switch (this.f386a) {
            case 0:
                zzb();
                Object remove = ((List) this.f388c).remove(i7);
                i iVar = (i) this.h;
                iVar.d--;
                l();
                return remove;
            case 1:
                zzb();
                Object remove2 = ((List) this.f388c).remove(i7);
                l();
                return remove2;
            default:
                i();
                Object remove3 = ((List) this.f388c).remove(i7);
                h9.l1 l1Var = (h9.l1) this.h;
                l1Var.f14346f--;
                j();
                return remove3;
        }
    }

    @Override
    public final void add(int i7, Object obj) {
        switch (this.f386a) {
            case 0:
                zzb();
                boolean isEmpty = this.f388c.isEmpty();
                ((List) this.f388c).add(i7, obj);
                ((i) this.h).d++;
                if (isEmpty) {
                    k();
                    return;
                }
                return;
            case 1:
                zzb();
                boolean isEmpty2 = this.f388c.isEmpty();
                ((List) this.f388c).add(i7, obj);
                if (isEmpty2) {
                    k();
                    return;
                }
                return;
            default:
                i();
                boolean isEmpty3 = this.f388c.isEmpty();
                ((List) this.f388c).add(i7, obj);
                ((h9.l1) this.h).f14346f++;
                if (isEmpty3) {
                    f();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean addAll(int i7, Collection collection) {
        switch (this.f386a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean addAll = ((List) this.f388c).addAll(i7, collection);
                if (addAll) {
                    int size2 = this.f388c.size();
                    ((i) this.h).d += size2 - size;
                    if (size == 0) {
                        k();
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
                boolean addAll2 = ((List) this.f388c).addAll(i7, collection);
                if (addAll2) {
                    this.f388c.size();
                    if (size3 == 0) {
                        k();
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
                boolean addAll3 = ((List) this.f388c).addAll(i7, collection);
                if (addAll3) {
                    int size5 = this.f388c.size();
                    ((h9.l1) this.h).f14346f += size5 - size4;
                    if (size4 == 0) {
                        f();
                        return addAll3;
                    }
                    return addAll3;
                }
                return addAll3;
        }
    }
}
