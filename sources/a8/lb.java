package a8;

import c8.cd;
import c8.jg;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
public class lb extends AbstractMap {
    public final int f532a;
    public final transient Map f533b;
    public transient AbstractSet f534c;
    public transient AbstractCollection d;
    public final Serializable f535e;

    public lb(Serializable serializable, Map map, int i7) {
        this.f532a = i7;
        this.f535e = serializable;
        this.f533b = map;
    }

    public h9.e0 b(Map.Entry entry) {
        f fVar;
        Object key = entry.getKey();
        h9.l1 l1Var = (h9.l1) this.f535e;
        List list = (List) ((Collection) entry.getValue());
        if (list instanceof RandomAccess) {
            fVar = new f(l1Var, key, list, (f) null);
        } else {
            fVar = new f(l1Var, key, list, (f) null);
        }
        return new h9.e0(key, fVar);
    }

    @Override
    public final void clear() {
        switch (this.f532a) {
            case 0:
                i iVar = (i) this.f535e;
                o oVar = iVar.f486c;
                if (this.f533b == oVar) {
                    for (Collection collection : oVar.values()) {
                        collection.clear();
                    }
                    oVar.clear();
                    iVar.d = 0;
                    return;
                }
                d dVar = new d(this);
                while (dVar.hasNext()) {
                    dVar.next();
                    dVar.remove();
                }
                return;
            case 1:
                c8.d dVar2 = ((jg) this.f535e).f4842c;
                if (this.f533b == dVar2) {
                    for (Collection collection2 : dVar2.values()) {
                        collection2.clear();
                    }
                    dVar2.clear();
                    return;
                }
                d dVar3 = new d(this, (byte) 0);
                while (dVar3.hasNext()) {
                    dVar3.next();
                    dVar3.remove();
                }
                return;
            default:
                h9.l1 l1Var = (h9.l1) this.f535e;
                if (this.f533b == l1Var.f14014e) {
                    l1Var.clear();
                    return;
                }
                d dVar4 = new d(this, (char) 0);
                while (dVar4.hasNext()) {
                    dVar4.next();
                    dVar4.remove();
                }
                return;
        }
    }

    @Override
    public final boolean containsKey(Object obj) {
        switch (this.f532a) {
            case 0:
                Map map = this.f533b;
                map.getClass();
                try {
                    return map.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            case 1:
                Map map2 = this.f533b;
                map2.getClass();
                try {
                    return map2.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    return false;
                }
            default:
                Map map3 = this.f533b;
                map3.getClass();
                try {
                    return map3.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused3) {
                    return false;
                }
        }
    }

    @Override
    public final Set entrySet() {
        switch (this.f532a) {
            case 0:
                kb kbVar = (kb) this.f534c;
                if (kbVar == null) {
                    kb kbVar2 = new kb(this);
                    this.f534c = kbVar2;
                    return kbVar2;
                }
                return kbVar;
            case 1:
                c8.k9 k9Var = (c8.k9) this.f534c;
                if (k9Var == null) {
                    c8.k9 k9Var2 = new c8.k9(this);
                    this.f534c = k9Var2;
                    return k9Var2;
                }
                return k9Var;
            default:
                h9.c cVar = (h9.c) this.f534c;
                if (cVar == null) {
                    h9.c cVar2 = new h9.c(this, 0);
                    this.f534c = cVar2;
                    return cVar2;
                }
                return cVar;
        }
    }

    @Override
    public final boolean equals(Object obj) {
        switch (this.f532a) {
            case 0:
                if (this != obj && !this.f533b.equals(obj)) {
                    return false;
                }
                return true;
            case 1:
                if (this != obj && !this.f533b.equals(obj)) {
                    return false;
                }
                return true;
            default:
                if (this != obj && !this.f533b.equals(obj)) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final Object get(Object obj) {
        Object obj2;
        f fVar;
        Object obj3;
        f fVar2;
        Object obj4;
        f fVar3;
        switch (this.f532a) {
            case 0:
                Map map = this.f533b;
                map.getClass();
                try {
                    obj2 = map.get(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    obj2 = null;
                }
                Collection collection = (Collection) obj2;
                if (collection == null) {
                    return null;
                }
                i iVar = (i) this.f535e;
                iVar.getClass();
                List list = (List) collection;
                if (list instanceof RandomAccess) {
                    fVar = new f(iVar, obj, list, (f) null);
                } else {
                    fVar = new f(iVar, obj, list, (f) null);
                }
                return fVar;
            case 1:
                Map map2 = this.f533b;
                map2.getClass();
                try {
                    obj3 = map2.get(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    obj3 = null;
                }
                Collection collection2 = (Collection) obj3;
                if (collection2 == null) {
                    return null;
                }
                jg jgVar = (jg) this.f535e;
                jgVar.getClass();
                List list2 = (List) collection2;
                if (list2 instanceof RandomAccess) {
                    fVar2 = new f(jgVar, obj, list2, (f) null);
                } else {
                    fVar2 = new f(jgVar, obj, list2, (f) null);
                }
                return fVar2;
            default:
                Map map3 = this.f533b;
                map3.getClass();
                try {
                    obj4 = map3.get(obj);
                } catch (ClassCastException | NullPointerException unused3) {
                    obj4 = null;
                }
                Collection collection3 = (Collection) obj4;
                if (collection3 == null) {
                    return null;
                }
                h9.l1 l1Var = (h9.l1) this.f535e;
                List list3 = (List) collection3;
                if (list3 instanceof RandomAccess) {
                    fVar3 = new f(l1Var, obj, list3, (f) null);
                } else {
                    fVar3 = new f(l1Var, obj, list3, (f) null);
                }
                return fVar3;
        }
    }

    @Override
    public final int hashCode() {
        switch (this.f532a) {
            case 0:
                return this.f533b.hashCode();
            case 1:
                return this.f533b.hashCode();
            default:
                return this.f533b.hashCode();
        }
    }

    @Override
    public Set keySet() {
        switch (this.f532a) {
            case 0:
                i iVar = (i) this.f535e;
                b bVar = iVar.f456a;
                if (bVar == null) {
                    b bVar2 = new b(iVar, iVar.f486c);
                    iVar.f456a = bVar2;
                    return bVar2;
                }
                return bVar;
            case 1:
                jg jgVar = (jg) this.f535e;
                cd cdVar = jgVar.f4826a;
                if (cdVar == null) {
                    cd cdVar2 = new cd(jgVar, jgVar.f4842c);
                    jgVar.f4826a = cdVar2;
                    return cdVar2;
                }
                return cdVar;
            default:
                return ((h9.l1) this.f535e).keySet();
        }
    }

    @Override
    public final Object remove(Object obj) {
        switch (this.f532a) {
            case 0:
                i iVar = (i) this.f535e;
                Collection collection = (Collection) this.f533b.remove(obj);
                if (collection == null) {
                    return null;
                }
                iVar.getClass();
                ArrayList arrayList = new ArrayList(3);
                arrayList.addAll(collection);
                iVar.d -= collection.size();
                collection.clear();
                return arrayList;
            case 1:
                jg jgVar = (jg) this.f535e;
                Collection collection2 = (Collection) this.f533b.remove(obj);
                if (collection2 == null) {
                    return null;
                }
                jgVar.getClass();
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.addAll(collection2);
                collection2.size();
                collection2.clear();
                return arrayList2;
            default:
                h9.l1 l1Var = (h9.l1) this.f535e;
                Collection collection3 = (Collection) this.f533b.remove(obj);
                if (collection3 == null) {
                    return null;
                }
                Collection h = l1Var.h();
                h.addAll(collection3);
                l1Var.f14015f -= collection3.size();
                collection3.clear();
                return h;
        }
    }

    @Override
    public final int size() {
        switch (this.f532a) {
            case 0:
                return this.f533b.size();
            case 1:
                return this.f533b.size();
            default:
                return this.f533b.size();
        }
    }

    @Override
    public final String toString() {
        switch (this.f532a) {
            case 0:
                return this.f533b.toString();
            case 1:
                return this.f533b.toString();
            default:
                return this.f533b.toString();
        }
    }

    @Override
    public final Collection values() {
        switch (this.f532a) {
            case 0:
                n nVar = (n) this.d;
                if (nVar == null) {
                    n nVar2 = new n((AbstractMap) this, 1);
                    this.d = nVar2;
                    return nVar2;
                }
                return nVar;
            case 1:
                n nVar3 = (n) this.d;
                if (nVar3 == null) {
                    n nVar4 = new n((AbstractMap) this, 3);
                    this.d = nVar4;
                    return nVar4;
                }
                return nVar3;
            default:
                n nVar5 = (n) this.d;
                if (nVar5 == null) {
                    n nVar6 = new n((AbstractMap) this, 7);
                    this.d = nVar6;
                    return nVar6;
                }
                return nVar5;
        }
    }
}
