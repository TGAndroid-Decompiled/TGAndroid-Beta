package j7;

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
import l7.ed;
import l7.lg;
public class xa extends AbstractMap {
    public final int f11256a;
    public final transient Map f11257b;
    public transient AbstractSet f11258c;
    public transient AbstractCollection d;
    public final Serializable f11259e;

    public xa(Serializable serializable, Map map, int i10) {
        this.f11256a = i10;
        this.f11259e = serializable;
        this.f11257b = map;
    }

    public q8.v a(Map.Entry entry) {
        e eVar;
        Object key = entry.getKey();
        q8.h0 h0Var = (q8.h0) this.f11259e;
        List list = (List) ((Collection) entry.getValue());
        if (list instanceof RandomAccess) {
            eVar = new e(h0Var, key, list, (e) null);
        } else {
            eVar = new e(h0Var, key, list, (e) null);
        }
        return new q8.v(key, eVar);
    }

    @Override
    public final void clear() {
        switch (this.f11256a) {
            case 0:
                h hVar = (h) this.f11259e;
                n nVar = hVar.f11024c;
                if (this.f11257b == nVar) {
                    for (Collection collection : nVar.values()) {
                        collection.clear();
                    }
                    nVar.clear();
                    hVar.d = 0;
                    return;
                }
                c cVar = new c(this);
                while (cVar.hasNext()) {
                    cVar.next();
                    cVar.remove();
                }
                return;
            case 1:
                l7.d dVar = ((lg) this.f11259e).f14877c;
                if (this.f11257b == dVar) {
                    for (Collection collection2 : dVar.values()) {
                        collection2.clear();
                    }
                    dVar.clear();
                    return;
                }
                c cVar2 = new c(this, (byte) 0);
                while (cVar2.hasNext()) {
                    cVar2.next();
                    cVar2.remove();
                }
                return;
            default:
                q8.h0 h0Var = (q8.h0) this.f11259e;
                if (this.f11257b == h0Var.d) {
                    h0Var.b();
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
        switch (this.f11256a) {
            case 0:
                Map map = this.f11257b;
                map.getClass();
                try {
                    return map.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            case 1:
                Map map2 = this.f11257b;
                map2.getClass();
                try {
                    return map2.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    return false;
                }
            default:
                Map map3 = this.f11257b;
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
        switch (this.f11256a) {
            case 0:
                wa waVar = (wa) this.f11258c;
                if (waVar == null) {
                    wa waVar2 = new wa(this);
                    this.f11258c = waVar2;
                    return waVar2;
                }
                return waVar;
            case 1:
                l7.l9 l9Var = (l7.l9) this.f11258c;
                if (l9Var == null) {
                    l7.l9 l9Var2 = new l7.l9(this);
                    this.f11258c = l9Var2;
                    return l9Var2;
                }
                return l9Var;
            default:
                q8.b bVar = (q8.b) this.f11258c;
                if (bVar == null) {
                    q8.b bVar2 = new q8.b(this);
                    this.f11258c = bVar2;
                    return bVar2;
                }
                return bVar;
        }
    }

    @Override
    public final boolean equals(Object obj) {
        switch (this.f11256a) {
            case 0:
                if (this != obj && !this.f11257b.equals(obj)) {
                    return false;
                }
                return true;
            case 1:
                if (this != obj && !this.f11257b.equals(obj)) {
                    return false;
                }
                return true;
            default:
                if (this != obj && !this.f11257b.equals(obj)) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final Object get(Object obj) {
        Object obj2;
        e eVar;
        Object obj3;
        e eVar2;
        Object obj4;
        e eVar3;
        switch (this.f11256a) {
            case 0:
                Map map = this.f11257b;
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
                h hVar = (h) this.f11259e;
                hVar.getClass();
                List list = (List) collection;
                if (list instanceof RandomAccess) {
                    eVar = new e(hVar, obj, list, (e) null);
                } else {
                    eVar = new e(hVar, obj, list, (e) null);
                }
                return eVar;
            case 1:
                Map map2 = this.f11257b;
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
                lg lgVar = (lg) this.f11259e;
                lgVar.getClass();
                List list2 = (List) collection2;
                if (list2 instanceof RandomAccess) {
                    eVar2 = new e(lgVar, obj, list2, (e) null);
                } else {
                    eVar2 = new e(lgVar, obj, list2, (e) null);
                }
                return eVar2;
            default:
                Map map3 = this.f11257b;
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
                q8.h0 h0Var = (q8.h0) this.f11259e;
                List list3 = (List) collection3;
                if (list3 instanceof RandomAccess) {
                    eVar3 = new e(h0Var, obj, list3, (e) null);
                } else {
                    eVar3 = new e(h0Var, obj, list3, (e) null);
                }
                return eVar3;
        }
    }

    @Override
    public final int hashCode() {
        switch (this.f11256a) {
            case 0:
                return this.f11257b.hashCode();
            case 1:
                return this.f11257b.hashCode();
            default:
                return this.f11257b.hashCode();
        }
    }

    @Override
    public Set keySet() {
        q8.c cVar;
        switch (this.f11256a) {
            case 0:
                h hVar = (h) this.f11259e;
                a aVar = hVar.f11010a;
                if (aVar == null) {
                    a aVar2 = new a(hVar, hVar.f11024c);
                    hVar.f11010a = aVar2;
                    return aVar2;
                }
                return aVar;
            case 1:
                lg lgVar = (lg) this.f11259e;
                ed edVar = lgVar.f14867a;
                if (edVar == null) {
                    ed edVar2 = new ed(lgVar, lgVar.f14877c);
                    lgVar.f14867a = edVar2;
                    return edVar2;
                }
                return edVar;
            default:
                q8.h0 h0Var = (q8.h0) this.f11259e;
                q8.c cVar2 = h0Var.f46459a;
                if (cVar2 == null) {
                    Map map = h0Var.d;
                    if (map instanceof NavigableMap) {
                        cVar = new q8.e(h0Var, (NavigableMap) map);
                    } else if (map instanceof SortedMap) {
                        cVar = new q8.h(h0Var, (SortedMap) map);
                    } else {
                        cVar = new q8.c(h0Var, map);
                    }
                    cVar2 = cVar;
                    h0Var.f46459a = cVar2;
                }
                return cVar2;
        }
    }

    @Override
    public final Object remove(Object obj) {
        switch (this.f11256a) {
            case 0:
                h hVar = (h) this.f11259e;
                Collection collection = (Collection) this.f11257b.remove(obj);
                if (collection == null) {
                    return null;
                }
                hVar.getClass();
                ArrayList arrayList = new ArrayList(3);
                arrayList.addAll(collection);
                hVar.d -= collection.size();
                collection.clear();
                return arrayList;
            case 1:
                lg lgVar = (lg) this.f11259e;
                Collection collection2 = (Collection) this.f11257b.remove(obj);
                if (collection2 == null) {
                    return null;
                }
                lgVar.getClass();
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.addAll(collection2);
                collection2.size();
                collection2.clear();
                return arrayList2;
            default:
                q8.h0 h0Var = (q8.h0) this.f11259e;
                Collection collection3 = (Collection) this.f11257b.remove(obj);
                if (collection3 == null) {
                    return null;
                }
                List list = (List) h0Var.f46454f.get();
                list.addAll(collection3);
                h0Var.f46453e -= collection3.size();
                collection3.clear();
                return list;
        }
    }

    @Override
    public final int size() {
        switch (this.f11256a) {
            case 0:
                return this.f11257b.size();
            case 1:
                return this.f11257b.size();
            default:
                return this.f11257b.size();
        }
    }

    @Override
    public final String toString() {
        switch (this.f11256a) {
            case 0:
                return this.f11257b.toString();
            case 1:
                return this.f11257b.toString();
            default:
                return this.f11257b.toString();
        }
    }

    @Override
    public final Collection values() {
        switch (this.f11256a) {
            case 0:
                m mVar = (m) this.d;
                if (mVar == null) {
                    m mVar2 = new m(this, 1);
                    this.d = mVar2;
                    return mVar2;
                }
                return mVar;
            case 1:
                m mVar3 = (m) this.d;
                if (mVar3 == null) {
                    m mVar4 = new m(this, 3);
                    this.d = mVar4;
                    return mVar4;
                }
                return mVar3;
            default:
                m mVar5 = (m) this.d;
                if (mVar5 == null) {
                    m mVar6 = new m(this, 6);
                    this.d = mVar6;
                    return mVar6;
                }
                return mVar5;
        }
    }
}
