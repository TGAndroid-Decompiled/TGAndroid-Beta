package b8;

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
public class mb extends AbstractMap {
    public final int f2753a;
    public final transient Map f2754b;
    public transient AbstractSet f2755c;
    public transient AbstractCollection d;
    public final Serializable f2756e;

    public mb(Serializable serializable, Map map, int i3) {
        this.f2753a = i3;
        this.f2756e = serializable;
        this.f2754b = map;
    }

    public g9.e0 b(Map.Entry entry) {
        ah ahVar;
        Object key = entry.getKey();
        g9.k1 k1Var = (g9.k1) this.f2756e;
        List list = (List) ((Collection) entry.getValue());
        if (list instanceof RandomAccess) {
            ahVar = new ah(k1Var, key, list, (ah) null);
        } else {
            ahVar = new ah(k1Var, key, list, (ah) null);
        }
        return new g9.e0(key, ahVar);
    }

    @Override
    public final void clear() {
        switch (this.f2753a) {
            case 0:
                g gVar = ((dh) this.f2756e).f2554c;
                if (this.f2754b == gVar) {
                    for (Collection collection : gVar.values()) {
                        collection.clear();
                    }
                    gVar.clear();
                    return;
                }
                ra raVar = new ra(this);
                while (raVar.hasNext()) {
                    raVar.next();
                    raVar.remove();
                }
                return;
            case 1:
                g9.k1 k1Var = (g9.k1) this.f2756e;
                if (this.f2754b == k1Var.f12091e) {
                    k1Var.clear();
                    return;
                }
                ra raVar2 = new ra(this, (byte) 0);
                while (raVar2.hasNext()) {
                    raVar2.next();
                    raVar2.remove();
                }
                return;
            default:
                z7.e eVar = (z7.e) this.f2756e;
                z7.i iVar = eVar.f59849c;
                if (this.f2754b == iVar) {
                    for (Collection collection2 : iVar.values()) {
                        collection2.clear();
                    }
                    iVar.clear();
                    eVar.d = 0;
                    return;
                }
                ra raVar3 = new ra(this, (char) 0);
                while (raVar3.hasNext()) {
                    raVar3.next();
                    raVar3.remove();
                }
                return;
        }
    }

    @Override
    public final boolean containsKey(Object obj) {
        switch (this.f2753a) {
            case 0:
                Map map = this.f2754b;
                map.getClass();
                try {
                    return map.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            case 1:
                Map map2 = this.f2754b;
                map2.getClass();
                try {
                    return map2.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    return false;
                }
            default:
                Map map3 = this.f2754b;
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
        switch (this.f2753a) {
            case 0:
                s9 s9Var = (s9) this.f2755c;
                if (s9Var == null) {
                    s9 s9Var2 = new s9(this);
                    this.f2755c = s9Var2;
                    return s9Var2;
                }
                return s9Var;
            case 1:
                g9.c cVar = (g9.c) this.f2755c;
                if (cVar == null) {
                    g9.c cVar2 = new g9.c(this, 0);
                    this.f2755c = cVar2;
                    return cVar2;
                }
                return cVar;
            default:
                z7.oa oaVar = (z7.oa) this.f2755c;
                if (oaVar == null) {
                    z7.oa oaVar2 = new z7.oa(this);
                    this.f2755c = oaVar2;
                    return oaVar2;
                }
                return oaVar;
        }
    }

    @Override
    public final boolean equals(Object obj) {
        switch (this.f2753a) {
            case 0:
                if (this != obj && !this.f2754b.equals(obj)) {
                    return false;
                }
                return true;
            case 1:
                if (this != obj && !this.f2754b.equals(obj)) {
                    return false;
                }
                return true;
            default:
                if (this != obj && !this.f2754b.equals(obj)) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final Object get(Object obj) {
        Object obj2;
        ah ahVar;
        Object obj3;
        ah ahVar2;
        Object obj4;
        ah ahVar3;
        switch (this.f2753a) {
            case 0:
                Map map = this.f2754b;
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
                dh dhVar = (dh) this.f2756e;
                dhVar.getClass();
                List list = (List) collection;
                if (list instanceof RandomAccess) {
                    ahVar = new ah(dhVar, obj, list, (ah) null);
                } else {
                    ahVar = new ah(dhVar, obj, list, (ah) null);
                }
                return ahVar;
            case 1:
                Map map2 = this.f2754b;
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
                g9.k1 k1Var = (g9.k1) this.f2756e;
                List list2 = (List) collection2;
                if (list2 instanceof RandomAccess) {
                    ahVar2 = new ah(k1Var, obj, list2, (ah) null);
                } else {
                    ahVar2 = new ah(k1Var, obj, list2, (ah) null);
                }
                return ahVar2;
            default:
                Map map3 = this.f2754b;
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
                z7.e eVar = (z7.e) this.f2756e;
                eVar.getClass();
                List list3 = (List) collection3;
                if (list3 instanceof RandomAccess) {
                    ahVar3 = new ah(eVar, obj, list3, (ah) null);
                } else {
                    ahVar3 = new ah(eVar, obj, list3, (ah) null);
                }
                return ahVar3;
        }
    }

    @Override
    public final int hashCode() {
        switch (this.f2753a) {
            case 0:
                return this.f2754b.hashCode();
            case 1:
                return this.f2754b.hashCode();
            default:
                return this.f2754b.hashCode();
        }
    }

    @Override
    public Set keySet() {
        switch (this.f2753a) {
            case 0:
                dh dhVar = (dh) this.f2756e;
                kd kdVar = dhVar.f2526a;
                if (kdVar == null) {
                    kd kdVar2 = new kd(dhVar, dhVar.f2554c);
                    dhVar.f2526a = kdVar2;
                    return kdVar2;
                }
                return kdVar;
            case 1:
                return ((g9.k1) this.f2756e).keySet();
            default:
                z7.e eVar = (z7.e) this.f2756e;
                z7.a aVar = eVar.f59824a;
                if (aVar == null) {
                    z7.a aVar2 = new z7.a(eVar, eVar.f59849c);
                    eVar.f59824a = aVar2;
                    return aVar2;
                }
                return aVar;
        }
    }

    @Override
    public final Object remove(Object obj) {
        switch (this.f2753a) {
            case 0:
                dh dhVar = (dh) this.f2756e;
                Collection collection = (Collection) this.f2754b.remove(obj);
                if (collection == null) {
                    return null;
                }
                dhVar.getClass();
                ArrayList arrayList = new ArrayList(3);
                arrayList.addAll(collection);
                collection.size();
                collection.clear();
                return arrayList;
            case 1:
                g9.k1 k1Var = (g9.k1) this.f2756e;
                Collection collection2 = (Collection) this.f2754b.remove(obj);
                if (collection2 == null) {
                    return null;
                }
                Collection h = k1Var.h();
                h.addAll(collection2);
                k1Var.f12092f -= collection2.size();
                collection2.clear();
                return h;
            default:
                z7.e eVar = (z7.e) this.f2756e;
                Collection collection3 = (Collection) this.f2754b.remove(obj);
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
        switch (this.f2753a) {
            case 0:
                return this.f2754b.size();
            case 1:
                return this.f2754b.size();
            default:
                return this.f2754b.size();
        }
    }

    @Override
    public final String toString() {
        switch (this.f2753a) {
            case 0:
                return this.f2754b.toString();
            case 1:
                return this.f2754b.toString();
            default:
                return this.f2754b.toString();
        }
    }

    @Override
    public final Collection values() {
        switch (this.f2753a) {
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
