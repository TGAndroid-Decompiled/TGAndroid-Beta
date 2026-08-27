package i7;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;
import k7.de;
import k7.ed;
import k7.lg;

public class c implements Iterator {

    public final int f10599a;

    public final Iterator f10600b;

    public Object f10601c;
    public final Object d;

    public c(e eVar, ListIterator listIterator) {
        this.f10599a = 0;
        this.d = eVar;
        this.f10601c = eVar.f10617c;
        this.f10600b = listIterator;
    }

    public void a() {
        e eVar = (e) this.d;
        eVar.n();
        if (eVar.f10617c != ((Collection) this.f10601c)) {
            throw new ConcurrentModificationException();
        }
    }

    public void b() {
        switch (this.f10599a) {
            case 0:
                e eVar = (e) this.d;
                eVar.zzb();
                if (eVar.f10617c != ((Collection) this.f10601c)) {
                    throw new ConcurrentModificationException();
                }
                return;
            default:
                e eVar2 = (e) this.d;
                eVar2.zzb();
                if (eVar2.f10617c != ((Collection) this.f10601c)) {
                    throw new ConcurrentModificationException();
                }
                return;
        }
    }

    @Override
    public final boolean hasNext() {
        switch (this.f10599a) {
            case 0:
                b();
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                b();
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                a();
                break;
        }
        return this.f10600b.hasNext();
    }

    @Override
    public final Object next() {
        switch (this.f10599a) {
            case 0:
                b();
                return this.f10600b.next();
            case 1:
                Map.Entry entry = (Map.Entry) this.f10600b.next();
                this.f10601c = (Collection) entry.getValue();
                wa waVar = (wa) this.d;
                Object key = entry.getKey();
                h hVar = (h) waVar.f10877e;
                Collection collection = (Collection) entry.getValue();
                hVar.getClass();
                List list = (List) collection;
                return new p(key, list instanceof RandomAccess ? new b(hVar, key, list, null) : new e(hVar, key, list, (e) null));
            case 2:
                Map.Entry entry2 = (Map.Entry) this.f10600b.next();
                this.f10601c = entry2;
                return entry2.getKey();
            case 3:
                Map.Entry entry3 = (Map.Entry) this.f10600b.next();
                this.f10601c = (Collection) entry3.getValue();
                Object key2 = entry3.getKey();
                Collection collection2 = (Collection) entry3.getValue();
                lg lgVar = (lg) ((wa) this.d).f10877e;
                lgVar.getClass();
                List list2 = (List) collection2;
                return new k7.f(key2, list2 instanceof RandomAccess ? new de(lgVar, key2, list2, null) : new e(lgVar, key2, list2, (e) null));
            case 4:
                Map.Entry entry4 = (Map.Entry) this.f10600b.next();
                this.f10601c = entry4;
                return entry4.getKey();
            case 5:
                b();
                return this.f10600b.next();
            case 6:
                Map.Entry entry5 = (Map.Entry) this.f10600b.next();
                this.f10601c = (Collection) entry5.getValue();
                return ((wa) this.d).a(entry5);
            case 7:
                Map.Entry entry6 = (Map.Entry) this.f10600b.next();
                this.f10601c = entry6;
                return entry6.getKey();
            default:
                a();
                return this.f10600b.next();
        }
    }

    @Override
    public final void remove() {
        switch (this.f10599a) {
            case 0:
                this.f10600b.remove();
                e eVar = (e) this.d;
                ((h) eVar.f10619f).d--;
                eVar.q();
                return;
            case 1:
                if (!(((Collection) this.f10601c) != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.f10600b.remove();
                ((h) ((wa) this.d).f10877e).d -= ((Collection) this.f10601c).size();
                ((Collection) this.f10601c).clear();
                this.f10601c = null;
                return;
            case 2:
                Map.Entry entry = (Map.Entry) this.f10601c;
                if (!(entry != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                Collection collection = (Collection) entry.getValue();
                this.f10600b.remove();
                ((a) this.d).f10573c.d -= collection.size();
                collection.clear();
                this.f10601c = null;
                return;
            case 3:
                if (!(((Collection) this.f10601c) != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.f10600b.remove();
                ((lg) ((wa) this.d).f10877e).getClass();
                ((Collection) this.f10601c).size();
                ((Collection) this.f10601c).clear();
                this.f10601c = null;
                return;
            case 4:
                Map.Entry entry2 = (Map.Entry) this.f10601c;
                if (!(entry2 != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                Collection collection2 = (Collection) entry2.getValue();
                this.f10600b.remove();
                ((ed) this.d).f14556c.getClass();
                collection2.size();
                collection2.clear();
                this.f10601c = null;
                return;
            case 5:
                this.f10600b.remove();
                ((e) this.d).q();
                return;
            case 6:
                if (!(((Collection) this.f10601c) != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.f10600b.remove();
                ((p8.h0) ((wa) this.d).f10877e).f45546e -= ((Collection) this.f10601c).size();
                ((Collection) this.f10601c).clear();
                this.f10601c = null;
                return;
            case 7:
                Map.Entry entry3 = (Map.Entry) this.f10601c;
                if (!(entry3 != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                Collection collection3 = (Collection) entry3.getValue();
                this.f10600b.remove();
                ((p8.c) this.d).f45531c.f45546e -= collection3.size();
                collection3.clear();
                this.f10601c = null;
                return;
            default:
                this.f10600b.remove();
                e eVar2 = (e) this.d;
                ((p8.h0) eVar2.f10619f).f45546e--;
                eVar2.o();
                return;
        }
    }

    public c(e eVar, ListIterator listIterator, byte b10) {
        this.f10599a = 5;
        this.d = eVar;
        this.f10601c = eVar.f10617c;
        this.f10600b = listIterator;
    }

    public c(AbstractSet abstractSet, Iterator it, int i10) {
        this.f10599a = i10;
        this.d = abstractSet;
        this.f10600b = it;
    }

    public c(e eVar) {
        Iterator it;
        this.f10599a = 0;
        this.d = eVar;
        Collection collection = eVar.f10617c;
        this.f10601c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f10600b = it;
    }

    public c(e eVar, byte b10) {
        Iterator it;
        this.f10599a = 5;
        this.d = eVar;
        Collection collection = eVar.f10617c;
        this.f10601c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f10600b = it;
    }

    public c(wa waVar) {
        this.f10599a = 1;
        this.d = waVar;
        this.f10600b = waVar.f10875b.entrySet().iterator();
    }

    public c(wa waVar, byte b10) {
        this.f10599a = 3;
        this.d = waVar;
        this.f10600b = waVar.f10875b.entrySet().iterator();
    }

    public c(e eVar, char c10) {
        Iterator it;
        this.f10599a = 8;
        this.d = eVar;
        Collection collection = eVar.f10617c;
        this.f10601c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f10600b = it;
    }

    public c(e eVar, ListIterator listIterator, char c10) {
        this.f10599a = 8;
        this.d = eVar;
        this.f10601c = eVar.f10617c;
        this.f10600b = listIterator;
    }

    public c(wa waVar, char c10) {
        this.f10599a = 6;
        this.d = waVar;
        this.f10600b = waVar.f10875b.entrySet().iterator();
    }
}
