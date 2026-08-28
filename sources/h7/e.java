package h7;

import j7.bg;
import j7.lg;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
public class e extends AbstractCollection implements List {
    public final int f9906a = 0;
    public final Object f9907b;
    public Collection f9908c;
    public final Collection d;
    public final AbstractCollection f9909e;
    public final Serializable f9910f;
    public final Serializable h;

    public e(h hVar, Object obj, List list, e eVar) {
        this.h = hVar;
        this.f9910f = hVar;
        this.f9907b = obj;
        this.f9908c = list;
        this.f9909e = eVar;
        this.d = eVar == null ? null : eVar.f9908c;
    }

    @Override
    public final boolean add(Object obj) {
        switch (this.f9906a) {
            case 0:
                zzb();
                boolean isEmpty = this.f9908c.isEmpty();
                boolean add = this.f9908c.add(obj);
                if (add) {
                    ((h) this.f9910f).d++;
                    if (isEmpty) {
                        p();
                        return true;
                    }
                    return add;
                }
                return add;
            case 1:
                zzb();
                boolean isEmpty2 = this.f9908c.isEmpty();
                boolean add2 = this.f9908c.add(obj);
                if (add2 && isEmpty2) {
                    p();
                    return true;
                }
                return add2;
            default:
                n();
                boolean isEmpty3 = this.f9908c.isEmpty();
                boolean add3 = this.f9908c.add(obj);
                if (add3) {
                    ((o8.h0) this.f9910f).f19047e++;
                    if (isEmpty3) {
                        i();
                    }
                }
                return add3;
        }
    }

    @Override
    public final boolean addAll(Collection collection) {
        switch (this.f9906a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean addAll = this.f9908c.addAll(collection);
                if (addAll) {
                    int size2 = this.f9908c.size();
                    ((h) this.f9910f).d += size2 - size;
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
                boolean addAll2 = this.f9908c.addAll(collection);
                if (addAll2) {
                    this.f9908c.size();
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
                boolean addAll3 = this.f9908c.addAll(collection);
                if (addAll3) {
                    int size5 = this.f9908c.size();
                    ((o8.h0) this.f9910f).f19047e += size5 - size4;
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
        switch (this.f9906a) {
            case 0:
                int size = size();
                if (size != 0) {
                    this.f9908c.clear();
                    ((h) this.f9910f).d -= size;
                    q();
                    return;
                }
                return;
            case 1:
                if (size() != 0) {
                    this.f9908c.clear();
                    q();
                    return;
                }
                return;
            default:
                int size2 = size();
                if (size2 != 0) {
                    this.f9908c.clear();
                    ((o8.h0) this.f9910f).f19047e -= size2;
                    o();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f9906a) {
            case 0:
                zzb();
                return this.f9908c.contains(obj);
            case 1:
                zzb();
                return this.f9908c.contains(obj);
            default:
                n();
                return this.f9908c.contains(obj);
        }
    }

    @Override
    public final boolean containsAll(Collection collection) {
        switch (this.f9906a) {
            case 0:
                zzb();
                return this.f9908c.containsAll(collection);
            case 1:
                zzb();
                return this.f9908c.containsAll(collection);
            default:
                n();
                return this.f9908c.containsAll(collection);
        }
    }

    @Override
    public final boolean equals(Object obj) {
        switch (this.f9906a) {
            case 0:
                if (obj == this) {
                    return true;
                }
                zzb();
                return this.f9908c.equals(obj);
            case 1:
                if (obj == this) {
                    return true;
                }
                zzb();
                return this.f9908c.equals(obj);
            default:
                if (obj == this) {
                    return true;
                }
                n();
                return this.f9908c.equals(obj);
        }
    }

    @Override
    public final Object get(int i9) {
        switch (this.f9906a) {
            case 0:
                zzb();
                return ((List) this.f9908c).get(i9);
            case 1:
                zzb();
                return ((List) this.f9908c).get(i9);
            default:
                n();
                return ((List) this.f9908c).get(i9);
        }
    }

    @Override
    public final int hashCode() {
        switch (this.f9906a) {
            case 0:
                zzb();
                return this.f9908c.hashCode();
            case 1:
                zzb();
                return this.f9908c.hashCode();
            default:
                n();
                return this.f9908c.hashCode();
        }
    }

    public void i() {
        e eVar = (e) this.f9909e;
        if (eVar != null) {
            eVar.i();
        } else {
            ((o8.h0) this.f9910f).d.put(this.f9907b, this.f9908c);
        }
    }

    @Override
    public final int indexOf(Object obj) {
        switch (this.f9906a) {
            case 0:
                zzb();
                return ((List) this.f9908c).indexOf(obj);
            case 1:
                zzb();
                return ((List) this.f9908c).indexOf(obj);
            default:
                n();
                return ((List) this.f9908c).indexOf(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f9906a) {
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
        switch (this.f9906a) {
            case 0:
                zzb();
                return ((List) this.f9908c).lastIndexOf(obj);
            case 1:
                zzb();
                return ((List) this.f9908c).lastIndexOf(obj);
            default:
                n();
                return ((List) this.f9908c).lastIndexOf(obj);
        }
    }

    @Override
    public final ListIterator listIterator() {
        switch (this.f9906a) {
            case 0:
                zzb();
                return new d(this);
            case 1:
                zzb();
                return new bg(this);
            default:
                n();
                return new o8.i(this);
        }
    }

    public void n() {
        Collection collection;
        e eVar = (e) this.f9909e;
        if (eVar != null) {
            eVar.n();
            if (eVar.f9908c != this.d) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f9908c.isEmpty() && (collection = (Collection) ((o8.h0) this.f9910f).d.get(this.f9907b)) != null) {
            this.f9908c = collection;
        }
    }

    public void o() {
        e eVar = (e) this.f9909e;
        if (eVar != null) {
            eVar.o();
        } else if (this.f9908c.isEmpty()) {
            ((o8.h0) this.f9910f).d.remove(this.f9907b);
        }
    }

    public void p() {
        switch (this.f9906a) {
            case 0:
                e eVar = (e) this.f9909e;
                if (eVar != null) {
                    eVar.p();
                    return;
                } else {
                    ((h) this.f9910f).f9942c.put(this.f9907b, this.f9908c);
                    return;
                }
            default:
                e eVar2 = (e) this.f9909e;
                if (eVar2 != null) {
                    eVar2.p();
                    return;
                }
                ((lg) this.f9910f).f14018c.put(this.f9907b, this.f9908c);
                return;
        }
    }

    public void q() {
        switch (this.f9906a) {
            case 0:
                e eVar = (e) this.f9909e;
                if (eVar != null) {
                    eVar.q();
                    return;
                } else if (this.f9908c.isEmpty()) {
                    ((h) this.f9910f).f9942c.remove(this.f9907b);
                    return;
                } else {
                    return;
                }
            default:
                e eVar2 = (e) this.f9909e;
                if (eVar2 != null) {
                    eVar2.q();
                    return;
                } else if (this.f9908c.isEmpty()) {
                    ((lg) this.f9910f).f14018c.remove(this.f9907b);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f9906a) {
            case 0:
                zzb();
                boolean remove = this.f9908c.remove(obj);
                if (remove) {
                    h hVar = (h) this.f9910f;
                    hVar.d--;
                    q();
                }
                return remove;
            case 1:
                zzb();
                boolean remove2 = this.f9908c.remove(obj);
                if (remove2) {
                    q();
                }
                return remove2;
            default:
                n();
                boolean remove3 = this.f9908c.remove(obj);
                if (remove3) {
                    o8.h0 h0Var = (o8.h0) this.f9910f;
                    h0Var.f19047e--;
                    o();
                }
                return remove3;
        }
    }

    @Override
    public final boolean removeAll(Collection collection) {
        switch (this.f9906a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean removeAll = this.f9908c.removeAll(collection);
                if (removeAll) {
                    int size2 = this.f9908c.size();
                    ((h) this.f9910f).d += size2 - size;
                    q();
                    return removeAll;
                }
                return removeAll;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                size();
                boolean removeAll2 = this.f9908c.removeAll(collection);
                if (removeAll2) {
                    this.f9908c.size();
                    q();
                    return removeAll2;
                }
                return removeAll2;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean removeAll3 = this.f9908c.removeAll(collection);
                if (removeAll3) {
                    int size4 = this.f9908c.size();
                    ((o8.h0) this.f9910f).f19047e += size4 - size3;
                    o();
                    return removeAll3;
                }
                return removeAll3;
        }
    }

    @Override
    public final boolean retainAll(Collection collection) {
        switch (this.f9906a) {
            case 0:
                collection.getClass();
                int size = size();
                boolean retainAll = this.f9908c.retainAll(collection);
                if (retainAll) {
                    int size2 = this.f9908c.size();
                    ((h) this.f9910f).d += size2 - size;
                    q();
                }
                return retainAll;
            case 1:
                collection.getClass();
                size();
                boolean retainAll2 = this.f9908c.retainAll(collection);
                if (retainAll2) {
                    this.f9908c.size();
                    q();
                }
                return retainAll2;
            default:
                collection.getClass();
                int size3 = size();
                boolean retainAll3 = this.f9908c.retainAll(collection);
                if (retainAll3) {
                    int size4 = this.f9908c.size();
                    ((o8.h0) this.f9910f).f19047e += size4 - size3;
                    o();
                }
                return retainAll3;
        }
    }

    @Override
    public final Object set(int i9, Object obj) {
        switch (this.f9906a) {
            case 0:
                zzb();
                return ((List) this.f9908c).set(i9, obj);
            case 1:
                zzb();
                return ((List) this.f9908c).set(i9, obj);
            default:
                n();
                return ((List) this.f9908c).set(i9, obj);
        }
    }

    @Override
    public final int size() {
        switch (this.f9906a) {
            case 0:
                zzb();
                return this.f9908c.size();
            case 1:
                zzb();
                return this.f9908c.size();
            default:
                n();
                return this.f9908c.size();
        }
    }

    @Override
    public final List subList(int i9, int i10) {
        switch (this.f9906a) {
            case 0:
                zzb();
                h hVar = (h) this.h;
                List subList = ((List) this.f9908c).subList(i9, i10);
                e eVar = (e) this.f9909e;
                if (eVar == null) {
                    eVar = this;
                }
                boolean z10 = subList instanceof RandomAccess;
                Object obj = this.f9907b;
                if (z10) {
                    return new e(hVar, obj, subList, eVar);
                }
                return new e(hVar, obj, subList, eVar);
            case 1:
                zzb();
                List subList2 = ((List) this.f9908c).subList(i9, i10);
                e eVar2 = (e) this.f9909e;
                if (eVar2 == null) {
                    eVar2 = this;
                }
                lg lgVar = (lg) this.h;
                boolean z11 = subList2 instanceof RandomAccess;
                Object obj2 = this.f9907b;
                if (z11) {
                    return new e(lgVar, obj2, subList2, eVar2);
                }
                return new e(lgVar, obj2, subList2, eVar2);
            default:
                n();
                o8.h0 h0Var = (o8.h0) this.h;
                List subList3 = ((List) this.f9908c).subList(i9, i10);
                e eVar3 = (e) this.f9909e;
                if (eVar3 == null) {
                    eVar3 = this;
                }
                boolean z12 = subList3 instanceof RandomAccess;
                Object obj3 = this.f9907b;
                if (z12) {
                    return new e(h0Var, obj3, subList3, eVar3);
                }
                return new e(h0Var, obj3, subList3, eVar3);
        }
    }

    @Override
    public final String toString() {
        switch (this.f9906a) {
            case 0:
                zzb();
                return this.f9908c.toString();
            case 1:
                zzb();
                return this.f9908c.toString();
            default:
                n();
                return this.f9908c.toString();
        }
    }

    public void zzb() {
        Collection collection;
        switch (this.f9906a) {
            case 0:
                e eVar = (e) this.f9909e;
                if (eVar != null) {
                    eVar.zzb();
                    if (eVar.f9908c != this.d) {
                        throw new ConcurrentModificationException();
                    }
                    return;
                } else if (this.f9908c.isEmpty() && (collection = (Collection) ((h) this.f9910f).f9942c.get(this.f9907b)) != null) {
                    this.f9908c = collection;
                    return;
                } else {
                    return;
                }
            default:
                e eVar2 = (e) this.f9909e;
                if (eVar2 != null) {
                    eVar2.zzb();
                    if (eVar2.f9908c != this.d) {
                        throw new ConcurrentModificationException();
                    }
                    return;
                } else if (this.f9908c.isEmpty()) {
                    Collection collection2 = (Collection) ((lg) this.f9910f).f14018c.get(this.f9907b);
                    if (collection2 != null) {
                        this.f9908c = collection2;
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }

    public e(lg lgVar, Object obj, List list, e eVar) {
        this.h = lgVar;
        this.f9910f = lgVar;
        this.f9907b = obj;
        this.f9908c = list;
        this.f9909e = eVar;
        this.d = eVar == null ? null : eVar.f9908c;
    }

    public e(o8.h0 h0Var, Object obj, List list, e eVar) {
        this.h = h0Var;
        this.f9910f = h0Var;
        this.f9907b = obj;
        this.f9908c = list;
        this.f9909e = eVar;
        this.d = eVar == null ? null : eVar.f9908c;
    }

    @Override
    public final ListIterator listIterator(int i9) {
        switch (this.f9906a) {
            case 0:
                zzb();
                return new d(this, i9);
            case 1:
                zzb();
                return new bg(this, i9);
            default:
                n();
                return new o8.i(this, i9);
        }
    }

    @Override
    public final Object remove(int i9) {
        switch (this.f9906a) {
            case 0:
                zzb();
                Object remove = ((List) this.f9908c).remove(i9);
                h hVar = (h) this.h;
                hVar.d--;
                q();
                return remove;
            case 1:
                zzb();
                Object remove2 = ((List) this.f9908c).remove(i9);
                q();
                return remove2;
            default:
                n();
                Object remove3 = ((List) this.f9908c).remove(i9);
                o8.h0 h0Var = (o8.h0) this.h;
                h0Var.f19047e--;
                o();
                return remove3;
        }
    }

    @Override
    public final void add(int i9, Object obj) {
        switch (this.f9906a) {
            case 0:
                zzb();
                boolean isEmpty = this.f9908c.isEmpty();
                ((List) this.f9908c).add(i9, obj);
                ((h) this.h).d++;
                if (isEmpty) {
                    p();
                    return;
                }
                return;
            case 1:
                zzb();
                boolean isEmpty2 = this.f9908c.isEmpty();
                ((List) this.f9908c).add(i9, obj);
                if (isEmpty2) {
                    p();
                    return;
                }
                return;
            default:
                n();
                boolean isEmpty3 = this.f9908c.isEmpty();
                ((List) this.f9908c).add(i9, obj);
                ((o8.h0) this.h).f19047e++;
                if (isEmpty3) {
                    i();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean addAll(int i9, Collection collection) {
        switch (this.f9906a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean addAll = ((List) this.f9908c).addAll(i9, collection);
                if (addAll) {
                    int size2 = this.f9908c.size();
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
                boolean addAll2 = ((List) this.f9908c).addAll(i9, collection);
                if (addAll2) {
                    this.f9908c.size();
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
                boolean addAll3 = ((List) this.f9908c).addAll(i9, collection);
                if (addAll3) {
                    int size5 = this.f9908c.size();
                    ((o8.h0) this.h).f19047e += size5 - size4;
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
