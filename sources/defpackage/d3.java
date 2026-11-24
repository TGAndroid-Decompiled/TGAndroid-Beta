package defpackage;

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
public class d3 extends AbstractMap {
    public final byte a;
    public transient AbstractSet b;
    public transient AbstractCollection c;
    public final transient Map d;
    public final Serializable e;

    public d3(Serializable serializable, Map map, byte b) {
        this.a = b;
        this.e = serializable;
        this.d = map;
    }

    public final hm5 b(Map.Entry entry) {
        l3 l3Var;
        Object key = entry.getKey();
        wg7 wg7Var = (wg7) this.e;
        List list = (List) ((Collection) entry.getValue());
        if (list instanceof RandomAccess) {
            l3Var = new l3(wg7Var, key, list, (l3) null);
        } else {
            l3Var = new l3(wg7Var, key, list, (l3) null);
        }
        return new hm5(key, l3Var);
    }

    @Override
    public final void clear() {
        byte b = this.a;
        Serializable serializable = this.e;
        Map map = this.d;
        switch (b) {
            case 0:
                wg7 wg7Var = (wg7) serializable;
                if (map == wg7Var.e) {
                    wg7Var.b();
                    return;
                }
                c3 c3Var = new c3(this);
                while (c3Var.hasNext()) {
                    c3Var.next();
                    c3Var.remove();
                }
                return;
            case 1:
                so2 so2Var = (so2) map;
                so2 so2Var2 = ((vhf) serializable).c;
                if (so2Var == so2Var2) {
                    for (Collection collection : so2Var2.values()) {
                        collection.clear();
                    }
                    so2Var2.clear();
                    return;
                }
                c3 c3Var2 = new c3(this, (byte) 0);
                while (c3Var2.hasNext()) {
                    c3Var2.next();
                    c3Var2.remove();
                }
                return;
            default:
                so2 so2Var3 = (so2) map;
                j7d j7dVar = (j7d) serializable;
                so2 so2Var4 = j7dVar.c;
                if (so2Var3 == so2Var4) {
                    for (Collection collection2 : so2Var4.values()) {
                        collection2.clear();
                    }
                    so2Var4.clear();
                    j7dVar.d = 0;
                    return;
                }
                c3 c3Var3 = new c3(this, (char) 0);
                while (c3Var3.hasNext()) {
                    c3Var3.next();
                    c3Var3.remove();
                }
                return;
        }
    }

    @Override
    public final boolean containsKey(Object obj) {
        byte b = this.a;
        Map map = this.d;
        switch (b) {
            case 0:
                map.getClass();
                try {
                    return map.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            case 1:
                so2 so2Var = (so2) map;
                so2Var.getClass();
                try {
                    return so2Var.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    return false;
                }
            default:
                so2 so2Var2 = (so2) map;
                so2Var2.getClass();
                try {
                    return so2Var2.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused3) {
                    return false;
                }
        }
    }

    @Override
    public final Set entrySet() {
        switch (this.a) {
            case 0:
                b3 b3Var = (b3) this.b;
                if (b3Var == null) {
                    b3 b3Var2 = new b3(this, (byte) 0);
                    this.b = b3Var2;
                    return b3Var2;
                }
                return b3Var;
            case 1:
                xze xzeVar = (xze) this.b;
                if (xzeVar == null) {
                    xze xzeVar2 = new xze(this);
                    this.b = xzeVar2;
                    return xzeVar2;
                }
                return xzeVar;
            default:
                wgf wgfVar = (wgf) this.b;
                if (wgfVar == null) {
                    wgf wgfVar2 = new wgf(this);
                    this.b = wgfVar2;
                    return wgfVar2;
                }
                return wgfVar;
        }
    }

    @Override
    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (this != obj && !this.d.equals(obj)) {
                    return false;
                }
                return true;
            case 1:
                if (this != obj && !((so2) this.d).equals(obj)) {
                    return false;
                }
                return true;
            default:
                if (this != obj && !((so2) this.d).equals(obj)) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final Object get(Object obj) {
        Object obj2;
        l3 l3Var;
        Object obj3;
        l3 l3Var2;
        Object obj4;
        l3 l3Var3;
        byte b = this.a;
        Serializable serializable = this.e;
        Map map = this.d;
        switch (b) {
            case 0:
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
                wg7 wg7Var = (wg7) serializable;
                List list = (List) collection;
                if (list instanceof RandomAccess) {
                    l3Var = new l3(wg7Var, obj, list, (l3) null);
                } else {
                    l3Var = new l3(wg7Var, obj, list, (l3) null);
                }
                return l3Var;
            case 1:
                so2 so2Var = (so2) map;
                so2Var.getClass();
                try {
                    obj3 = so2Var.get(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    obj3 = null;
                }
                Collection collection2 = (Collection) obj3;
                if (collection2 == null) {
                    return null;
                }
                vhf vhfVar = (vhf) serializable;
                List list2 = (List) collection2;
                if (list2 instanceof RandomAccess) {
                    l3Var2 = new l3(vhfVar, obj, list2, (l3) null);
                } else {
                    l3Var2 = new l3(vhfVar, obj, list2, (l3) null);
                }
                return l3Var2;
            default:
                so2 so2Var2 = (so2) map;
                so2Var2.getClass();
                try {
                    obj4 = so2Var2.get(obj);
                } catch (ClassCastException | NullPointerException unused3) {
                    obj4 = null;
                }
                Collection collection3 = (Collection) obj4;
                if (collection3 == null) {
                    return null;
                }
                j7d j7dVar = (j7d) serializable;
                List list3 = (List) collection3;
                if (list3 instanceof RandomAccess) {
                    l3Var3 = new l3(j7dVar, obj, list3, (l3) null);
                } else {
                    l3Var3 = new l3(j7dVar, obj, list3, (l3) null);
                }
                return l3Var3;
        }
    }

    @Override
    public final int hashCode() {
        switch (this.a) {
            case 0:
                return this.d.hashCode();
            case 1:
                return ((so2) this.d).hashCode();
            default:
                return ((so2) this.d).hashCode();
        }
    }

    @Override
    public Set keySet() {
        byte b = this.a;
        Serializable serializable = this.e;
        switch (b) {
            case 0:
                return ((wg7) serializable).j();
            case 1:
                vhf vhfVar = (vhf) serializable;
                xze xzeVar = vhfVar.a;
                if (xzeVar == null) {
                    xze xzeVar2 = new xze(vhfVar, vhfVar.c);
                    vhfVar.a = xzeVar2;
                    return xzeVar2;
                }
                return xzeVar;
            default:
                j7d j7dVar = (j7d) serializable;
                d5d d5dVar = j7dVar.a;
                if (d5dVar == null) {
                    d5d d5dVar2 = new d5d(j7dVar, j7dVar.c);
                    j7dVar.a = d5dVar2;
                    return d5dVar2;
                }
                return d5dVar;
        }
    }

    @Override
    public final Object remove(Object obj) {
        byte b = this.a;
        Serializable serializable = this.e;
        Map map = this.d;
        switch (b) {
            case 0:
                wg7 wg7Var = (wg7) serializable;
                Collection collection = (Collection) map.remove(obj);
                if (collection == null) {
                    return null;
                }
                Collection m = wg7Var.m();
                m.addAll(collection);
                wg7Var.f -= collection.size();
                collection.clear();
                return m;
            case 1:
                Collection collection2 = (Collection) ((so2) map).remove(obj);
                if (collection2 == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(3);
                arrayList.addAll(collection2);
                collection2.size();
                collection2.clear();
                return arrayList;
            default:
                j7d j7dVar = (j7d) serializable;
                Collection collection3 = (Collection) ((so2) map).remove(obj);
                if (collection3 == null) {
                    return null;
                }
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.addAll(collection3);
                j7dVar.d -= collection3.size();
                collection3.clear();
                return arrayList2;
        }
    }

    @Override
    public final int size() {
        switch (this.a) {
            case 0:
                return this.d.size();
            case 1:
                return ((so2) this.d).size();
            default:
                return ((so2) this.d).size();
        }
    }

    @Override
    public final String toString() {
        switch (this.a) {
            case 0:
                return this.d.toString();
            case 1:
                return ((so2) this.d).toString();
            default:
                return ((so2) this.d).toString();
        }
    }

    @Override
    public final Collection values() {
        switch (this.a) {
            case 0:
                p3 p3Var = (p3) this.c;
                if (p3Var == null) {
                    p3 p3Var2 = new p3((AbstractMap) this, (byte) 3);
                    this.c = p3Var2;
                    return p3Var2;
                }
                return p3Var;
            case 1:
                p3 p3Var3 = (p3) this.c;
                if (p3Var3 == null) {
                    p3 p3Var4 = new p3((AbstractMap) this, (byte) 6);
                    this.c = p3Var4;
                    return p3Var4;
                }
                return p3Var3;
            default:
                p3 p3Var5 = (p3) this.c;
                if (p3Var5 == null) {
                    p3 p3Var6 = new p3((AbstractMap) this, (byte) 7);
                    this.c = p3Var6;
                    return p3Var6;
                }
                return p3Var5;
        }
    }
}
