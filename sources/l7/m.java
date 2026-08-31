package l7;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import n7.mg;
public final class m extends AbstractCollection {
    public final int f11937a;
    public final Object f11938b;

    public m(int i10, Serializable serializable) {
        this.f11937a = i10;
        this.f11938b = serializable;
    }

    @Override
    public final void clear() {
        switch (this.f11937a) {
            case 0:
                ((n) this.f11938b).clear();
                return;
            case 1:
                ((xa) this.f11938b).clear();
                return;
            case 2:
                ((n7.d) this.f11938b).clear();
                return;
            case 3:
                ((xa) this.f11938b).clear();
                return;
            case 4:
                ((s8.e0) this.f11938b).b();
                return;
            default:
                ((xa) this.f11938b).clear();
                return;
        }
    }

    @Override
    public boolean contains(Object obj) {
        switch (this.f11937a) {
            case 1:
                return ((xa) this.f11938b).containsValue(obj);
            case 2:
            default:
                return super.contains(obj);
            case 3:
                return ((xa) this.f11938b).containsValue(obj);
            case 4:
                Iterator it = ((m) ((s8.e0) this.f11938b).a().values()).iterator();
                while (it.hasNext()) {
                    if (((Collection) it.next()).contains(obj)) {
                        return true;
                    }
                }
                return false;
            case 5:
                return ((xa) this.f11938b).containsValue(obj);
        }
    }

    @Override
    public boolean isEmpty() {
        switch (this.f11937a) {
            case 1:
                return ((xa) this.f11938b).isEmpty();
            case 2:
            case 4:
            default:
                return super.isEmpty();
            case 3:
                return ((xa) this.f11938b).isEmpty();
            case 5:
                return ((xa) this.f11938b).isEmpty();
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f11937a) {
            case 0:
                n nVar = (n) this.f11938b;
                Map a2 = nVar.a();
                if (a2 != null) {
                    return a2.values().iterator();
                }
                return new i(nVar, 2);
            case 1:
                return new com.google.android.gms.internal.clearcut.g1(((xa) this.f11938b).entrySet().iterator(), 1);
            case 2:
                n7.d dVar = (n7.d) this.f11938b;
                Map a10 = dVar.a();
                if (a10 != null) {
                    return a10.values().iterator();
                }
                return new n7.a(dVar, 2);
            case 3:
                return new com.google.android.gms.internal.clearcut.g1(((xa) this.f11938b).entrySet().iterator(), 2);
            case 4:
                return new s8.a((s8.e0) this.f11938b);
            default:
                return new com.google.android.gms.internal.clearcut.g1(((xa) this.f11938b).entrySet().iterator(), 3);
        }
    }

    @Override
    public boolean remove(Object obj) {
        switch (this.f11937a) {
            case 1:
                xa xaVar = (xa) this.f11938b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry : xaVar.entrySet()) {
                        if (k7.j.a(obj, entry.getValue())) {
                            xaVar.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 2:
            case 4:
            default:
                return super.remove(obj);
            case 3:
                xa xaVar2 = (xa) this.f11938b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused2) {
                    for (Map.Entry entry2 : xaVar2.entrySet()) {
                        if (k7.e0.a(obj, entry2.getValue())) {
                            xaVar2.remove(entry2.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 5:
                xa xaVar3 = (xa) this.f11938b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused3) {
                    for (Map.Entry entry3 : xaVar3.entrySet()) {
                        if (k7.b7.a(obj, entry3.getValue())) {
                            xaVar3.remove(entry3.getKey());
                            return true;
                        }
                    }
                    return false;
                }
        }
    }

    @Override
    public boolean removeAll(Collection collection) {
        switch (this.f11937a) {
            case 1:
                xa xaVar = (xa) this.f11938b;
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
                    return ((h) xaVar.f12100e).b().removeAll(hashSet);
                }
            case 2:
            case 4:
            default:
                return super.removeAll(collection);
            case 3:
                xa xaVar2 = (xa) this.f11938b;
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
                    return ((mg) xaVar2.f12100e).b().removeAll(hashSet2);
                }
            case 5:
                xa xaVar3 = (xa) this.f11938b;
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
        }
    }

    @Override
    public boolean retainAll(Collection collection) {
        switch (this.f11937a) {
            case 1:
                xa xaVar = (xa) this.f11938b;
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
                    return ((h) xaVar.f12100e).b().retainAll(hashSet);
                }
            case 2:
            case 4:
            default:
                return super.retainAll(collection);
            case 3:
                xa xaVar2 = (xa) this.f11938b;
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
                    return ((mg) xaVar2.f12100e).b().retainAll(hashSet2);
                }
            case 5:
                xa xaVar3 = (xa) this.f11938b;
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
        }
    }

    @Override
    public final int size() {
        switch (this.f11937a) {
            case 0:
                return ((n) this.f11938b).size();
            case 1:
                return ((xa) this.f11938b).f12098b.size();
            case 2:
                return ((n7.d) this.f11938b).size();
            case 3:
                return ((xa) this.f11938b).f12098b.size();
            case 4:
                return ((s8.e0) this.f11938b).f47101e;
            default:
                return ((xa) this.f11938b).f12098b.size();
        }
    }

    public m(AbstractMap abstractMap, int i10) {
        this.f11937a = i10;
        this.f11938b = abstractMap;
    }
}
