package a8;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;
public class ta implements Iterator {
    public final int f937a;
    public final Iterator f938b;
    public Object f939c;
    public final Object d;

    public ta(dh dhVar, ListIterator listIterator) {
        this.f937a = 2;
        this.d = dhVar;
        this.f939c = dhVar.f412c;
        this.f938b = listIterator;
    }

    public void a() {
        dh dhVar = (dh) this.d;
        dhVar.m();
        if (dhVar.f412c == ((Collection) this.f939c)) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public void b() {
        switch (this.f937a) {
            case 2:
                dh dhVar = (dh) this.d;
                dhVar.zzb();
                if (dhVar.f412c == ((Collection) this.f939c)) {
                    return;
                }
                throw new ConcurrentModificationException();
            default:
                dh dhVar2 = (dh) this.d;
                dhVar2.zzb();
                if (dhVar2.f412c == ((Collection) this.f939c)) {
                    return;
                }
                throw new ConcurrentModificationException();
        }
    }

    @Override
    public final boolean hasNext() {
        switch (this.f937a) {
            case 0:
                return this.f938b.hasNext();
            case 1:
                return this.f938b.hasNext();
            case 2:
                b();
                return this.f938b.hasNext();
            case 3:
                return this.f938b.hasNext();
            case 4:
                return this.f938b.hasNext();
            case 5:
                a();
                return this.f938b.hasNext();
            case 6:
                b();
                return this.f938b.hasNext();
            case 7:
                return this.f938b.hasNext();
            default:
                return this.f938b.hasNext();
        }
    }

    @Override
    public final Object next() {
        dh dhVar;
        dh dhVar2;
        switch (this.f937a) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f938b.next();
                this.f939c = (Collection) entry.getValue();
                Object key = entry.getKey();
                gh ghVar = (gh) ((pb) this.d).e;
                ghVar.getClass();
                List list = (List) ((Collection) entry.getValue());
                if (list instanceof RandomAccess) {
                    dhVar = new dh(ghVar, key, list, (dh) null);
                } else {
                    dhVar = new dh(ghVar, key, list, (dh) null);
                }
                return new i(key, dhVar);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f938b.next();
                this.f939c = entry2;
                return entry2.getKey();
            case 2:
                b();
                return this.f938b.next();
            case 3:
                Map.Entry entry3 = (Map.Entry) this.f938b.next();
                this.f939c = (Collection) entry3.getValue();
                return ((pb) this.d).a(entry3);
            case 4:
                Map.Entry entry4 = (Map.Entry) this.f938b.next();
                this.f939c = entry4;
                return entry4.getKey();
            case 5:
                a();
                return this.f938b.next();
            case 6:
                b();
                return this.f938b.next();
            case 7:
                Map.Entry entry5 = (Map.Entry) this.f938b.next();
                this.f939c = (Collection) entry5.getValue();
                Object key2 = entry5.getKey();
                y7.e eVar = (y7.e) ((pb) this.d).e;
                eVar.getClass();
                List list2 = (List) ((Collection) entry5.getValue());
                if (list2 instanceof RandomAccess) {
                    dhVar2 = new dh(eVar, key2, list2, (dh) null);
                } else {
                    dhVar2 = new dh(eVar, key2, list2, (dh) null);
                }
                return new y7.k(key2, dhVar2);
            default:
                Map.Entry entry6 = (Map.Entry) this.f938b.next();
                this.f939c = entry6;
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
        switch (this.f937a) {
            case 0:
                if (((Collection) this.f939c) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    this.f938b.remove();
                    ((gh) ((pb) this.d).e).getClass();
                    ((Collection) this.f939c).size();
                    ((Collection) this.f939c).clear();
                    this.f939c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 1:
                Map.Entry entry = (Map.Entry) this.f939c;
                if (entry != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    Collection collection = (Collection) entry.getValue();
                    this.f938b.remove();
                    ((nd) this.d).f634c.getClass();
                    collection.size();
                    collection.clear();
                    this.f939c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 2:
                this.f938b.remove();
                ((dh) this.d).p();
                return;
            case 3:
                if (((Collection) this.f939c) != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                yb.o("no calls to next() since the last call to remove()", z12);
                this.f938b.remove();
                ((f9.k1) ((pb) this.d).e).f10292f -= ((Collection) this.f939c).size();
                ((Collection) this.f939c).clear();
                this.f939c = null;
                return;
            case 4:
                if (((Map.Entry) this.f939c) != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                yb.o("no calls to next() since the last call to remove()", z13);
                Collection collection2 = (Collection) ((Map.Entry) this.f939c).getValue();
                this.f938b.remove();
                ((f9.d) this.d).f10271c.f10292f -= collection2.size();
                collection2.clear();
                this.f939c = null;
                return;
            case 5:
                this.f938b.remove();
                dh dhVar = (dh) this.d;
                f9.k1 k1Var = (f9.k1) dhVar.f413f;
                k1Var.f10292f--;
                dhVar.n();
                return;
            case 6:
                this.f938b.remove();
                dh dhVar2 = (dh) this.d;
                y7.e eVar = (y7.e) dhVar2.f413f;
                eVar.d--;
                dhVar2.p();
                return;
            case 7:
                if (((Collection) this.f939c) != null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14) {
                    this.f938b.remove();
                    ((y7.e) ((pb) this.d).e).d -= ((Collection) this.f939c).size();
                    ((Collection) this.f939c).clear();
                    this.f939c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            default:
                Map.Entry entry2 = (Map.Entry) this.f939c;
                if (entry2 != null) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (z15) {
                    Collection collection3 = (Collection) entry2.getValue();
                    this.f938b.remove();
                    ((y7.a) this.d).f52128c.d -= collection3.size();
                    collection3.clear();
                    this.f939c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
    }

    public ta(dh dhVar, ListIterator listIterator, char c10) {
        this.f937a = 6;
        this.d = dhVar;
        this.f939c = dhVar.f412c;
        this.f938b = listIterator;
    }

    public ta(AbstractSet abstractSet, Iterator it, int i10) {
        this.f937a = i10;
        this.d = abstractSet;
        this.f938b = it;
    }

    public ta(pb pbVar) {
        this.f937a = 0;
        this.d = pbVar;
        this.f938b = pbVar.f739b.entrySet().iterator();
    }

    public ta(pb pbVar, char c10) {
        this.f937a = 7;
        this.d = pbVar;
        this.f938b = pbVar.f739b.entrySet().iterator();
    }

    public ta(dh dhVar) {
        Iterator it;
        this.f937a = 2;
        this.d = dhVar;
        Collection collection = dhVar.f412c;
        this.f939c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f938b = it;
    }

    public ta(dh dhVar, char c10) {
        Iterator it;
        this.f937a = 6;
        this.d = dhVar;
        Collection collection = dhVar.f412c;
        this.f939c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f938b = it;
    }

    public ta(dh dhVar, byte b10) {
        Iterator it;
        this.f937a = 5;
        this.d = dhVar;
        Collection collection = dhVar.f412c;
        this.f939c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f938b = it;
    }

    public ta(dh dhVar, ListIterator listIterator, byte b10) {
        this.f937a = 5;
        this.d = dhVar;
        this.f939c = dhVar.f412c;
        this.f938b = listIterator;
    }

    public ta(pb pbVar, byte b10) {
        this.f937a = 3;
        this.d = pbVar;
        this.f938b = pbVar.f739b.entrySet().iterator();
    }
}
