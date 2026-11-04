package b8;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
public class ah extends AbstractCollection implements List {
    public final int f2470a = 0;
    public final Object f2471b;
    public Collection f2472c;
    public final Collection d;
    public final AbstractCollection f2473e;
    public final Serializable f2474f;
    public final Serializable h;

    public ah(dh dhVar, Object obj, List list, ah ahVar) {
        this.h = dhVar;
        this.f2474f = dhVar;
        this.f2471b = obj;
        this.f2472c = list;
        this.f2473e = ahVar;
        this.d = ahVar == null ? null : ahVar.f2472c;
    }

    @Override
    public final void add(int i3, Object obj) {
        switch (this.f2470a) {
            case 0:
                zzb();
                boolean isEmpty = this.f2472c.isEmpty();
                ((List) this.f2472c).add(i3, obj);
                if (isEmpty) {
                    k();
                    return;
                }
                return;
            case 1:
                i();
                boolean isEmpty2 = this.f2472c.isEmpty();
                ((List) this.f2472c).add(i3, obj);
                ((g9.k1) this.h).f12092f++;
                if (isEmpty2) {
                    h();
                    return;
                }
                return;
            default:
                zzb();
                boolean isEmpty3 = this.f2472c.isEmpty();
                ((List) this.f2472c).add(i3, obj);
                ((z7.e) this.h).d++;
                if (isEmpty3) {
                    k();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean addAll(int i3, Collection collection) {
        switch (this.f2470a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean addAll = ((List) this.f2472c).addAll(i3, collection);
                if (addAll) {
                    this.f2472c.size();
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
                int size2 = size();
                boolean addAll2 = ((List) this.f2472c).addAll(i3, collection);
                if (addAll2) {
                    int size3 = this.f2472c.size();
                    ((g9.k1) this.h).f12092f += size3 - size2;
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
                boolean addAll3 = ((List) this.f2472c).addAll(i3, collection);
                if (addAll3) {
                    int size5 = this.f2472c.size();
                    ((z7.e) this.h).d += size5 - size4;
                    if (size4 == 0) {
                        k();
                        return true;
                    }
                    return addAll3;
                }
                return addAll3;
        }
    }

    @Override
    public final void clear() {
        switch (this.f2470a) {
            case 0:
                if (size() != 0) {
                    this.f2472c.clear();
                    l();
                    return;
                }
                return;
            case 1:
                int size = size();
                if (size != 0) {
                    this.f2472c.clear();
                    ((g9.k1) this.f2474f).f12092f -= size;
                    j();
                    return;
                }
                return;
            default:
                int size2 = size();
                if (size2 != 0) {
                    this.f2472c.clear();
                    ((z7.e) this.f2474f).d -= size2;
                    l();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f2470a) {
            case 0:
                zzb();
                return this.f2472c.contains(obj);
            case 1:
                i();
                return this.f2472c.contains(obj);
            default:
                zzb();
                return this.f2472c.contains(obj);
        }
    }

    @Override
    public final boolean containsAll(Collection collection) {
        switch (this.f2470a) {
            case 0:
                zzb();
                return this.f2472c.containsAll(collection);
            case 1:
                i();
                return this.f2472c.containsAll(collection);
            default:
                zzb();
                return this.f2472c.containsAll(collection);
        }
    }

    @Override
    public final boolean equals(Object obj) {
        switch (this.f2470a) {
            case 0:
                if (obj == this) {
                    return true;
                }
                zzb();
                return this.f2472c.equals(obj);
            case 1:
                if (obj == this) {
                    return true;
                }
                i();
                return this.f2472c.equals(obj);
            default:
                if (obj == this) {
                    return true;
                }
                zzb();
                return this.f2472c.equals(obj);
        }
    }

    @Override
    public final Object get(int i3) {
        switch (this.f2470a) {
            case 0:
                zzb();
                return ((List) this.f2472c).get(i3);
            case 1:
                i();
                return ((List) this.f2472c).get(i3);
            default:
                zzb();
                return ((List) this.f2472c).get(i3);
        }
    }

    public void h() {
        ah ahVar = (ah) this.f2473e;
        if (ahVar != null) {
            ahVar.h();
        } else {
            ((g9.k1) this.f2474f).f12091e.put(this.f2471b, this.f2472c);
        }
    }

    @Override
    public final int hashCode() {
        switch (this.f2470a) {
            case 0:
                zzb();
                return this.f2472c.hashCode();
            case 1:
                i();
                return this.f2472c.hashCode();
            default:
                zzb();
                return this.f2472c.hashCode();
        }
    }

    public void i() {
        Collection collection;
        ah ahVar = (ah) this.f2473e;
        if (ahVar != null) {
            ahVar.i();
            if (ahVar.f2472c != this.d) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f2472c.isEmpty() && (collection = (Collection) ((g9.k1) this.f2474f).f12091e.get(this.f2471b)) != null) {
            this.f2472c = collection;
        }
    }

    @Override
    public final int indexOf(Object obj) {
        switch (this.f2470a) {
            case 0:
                zzb();
                return ((List) this.f2472c).indexOf(obj);
            case 1:
                i();
                return ((List) this.f2472c).indexOf(obj);
            default:
                zzb();
                return ((List) this.f2472c).indexOf(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f2470a) {
            case 0:
                zzb();
                return new ra(this);
            case 1:
                i();
                return new ra(this, (byte) 0);
            default:
                zzb();
                return new ra(this, (char) 0);
        }
    }

    public void j() {
        ah ahVar = (ah) this.f2473e;
        if (ahVar != null) {
            ahVar.j();
        } else if (this.f2472c.isEmpty()) {
            ((g9.k1) this.f2474f).f12091e.remove(this.f2471b);
        }
    }

    public void k() {
        switch (this.f2470a) {
            case 0:
                ah ahVar = (ah) this.f2473e;
                if (ahVar != null) {
                    ahVar.k();
                    return;
                }
                ((dh) this.f2474f).f2554c.put(this.f2471b, this.f2472c);
                return;
            default:
                ah ahVar2 = (ah) this.f2473e;
                if (ahVar2 != null) {
                    ahVar2.k();
                    return;
                } else {
                    ((z7.e) this.f2474f).f59849c.put(this.f2471b, this.f2472c);
                    return;
                }
        }
    }

    public void l() {
        switch (this.f2470a) {
            case 0:
                ah ahVar = (ah) this.f2473e;
                if (ahVar != null) {
                    ahVar.l();
                    return;
                } else if (this.f2472c.isEmpty()) {
                    ((dh) this.f2474f).f2554c.remove(this.f2471b);
                    return;
                } else {
                    return;
                }
            default:
                ah ahVar2 = (ah) this.f2473e;
                if (ahVar2 != null) {
                    ahVar2.l();
                    return;
                } else if (this.f2472c.isEmpty()) {
                    ((z7.e) this.f2474f).f59849c.remove(this.f2471b);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public final int lastIndexOf(Object obj) {
        switch (this.f2470a) {
            case 0:
                zzb();
                return ((List) this.f2472c).lastIndexOf(obj);
            case 1:
                i();
                return ((List) this.f2472c).lastIndexOf(obj);
            default:
                zzb();
                return ((List) this.f2472c).lastIndexOf(obj);
        }
    }

    @Override
    public final ListIterator listIterator() {
        switch (this.f2470a) {
            case 0:
                zzb();
                return new rg(this);
            case 1:
                i();
                return new g9.j(this);
            default:
                zzb();
                return new z7.c(this);
        }
    }

    @Override
    public final Object remove(int i3) {
        switch (this.f2470a) {
            case 0:
                zzb();
                Object remove = ((List) this.f2472c).remove(i3);
                l();
                return remove;
            case 1:
                i();
                Object remove2 = ((List) this.f2472c).remove(i3);
                g9.k1 k1Var = (g9.k1) this.h;
                k1Var.f12092f--;
                j();
                return remove2;
            default:
                zzb();
                Object remove3 = ((List) this.f2472c).remove(i3);
                z7.e eVar = (z7.e) this.h;
                eVar.d--;
                l();
                return remove3;
        }
    }

    @Override
    public final boolean removeAll(Collection collection) {
        switch (this.f2470a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                size();
                boolean removeAll = this.f2472c.removeAll(collection);
                if (removeAll) {
                    this.f2472c.size();
                    l();
                    return removeAll;
                }
                return removeAll;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean removeAll2 = this.f2472c.removeAll(collection);
                if (removeAll2) {
                    int size2 = this.f2472c.size();
                    ((g9.k1) this.f2474f).f12092f += size2 - size;
                    j();
                    return removeAll2;
                }
                return removeAll2;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean removeAll3 = this.f2472c.removeAll(collection);
                if (removeAll3) {
                    int size4 = this.f2472c.size();
                    ((z7.e) this.f2474f).d += size4 - size3;
                    l();
                    return removeAll3;
                }
                return removeAll3;
        }
    }

    @Override
    public final boolean retainAll(Collection collection) {
        switch (this.f2470a) {
            case 0:
                collection.getClass();
                size();
                boolean retainAll = this.f2472c.retainAll(collection);
                if (retainAll) {
                    this.f2472c.size();
                    l();
                }
                return retainAll;
            case 1:
                collection.getClass();
                int size = size();
                boolean retainAll2 = this.f2472c.retainAll(collection);
                if (retainAll2) {
                    int size2 = this.f2472c.size();
                    ((g9.k1) this.f2474f).f12092f += size2 - size;
                    j();
                }
                return retainAll2;
            default:
                collection.getClass();
                int size3 = size();
                boolean retainAll3 = this.f2472c.retainAll(collection);
                if (retainAll3) {
                    int size4 = this.f2472c.size();
                    ((z7.e) this.f2474f).d += size4 - size3;
                    l();
                }
                return retainAll3;
        }
    }

    @Override
    public final Object set(int i3, Object obj) {
        switch (this.f2470a) {
            case 0:
                zzb();
                return ((List) this.f2472c).set(i3, obj);
            case 1:
                i();
                return ((List) this.f2472c).set(i3, obj);
            default:
                zzb();
                return ((List) this.f2472c).set(i3, obj);
        }
    }

    @Override
    public final int size() {
        switch (this.f2470a) {
            case 0:
                zzb();
                return this.f2472c.size();
            case 1:
                i();
                return this.f2472c.size();
            default:
                zzb();
                return this.f2472c.size();
        }
    }

    @Override
    public final List subList(int i3, int i10) {
        switch (this.f2470a) {
            case 0:
                zzb();
                List subList = ((List) this.f2472c).subList(i3, i10);
                ah ahVar = (ah) this.f2473e;
                if (ahVar == null) {
                    ahVar = this;
                }
                dh dhVar = (dh) this.h;
                boolean z10 = subList instanceof RandomAccess;
                Object obj = this.f2471b;
                if (z10) {
                    return new ah(dhVar, obj, subList, ahVar);
                }
                return new ah(dhVar, obj, subList, ahVar);
            case 1:
                i();
                g9.k1 k1Var = (g9.k1) this.h;
                List subList2 = ((List) this.f2472c).subList(i3, i10);
                ah ahVar2 = (ah) this.f2473e;
                if (ahVar2 == null) {
                    ahVar2 = this;
                }
                boolean z11 = subList2 instanceof RandomAccess;
                Object obj2 = this.f2471b;
                if (z11) {
                    return new ah(k1Var, obj2, subList2, ahVar2);
                }
                return new ah(k1Var, obj2, subList2, ahVar2);
            default:
                zzb();
                z7.e eVar = (z7.e) this.h;
                List subList3 = ((List) this.f2472c).subList(i3, i10);
                ah ahVar3 = (ah) this.f2473e;
                if (ahVar3 == null) {
                    ahVar3 = this;
                }
                boolean z12 = subList3 instanceof RandomAccess;
                Object obj3 = this.f2471b;
                if (z12) {
                    return new ah(eVar, obj3, subList3, ahVar3);
                }
                return new ah(eVar, obj3, subList3, ahVar3);
        }
    }

    @Override
    public final String toString() {
        switch (this.f2470a) {
            case 0:
                zzb();
                return this.f2472c.toString();
            case 1:
                i();
                return this.f2472c.toString();
            default:
                zzb();
                return this.f2472c.toString();
        }
    }

    public void zzb() {
        Collection collection;
        switch (this.f2470a) {
            case 0:
                ah ahVar = (ah) this.f2473e;
                if (ahVar != null) {
                    ahVar.zzb();
                    if (ahVar.f2472c != this.d) {
                        throw new ConcurrentModificationException();
                    }
                    return;
                } else if (this.f2472c.isEmpty()) {
                    Collection collection2 = (Collection) ((dh) this.f2474f).f2554c.get(this.f2471b);
                    if (collection2 != null) {
                        this.f2472c = collection2;
                        return;
                    }
                    return;
                } else {
                    return;
                }
            default:
                ah ahVar2 = (ah) this.f2473e;
                if (ahVar2 != null) {
                    ahVar2.zzb();
                    if (ahVar2.f2472c != this.d) {
                        throw new ConcurrentModificationException();
                    }
                    return;
                } else if (this.f2472c.isEmpty() && (collection = (Collection) ((z7.e) this.f2474f).f59849c.get(this.f2471b)) != null) {
                    this.f2472c = collection;
                    return;
                } else {
                    return;
                }
        }
    }

    public ah(z7.e eVar, Object obj, List list, ah ahVar) {
        this.h = eVar;
        this.f2474f = eVar;
        this.f2471b = obj;
        this.f2472c = list;
        this.f2473e = ahVar;
        this.d = ahVar == null ? null : ahVar.f2472c;
    }

    public ah(g9.k1 k1Var, Object obj, List list, ah ahVar) {
        this.h = k1Var;
        this.f2474f = k1Var;
        this.f2471b = obj;
        this.f2472c = list;
        this.f2473e = ahVar;
        this.d = ahVar == null ? null : ahVar.f2472c;
    }

    @Override
    public final ListIterator listIterator(int i3) {
        switch (this.f2470a) {
            case 0:
                zzb();
                return new rg(this, i3);
            case 1:
                i();
                return new g9.j(this, i3);
            default:
                zzb();
                return new z7.c(this, i3);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f2470a) {
            case 0:
                zzb();
                boolean remove = this.f2472c.remove(obj);
                if (remove) {
                    l();
                }
                return remove;
            case 1:
                i();
                boolean remove2 = this.f2472c.remove(obj);
                if (remove2) {
                    g9.k1 k1Var = (g9.k1) this.f2474f;
                    k1Var.f12092f--;
                    j();
                }
                return remove2;
            default:
                zzb();
                boolean remove3 = this.f2472c.remove(obj);
                if (remove3) {
                    z7.e eVar = (z7.e) this.f2474f;
                    eVar.d--;
                    l();
                }
                return remove3;
        }
    }

    @Override
    public final boolean add(Object obj) {
        switch (this.f2470a) {
            case 0:
                zzb();
                boolean isEmpty = this.f2472c.isEmpty();
                boolean add = this.f2472c.add(obj);
                if (add && isEmpty) {
                    k();
                    return true;
                }
                return add;
            case 1:
                i();
                boolean isEmpty2 = this.f2472c.isEmpty();
                boolean add2 = this.f2472c.add(obj);
                if (add2) {
                    ((g9.k1) this.f2474f).f12092f++;
                    if (isEmpty2) {
                        h();
                    }
                }
                return add2;
            default:
                zzb();
                boolean isEmpty3 = this.f2472c.isEmpty();
                boolean add3 = this.f2472c.add(obj);
                if (add3) {
                    ((z7.e) this.f2474f).d++;
                    if (isEmpty3) {
                        k();
                        return true;
                    }
                    return add3;
                }
                return add3;
        }
    }

    @Override
    public final boolean addAll(Collection collection) {
        switch (this.f2470a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean addAll = this.f2472c.addAll(collection);
                if (addAll) {
                    this.f2472c.size();
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
                int size2 = size();
                boolean addAll2 = this.f2472c.addAll(collection);
                if (addAll2) {
                    int size3 = this.f2472c.size();
                    ((g9.k1) this.f2474f).f12092f += size3 - size2;
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
                boolean addAll3 = this.f2472c.addAll(collection);
                if (addAll3) {
                    int size5 = this.f2472c.size();
                    ((z7.e) this.f2474f).d += size5 - size4;
                    if (size4 == 0) {
                        k();
                        return true;
                    }
                    return addAll3;
                }
                return addAll3;
        }
    }
}
