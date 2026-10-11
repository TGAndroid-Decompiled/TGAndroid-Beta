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
import z7.mg;
public class c implements Iterator {
    public final int f8718a;
    public final Iterator f8719b;
    public Object f8720c;
    public final Object d;

    public c(l lVar, ListIterator listIterator, byte b10) {
        this.f8718a = 3;
        this.d = lVar;
        this.f8720c = lVar.f8765c;
        this.f8719b = listIterator;
    }

    public void a() {
        l lVar = (l) this.d;
        lVar.n();
        if (lVar.f8765c == ((Collection) this.f8720c)) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public void b() {
        switch (this.f8718a) {
            case 3:
                l lVar = (l) this.d;
                lVar.zzb();
                if (lVar.f8765c == ((Collection) this.f8720c)) {
                    return;
                }
                throw new ConcurrentModificationException();
            default:
                l lVar2 = (l) this.d;
                lVar2.zzb();
                if (lVar2.f8765c == ((Collection) this.f8720c)) {
                    return;
                }
                throw new ConcurrentModificationException();
        }
    }

    @Override
    public final boolean hasNext() {
        switch (this.f8718a) {
            case 0:
                return this.f8719b.hasNext();
            case 1:
                return this.f8719b.hasNext();
            case 2:
                a();
                return this.f8719b.hasNext();
            case 3:
                b();
                return this.f8719b.hasNext();
            case 4:
                return this.f8719b.hasNext();
            case 5:
                return this.f8719b.hasNext();
            case 6:
                return this.f8719b.hasNext();
            case 7:
                return this.f8719b.hasNext();
            default:
                b();
                return this.f8719b.hasNext();
        }
    }

    @Override
    public final Object next() {
        l lVar;
        l lVar2;
        switch (this.f8718a) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f8719b.next();
                this.f8720c = (Collection) entry.getValue();
                return ((d) this.d).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f8719b.next();
                this.f8720c = entry2;
                return entry2.getKey();
            case 2:
                a();
                return this.f8719b.next();
            case 3:
                b();
                return this.f8719b.next();
            case 4:
                Map.Entry entry3 = (Map.Entry) this.f8719b.next();
                this.f8720c = (Collection) entry3.getValue();
                Object key = entry3.getKey();
                x7.f fVar = (x7.f) ((d) this.d).f8726e;
                fVar.getClass();
                List list = (List) ((Collection) entry3.getValue());
                if (list instanceof RandomAccess) {
                    lVar = new l(fVar, key, list, (l) null);
                } else {
                    lVar = new l(fVar, key, list, (l) null);
                }
                return new x7.l(key, lVar);
            case 5:
                Map.Entry entry4 = (Map.Entry) this.f8719b.next();
                this.f8720c = entry4;
                return entry4.getKey();
            case 6:
                Map.Entry entry5 = (Map.Entry) this.f8719b.next();
                this.f8720c = (Collection) entry5.getValue();
                Object key2 = entry5.getKey();
                mg mgVar = (mg) ((d) this.d).f8726e;
                mgVar.getClass();
                List list2 = (List) ((Collection) entry5.getValue());
                if (list2 instanceof RandomAccess) {
                    lVar2 = new l(mgVar, key2, list2, (l) null);
                } else {
                    lVar2 = new l(mgVar, key2, list2, (l) null);
                }
                return new z7.f(key2, lVar2);
            case 7:
                Map.Entry entry6 = (Map.Entry) this.f8719b.next();
                this.f8720c = entry6;
                return entry6.getKey();
            default:
                b();
                return this.f8719b.next();
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
        switch (this.f8718a) {
            case 0:
                if (((Collection) this.f8720c) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    this.f8719b.remove();
                    ((v0) ((d) this.d).f8726e).f8813e -= ((Collection) this.f8720c).size();
                    ((Collection) this.f8720c).clear();
                    this.f8720c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 1:
                Map.Entry entry = (Map.Entry) this.f8720c;
                if (entry != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    Collection collection = (Collection) entry.getValue();
                    this.f8719b.remove();
                    ((e) this.d).f8730c.f8813e -= collection.size();
                    collection.clear();
                    this.f8720c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 2:
                this.f8719b.remove();
                l lVar = (l) this.d;
                v0 v0Var = (v0) lVar.f8767f;
                v0Var.f8813e--;
                lVar.o();
                return;
            case 3:
                this.f8719b.remove();
                l lVar2 = (l) this.d;
                x7.f fVar = (x7.f) lVar2.f8767f;
                fVar.d--;
                lVar2.q();
                return;
            case 4:
                if (((Collection) this.f8720c) != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    this.f8719b.remove();
                    ((x7.f) ((d) this.d).f8726e).d -= ((Collection) this.f8720c).size();
                    ((Collection) this.f8720c).clear();
                    this.f8720c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 5:
                Map.Entry entry2 = (Map.Entry) this.f8720c;
                if (entry2 != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    Collection collection2 = (Collection) entry2.getValue();
                    this.f8719b.remove();
                    ((x7.a) this.d).f50781c.d -= collection2.size();
                    collection2.clear();
                    this.f8720c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 6:
                if (((Collection) this.f8720c) != null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14) {
                    this.f8719b.remove();
                    ((mg) ((d) this.d).f8726e).getClass();
                    ((Collection) this.f8720c).size();
                    ((Collection) this.f8720c).clear();
                    this.f8720c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 7:
                Map.Entry entry3 = (Map.Entry) this.f8720c;
                if (entry3 != null) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (z15) {
                    Collection collection3 = (Collection) entry3.getValue();
                    this.f8719b.remove();
                    ((ed) this.d).f53741c.getClass();
                    collection3.size();
                    collection3.clear();
                    this.f8720c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            default:
                this.f8719b.remove();
                ((l) this.d).q();
                return;
        }
    }

    public c(l lVar, ListIterator listIterator, char c10) {
        this.f8718a = 8;
        this.d = lVar;
        this.f8720c = lVar.f8765c;
        this.f8719b = listIterator;
    }

    public c(AbstractSet abstractSet, Iterator it, int i10) {
        this.f8718a = i10;
        this.f8719b = it;
        this.d = abstractSet;
    }

    public c(d dVar, byte b10) {
        this.f8718a = 4;
        this.d = dVar;
        this.f8719b = dVar.f8724b.entrySet().iterator();
    }

    public c(d dVar, char c10) {
        this.f8718a = 6;
        this.d = dVar;
        this.f8719b = dVar.f8724b.entrySet().iterator();
    }

    public c(l lVar, byte b10) {
        Iterator it;
        this.f8718a = 3;
        this.d = lVar;
        Collection collection = lVar.f8765c;
        this.f8720c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f8719b = it;
    }

    public c(l lVar, char c10) {
        Iterator it;
        this.f8718a = 8;
        this.d = lVar;
        Collection collection = lVar.f8765c;
        this.f8720c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f8719b = it;
    }

    public c(l lVar) {
        Iterator it;
        this.f8718a = 2;
        this.d = lVar;
        Collection collection = lVar.f8765c;
        this.f8720c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f8719b = it;
    }

    public c(l lVar, ListIterator listIterator) {
        this.f8718a = 2;
        this.d = lVar;
        this.f8720c = lVar.f8765c;
        this.f8719b = listIterator;
    }

    public c(d dVar) {
        this.f8718a = 0;
        this.d = dVar;
        this.f8719b = dVar.f8724b.entrySet().iterator();
    }
}
