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
public class m extends AbstractCollection implements List {
    public final int f8585a = 0;
    public final Object f8586b;
    public Collection f8587c;
    public final Collection d;
    public final AbstractCollection e;
    public final Serializable f8588f;
    public final Serializable h;

    public m(x7.f fVar, Object obj, List list, m mVar) {
        this.h = fVar;
        this.f8588f = fVar;
        this.f8586b = obj;
        this.f8587c = list;
        this.e = mVar;
        this.d = mVar == null ? null : mVar.f8587c;
    }

    @Override
    public final void add(int i10, Object obj) {
        switch (this.f8585a) {
            case 0:
                m();
                boolean isEmpty = this.f8587c.isEmpty();
                ((List) this.f8587c).add(i10, obj);
                ((p1) this.h).f8603f++;
                if (isEmpty) {
                    h();
                    return;
                }
                return;
            case 1:
                zzb();
                boolean isEmpty2 = this.f8587c.isEmpty();
                ((List) this.f8587c).add(i10, obj);
                ((x7.f) this.h).d++;
                if (isEmpty2) {
                    o();
                    return;
                }
                return;
            default:
                zzb();
                boolean isEmpty3 = this.f8587c.isEmpty();
                ((List) this.f8587c).add(i10, obj);
                if (isEmpty3) {
                    o();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean addAll(int i10, Collection collection) {
        switch (this.f8585a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean addAll = ((List) this.f8587c).addAll(i10, collection);
                if (addAll) {
                    int size2 = this.f8587c.size();
                    ((p1) this.h).f8603f += size2 - size;
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
                boolean addAll2 = ((List) this.f8587c).addAll(i10, collection);
                if (addAll2) {
                    int size4 = this.f8587c.size();
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
                boolean addAll3 = ((List) this.f8587c).addAll(i10, collection);
                if (addAll3) {
                    this.f8587c.size();
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
        switch (this.f8585a) {
            case 0:
                int size = size();
                if (size != 0) {
                    this.f8587c.clear();
                    ((p1) this.f8588f).f8603f -= size;
                    n();
                    return;
                }
                return;
            case 1:
                int size2 = size();
                if (size2 != 0) {
                    this.f8587c.clear();
                    ((x7.f) this.f8588f).d -= size2;
                    p();
                    return;
                }
                return;
            default:
                if (size() != 0) {
                    this.f8587c.clear();
                    p();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f8585a) {
            case 0:
                m();
                return this.f8587c.contains(obj);
            case 1:
                zzb();
                return this.f8587c.contains(obj);
            default:
                zzb();
                return this.f8587c.contains(obj);
        }
    }

    @Override
    public final boolean containsAll(Collection collection) {
        switch (this.f8585a) {
            case 0:
                m();
                return this.f8587c.containsAll(collection);
            case 1:
                zzb();
                return this.f8587c.containsAll(collection);
            default:
                zzb();
                return this.f8587c.containsAll(collection);
        }
    }

    @Override
    public final boolean equals(Object obj) {
        switch (this.f8585a) {
            case 0:
                if (obj == this) {
                    return true;
                }
                m();
                return this.f8587c.equals(obj);
            case 1:
                if (obj == this) {
                    return true;
                }
                zzb();
                return this.f8587c.equals(obj);
            default:
                if (obj == this) {
                    return true;
                }
                zzb();
                return this.f8587c.equals(obj);
        }
    }

    @Override
    public final Object get(int i10) {
        switch (this.f8585a) {
            case 0:
                m();
                return ((List) this.f8587c).get(i10);
            case 1:
                zzb();
                return ((List) this.f8587c).get(i10);
            default:
                zzb();
                return ((List) this.f8587c).get(i10);
        }
    }

    public void h() {
        m mVar = (m) this.e;
        if (mVar != null) {
            mVar.h();
        } else {
            ((p1) this.f8588f).e.put(this.f8586b, this.f8587c);
        }
    }

    @Override
    public final int hashCode() {
        switch (this.f8585a) {
            case 0:
                m();
                return this.f8587c.hashCode();
            case 1:
                zzb();
                return this.f8587c.hashCode();
            default:
                zzb();
                return this.f8587c.hashCode();
        }
    }

    @Override
    public final int indexOf(Object obj) {
        switch (this.f8585a) {
            case 0:
                m();
                return ((List) this.f8587c).indexOf(obj);
            case 1:
                zzb();
                return ((List) this.f8587c).indexOf(obj);
            default:
                zzb();
                return ((List) this.f8587c).indexOf(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f8585a) {
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
        switch (this.f8585a) {
            case 0:
                m();
                return ((List) this.f8587c).lastIndexOf(obj);
            case 1:
                zzb();
                return ((List) this.f8587c).lastIndexOf(obj);
            default:
                zzb();
                return ((List) this.f8587c).lastIndexOf(obj);
        }
    }

    @Override
    public final ListIterator listIterator() {
        switch (this.f8585a) {
            case 0:
                m();
                return new l(this);
            case 1:
                zzb();
                return new x7.c(this);
            default:
                zzb();
                return new bg(this);
        }
    }

    public void m() {
        Collection collection;
        m mVar = (m) this.e;
        if (mVar != null) {
            mVar.m();
            if (mVar.f8587c != this.d) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f8587c.isEmpty() && (collection = (Collection) ((p1) this.f8588f).e.get(this.f8586b)) != null) {
            this.f8587c = collection;
        }
    }

    public void n() {
        m mVar = (m) this.e;
        if (mVar != null) {
            mVar.n();
        } else if (this.f8587c.isEmpty()) {
            ((p1) this.f8588f).e.remove(this.f8586b);
        }
    }

    public void o() {
        switch (this.f8585a) {
            case 1:
                m mVar = (m) this.e;
                if (mVar != null) {
                    mVar.o();
                    return;
                } else {
                    ((x7.f) this.f8588f).f47978c.put(this.f8586b, this.f8587c);
                    return;
                }
            default:
                m mVar2 = (m) this.e;
                if (mVar2 != null) {
                    mVar2.o();
                    return;
                }
                ((lg) this.f8588f).f49708c.put(this.f8586b, this.f8587c);
                return;
        }
    }

    public void p() {
        switch (this.f8585a) {
            case 1:
                m mVar = (m) this.e;
                if (mVar != null) {
                    mVar.p();
                    return;
                } else if (this.f8587c.isEmpty()) {
                    ((x7.f) this.f8588f).f47978c.remove(this.f8586b);
                    return;
                } else {
                    return;
                }
            default:
                m mVar2 = (m) this.e;
                if (mVar2 != null) {
                    mVar2.p();
                    return;
                } else if (this.f8587c.isEmpty()) {
                    ((lg) this.f8588f).f49708c.remove(this.f8586b);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public final Object remove(int i10) {
        switch (this.f8585a) {
            case 0:
                m();
                Object remove = ((List) this.f8587c).remove(i10);
                p1 p1Var = (p1) this.h;
                p1Var.f8603f--;
                n();
                return remove;
            case 1:
                zzb();
                Object remove2 = ((List) this.f8587c).remove(i10);
                x7.f fVar = (x7.f) this.h;
                fVar.d--;
                p();
                return remove2;
            default:
                zzb();
                Object remove3 = ((List) this.f8587c).remove(i10);
                p();
                return remove3;
        }
    }

    @Override
    public final boolean removeAll(Collection collection) {
        switch (this.f8585a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean removeAll = this.f8587c.removeAll(collection);
                if (removeAll) {
                    int size2 = this.f8587c.size();
                    ((p1) this.f8588f).f8603f += size2 - size;
                    n();
                    return removeAll;
                }
                return removeAll;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean removeAll2 = this.f8587c.removeAll(collection);
                if (removeAll2) {
                    int size4 = this.f8587c.size();
                    ((x7.f) this.f8588f).d += size4 - size3;
                    p();
                    return removeAll2;
                }
                return removeAll2;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                size();
                boolean removeAll3 = this.f8587c.removeAll(collection);
                if (removeAll3) {
                    this.f8587c.size();
                    p();
                    return removeAll3;
                }
                return removeAll3;
        }
    }

    @Override
    public final boolean retainAll(Collection collection) {
        switch (this.f8585a) {
            case 0:
                collection.getClass();
                int size = size();
                boolean retainAll = this.f8587c.retainAll(collection);
                if (retainAll) {
                    int size2 = this.f8587c.size();
                    ((p1) this.f8588f).f8603f += size2 - size;
                    n();
                }
                return retainAll;
            case 1:
                collection.getClass();
                int size3 = size();
                boolean retainAll2 = this.f8587c.retainAll(collection);
                if (retainAll2) {
                    int size4 = this.f8587c.size();
                    ((x7.f) this.f8588f).d += size4 - size3;
                    p();
                }
                return retainAll2;
            default:
                collection.getClass();
                size();
                boolean retainAll3 = this.f8587c.retainAll(collection);
                if (retainAll3) {
                    this.f8587c.size();
                    p();
                }
                return retainAll3;
        }
    }

    @Override
    public final Object set(int i10, Object obj) {
        switch (this.f8585a) {
            case 0:
                m();
                return ((List) this.f8587c).set(i10, obj);
            case 1:
                zzb();
                return ((List) this.f8587c).set(i10, obj);
            default:
                zzb();
                return ((List) this.f8587c).set(i10, obj);
        }
    }

    @Override
    public final int size() {
        switch (this.f8585a) {
            case 0:
                m();
                return this.f8587c.size();
            case 1:
                zzb();
                return this.f8587c.size();
            default:
                zzb();
                return this.f8587c.size();
        }
    }

    @Override
    public final List subList(int i10, int i11) {
        switch (this.f8585a) {
            case 0:
                m();
                p1 p1Var = (p1) this.h;
                List subList = ((List) this.f8587c).subList(i10, i11);
                m mVar = (m) this.e;
                if (mVar == null) {
                    mVar = this;
                }
                boolean z10 = subList instanceof RandomAccess;
                Object obj = this.f8586b;
                if (z10) {
                    return new m(p1Var, obj, subList, mVar);
                }
                return new m(p1Var, obj, subList, mVar);
            case 1:
                zzb();
                x7.f fVar = (x7.f) this.h;
                List subList2 = ((List) this.f8587c).subList(i10, i11);
                m mVar2 = (m) this.e;
                if (mVar2 == null) {
                    mVar2 = this;
                }
                boolean z11 = subList2 instanceof RandomAccess;
                Object obj2 = this.f8586b;
                if (z11) {
                    return new m(fVar, obj2, subList2, mVar2);
                }
                return new m(fVar, obj2, subList2, mVar2);
            default:
                zzb();
                List subList3 = ((List) this.f8587c).subList(i10, i11);
                m mVar3 = (m) this.e;
                if (mVar3 == null) {
                    mVar3 = this;
                }
                lg lgVar = (lg) this.h;
                boolean z12 = subList3 instanceof RandomAccess;
                Object obj3 = this.f8586b;
                if (z12) {
                    return new m(lgVar, obj3, subList3, mVar3);
                }
                return new m(lgVar, obj3, subList3, mVar3);
        }
    }

    @Override
    public final String toString() {
        switch (this.f8585a) {
            case 0:
                m();
                return this.f8587c.toString();
            case 1:
                zzb();
                return this.f8587c.toString();
            default:
                zzb();
                return this.f8587c.toString();
        }
    }

    public void zzb() {
        Collection collection;
        switch (this.f8585a) {
            case 1:
                m mVar = (m) this.e;
                if (mVar != null) {
                    mVar.zzb();
                    if (mVar.f8587c != this.d) {
                        throw new ConcurrentModificationException();
                    }
                    return;
                } else if (this.f8587c.isEmpty() && (collection = (Collection) ((x7.f) this.f8588f).f47978c.get(this.f8586b)) != null) {
                    this.f8587c = collection;
                    return;
                } else {
                    return;
                }
            default:
                m mVar2 = (m) this.e;
                if (mVar2 != null) {
                    mVar2.zzb();
                    if (mVar2.f8587c != this.d) {
                        throw new ConcurrentModificationException();
                    }
                    return;
                } else if (this.f8587c.isEmpty()) {
                    Collection collection2 = (Collection) ((lg) this.f8588f).f49708c.get(this.f8586b);
                    if (collection2 != null) {
                        this.f8587c = collection2;
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }

    public m(lg lgVar, Object obj, List list, m mVar) {
        this.h = lgVar;
        this.f8588f = lgVar;
        this.f8586b = obj;
        this.f8587c = list;
        this.e = mVar;
        this.d = mVar == null ? null : mVar.f8587c;
    }

    public m(p1 p1Var, Object obj, List list, m mVar) {
        this.h = p1Var;
        this.f8588f = p1Var;
        this.f8586b = obj;
        this.f8587c = list;
        this.e = mVar;
        this.d = mVar == null ? null : mVar.f8587c;
    }

    @Override
    public final ListIterator listIterator(int i10) {
        switch (this.f8585a) {
            case 0:
                m();
                return new l(this, i10);
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
        switch (this.f8585a) {
            case 0:
                m();
                boolean remove = this.f8587c.remove(obj);
                if (remove) {
                    p1 p1Var = (p1) this.f8588f;
                    p1Var.f8603f--;
                    n();
                }
                return remove;
            case 1:
                zzb();
                boolean remove2 = this.f8587c.remove(obj);
                if (remove2) {
                    x7.f fVar = (x7.f) this.f8588f;
                    fVar.d--;
                    p();
                }
                return remove2;
            default:
                zzb();
                boolean remove3 = this.f8587c.remove(obj);
                if (remove3) {
                    p();
                }
                return remove3;
        }
    }

    @Override
    public final boolean add(Object obj) {
        switch (this.f8585a) {
            case 0:
                m();
                boolean isEmpty = this.f8587c.isEmpty();
                boolean add = this.f8587c.add(obj);
                if (add) {
                    ((p1) this.f8588f).f8603f++;
                    if (isEmpty) {
                        h();
                    }
                }
                return add;
            case 1:
                zzb();
                boolean isEmpty2 = this.f8587c.isEmpty();
                boolean add2 = this.f8587c.add(obj);
                if (add2) {
                    ((x7.f) this.f8588f).d++;
                    if (isEmpty2) {
                        o();
                        return true;
                    }
                    return add2;
                }
                return add2;
            default:
                zzb();
                boolean isEmpty3 = this.f8587c.isEmpty();
                boolean add3 = this.f8587c.add(obj);
                if (add3 && isEmpty3) {
                    o();
                    return true;
                }
                return add3;
        }
    }

    @Override
    public final boolean addAll(Collection collection) {
        switch (this.f8585a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean addAll = this.f8587c.addAll(collection);
                if (addAll) {
                    int size2 = this.f8587c.size();
                    ((p1) this.f8588f).f8603f += size2 - size;
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
                boolean addAll2 = this.f8587c.addAll(collection);
                if (addAll2) {
                    int size4 = this.f8587c.size();
                    ((x7.f) this.f8588f).d += size4 - size3;
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
                boolean addAll3 = this.f8587c.addAll(collection);
                if (addAll3) {
                    this.f8587c.size();
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
