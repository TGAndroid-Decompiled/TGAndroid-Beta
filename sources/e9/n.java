package e9;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import v7.s6;
import w7.i9;
import w7.l8;
import z7.lg;
public final class n extends AbstractCollection {
    public final int f8977a;
    public final Object f8978b;

    public n(int i10, Serializable serializable) {
        this.f8977a = i10;
        this.f8978b = serializable;
    }

    @Override
    public final void clear() {
        switch (this.f8977a) {
            case 0:
                ((v0) this.f8978b).b();
                return;
            case 1:
                ((v) this.f8978b).clear();
                return;
            case 2:
                ((d) this.f8978b).clear();
                return;
            case 3:
                ((x7.j) this.f8978b).clear();
                return;
            case 4:
                ((d) this.f8978b).clear();
                return;
            case 5:
                ((z7.d) this.f8978b).clear();
                return;
            default:
                ((d) this.f8978b).clear();
                return;
        }
    }

    @Override
    public boolean contains(Object obj) {
        switch (this.f8977a) {
            case 0:
                for (Collection collection : ((v0) this.f8978b).a().values()) {
                    if (collection.contains(obj)) {
                        return true;
                    }
                }
                return false;
            case 1:
            case 3:
            case 5:
            default:
                return super.contains(obj);
            case 2:
                return ((d) this.f8978b).containsValue(obj);
            case 4:
                return ((d) this.f8978b).containsValue(obj);
            case 6:
                return ((d) this.f8978b).containsValue(obj);
        }
    }

    @Override
    public boolean isEmpty() {
        switch (this.f8977a) {
            case 2:
                return ((d) this.f8978b).isEmpty();
            case 3:
            case 5:
            default:
                return super.isEmpty();
            case 4:
                return ((d) this.f8978b).isEmpty();
            case 6:
                return ((d) this.f8978b).isEmpty();
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f8977a) {
            case 0:
                return new a((v0) this.f8978b);
            case 1:
                v vVar = (v) this.f8978b;
                Map b10 = vVar.b();
                if (b10 != null) {
                    return b10.values().iterator();
                }
                return new r(vVar, 2);
            case 2:
                return new n1(((d) this.f8978b).entrySet().iterator());
            case 3:
                x7.j jVar = (x7.j) this.f8978b;
                Map a2 = jVar.a();
                if (a2 != null) {
                    return a2.values().iterator();
                }
                return new x7.g(jVar, 2);
            case 4:
                return new com.google.android.gms.internal.clearcut.f1(((d) this.f8978b).entrySet().iterator(), 1);
            case 5:
                z7.d dVar = (z7.d) this.f8978b;
                Map a10 = dVar.a();
                if (a10 != null) {
                    return a10.values().iterator();
                }
                return new z7.a(dVar, 2);
            default:
                return new com.google.android.gms.internal.clearcut.f1(((d) this.f8978b).entrySet().iterator(), 2);
        }
    }

    @Override
    public boolean remove(Object obj) {
        switch (this.f8977a) {
            case 2:
                d dVar = (d) this.f8978b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry : dVar.entrySet()) {
                        if (s6.a(obj, entry.getValue())) {
                            dVar.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 3:
            case 5:
            default:
                return super.remove(obj);
            case 4:
                d dVar2 = (d) this.f8978b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused2) {
                    for (Map.Entry entry2 : dVar2.entrySet()) {
                        if (l8.a(obj, entry2.getValue())) {
                            dVar2.remove(entry2.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 6:
                d dVar3 = (d) this.f8978b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused3) {
                    for (Map.Entry entry3 : dVar3.entrySet()) {
                        if (i9.a(obj, entry3.getValue())) {
                            dVar3.remove(entry3.getKey());
                            return true;
                        }
                    }
                    return false;
                }
        }
    }

    @Override
    public boolean removeAll(Collection collection) {
        switch (this.f8977a) {
            case 2:
                d dVar = (d) this.f8978b;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : dVar.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return dVar.keySet().removeAll(hashSet);
                }
            case 3:
            case 5:
            default:
                return super.removeAll(collection);
            case 4:
                d dVar2 = (d) this.f8978b;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : dVar2.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((x7.f) dVar2.f8932e).b().removeAll(hashSet2);
                }
            case 6:
                d dVar3 = (d) this.f8978b;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused3) {
                    HashSet hashSet3 = new HashSet();
                    for (Map.Entry entry3 : dVar3.entrySet()) {
                        if (collection.contains(entry3.getValue())) {
                            hashSet3.add(entry3.getKey());
                        }
                    }
                    return ((lg) dVar3.f8932e).b().removeAll(hashSet3);
                }
        }
    }

    @Override
    public boolean retainAll(Collection collection) {
        switch (this.f8977a) {
            case 2:
                d dVar = (d) this.f8978b;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : dVar.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return dVar.keySet().retainAll(hashSet);
                }
            case 3:
            case 5:
            default:
                return super.retainAll(collection);
            case 4:
                d dVar2 = (d) this.f8978b;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : dVar2.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((x7.f) dVar2.f8932e).b().retainAll(hashSet2);
                }
            case 6:
                d dVar3 = (d) this.f8978b;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused3) {
                    HashSet hashSet3 = new HashSet();
                    for (Map.Entry entry3 : dVar3.entrySet()) {
                        if (collection.contains(entry3.getValue())) {
                            hashSet3.add(entry3.getKey());
                        }
                    }
                    return ((lg) dVar3.f8932e).b().retainAll(hashSet3);
                }
        }
    }

    @Override
    public final int size() {
        switch (this.f8977a) {
            case 0:
                return ((v0) this.f8978b).f9019e;
            case 1:
                return ((v) this.f8978b).size();
            case 2:
                return ((d) this.f8978b).f8930b.size();
            case 3:
                return ((x7.j) this.f8978b).size();
            case 4:
                return ((d) this.f8978b).f8930b.size();
            case 5:
                return ((z7.d) this.f8978b).size();
            default:
                return ((d) this.f8978b).f8930b.size();
        }
    }

    public n(AbstractMap abstractMap, int i10) {
        this.f8977a = i10;
        this.f8978b = abstractMap;
    }
}
