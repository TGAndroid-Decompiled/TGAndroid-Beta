package e9;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;
import z7.ed;
import z7.lg;
public class c implements Iterator {
    public final int f8725a;
    public final Iterator f8726b;
    public Object f8727c;
    public final Object d;

    public c(l lVar, ListIterator listIterator, byte b10) {
        this.f8725a = 3;
        this.d = lVar;
        this.f8727c = lVar.f8772c;
        this.f8726b = listIterator;
    }

    public void a() {
        l lVar = (l) this.d;
        lVar.n();
        if (lVar.f8772c == ((Collection) this.f8727c)) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public void b() {
        switch (this.f8725a) {
            case 3:
                l lVar = (l) this.d;
                lVar.zzb();
                if (lVar.f8772c == ((Collection) this.f8727c)) {
                    return;
                }
                throw new ConcurrentModificationException();
            default:
                l lVar2 = (l) this.d;
                lVar2.zzb();
                if (lVar2.f8772c == ((Collection) this.f8727c)) {
                    return;
                }
                throw new ConcurrentModificationException();
        }
    }

    @Override
    public final boolean hasNext() {
        switch (this.f8725a) {
            case 0:
                return this.f8726b.hasNext();
            case 1:
                return this.f8726b.hasNext();
            case 2:
                a();
                return this.f8726b.hasNext();
            case 3:
                b();
                return this.f8726b.hasNext();
            case 4:
                return this.f8726b.hasNext();
            case 5:
                return this.f8726b.hasNext();
            case 6:
                return this.f8726b.hasNext();
            case 7:
                return this.f8726b.hasNext();
            default:
                b();
                return this.f8726b.hasNext();
        }
    }

    @Override
    public final Object next() {
        l lVar;
        l lVar2;
        switch (this.f8725a) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f8726b.next();
                this.f8727c = (Collection) entry.getValue();
                return ((d) this.d).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f8726b.next();
                this.f8727c = entry2;
                return entry2.getKey();
            case 2:
                a();
                return this.f8726b.next();
            case 3:
                b();
                return this.f8726b.next();
            case 4:
                Map.Entry entry3 = (Map.Entry) this.f8726b.next();
                this.f8727c = (Collection) entry3.getValue();
                Object key = entry3.getKey();
                x7.f fVar = (x7.f) ((d) this.d).f8733e;
                fVar.getClass();
                List list = (List) ((Collection) entry3.getValue());
                if (list instanceof RandomAccess) {
                    lVar = new l(fVar, key, list, (l) null);
                } else {
                    lVar = new l(fVar, key, list, (l) null);
                }
                return new x7.l(key, lVar);
            case 5:
                Map.Entry entry4 = (Map.Entry) this.f8726b.next();
                this.f8727c = entry4;
                return entry4.getKey();
            case 6:
                Map.Entry entry5 = (Map.Entry) this.f8726b.next();
                this.f8727c = (Collection) entry5.getValue();
                Object key2 = entry5.getKey();
                lg lgVar = (lg) ((d) this.d).f8733e;
                lgVar.getClass();
                List list2 = (List) ((Collection) entry5.getValue());
                if (list2 instanceof RandomAccess) {
                    lVar2 = new l(lgVar, key2, list2, (l) null);
                } else {
                    lVar2 = new l(lgVar, key2, list2, (l) null);
                }
                return new z7.f(key2, lVar2);
            case 7:
                Map.Entry entry6 = (Map.Entry) this.f8726b.next();
                this.f8727c = entry6;
                return entry6.getKey();
            default:
                b();
                return this.f8726b.next();
        }
    }

    @Override
    public final void remove() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        switch (this.f8725a) {
            case 0:
                if (((Collection) this.f8727c) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    this.f8726b.remove();
                    ((v0) ((d) this.d).f8733e).f8820e -= ((Collection) this.f8727c).size();
                    ((Collection) this.f8727c).clear();
                    this.f8727c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 1:
                Map.Entry entry = (Map.Entry) this.f8727c;
                if (entry != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    Collection collection = (Collection) entry.getValue();
                    this.f8726b.remove();
                    ((e) this.d).f8737c.f8820e -= collection.size();
                    collection.clear();
                    this.f8727c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 2:
                this.f8726b.remove();
                l lVar = (l) this.d;
                v0 v0Var = (v0) lVar.f8774f;
                v0Var.f8820e--;
                lVar.o();
                return;
            case 3:
                this.f8726b.remove();
                l lVar2 = (l) this.d;
                x7.f fVar = (x7.f) lVar2.f8774f;
                fVar.d--;
                lVar2.q();
                return;
            case 4:
                if (((Collection) this.f8727c) != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    this.f8726b.remove();
                    ((x7.f) ((d) this.d).f8733e).d -= ((Collection) this.f8727c).size();
                    ((Collection) this.f8727c).clear();
                    this.f8727c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 5:
                Map.Entry entry2 = (Map.Entry) this.f8727c;
                if (entry2 != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    Collection collection2 = (Collection) entry2.getValue();
                    this.f8726b.remove();
                    ((x7.a) this.d).f49417c.d -= collection2.size();
                    collection2.clear();
                    this.f8727c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 6:
                if (((Collection) this.f8727c) != null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14) {
                    this.f8726b.remove();
                    ((lg) ((d) this.d).f8733e).getClass();
                    ((Collection) this.f8727c).size();
                    ((Collection) this.f8727c).clear();
                    this.f8727c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 7:
                Map.Entry entry3 = (Map.Entry) this.f8727c;
                if (entry3 != null) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (z15) {
                    Collection collection3 = (Collection) entry3.getValue();
                    this.f8726b.remove();
                    ((ed) this.d).f52542c.getClass();
                    collection3.size();
                    collection3.clear();
                    this.f8727c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            default:
                this.f8726b.remove();
                ((l) this.d).q();
                return;
        }
    }

    public c(l lVar, ListIterator listIterator, char c10) {
        this.f8725a = 8;
        this.d = lVar;
        this.f8727c = lVar.f8772c;
        this.f8726b = listIterator;
    }

    public c(AbstractSet abstractSet, Iterator it, int i10) {
        this.f8725a = i10;
        this.f8726b = it;
        this.d = abstractSet;
    }

    public c(d dVar, byte b10) {
        this.f8725a = 4;
        this.d = dVar;
        this.f8726b = dVar.f8731b.entrySet().iterator();
    }

    public c(d dVar, char c10) {
        this.f8725a = 6;
        this.d = dVar;
        this.f8726b = dVar.f8731b.entrySet().iterator();
    }

    public c(l lVar, byte b10) {
        Iterator it;
        this.f8725a = 3;
        this.d = lVar;
        Collection collection = lVar.f8772c;
        this.f8727c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f8726b = it;
    }

    public c(l lVar, char c10) {
        Iterator it;
        this.f8725a = 8;
        this.d = lVar;
        Collection collection = lVar.f8772c;
        this.f8727c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f8726b = it;
    }

    public c(l lVar) {
        Iterator it;
        this.f8725a = 2;
        this.d = lVar;
        Collection collection = lVar.f8772c;
        this.f8727c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f8726b = it;
    }

    public c(l lVar, ListIterator listIterator) {
        this.f8725a = 2;
        this.d = lVar;
        this.f8727c = lVar.f8772c;
        this.f8726b = listIterator;
    }

    public c(d dVar) {
        this.f8725a = 0;
        this.d = dVar;
        this.f8726b = dVar.f8731b.entrySet().iterator();
    }
}
