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
public class e3 extends AbstractMap {
    public final byte a;
    public transient AbstractSet b;
    public transient AbstractCollection c;
    public final transient Map d;
    public final Serializable e;

    public e3(Serializable serializable, Map map, byte b) {
        this.a = b;
        this.e = serializable;
        this.d = map;
    }

    public final ko5 b(Map.Entry entry) {
        m3 m3Var;
        Object key = entry.getKey();
        fj7 fj7Var = (fj7) this.e;
        List list = (List) ((Collection) entry.getValue());
        if (list instanceof RandomAccess) {
            m3Var = new m3(fj7Var, key, list, (m3) null);
        } else {
            m3Var = new m3(fj7Var, key, list, (m3) null);
        }
        return new ko5(key, m3Var);
    }

    @Override
    public final void clear() {
        byte b = this.a;
        Serializable serializable = this.e;
        Map map = this.d;
        switch (b) {
            case 0:
                fj7 fj7Var = (fj7) serializable;
                if (map == fj7Var.e) {
                    fj7Var.b();
                    return;
                }
                d3 d3Var = new d3(this);
                while (d3Var.hasNext()) {
                    d3Var.next();
                    d3Var.remove();
                }
                return;
            case 1:
                lp2 lp2Var = (lp2) map;
                lp2 lp2Var2 = ((lmf) serializable).c;
                if (lp2Var == lp2Var2) {
                    for (Collection collection : lp2Var2.values()) {
                        collection.clear();
                    }
                    lp2Var2.clear();
                    return;
                }
                d3 d3Var2 = new d3(this, (byte) 0);
                while (d3Var2.hasNext()) {
                    d3Var2.next();
                    d3Var2.remove();
                }
                return;
            default:
                lp2 lp2Var3 = (lp2) map;
                ccd ccdVar = (ccd) serializable;
                lp2 lp2Var4 = ccdVar.c;
                if (lp2Var3 == lp2Var4) {
                    for (Collection collection2 : lp2Var4.values()) {
                        collection2.clear();
                    }
                    lp2Var4.clear();
                    ccdVar.d = 0;
                    return;
                }
                d3 d3Var3 = new d3(this, (char) 0);
                while (d3Var3.hasNext()) {
                    d3Var3.next();
                    d3Var3.remove();
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
                lp2 lp2Var = (lp2) map;
                lp2Var.getClass();
                try {
                    return lp2Var.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    return false;
                }
            default:
                lp2 lp2Var2 = (lp2) map;
                lp2Var2.getClass();
                try {
                    return lp2Var2.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused3) {
                    return false;
                }
        }
    }

    @Override
    public final Set entrySet() {
        switch (this.a) {
            case 0:
                c3 c3Var = (c3) this.b;
                if (c3Var == null) {
                    c3 c3Var2 = new c3(this, (byte) 0);
                    this.b = c3Var2;
                    return c3Var2;
                }
                return c3Var;
            case 1:
                o4f o4fVar = (o4f) this.b;
                if (o4fVar == null) {
                    o4f o4fVar2 = new o4f(this);
                    this.b = o4fVar2;
                    return o4fVar2;
                }
                return o4fVar;
            default:
                mlf mlfVar = (mlf) this.b;
                if (mlfVar == null) {
                    mlf mlfVar2 = new mlf(this);
                    this.b = mlfVar2;
                    return mlfVar2;
                }
                return mlfVar;
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
                if (this != obj && !((lp2) this.d).equals(obj)) {
                    return false;
                }
                return true;
            default:
                if (this != obj && !((lp2) this.d).equals(obj)) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final Object get(Object obj) {
        Object obj2;
        m3 m3Var;
        Object obj3;
        m3 m3Var2;
        Object obj4;
        m3 m3Var3;
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
                fj7 fj7Var = (fj7) serializable;
                List list = (List) collection;
                if (list instanceof RandomAccess) {
                    m3Var = new m3(fj7Var, obj, list, (m3) null);
                } else {
                    m3Var = new m3(fj7Var, obj, list, (m3) null);
                }
                return m3Var;
            case 1:
                lp2 lp2Var = (lp2) map;
                lp2Var.getClass();
                try {
                    obj3 = lp2Var.get(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    obj3 = null;
                }
                Collection collection2 = (Collection) obj3;
                if (collection2 == null) {
                    return null;
                }
                lmf lmfVar = (lmf) serializable;
                List list2 = (List) collection2;
                if (list2 instanceof RandomAccess) {
                    m3Var2 = new m3(lmfVar, obj, list2, (m3) null);
                } else {
                    m3Var2 = new m3(lmfVar, obj, list2, (m3) null);
                }
                return m3Var2;
            default:
                lp2 lp2Var2 = (lp2) map;
                lp2Var2.getClass();
                try {
                    obj4 = lp2Var2.get(obj);
                } catch (ClassCastException | NullPointerException unused3) {
                    obj4 = null;
                }
                Collection collection3 = (Collection) obj4;
                if (collection3 == null) {
                    return null;
                }
                ccd ccdVar = (ccd) serializable;
                List list3 = (List) collection3;
                if (list3 instanceof RandomAccess) {
                    m3Var3 = new m3(ccdVar, obj, list3, (m3) null);
                } else {
                    m3Var3 = new m3(ccdVar, obj, list3, (m3) null);
                }
                return m3Var3;
        }
    }

    @Override
    public final int hashCode() {
        switch (this.a) {
            case 0:
                return this.d.hashCode();
            case 1:
                return ((lp2) this.d).hashCode();
            default:
                return ((lp2) this.d).hashCode();
        }
    }

    @Override
    public Set keySet() {
        byte b = this.a;
        Serializable serializable = this.e;
        switch (b) {
            case 0:
                return ((fj7) serializable).j();
            case 1:
                lmf lmfVar = (lmf) serializable;
                o4f o4fVar = lmfVar.a;
                if (o4fVar == null) {
                    o4f o4fVar2 = new o4f(lmfVar, lmfVar.c);
                    lmfVar.a = o4fVar2;
                    return o4fVar2;
                }
                return o4fVar;
            default:
                ccd ccdVar = (ccd) serializable;
                w9d w9dVar = ccdVar.a;
                if (w9dVar == null) {
                    w9d w9dVar2 = new w9d(ccdVar, ccdVar.c);
                    ccdVar.a = w9dVar2;
                    return w9dVar2;
                }
                return w9dVar;
        }
    }

    @Override
    public final Object remove(Object obj) {
        byte b = this.a;
        Serializable serializable = this.e;
        Map map = this.d;
        switch (b) {
            case 0:
                fj7 fj7Var = (fj7) serializable;
                Collection collection = (Collection) map.remove(obj);
                if (collection == null) {
                    return null;
                }
                Collection m = fj7Var.m();
                m.addAll(collection);
                fj7Var.f -= collection.size();
                collection.clear();
                return m;
            case 1:
                Collection collection2 = (Collection) ((lp2) map).remove(obj);
                if (collection2 == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(3);
                arrayList.addAll(collection2);
                collection2.size();
                collection2.clear();
                return arrayList;
            default:
                ccd ccdVar = (ccd) serializable;
                Collection collection3 = (Collection) ((lp2) map).remove(obj);
                if (collection3 == null) {
                    return null;
                }
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.addAll(collection3);
                ccdVar.d -= collection3.size();
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
                return ((lp2) this.d).size();
            default:
                return ((lp2) this.d).size();
        }
    }

    @Override
    public final String toString() {
        switch (this.a) {
            case 0:
                return this.d.toString();
            case 1:
                return ((lp2) this.d).toString();
            default:
                return ((lp2) this.d).toString();
        }
    }

    @Override
    public final Collection values() {
        switch (this.a) {
            case 0:
                q3 q3Var = (q3) this.c;
                if (q3Var == null) {
                    q3 q3Var2 = new q3((AbstractMap) this, (byte) 3);
                    this.c = q3Var2;
                    return q3Var2;
                }
                return q3Var;
            case 1:
                q3 q3Var3 = (q3) this.c;
                if (q3Var3 == null) {
                    q3 q3Var4 = new q3((AbstractMap) this, (byte) 6);
                    this.c = q3Var4;
                    return q3Var4;
                }
                return q3Var3;
            default:
                q3 q3Var5 = (q3) this.c;
                if (q3Var5 == null) {
                    q3 q3Var6 = new q3((AbstractMap) this, (byte) 7);
                    this.c = q3Var6;
                    return q3Var6;
                }
                return q3Var5;
        }
    }
}
