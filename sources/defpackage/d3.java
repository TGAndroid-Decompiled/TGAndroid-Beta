package defpackage;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;
public class d3 implements Iterator {
    public final byte a;
    public final Iterator b;
    public Object c;
    public final Object d;

    public d3(m3 m3Var, byte b) {
        Iterator it;
        this.a = (byte) 3;
        this.d = m3Var;
        Collection collection = m3Var.c;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public final void a() {
        m3 m3Var = (m3) this.d;
        m3Var.i();
        if (m3Var.c == ((Collection) this.c)) {
            return;
        }
        bg.b();
    }

    public final void b() {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 3:
                m3 m3Var = (m3) obj;
                m3Var.zzb();
                if (m3Var.c != ((Collection) this.c)) {
                    bg.b();
                    return;
                }
                return;
            default:
                m3 m3Var2 = (m3) obj;
                m3Var2.zzb();
                if (m3Var2.c != ((Collection) this.c)) {
                    bg.b();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.b.hasNext();
            case 1:
                return this.b.hasNext();
            case 2:
                a();
                return this.b.hasNext();
            case 3:
                b();
                return this.b.hasNext();
            case 4:
                return this.b.hasNext();
            case 5:
                b();
                return this.b.hasNext();
            case 6:
                return this.b.hasNext();
            default:
                return this.b.hasNext();
        }
    }

    @Override
    public final Object next() {
        m3 m3Var;
        m3 m3Var2;
        byte b = this.a;
        Object obj = this.d;
        Iterator it = this.b;
        switch (b) {
            case 0:
                Map.Entry entry = (Map.Entry) it.next();
                this.c = (Collection) entry.getValue();
                return ((e3) obj).b(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) it.next();
                this.c = entry2;
                return entry2.getKey();
            case 2:
                a();
                return it.next();
            case 3:
                b();
                return it.next();
            case 4:
                Map.Entry entry3 = (Map.Entry) it.next();
                this.c = (Collection) entry3.getValue();
                Object key = entry3.getKey();
                lmf lmfVar = (lmf) ((e3) obj).e;
                List list = (List) ((Collection) entry3.getValue());
                if (list instanceof RandomAccess) {
                    m3Var = new m3(lmfVar, key, list, (m3) null);
                } else {
                    m3Var = new m3(lmfVar, key, list, (m3) null);
                }
                return new tdd(key, m3Var);
            case 5:
                b();
                return it.next();
            case 6:
                Map.Entry entry4 = (Map.Entry) it.next();
                this.c = (Collection) entry4.getValue();
                Object key2 = entry4.getKey();
                ccd ccdVar = (ccd) ((e3) obj).e;
                List list2 = (List) ((Collection) entry4.getValue());
                if (list2 instanceof RandomAccess) {
                    m3Var2 = new m3(ccdVar, key2, list2, (m3) null);
                } else {
                    m3Var2 = new m3(ccdVar, key2, list2, (m3) null);
                }
                return new mgd(key2, m3Var2);
            default:
                Map.Entry entry5 = (Map.Entry) it.next();
                this.c = entry5;
                return entry5.getKey();
        }
    }

    @Override
    public final void remove() {
        byte b = this.a;
        boolean z = false;
        Object obj = this.d;
        Iterator it = this.b;
        switch (b) {
            case 0:
                if (((Collection) this.c) != null) {
                    z = true;
                }
                yve.o("no calls to next() since the last call to remove()", z);
                it.remove();
                ((gj7) ((e3) obj).e).f -= ((Collection) this.c).size();
                ((Collection) this.c).clear();
                this.c = null;
                return;
            case 1:
                if (((Map.Entry) this.c) != null) {
                    z = true;
                }
                yve.o("no calls to next() since the last call to remove()", z);
                Collection collection = (Collection) ((Map.Entry) this.c).getValue();
                it.remove();
                ((f3) obj).c.f -= collection.size();
                collection.clear();
                this.c = null;
                return;
            case 2:
                it.remove();
                m3 m3Var = (m3) obj;
                ((gj7) m3Var.f).f--;
                m3Var.j();
                return;
            case 3:
                it.remove();
                m3 m3Var2 = (m3) obj;
                ccd ccdVar = (ccd) m3Var2.f;
                ccdVar.d--;
                m3Var2.l();
                return;
            case 4:
                if (((Collection) this.c) != null) {
                    z = true;
                }
                if (z) {
                    it.remove();
                    ((Collection) this.c).size();
                    ((Collection) this.c).clear();
                    this.c = null;
                    return;
                }
                grb.i("no calls to next() since the last call to remove()");
                return;
            case 5:
                it.remove();
                ((m3) obj).l();
                return;
            case 6:
                if (((Collection) this.c) != null) {
                    z = true;
                }
                if (z) {
                    it.remove();
                    ((ccd) ((e3) obj).e).d -= ((Collection) this.c).size();
                    ((Collection) this.c).clear();
                    this.c = null;
                    return;
                }
                grb.i("no calls to next() since the last call to remove()");
                return;
            default:
                Map.Entry entry = (Map.Entry) this.c;
                if (entry != null) {
                    z = true;
                }
                if (z) {
                    Collection collection2 = (Collection) entry.getValue();
                    it.remove();
                    ((w9d) obj).c.d -= collection2.size();
                    collection2.clear();
                    this.c = null;
                    return;
                }
                grb.i("no calls to next() since the last call to remove()");
                return;
        }
    }

    public d3(m3 m3Var, ListIterator listIterator, char c) {
        this.a = (byte) 5;
        this.d = m3Var;
        this.c = m3Var.c;
        this.b = listIterator;
    }

    public d3(AbstractSet abstractSet, Iterator it, byte b) {
        this.a = b;
        this.b = it;
        this.d = abstractSet;
    }

    public d3(e3 e3Var, byte b) {
        this.a = (byte) 4;
        this.d = e3Var;
        this.b = ((lp2) e3Var.d).entrySet().iterator();
    }

    public d3(e3 e3Var, char c) {
        this.a = (byte) 6;
        this.d = e3Var;
        this.b = ((lp2) e3Var.d).entrySet().iterator();
    }

    public d3(m3 m3Var, ListIterator listIterator, byte b) {
        this.a = (byte) 3;
        this.d = m3Var;
        this.c = m3Var.c;
        this.b = listIterator;
    }

    public d3(m3 m3Var, char c) {
        Iterator it;
        this.a = (byte) 5;
        this.d = m3Var;
        Collection collection = m3Var.c;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public d3(m3 m3Var) {
        Iterator it;
        this.a = (byte) 2;
        this.d = m3Var;
        Collection collection = m3Var.c;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public d3(m3 m3Var, ListIterator listIterator) {
        this.a = (byte) 2;
        this.d = m3Var;
        this.c = m3Var.c;
        this.b = listIterator;
    }

    public d3(e3 e3Var) {
        this.a = (byte) 0;
        this.d = e3Var;
        this.b = e3Var.d.entrySet().iterator();
    }
}
