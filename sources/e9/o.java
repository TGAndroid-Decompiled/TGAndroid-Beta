package e9;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import v7.t6;
import w7.h9;
import w7.n8;
import z7.mg;
public class o extends AbstractCollection {
    public final int f8476a;
    public final Object f8477b;

    public o(Object obj, int i10) {
        this.f8476a = i10;
        this.f8477b = obj;
    }

    @Override
    public final void clear() {
        switch (this.f8476a) {
            case 0:
                ((p) this.f8477b).clear();
                return;
            case 1:
                ((p1) this.f8477b).clear();
                return;
            case 2:
                ((x) this.f8477b).clear();
                return;
            case 3:
                ((AbstractMap) this.f8477b).clear();
                return;
            case 4:
                ((x7.j) this.f8477b).clear();
                return;
            case 5:
                ((e) this.f8477b).clear();
                return;
            case 6:
                ((z7.d) this.f8477b).clear();
                return;
            default:
                ((e) this.f8477b).clear();
                return;
        }
    }

    @Override
    public boolean contains(Object obj) {
        switch (this.f8476a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                Collection collection = (Collection) ((p) this.f8477b).b().get(key);
                if (collection == null || !collection.contains(value)) {
                    return false;
                }
                return true;
            case 1:
                return ((p1) this.f8477b).c(obj);
            case 2:
            case 4:
            case 6:
            default:
                return super.contains(obj);
            case 3:
                return ((AbstractMap) this.f8477b).containsValue(obj);
            case 5:
                return ((e) this.f8477b).containsValue(obj);
            case 7:
                return ((e) this.f8477b).containsValue(obj);
        }
    }

    @Override
    public boolean isEmpty() {
        switch (this.f8476a) {
            case 3:
                return ((AbstractMap) this.f8477b).isEmpty();
            case 4:
            case 6:
            default:
                return super.isEmpty();
            case 5:
                return ((e) this.f8477b).isEmpty();
            case 7:
                return ((e) this.f8477b).isEmpty();
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f8476a) {
            case 0:
                return ((p) this.f8477b).g();
            case 1:
                return new b((p1) this.f8477b, 0);
            case 2:
                x xVar = (x) this.f8477b;
                Map c10 = xVar.c();
                if (c10 != null) {
                    return c10.values().iterator();
                }
                return new t(xVar, 2);
            case 3:
                return new l2(((AbstractMap) this.f8477b).entrySet().iterator());
            case 4:
                x7.j jVar = (x7.j) this.f8477b;
                Map a2 = jVar.a();
                if (a2 != null) {
                    return a2.values().iterator();
                }
                return new x7.g(jVar, 2);
            case 5:
                return new com.google.android.gms.internal.clearcut.g1(((e) this.f8477b).entrySet().iterator(), 1);
            case 6:
                z7.d dVar = (z7.d) this.f8477b;
                Map a10 = dVar.a();
                if (a10 != null) {
                    return a10.values().iterator();
                }
                return new z7.a(dVar, 2);
            default:
                return new com.google.android.gms.internal.clearcut.g1(((e) this.f8477b).entrySet().iterator(), 2);
        }
    }

    @Override
    public boolean remove(Object obj) {
        switch (this.f8476a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    return ((p) this.f8477b).remove(entry.getKey(), entry.getValue());
                }
                return false;
            case 3:
                AbstractMap abstractMap = (AbstractMap) this.f8477b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry2 : abstractMap.entrySet()) {
                        if (t6.a(obj, entry2.getValue())) {
                            abstractMap.remove(entry2.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 5:
                e eVar = (e) this.f8477b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused2) {
                    for (Map.Entry entry3 : eVar.entrySet()) {
                        if (n8.a(obj, entry3.getValue())) {
                            eVar.remove(entry3.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 7:
                e eVar2 = (e) this.f8477b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused3) {
                    for (Map.Entry entry4 : eVar2.entrySet()) {
                        if (h9.a(obj, entry4.getValue())) {
                            eVar2.remove(entry4.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override
    public boolean removeAll(Collection collection) {
        switch (this.f8476a) {
            case 3:
                AbstractMap abstractMap = (AbstractMap) this.f8477b;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().removeAll(hashSet);
                }
            case 4:
            case 6:
            default:
                return super.removeAll(collection);
            case 5:
                e eVar = (e) this.f8477b;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : eVar.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((x7.f) eVar.e).b().removeAll(hashSet2);
                }
            case 7:
                e eVar2 = (e) this.f8477b;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused3) {
                    HashSet hashSet3 = new HashSet();
                    for (Map.Entry entry3 : eVar2.entrySet()) {
                        if (collection.contains(entry3.getValue())) {
                            hashSet3.add(entry3.getKey());
                        }
                    }
                    return ((mg) eVar2.e).b().removeAll(hashSet3);
                }
        }
    }

    @Override
    public boolean retainAll(Collection collection) {
        switch (this.f8476a) {
            case 3:
                AbstractMap abstractMap = (AbstractMap) this.f8477b;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().retainAll(hashSet);
                }
            case 4:
            case 6:
            default:
                return super.retainAll(collection);
            case 5:
                e eVar = (e) this.f8477b;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : eVar.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((x7.f) eVar.e).b().retainAll(hashSet2);
                }
            case 7:
                e eVar2 = (e) this.f8477b;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused3) {
                    HashSet hashSet3 = new HashSet();
                    for (Map.Entry entry3 : eVar2.entrySet()) {
                        if (collection.contains(entry3.getValue())) {
                            hashSet3.add(entry3.getKey());
                        }
                    }
                    return ((mg) eVar2.e).b().retainAll(hashSet3);
                }
        }
    }

    @Override
    public final int size() {
        switch (this.f8476a) {
            case 0:
                return ((p) this.f8477b).size();
            case 1:
                return ((p1) this.f8477b).f8486f;
            case 2:
                return ((x) this.f8477b).size();
            case 3:
                return ((AbstractMap) this.f8477b).size();
            case 4:
                return ((x7.j) this.f8477b).size();
            case 5:
                return ((e) this.f8477b).f8434b.size();
            case 6:
                return ((z7.d) this.f8477b).size();
            default:
                return ((e) this.f8477b).f8434b.size();
        }
    }

    public o(AbstractMap abstractMap, int i10) {
        this.f8476a = i10;
        this.f8477b = abstractMap;
    }
}
