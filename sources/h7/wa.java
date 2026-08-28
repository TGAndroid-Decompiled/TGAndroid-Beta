package h7;

import j7.ed;
import j7.lg;
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
public class wa extends AbstractMap {
    public final int f10165a;
    public final transient Map f10166b;
    public transient AbstractSet f10167c;
    public transient AbstractCollection d;
    public final Serializable f10168e;

    public wa(Serializable serializable, Map map, int i9) {
        this.f10165a = i9;
        this.f10168e = serializable;
        this.f10166b = map;
    }

    public o8.v a(Map.Entry entry) {
        e eVar;
        Object key = entry.getKey();
        o8.h0 h0Var = (o8.h0) this.f10168e;
        List list = (List) ((Collection) entry.getValue());
        if (list instanceof RandomAccess) {
            eVar = new e(h0Var, key, list, (e) null);
        } else {
            eVar = new e(h0Var, key, list, (e) null);
        }
        return new o8.v(key, eVar);
    }

    @Override
    public final void clear() {
        switch (this.f10165a) {
            case 0:
                h hVar = (h) this.f10168e;
                n nVar = hVar.f9942c;
                if (this.f10166b == nVar) {
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
                j7.d dVar = ((lg) this.f10168e).f14018c;
                if (this.f10166b == dVar) {
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
                o8.h0 h0Var = (o8.h0) this.f10168e;
                if (this.f10166b == h0Var.d) {
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
        switch (this.f10165a) {
            case 0:
                Map map = this.f10166b;
                map.getClass();
                try {
                    return map.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            case 1:
                Map map2 = this.f10166b;
                map2.getClass();
                try {
                    return map2.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    return false;
                }
            default:
                Map map3 = this.f10166b;
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
        switch (this.f10165a) {
            case 0:
                va vaVar = (va) this.f10167c;
                if (vaVar == null) {
                    va vaVar2 = new va(this);
                    this.f10167c = vaVar2;
                    return vaVar2;
                }
                return vaVar;
            case 1:
                j7.l9 l9Var = (j7.l9) this.f10167c;
                if (l9Var == null) {
                    j7.l9 l9Var2 = new j7.l9(this);
                    this.f10167c = l9Var2;
                    return l9Var2;
                }
                return l9Var;
            default:
                o8.b bVar = (o8.b) this.f10167c;
                if (bVar == null) {
                    o8.b bVar2 = new o8.b(this);
                    this.f10167c = bVar2;
                    return bVar2;
                }
                return bVar;
        }
    }

    @Override
    public final boolean equals(Object obj) {
        switch (this.f10165a) {
            case 0:
                if (this != obj && !this.f10166b.equals(obj)) {
                    return false;
                }
                return true;
            case 1:
                if (this != obj && !this.f10166b.equals(obj)) {
                    return false;
                }
                return true;
            default:
                if (this != obj && !this.f10166b.equals(obj)) {
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
        switch (this.f10165a) {
            case 0:
                Map map = this.f10166b;
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
                h hVar = (h) this.f10168e;
                hVar.getClass();
                List list = (List) collection;
                if (list instanceof RandomAccess) {
                    eVar = new e(hVar, obj, list, (e) null);
                } else {
                    eVar = new e(hVar, obj, list, (e) null);
                }
                return eVar;
            case 1:
                Map map2 = this.f10166b;
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
                lg lgVar = (lg) this.f10168e;
                lgVar.getClass();
                List list2 = (List) collection2;
                if (list2 instanceof RandomAccess) {
                    eVar2 = new e(lgVar, obj, list2, (e) null);
                } else {
                    eVar2 = new e(lgVar, obj, list2, (e) null);
                }
                return eVar2;
            default:
                Map map3 = this.f10166b;
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
                o8.h0 h0Var = (o8.h0) this.f10168e;
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
        switch (this.f10165a) {
            case 0:
                return this.f10166b.hashCode();
            case 1:
                return this.f10166b.hashCode();
            default:
                return this.f10166b.hashCode();
        }
    }

    @Override
    public Set keySet() {
        o8.c cVar;
        switch (this.f10165a) {
            case 0:
                h hVar = (h) this.f10168e;
                a aVar = hVar.f9933a;
                if (aVar == null) {
                    a aVar2 = new a(hVar, hVar.f9942c);
                    hVar.f9933a = aVar2;
                    return aVar2;
                }
                return aVar;
            case 1:
                lg lgVar = (lg) this.f10168e;
                ed edVar = lgVar.f14008a;
                if (edVar == null) {
                    ed edVar2 = new ed(lgVar, lgVar.f14018c);
                    lgVar.f14008a = edVar2;
                    return edVar2;
                }
                return edVar;
            default:
                o8.h0 h0Var = (o8.h0) this.f10168e;
                o8.c cVar2 = h0Var.f19053a;
                if (cVar2 == null) {
                    Map map = h0Var.d;
                    if (map instanceof NavigableMap) {
                        cVar = new o8.e(h0Var, (NavigableMap) map);
                    } else if (map instanceof SortedMap) {
                        cVar = new o8.h(h0Var, (SortedMap) map);
                    } else {
                        cVar = new o8.c(h0Var, map);
                    }
                    cVar2 = cVar;
                    h0Var.f19053a = cVar2;
                }
                return cVar2;
        }
    }

    @Override
    public final Object remove(Object obj) {
        switch (this.f10165a) {
            case 0:
                h hVar = (h) this.f10168e;
                Collection collection = (Collection) this.f10166b.remove(obj);
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
                lg lgVar = (lg) this.f10168e;
                Collection collection2 = (Collection) this.f10166b.remove(obj);
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
                o8.h0 h0Var = (o8.h0) this.f10168e;
                Collection collection3 = (Collection) this.f10166b.remove(obj);
                if (collection3 == null) {
                    return null;
                }
                List list = (List) h0Var.f19048f.get();
                list.addAll(collection3);
                h0Var.f19047e -= collection3.size();
                collection3.clear();
                return list;
        }
    }

    @Override
    public final int size() {
        switch (this.f10165a) {
            case 0:
                return this.f10166b.size();
            case 1:
                return this.f10166b.size();
            default:
                return this.f10166b.size();
        }
    }

    @Override
    public final String toString() {
        switch (this.f10165a) {
            case 0:
                return this.f10166b.toString();
            case 1:
                return this.f10166b.toString();
            default:
                return this.f10166b.toString();
        }
    }

    @Override
    public final Collection values() {
        switch (this.f10165a) {
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
