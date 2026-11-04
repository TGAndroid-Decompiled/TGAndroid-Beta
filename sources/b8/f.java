package b8;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
public class f extends AbstractCollection {
    public final int f2580a;
    public final Object f2581b;

    public f(Object obj, int i3) {
        this.f2580a = i3;
        this.f2581b = obj;
    }

    @Override
    public final void clear() {
        switch (this.f2580a) {
            case 0:
                ((g) this.f2581b).clear();
                return;
            case 1:
                ((mb) this.f2581b).clear();
                return;
            case 2:
                ((g9.l) this.f2581b).clear();
                return;
            case 3:
                ((g9.k1) this.f2581b).clear();
                return;
            case 4:
                ((g9.s) this.f2581b).clear();
                return;
            case 5:
                ((AbstractMap) this.f2581b).clear();
                return;
            case 6:
                ((z7.i) this.f2581b).clear();
                return;
            default:
                ((mb) this.f2581b).clear();
                return;
        }
    }

    @Override
    public boolean contains(Object obj) {
        switch (this.f2580a) {
            case 1:
                return ((mb) this.f2581b).containsValue(obj);
            case 2:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                Collection collection = (Collection) ((g9.l) this.f2581b).b().get(key);
                if (collection == null || !collection.contains(value)) {
                    return false;
                }
                return true;
            case 3:
                return ((g9.k1) this.f2581b).c(obj);
            case 4:
            case 6:
            default:
                return super.contains(obj);
            case 5:
                return ((AbstractMap) this.f2581b).containsValue(obj);
            case 7:
                return ((mb) this.f2581b).containsValue(obj);
        }
    }

    @Override
    public boolean isEmpty() {
        switch (this.f2580a) {
            case 1:
                return ((mb) this.f2581b).isEmpty();
            case 5:
                return ((AbstractMap) this.f2581b).isEmpty();
            case 7:
                return ((mb) this.f2581b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f2580a) {
            case 0:
                g gVar = (g) this.f2581b;
                Map b10 = gVar.b();
                if (b10 != null) {
                    return b10.values().iterator();
                }
                return new b(gVar, 2);
            case 1:
                return new o(((mb) this.f2581b).entrySet().iterator(), 0);
            case 2:
                return ((g9.l) this.f2581b).g();
            case 3:
                return new g9.b((g9.k1) this.f2581b, 0);
            case 4:
                g9.s sVar = (g9.s) this.f2581b;
                Map d = sVar.d();
                if (d != null) {
                    return d.values().iterator();
                }
                return new g9.p(sVar, 2);
            case 5:
                return new g9.f2(((AbstractMap) this.f2581b).entrySet().iterator());
            case 6:
                z7.i iVar = (z7.i) this.f2581b;
                Map b11 = iVar.b();
                if (b11 != null) {
                    return b11.values().iterator();
                }
                return new z7.f(iVar, 2);
            default:
                return new o(((mb) this.f2581b).entrySet().iterator(), 2);
        }
    }

    @Override
    public boolean remove(Object obj) {
        switch (this.f2580a) {
            case 1:
                mb mbVar = (mb) this.f2581b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry : mbVar.entrySet()) {
                        if (m1.a(obj, entry.getValue())) {
                            mbVar.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 2:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry2 = (Map.Entry) obj;
                    return ((g9.l) this.f2581b).remove(entry2.getKey(), entry2.getValue());
                }
                return false;
            case 3:
            case 4:
            case 6:
            default:
                return super.remove(obj);
            case 5:
                AbstractMap abstractMap = (AbstractMap) this.f2581b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused2) {
                    for (Map.Entry entry3 : abstractMap.entrySet()) {
                        if (yb.a(obj, entry3.getValue())) {
                            abstractMap.remove(entry3.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 7:
                mb mbVar2 = (mb) this.f2581b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused3) {
                    for (Map.Entry entry4 : mbVar2.entrySet()) {
                        if (x7.w6.a(obj, entry4.getValue())) {
                            mbVar2.remove(entry4.getKey());
                            return true;
                        }
                    }
                    return false;
                }
        }
    }

    @Override
    public boolean removeAll(Collection collection) {
        switch (this.f2580a) {
            case 1:
                mb mbVar = (mb) this.f2581b;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : mbVar.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return ((dh) mbVar.f2756e).b().removeAll(hashSet);
                }
            case 5:
                AbstractMap abstractMap = (AbstractMap) this.f2581b;
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
                mb mbVar2 = (mb) this.f2581b;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused3) {
                    HashSet hashSet3 = new HashSet();
                    for (Map.Entry entry3 : mbVar2.entrySet()) {
                        if (collection.contains(entry3.getValue())) {
                            hashSet3.add(entry3.getKey());
                        }
                    }
                    return ((z7.e) mbVar2.f2756e).b().removeAll(hashSet3);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override
    public boolean retainAll(Collection collection) {
        switch (this.f2580a) {
            case 1:
                mb mbVar = (mb) this.f2581b;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : mbVar.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return ((dh) mbVar.f2756e).b().retainAll(hashSet);
                }
            case 5:
                AbstractMap abstractMap = (AbstractMap) this.f2581b;
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
                mb mbVar2 = (mb) this.f2581b;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused3) {
                    HashSet hashSet3 = new HashSet();
                    for (Map.Entry entry3 : mbVar2.entrySet()) {
                        if (collection.contains(entry3.getValue())) {
                            hashSet3.add(entry3.getKey());
                        }
                    }
                    return ((z7.e) mbVar2.f2756e).b().retainAll(hashSet3);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override
    public final int size() {
        switch (this.f2580a) {
            case 0:
                return ((g) this.f2581b).size();
            case 1:
                return ((mb) this.f2581b).f2754b.size();
            case 2:
                return ((g9.l) this.f2581b).size();
            case 3:
                return ((g9.k1) this.f2581b).f12092f;
            case 4:
                return ((g9.s) this.f2581b).size();
            case 5:
                return ((AbstractMap) this.f2581b).size();
            case 6:
                return ((z7.i) this.f2581b).size();
            default:
                return ((mb) this.f2581b).f2754b.size();
        }
    }

    public f(AbstractMap abstractMap, int i3) {
        this.f2580a = i3;
        this.f2581b = abstractMap;
    }
}
