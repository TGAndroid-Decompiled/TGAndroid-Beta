package i7;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import k7.bg;
import k7.de;
import k7.lg;

public class e extends AbstractCollection implements List {

    public final int f10615a = 0;

    public final Object f10616b;

    public Collection f10617c;
    public final Collection d;

    public final AbstractCollection f10618e;

    public final Serializable f10619f;
    public final Serializable h;

    public e(h hVar, Object obj, List list, e eVar) {
        this.h = hVar;
        this.f10619f = hVar;
        this.f10616b = obj;
        this.f10617c = list;
        this.f10618e = eVar;
        this.d = eVar == null ? null : eVar.f10617c;
    }

    @Override
    public final boolean add(Object obj) {
        switch (this.f10615a) {
            case 0:
                zzb();
                boolean zIsEmpty = this.f10617c.isEmpty();
                boolean zAdd = this.f10617c.add(obj);
                if (!zAdd) {
                    return zAdd;
                }
                ((h) this.f10619f).d++;
                if (!zIsEmpty) {
                    return zAdd;
                }
                p();
                return true;
            case 1:
                zzb();
                boolean zIsEmpty2 = this.f10617c.isEmpty();
                boolean zAdd2 = this.f10617c.add(obj);
                if (!zAdd2 || !zIsEmpty2) {
                    return zAdd2;
                }
                p();
                return true;
            default:
                n();
                boolean zIsEmpty3 = this.f10617c.isEmpty();
                boolean zAdd3 = this.f10617c.add(obj);
                if (zAdd3) {
                    ((p8.h0) this.f10619f).f45546e++;
                    if (zIsEmpty3) {
                        i();
                    }
                }
                return zAdd3;
        }
    }

    @Override
    public final boolean addAll(Collection collection) {
        switch (this.f10615a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean zAddAll = this.f10617c.addAll(collection);
                if (!zAddAll) {
                    return zAddAll;
                }
                int size2 = this.f10617c.size();
                ((h) this.f10619f).d += size2 - size;
                if (size != 0) {
                    return zAddAll;
                }
                p();
                return true;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean zAddAll2 = this.f10617c.addAll(collection);
                if (!zAddAll2) {
                    return zAddAll2;
                }
                this.f10617c.size();
                if (size3 != 0) {
                    return zAddAll2;
                }
                p();
                return true;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size4 = size();
                boolean zAddAll3 = this.f10617c.addAll(collection);
                if (!zAddAll3) {
                    return zAddAll3;
                }
                int size5 = this.f10617c.size();
                ((p8.h0) this.f10619f).f45546e += size5 - size4;
                if (size4 != 0) {
                    return zAddAll3;
                }
                i();
                return zAddAll3;
        }
    }

    @Override
    public final void clear() {
        switch (this.f10615a) {
            case 0:
                int size = size();
                if (size != 0) {
                    this.f10617c.clear();
                    ((h) this.f10619f).d -= size;
                    q();
                    break;
                }
                break;
            case 1:
                if (size() != 0) {
                    this.f10617c.clear();
                    q();
                    break;
                }
                break;
            default:
                int size2 = size();
                if (size2 != 0) {
                    this.f10617c.clear();
                    ((p8.h0) this.f10619f).f45546e -= size2;
                    o();
                    break;
                }
                break;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f10615a) {
            case 0:
                zzb();
                break;
            case 1:
                zzb();
                break;
            default:
                n();
                break;
        }
        return this.f10617c.contains(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        switch (this.f10615a) {
            case 0:
                zzb();
                break;
            case 1:
                zzb();
                break;
            default:
                n();
                break;
        }
        return this.f10617c.containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        switch (this.f10615a) {
            case 0:
                if (obj == this) {
                    return true;
                }
                zzb();
                return this.f10617c.equals(obj);
            case 1:
                if (obj == this) {
                    return true;
                }
                zzb();
                return this.f10617c.equals(obj);
            default:
                if (obj == this) {
                    return true;
                }
                n();
                return this.f10617c.equals(obj);
        }
    }

    @Override
    public final Object get(int i10) {
        switch (this.f10615a) {
            case 0:
                zzb();
                break;
            case 1:
                zzb();
                break;
            default:
                n();
                break;
        }
        return ((List) this.f10617c).get(i10);
    }

    @Override
    public final int hashCode() {
        switch (this.f10615a) {
            case 0:
                zzb();
                return this.f10617c.hashCode();
            case 1:
                zzb();
                return this.f10617c.hashCode();
            default:
                n();
                return this.f10617c.hashCode();
        }
    }

    public void i() {
        e eVar = (e) this.f10618e;
        if (eVar != null) {
            eVar.i();
        } else {
            ((p8.h0) this.f10619f).d.put(this.f10616b, this.f10617c);
        }
    }

    @Override
    public final int indexOf(Object obj) {
        switch (this.f10615a) {
            case 0:
                zzb();
                break;
            case 1:
                zzb();
                break;
            default:
                n();
                break;
        }
        return ((List) this.f10617c).indexOf(obj);
    }

    @Override
    public final Iterator iterator() {
        switch (this.f10615a) {
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
        switch (this.f10615a) {
            case 0:
                zzb();
                break;
            case 1:
                zzb();
                break;
            default:
                n();
                break;
        }
        return ((List) this.f10617c).lastIndexOf(obj);
    }

    @Override
    public final ListIterator listIterator() {
        switch (this.f10615a) {
            case 0:
                zzb();
                return new d(this);
            case 1:
                zzb();
                return new bg(this);
            default:
                n();
                return new p8.i(this);
        }
    }

    public void n() {
        Collection collection;
        e eVar = (e) this.f10618e;
        if (eVar != null) {
            eVar.n();
            if (eVar.f10617c != this.d) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f10617c.isEmpty() || (collection = (Collection) ((p8.h0) this.f10619f).d.get(this.f10616b)) == null) {
                return;
            }
            this.f10617c = collection;
        }
    }

    public void o() {
        e eVar = (e) this.f10618e;
        if (eVar != null) {
            eVar.o();
        } else if (this.f10617c.isEmpty()) {
            ((p8.h0) this.f10619f).d.remove(this.f10616b);
        }
    }

    public void p() {
        switch (this.f10615a) {
            case 0:
                e eVar = (e) this.f10618e;
                if (eVar == null) {
                    ((h) this.f10619f).f10651c.put(this.f10616b, this.f10617c);
                } else {
                    eVar.p();
                }
                break;
            default:
                e eVar2 = (e) this.f10618e;
                if (eVar2 == null) {
                    ((lg) this.f10619f).f14872c.put(this.f10616b, this.f10617c);
                } else {
                    eVar2.p();
                }
                break;
        }
    }

    public void q() {
        switch (this.f10615a) {
            case 0:
                e eVar = (e) this.f10618e;
                if (eVar != null) {
                    eVar.q();
                } else if (this.f10617c.isEmpty()) {
                    ((h) this.f10619f).f10651c.remove(this.f10616b);
                }
                break;
            default:
                e eVar2 = (e) this.f10618e;
                if (eVar2 != null) {
                    eVar2.q();
                } else if (this.f10617c.isEmpty()) {
                    lg lgVar = (lg) this.f10619f;
                    lgVar.f14872c.remove(this.f10616b);
                }
                break;
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f10615a) {
            case 0:
                zzb();
                boolean zRemove = this.f10617c.remove(obj);
                if (zRemove) {
                    ((h) this.f10619f).d--;
                    q();
                }
                return zRemove;
            case 1:
                zzb();
                boolean zRemove2 = this.f10617c.remove(obj);
                if (zRemove2) {
                    q();
                }
                return zRemove2;
            default:
                n();
                boolean zRemove3 = this.f10617c.remove(obj);
                if (zRemove3) {
                    ((p8.h0) this.f10619f).f45546e--;
                    o();
                }
                return zRemove3;
        }
    }

    @Override
    public final boolean removeAll(Collection collection) {
        switch (this.f10615a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean zRemoveAll = this.f10617c.removeAll(collection);
                if (!zRemoveAll) {
                    return zRemoveAll;
                }
                int size2 = this.f10617c.size();
                ((h) this.f10619f).d += size2 - size;
                q();
                return zRemoveAll;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                size();
                boolean zRemoveAll2 = this.f10617c.removeAll(collection);
                if (!zRemoveAll2) {
                    return zRemoveAll2;
                }
                this.f10617c.size();
                q();
                return zRemoveAll2;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean zRemoveAll3 = this.f10617c.removeAll(collection);
                if (!zRemoveAll3) {
                    return zRemoveAll3;
                }
                int size4 = this.f10617c.size();
                ((p8.h0) this.f10619f).f45546e += size4 - size3;
                o();
                return zRemoveAll3;
        }
    }

    @Override
    public final boolean retainAll(Collection collection) {
        switch (this.f10615a) {
            case 0:
                collection.getClass();
                int size = size();
                boolean zRetainAll = this.f10617c.retainAll(collection);
                if (zRetainAll) {
                    int size2 = this.f10617c.size();
                    ((h) this.f10619f).d += size2 - size;
                    q();
                }
                return zRetainAll;
            case 1:
                collection.getClass();
                size();
                boolean zRetainAll2 = this.f10617c.retainAll(collection);
                if (zRetainAll2) {
                    this.f10617c.size();
                    q();
                }
                return zRetainAll2;
            default:
                collection.getClass();
                int size3 = size();
                boolean zRetainAll3 = this.f10617c.retainAll(collection);
                if (zRetainAll3) {
                    int size4 = this.f10617c.size();
                    ((p8.h0) this.f10619f).f45546e += size4 - size3;
                    o();
                }
                return zRetainAll3;
        }
    }

    @Override
    public final Object set(int i10, Object obj) {
        switch (this.f10615a) {
            case 0:
                zzb();
                break;
            case 1:
                zzb();
                break;
            default:
                n();
                break;
        }
        return ((List) this.f10617c).set(i10, obj);
    }

    @Override
    public final int size() {
        switch (this.f10615a) {
            case 0:
                zzb();
                break;
            case 1:
                zzb();
                break;
            default:
                n();
                break;
        }
        return this.f10617c.size();
    }

    @Override
    public final List subList(int i10, int i11) {
        switch (this.f10615a) {
            case 0:
                zzb();
                h hVar = (h) this.h;
                List listSubList = ((List) this.f10617c).subList(i10, i11);
                e eVar = (e) this.f10618e;
                if (eVar == null) {
                    eVar = this;
                }
                boolean z10 = listSubList instanceof RandomAccess;
                Object obj = this.f10616b;
                return z10 ? new b(hVar, obj, listSubList, eVar) : new e(hVar, obj, listSubList, eVar);
            case 1:
                zzb();
                List listSubList2 = ((List) this.f10617c).subList(i10, i11);
                e eVar2 = (e) this.f10618e;
                if (eVar2 == null) {
                    eVar2 = this;
                }
                lg lgVar = (lg) this.h;
                boolean z11 = listSubList2 instanceof RandomAccess;
                Object obj2 = this.f10616b;
                return z11 ? new de(lgVar, obj2, listSubList2, eVar2) : new e(lgVar, obj2, listSubList2, eVar2);
            default:
                n();
                p8.h0 h0Var = (p8.h0) this.h;
                List listSubList3 = ((List) this.f10617c).subList(i10, i11);
                e eVar3 = (e) this.f10618e;
                if (eVar3 == null) {
                    eVar3 = this;
                }
                boolean z12 = listSubList3 instanceof RandomAccess;
                Object obj3 = this.f10616b;
                return z12 ? new p8.f(h0Var, obj3, listSubList3, eVar3) : new e(h0Var, obj3, listSubList3, eVar3);
        }
    }

    @Override
    public final String toString() {
        switch (this.f10615a) {
            case 0:
                zzb();
                break;
            case 1:
                zzb();
                break;
            default:
                n();
                break;
        }
        return this.f10617c.toString();
    }

    public void zzb() {
        Collection collection;
        switch (this.f10615a) {
            case 0:
                e eVar = (e) this.f10618e;
                if (eVar != null) {
                    eVar.zzb();
                    if (eVar.f10617c != this.d) {
                        throw new ConcurrentModificationException();
                    }
                    return;
                } else {
                    if (!this.f10617c.isEmpty() || (collection = (Collection) ((h) this.f10619f).f10651c.get(this.f10616b)) == null) {
                        return;
                    }
                    this.f10617c = collection;
                    return;
                }
            default:
                e eVar2 = (e) this.f10618e;
                if (eVar2 != null) {
                    eVar2.zzb();
                    if (eVar2.f10617c != this.d) {
                        throw new ConcurrentModificationException();
                    }
                    return;
                } else {
                    if (this.f10617c.isEmpty()) {
                        Collection collection2 = (Collection) ((lg) this.f10619f).f14872c.get(this.f10616b);
                        if (collection2 != null) {
                            this.f10617c = collection2;
                            return;
                        }
                        return;
                    }
                    return;
                }
        }
    }

    public e(lg lgVar, Object obj, List list, e eVar) {
        this.h = lgVar;
        this.f10619f = lgVar;
        this.f10616b = obj;
        this.f10617c = list;
        this.f10618e = eVar;
        this.d = eVar == null ? null : eVar.f10617c;
    }

    public e(p8.h0 h0Var, Object obj, List list, e eVar) {
        this.h = h0Var;
        this.f10619f = h0Var;
        this.f10616b = obj;
        this.f10617c = list;
        this.f10618e = eVar;
        this.d = eVar == null ? null : eVar.f10617c;
    }

    @Override
    public final ListIterator listIterator(int i10) {
        switch (this.f10615a) {
            case 0:
                zzb();
                return new d(this, i10);
            case 1:
                zzb();
                return new bg(this, i10);
            default:
                n();
                return new p8.i(this, i10);
        }
    }

    @Override
    public final Object remove(int i10) {
        switch (this.f10615a) {
            case 0:
                zzb();
                Object objRemove = ((List) this.f10617c).remove(i10);
                ((h) this.h).d--;
                q();
                return objRemove;
            case 1:
                zzb();
                Object objRemove2 = ((List) this.f10617c).remove(i10);
                q();
                return objRemove2;
            default:
                n();
                Object objRemove3 = ((List) this.f10617c).remove(i10);
                ((p8.h0) this.h).f45546e--;
                o();
                return objRemove3;
        }
    }

    @Override
    public final void add(int i10, Object obj) {
        switch (this.f10615a) {
            case 0:
                zzb();
                boolean zIsEmpty = this.f10617c.isEmpty();
                ((List) this.f10617c).add(i10, obj);
                ((h) this.h).d++;
                if (zIsEmpty) {
                    p();
                }
                break;
            case 1:
                zzb();
                boolean zIsEmpty2 = this.f10617c.isEmpty();
                ((List) this.f10617c).add(i10, obj);
                if (zIsEmpty2) {
                    p();
                }
                break;
            default:
                n();
                boolean zIsEmpty3 = this.f10617c.isEmpty();
                ((List) this.f10617c).add(i10, obj);
                ((p8.h0) this.h).f45546e++;
                if (zIsEmpty3) {
                    i();
                }
                break;
        }
    }

    @Override
    public final boolean addAll(int i10, Collection collection) {
        switch (this.f10615a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean zAddAll = ((List) this.f10617c).addAll(i10, collection);
                if (!zAddAll) {
                    return zAddAll;
                }
                int size2 = this.f10617c.size();
                ((h) this.h).d += size2 - size;
                if (size != 0) {
                    return zAddAll;
                }
                p();
                return true;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean zAddAll2 = ((List) this.f10617c).addAll(i10, collection);
                if (!zAddAll2) {
                    return zAddAll2;
                }
                this.f10617c.size();
                if (size3 != 0) {
                    return zAddAll2;
                }
                p();
                return true;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size4 = size();
                boolean zAddAll3 = ((List) this.f10617c).addAll(i10, collection);
                if (!zAddAll3) {
                    return zAddAll3;
                }
                int size5 = this.f10617c.size();
                ((p8.h0) this.h).f45546e += size5 - size4;
                if (size4 != 0) {
                    return zAddAll3;
                }
                i();
                return zAddAll3;
        }
    }
}
