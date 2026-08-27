package i7;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import k7.de;
import k7.ed;
import k7.lg;

public class wa extends AbstractMap {

    public final int f10874a;

    public final transient Map f10875b;

    public transient AbstractSet f10876c;
    public transient AbstractCollection d;

    public final Serializable f10877e;

    public wa(Serializable serializable, Map map, int i10) {
        this.f10874a = i10;
        this.f10877e = serializable;
        this.f10875b = map;
    }

    public p8.v a(Map.Entry entry) {
        Object key = entry.getKey();
        p8.h0 h0Var = (p8.h0) this.f10877e;
        List list = (List) ((Collection) entry.getValue());
        return new p8.v(key, list instanceof RandomAccess ? new p8.f(h0Var, key, list, null) : new e(h0Var, key, list, (e) null));
    }

    @Override
    public final void clear() {
        switch (this.f10874a) {
            case 0:
                h hVar = (h) this.f10877e;
                n nVar = hVar.f10651c;
                if (this.f10875b != nVar) {
                    c cVar = new c(this);
                    while (cVar.hasNext()) {
                        cVar.next();
                        cVar.remove();
                    }
                } else {
                    Iterator it = nVar.values().iterator();
                    while (it.hasNext()) {
                        ((Collection) it.next()).clear();
                    }
                    nVar.clear();
                    hVar.d = 0;
                }
                break;
            case 1:
                k7.d dVar = ((lg) this.f10877e).f14872c;
                if (this.f10875b != dVar) {
                    c cVar2 = new c(this, (byte) 0);
                    while (cVar2.hasNext()) {
                        cVar2.next();
                        cVar2.remove();
                    }
                } else {
                    Iterator it2 = dVar.values().iterator();
                    while (it2.hasNext()) {
                        ((Collection) it2.next()).clear();
                    }
                    dVar.clear();
                }
                break;
            default:
                p8.h0 h0Var = (p8.h0) this.f10877e;
                if (this.f10875b != h0Var.d) {
                    c cVar3 = new c(this, (char) 0);
                    while (cVar3.hasNext()) {
                        cVar3.next();
                        cVar3.remove();
                    }
                } else {
                    h0Var.b();
                }
                break;
        }
    }

    @Override
    public final boolean containsKey(Object obj) {
        switch (this.f10874a) {
            case 0:
                Map map = this.f10875b;
                map.getClass();
                try {
                    return map.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            case 1:
                Map map2 = this.f10875b;
                map2.getClass();
                try {
                    return map2.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    return false;
                }
            default:
                Map map3 = this.f10875b;
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
        switch (this.f10874a) {
            case 0:
                va vaVar = (va) this.f10876c;
                if (vaVar != null) {
                    return vaVar;
                }
                va vaVar2 = new va(this);
                this.f10876c = vaVar2;
                return vaVar2;
            case 1:
                k7.l9 l9Var = (k7.l9) this.f10876c;
                if (l9Var != null) {
                    return l9Var;
                }
                k7.l9 l9Var2 = new k7.l9(this);
                this.f10876c = l9Var2;
                return l9Var2;
            default:
                p8.b bVar = (p8.b) this.f10876c;
                if (bVar != null) {
                    return bVar;
                }
                p8.b bVar2 = new p8.b(this);
                this.f10876c = bVar2;
                return bVar2;
        }
    }

    @Override
    public final boolean equals(Object obj) {
        switch (this.f10874a) {
            case 0:
                return this == obj || this.f10875b.equals(obj);
            case 1:
                return this == obj || this.f10875b.equals(obj);
            default:
                return this == obj || this.f10875b.equals(obj);
        }
    }

    @Override
    public final Object get(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        switch (this.f10874a) {
            case 0:
                Map map = this.f10875b;
                map.getClass();
                try {
                    obj2 = map.get(obj);
                    break;
                } catch (ClassCastException | NullPointerException unused) {
                    obj2 = null;
                }
                Collection collection = (Collection) obj2;
                if (collection == null) {
                    return null;
                }
                h hVar = (h) this.f10877e;
                hVar.getClass();
                List list = (List) collection;
                return list instanceof RandomAccess ? new b(hVar, obj, list, null) : new e(hVar, obj, list, (e) null);
            case 1:
                Map map2 = this.f10875b;
                map2.getClass();
                try {
                    obj3 = map2.get(obj);
                    break;
                } catch (ClassCastException | NullPointerException unused2) {
                    obj3 = null;
                }
                Collection collection2 = (Collection) obj3;
                if (collection2 == null) {
                    return null;
                }
                lg lgVar = (lg) this.f10877e;
                lgVar.getClass();
                List list2 = (List) collection2;
                return list2 instanceof RandomAccess ? new de(lgVar, obj, list2, null) : new e(lgVar, obj, list2, (e) null);
            default:
                Map map3 = this.f10875b;
                map3.getClass();
                try {
                    obj4 = map3.get(obj);
                    break;
                } catch (ClassCastException | NullPointerException unused3) {
                    obj4 = null;
                }
                Collection collection3 = (Collection) obj4;
                if (collection3 == null) {
                    return null;
                }
                p8.h0 h0Var = (p8.h0) this.f10877e;
                List list3 = (List) collection3;
                return list3 instanceof RandomAccess ? new p8.f(h0Var, obj, list3, null) : new e(h0Var, obj, list3, (e) null);
        }
    }

    @Override
    public final int hashCode() {
        switch (this.f10874a) {
            case 0:
                return this.f10875b.hashCode();
            case 1:
                return this.f10875b.hashCode();
            default:
                return this.f10875b.hashCode();
        }
    }

    @Override
    public Set keySet() {
        p8.c hVar;
        switch (this.f10874a) {
            case 0:
                h hVar2 = (h) this.f10877e;
                a aVar = hVar2.f10642a;
                if (aVar != null) {
                    return aVar;
                }
                a aVar2 = new a(hVar2, hVar2.f10651c);
                hVar2.f10642a = aVar2;
                return aVar2;
            case 1:
                lg lgVar = (lg) this.f10877e;
                ed edVar = lgVar.f14862a;
                if (edVar != null) {
                    return edVar;
                }
                ed edVar2 = new ed(lgVar, lgVar.f14872c);
                lgVar.f14862a = edVar2;
                return edVar2;
            default:
                p8.h0 h0Var = (p8.h0) this.f10877e;
                p8.c cVar = h0Var.f45552a;
                if (cVar == null) {
                    Map map = h0Var.d;
                    if (map instanceof NavigableMap) {
                        hVar = new p8.e(h0Var, (NavigableMap) map);
                    } else {
                        hVar = map instanceof SortedMap ? new p8.h(h0Var, (SortedMap) map) : new p8.c(h0Var, map);
                    }
                    cVar = hVar;
                    h0Var.f45552a = cVar;
                }
                return cVar;
        }
    }

    @Override
    public final Object remove(Object obj) {
        switch (this.f10874a) {
            case 0:
                h hVar = (h) this.f10877e;
                Collection collection = (Collection) this.f10875b.remove(obj);
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
                lg lgVar = (lg) this.f10877e;
                Collection collection2 = (Collection) this.f10875b.remove(obj);
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
                p8.h0 h0Var = (p8.h0) this.f10877e;
                Collection collection3 = (Collection) this.f10875b.remove(obj);
                if (collection3 == null) {
                    return null;
                }
                List list = (List) h0Var.f45547f.get();
                list.addAll(collection3);
                h0Var.f45546e -= collection3.size();
                collection3.clear();
                return list;
        }
    }

    @Override
    public final int size() {
        switch (this.f10874a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f10875b.size();
    }

    @Override
    public final String toString() {
        switch (this.f10874a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f10875b.toString();
    }

    @Override
    public final Collection values() {
        switch (this.f10874a) {
            case 0:
                m mVar = (m) this.d;
                if (mVar != null) {
                    return mVar;
                }
                m mVar2 = new m(this, 1);
                this.d = mVar2;
                return mVar2;
            case 1:
                m mVar3 = (m) this.d;
                if (mVar3 != null) {
                    return mVar3;
                }
                m mVar4 = new m(this, 3);
                this.d = mVar4;
                return mVar4;
            default:
                m mVar5 = (m) this.d;
                if (mVar5 != null) {
                    return mVar5;
                }
                m mVar6 = new m(this, 6);
                this.d = mVar6;
                return mVar6;
        }
    }
}
