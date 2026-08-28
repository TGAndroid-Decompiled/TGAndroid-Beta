package h7;

import j7.ed;
import j7.lg;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;
public class c implements Iterator {
    public final int f9890a;
    public final Iterator f9891b;
    public Object f9892c;
    public final Object d;

    public c(e eVar, ListIterator listIterator) {
        this.f9890a = 0;
        this.d = eVar;
        this.f9892c = eVar.f9908c;
        this.f9891b = listIterator;
    }

    public void a() {
        e eVar = (e) this.d;
        eVar.n();
        if (eVar.f9908c == ((Collection) this.f9892c)) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public void b() {
        switch (this.f9890a) {
            case 0:
                e eVar = (e) this.d;
                eVar.zzb();
                if (eVar.f9908c == ((Collection) this.f9892c)) {
                    return;
                }
                throw new ConcurrentModificationException();
            default:
                e eVar2 = (e) this.d;
                eVar2.zzb();
                if (eVar2.f9908c == ((Collection) this.f9892c)) {
                    return;
                }
                throw new ConcurrentModificationException();
        }
    }

    @Override
    public final boolean hasNext() {
        switch (this.f9890a) {
            case 0:
                b();
                return this.f9891b.hasNext();
            case 1:
                return this.f9891b.hasNext();
            case 2:
                return this.f9891b.hasNext();
            case 3:
                return this.f9891b.hasNext();
            case 4:
                return this.f9891b.hasNext();
            case 5:
                b();
                return this.f9891b.hasNext();
            case 6:
                return this.f9891b.hasNext();
            case 7:
                return this.f9891b.hasNext();
            default:
                a();
                return this.f9891b.hasNext();
        }
    }

    @Override
    public final Object next() {
        e eVar;
        e eVar2;
        switch (this.f9890a) {
            case 0:
                b();
                return this.f9891b.next();
            case 1:
                Map.Entry entry = (Map.Entry) this.f9891b.next();
                this.f9892c = (Collection) entry.getValue();
                Object key = entry.getKey();
                h hVar = (h) ((wa) this.d).f10168e;
                hVar.getClass();
                List list = (List) ((Collection) entry.getValue());
                if (list instanceof RandomAccess) {
                    eVar = new e(hVar, key, list, (e) null);
                } else {
                    eVar = new e(hVar, key, list, (e) null);
                }
                return new p(key, eVar);
            case 2:
                Map.Entry entry2 = (Map.Entry) this.f9891b.next();
                this.f9892c = entry2;
                return entry2.getKey();
            case 3:
                Map.Entry entry3 = (Map.Entry) this.f9891b.next();
                this.f9892c = (Collection) entry3.getValue();
                Object key2 = entry3.getKey();
                lg lgVar = (lg) ((wa) this.d).f10168e;
                lgVar.getClass();
                List list2 = (List) ((Collection) entry3.getValue());
                if (list2 instanceof RandomAccess) {
                    eVar2 = new e(lgVar, key2, list2, (e) null);
                } else {
                    eVar2 = new e(lgVar, key2, list2, (e) null);
                }
                return new j7.f(key2, eVar2);
            case 4:
                Map.Entry entry4 = (Map.Entry) this.f9891b.next();
                this.f9892c = entry4;
                return entry4.getKey();
            case 5:
                b();
                return this.f9891b.next();
            case 6:
                Map.Entry entry5 = (Map.Entry) this.f9891b.next();
                this.f9892c = (Collection) entry5.getValue();
                return ((wa) this.d).a(entry5);
            case 7:
                Map.Entry entry6 = (Map.Entry) this.f9891b.next();
                this.f9892c = entry6;
                return entry6.getKey();
            default:
                a();
                return this.f9891b.next();
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
        switch (this.f9890a) {
            case 0:
                this.f9891b.remove();
                e eVar = (e) this.d;
                h hVar = (h) eVar.f9910f;
                hVar.d--;
                eVar.q();
                return;
            case 1:
                if (((Collection) this.f9892c) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    this.f9891b.remove();
                    ((h) ((wa) this.d).f10168e).d -= ((Collection) this.f9892c).size();
                    ((Collection) this.f9892c).clear();
                    this.f9892c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 2:
                Map.Entry entry = (Map.Entry) this.f9892c;
                if (entry != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    Collection collection = (Collection) entry.getValue();
                    this.f9891b.remove();
                    ((a) this.d).f9864c.d -= collection.size();
                    collection.clear();
                    this.f9892c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 3:
                if (((Collection) this.f9892c) != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    this.f9891b.remove();
                    ((lg) ((wa) this.d).f10168e).getClass();
                    ((Collection) this.f9892c).size();
                    ((Collection) this.f9892c).clear();
                    this.f9892c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 4:
                Map.Entry entry2 = (Map.Entry) this.f9892c;
                if (entry2 != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    Collection collection2 = (Collection) entry2.getValue();
                    this.f9891b.remove();
                    ((ed) this.d).f13702c.getClass();
                    collection2.size();
                    collection2.clear();
                    this.f9892c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 5:
                this.f9891b.remove();
                ((e) this.d).q();
                return;
            case 6:
                if (((Collection) this.f9892c) != null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14) {
                    this.f9891b.remove();
                    ((o8.h0) ((wa) this.d).f10168e).f19047e -= ((Collection) this.f9892c).size();
                    ((Collection) this.f9892c).clear();
                    this.f9892c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 7:
                Map.Entry entry3 = (Map.Entry) this.f9892c;
                if (entry3 != null) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (z15) {
                    Collection collection3 = (Collection) entry3.getValue();
                    this.f9891b.remove();
                    ((o8.c) this.d).f19032c.f19047e -= collection3.size();
                    collection3.clear();
                    this.f9892c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            default:
                this.f9891b.remove();
                e eVar2 = (e) this.d;
                o8.h0 h0Var = (o8.h0) eVar2.f9910f;
                h0Var.f19047e--;
                eVar2.o();
                return;
        }
    }

    public c(e eVar, ListIterator listIterator, byte b10) {
        this.f9890a = 5;
        this.d = eVar;
        this.f9892c = eVar.f9908c;
        this.f9891b = listIterator;
    }

    public c(AbstractSet abstractSet, Iterator it, int i9) {
        this.f9890a = i9;
        this.d = abstractSet;
        this.f9891b = it;
    }

    public c(e eVar) {
        Iterator it;
        this.f9890a = 0;
        this.d = eVar;
        Collection collection = eVar.f9908c;
        this.f9892c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f9891b = it;
    }

    public c(e eVar, byte b10) {
        Iterator it;
        this.f9890a = 5;
        this.d = eVar;
        Collection collection = eVar.f9908c;
        this.f9892c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f9891b = it;
    }

    public c(wa waVar) {
        this.f9890a = 1;
        this.d = waVar;
        this.f9891b = waVar.f10166b.entrySet().iterator();
    }

    public c(wa waVar, byte b10) {
        this.f9890a = 3;
        this.d = waVar;
        this.f9891b = waVar.f10166b.entrySet().iterator();
    }

    public c(e eVar, char c10) {
        Iterator it;
        this.f9890a = 8;
        this.d = eVar;
        Collection collection = eVar.f9908c;
        this.f9892c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f9891b = it;
    }

    public c(e eVar, ListIterator listIterator, char c10) {
        this.f9890a = 8;
        this.d = eVar;
        this.f9892c = eVar.f9908c;
        this.f9891b = listIterator;
    }

    public c(wa waVar, char c10) {
        this.f9890a = 6;
        this.d = waVar;
        this.f9891b = waVar.f10166b.entrySet().iterator();
    }
}
