package e9;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import z7.cg;
import z7.mg;
public class m extends AbstractCollection implements List {
    public final int f8588a = 0;
    public final Object f8589b;
    public Collection f8590c;
    public final Collection d;
    public final AbstractCollection e;
    public final Serializable f8591f;
    public final Serializable h;

    public m(x7.f fVar, Object obj, List list, m mVar) {
        this.h = fVar;
        this.f8591f = fVar;
        this.f8589b = obj;
        this.f8590c = list;
        this.e = mVar;
        this.d = mVar == null ? null : mVar.f8590c;
    }

    @Override
    public final void add(int i10, Object obj) {
        switch (this.f8588a) {
            case 0:
                m();
                boolean isEmpty = this.f8590c.isEmpty();
                ((List) this.f8590c).add(i10, obj);
                ((p1) this.h).f8606f++;
                if (isEmpty) {
                    h();
                    return;
                }
                return;
            case 1:
                zzb();
                boolean isEmpty2 = this.f8590c.isEmpty();
                ((List) this.f8590c).add(i10, obj);
                ((x7.f) this.h).d++;
                if (isEmpty2) {
                    o();
                    return;
                }
                return;
            default:
                zzb();
                boolean isEmpty3 = this.f8590c.isEmpty();
                ((List) this.f8590c).add(i10, obj);
                if (isEmpty3) {
                    o();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean addAll(int i10, Collection collection) {
        switch (this.f8588a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean addAll = ((List) this.f8590c).addAll(i10, collection);
                if (addAll) {
                    int size2 = this.f8590c.size();
                    ((p1) this.h).f8606f += size2 - size;
                    if (size == 0) {
                        h();
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
                boolean addAll2 = ((List) this.f8590c).addAll(i10, collection);
                if (addAll2) {
                    int size4 = this.f8590c.size();
                    ((x7.f) this.h).d += size4 - size3;
                    if (size3 == 0) {
                        o();
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
                boolean addAll3 = ((List) this.f8590c).addAll(i10, collection);
                if (addAll3) {
                    this.f8590c.size();
                    if (size5 == 0) {
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
        switch (this.f8588a) {
            case 0:
                int size = size();
                if (size != 0) {
                    this.f8590c.clear();
                    ((p1) this.f8591f).f8606f -= size;
                    n();
                    return;
                }
                return;
            case 1:
                int size2 = size();
                if (size2 != 0) {
                    this.f8590c.clear();
                    ((x7.f) this.f8591f).d -= size2;
                    p();
                    return;
                }
                return;
            default:
                if (size() != 0) {
                    this.f8590c.clear();
                    p();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f8588a) {
            case 0:
                m();
                return this.f8590c.contains(obj);
            case 1:
                zzb();
                return this.f8590c.contains(obj);
            default:
                zzb();
                return this.f8590c.contains(obj);
        }
    }

    @Override
    public final boolean containsAll(Collection collection) {
        switch (this.f8588a) {
            case 0:
                m();
                return this.f8590c.containsAll(collection);
            case 1:
                zzb();
                return this.f8590c.containsAll(collection);
            default:
                zzb();
                return this.f8590c.containsAll(collection);
        }
    }

    @Override
    public final boolean equals(Object obj) {
        switch (this.f8588a) {
            case 0:
                if (obj == this) {
                    return true;
                }
                m();
                return this.f8590c.equals(obj);
            case 1:
                if (obj == this) {
                    return true;
                }
                zzb();
                return this.f8590c.equals(obj);
            default:
                if (obj == this) {
                    return true;
                }
                zzb();
                return this.f8590c.equals(obj);
        }
    }

    @Override
    public final Object get(int i10) {
        switch (this.f8588a) {
            case 0:
                m();
                return ((List) this.f8590c).get(i10);
            case 1:
                zzb();
                return ((List) this.f8590c).get(i10);
            default:
                zzb();
                return ((List) this.f8590c).get(i10);
        }
    }

    public void h() {
        m mVar = (m) this.e;
        if (mVar != null) {
            mVar.h();
        } else {
            ((p1) this.f8591f).e.put(this.f8589b, this.f8590c);
        }
    }

    @Override
    public final int hashCode() {
        switch (this.f8588a) {
            case 0:
                m();
                return this.f8590c.hashCode();
            case 1:
                zzb();
                return this.f8590c.hashCode();
            default:
                zzb();
                return this.f8590c.hashCode();
        }
    }

    @Override
    public final int indexOf(Object obj) {
        switch (this.f8588a) {
            case 0:
                m();
                return ((List) this.f8590c).indexOf(obj);
            case 1:
                zzb();
                return ((List) this.f8590c).indexOf(obj);
            default:
                zzb();
                return ((List) this.f8590c).indexOf(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f8588a) {
            case 0:
                m();
                return new d(this);
            case 1:
                zzb();
                return new d(this, (byte) 0);
            default:
                zzb();
                return new d(this, (char) 0);
        }
    }

    @Override
    public final int lastIndexOf(Object obj) {
        switch (this.f8588a) {
            case 0:
                m();
                return ((List) this.f8590c).lastIndexOf(obj);
            case 1:
                zzb();
                return ((List) this.f8590c).lastIndexOf(obj);
            default:
                zzb();
                return ((List) this.f8590c).lastIndexOf(obj);
        }
    }

    @Override
    public final ListIterator listIterator() {
        switch (this.f8588a) {
            case 0:
                m();
                return new l(this);
            case 1:
                zzb();
                return new x7.c(this);
            default:
                zzb();
                return new cg(this);
        }
    }

    public void m() {
        Collection collection;
        m mVar = (m) this.e;
        if (mVar != null) {
            mVar.m();
            if (mVar.f8590c != this.d) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f8590c.isEmpty() && (collection = (Collection) ((p1) this.f8591f).e.get(this.f8589b)) != null) {
            this.f8590c = collection;
        }
    }

    public void n() {
        m mVar = (m) this.e;
        if (mVar != null) {
            mVar.n();
        } else if (this.f8590c.isEmpty()) {
            ((p1) this.f8591f).e.remove(this.f8589b);
        }
    }

    public void o() {
        switch (this.f8588a) {
            case 1:
                m mVar = (m) this.e;
                if (mVar != null) {
                    mVar.o();
                    return;
                } else {
                    ((x7.f) this.f8591f).f47977c.put(this.f8589b, this.f8590c);
                    return;
                }
            default:
                m mVar2 = (m) this.e;
                if (mVar2 != null) {
                    mVar2.o();
                    return;
                }
                ((mg) this.f8591f).f49722c.put(this.f8589b, this.f8590c);
                return;
        }
    }

    public void p() {
        switch (this.f8588a) {
            case 1:
                m mVar = (m) this.e;
                if (mVar != null) {
                    mVar.p();
                    return;
                } else if (this.f8590c.isEmpty()) {
                    ((x7.f) this.f8591f).f47977c.remove(this.f8589b);
                    return;
                } else {
                    return;
                }
            default:
                m mVar2 = (m) this.e;
                if (mVar2 != null) {
                    mVar2.p();
                    return;
                } else if (this.f8590c.isEmpty()) {
                    ((mg) this.f8591f).f49722c.remove(this.f8589b);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public final Object remove(int i10) {
        switch (this.f8588a) {
            case 0:
                m();
                Object remove = ((List) this.f8590c).remove(i10);
                p1 p1Var = (p1) this.h;
                p1Var.f8606f--;
                n();
                return remove;
            case 1:
                zzb();
                Object remove2 = ((List) this.f8590c).remove(i10);
                x7.f fVar = (x7.f) this.h;
                fVar.d--;
                p();
                return remove2;
            default:
                zzb();
                Object remove3 = ((List) this.f8590c).remove(i10);
                p();
                return remove3;
        }
    }

    @Override
    public final boolean removeAll(Collection collection) {
        switch (this.f8588a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean removeAll = this.f8590c.removeAll(collection);
                if (removeAll) {
                    int size2 = this.f8590c.size();
                    ((p1) this.f8591f).f8606f += size2 - size;
                    n();
                    return removeAll;
                }
                return removeAll;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean removeAll2 = this.f8590c.removeAll(collection);
                if (removeAll2) {
                    int size4 = this.f8590c.size();
                    ((x7.f) this.f8591f).d += size4 - size3;
                    p();
                    return removeAll2;
                }
                return removeAll2;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                size();
                boolean removeAll3 = this.f8590c.removeAll(collection);
                if (removeAll3) {
                    this.f8590c.size();
                    p();
                    return removeAll3;
                }
                return removeAll3;
        }
    }

    @Override
    public final boolean retainAll(Collection collection) {
        switch (this.f8588a) {
            case 0:
                collection.getClass();
                int size = size();
                boolean retainAll = this.f8590c.retainAll(collection);
                if (retainAll) {
                    int size2 = this.f8590c.size();
                    ((p1) this.f8591f).f8606f += size2 - size;
                    n();
                }
                return retainAll;
            case 1:
                collection.getClass();
                int size3 = size();
                boolean retainAll2 = this.f8590c.retainAll(collection);
                if (retainAll2) {
                    int size4 = this.f8590c.size();
                    ((x7.f) this.f8591f).d += size4 - size3;
                    p();
                }
                return retainAll2;
            default:
                collection.getClass();
                size();
                boolean retainAll3 = this.f8590c.retainAll(collection);
                if (retainAll3) {
                    this.f8590c.size();
                    p();
                }
                return retainAll3;
        }
    }

    @Override
    public final Object set(int i10, Object obj) {
        switch (this.f8588a) {
            case 0:
                m();
                return ((List) this.f8590c).set(i10, obj);
            case 1:
                zzb();
                return ((List) this.f8590c).set(i10, obj);
            default:
                zzb();
                return ((List) this.f8590c).set(i10, obj);
        }
    }

    @Override
    public final int size() {
        switch (this.f8588a) {
            case 0:
                m();
                return this.f8590c.size();
            case 1:
                zzb();
                return this.f8590c.size();
            default:
                zzb();
                return this.f8590c.size();
        }
    }

    @Override
    public final List subList(int i10, int i11) {
        switch (this.f8588a) {
            case 0:
                m();
                p1 p1Var = (p1) this.h;
                List subList = ((List) this.f8590c).subList(i10, i11);
                m mVar = (m) this.e;
                if (mVar == null) {
                    mVar = this;
                }
                boolean z10 = subList instanceof RandomAccess;
                Object obj = this.f8589b;
                if (z10) {
                    return new m(p1Var, obj, subList, mVar);
                }
                return new m(p1Var, obj, subList, mVar);
            case 1:
                zzb();
                x7.f fVar = (x7.f) this.h;
                List subList2 = ((List) this.f8590c).subList(i10, i11);
                m mVar2 = (m) this.e;
                if (mVar2 == null) {
                    mVar2 = this;
                }
                boolean z11 = subList2 instanceof RandomAccess;
                Object obj2 = this.f8589b;
                if (z11) {
                    return new m(fVar, obj2, subList2, mVar2);
                }
                return new m(fVar, obj2, subList2, mVar2);
            default:
                zzb();
                List subList3 = ((List) this.f8590c).subList(i10, i11);
                m mVar3 = (m) this.e;
                if (mVar3 == null) {
                    mVar3 = this;
                }
                mg mgVar = (mg) this.h;
                boolean z12 = subList3 instanceof RandomAccess;
                Object obj3 = this.f8589b;
                if (z12) {
                    return new m(mgVar, obj3, subList3, mVar3);
                }
                return new m(mgVar, obj3, subList3, mVar3);
        }
    }

    @Override
    public final String toString() {
        switch (this.f8588a) {
            case 0:
                m();
                return this.f8590c.toString();
            case 1:
                zzb();
                return this.f8590c.toString();
            default:
                zzb();
                return this.f8590c.toString();
        }
    }

    public void zzb() {
        Collection collection;
        switch (this.f8588a) {
            case 1:
                m mVar = (m) this.e;
                if (mVar != null) {
                    mVar.zzb();
                    if (mVar.f8590c != this.d) {
                        throw new ConcurrentModificationException();
                    }
                    return;
                } else if (this.f8590c.isEmpty() && (collection = (Collection) ((x7.f) this.f8591f).f47977c.get(this.f8589b)) != null) {
                    this.f8590c = collection;
                    return;
                } else {
                    return;
                }
            default:
                m mVar2 = (m) this.e;
                if (mVar2 != null) {
                    mVar2.zzb();
                    if (mVar2.f8590c != this.d) {
                        throw new ConcurrentModificationException();
                    }
                    return;
                } else if (this.f8590c.isEmpty()) {
                    Collection collection2 = (Collection) ((mg) this.f8591f).f49722c.get(this.f8589b);
                    if (collection2 != null) {
                        this.f8590c = collection2;
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }

    public m(mg mgVar, Object obj, List list, m mVar) {
        this.h = mgVar;
        this.f8591f = mgVar;
        this.f8589b = obj;
        this.f8590c = list;
        this.e = mVar;
        this.d = mVar == null ? null : mVar.f8590c;
    }

    public m(p1 p1Var, Object obj, List list, m mVar) {
        this.h = p1Var;
        this.f8591f = p1Var;
        this.f8589b = obj;
        this.f8590c = list;
        this.e = mVar;
        this.d = mVar == null ? null : mVar.f8590c;
    }

    @Override
    public final ListIterator listIterator(int i10) {
        switch (this.f8588a) {
            case 0:
                m();
                return new l(this, i10);
            case 1:
                zzb();
                return new x7.c(this, i10);
            default:
                zzb();
                return new cg(this, i10);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f8588a) {
            case 0:
                m();
                boolean remove = this.f8590c.remove(obj);
                if (remove) {
                    p1 p1Var = (p1) this.f8591f;
                    p1Var.f8606f--;
                    n();
                }
                return remove;
            case 1:
                zzb();
                boolean remove2 = this.f8590c.remove(obj);
                if (remove2) {
                    x7.f fVar = (x7.f) this.f8591f;
                    fVar.d--;
                    p();
                }
                return remove2;
            default:
                zzb();
                boolean remove3 = this.f8590c.remove(obj);
                if (remove3) {
                    p();
                }
                return remove3;
        }
    }

    @Override
    public final boolean add(Object obj) {
        switch (this.f8588a) {
            case 0:
                m();
                boolean isEmpty = this.f8590c.isEmpty();
                boolean add = this.f8590c.add(obj);
                if (add) {
                    ((p1) this.f8591f).f8606f++;
                    if (isEmpty) {
                        h();
                    }
                }
                return add;
            case 1:
                zzb();
                boolean isEmpty2 = this.f8590c.isEmpty();
                boolean add2 = this.f8590c.add(obj);
                if (add2) {
                    ((x7.f) this.f8591f).d++;
                    if (isEmpty2) {
                        o();
                        return true;
                    }
                    return add2;
                }
                return add2;
            default:
                zzb();
                boolean isEmpty3 = this.f8590c.isEmpty();
                boolean add3 = this.f8590c.add(obj);
                if (add3 && isEmpty3) {
                    o();
                    return true;
                }
                return add3;
        }
    }

    @Override
    public final boolean addAll(Collection collection) {
        switch (this.f8588a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean addAll = this.f8590c.addAll(collection);
                if (addAll) {
                    int size2 = this.f8590c.size();
                    ((p1) this.f8591f).f8606f += size2 - size;
                    if (size == 0) {
                        h();
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
                boolean addAll2 = this.f8590c.addAll(collection);
                if (addAll2) {
                    int size4 = this.f8590c.size();
                    ((x7.f) this.f8591f).d += size4 - size3;
                    if (size3 == 0) {
                        o();
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
                boolean addAll3 = this.f8590c.addAll(collection);
                if (addAll3) {
                    this.f8590c.size();
                    if (size5 == 0) {
                        o();
                        return true;
                    }
                    return addAll3;
                }
                return addAll3;
        }
    }
}
