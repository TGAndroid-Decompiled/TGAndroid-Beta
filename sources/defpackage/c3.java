package defpackage;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;
public class c3 implements Iterator {
    public final byte a;
    public final Iterator b;
    public Object c;
    public final Object d;

    public c3(l3 l3Var, byte b) {
        Iterator it;
        this.a = (byte) 3;
        this.d = l3Var;
        Collection collection = l3Var.c;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public final void a() {
        l3 l3Var = (l3) this.d;
        l3Var.i();
        if (l3Var.c == ((Collection) this.c)) {
            return;
        }
        zg.b();
    }

    public final void b() {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 3:
                l3 l3Var = (l3) obj;
                l3Var.zzb();
                if (l3Var.c != ((Collection) this.c)) {
                    zg.b();
                    return;
                }
                return;
            default:
                l3 l3Var2 = (l3) obj;
                l3Var2.zzb();
                if (l3Var2.c != ((Collection) this.c)) {
                    zg.b();
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
        l3 l3Var;
        l3 l3Var2;
        byte b = this.a;
        Object obj = this.d;
        Iterator it = this.b;
        switch (b) {
            case 0:
                Map.Entry entry = (Map.Entry) it.next();
                this.c = (Collection) entry.getValue();
                return ((d3) obj).b(entry);
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
                wjf wjfVar = (wjf) ((d3) obj).e;
                List list = (List) ((Collection) entry3.getValue());
                if (list instanceof RandomAccess) {
                    l3Var = new l3(wjfVar, key, list, (l3) null);
                } else {
                    l3Var = new l3(wjfVar, key, list, (l3) null);
                }
                return new cbd(key, l3Var);
            case 5:
                b();
                return it.next();
            case 6:
                Map.Entry entry4 = (Map.Entry) it.next();
                this.c = (Collection) entry4.getValue();
                Object key2 = entry4.getKey();
                l9d l9dVar = (l9d) ((d3) obj).e;
                List list2 = (List) ((Collection) entry4.getValue());
                if (list2 instanceof RandomAccess) {
                    l3Var2 = new l3(l9dVar, key2, list2, (l3) null);
                } else {
                    l3Var2 = new l3(l9dVar, key2, list2, (l3) null);
                }
                return new vdd(key2, l3Var2);
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
                jte.o("no calls to next() since the last call to remove()", z);
                it.remove();
                ((zi7) ((d3) obj).e).f -= ((Collection) this.c).size();
                ((Collection) this.c).clear();
                this.c = null;
                return;
            case 1:
                if (((Map.Entry) this.c) != null) {
                    z = true;
                }
                jte.o("no calls to next() since the last call to remove()", z);
                Collection collection = (Collection) ((Map.Entry) this.c).getValue();
                it.remove();
                ((e3) obj).c.f -= collection.size();
                collection.clear();
                this.c = null;
                return;
            case 2:
                it.remove();
                l3 l3Var = (l3) obj;
                ((zi7) l3Var.f).f--;
                l3Var.j();
                return;
            case 3:
                it.remove();
                l3 l3Var2 = (l3) obj;
                l9d l9dVar = (l9d) l3Var2.f;
                l9dVar.d--;
                l3Var2.l();
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
                dq9.m("no calls to next() since the last call to remove()");
                return;
            case 5:
                it.remove();
                ((l3) obj).l();
                return;
            case 6:
                if (((Collection) this.c) != null) {
                    z = true;
                }
                if (z) {
                    it.remove();
                    ((l9d) ((d3) obj).e).d -= ((Collection) this.c).size();
                    ((Collection) this.c).clear();
                    this.c = null;
                    return;
                }
                dq9.m("no calls to next() since the last call to remove()");
                return;
            default:
                Map.Entry entry = (Map.Entry) this.c;
                if (entry != null) {
                    z = true;
                }
                if (z) {
                    Collection collection2 = (Collection) entry.getValue();
                    it.remove();
                    ((f7d) obj).c.d -= collection2.size();
                    collection2.clear();
                    this.c = null;
                    return;
                }
                dq9.m("no calls to next() since the last call to remove()");
                return;
        }
    }

    public c3(l3 l3Var, ListIterator listIterator, char c) {
        this.a = (byte) 5;
        this.d = l3Var;
        this.c = l3Var.c;
        this.b = listIterator;
    }

    public c3(AbstractSet abstractSet, Iterator it, byte b) {
        this.a = b;
        this.b = it;
        this.d = abstractSet;
    }

    public c3(d3 d3Var, byte b) {
        this.a = (byte) 4;
        this.d = d3Var;
        this.b = ((dq2) d3Var.d).entrySet().iterator();
    }

    public c3(d3 d3Var, char c) {
        this.a = (byte) 6;
        this.d = d3Var;
        this.b = ((dq2) d3Var.d).entrySet().iterator();
    }

    public c3(l3 l3Var, ListIterator listIterator, byte b) {
        this.a = (byte) 3;
        this.d = l3Var;
        this.c = l3Var.c;
        this.b = listIterator;
    }

    public c3(l3 l3Var, char c) {
        Iterator it;
        this.a = (byte) 5;
        this.d = l3Var;
        Collection collection = l3Var.c;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public c3(l3 l3Var) {
        Iterator it;
        this.a = (byte) 2;
        this.d = l3Var;
        Collection collection = l3Var.c;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public c3(l3 l3Var, ListIterator listIterator) {
        this.a = (byte) 2;
        this.d = l3Var;
        this.c = l3Var.c;
        this.b = listIterator;
    }

    public c3(d3 d3Var) {
        this.a = (byte) 0;
        this.d = d3Var;
        this.b = d3Var.d.entrySet().iterator();
    }
}
