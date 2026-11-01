package e9;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;
import v7.t6;
import z7.ed;
import z7.mg;
public class d implements Iterator {
    public final int f6341a;
    public final Iterator f6342b;
    public Object f6343c;
    public final Object d;

    public d(m mVar, ListIterator listIterator, byte b10) {
        this.f6341a = 3;
        this.d = mVar;
        this.f6343c = mVar.f6385c;
        this.f6342b = listIterator;
    }

    public void a() {
        m mVar = (m) this.d;
        mVar.m();
        if (mVar.f6385c == ((Collection) this.f6343c)) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public void b() {
        switch (this.f6341a) {
            case 3:
                m mVar = (m) this.d;
                mVar.zzb();
                if (mVar.f6385c == ((Collection) this.f6343c)) {
                    return;
                }
                throw new ConcurrentModificationException();
            default:
                m mVar2 = (m) this.d;
                mVar2.zzb();
                if (mVar2.f6385c == ((Collection) this.f6343c)) {
                    return;
                }
                throw new ConcurrentModificationException();
        }
    }

    @Override
    public final boolean hasNext() {
        switch (this.f6341a) {
            case 0:
                return this.f6342b.hasNext();
            case 1:
                return this.f6342b.hasNext();
            case 2:
                a();
                return this.f6342b.hasNext();
            case 3:
                b();
                return this.f6342b.hasNext();
            case 4:
                return this.f6342b.hasNext();
            case 5:
                return this.f6342b.hasNext();
            case 6:
                return this.f6342b.hasNext();
            case 7:
                return this.f6342b.hasNext();
            default:
                b();
                return this.f6342b.hasNext();
        }
    }

    @Override
    public final Object next() {
        m mVar;
        m mVar2;
        switch (this.f6341a) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f6342b.next();
                this.f6343c = (Collection) entry.getValue();
                return ((e) this.d).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f6342b.next();
                this.f6343c = entry2;
                return entry2.getKey();
            case 2:
                a();
                return this.f6342b.next();
            case 3:
                b();
                return this.f6342b.next();
            case 4:
                Map.Entry entry3 = (Map.Entry) this.f6342b.next();
                this.f6343c = (Collection) entry3.getValue();
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
                Map.Entry entry4 = (Map.Entry) this.f6342b.next();
                this.f6343c = entry4;
                return entry4.getKey();
            case 6:
                Map.Entry entry5 = (Map.Entry) this.f6342b.next();
                this.f6343c = (Collection) entry5.getValue();
                Object key2 = entry5.getKey();
                mg mgVar = (mg) ((e) this.d).e;
                mgVar.getClass();
                List list2 = (List) ((Collection) entry5.getValue());
                if (list2 instanceof RandomAccess) {
                    mVar2 = new m(mgVar, key2, list2, (m) null);
                } else {
                    mVar2 = new m(mgVar, key2, list2, (m) null);
                }
                return new z7.f(key2, mVar2);
            case 7:
                Map.Entry entry6 = (Map.Entry) this.f6342b.next();
                this.f6343c = entry6;
                return entry6.getKey();
            default:
                b();
                return this.f6342b.next();
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
        switch (this.f6341a) {
            case 0:
                if (((Collection) this.f6343c) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t6.o("no calls to next() since the last call to remove()", z10);
                this.f6342b.remove();
                ((p1) ((e) this.d).e).f6401f -= ((Collection) this.f6343c).size();
                ((Collection) this.f6343c).clear();
                this.f6343c = null;
                return;
            case 1:
                if (((Map.Entry) this.f6343c) != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                t6.o("no calls to next() since the last call to remove()", z11);
                Collection collection = (Collection) ((Map.Entry) this.f6343c).getValue();
                this.f6342b.remove();
                ((f) this.d).f6358c.f6401f -= collection.size();
                collection.clear();
                this.f6343c = null;
                return;
            case 2:
                this.f6342b.remove();
                m mVar = (m) this.d;
                p1 p1Var = (p1) mVar.f6386f;
                p1Var.f6401f--;
                mVar.n();
                return;
            case 3:
                this.f6342b.remove();
                m mVar2 = (m) this.d;
                x7.f fVar = (x7.f) mVar2.f6386f;
                fVar.d--;
                mVar2.p();
                return;
            case 4:
                if (((Collection) this.f6343c) != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    this.f6342b.remove();
                    ((x7.f) ((e) this.d).e).d -= ((Collection) this.f6343c).size();
                    ((Collection) this.f6343c).clear();
                    this.f6343c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 5:
                Map.Entry entry = (Map.Entry) this.f6343c;
                if (entry != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    Collection collection2 = (Collection) entry.getValue();
                    this.f6342b.remove();
                    ((x7.a) this.d).f53107c.d -= collection2.size();
                    collection2.clear();
                    this.f6343c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 6:
                if (((Collection) this.f6343c) != null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14) {
                    this.f6342b.remove();
                    ((mg) ((e) this.d).e).getClass();
                    ((Collection) this.f6343c).size();
                    ((Collection) this.f6343c).clear();
                    this.f6343c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 7:
                Map.Entry entry2 = (Map.Entry) this.f6343c;
                if (entry2 != null) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (z15) {
                    Collection collection3 = (Collection) entry2.getValue();
                    this.f6342b.remove();
                    ((ed) this.d).f54722c.getClass();
                    collection3.size();
                    collection3.clear();
                    this.f6343c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            default:
                this.f6342b.remove();
                ((m) this.d).p();
                return;
        }
    }

    public d(m mVar, ListIterator listIterator, char c10) {
        this.f6341a = 8;
        this.d = mVar;
        this.f6343c = mVar.f6385c;
        this.f6342b = listIterator;
    }

    public d(AbstractSet abstractSet, Iterator it, int i10) {
        this.f6341a = i10;
        this.f6342b = it;
        this.d = abstractSet;
    }

    public d(e eVar, byte b10) {
        this.f6341a = 4;
        this.d = eVar;
        this.f6342b = eVar.f6349b.entrySet().iterator();
    }

    public d(e eVar, char c10) {
        this.f6341a = 6;
        this.d = eVar;
        this.f6342b = eVar.f6349b.entrySet().iterator();
    }

    public d(m mVar, byte b10) {
        Iterator it;
        this.f6341a = 3;
        this.d = mVar;
        Collection collection = mVar.f6385c;
        this.f6343c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f6342b = it;
    }

    public d(m mVar, char c10) {
        Iterator it;
        this.f6341a = 8;
        this.d = mVar;
        Collection collection = mVar.f6385c;
        this.f6343c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f6342b = it;
    }

    public d(m mVar) {
        Iterator it;
        this.f6341a = 2;
        this.d = mVar;
        Collection collection = mVar.f6385c;
        this.f6343c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f6342b = it;
    }

    public d(m mVar, ListIterator listIterator) {
        this.f6341a = 2;
        this.d = mVar;
        this.f6343c = mVar.f6385c;
        this.f6342b = listIterator;
    }

    public d(e eVar) {
        this.f6341a = 0;
        this.d = eVar;
        this.f6342b = eVar.f6349b.entrySet().iterator();
    }
}
