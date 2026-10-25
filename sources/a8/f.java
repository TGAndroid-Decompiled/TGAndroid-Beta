package a8;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
public class f extends AbstractCollection {
    public final int f442a;
    public final Object f443b;

    public f(Object obj, int i10) {
        this.f442a = i10;
        this.f443b = obj;
    }

    @Override
    public final void clear() {
        switch (this.f442a) {
            case 0:
                ((g) this.f443b).clear();
                return;
            case 1:
                ((pb) this.f443b).clear();
                return;
            case 2:
                ((f9.l) this.f443b).clear();
                return;
            case 3:
                ((f9.k1) this.f443b).clear();
                return;
            case 4:
                ((f9.s) this.f443b).clear();
                return;
            case 5:
                ((AbstractMap) this.f443b).clear();
                return;
            case 6:
                ((y7.i) this.f443b).clear();
                return;
            default:
                ((pb) this.f443b).clear();
                return;
        }
    }

    @Override
    public boolean contains(Object obj) {
        switch (this.f442a) {
            case 1:
                return ((pb) this.f443b).containsValue(obj);
            case 2:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                Collection collection = (Collection) ((f9.l) this.f443b).b().get(key);
                if (collection == null || !collection.contains(value)) {
                    return false;
                }
                return true;
            case 3:
                return ((f9.k1) this.f443b).c(obj);
            case 4:
            case 6:
            default:
                return super.contains(obj);
            case 5:
                return ((AbstractMap) this.f443b).containsValue(obj);
            case 7:
                return ((pb) this.f443b).containsValue(obj);
        }
    }

    @Override
    public boolean isEmpty() {
        switch (this.f442a) {
            case 1:
                return ((pb) this.f443b).isEmpty();
            case 5:
                return ((AbstractMap) this.f443b).isEmpty();
            case 7:
                return ((pb) this.f443b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f442a) {
            case 0:
                g gVar = (g) this.f443b;
                Map a2 = gVar.a();
                if (a2 != null) {
                    return a2.values().iterator();
                }
                return new b(gVar, 2);
            case 1:
                return new o(((pb) this.f443b).entrySet().iterator(), 0);
            case 2:
                return ((f9.l) this.f443b).g();
            case 3:
                return new f9.b((f9.k1) this.f443b, 0);
            case 4:
                f9.s sVar = (f9.s) this.f443b;
                Map c10 = sVar.c();
                if (c10 != null) {
                    return c10.values().iterator();
                }
                return new f9.p(sVar, 2);
            case 5:
                return new f9.f2(((AbstractMap) this.f443b).entrySet().iterator());
            case 6:
                y7.i iVar = (y7.i) this.f443b;
                Map a10 = iVar.a();
                if (a10 != null) {
                    return a10.values().iterator();
                }
                return new y7.f(iVar, 2);
            default:
                return new o(((pb) this.f443b).entrySet().iterator(), 2);
        }
    }

    @Override
    public boolean remove(Object obj) {
        switch (this.f442a) {
            case 1:
                pb pbVar = (pb) this.f443b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry : pbVar.entrySet()) {
                        if (n0.a(obj, entry.getValue())) {
                            pbVar.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 2:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry2 = (Map.Entry) obj;
                    return ((f9.l) this.f443b).remove(entry2.getKey(), entry2.getValue());
                }
                return false;
            case 3:
            case 4:
            case 6:
            default:
                return super.remove(obj);
            case 5:
                AbstractMap abstractMap = (AbstractMap) this.f443b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused2) {
                    for (Map.Entry entry3 : abstractMap.entrySet()) {
                        if (xb.a(obj, entry3.getValue())) {
                            abstractMap.remove(entry3.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 7:
                pb pbVar2 = (pb) this.f443b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused3) {
                    for (Map.Entry entry4 : pbVar2.entrySet()) {
                        if (w7.g5.a(obj, entry4.getValue())) {
                            pbVar2.remove(entry4.getKey());
                            return true;
                        }
                    }
                    return false;
                }
        }
    }

    @Override
    public boolean removeAll(Collection collection) {
        switch (this.f442a) {
            case 1:
                pb pbVar = (pb) this.f443b;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : pbVar.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return ((gh) pbVar.e).b().removeAll(hashSet);
                }
            case 5:
                AbstractMap abstractMap = (AbstractMap) this.f443b;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : abstractMap.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return abstractMap.keySet().removeAll(hashSet2);
                }
            case 7:
                pb pbVar2 = (pb) this.f443b;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused3) {
                    HashSet hashSet3 = new HashSet();
                    for (Map.Entry entry3 : pbVar2.entrySet()) {
                        if (collection.contains(entry3.getValue())) {
                            hashSet3.add(entry3.getKey());
                        }
                    }
                    return ((y7.e) pbVar2.e).b().removeAll(hashSet3);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override
    public boolean retainAll(Collection collection) {
        switch (this.f442a) {
            case 1:
                pb pbVar = (pb) this.f443b;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : pbVar.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return ((gh) pbVar.e).b().retainAll(hashSet);
                }
            case 5:
                AbstractMap abstractMap = (AbstractMap) this.f443b;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : abstractMap.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return abstractMap.keySet().retainAll(hashSet2);
                }
            case 7:
                pb pbVar2 = (pb) this.f443b;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused3) {
                    HashSet hashSet3 = new HashSet();
                    for (Map.Entry entry3 : pbVar2.entrySet()) {
                        if (collection.contains(entry3.getValue())) {
                            hashSet3.add(entry3.getKey());
                        }
                    }
                    return ((y7.e) pbVar2.e).b().retainAll(hashSet3);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override
    public final int size() {
        switch (this.f442a) {
            case 0:
                return ((g) this.f443b).size();
            case 1:
                return ((pb) this.f443b).f739b.size();
            case 2:
                return ((f9.l) this.f443b).size();
            case 3:
                return ((f9.k1) this.f443b).f10293f;
            case 4:
                return ((f9.s) this.f443b).size();
            case 5:
                return ((AbstractMap) this.f443b).size();
            case 6:
                return ((y7.i) this.f443b).size();
            default:
                return ((pb) this.f443b).f739b.size();
        }
    }

    public f(AbstractMap abstractMap, int i10) {
        this.f442a = i10;
        this.f443b = abstractMap;
    }
}
