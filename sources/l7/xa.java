package l7;

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
import n7.fd;
import n7.mg;
public class xa extends AbstractMap {
    public final int f11693a;
    public final transient Map f11694b;
    public transient AbstractSet f11695c;
    public transient AbstractCollection d;
    public final Serializable e;

    public xa(Serializable serializable, Map map, int i10) {
        this.f11693a = i10;
        this.e = serializable;
        this.f11694b = map;
    }

    public s8.r a(Map.Entry entry) {
        e eVar;
        Object key = entry.getKey();
        s8.e0 e0Var = (s8.e0) this.e;
        List list = (List) ((Collection) entry.getValue());
        if (list instanceof RandomAccess) {
            eVar = new e(e0Var, key, list, (e) null);
        } else {
            eVar = new e(e0Var, key, list, (e) null);
        }
        return new s8.r(key, eVar);
    }

    @Override
    public final void clear() {
        switch (this.f11693a) {
            case 0:
                h hVar = (h) this.e;
                n nVar = hVar.f11479c;
                if (this.f11694b == nVar) {
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
                n7.d dVar = ((mg) this.e).f14666c;
                if (this.f11694b == dVar) {
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
                s8.e0 e0Var = (s8.e0) this.e;
                if (this.f11694b == e0Var.d) {
                    e0Var.b();
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
        switch (this.f11693a) {
            case 0:
                Map map = this.f11694b;
                map.getClass();
                try {
                    return map.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            case 1:
                Map map2 = this.f11694b;
                map2.getClass();
                try {
                    return map2.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    return false;
                }
            default:
                Map map3 = this.f11694b;
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
        switch (this.f11693a) {
            case 0:
                wa waVar = (wa) this.f11695c;
                if (waVar == null) {
                    wa waVar2 = new wa(this);
                    this.f11695c = waVar2;
                    return waVar2;
                }
                return waVar;
            case 1:
                n7.l9 l9Var = (n7.l9) this.f11695c;
                if (l9Var == null) {
                    n7.l9 l9Var2 = new n7.l9(this);
                    this.f11695c = l9Var2;
                    return l9Var2;
                }
                return l9Var;
            default:
                s8.b bVar = (s8.b) this.f11695c;
                if (bVar == null) {
                    s8.b bVar2 = new s8.b(this);
                    this.f11695c = bVar2;
                    return bVar2;
                }
                return bVar;
        }
    }

    @Override
    public final boolean equals(Object obj) {
        switch (this.f11693a) {
            case 0:
                if (this != obj && !this.f11694b.equals(obj)) {
                    return false;
                }
                return true;
            case 1:
                if (this != obj && !this.f11694b.equals(obj)) {
                    return false;
                }
                return true;
            default:
                if (this != obj && !this.f11694b.equals(obj)) {
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
        switch (this.f11693a) {
            case 0:
                Map map = this.f11694b;
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
                h hVar = (h) this.e;
                hVar.getClass();
                List list = (List) collection;
                if (list instanceof RandomAccess) {
                    eVar = new e(hVar, obj, list, (e) null);
                } else {
                    eVar = new e(hVar, obj, list, (e) null);
                }
                return eVar;
            case 1:
                Map map2 = this.f11694b;
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
                mg mgVar = (mg) this.e;
                mgVar.getClass();
                List list2 = (List) collection2;
                if (list2 instanceof RandomAccess) {
                    eVar2 = new e(mgVar, obj, list2, (e) null);
                } else {
                    eVar2 = new e(mgVar, obj, list2, (e) null);
                }
                return eVar2;
            default:
                Map map3 = this.f11694b;
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
                s8.e0 e0Var = (s8.e0) this.e;
                List list3 = (List) collection3;
                if (list3 instanceof RandomAccess) {
                    eVar3 = new e(e0Var, obj, list3, (e) null);
                } else {
                    eVar3 = new e(e0Var, obj, list3, (e) null);
                }
                return eVar3;
        }
    }

    @Override
    public final int hashCode() {
        switch (this.f11693a) {
            case 0:
                return this.f11694b.hashCode();
            case 1:
                return this.f11694b.hashCode();
            default:
                return this.f11694b.hashCode();
        }
    }

    @Override
    public Set keySet() {
        s8.c cVar;
        switch (this.f11693a) {
            case 0:
                h hVar = (h) this.e;
                a aVar = hVar.f11466a;
                if (aVar == null) {
                    a aVar2 = new a(hVar, hVar.f11479c);
                    hVar.f11466a = aVar2;
                    return aVar2;
                }
                return aVar;
            case 1:
                mg mgVar = (mg) this.e;
                fd fdVar = mgVar.f14652a;
                if (fdVar == null) {
                    fd fdVar2 = new fd(mgVar, mgVar.f14666c);
                    mgVar.f14652a = fdVar2;
                    return fdVar2;
                }
                return fdVar;
            default:
                s8.e0 e0Var = (s8.e0) this.e;
                s8.c cVar2 = e0Var.f44131a;
                if (cVar2 == null) {
                    Map map = e0Var.d;
                    if (map instanceof NavigableMap) {
                        cVar = new s8.e(e0Var, (NavigableMap) map);
                    } else if (map instanceof SortedMap) {
                        cVar = new s8.h(e0Var, (SortedMap) map);
                    } else {
                        cVar = new s8.c(e0Var, map);
                    }
                    cVar2 = cVar;
                    e0Var.f44131a = cVar2;
                }
                return cVar2;
        }
    }

    @Override
    public final Object remove(Object obj) {
        switch (this.f11693a) {
            case 0:
                h hVar = (h) this.e;
                Collection collection = (Collection) this.f11694b.remove(obj);
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
                mg mgVar = (mg) this.e;
                Collection collection2 = (Collection) this.f11694b.remove(obj);
                if (collection2 == null) {
                    return null;
                }
                mgVar.getClass();
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.addAll(collection2);
                collection2.size();
                collection2.clear();
                return arrayList2;
            default:
                s8.e0 e0Var = (s8.e0) this.e;
                Collection collection3 = (Collection) this.f11694b.remove(obj);
                if (collection3 == null) {
                    return null;
                }
                List list = (List) e0Var.f44124f.get();
                list.addAll(collection3);
                e0Var.e -= collection3.size();
                collection3.clear();
                return list;
        }
    }

    @Override
    public final int size() {
        switch (this.f11693a) {
            case 0:
                return this.f11694b.size();
            case 1:
                return this.f11694b.size();
            default:
                return this.f11694b.size();
        }
    }

    @Override
    public final String toString() {
        switch (this.f11693a) {
            case 0:
                return this.f11694b.toString();
            case 1:
                return this.f11694b.toString();
            default:
                return this.f11694b.toString();
        }
    }

    @Override
    public final Collection values() {
        switch (this.f11693a) {
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
                    m mVar6 = new m(this, 5);
                    this.d = mVar6;
                    return mVar6;
                }
                return mVar5;
        }
    }
}
