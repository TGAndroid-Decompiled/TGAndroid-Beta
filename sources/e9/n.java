package e9;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import v7.t6;
import w7.j9;
import w7.m8;
import z7.lg;
public final class n extends AbstractCollection {
    public final int f8084a;
    public final Object f8085b;

    public n(int i10, Serializable serializable) {
        this.f8084a = i10;
        this.f8085b = serializable;
    }

    @Override
    public final void clear() {
        switch (this.f8084a) {
            case 0:
                ((v0) this.f8085b).b();
                return;
            case 1:
                ((v) this.f8085b).clear();
                return;
            case 2:
                ((d) this.f8085b).clear();
                return;
            case 3:
                ((x7.j) this.f8085b).clear();
                return;
            case 4:
                ((d) this.f8085b).clear();
                return;
            case 5:
                ((z7.d) this.f8085b).clear();
                return;
            default:
                ((d) this.f8085b).clear();
                return;
        }
    }

    @Override
    public boolean contains(Object obj) {
        switch (this.f8084a) {
            case 0:
                for (Collection collection : ((v0) this.f8085b).a().values()) {
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
                return ((d) this.f8085b).containsValue(obj);
            case 4:
                return ((d) this.f8085b).containsValue(obj);
            case 6:
                return ((d) this.f8085b).containsValue(obj);
        }
    }

    @Override
    public boolean isEmpty() {
        switch (this.f8084a) {
            case 2:
                return ((d) this.f8085b).isEmpty();
            case 3:
            case 5:
            default:
                return super.isEmpty();
            case 4:
                return ((d) this.f8085b).isEmpty();
            case 6:
                return ((d) this.f8085b).isEmpty();
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f8084a) {
            case 0:
                return new a((v0) this.f8085b);
            case 1:
                v vVar = (v) this.f8085b;
                Map b10 = vVar.b();
                if (b10 != null) {
                    return b10.values().iterator();
                }
                return new r(vVar, 2);
            case 2:
                return new n1(((d) this.f8085b).entrySet().iterator());
            case 3:
                x7.j jVar = (x7.j) this.f8085b;
                Map a2 = jVar.a();
                if (a2 != null) {
                    return a2.values().iterator();
                }
                return new x7.g(jVar, 2);
            case 4:
                return new com.google.android.gms.internal.clearcut.g1(((d) this.f8085b).entrySet().iterator(), 1);
            case 5:
                z7.d dVar = (z7.d) this.f8085b;
                Map a10 = dVar.a();
                if (a10 != null) {
                    return a10.values().iterator();
                }
                return new z7.a(dVar, 2);
            default:
                return new com.google.android.gms.internal.clearcut.g1(((d) this.f8085b).entrySet().iterator(), 2);
        }
    }

    @Override
    public boolean remove(Object obj) {
        switch (this.f8084a) {
            case 2:
                d dVar = (d) this.f8085b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry : dVar.entrySet()) {
                        if (t6.a(obj, entry.getValue())) {
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
                d dVar2 = (d) this.f8085b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused2) {
                    for (Map.Entry entry2 : dVar2.entrySet()) {
                        if (m8.a(obj, entry2.getValue())) {
                            dVar2.remove(entry2.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 6:
                d dVar3 = (d) this.f8085b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused3) {
                    for (Map.Entry entry3 : dVar3.entrySet()) {
                        if (j9.a(obj, entry3.getValue())) {
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
        switch (this.f8084a) {
            case 2:
                d dVar = (d) this.f8085b;
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
                d dVar2 = (d) this.f8085b;
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
                    return ((x7.f) dVar2.e).b().removeAll(hashSet2);
                }
            case 6:
                d dVar3 = (d) this.f8085b;
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
                    return ((lg) dVar3.e).b().removeAll(hashSet3);
                }
        }
    }

    @Override
    public boolean retainAll(Collection collection) {
        switch (this.f8084a) {
            case 2:
                d dVar = (d) this.f8085b;
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
                d dVar2 = (d) this.f8085b;
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
                    return ((x7.f) dVar2.e).b().retainAll(hashSet2);
                }
            case 6:
                d dVar3 = (d) this.f8085b;
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
                    return ((lg) dVar3.e).b().retainAll(hashSet3);
                }
        }
    }

    @Override
    public final int size() {
        switch (this.f8084a) {
            case 0:
                return ((v0) this.f8085b).e;
            case 1:
                return ((v) this.f8085b).size();
            case 2:
                return ((d) this.f8085b).f8046b.size();
            case 3:
                return ((x7.j) this.f8085b).size();
            case 4:
                return ((d) this.f8085b).f8046b.size();
            case 5:
                return ((z7.d) this.f8085b).size();
            default:
                return ((d) this.f8085b).f8046b.size();
        }
    }

    public n(AbstractMap abstractMap, int i10) {
        this.f8084a = i10;
        this.f8085b = abstractMap;
    }
}
