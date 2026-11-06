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
    public final int f357a;
    public final Iterator f358b;
    public Object f359c;
    public final Object d;

    public d(f fVar, ListIterator listIterator) {
        this.f357a = 0;
        this.d = fVar;
        this.f359c = fVar.f388c;
        this.f358b = listIterator;
    }

    public void a() {
        f fVar = (f) this.d;
        fVar.i();
        if (fVar.f388c == ((Collection) this.f359c)) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public void b() {
        switch (this.f357a) {
            case 0:
                f fVar = (f) this.d;
                fVar.zzb();
                if (fVar.f388c == ((Collection) this.f359c)) {
                    return;
                }
                throw new ConcurrentModificationException();
            default:
                f fVar2 = (f) this.d;
                fVar2.zzb();
                if (fVar2.f388c == ((Collection) this.f359c)) {
                    return;
                }
                throw new ConcurrentModificationException();
        }
    }

    @Override
    public final boolean hasNext() {
        switch (this.f357a) {
            case 0:
                b();
                return this.f358b.hasNext();
            case 1:
                return this.f358b.hasNext();
            case 2:
                return this.f358b.hasNext();
            case 3:
                return this.f358b.hasNext();
            case 4:
                return this.f358b.hasNext();
            case 5:
                b();
                return this.f358b.hasNext();
            case 6:
                return this.f358b.hasNext();
            case 7:
                return this.f358b.hasNext();
            default:
                a();
                return this.f358b.hasNext();
        }
    }

    @Override
    public final Object next() {
        f fVar;
        f fVar2;
        switch (this.f357a) {
            case 0:
                b();
                return this.f358b.next();
            case 1:
                Map.Entry entry = (Map.Entry) this.f358b.next();
                this.f359c = (Collection) entry.getValue();
                Object key = entry.getKey();
                i iVar = (i) ((kb) this.d).f515e;
                iVar.getClass();
                List list = (List) ((Collection) entry.getValue());
                if (list instanceof RandomAccess) {
                    fVar = new f(iVar, key, list, (f) null);
                } else {
                    fVar = new f(iVar, key, list, (f) null);
                }
                return new r(key, fVar);
            case 2:
                Map.Entry entry2 = (Map.Entry) this.f358b.next();
                this.f359c = entry2;
                return entry2.getKey();
            case 3:
                Map.Entry entry3 = (Map.Entry) this.f358b.next();
                this.f359c = (Collection) entry3.getValue();
                Object key2 = entry3.getKey();
                jg jgVar = (jg) ((kb) this.d).f515e;
                jgVar.getClass();
                List list2 = (List) ((Collection) entry3.getValue());
                if (list2 instanceof RandomAccess) {
                    fVar2 = new f(jgVar, key2, list2, (f) null);
                } else {
                    fVar2 = new f(jgVar, key2, list2, (f) null);
                }
                return new c8.f(key2, fVar2);
            case 4:
                Map.Entry entry4 = (Map.Entry) this.f358b.next();
                this.f359c = entry4;
                return entry4.getKey();
            case 5:
                b();
                return this.f358b.next();
            case 6:
                Map.Entry entry5 = (Map.Entry) this.f358b.next();
                this.f359c = (Collection) entry5.getValue();
                return ((kb) this.d).b(entry5);
            case 7:
                Map.Entry entry6 = (Map.Entry) this.f358b.next();
                this.f359c = entry6;
                return entry6.getKey();
            default:
                a();
                return this.f358b.next();
        }
    }

    @Override
    public final void remove() {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        switch (this.f357a) {
            case 0:
                this.f358b.remove();
                f fVar = (f) this.d;
                i iVar = (i) fVar.f390f;
                iVar.d--;
                fVar.l();
                return;
            case 1:
                if (((Collection) this.f359c) != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    this.f358b.remove();
                    ((i) ((kb) this.d).f515e).d -= ((Collection) this.f359c).size();
                    ((Collection) this.f359c).clear();
                    this.f359c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 2:
                Map.Entry entry = (Map.Entry) this.f359c;
                if (entry != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    Collection collection = (Collection) entry.getValue();
                    this.f358b.remove();
                    ((b) this.d).f326c.d -= collection.size();
                    collection.clear();
                    this.f359c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 3:
                if (((Collection) this.f359c) != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    this.f358b.remove();
                    ((jg) ((kb) this.d).f515e).getClass();
                    ((Collection) this.f359c).size();
                    ((Collection) this.f359c).clear();
                    this.f359c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 4:
                Map.Entry entry2 = (Map.Entry) this.f359c;
                if (entry2 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    Collection collection2 = (Collection) entry2.getValue();
                    this.f358b.remove();
                    ((cd) this.d).f5408c.getClass();
                    collection2.size();
                    collection2.clear();
                    this.f359c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 5:
                this.f358b.remove();
                ((f) this.d).l();
                return;
            case 6:
                if (((Collection) this.f359c) != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                ia.o("no calls to next() since the last call to remove()", z13);
                this.f358b.remove();
                ((h9.l1) ((kb) this.d).f515e).f14346f -= ((Collection) this.f359c).size();
                ((Collection) this.f359c).clear();
                this.f359c = null;
                return;
            case 7:
                if (((Map.Entry) this.f359c) != null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                ia.o("no calls to next() since the last call to remove()", z14);
                Collection collection3 = (Collection) ((Map.Entry) this.f359c).getValue();
                this.f358b.remove();
                ((h9.d) this.d).f14310c.f14346f -= collection3.size();
                collection3.clear();
                this.f359c = null;
                return;
            default:
                this.f358b.remove();
                f fVar2 = (f) this.d;
                h9.l1 l1Var = (h9.l1) fVar2.f390f;
                l1Var.f14346f--;
                fVar2.j();
                return;
        }
    }

    public d(f fVar, ListIterator listIterator, byte b10) {
        this.f357a = 5;
        this.d = fVar;
        this.f359c = fVar.f388c;
        this.f358b = listIterator;
    }

    public d(AbstractSet abstractSet, Iterator it, int i7) {
        this.f357a = i7;
        this.d = abstractSet;
        this.f358b = it;
    }

    public d(f fVar) {
        Iterator it;
        this.f357a = 0;
        this.d = fVar;
        Collection collection = fVar.f388c;
        this.f359c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f358b = it;
    }

    public d(f fVar, byte b10) {
        Iterator it;
        this.f357a = 5;
        this.d = fVar;
        Collection collection = fVar.f388c;
        this.f359c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f358b = it;
    }

    public d(kb kbVar) {
        this.f357a = 1;
        this.d = kbVar;
        this.f358b = kbVar.f513b.entrySet().iterator();
    }

    public d(kb kbVar, byte b10) {
        this.f357a = 3;
        this.d = kbVar;
        this.f358b = kbVar.f513b.entrySet().iterator();
    }

    public d(f fVar, char c10) {
        Iterator it;
        this.f357a = 8;
        this.d = fVar;
        Collection collection = fVar.f388c;
        this.f359c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f358b = it;
    }

    public d(f fVar, ListIterator listIterator, char c10) {
        this.f357a = 8;
        this.d = fVar;
        this.f359c = fVar.f388c;
        this.f358b = listIterator;
    }

    public d(kb kbVar, char c10) {
        this.f357a = 6;
        this.d = kbVar;
        this.f358b = kbVar.f513b.entrySet().iterator();
    }
}
