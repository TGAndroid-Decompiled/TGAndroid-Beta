package a8;

import c8.jg;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
public class n extends AbstractCollection {
    public final int f545a;
    public final Object f546b;

    public n(Object obj, int i7) {
        this.f545a = i7;
        this.f546b = obj;
    }

    @Override
    public final void clear() {
        switch (this.f545a) {
            case 0:
                ((o) this.f546b).clear();
                return;
            case 1:
                ((lb) this.f546b).clear();
                return;
            case 2:
                ((c8.d) this.f546b).clear();
                return;
            case 3:
                ((lb) this.f546b).clear();
                return;
            case 4:
                ((h9.l) this.f546b).clear();
                return;
            case 5:
                ((h9.l1) this.f546b).clear();
                return;
            case 6:
                ((h9.s) this.f546b).clear();
                return;
            default:
                ((AbstractMap) this.f546b).clear();
                return;
        }
    }

    @Override
    public boolean contains(Object obj) {
        switch (this.f545a) {
            case 1:
                return ((lb) this.f546b).containsValue(obj);
            case 2:
            case 6:
            default:
                return super.contains(obj);
            case 3:
                return ((lb) this.f546b).containsValue(obj);
            case 4:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                Collection collection = (Collection) ((h9.l) this.f546b).b().get(key);
                if (collection == null || !collection.contains(value)) {
                    return false;
                }
                return true;
            case 5:
                return ((h9.l1) this.f546b).c(obj);
            case 7:
                return ((AbstractMap) this.f546b).containsValue(obj);
        }
    }

    @Override
    public boolean isEmpty() {
        switch (this.f545a) {
            case 1:
                return ((lb) this.f546b).isEmpty();
            case 3:
                return ((lb) this.f546b).isEmpty();
            case 7:
                return ((AbstractMap) this.f546b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f545a) {
            case 0:
                o oVar = (o) this.f546b;
                Map b10 = oVar.b();
                if (b10 != null) {
                    return b10.values().iterator();
                }
                return new j(oVar, 2);
            case 1:
                return new x(((lb) this.f546b).entrySet().iterator(), 0);
            case 2:
                c8.d dVar = (c8.d) this.f546b;
                Map b11 = dVar.b();
                if (b11 != null) {
                    return b11.values().iterator();
                }
                return new c8.a(dVar, 2);
            case 3:
                return new x(((lb) this.f546b).entrySet().iterator(), 1);
            case 4:
                return ((h9.l) this.f546b).g();
            case 5:
                return new h9.b((h9.l1) this.f546b, 0);
            case 6:
                h9.s sVar = (h9.s) this.f546b;
                Map d = sVar.d();
                if (d != null) {
                    return d.values().iterator();
                }
                return new h9.p(sVar, 2);
            default:
                return new h9.g2(((AbstractMap) this.f546b).entrySet().iterator());
        }
    }

    @Override
    public boolean remove(Object obj) {
        switch (this.f545a) {
            case 1:
                lb lbVar = (lb) this.f546b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry : lbVar.entrySet()) {
                        if (w0.a(obj, entry.getValue())) {
                            lbVar.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 2:
            case 5:
            case 6:
            default:
                return super.remove(obj);
            case 3:
                lb lbVar2 = (lb) this.f546b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused2) {
                    for (Map.Entry entry2 : lbVar2.entrySet()) {
                        if (f8.a(obj, entry2.getValue())) {
                            lbVar2.remove(entry2.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 4:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry3 = (Map.Entry) obj;
                    return ((h9.l) this.f546b).remove(entry3.getKey(), entry3.getValue());
                }
                return false;
            case 7:
                AbstractMap abstractMap = (AbstractMap) this.f546b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused3) {
                    for (Map.Entry entry4 : abstractMap.entrySet()) {
                        if (ka.a(obj, entry4.getValue())) {
                            abstractMap.remove(entry4.getKey());
                            return true;
                        }
                    }
                    return false;
                }
        }
    }

    @Override
    public boolean removeAll(Collection collection) {
        switch (this.f545a) {
            case 1:
                lb lbVar = (lb) this.f546b;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : lbVar.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return ((i) lbVar.f535e).b().removeAll(hashSet);
                }
            case 3:
                lb lbVar2 = (lb) this.f546b;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : lbVar2.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((jg) lbVar2.f535e).b().removeAll(hashSet2);
                }
            case 7:
                AbstractMap abstractMap = (AbstractMap) this.f546b;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused3) {
                    HashSet hashSet3 = new HashSet();
                    for (Map.Entry entry3 : abstractMap.entrySet()) {
                        if (collection.contains(entry3.getValue())) {
                            hashSet3.add(entry3.getKey());
                        }
                    }
                    return abstractMap.keySet().removeAll(hashSet3);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override
    public boolean retainAll(Collection collection) {
        switch (this.f545a) {
            case 1:
                lb lbVar = (lb) this.f546b;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : lbVar.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return ((i) lbVar.f535e).b().retainAll(hashSet);
                }
            case 3:
                lb lbVar2 = (lb) this.f546b;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : lbVar2.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((jg) lbVar2.f535e).b().retainAll(hashSet2);
                }
            case 7:
                AbstractMap abstractMap = (AbstractMap) this.f546b;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused3) {
                    HashSet hashSet3 = new HashSet();
                    for (Map.Entry entry3 : abstractMap.entrySet()) {
                        if (collection.contains(entry3.getValue())) {
                            hashSet3.add(entry3.getKey());
                        }
                    }
                    return abstractMap.keySet().retainAll(hashSet3);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override
    public final int size() {
        switch (this.f545a) {
            case 0:
                return ((o) this.f546b).size();
            case 1:
                return ((lb) this.f546b).f533b.size();
            case 2:
                return ((c8.d) this.f546b).size();
            case 3:
                return ((lb) this.f546b).f533b.size();
            case 4:
                return ((h9.l) this.f546b).size();
            case 5:
                return ((h9.l1) this.f546b).f14052f;
            case 6:
                return ((h9.s) this.f546b).size();
            default:
                return ((AbstractMap) this.f546b).size();
        }
    }

    public n(AbstractMap abstractMap, int i7) {
        this.f545a = i7;
        this.f546b = abstractMap;
    }
}
