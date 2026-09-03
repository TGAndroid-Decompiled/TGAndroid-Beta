package l7;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;
import n7.fd;
import n7.mg;
public class c implements Iterator {
    public final int f11813a;
    public final Iterator f11814b;
    public Object f11815c;
    public final Object d;

    public c(AbstractSet abstractSet, Iterator it, int i10) {
        this.f11813a = i10;
        this.d = abstractSet;
        this.f11814b = it;
    }

    public void a() {
        e eVar = (e) this.d;
        eVar.n();
        if (eVar.f11831c == ((Collection) this.f11815c)) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public void b() {
        switch (this.f11813a) {
            case 0:
                e eVar = (e) this.d;
                eVar.zzb();
                if (eVar.f11831c == ((Collection) this.f11815c)) {
                    return;
                }
                throw new ConcurrentModificationException();
            default:
                e eVar2 = (e) this.d;
                eVar2.zzb();
                if (eVar2.f11831c == ((Collection) this.f11815c)) {
                    return;
                }
                throw new ConcurrentModificationException();
        }
    }

    @Override
    public final boolean hasNext() {
        switch (this.f11813a) {
            case 0:
                b();
                return this.f11814b.hasNext();
            case 1:
                return this.f11814b.hasNext();
            case 2:
                return this.f11814b.hasNext();
            case 3:
                return this.f11814b.hasNext();
            case 4:
                return this.f11814b.hasNext();
            case 5:
                b();
                return this.f11814b.hasNext();
            case 6:
                return this.f11814b.hasNext();
            case 7:
                return this.f11814b.hasNext();
            default:
                a();
                return this.f11814b.hasNext();
        }
    }

    @Override
    public final Object next() {
        e eVar;
        e eVar2;
        switch (this.f11813a) {
            case 0:
                b();
                return this.f11814b.next();
            case 1:
                Map.Entry entry = (Map.Entry) this.f11814b.next();
                this.f11815c = (Collection) entry.getValue();
                Object key = entry.getKey();
                h hVar = (h) ((xa) this.d).f12100e;
                hVar.getClass();
                List list = (List) ((Collection) entry.getValue());
                if (list instanceof RandomAccess) {
                    eVar = new e(hVar, key, list, (e) null);
                } else {
                    eVar = new e(hVar, key, list, (e) null);
                }
                return new p(key, eVar);
            case 2:
                Map.Entry entry2 = (Map.Entry) this.f11814b.next();
                this.f11815c = entry2;
                return entry2.getKey();
            case 3:
                Map.Entry entry3 = (Map.Entry) this.f11814b.next();
                this.f11815c = (Collection) entry3.getValue();
                Object key2 = entry3.getKey();
                mg mgVar = (mg) ((xa) this.d).f12100e;
                mgVar.getClass();
                List list2 = (List) ((Collection) entry3.getValue());
                if (list2 instanceof RandomAccess) {
                    eVar2 = new e(mgVar, key2, list2, (e) null);
                } else {
                    eVar2 = new e(mgVar, key2, list2, (e) null);
                }
                return new n7.f(key2, eVar2);
            case 4:
                Map.Entry entry4 = (Map.Entry) this.f11814b.next();
                this.f11815c = entry4;
                return entry4.getKey();
            case 5:
                b();
                return this.f11814b.next();
            case 6:
                Map.Entry entry5 = (Map.Entry) this.f11814b.next();
                this.f11815c = (Collection) entry5.getValue();
                return ((xa) this.d).a(entry5);
            case 7:
                Map.Entry entry6 = (Map.Entry) this.f11814b.next();
                this.f11815c = entry6;
                return entry6.getKey();
            default:
                a();
                return this.f11814b.next();
        }
    }

    @Override
    public final void remove() {
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        switch (this.f11813a) {
            case 0:
                this.f11814b.remove();
                e eVar = (e) this.d;
                h hVar = (h) eVar.f11833f;
                hVar.d--;
                eVar.q();
                return;
            case 1:
                if (((Collection) this.f11815c) != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    this.f11814b.remove();
                    ((h) ((xa) this.d).f12100e).d -= ((Collection) this.f11815c).size();
                    ((Collection) this.f11815c).clear();
                    this.f11815c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 2:
                Map.Entry entry = (Map.Entry) this.f11815c;
                if (entry != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    Collection collection = (Collection) entry.getValue();
                    this.f11814b.remove();
                    ((a) this.d).f11741c.d -= collection.size();
                    collection.clear();
                    this.f11815c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 3:
                if (((Collection) this.f11815c) != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    this.f11814b.remove();
                    ((mg) ((xa) this.d).f12100e).getClass();
                    ((Collection) this.f11815c).size();
                    ((Collection) this.f11815c).clear();
                    this.f11815c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 4:
                Map.Entry entry2 = (Map.Entry) this.f11815c;
                if (entry2 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    Collection collection2 = (Collection) entry2.getValue();
                    this.f11814b.remove();
                    ((fd) this.d).f15343c.getClass();
                    collection2.size();
                    collection2.clear();
                    this.f11815c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 5:
                this.f11814b.remove();
                ((e) this.d).q();
                return;
            case 6:
                if (((Collection) this.f11815c) != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    this.f11814b.remove();
                    ((s8.e0) ((xa) this.d).f12100e).f47132e -= ((Collection) this.f11815c).size();
                    ((Collection) this.f11815c).clear();
                    this.f11815c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 7:
                Map.Entry entry3 = (Map.Entry) this.f11815c;
                if (entry3 != null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14) {
                    Collection collection3 = (Collection) entry3.getValue();
                    this.f11814b.remove();
                    ((s8.c) this.d).f47126c.f47132e -= collection3.size();
                    collection3.clear();
                    this.f11815c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            default:
                this.f11814b.remove();
                e eVar2 = (e) this.d;
                s8.e0 e0Var = (s8.e0) eVar2.f11833f;
                e0Var.f47132e--;
                eVar2.o();
                return;
        }
    }

    public c(e eVar, ListIterator listIterator) {
        this.f11813a = 0;
        this.d = eVar;
        this.f11815c = eVar.f11831c;
        this.f11814b = listIterator;
    }

    public c(e eVar, ListIterator listIterator, byte b10) {
        this.f11813a = 5;
        this.d = eVar;
        this.f11815c = eVar.f11831c;
        this.f11814b = listIterator;
    }

    public c(e eVar) {
        Iterator it;
        this.f11813a = 0;
        this.d = eVar;
        Collection collection = eVar.f11831c;
        this.f11815c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f11814b = it;
    }

    public c(e eVar, byte b10) {
        Iterator it;
        this.f11813a = 5;
        this.d = eVar;
        Collection collection = eVar.f11831c;
        this.f11815c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f11814b = it;
    }

    public c(xa xaVar) {
        this.f11813a = 1;
        this.d = xaVar;
        this.f11814b = xaVar.f12098b.entrySet().iterator();
    }

    public c(xa xaVar, byte b10) {
        this.f11813a = 3;
        this.d = xaVar;
        this.f11814b = xaVar.f12098b.entrySet().iterator();
    }

    public c(e eVar, char c3) {
        Iterator it;
        this.f11813a = 8;
        this.d = eVar;
        Collection collection = eVar.f11831c;
        this.f11815c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f11814b = it;
    }

    public c(e eVar, ListIterator listIterator, char c3) {
        this.f11813a = 8;
        this.d = eVar;
        this.f11815c = eVar.f11831c;
        this.f11814b = listIterator;
    }

    public c(xa xaVar, char c3) {
        this.f11813a = 6;
        this.d = xaVar;
        this.f11814b = xaVar.f12098b.entrySet().iterator();
    }
}
