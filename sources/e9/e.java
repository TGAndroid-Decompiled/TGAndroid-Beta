package e9;

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
import x7.qa;
import z7.fd;
import z7.l9;
import z7.mg;
public class e extends AbstractMap {
    public final int f8432a;
    public final transient Map f8433b;
    public transient AbstractSet f8434c;
    public transient AbstractCollection d;
    public final Serializable e;

    public e(Serializable serializable, Map map, int i10) {
        this.f8432a = i10;
        this.e = serializable;
        this.f8433b = map;
    }

    public j0 a(Map.Entry entry) {
        m mVar;
        Object key = entry.getKey();
        p1 p1Var = (p1) this.e;
        List list = (List) ((Collection) entry.getValue());
        if (list instanceof RandomAccess) {
            mVar = new m(p1Var, key, list, (m) null);
        } else {
            mVar = new m(p1Var, key, list, (m) null);
        }
        return new j0(key, mVar);
    }

    @Override
    public final void clear() {
        switch (this.f8432a) {
            case 0:
                p1 p1Var = (p1) this.e;
                if (this.f8433b == p1Var.e) {
                    p1Var.clear();
                    return;
                }
                d dVar = new d(this);
                while (dVar.hasNext()) {
                    dVar.next();
                    dVar.remove();
                }
                return;
            case 1:
                x7.f fVar = (x7.f) this.e;
                x7.j jVar = fVar.f49373c;
                if (this.f8433b == jVar) {
                    for (Collection collection : jVar.values()) {
                        collection.clear();
                    }
                    jVar.clear();
                    fVar.d = 0;
                    return;
                }
                d dVar2 = new d(this, (byte) 0);
                while (dVar2.hasNext()) {
                    dVar2.next();
                    dVar2.remove();
                }
                return;
            default:
                z7.d dVar3 = ((mg) this.e).f51115c;
                if (this.f8433b == dVar3) {
                    for (Collection collection2 : dVar3.values()) {
                        collection2.clear();
                    }
                    dVar3.clear();
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
        switch (this.f8432a) {
            case 0:
                Map map = this.f8433b;
                map.getClass();
                try {
                    return map.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            case 1:
                Map map2 = this.f8433b;
                map2.getClass();
                try {
                    return map2.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    return false;
                }
            default:
                Map map3 = this.f8433b;
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
        switch (this.f8432a) {
            case 0:
                c cVar = (c) this.f8434c;
                if (cVar == null) {
                    c cVar2 = new c(this, 0);
                    this.f8434c = cVar2;
                    return cVar2;
                }
                return cVar;
            case 1:
                qa qaVar = (qa) this.f8434c;
                if (qaVar == null) {
                    qa qaVar2 = new qa(this);
                    this.f8434c = qaVar2;
                    return qaVar2;
                }
                return qaVar;
            default:
                l9 l9Var = (l9) this.f8434c;
                if (l9Var == null) {
                    l9 l9Var2 = new l9(this);
                    this.f8434c = l9Var2;
                    return l9Var2;
                }
                return l9Var;
        }
    }

    @Override
    public final boolean equals(Object obj) {
        switch (this.f8432a) {
            case 0:
                if (this != obj && !this.f8433b.equals(obj)) {
                    return false;
                }
                return true;
            case 1:
                if (this != obj && !this.f8433b.equals(obj)) {
                    return false;
                }
                return true;
            default:
                if (this != obj && !this.f8433b.equals(obj)) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final Object get(Object obj) {
        Object obj2;
        m mVar;
        Object obj3;
        m mVar2;
        Object obj4;
        m mVar3;
        switch (this.f8432a) {
            case 0:
                Map map = this.f8433b;
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
                p1 p1Var = (p1) this.e;
                List list = (List) collection;
                if (list instanceof RandomAccess) {
                    mVar = new m(p1Var, obj, list, (m) null);
                } else {
                    mVar = new m(p1Var, obj, list, (m) null);
                }
                return mVar;
            case 1:
                Map map2 = this.f8433b;
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
                    mVar2 = new m(fVar, obj, list2, (m) null);
                } else {
                    mVar2 = new m(fVar, obj, list2, (m) null);
                }
                return mVar2;
            default:
                Map map3 = this.f8433b;
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
                mg mgVar = (mg) this.e;
                mgVar.getClass();
                List list3 = (List) collection3;
                if (list3 instanceof RandomAccess) {
                    mVar3 = new m(mgVar, obj, list3, (m) null);
                } else {
                    mVar3 = new m(mgVar, obj, list3, (m) null);
                }
                return mVar3;
        }
    }

    @Override
    public final int hashCode() {
        switch (this.f8432a) {
            case 0:
                return this.f8433b.hashCode();
            case 1:
                return this.f8433b.hashCode();
            default:
                return this.f8433b.hashCode();
        }
    }

    @Override
    public Set keySet() {
        switch (this.f8432a) {
            case 0:
                return ((p1) this.e).keySet();
            case 1:
                x7.f fVar = (x7.f) this.e;
                x7.a aVar = fVar.f49359a;
                if (aVar == null) {
                    x7.a aVar2 = new x7.a(fVar, fVar.f49373c);
                    fVar.f49359a = aVar2;
                    return aVar2;
                }
                return aVar;
            default:
                mg mgVar = (mg) this.e;
                fd fdVar = mgVar.f51101a;
                if (fdVar == null) {
                    fd fdVar2 = new fd(mgVar, mgVar.f51115c);
                    mgVar.f51101a = fdVar2;
                    return fdVar2;
                }
                return fdVar;
        }
    }

    @Override
    public final Object remove(Object obj) {
        switch (this.f8432a) {
            case 0:
                p1 p1Var = (p1) this.e;
                Collection collection = (Collection) this.f8433b.remove(obj);
                if (collection == null) {
                    return null;
                }
                Collection h = p1Var.h();
                h.addAll(collection);
                p1Var.f8485f -= collection.size();
                collection.clear();
                return h;
            case 1:
                x7.f fVar = (x7.f) this.e;
                Collection collection2 = (Collection) this.f8433b.remove(obj);
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
                mg mgVar = (mg) this.e;
                Collection collection3 = (Collection) this.f8433b.remove(obj);
                if (collection3 == null) {
                    return null;
                }
                mgVar.getClass();
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.addAll(collection3);
                collection3.size();
                collection3.clear();
                return arrayList2;
        }
    }

    @Override
    public final int size() {
        switch (this.f8432a) {
            case 0:
                return this.f8433b.size();
            case 1:
                return this.f8433b.size();
            default:
                return this.f8433b.size();
        }
    }

    @Override
    public final String toString() {
        switch (this.f8432a) {
            case 0:
                return this.f8433b.toString();
            case 1:
                return this.f8433b.toString();
            default:
                return this.f8433b.toString();
        }
    }

    @Override
    public final Collection values() {
        switch (this.f8432a) {
            case 0:
                o oVar = (o) this.d;
                if (oVar == null) {
                    o oVar2 = new o((AbstractMap) this, 3);
                    this.d = oVar2;
                    return oVar2;
                }
                return oVar;
            case 1:
                o oVar3 = (o) this.d;
                if (oVar3 == null) {
                    o oVar4 = new o((AbstractMap) this, 5);
                    this.d = oVar4;
                    return oVar4;
                }
                return oVar3;
            default:
                o oVar5 = (o) this.d;
                if (oVar5 == null) {
                    o oVar6 = new o((AbstractMap) this, 7);
                    this.d = oVar6;
                    return oVar6;
                }
                return oVar5;
        }
    }
}
