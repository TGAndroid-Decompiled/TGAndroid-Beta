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
    public final int f391a = 0;
    public final Object f392b;
    public Collection f393c;
    public final Collection d;
    public final AbstractCollection f394e;
    public final Serializable f395f;
    public final Serializable h;

    public f(i iVar, Object obj, List list, f fVar) {
        this.h = iVar;
        this.f395f = iVar;
        this.f392b = obj;
        this.f393c = list;
        this.f394e = fVar;
        this.d = fVar == null ? null : fVar.f393c;
    }

    @Override
    public final boolean add(Object obj) {
        switch (this.f391a) {
            case 0:
                zzb();
                boolean isEmpty = this.f393c.isEmpty();
                boolean add = this.f393c.add(obj);
                if (add) {
                    ((i) this.f395f).d++;
                    if (isEmpty) {
                        k();
                        return true;
                    }
                    return add;
                }
                return add;
            case 1:
                zzb();
                boolean isEmpty2 = this.f393c.isEmpty();
                boolean add2 = this.f393c.add(obj);
                if (add2 && isEmpty2) {
                    k();
                    return true;
                }
                return add2;
            default:
                i();
                boolean isEmpty3 = this.f393c.isEmpty();
                boolean add3 = this.f393c.add(obj);
                if (add3) {
                    ((h9.k1) this.f395f).f13695f++;
                    if (isEmpty3) {
                        f();
                    }
                }
                return add3;
        }
    }

    @Override
    public final boolean addAll(Collection collection) {
        switch (this.f391a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean addAll = this.f393c.addAll(collection);
                if (addAll) {
                    int size2 = this.f393c.size();
                    ((i) this.f395f).d += size2 - size;
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
                boolean addAll2 = this.f393c.addAll(collection);
                if (addAll2) {
                    this.f393c.size();
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
                boolean addAll3 = this.f393c.addAll(collection);
                if (addAll3) {
                    int size5 = this.f393c.size();
                    ((h9.k1) this.f395f).f13695f += size5 - size4;
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
        switch (this.f391a) {
            case 0:
                int size = size();
                if (size != 0) {
                    this.f393c.clear();
                    ((i) this.f395f).d -= size;
                    l();
                    return;
                }
                return;
            case 1:
                if (size() != 0) {
                    this.f393c.clear();
                    l();
                    return;
                }
                return;
            default:
                int size2 = size();
                if (size2 != 0) {
                    this.f393c.clear();
                    ((h9.k1) this.f395f).f13695f -= size2;
                    j();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f391a) {
            case 0:
                zzb();
                return this.f393c.contains(obj);
            case 1:
                zzb();
                return this.f393c.contains(obj);
            default:
                i();
                return this.f393c.contains(obj);
        }
    }

    @Override
    public final boolean containsAll(Collection collection) {
        switch (this.f391a) {
            case 0:
                zzb();
                return this.f393c.containsAll(collection);
            case 1:
                zzb();
                return this.f393c.containsAll(collection);
            default:
                i();
                return this.f393c.containsAll(collection);
        }
    }

    @Override
    public final boolean equals(Object obj) {
        switch (this.f391a) {
            case 0:
                if (obj == this) {
                    return true;
                }
                zzb();
                return this.f393c.equals(obj);
            case 1:
                if (obj == this) {
                    return true;
                }
                zzb();
                return this.f393c.equals(obj);
            default:
                if (obj == this) {
                    return true;
                }
                i();
                return this.f393c.equals(obj);
        }
    }

    public void f() {
        f fVar = (f) this.f394e;
        if (fVar != null) {
            fVar.f();
        } else {
            ((h9.k1) this.f395f).f13694e.put(this.f392b, this.f393c);
        }
    }

    @Override
    public final Object get(int i7) {
        switch (this.f391a) {
            case 0:
                zzb();
                return ((List) this.f393c).get(i7);
            case 1:
                zzb();
                return ((List) this.f393c).get(i7);
            default:
                i();
                return ((List) this.f393c).get(i7);
        }
    }

    @Override
    public final int hashCode() {
        switch (this.f391a) {
            case 0:
                zzb();
                return this.f393c.hashCode();
            case 1:
                zzb();
                return this.f393c.hashCode();
            default:
                i();
                return this.f393c.hashCode();
        }
    }

    public void i() {
        Collection collection;
        f fVar = (f) this.f394e;
        if (fVar != null) {
            fVar.i();
            if (fVar.f393c != this.d) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f393c.isEmpty() && (collection = (Collection) ((h9.k1) this.f395f).f13694e.get(this.f392b)) != null) {
            this.f393c = collection;
        }
    }

    @Override
    public final int indexOf(Object obj) {
        switch (this.f391a) {
            case 0:
                zzb();
                return ((List) this.f393c).indexOf(obj);
            case 1:
                zzb();
                return ((List) this.f393c).indexOf(obj);
            default:
                i();
                return ((List) this.f393c).indexOf(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f391a) {
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
        f fVar = (f) this.f394e;
        if (fVar != null) {
            fVar.j();
        } else if (this.f393c.isEmpty()) {
            ((h9.k1) this.f395f).f13694e.remove(this.f392b);
        }
    }

    public void k() {
        switch (this.f391a) {
            case 0:
                f fVar = (f) this.f394e;
                if (fVar != null) {
                    fVar.k();
                    return;
                } else {
                    ((i) this.f395f).f486c.put(this.f392b, this.f393c);
                    return;
                }
            default:
                f fVar2 = (f) this.f394e;
                if (fVar2 != null) {
                    fVar2.k();
                    return;
                }
                ((jg) this.f395f).f4567c.put(this.f392b, this.f393c);
                return;
        }
    }

    public void l() {
        switch (this.f391a) {
            case 0:
                f fVar = (f) this.f394e;
                if (fVar != null) {
                    fVar.l();
                    return;
                } else if (this.f393c.isEmpty()) {
                    ((i) this.f395f).f486c.remove(this.f392b);
                    return;
                } else {
                    return;
                }
            default:
                f fVar2 = (f) this.f394e;
                if (fVar2 != null) {
                    fVar2.l();
                    return;
                } else if (this.f393c.isEmpty()) {
                    ((jg) this.f395f).f4567c.remove(this.f392b);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public final int lastIndexOf(Object obj) {
        switch (this.f391a) {
            case 0:
                zzb();
                return ((List) this.f393c).lastIndexOf(obj);
            case 1:
                zzb();
                return ((List) this.f393c).lastIndexOf(obj);
            default:
                i();
                return ((List) this.f393c).lastIndexOf(obj);
        }
    }

    @Override
    public final ListIterator listIterator() {
        switch (this.f391a) {
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
        switch (this.f391a) {
            case 0:
                zzb();
                boolean remove = this.f393c.remove(obj);
                if (remove) {
                    i iVar = (i) this.f395f;
                    iVar.d--;
                    l();
                }
                return remove;
            case 1:
                zzb();
                boolean remove2 = this.f393c.remove(obj);
                if (remove2) {
                    l();
                }
                return remove2;
            default:
                i();
                boolean remove3 = this.f393c.remove(obj);
                if (remove3) {
                    h9.k1 k1Var = (h9.k1) this.f395f;
                    k1Var.f13695f--;
                    j();
                }
                return remove3;
        }
    }

    @Override
    public final boolean removeAll(Collection collection) {
        switch (this.f391a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean removeAll = this.f393c.removeAll(collection);
                if (removeAll) {
                    int size2 = this.f393c.size();
                    ((i) this.f395f).d += size2 - size;
                    l();
                    return removeAll;
                }
                return removeAll;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                size();
                boolean removeAll2 = this.f393c.removeAll(collection);
                if (removeAll2) {
                    this.f393c.size();
                    l();
                    return removeAll2;
                }
                return removeAll2;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean removeAll3 = this.f393c.removeAll(collection);
                if (removeAll3) {
                    int size4 = this.f393c.size();
                    ((h9.k1) this.f395f).f13695f += size4 - size3;
                    j();
                    return removeAll3;
                }
                return removeAll3;
        }
    }

    @Override
    public final boolean retainAll(Collection collection) {
        switch (this.f391a) {
            case 0:
                collection.getClass();
                int size = size();
                boolean retainAll = this.f393c.retainAll(collection);
                if (retainAll) {
                    int size2 = this.f393c.size();
                    ((i) this.f395f).d += size2 - size;
                    l();
                }
                return retainAll;
            case 1:
                collection.getClass();
                size();
                boolean retainAll2 = this.f393c.retainAll(collection);
                if (retainAll2) {
                    this.f393c.size();
                    l();
                }
                return retainAll2;
            default:
                collection.getClass();
                int size3 = size();
                boolean retainAll3 = this.f393c.retainAll(collection);
                if (retainAll3) {
                    int size4 = this.f393c.size();
                    ((h9.k1) this.f395f).f13695f += size4 - size3;
                    j();
                }
                return retainAll3;
        }
    }

    @Override
    public final Object set(int i7, Object obj) {
        switch (this.f391a) {
            case 0:
                zzb();
                return ((List) this.f393c).set(i7, obj);
            case 1:
                zzb();
                return ((List) this.f393c).set(i7, obj);
            default:
                i();
                return ((List) this.f393c).set(i7, obj);
        }
    }

    @Override
    public final int size() {
        switch (this.f391a) {
            case 0:
                zzb();
                return this.f393c.size();
            case 1:
                zzb();
                return this.f393c.size();
            default:
                i();
                return this.f393c.size();
        }
    }

    @Override
    public final List subList(int i7, int i10) {
        switch (this.f391a) {
            case 0:
                zzb();
                i iVar = (i) this.h;
                List subList = ((List) this.f393c).subList(i7, i10);
                f fVar = (f) this.f394e;
                if (fVar == null) {
                    fVar = this;
                }
                boolean z10 = subList instanceof RandomAccess;
                Object obj = this.f392b;
                if (z10) {
                    return new f(iVar, obj, subList, fVar);
                }
                return new f(iVar, obj, subList, fVar);
            case 1:
                zzb();
                List subList2 = ((List) this.f393c).subList(i7, i10);
                f fVar2 = (f) this.f394e;
                if (fVar2 == null) {
                    fVar2 = this;
                }
                jg jgVar = (jg) this.h;
                boolean z11 = subList2 instanceof RandomAccess;
                Object obj2 = this.f392b;
                if (z11) {
                    return new f(jgVar, obj2, subList2, fVar2);
                }
                return new f(jgVar, obj2, subList2, fVar2);
            default:
                i();
                h9.k1 k1Var = (h9.k1) this.h;
                List subList3 = ((List) this.f393c).subList(i7, i10);
                f fVar3 = (f) this.f394e;
                if (fVar3 == null) {
                    fVar3 = this;
                }
                boolean z12 = subList3 instanceof RandomAccess;
                Object obj3 = this.f392b;
                if (z12) {
                    return new f(k1Var, obj3, subList3, fVar3);
                }
                return new f(k1Var, obj3, subList3, fVar3);
        }
    }

    @Override
    public final String toString() {
        switch (this.f391a) {
            case 0:
                zzb();
                return this.f393c.toString();
            case 1:
                zzb();
                return this.f393c.toString();
            default:
                i();
                return this.f393c.toString();
        }
    }

    public void zzb() {
        Collection collection;
        switch (this.f391a) {
            case 0:
                f fVar = (f) this.f394e;
                if (fVar != null) {
                    fVar.zzb();
                    if (fVar.f393c != this.d) {
                        throw new ConcurrentModificationException();
                    }
                    return;
                } else if (this.f393c.isEmpty() && (collection = (Collection) ((i) this.f395f).f486c.get(this.f392b)) != null) {
                    this.f393c = collection;
                    return;
                } else {
                    return;
                }
            default:
                f fVar2 = (f) this.f394e;
                if (fVar2 != null) {
                    fVar2.zzb();
                    if (fVar2.f393c != this.d) {
                        throw new ConcurrentModificationException();
                    }
                    return;
                } else if (this.f393c.isEmpty()) {
                    Collection collection2 = (Collection) ((jg) this.f395f).f4567c.get(this.f392b);
                    if (collection2 != null) {
                        this.f393c = collection2;
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
        this.f395f = jgVar;
        this.f392b = obj;
        this.f393c = list;
        this.f394e = fVar;
        this.d = fVar == null ? null : fVar.f393c;
    }

    public f(h9.k1 k1Var, Object obj, List list, f fVar) {
        this.h = k1Var;
        this.f395f = k1Var;
        this.f392b = obj;
        this.f393c = list;
        this.f394e = fVar;
        this.d = fVar == null ? null : fVar.f393c;
    }

    @Override
    public final ListIterator listIterator(int i7) {
        switch (this.f391a) {
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
        switch (this.f391a) {
            case 0:
                zzb();
                Object remove = ((List) this.f393c).remove(i7);
                i iVar = (i) this.h;
                iVar.d--;
                l();
                return remove;
            case 1:
                zzb();
                Object remove2 = ((List) this.f393c).remove(i7);
                l();
                return remove2;
            default:
                i();
                Object remove3 = ((List) this.f393c).remove(i7);
                h9.k1 k1Var = (h9.k1) this.h;
                k1Var.f13695f--;
                j();
                return remove3;
        }
    }

    @Override
    public final void add(int i7, Object obj) {
        switch (this.f391a) {
            case 0:
                zzb();
                boolean isEmpty = this.f393c.isEmpty();
                ((List) this.f393c).add(i7, obj);
                ((i) this.h).d++;
                if (isEmpty) {
                    k();
                    return;
                }
                return;
            case 1:
                zzb();
                boolean isEmpty2 = this.f393c.isEmpty();
                ((List) this.f393c).add(i7, obj);
                if (isEmpty2) {
                    k();
                    return;
                }
                return;
            default:
                i();
                boolean isEmpty3 = this.f393c.isEmpty();
                ((List) this.f393c).add(i7, obj);
                ((h9.k1) this.h).f13695f++;
                if (isEmpty3) {
                    f();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean addAll(int i7, Collection collection) {
        switch (this.f391a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean addAll = ((List) this.f393c).addAll(i7, collection);
                if (addAll) {
                    int size2 = this.f393c.size();
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
                boolean addAll2 = ((List) this.f393c).addAll(i7, collection);
                if (addAll2) {
                    this.f393c.size();
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
                boolean addAll3 = ((List) this.f393c).addAll(i7, collection);
                if (addAll3) {
                    int size5 = this.f393c.size();
                    ((h9.k1) this.h).f13695f += size5 - size4;
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
