package j7;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;
import l7.ed;
import l7.lg;
public class c implements Iterator {
    public final int f10972a;
    public final Iterator f10973b;
    public Object f10974c;
    public final Object d;

    public c(e eVar, ListIterator listIterator) {
        this.f10972a = 0;
        this.d = eVar;
        this.f10974c = eVar.f10990c;
        this.f10973b = listIterator;
    }

    public void a() {
        e eVar = (e) this.d;
        eVar.n();
        if (eVar.f10990c == ((Collection) this.f10974c)) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public void b() {
        switch (this.f10972a) {
            case 0:
                e eVar = (e) this.d;
                eVar.zzb();
                if (eVar.f10990c == ((Collection) this.f10974c)) {
                    return;
                }
                throw new ConcurrentModificationException();
            default:
                e eVar2 = (e) this.d;
                eVar2.zzb();
                if (eVar2.f10990c == ((Collection) this.f10974c)) {
                    return;
                }
                throw new ConcurrentModificationException();
        }
    }

    @Override
    public final boolean hasNext() {
        switch (this.f10972a) {
            case 0:
                b();
                return this.f10973b.hasNext();
            case 1:
                return this.f10973b.hasNext();
            case 2:
                return this.f10973b.hasNext();
            case 3:
                return this.f10973b.hasNext();
            case 4:
                return this.f10973b.hasNext();
            case 5:
                b();
                return this.f10973b.hasNext();
            case 6:
                return this.f10973b.hasNext();
            case 7:
                return this.f10973b.hasNext();
            default:
                a();
                return this.f10973b.hasNext();
        }
    }

    @Override
    public final Object next() {
        e eVar;
        e eVar2;
        switch (this.f10972a) {
            case 0:
                b();
                return this.f10973b.next();
            case 1:
                Map.Entry entry = (Map.Entry) this.f10973b.next();
                this.f10974c = (Collection) entry.getValue();
                Object key = entry.getKey();
                h hVar = (h) ((xa) this.d).f11259e;
                hVar.getClass();
                List list = (List) ((Collection) entry.getValue());
                if (list instanceof RandomAccess) {
                    eVar = new e(hVar, key, list, (e) null);
                } else {
                    eVar = new e(hVar, key, list, (e) null);
                }
                return new p(key, eVar);
            case 2:
                Map.Entry entry2 = (Map.Entry) this.f10973b.next();
                this.f10974c = entry2;
                return entry2.getKey();
            case 3:
                Map.Entry entry3 = (Map.Entry) this.f10973b.next();
                this.f10974c = (Collection) entry3.getValue();
                Object key2 = entry3.getKey();
                lg lgVar = (lg) ((xa) this.d).f11259e;
                lgVar.getClass();
                List list2 = (List) ((Collection) entry3.getValue());
                if (list2 instanceof RandomAccess) {
                    eVar2 = new e(lgVar, key2, list2, (e) null);
                } else {
                    eVar2 = new e(lgVar, key2, list2, (e) null);
                }
                return new l7.f(key2, eVar2);
            case 4:
                Map.Entry entry4 = (Map.Entry) this.f10973b.next();
                this.f10974c = entry4;
                return entry4.getKey();
            case 5:
                b();
                return this.f10973b.next();
            case 6:
                Map.Entry entry5 = (Map.Entry) this.f10973b.next();
                this.f10974c = (Collection) entry5.getValue();
                return ((xa) this.d).a(entry5);
            case 7:
                Map.Entry entry6 = (Map.Entry) this.f10973b.next();
                this.f10974c = entry6;
                return entry6.getKey();
            default:
                a();
                return this.f10973b.next();
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
        switch (this.f10972a) {
            case 0:
                this.f10973b.remove();
                e eVar = (e) this.d;
                h hVar = (h) eVar.f10992f;
                hVar.d--;
                eVar.q();
                return;
            case 1:
                if (((Collection) this.f10974c) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    this.f10973b.remove();
                    ((h) ((xa) this.d).f11259e).d -= ((Collection) this.f10974c).size();
                    ((Collection) this.f10974c).clear();
                    this.f10974c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 2:
                Map.Entry entry = (Map.Entry) this.f10974c;
                if (entry != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    Collection collection = (Collection) entry.getValue();
                    this.f10973b.remove();
                    ((a) this.d).f10900c.d -= collection.size();
                    collection.clear();
                    this.f10974c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 3:
                if (((Collection) this.f10974c) != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    this.f10973b.remove();
                    ((lg) ((xa) this.d).f11259e).getClass();
                    ((Collection) this.f10974c).size();
                    ((Collection) this.f10974c).clear();
                    this.f10974c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 4:
                Map.Entry entry2 = (Map.Entry) this.f10974c;
                if (entry2 != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    Collection collection2 = (Collection) entry2.getValue();
                    this.f10973b.remove();
                    ((ed) this.d).f14561c.getClass();
                    collection2.size();
                    collection2.clear();
                    this.f10974c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 5:
                this.f10973b.remove();
                ((e) this.d).q();
                return;
            case 6:
                if (((Collection) this.f10974c) != null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14) {
                    this.f10973b.remove();
                    ((q8.h0) ((xa) this.d).f11259e).f46453e -= ((Collection) this.f10974c).size();
                    ((Collection) this.f10974c).clear();
                    this.f10974c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 7:
                Map.Entry entry3 = (Map.Entry) this.f10974c;
                if (entry3 != null) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (z15) {
                    Collection collection3 = (Collection) entry3.getValue();
                    this.f10973b.remove();
                    ((q8.c) this.d).f46438c.f46453e -= collection3.size();
                    collection3.clear();
                    this.f10974c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            default:
                this.f10973b.remove();
                e eVar2 = (e) this.d;
                q8.h0 h0Var = (q8.h0) eVar2.f10992f;
                h0Var.f46453e--;
                eVar2.o();
                return;
        }
    }

    public c(e eVar, ListIterator listIterator, byte b10) {
        this.f10972a = 5;
        this.d = eVar;
        this.f10974c = eVar.f10990c;
        this.f10973b = listIterator;
    }

    public c(AbstractSet abstractSet, Iterator it, int i10) {
        this.f10972a = i10;
        this.d = abstractSet;
        this.f10973b = it;
    }

    public c(e eVar) {
        Iterator it;
        this.f10972a = 0;
        this.d = eVar;
        Collection collection = eVar.f10990c;
        this.f10974c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f10973b = it;
    }

    public c(e eVar, byte b10) {
        Iterator it;
        this.f10972a = 5;
        this.d = eVar;
        Collection collection = eVar.f10990c;
        this.f10974c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f10973b = it;
    }

    public c(xa xaVar) {
        this.f10972a = 1;
        this.d = xaVar;
        this.f10973b = xaVar.f11257b.entrySet().iterator();
    }

    public c(xa xaVar, byte b10) {
        this.f10972a = 3;
        this.d = xaVar;
        this.f10973b = xaVar.f11257b.entrySet().iterator();
    }

    public c(e eVar, char c3) {
        Iterator it;
        this.f10972a = 8;
        this.d = eVar;
        Collection collection = eVar.f10990c;
        this.f10974c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f10973b = it;
    }

    public c(e eVar, ListIterator listIterator, char c3) {
        this.f10972a = 8;
        this.d = eVar;
        this.f10974c = eVar.f10990c;
        this.f10973b = listIterator;
    }

    public c(xa xaVar, char c3) {
        this.f10972a = 6;
        this.d = xaVar;
        this.f10973b = xaVar.f11257b.entrySet().iterator();
    }
}
