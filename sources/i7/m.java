package i7;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import k7.lg;

public final class m extends AbstractCollection {

    public final int f10731a;

    public final Object f10732b;

    public m(int i10, Serializable serializable) {
        this.f10731a = i10;
        this.f10732b = serializable;
    }

    @Override
    public final void clear() {
        switch (this.f10731a) {
            case 0:
                ((n) this.f10732b).clear();
                break;
            case 1:
                ((wa) this.f10732b).clear();
                break;
            case 2:
                ((k7.d) this.f10732b).clear();
                break;
            case 3:
                ((wa) this.f10732b).clear();
                break;
            case 4:
                ((p8.h0) this.f10732b).b();
                break;
            case 5:
                ((p8.p) this.f10732b).clear();
                break;
            default:
                ((wa) this.f10732b).clear();
                break;
        }
    }

    @Override
    public boolean contains(Object obj) {
        switch (this.f10731a) {
            case 1:
                return ((wa) this.f10732b).containsValue(obj);
            case 2:
            case 5:
            default:
                return super.contains(obj);
            case 3:
                return ((wa) this.f10732b).containsValue(obj);
            case 4:
                Iterator it = ((m) ((p8.h0) this.f10732b).a().values()).iterator();
                while (it.hasNext()) {
                    if (((Collection) it.next()).contains(obj)) {
                        return true;
                    }
                }
                return false;
            case 6:
                return ((wa) this.f10732b).containsValue(obj);
        }
    }

    @Override
    public boolean isEmpty() {
        switch (this.f10731a) {
            case 1:
                return ((wa) this.f10732b).isEmpty();
            case 3:
                return ((wa) this.f10732b).isEmpty();
            case 6:
                return ((wa) this.f10732b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f10731a) {
            case 0:
                n nVar = (n) this.f10732b;
                Map mapA = nVar.a();
                return mapA != null ? mapA.values().iterator() : new i(nVar, 2);
            case 1:
                return new com.google.android.gms.internal.clearcut.h1(((wa) this.f10732b).entrySet().iterator(), 1);
            case 2:
                k7.d dVar = (k7.d) this.f10732b;
                Map mapA2 = dVar.a();
                return mapA2 != null ? mapA2.values().iterator() : new k7.a(dVar, 2);
            case 3:
                return new com.google.android.gms.internal.clearcut.h1(((wa) this.f10732b).entrySet().iterator(), 2);
            case 4:
                return new p8.a((p8.h0) this.f10732b);
            case 5:
                p8.p pVar = (p8.p) this.f10732b;
                Map mapB = pVar.b();
                return mapB != null ? mapB.values().iterator() : new p8.m(pVar, 2);
            default:
                return new com.google.android.gms.internal.clearcut.h1(((wa) this.f10732b).entrySet().iterator(), 3);
        }
    }

    @Override
    public boolean remove(Object obj) {
        switch (this.f10731a) {
            case 1:
                wa waVar = (wa) this.f10732b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry : waVar.entrySet()) {
                        if (g7.d8.a(obj, entry.getValue())) {
                            waVar.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 3:
                wa waVar2 = (wa) this.f10732b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused2) {
                    for (Map.Entry entry2 : waVar2.entrySet()) {
                        if (g7.x8.a(obj, entry2.getValue())) {
                            waVar2.remove(entry2.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 6:
                wa waVar3 = (wa) this.f10732b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused3) {
                    for (Map.Entry entry3 : waVar3.entrySet()) {
                        if (h7.e0.a(obj, entry3.getValue())) {
                            waVar3.remove(entry3.getKey());
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
        switch (this.f10731a) {
            case 1:
                wa waVar = (wa) this.f10732b;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : waVar.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return ((h) waVar.f10877e).b().removeAll(hashSet);
                }
            case 3:
                wa waVar2 = (wa) this.f10732b;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : waVar2.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((lg) waVar2.f10877e).b().removeAll(hashSet2);
                }
            case 6:
                wa waVar3 = (wa) this.f10732b;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused3) {
                    HashSet hashSet3 = new HashSet();
                    for (Map.Entry entry3 : waVar3.entrySet()) {
                        if (collection.contains(entry3.getValue())) {
                            hashSet3.add(entry3.getKey());
                        }
                    }
                    return waVar3.keySet().removeAll(hashSet3);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override
    public boolean retainAll(Collection collection) {
        switch (this.f10731a) {
            case 1:
                wa waVar = (wa) this.f10732b;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : waVar.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return ((h) waVar.f10877e).b().retainAll(hashSet);
                }
            case 3:
                wa waVar2 = (wa) this.f10732b;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : waVar2.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((lg) waVar2.f10877e).b().retainAll(hashSet2);
                }
            case 6:
                wa waVar3 = (wa) this.f10732b;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused3) {
                    HashSet hashSet3 = new HashSet();
                    for (Map.Entry entry3 : waVar3.entrySet()) {
                        if (collection.contains(entry3.getValue())) {
                            hashSet3.add(entry3.getKey());
                        }
                    }
                    return waVar3.keySet().retainAll(hashSet3);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override
    public final int size() {
        switch (this.f10731a) {
            case 0:
                return ((n) this.f10732b).size();
            case 1:
                return ((wa) this.f10732b).f10875b.size();
            case 2:
                return ((k7.d) this.f10732b).size();
            case 3:
                return ((wa) this.f10732b).f10875b.size();
            case 4:
                return ((p8.h0) this.f10732b).f45546e;
            case 5:
                return ((p8.p) this.f10732b).size();
            default:
                return ((wa) this.f10732b).f10875b.size();
        }
    }

    public m(AbstractMap abstractMap, int i10) {
        this.f10731a = i10;
        this.f10732b = abstractMap;
    }
}
