package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
public class l3 extends AbstractCollection implements List {
    public final byte a = 1;
    public final Object b;
    public Collection c;
    public final Collection d;
    public final AbstractCollection e;
    public final Serializable f;
    public final Serializable h;

    public l3(j7d j7dVar, Object obj, List list, l3 l3Var) {
        Collection collection;
        this.h = j7dVar;
        this.f = j7dVar;
        this.b = obj;
        this.c = list;
        this.e = l3Var;
        if (l3Var == null) {
            collection = null;
        } else {
            collection = l3Var.c;
        }
        this.d = collection;
    }

    @Override
    public final boolean add(Object obj) {
        byte b = this.a;
        Serializable serializable = this.f;
        switch (b) {
            case 0:
                i();
                boolean isEmpty = this.c.isEmpty();
                boolean add = this.c.add(obj);
                if (add) {
                    ((wg7) serializable).f++;
                    if (isEmpty) {
                        h();
                    }
                }
                return add;
            case 1:
                zzb();
                boolean isEmpty2 = this.c.isEmpty();
                boolean add2 = this.c.add(obj);
                if (add2) {
                    ((j7d) serializable).d++;
                    if (isEmpty2) {
                        k();
                        return true;
                    }
                }
                return add2;
            default:
                zzb();
                boolean isEmpty3 = this.c.isEmpty();
                boolean add3 = this.c.add(obj);
                if (add3 && isEmpty3) {
                    k();
                    return true;
                }
                return add3;
        }
    }

    @Override
    public final boolean addAll(int i, Collection collection) {
        byte b = this.a;
        Serializable serializable = this.h;
        boolean z = false;
        switch (b) {
            case 0:
                if (!collection.isEmpty()) {
                    int size = size();
                    z = ((List) this.c).addAll(i, collection);
                    if (z) {
                        ((wg7) serializable).f += this.c.size() - size;
                        if (size == 0) {
                            h();
                        }
                    }
                }
                return z;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                int size2 = size();
                boolean addAll = ((List) this.c).addAll(i, collection);
                if (addAll) {
                    ((j7d) serializable).d += this.c.size() - size2;
                    if (size2 == 0) {
                        k();
                        return true;
                    }
                }
                return addAll;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean addAll2 = ((List) this.c).addAll(i, collection);
                if (addAll2) {
                    this.c.size();
                    if (size3 == 0) {
                        k();
                        return true;
                    }
                }
                return addAll2;
        }
    }

    @Override
    public final void clear() {
        byte b = this.a;
        Serializable serializable = this.f;
        switch (b) {
            case 0:
                int size = size();
                if (size != 0) {
                    this.c.clear();
                    ((wg7) serializable).f -= size;
                    j();
                    return;
                }
                return;
            case 1:
                int size2 = size();
                if (size2 != 0) {
                    this.c.clear();
                    ((j7d) serializable).d -= size2;
                    l();
                    return;
                }
                return;
            default:
                if (size() != 0) {
                    this.c.clear();
                    l();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                i();
                return this.c.contains(obj);
            case 1:
                zzb();
                return this.c.contains(obj);
            default:
                zzb();
                return this.c.contains(obj);
        }
    }

    @Override
    public final boolean containsAll(Collection collection) {
        switch (this.a) {
            case 0:
                i();
                return this.c.containsAll(collection);
            case 1:
                zzb();
                return this.c.containsAll(collection);
            default:
                zzb();
                return this.c.containsAll(collection);
        }
    }

    @Override
    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (obj == this) {
                    return true;
                }
                i();
                return this.c.equals(obj);
            case 1:
                if (obj == this) {
                    return true;
                }
                zzb();
                return this.c.equals(obj);
            default:
                if (obj == this) {
                    return true;
                }
                zzb();
                return this.c.equals(obj);
        }
    }

    @Override
    public final Object get(int i) {
        switch (this.a) {
            case 0:
                i();
                return ((List) this.c).get(i);
            case 1:
                zzb();
                return ((List) this.c).get(i);
            default:
                zzb();
                return ((List) this.c).get(i);
        }
    }

    public final void h() {
        l3 l3Var = (l3) this.e;
        if (l3Var != null) {
            l3Var.h();
        } else {
            ((wg7) this.f).e.put(this.b, this.c);
        }
    }

    @Override
    public final int hashCode() {
        switch (this.a) {
            case 0:
                i();
                return this.c.hashCode();
            case 1:
                zzb();
                return this.c.hashCode();
            default:
                zzb();
                return this.c.hashCode();
        }
    }

    public final void i() {
        Collection collection;
        l3 l3Var = (l3) this.e;
        if (l3Var != null) {
            l3Var.i();
            if (l3Var.c != this.d) {
                ag.b();
            }
        } else if (this.c.isEmpty() && (collection = (Collection) ((wg7) this.f).e.get(this.b)) != null) {
            this.c = collection;
        }
    }

    @Override
    public final int indexOf(Object obj) {
        switch (this.a) {
            case 0:
                i();
                return ((List) this.c).indexOf(obj);
            case 1:
                zzb();
                return ((List) this.c).indexOf(obj);
            default:
                zzb();
                return ((List) this.c).indexOf(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                i();
                return new c3(this);
            case 1:
                zzb();
                return new c3(this, (byte) 0);
            default:
                zzb();
                return new c3(this, (char) 0);
        }
    }

    public final void j() {
        l3 l3Var = (l3) this.e;
        if (l3Var != null) {
            l3Var.j();
        } else if (this.c.isEmpty()) {
            ((wg7) this.f).e.remove(this.b);
        }
    }

    public final void k() {
        byte b = this.a;
        Object obj = this.b;
        Serializable serializable = this.f;
        AbstractCollection abstractCollection = this.e;
        switch (b) {
            case 1:
                l3 l3Var = (l3) abstractCollection;
                if (l3Var != null) {
                    l3Var.k();
                    return;
                } else {
                    ((j7d) serializable).c.put(obj, this.c);
                    return;
                }
            default:
                l3 l3Var2 = (l3) abstractCollection;
                if (l3Var2 != null) {
                    l3Var2.k();
                    return;
                } else {
                    ((vhf) serializable).c.put(obj, this.c);
                    return;
                }
        }
    }

    public final void l() {
        byte b = this.a;
        Object obj = this.b;
        Serializable serializable = this.f;
        AbstractCollection abstractCollection = this.e;
        switch (b) {
            case 1:
                l3 l3Var = (l3) abstractCollection;
                if (l3Var != null) {
                    l3Var.l();
                    return;
                } else if (this.c.isEmpty()) {
                    ((j7d) serializable).c.remove(obj);
                    return;
                } else {
                    return;
                }
            default:
                l3 l3Var2 = (l3) abstractCollection;
                if (l3Var2 != null) {
                    l3Var2.l();
                    return;
                } else if (this.c.isEmpty()) {
                    ((vhf) serializable).c.remove(obj);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public final int lastIndexOf(Object obj) {
        switch (this.a) {
            case 0:
                i();
                return ((List) this.c).lastIndexOf(obj);
            case 1:
                zzb();
                return ((List) this.c).lastIndexOf(obj);
            default:
                zzb();
                return ((List) this.c).lastIndexOf(obj);
        }
    }

    @Override
    public final ListIterator listIterator() {
        switch (this.a) {
            case 0:
                i();
                return new k3(this);
            case 1:
                zzb();
                return new k6d(this);
            default:
                zzb();
                return new gff(this);
        }
    }

    @Override
    public final Object remove(int i) {
        byte b = this.a;
        Serializable serializable = this.h;
        switch (b) {
            case 0:
                i();
                Object remove = ((List) this.c).remove(i);
                wg7 wg7Var = (wg7) serializable;
                wg7Var.f--;
                j();
                return remove;
            case 1:
                zzb();
                Object remove2 = ((List) this.c).remove(i);
                j7d j7dVar = (j7d) serializable;
                j7dVar.d--;
                l();
                return remove2;
            default:
                zzb();
                Object remove3 = ((List) this.c).remove(i);
                l();
                return remove3;
        }
    }

    @Override
    public final boolean removeAll(Collection collection) {
        byte b = this.a;
        Serializable serializable = this.f;
        boolean z = false;
        switch (b) {
            case 0:
                if (!collection.isEmpty()) {
                    int size = size();
                    z = this.c.removeAll(collection);
                    if (z) {
                        ((wg7) serializable).f += this.c.size() - size;
                        j();
                    }
                }
                return z;
            case 1:
                if (!collection.isEmpty()) {
                    int size2 = size();
                    z = this.c.removeAll(collection);
                    if (z) {
                        ((j7d) serializable).d += this.c.size() - size2;
                        l();
                    }
                }
                return z;
            default:
                if (!collection.isEmpty()) {
                    size();
                    z = this.c.removeAll(collection);
                    if (z) {
                        this.c.size();
                        l();
                    }
                }
                return z;
        }
    }

    @Override
    public final boolean retainAll(Collection collection) {
        byte b = this.a;
        Serializable serializable = this.f;
        switch (b) {
            case 0:
                collection.getClass();
                int size = size();
                boolean retainAll = this.c.retainAll(collection);
                if (retainAll) {
                    ((wg7) serializable).f += this.c.size() - size;
                    j();
                }
                return retainAll;
            case 1:
                collection.getClass();
                int size2 = size();
                boolean retainAll2 = this.c.retainAll(collection);
                if (retainAll2) {
                    ((j7d) serializable).d += this.c.size() - size2;
                    l();
                }
                return retainAll2;
            default:
                collection.getClass();
                size();
                boolean retainAll3 = this.c.retainAll(collection);
                if (retainAll3) {
                    this.c.size();
                    l();
                }
                return retainAll3;
        }
    }

    @Override
    public final Object set(int i, Object obj) {
        switch (this.a) {
            case 0:
                i();
                return ((List) this.c).set(i, obj);
            case 1:
                zzb();
                return ((List) this.c).set(i, obj);
            default:
                zzb();
                return ((List) this.c).set(i, obj);
        }
    }

    @Override
    public final int size() {
        switch (this.a) {
            case 0:
                i();
                return this.c.size();
            case 1:
                zzb();
                return this.c.size();
            default:
                zzb();
                return this.c.size();
        }
    }

    @Override
    public final List subList(int i, int i2) {
        byte b = this.a;
        Serializable serializable = this.h;
        Object obj = this.b;
        AbstractCollection abstractCollection = this.e;
        switch (b) {
            case 0:
                i();
                wg7 wg7Var = (wg7) serializable;
                List subList = ((List) this.c).subList(i, i2);
                l3 l3Var = (l3) abstractCollection;
                if (l3Var != null) {
                    this = l3Var;
                }
                if (subList instanceof RandomAccess) {
                    return new l3(wg7Var, obj, subList, this);
                }
                return new l3(wg7Var, obj, subList, this);
            case 1:
                zzb();
                j7d j7dVar = (j7d) serializable;
                List subList2 = ((List) this.c).subList(i, i2);
                l3 l3Var2 = (l3) abstractCollection;
                if (l3Var2 != null) {
                    this = l3Var2;
                }
                if (subList2 instanceof RandomAccess) {
                    return new l3(j7dVar, obj, subList2, this);
                }
                return new l3(j7dVar, obj, subList2, this);
            default:
                zzb();
                List subList3 = ((List) this.c).subList(i, i2);
                l3 l3Var3 = (l3) abstractCollection;
                if (l3Var3 != null) {
                    this = l3Var3;
                }
                vhf vhfVar = (vhf) serializable;
                if (subList3 instanceof RandomAccess) {
                    return new l3(vhfVar, obj, subList3, this);
                }
                return new l3(vhfVar, obj, subList3, this);
        }
    }

    @Override
    public final String toString() {
        switch (this.a) {
            case 0:
                i();
                return this.c.toString();
            case 1:
                zzb();
                return this.c.toString();
            default:
                zzb();
                return this.c.toString();
        }
    }

    public final void zzb() {
        Collection collection;
        Collection collection2;
        byte b = this.a;
        Object obj = this.b;
        Serializable serializable = this.f;
        Collection collection3 = this.d;
        AbstractCollection abstractCollection = this.e;
        switch (b) {
            case 1:
                l3 l3Var = (l3) abstractCollection;
                if (l3Var != null) {
                    l3Var.zzb();
                    if (l3Var.c != collection3) {
                        ag.b();
                        return;
                    }
                    return;
                } else if (this.c.isEmpty() && (collection = (Collection) ((j7d) serializable).c.get(obj)) != null) {
                    this.c = collection;
                    return;
                } else {
                    return;
                }
            default:
                l3 l3Var2 = (l3) abstractCollection;
                if (l3Var2 != null) {
                    l3Var2.zzb();
                    if (l3Var2.c != collection3) {
                        ag.b();
                        return;
                    }
                    return;
                } else if (this.c.isEmpty() && (collection2 = (Collection) ((vhf) serializable).c.get(obj)) != null) {
                    this.c = collection2;
                    return;
                } else {
                    return;
                }
        }
    }

    public l3(vhf vhfVar, Object obj, List list, l3 l3Var) {
        this.h = vhfVar;
        this.f = vhfVar;
        this.b = obj;
        this.c = list;
        this.e = l3Var;
        this.d = l3Var == null ? null : l3Var.c;
    }

    public l3(wg7 wg7Var, Object obj, List list, l3 l3Var) {
        this.h = wg7Var;
        this.f = wg7Var;
        this.b = obj;
        this.c = list;
        this.e = l3Var;
        this.d = l3Var == null ? null : l3Var.c;
    }

    @Override
    public final ListIterator listIterator(int i) {
        switch (this.a) {
            case 0:
                i();
                return new k3(this, i);
            case 1:
                zzb();
                return new k6d(this, i);
            default:
                zzb();
                return new gff(this, i);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        byte b = this.a;
        Serializable serializable = this.f;
        switch (b) {
            case 0:
                i();
                boolean remove = this.c.remove(obj);
                if (remove) {
                    wg7 wg7Var = (wg7) serializable;
                    wg7Var.f--;
                    j();
                }
                return remove;
            case 1:
                zzb();
                boolean remove2 = this.c.remove(obj);
                if (remove2) {
                    j7d j7dVar = (j7d) serializable;
                    j7dVar.d--;
                    l();
                }
                return remove2;
            default:
                zzb();
                boolean remove3 = this.c.remove(obj);
                if (remove3) {
                    l();
                }
                return remove3;
        }
    }

    @Override
    public final void add(int i, Object obj) {
        byte b = this.a;
        Serializable serializable = this.h;
        switch (b) {
            case 0:
                i();
                boolean isEmpty = this.c.isEmpty();
                ((List) this.c).add(i, obj);
                ((wg7) serializable).f++;
                if (isEmpty) {
                    h();
                    return;
                }
                return;
            case 1:
                zzb();
                boolean isEmpty2 = this.c.isEmpty();
                ((List) this.c).add(i, obj);
                ((j7d) serializable).d++;
                if (isEmpty2) {
                    k();
                    return;
                }
                return;
            default:
                zzb();
                boolean isEmpty3 = this.c.isEmpty();
                ((List) this.c).add(i, obj);
                if (isEmpty3) {
                    k();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean addAll(Collection collection) {
        byte b = this.a;
        Serializable serializable = this.f;
        boolean z = false;
        switch (b) {
            case 0:
                if (!collection.isEmpty()) {
                    int size = size();
                    z = this.c.addAll(collection);
                    if (z) {
                        ((wg7) serializable).f += this.c.size() - size;
                        if (size == 0) {
                            h();
                        }
                    }
                }
                return z;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                int size2 = size();
                boolean addAll = this.c.addAll(collection);
                if (addAll) {
                    ((j7d) serializable).d += this.c.size() - size2;
                    if (size2 == 0) {
                        k();
                        return true;
                    }
                }
                return addAll;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean addAll2 = this.c.addAll(collection);
                if (addAll2) {
                    this.c.size();
                    if (size3 == 0) {
                        k();
                        return true;
                    }
                }
                return addAll2;
        }
    }
}
