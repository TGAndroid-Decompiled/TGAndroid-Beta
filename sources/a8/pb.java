package a8;

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
public class pb extends AbstractMap {
    public final int f738a;
    public final transient Map f739b;
    public transient AbstractSet f740c;
    public transient AbstractCollection d;
    public final Serializable e;

    public pb(Serializable serializable, Map map, int i10) {
        this.f738a = i10;
        this.e = serializable;
        this.f739b = map;
    }

    public f9.e0 a(Map.Entry entry) {
        dh dhVar;
        Object key = entry.getKey();
        f9.k1 k1Var = (f9.k1) this.e;
        List list = (List) ((Collection) entry.getValue());
        if (list instanceof RandomAccess) {
            dhVar = new dh(k1Var, key, list, (dh) null);
        } else {
            dhVar = new dh(k1Var, key, list, (dh) null);
        }
        return new f9.e0(key, dhVar);
    }

    @Override
    public final void clear() {
        switch (this.f738a) {
            case 0:
                g gVar = ((gh) this.e).f508c;
                if (this.f739b == gVar) {
                    for (Collection collection : gVar.values()) {
                        collection.clear();
                    }
                    gVar.clear();
                    return;
                }
                ta taVar = new ta(this);
                while (taVar.hasNext()) {
                    taVar.next();
                    taVar.remove();
                }
                return;
            case 1:
                f9.k1 k1Var = (f9.k1) this.e;
                if (this.f739b == k1Var.e) {
                    k1Var.clear();
                    return;
                }
                ta taVar2 = new ta(this, (byte) 0);
                while (taVar2.hasNext()) {
                    taVar2.next();
                    taVar2.remove();
                }
                return;
            default:
                y7.e eVar = (y7.e) this.e;
                y7.i iVar = eVar.f52121c;
                if (this.f739b == iVar) {
                    for (Collection collection2 : iVar.values()) {
                        collection2.clear();
                    }
                    iVar.clear();
                    eVar.d = 0;
                    return;
                }
                ta taVar3 = new ta(this, (char) 0);
                while (taVar3.hasNext()) {
                    taVar3.next();
                    taVar3.remove();
                }
                return;
        }
    }

    @Override
    public final boolean containsKey(Object obj) {
        switch (this.f738a) {
            case 0:
                Map map = this.f739b;
                map.getClass();
                try {
                    return map.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            case 1:
                Map map2 = this.f739b;
                map2.getClass();
                try {
                    return map2.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    return false;
                }
            default:
                Map map3 = this.f739b;
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
        switch (this.f738a) {
            case 0:
                u9 u9Var = (u9) this.f740c;
                if (u9Var == null) {
                    u9 u9Var2 = new u9(this);
                    this.f740c = u9Var2;
                    return u9Var2;
                }
                return u9Var;
            case 1:
                f9.c cVar = (f9.c) this.f740c;
                if (cVar == null) {
                    f9.c cVar2 = new f9.c(this, 0);
                    this.f740c = cVar2;
                    return cVar2;
                }
                return cVar;
            default:
                y7.na naVar = (y7.na) this.f740c;
                if (naVar == null) {
                    y7.na naVar2 = new y7.na(this);
                    this.f740c = naVar2;
                    return naVar2;
                }
                return naVar;
        }
    }

    @Override
    public final boolean equals(Object obj) {
        switch (this.f738a) {
            case 0:
                if (this != obj && !this.f739b.equals(obj)) {
                    return false;
                }
                return true;
            case 1:
                if (this != obj && !this.f739b.equals(obj)) {
                    return false;
                }
                return true;
            default:
                if (this != obj && !this.f739b.equals(obj)) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final Object get(Object obj) {
        Object obj2;
        dh dhVar;
        Object obj3;
        dh dhVar2;
        Object obj4;
        dh dhVar3;
        switch (this.f738a) {
            case 0:
                Map map = this.f739b;
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
                gh ghVar = (gh) this.e;
                ghVar.getClass();
                List list = (List) collection;
                if (list instanceof RandomAccess) {
                    dhVar = new dh(ghVar, obj, list, (dh) null);
                } else {
                    dhVar = new dh(ghVar, obj, list, (dh) null);
                }
                return dhVar;
            case 1:
                Map map2 = this.f739b;
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
                f9.k1 k1Var = (f9.k1) this.e;
                List list2 = (List) collection2;
                if (list2 instanceof RandomAccess) {
                    dhVar2 = new dh(k1Var, obj, list2, (dh) null);
                } else {
                    dhVar2 = new dh(k1Var, obj, list2, (dh) null);
                }
                return dhVar2;
            default:
                Map map3 = this.f739b;
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
                y7.e eVar = (y7.e) this.e;
                eVar.getClass();
                List list3 = (List) collection3;
                if (list3 instanceof RandomAccess) {
                    dhVar3 = new dh(eVar, obj, list3, (dh) null);
                } else {
                    dhVar3 = new dh(eVar, obj, list3, (dh) null);
                }
                return dhVar3;
        }
    }

    @Override
    public final int hashCode() {
        switch (this.f738a) {
            case 0:
                return this.f739b.hashCode();
            case 1:
                return this.f739b.hashCode();
            default:
                return this.f739b.hashCode();
        }
    }

    @Override
    public Set keySet() {
        switch (this.f738a) {
            case 0:
                gh ghVar = (gh) this.e;
                nd ndVar = ghVar.f466a;
                if (ndVar == null) {
                    nd ndVar2 = new nd(ghVar, ghVar.f508c);
                    ghVar.f466a = ndVar2;
                    return ndVar2;
                }
                return ndVar;
            case 1:
                return ((f9.k1) this.e).keySet();
            default:
                y7.e eVar = (y7.e) this.e;
                y7.a aVar = eVar.f52104a;
                if (aVar == null) {
                    y7.a aVar2 = new y7.a(eVar, eVar.f52121c);
                    eVar.f52104a = aVar2;
                    return aVar2;
                }
                return aVar;
        }
    }

    @Override
    public final Object remove(Object obj) {
        switch (this.f738a) {
            case 0:
                gh ghVar = (gh) this.e;
                Collection collection = (Collection) this.f739b.remove(obj);
                if (collection == null) {
                    return null;
                }
                ghVar.getClass();
                ArrayList arrayList = new ArrayList(3);
                arrayList.addAll(collection);
                collection.size();
                collection.clear();
                return arrayList;
            case 1:
                f9.k1 k1Var = (f9.k1) this.e;
                Collection collection2 = (Collection) this.f739b.remove(obj);
                if (collection2 == null) {
                    return null;
                }
                Collection h = k1Var.h();
                h.addAll(collection2);
                k1Var.f10293f -= collection2.size();
                collection2.clear();
                return h;
            default:
                y7.e eVar = (y7.e) this.e;
                Collection collection3 = (Collection) this.f739b.remove(obj);
                if (collection3 == null) {
                    return null;
                }
                eVar.getClass();
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.addAll(collection3);
                eVar.d -= collection3.size();
                collection3.clear();
                return arrayList2;
        }
    }

    @Override
    public final int size() {
        switch (this.f738a) {
            case 0:
                return this.f739b.size();
            case 1:
                return this.f739b.size();
            default:
                return this.f739b.size();
        }
    }

    @Override
    public final String toString() {
        switch (this.f738a) {
            case 0:
                return this.f739b.toString();
            case 1:
                return this.f739b.toString();
            default:
                return this.f739b.toString();
        }
    }

    @Override
    public final Collection values() {
        switch (this.f738a) {
            case 0:
                f fVar = (f) this.d;
                if (fVar == null) {
                    f fVar2 = new f((AbstractMap) this, 1);
                    this.d = fVar2;
                    return fVar2;
                }
                return fVar;
            case 1:
                f fVar3 = (f) this.d;
                if (fVar3 == null) {
                    f fVar4 = new f((AbstractMap) this, 5);
                    this.d = fVar4;
                    return fVar4;
                }
                return fVar3;
            default:
                f fVar5 = (f) this.d;
                if (fVar5 == null) {
                    f fVar6 = new f((AbstractMap) this, 7);
                    this.d = fVar6;
                    return fVar6;
                }
                return fVar5;
        }
    }
}
