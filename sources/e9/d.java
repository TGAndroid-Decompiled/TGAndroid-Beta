package e9;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import x7.qa;
import z7.ed;
import z7.l9;
import z7.lg;
public class d extends AbstractMap {
    public final int f7363a;
    public final transient Map f7364b;
    public transient AbstractSet f7365c;
    public transient AbstractCollection d;
    public final Serializable e;

    public d(Serializable serializable, Map map, int i10) {
        this.f7363a = i10;
        this.e = serializable;
        this.f7364b = map;
    }

    public e0 a(Map.Entry entry) {
        l lVar;
        Object key = entry.getKey();
        v0 v0Var = (v0) this.e;
        List list = (List) ((Collection) entry.getValue());
        if (list instanceof RandomAccess) {
            lVar = new l(v0Var, key, list, (l) null);
        } else {
            lVar = new l(v0Var, key, list, (l) null);
        }
        return new e0(key, lVar);
    }

    @Override
    public final void clear() {
        switch (this.f7363a) {
            case 0:
                v0 v0Var = (v0) this.e;
                if (this.f7364b == v0Var.d) {
                    v0Var.b();
                    return;
                }
                c cVar = new c(this);
                while (cVar.hasNext()) {
                    cVar.next();
                    cVar.remove();
                }
                return;
            case 1:
                x7.f fVar = (x7.f) this.e;
                x7.j jVar = fVar.f44748c;
                if (this.f7364b == jVar) {
                    for (Collection collection : jVar.values()) {
                        collection.clear();
                    }
                    jVar.clear();
                    fVar.d = 0;
                    return;
                }
                c cVar2 = new c(this, (byte) 0);
                while (cVar2.hasNext()) {
                    cVar2.next();
                    cVar2.remove();
                }
                return;
            default:
                z7.d dVar = ((lg) this.e).f47654c;
                if (this.f7364b == dVar) {
                    for (Collection collection2 : dVar.values()) {
                        collection2.clear();
                    }
                    dVar.clear();
                    return;
                }
                c cVar3 = new c(this, (char) 0);
                while (cVar3.hasNext()) {
                    cVar3.next();
                    cVar3.remove();
                }
                return;
        }
    }

    @Override
    public final boolean containsKey(Object obj) {
        switch (this.f7363a) {
            case 0:
                Map map = this.f7364b;
                map.getClass();
                try {
                    return map.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            case 1:
                Map map2 = this.f7364b;
                map2.getClass();
                try {
                    return map2.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    return false;
                }
            default:
                Map map3 = this.f7364b;
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
        switch (this.f7363a) {
            case 0:
                b bVar = (b) this.f7365c;
                if (bVar == null) {
                    b bVar2 = new b(this);
                    this.f7365c = bVar2;
                    return bVar2;
                }
                return bVar;
            case 1:
                qa qaVar = (qa) this.f7365c;
                if (qaVar == null) {
                    qa qaVar2 = new qa(this);
                    this.f7365c = qaVar2;
                    return qaVar2;
                }
                return qaVar;
            default:
                l9 l9Var = (l9) this.f7365c;
                if (l9Var == null) {
                    l9 l9Var2 = new l9(this);
                    this.f7365c = l9Var2;
                    return l9Var2;
                }
                return l9Var;
        }
    }

    @Override
    public final boolean equals(Object obj) {
        switch (this.f7363a) {
            case 0:
                if (this != obj && !this.f7364b.equals(obj)) {
                    return false;
                }
                return true;
            case 1:
                if (this != obj && !this.f7364b.equals(obj)) {
                    return false;
                }
                return true;
            default:
                if (this != obj && !this.f7364b.equals(obj)) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final Object get(Object obj) {
        Object obj2;
        l lVar;
        Object obj3;
        l lVar2;
        Object obj4;
        l lVar3;
        switch (this.f7363a) {
            case 0:
                Map map = this.f7364b;
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
                v0 v0Var = (v0) this.e;
                List list = (List) collection;
                if (list instanceof RandomAccess) {
                    lVar = new l(v0Var, obj, list, (l) null);
                } else {
                    lVar = new l(v0Var, obj, list, (l) null);
                }
                return lVar;
            case 1:
                Map map2 = this.f7364b;
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
                x7.f fVar = (x7.f) this.e;
                fVar.getClass();
                List list2 = (List) collection2;
                if (list2 instanceof RandomAccess) {
                    lVar2 = new l(fVar, obj, list2, (l) null);
                } else {
                    lVar2 = new l(fVar, obj, list2, (l) null);
                }
                return lVar2;
            default:
                Map map3 = this.f7364b;
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
                lg lgVar = (lg) this.e;
                lgVar.getClass();
                List list3 = (List) collection3;
                if (list3 instanceof RandomAccess) {
                    lVar3 = new l(lgVar, obj, list3, (l) null);
                } else {
                    lVar3 = new l(lgVar, obj, list3, (l) null);
                }
                return lVar3;
        }
    }

    @Override
    public final int hashCode() {
        switch (this.f7363a) {
            case 0:
                return this.f7364b.hashCode();
            case 1:
                return this.f7364b.hashCode();
            default:
                return this.f7364b.hashCode();
        }
    }

    @Override
    public Set keySet() {
        Set eVar;
        switch (this.f7363a) {
            case 0:
                v0 v0Var = (v0) this.e;
                Set set = v0Var.f7408a;
                if (set == null) {
                    Map map = v0Var.d;
                    if (map instanceof NavigableMap) {
                        eVar = new g(v0Var, (NavigableMap) map);
                    } else if (map instanceof SortedMap) {
                        eVar = new j(v0Var, (SortedMap) map);
                    } else {
                        eVar = new e(v0Var, map);
                    }
                    set = eVar;
                    v0Var.f7408a = set;
                }
                return set;
            case 1:
                x7.f fVar = (x7.f) this.e;
                x7.a aVar = fVar.f44734a;
                if (aVar == null) {
                    x7.a aVar2 = new x7.a(fVar, fVar.f44748c);
                    fVar.f44734a = aVar2;
                    return aVar2;
                }
                return aVar;
            default:
                lg lgVar = (lg) this.e;
                ed edVar = lgVar.f47644a;
                if (edVar == null) {
                    ed edVar2 = new ed(lgVar, lgVar.f47654c);
                    lgVar.f47644a = edVar2;
                    return edVar2;
                }
                return edVar;
        }
    }

    @Override
    public final Object remove(Object obj) {
        switch (this.f7363a) {
            case 0:
                v0 v0Var = (v0) this.e;
                Collection collection = (Collection) this.f7364b.remove(obj);
                if (collection == null) {
                    return null;
                }
                Collection c10 = v0Var.c();
                c10.addAll(collection);
                v0Var.e -= collection.size();
                collection.clear();
                return c10;
            case 1:
                x7.f fVar = (x7.f) this.e;
                Collection collection2 = (Collection) this.f7364b.remove(obj);
                if (collection2 == null) {
                    return null;
                }
                fVar.getClass();
                ArrayList arrayList = new ArrayList(3);
                arrayList.addAll(collection2);
                fVar.d -= collection2.size();
                collection2.clear();
                return arrayList;
            default:
                lg lgVar = (lg) this.e;
                Collection collection3 = (Collection) this.f7364b.remove(obj);
                if (collection3 == null) {
                    return null;
                }
                lgVar.getClass();
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.addAll(collection3);
                collection3.size();
                collection3.clear();
                return arrayList2;
        }
    }

    @Override
    public final int size() {
        switch (this.f7363a) {
            case 0:
                return this.f7364b.size();
            case 1:
                return this.f7364b.size();
            default:
                return this.f7364b.size();
        }
    }

    @Override
    public final String toString() {
        switch (this.f7363a) {
            case 0:
                return this.f7364b.toString();
            case 1:
                return this.f7364b.toString();
            default:
                return this.f7364b.toString();
        }
    }

    @Override
    public final Collection values() {
        switch (this.f7363a) {
            case 0:
                n nVar = (n) this.d;
                if (nVar == null) {
                    n nVar2 = new n(this, 2);
                    this.d = nVar2;
                    return nVar2;
                }
                return nVar;
            case 1:
                n nVar3 = (n) this.d;
                if (nVar3 == null) {
                    n nVar4 = new n(this, 4);
                    this.d = nVar4;
                    return nVar4;
                }
                return nVar3;
            default:
                n nVar5 = (n) this.d;
                if (nVar5 == null) {
                    n nVar6 = new n(this, 6);
                    this.d = nVar6;
                    return nVar6;
                }
                return nVar5;
        }
    }
}
