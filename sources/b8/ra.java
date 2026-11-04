package b8;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;
public class ra implements Iterator {
    public final int f3047a;
    public final Iterator f3048b;
    public Object f3049c;
    public final Object d;

    public ra(ah ahVar, ListIterator listIterator) {
        this.f3047a = 2;
        this.d = ahVar;
        this.f3049c = ahVar.f2472c;
        this.f3048b = listIterator;
    }

    public void a() {
        ah ahVar = (ah) this.d;
        ahVar.i();
        if (ahVar.f2472c == ((Collection) this.f3049c)) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public void b() {
        switch (this.f3047a) {
            case 2:
                ah ahVar = (ah) this.d;
                ahVar.zzb();
                if (ahVar.f2472c == ((Collection) this.f3049c)) {
                    return;
                }
                throw new ConcurrentModificationException();
            default:
                ah ahVar2 = (ah) this.d;
                ahVar2.zzb();
                if (ahVar2.f2472c == ((Collection) this.f3049c)) {
                    return;
                }
                throw new ConcurrentModificationException();
        }
    }

    @Override
    public final boolean hasNext() {
        switch (this.f3047a) {
            case 0:
                return this.f3048b.hasNext();
            case 1:
                return this.f3048b.hasNext();
            case 2:
                b();
                return this.f3048b.hasNext();
            case 3:
                return this.f3048b.hasNext();
            case 4:
                return this.f3048b.hasNext();
            case 5:
                a();
                return this.f3048b.hasNext();
            case 6:
                b();
                return this.f3048b.hasNext();
            case 7:
                return this.f3048b.hasNext();
            default:
                return this.f3048b.hasNext();
        }
    }

    @Override
    public final Object next() {
        ah ahVar;
        ah ahVar2;
        switch (this.f3047a) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f3048b.next();
                this.f3049c = (Collection) entry.getValue();
                Object key = entry.getKey();
                dh dhVar = (dh) ((mb) this.d).f2756e;
                dhVar.getClass();
                List list = (List) ((Collection) entry.getValue());
                if (list instanceof RandomAccess) {
                    ahVar = new ah(dhVar, key, list, (ah) null);
                } else {
                    ahVar = new ah(dhVar, key, list, (ah) null);
                }
                return new i(key, ahVar);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f3048b.next();
                this.f3049c = entry2;
                return entry2.getKey();
            case 2:
                b();
                return this.f3048b.next();
            case 3:
                Map.Entry entry3 = (Map.Entry) this.f3048b.next();
                this.f3049c = (Collection) entry3.getValue();
                return ((mb) this.d).b(entry3);
            case 4:
                Map.Entry entry4 = (Map.Entry) this.f3048b.next();
                this.f3049c = entry4;
                return entry4.getKey();
            case 5:
                a();
                return this.f3048b.next();
            case 6:
                b();
                return this.f3048b.next();
            case 7:
                Map.Entry entry5 = (Map.Entry) this.f3048b.next();
                this.f3049c = (Collection) entry5.getValue();
                Object key2 = entry5.getKey();
                z7.e eVar = (z7.e) ((mb) this.d).f2756e;
                eVar.getClass();
                List list2 = (List) ((Collection) entry5.getValue());
                if (list2 instanceof RandomAccess) {
                    ahVar2 = new ah(eVar, key2, list2, (ah) null);
                } else {
                    ahVar2 = new ah(eVar, key2, list2, (ah) null);
                }
                return new z7.k(key2, ahVar2);
            default:
                Map.Entry entry6 = (Map.Entry) this.f3048b.next();
                this.f3049c = entry6;
                return entry6.getKey();
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
        switch (this.f3047a) {
            case 0:
                if (((Collection) this.f3049c) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    this.f3048b.remove();
                    ((dh) ((mb) this.d).f2756e).getClass();
                    ((Collection) this.f3049c).size();
                    ((Collection) this.f3049c).clear();
                    this.f3049c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 1:
                Map.Entry entry = (Map.Entry) this.f3049c;
                if (entry != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    Collection collection = (Collection) entry.getValue();
                    this.f3048b.remove();
                    ((kd) this.d).f2714c.getClass();
                    collection.size();
                    collection.clear();
                    this.f3049c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 2:
                this.f3048b.remove();
                ((ah) this.d).l();
                return;
            case 3:
                if (((Collection) this.f3049c) != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                zb.o("no calls to next() since the last call to remove()", z12);
                this.f3048b.remove();
                ((g9.k1) ((mb) this.d).f2756e).f12092f -= ((Collection) this.f3049c).size();
                ((Collection) this.f3049c).clear();
                this.f3049c = null;
                return;
            case 4:
                if (((Map.Entry) this.f3049c) != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zb.o("no calls to next() since the last call to remove()", z13);
                Collection collection2 = (Collection) ((Map.Entry) this.f3049c).getValue();
                this.f3048b.remove();
                ((g9.d) this.d).f12066c.f12092f -= collection2.size();
                collection2.clear();
                this.f3049c = null;
                return;
            case 5:
                this.f3048b.remove();
                ah ahVar = (ah) this.d;
                g9.k1 k1Var = (g9.k1) ahVar.f2474f;
                k1Var.f12092f--;
                ahVar.j();
                return;
            case 6:
                this.f3048b.remove();
                ah ahVar2 = (ah) this.d;
                z7.e eVar = (z7.e) ahVar2.f2474f;
                eVar.d--;
                ahVar2.l();
                return;
            case 7:
                if (((Collection) this.f3049c) != null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14) {
                    this.f3048b.remove();
                    ((z7.e) ((mb) this.d).f2756e).d -= ((Collection) this.f3049c).size();
                    ((Collection) this.f3049c).clear();
                    this.f3049c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            default:
                Map.Entry entry2 = (Map.Entry) this.f3049c;
                if (entry2 != null) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (z15) {
                    Collection collection3 = (Collection) entry2.getValue();
                    this.f3048b.remove();
                    ((z7.a) this.d).f59795c.d -= collection3.size();
                    collection3.clear();
                    this.f3049c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
    }

    public ra(ah ahVar, ListIterator listIterator, char c2) {
        this.f3047a = 6;
        this.d = ahVar;
        this.f3049c = ahVar.f2472c;
        this.f3048b = listIterator;
    }

    public ra(AbstractSet abstractSet, Iterator it, int i3) {
        this.f3047a = i3;
        this.d = abstractSet;
        this.f3048b = it;
    }

    public ra(mb mbVar) {
        this.f3047a = 0;
        this.d = mbVar;
        this.f3048b = mbVar.f2754b.entrySet().iterator();
    }

    public ra(mb mbVar, char c2) {
        this.f3047a = 7;
        this.d = mbVar;
        this.f3048b = mbVar.f2754b.entrySet().iterator();
    }

    public ra(ah ahVar) {
        Iterator it;
        this.f3047a = 2;
        this.d = ahVar;
        Collection collection = ahVar.f2472c;
        this.f3049c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f3048b = it;
    }

    public ra(ah ahVar, char c2) {
        Iterator it;
        this.f3047a = 6;
        this.d = ahVar;
        Collection collection = ahVar.f2472c;
        this.f3049c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f3048b = it;
    }

    public ra(ah ahVar, byte b10) {
        Iterator it;
        this.f3047a = 5;
        this.d = ahVar;
        Collection collection = ahVar.f2472c;
        this.f3049c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f3048b = it;
    }

    public ra(ah ahVar, ListIterator listIterator, byte b10) {
        this.f3047a = 5;
        this.d = ahVar;
        this.f3049c = ahVar.f2472c;
        this.f3048b = listIterator;
    }

    public ra(mb mbVar, byte b10) {
        this.f3047a = 3;
        this.d = mbVar;
        this.f3048b = mbVar.f2754b.entrySet().iterator();
    }
}
