package a8;

import c8.cd;
import c8.jg;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;
public class d implements Iterator {
    public final int f363a;
    public final Iterator f364b;
    public Object f365c;
    public final Object d;

    public d(f fVar, ListIterator listIterator) {
        this.f363a = 0;
        this.d = fVar;
        this.f365c = fVar.f387c;
        this.f364b = listIterator;
    }

    public void a() {
        f fVar = (f) this.d;
        fVar.i();
        if (fVar.f387c == ((Collection) this.f365c)) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public void b() {
        switch (this.f363a) {
            case 0:
                f fVar = (f) this.d;
                fVar.zzb();
                if (fVar.f387c == ((Collection) this.f365c)) {
                    return;
                }
                throw new ConcurrentModificationException();
            default:
                f fVar2 = (f) this.d;
                fVar2.zzb();
                if (fVar2.f387c == ((Collection) this.f365c)) {
                    return;
                }
                throw new ConcurrentModificationException();
        }
    }

    @Override
    public final boolean hasNext() {
        switch (this.f363a) {
            case 0:
                b();
                return this.f364b.hasNext();
            case 1:
                return this.f364b.hasNext();
            case 2:
                return this.f364b.hasNext();
            case 3:
                return this.f364b.hasNext();
            case 4:
                return this.f364b.hasNext();
            case 5:
                b();
                return this.f364b.hasNext();
            case 6:
                return this.f364b.hasNext();
            case 7:
                return this.f364b.hasNext();
            default:
                a();
                return this.f364b.hasNext();
        }
    }

    @Override
    public final Object next() {
        f fVar;
        f fVar2;
        switch (this.f363a) {
            case 0:
                b();
                return this.f364b.next();
            case 1:
                Map.Entry entry = (Map.Entry) this.f364b.next();
                this.f365c = (Collection) entry.getValue();
                Object key = entry.getKey();
                i iVar = (i) ((lb) this.d).f535e;
                iVar.getClass();
                List list = (List) ((Collection) entry.getValue());
                if (list instanceof RandomAccess) {
                    fVar = new f(iVar, key, list, (f) null);
                } else {
                    fVar = new f(iVar, key, list, (f) null);
                }
                return new r(key, fVar);
            case 2:
                Map.Entry entry2 = (Map.Entry) this.f364b.next();
                this.f365c = entry2;
                return entry2.getKey();
            case 3:
                Map.Entry entry3 = (Map.Entry) this.f364b.next();
                this.f365c = (Collection) entry3.getValue();
                Object key2 = entry3.getKey();
                jg jgVar = (jg) ((lb) this.d).f535e;
                jgVar.getClass();
                List list2 = (List) ((Collection) entry3.getValue());
                if (list2 instanceof RandomAccess) {
                    fVar2 = new f(jgVar, key2, list2, (f) null);
                } else {
                    fVar2 = new f(jgVar, key2, list2, (f) null);
                }
                return new c8.f(key2, fVar2);
            case 4:
                Map.Entry entry4 = (Map.Entry) this.f364b.next();
                this.f365c = entry4;
                return entry4.getKey();
            case 5:
                b();
                return this.f364b.next();
            case 6:
                Map.Entry entry5 = (Map.Entry) this.f364b.next();
                this.f365c = (Collection) entry5.getValue();
                return ((lb) this.d).b(entry5);
            case 7:
                Map.Entry entry6 = (Map.Entry) this.f364b.next();
                this.f365c = entry6;
                return entry6.getKey();
            default:
                a();
                return this.f364b.next();
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
        switch (this.f363a) {
            case 0:
                this.f364b.remove();
                f fVar = (f) this.d;
                i iVar = (i) fVar.f389f;
                iVar.d--;
                fVar.l();
                return;
            case 1:
                if (((Collection) this.f365c) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    this.f364b.remove();
                    ((i) ((lb) this.d).f535e).d -= ((Collection) this.f365c).size();
                    ((Collection) this.f365c).clear();
                    this.f365c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 2:
                Map.Entry entry = (Map.Entry) this.f365c;
                if (entry != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    Collection collection = (Collection) entry.getValue();
                    this.f364b.remove();
                    ((b) this.d).f332c.d -= collection.size();
                    collection.clear();
                    this.f365c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 3:
                if (((Collection) this.f365c) != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    this.f364b.remove();
                    ((jg) ((lb) this.d).f535e).getClass();
                    ((Collection) this.f365c).size();
                    ((Collection) this.f365c).clear();
                    this.f365c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 4:
                Map.Entry entry2 = (Map.Entry) this.f365c;
                if (entry2 != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    Collection collection2 = (Collection) entry2.getValue();
                    this.f364b.remove();
                    ((cd) this.d).f4551c.getClass();
                    collection2.size();
                    collection2.clear();
                    this.f365c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 5:
                this.f364b.remove();
                ((f) this.d).l();
                return;
            case 6:
                if (((Collection) this.f365c) != null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                la.o("no calls to next() since the last call to remove()", z14);
                this.f364b.remove();
                ((h9.l1) ((lb) this.d).f535e).f14052f -= ((Collection) this.f365c).size();
                ((Collection) this.f365c).clear();
                this.f365c = null;
                return;
            case 7:
                if (((Map.Entry) this.f365c) != null) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                la.o("no calls to next() since the last call to remove()", z15);
                Collection collection3 = (Collection) ((Map.Entry) this.f365c).getValue();
                this.f364b.remove();
                ((h9.d) this.d).f14016c.f14052f -= collection3.size();
                collection3.clear();
                this.f365c = null;
                return;
            default:
                this.f364b.remove();
                f fVar2 = (f) this.d;
                h9.l1 l1Var = (h9.l1) fVar2.f389f;
                l1Var.f14052f--;
                fVar2.j();
                return;
        }
    }

    public d(f fVar, ListIterator listIterator, byte b10) {
        this.f363a = 5;
        this.d = fVar;
        this.f365c = fVar.f387c;
        this.f364b = listIterator;
    }

    public d(AbstractSet abstractSet, Iterator it, int i7) {
        this.f363a = i7;
        this.d = abstractSet;
        this.f364b = it;
    }

    public d(f fVar) {
        Iterator it;
        this.f363a = 0;
        this.d = fVar;
        Collection collection = fVar.f387c;
        this.f365c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f364b = it;
    }

    public d(f fVar, byte b10) {
        Iterator it;
        this.f363a = 5;
        this.d = fVar;
        Collection collection = fVar.f387c;
        this.f365c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f364b = it;
    }

    public d(lb lbVar) {
        this.f363a = 1;
        this.d = lbVar;
        this.f364b = lbVar.f533b.entrySet().iterator();
    }

    public d(lb lbVar, byte b10) {
        this.f363a = 3;
        this.d = lbVar;
        this.f364b = lbVar.f533b.entrySet().iterator();
    }

    public d(f fVar, char c10) {
        Iterator it;
        this.f363a = 8;
        this.d = fVar;
        Collection collection = fVar.f387c;
        this.f365c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f364b = it;
    }

    public d(f fVar, ListIterator listIterator, char c10) {
        this.f363a = 8;
        this.d = fVar;
        this.f365c = fVar.f387c;
        this.f364b = listIterator;
    }

    public d(lb lbVar, char c10) {
        this.f363a = 6;
        this.d = lbVar;
        this.f364b = lbVar.f533b.entrySet().iterator();
    }
}
