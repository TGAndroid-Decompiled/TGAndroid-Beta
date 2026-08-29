package j7;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import l7.lg;
public final class m extends AbstractCollection {
    public final int f11096a;
    public final Object f11097b;

    public m(int i10, Serializable serializable) {
        this.f11096a = i10;
        this.f11097b = serializable;
    }

    @Override
    public final void clear() {
        switch (this.f11096a) {
            case 0:
                ((n) this.f11097b).clear();
                return;
            case 1:
                ((xa) this.f11097b).clear();
                return;
            case 2:
                ((l7.d) this.f11097b).clear();
                return;
            case 3:
                ((xa) this.f11097b).clear();
                return;
            case 4:
                ((q8.h0) this.f11097b).b();
                return;
            case 5:
                ((q8.p) this.f11097b).clear();
                return;
            default:
                ((xa) this.f11097b).clear();
                return;
        }
    }

    @Override
    public boolean contains(Object obj) {
        switch (this.f11096a) {
            case 1:
                return ((xa) this.f11097b).containsValue(obj);
            case 2:
            case 5:
            default:
                return super.contains(obj);
            case 3:
                return ((xa) this.f11097b).containsValue(obj);
            case 4:
                Iterator it = ((m) ((q8.h0) this.f11097b).a().values()).iterator();
                while (it.hasNext()) {
                    if (((Collection) it.next()).contains(obj)) {
                        return true;
                    }
                }
                return false;
            case 6:
                return ((xa) this.f11097b).containsValue(obj);
        }
    }

    @Override
    public boolean isEmpty() {
        switch (this.f11096a) {
            case 1:
                return ((xa) this.f11097b).isEmpty();
            case 3:
                return ((xa) this.f11097b).isEmpty();
            case 6:
                return ((xa) this.f11097b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f11096a) {
            case 0:
                n nVar = (n) this.f11097b;
                Map a2 = nVar.a();
                if (a2 != null) {
                    return a2.values().iterator();
                }
                return new i(nVar, 2);
            case 1:
                return new com.google.android.gms.internal.clearcut.h1(((xa) this.f11097b).entrySet().iterator(), 1);
            case 2:
                l7.d dVar = (l7.d) this.f11097b;
                Map a10 = dVar.a();
                if (a10 != null) {
                    return a10.values().iterator();
                }
                return new l7.a(dVar, 2);
            case 3:
                return new com.google.android.gms.internal.clearcut.h1(((xa) this.f11097b).entrySet().iterator(), 2);
            case 4:
                return new q8.a((q8.h0) this.f11097b);
            case 5:
                q8.p pVar = (q8.p) this.f11097b;
                Map b10 = pVar.b();
                if (b10 != null) {
                    return b10.values().iterator();
                }
                return new q8.m(pVar, 2);
            default:
                return new com.google.android.gms.internal.clearcut.h1(((xa) this.f11097b).entrySet().iterator(), 3);
        }
    }

    @Override
    public boolean remove(Object obj) {
        switch (this.f11096a) {
            case 1:
                xa xaVar = (xa) this.f11097b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry : xaVar.entrySet()) {
                        if (h7.t8.a(obj, entry.getValue())) {
                            xaVar.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 3:
                xa xaVar2 = (xa) this.f11097b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused2) {
                    for (Map.Entry entry2 : xaVar2.entrySet()) {
                        if (i7.q.a(obj, entry2.getValue())) {
                            xaVar2.remove(entry2.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 6:
                xa xaVar3 = (xa) this.f11097b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused3) {
                    for (Map.Entry entry3 : xaVar3.entrySet()) {
                        if (i7.o6.a(obj, entry3.getValue())) {
                            xaVar3.remove(entry3.getKey());
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
        switch (this.f11096a) {
            case 1:
                xa xaVar = (xa) this.f11097b;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : xaVar.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return ((h) xaVar.f11259e).b().removeAll(hashSet);
                }
            case 3:
                xa xaVar2 = (xa) this.f11097b;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : xaVar2.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((lg) xaVar2.f11259e).b().removeAll(hashSet2);
                }
            case 6:
                xa xaVar3 = (xa) this.f11097b;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused3) {
                    HashSet hashSet3 = new HashSet();
                    for (Map.Entry entry3 : xaVar3.entrySet()) {
                        if (collection.contains(entry3.getValue())) {
                            hashSet3.add(entry3.getKey());
                        }
                    }
                    return xaVar3.keySet().removeAll(hashSet3);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override
    public boolean retainAll(Collection collection) {
        switch (this.f11096a) {
            case 1:
                xa xaVar = (xa) this.f11097b;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : xaVar.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return ((h) xaVar.f11259e).b().retainAll(hashSet);
                }
            case 3:
                xa xaVar2 = (xa) this.f11097b;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : xaVar2.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((lg) xaVar2.f11259e).b().retainAll(hashSet2);
                }
            case 6:
                xa xaVar3 = (xa) this.f11097b;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused3) {
                    HashSet hashSet3 = new HashSet();
                    for (Map.Entry entry3 : xaVar3.entrySet()) {
                        if (collection.contains(entry3.getValue())) {
                            hashSet3.add(entry3.getKey());
                        }
                    }
                    return xaVar3.keySet().retainAll(hashSet3);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override
    public final int size() {
        switch (this.f11096a) {
            case 0:
                return ((n) this.f11097b).size();
            case 1:
                return ((xa) this.f11097b).f11257b.size();
            case 2:
                return ((l7.d) this.f11097b).size();
            case 3:
                return ((xa) this.f11097b).f11257b.size();
            case 4:
                return ((q8.h0) this.f11097b).f46453e;
            case 5:
                return ((q8.p) this.f11097b).size();
            default:
                return ((xa) this.f11097b).f11257b.size();
        }
    }

    public m(AbstractMap abstractMap, int i10) {
        this.f11096a = i10;
        this.f11097b = abstractMap;
    }
}
