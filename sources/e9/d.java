package e9;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;
import v7.u6;
import z7.gd;
import z7.ng;
public class d implements Iterator {
    public final int f8427a;
    public final Iterator f8428b;
    public Object f8429c;
    public final Object d;

    public d(m mVar, ListIterator listIterator, byte b10) {
        this.f8427a = 3;
        this.d = mVar;
        this.f8429c = mVar.f8471c;
        this.f8428b = listIterator;
    }

    public void a() {
        m mVar = (m) this.d;
        mVar.m();
        if (mVar.f8471c == ((Collection) this.f8429c)) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public void b() {
        switch (this.f8427a) {
            case 3:
                m mVar = (m) this.d;
                mVar.zzb();
                if (mVar.f8471c == ((Collection) this.f8429c)) {
                    return;
                }
                throw new ConcurrentModificationException();
            default:
                m mVar2 = (m) this.d;
                mVar2.zzb();
                if (mVar2.f8471c == ((Collection) this.f8429c)) {
                    return;
                }
                throw new ConcurrentModificationException();
        }
    }

    @Override
    public final boolean hasNext() {
        switch (this.f8427a) {
            case 0:
                return this.f8428b.hasNext();
            case 1:
                return this.f8428b.hasNext();
            case 2:
                a();
                return this.f8428b.hasNext();
            case 3:
                b();
                return this.f8428b.hasNext();
            case 4:
                return this.f8428b.hasNext();
            case 5:
                return this.f8428b.hasNext();
            case 6:
                return this.f8428b.hasNext();
            case 7:
                return this.f8428b.hasNext();
            default:
                b();
                return this.f8428b.hasNext();
        }
    }

    @Override
    public final Object next() {
        m mVar;
        m mVar2;
        switch (this.f8427a) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f8428b.next();
                this.f8429c = (Collection) entry.getValue();
                return ((e) this.d).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f8428b.next();
                this.f8429c = entry2;
                return entry2.getKey();
            case 2:
                a();
                return this.f8428b.next();
            case 3:
                b();
                return this.f8428b.next();
            case 4:
                Map.Entry entry3 = (Map.Entry) this.f8428b.next();
                this.f8429c = (Collection) entry3.getValue();
                Object key = entry3.getKey();
                x7.f fVar = (x7.f) ((e) this.d).e;
                fVar.getClass();
                List list = (List) ((Collection) entry3.getValue());
                if (list instanceof RandomAccess) {
                    mVar = new m(fVar, key, list, (m) null);
                } else {
                    mVar = new m(fVar, key, list, (m) null);
                }
                return new x7.l(key, mVar);
            case 5:
                Map.Entry entry4 = (Map.Entry) this.f8428b.next();
                this.f8429c = entry4;
                return entry4.getKey();
            case 6:
                Map.Entry entry5 = (Map.Entry) this.f8428b.next();
                this.f8429c = (Collection) entry5.getValue();
                Object key2 = entry5.getKey();
                ng ngVar = (ng) ((e) this.d).e;
                ngVar.getClass();
                List list2 = (List) ((Collection) entry5.getValue());
                if (list2 instanceof RandomAccess) {
                    mVar2 = new m(ngVar, key2, list2, (m) null);
                } else {
                    mVar2 = new m(ngVar, key2, list2, (m) null);
                }
                return new z7.f(key2, mVar2);
            case 7:
                Map.Entry entry6 = (Map.Entry) this.f8428b.next();
                this.f8429c = entry6;
                return entry6.getKey();
            default:
                b();
                return this.f8428b.next();
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
        switch (this.f8427a) {
            case 0:
                if (((Collection) this.f8429c) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u6.o("no calls to next() since the last call to remove()", z10);
                this.f8428b.remove();
                ((p1) ((e) this.d).e).f8487f -= ((Collection) this.f8429c).size();
                ((Collection) this.f8429c).clear();
                this.f8429c = null;
                return;
            case 1:
                if (((Map.Entry) this.f8429c) != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                u6.o("no calls to next() since the last call to remove()", z11);
                Collection collection = (Collection) ((Map.Entry) this.f8429c).getValue();
                this.f8428b.remove();
                ((f) this.d).f8444c.f8487f -= collection.size();
                collection.clear();
                this.f8429c = null;
                return;
            case 2:
                this.f8428b.remove();
                m mVar = (m) this.d;
                p1 p1Var = (p1) mVar.f8472f;
                p1Var.f8487f--;
                mVar.n();
                return;
            case 3:
                this.f8428b.remove();
                m mVar2 = (m) this.d;
                x7.f fVar = (x7.f) mVar2.f8472f;
                fVar.d--;
                mVar2.p();
                return;
            case 4:
                if (((Collection) this.f8429c) != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    this.f8428b.remove();
                    ((x7.f) ((e) this.d).e).d -= ((Collection) this.f8429c).size();
                    ((Collection) this.f8429c).clear();
                    this.f8429c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 5:
                Map.Entry entry = (Map.Entry) this.f8429c;
                if (entry != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    Collection collection2 = (Collection) entry.getValue();
                    this.f8428b.remove();
                    ((x7.a) this.d).f49333c.d -= collection2.size();
                    collection2.clear();
                    this.f8429c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 6:
                if (((Collection) this.f8429c) != null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14) {
                    this.f8428b.remove();
                    ((ng) ((e) this.d).e).getClass();
                    ((Collection) this.f8429c).size();
                    ((Collection) this.f8429c).clear();
                    this.f8429c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 7:
                Map.Entry entry2 = (Map.Entry) this.f8429c;
                if (entry2 != null) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (z15) {
                    Collection collection3 = (Collection) entry2.getValue();
                    this.f8428b.remove();
                    ((gd) this.d).f50828c.getClass();
                    collection3.size();
                    collection3.clear();
                    this.f8429c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            default:
                this.f8428b.remove();
                ((m) this.d).p();
                return;
        }
    }

    public d(m mVar, ListIterator listIterator, char c10) {
        this.f8427a = 8;
        this.d = mVar;
        this.f8429c = mVar.f8471c;
        this.f8428b = listIterator;
    }

    public d(AbstractSet abstractSet, Iterator it, int i10) {
        this.f8427a = i10;
        this.f8428b = it;
        this.d = abstractSet;
    }

    public d(e eVar, byte b10) {
        this.f8427a = 4;
        this.d = eVar;
        this.f8428b = eVar.f8435b.entrySet().iterator();
    }

    public d(e eVar, char c10) {
        this.f8427a = 6;
        this.d = eVar;
        this.f8428b = eVar.f8435b.entrySet().iterator();
    }

    public d(m mVar, byte b10) {
        Iterator it;
        this.f8427a = 3;
        this.d = mVar;
        Collection collection = mVar.f8471c;
        this.f8429c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f8428b = it;
    }

    public d(m mVar, char c10) {
        Iterator it;
        this.f8427a = 8;
        this.d = mVar;
        Collection collection = mVar.f8471c;
        this.f8429c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f8428b = it;
    }

    public d(m mVar) {
        Iterator it;
        this.f8427a = 2;
        this.d = mVar;
        Collection collection = mVar.f8471c;
        this.f8429c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f8428b = it;
    }

    public d(m mVar, ListIterator listIterator) {
        this.f8427a = 2;
        this.d = mVar;
        this.f8429c = mVar.f8471c;
        this.f8428b = listIterator;
    }

    public d(e eVar) {
        this.f8427a = 0;
        this.d = eVar;
        this.f8428b = eVar.f8435b.entrySet().iterator();
    }
}
