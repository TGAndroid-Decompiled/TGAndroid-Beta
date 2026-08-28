package h7;

import j7.lg;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
public final class m extends AbstractCollection {
    public final int f10022a;
    public final Object f10023b;

    public m(int i9, Serializable serializable) {
        this.f10022a = i9;
        this.f10023b = serializable;
    }

    @Override
    public final void clear() {
        switch (this.f10022a) {
            case 0:
                ((n) this.f10023b).clear();
                return;
            case 1:
                ((wa) this.f10023b).clear();
                return;
            case 2:
                ((j7.d) this.f10023b).clear();
                return;
            case 3:
                ((wa) this.f10023b).clear();
                return;
            case 4:
                ((o8.h0) this.f10023b).b();
                return;
            case 5:
                ((o8.p) this.f10023b).clear();
                return;
            default:
                ((wa) this.f10023b).clear();
                return;
        }
    }

    @Override
    public boolean contains(Object obj) {
        switch (this.f10022a) {
            case 1:
                return ((wa) this.f10023b).containsValue(obj);
            case 2:
            case 5:
            default:
                return super.contains(obj);
            case 3:
                return ((wa) this.f10023b).containsValue(obj);
            case 4:
                Iterator it = ((m) ((o8.h0) this.f10023b).a().values()).iterator();
                while (it.hasNext()) {
                    if (((Collection) it.next()).contains(obj)) {
                        return true;
                    }
                }
                return false;
            case 6:
                return ((wa) this.f10023b).containsValue(obj);
        }
    }

    @Override
    public boolean isEmpty() {
        switch (this.f10022a) {
            case 1:
                return ((wa) this.f10023b).isEmpty();
            case 3:
                return ((wa) this.f10023b).isEmpty();
            case 6:
                return ((wa) this.f10023b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f10022a) {
            case 0:
                n nVar = (n) this.f10023b;
                Map a2 = nVar.a();
                if (a2 != null) {
                    return a2.values().iterator();
                }
                return new i(nVar, 2);
            case 1:
                return new com.google.android.gms.internal.clearcut.h1(((wa) this.f10023b).entrySet().iterator(), 1);
            case 2:
                j7.d dVar = (j7.d) this.f10023b;
                Map a3 = dVar.a();
                if (a3 != null) {
                    return a3.values().iterator();
                }
                return new j7.a(dVar, 2);
            case 3:
                return new com.google.android.gms.internal.clearcut.h1(((wa) this.f10023b).entrySet().iterator(), 2);
            case 4:
                return new o8.a((o8.h0) this.f10023b);
            case 5:
                o8.p pVar = (o8.p) this.f10023b;
                Map b10 = pVar.b();
                if (b10 != null) {
                    return b10.values().iterator();
                }
                return new o8.m(pVar, 2);
            default:
                return new com.google.android.gms.internal.clearcut.h1(((wa) this.f10023b).entrySet().iterator(), 3);
        }
    }

    @Override
    public boolean remove(Object obj) {
        switch (this.f10022a) {
            case 1:
                wa waVar = (wa) this.f10023b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry : waVar.entrySet()) {
                        if (f7.a8.a(obj, entry.getValue())) {
                            waVar.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 3:
                wa waVar2 = (wa) this.f10023b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused2) {
                    for (Map.Entry entry2 : waVar2.entrySet()) {
                        if (f7.x8.a(obj, entry2.getValue())) {
                            waVar2.remove(entry2.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 6:
                wa waVar3 = (wa) this.f10023b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused3) {
                    for (Map.Entry entry3 : waVar3.entrySet()) {
                        if (g7.c0.a(obj, entry3.getValue())) {
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
        switch (this.f10022a) {
            case 1:
                wa waVar = (wa) this.f10023b;
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
                    return ((h) waVar.f10168e).b().removeAll(hashSet);
                }
            case 3:
                wa waVar2 = (wa) this.f10023b;
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
                    return ((lg) waVar2.f10168e).b().removeAll(hashSet2);
                }
            case 6:
                wa waVar3 = (wa) this.f10023b;
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
        switch (this.f10022a) {
            case 1:
                wa waVar = (wa) this.f10023b;
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
                    return ((h) waVar.f10168e).b().retainAll(hashSet);
                }
            case 3:
                wa waVar2 = (wa) this.f10023b;
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
                    return ((lg) waVar2.f10168e).b().retainAll(hashSet2);
                }
            case 6:
                wa waVar3 = (wa) this.f10023b;
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
        switch (this.f10022a) {
            case 0:
                return ((n) this.f10023b).size();
            case 1:
                return ((wa) this.f10023b).f10166b.size();
            case 2:
                return ((j7.d) this.f10023b).size();
            case 3:
                return ((wa) this.f10023b).f10166b.size();
            case 4:
                return ((o8.h0) this.f10023b).f19047e;
            case 5:
                return ((o8.p) this.f10023b).size();
            default:
                return ((wa) this.f10023b).f10166b.size();
        }
    }

    public m(AbstractMap abstractMap, int i9) {
        this.f10022a = i9;
        this.f10023b = abstractMap;
    }
}
