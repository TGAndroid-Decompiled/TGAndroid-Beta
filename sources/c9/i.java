package c9;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import j$.util.concurrent.ConcurrentHashMap;
import j7.i5;
import j7.j5;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
public final class i implements c {
    public static final g f2160n = new g(0);
    public final n e;
    public final f h;
    public final HashMap f2161a = new HashMap();
    public final HashMap f2162b = new HashMap();
    public final HashMap f2163c = new HashMap();
    public final HashSet d = new HashSet();
    public final AtomicReference f2164f = new AtomicReference();

    public i(Executor executor, ArrayList arrayList, ArrayList arrayList2, f fVar) {
        n nVar = new n(executor);
        this.e = nVar;
        this.h = fVar;
        ArrayList arrayList3 = new ArrayList();
        int i10 = 0;
        arrayList3.add(b.c(nVar, n.class, y9.b.class, y9.a.class));
        arrayList3.add(b.c(this, i.class, new Class[0]));
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            b bVar = (b) obj;
            if (bVar != null) {
                arrayList3.add(bVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((ba.b) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.h.b(componentRegistrar));
                        it.remove();
                    }
                } catch (o e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((b) it2.next()).f2149b.toArray();
                int length = array.length;
                int i13 = 0;
                while (true) {
                    if (i13 < length) {
                        Object obj3 = array[i13];
                        if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.d.contains(obj3.toString())) {
                                it2.remove();
                                break;
                            }
                            this.d.add(obj3.toString());
                        }
                        i13++;
                    }
                }
            }
            if (this.f2161a.isEmpty()) {
                i5.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f2161a.keySet());
                arrayList6.addAll(arrayList3);
                i5.a(arrayList6);
            }
            int size3 = arrayList3.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj4 = arrayList3.get(i14);
                i14++;
                b bVar2 = (b) obj4;
                this.f2161a.put(bVar2, new p(new h(0, this, bVar2)));
            }
            arrayList5.addAll(i(arrayList3));
            arrayList5.addAll(j());
            h();
        }
        int size4 = arrayList5.size();
        while (i10 < size4) {
            Object obj5 = arrayList5.get(i10);
            i10++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) this.f2164f.get();
        if (bool != null) {
            b(this.f2161a, bool.booleanValue());
        }
    }

    @Override
    public final Object a(Class cls) {
        return f(t.a(cls));
    }

    public final void b(HashMap hashMap, boolean z4) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            ba.b bVar = (ba.b) entry.getValue();
            int i10 = ((b) entry.getKey()).d;
            if (i10 == 1 || (i10 == 2 && z4)) {
                bVar.get();
            }
        }
        n nVar = this.e;
        synchronized (nVar) {
            try {
                arrayDeque = nVar.f2174b;
                if (arrayDeque != null) {
                    nVar.f2174b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    @Override
    public final synchronized ba.b c(t tVar) {
        j5.a(tVar, "Null interface requested.");
        return (ba.b) this.f2162b.get(tVar);
    }

    @Override
    public final ba.b d(Class cls) {
        return c(t.a(cls));
    }

    @Override
    public final r e(t tVar) {
        ba.b c3 = c(tVar);
        if (c3 == null) {
            return new r(r.f2181c, r.d);
        }
        if (c3 instanceof r) {
            return (r) c3;
        }
        return new r(null, c3);
    }

    @Override
    public final Object f(t tVar) {
        ba.b c3 = c(tVar);
        if (c3 == null) {
            return null;
        }
        return c3.get();
    }

    public final void g(boolean z4) {
        HashMap hashMap;
        AtomicReference atomicReference = this.f2164f;
        Boolean valueOf = Boolean.valueOf(z4);
        while (!atomicReference.compareAndSet(null, valueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            hashMap = new HashMap(this.f2161a);
        }
        b(hashMap, z4);
    }

    public final void h() {
        boolean z4;
        HashMap hashMap = this.f2162b;
        HashMap hashMap2 = this.f2163c;
        for (b bVar : this.f2161a.keySet()) {
            for (l lVar : bVar.f2150c) {
                if (lVar.f2171b == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                t tVar = lVar.f2170a;
                if (z4 && !hashMap2.containsKey(tVar)) {
                    Set set = Collections.EMPTY_SET;
                    ?? obj = new Object();
                    obj.f2180b = null;
                    obj.f2179a = Collections.newSetFromMap(new ConcurrentHashMap());
                    obj.f2179a.addAll(set);
                    hashMap2.put(tVar, obj);
                } else if (hashMap.containsKey(tVar)) {
                    continue;
                } else {
                    int i10 = lVar.f2171b;
                    if (i10 != 1) {
                        if (i10 != 2) {
                            hashMap.put(tVar, new r(r.f2181c, r.d));
                        }
                    } else {
                        throw new RuntimeException("Unsatisfied dependency for component " + bVar + ": " + tVar);
                    }
                }
            }
        }
    }

    public final ArrayList i(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            b bVar = (b) obj;
            if (bVar.e == 0) {
                ba.b bVar2 = (ba.b) this.f2161a.get(bVar);
                for (t tVar : bVar.f2149b) {
                    HashMap hashMap = this.f2162b;
                    if (!hashMap.containsKey(tVar)) {
                        hashMap.put(tVar, bVar2);
                    } else {
                        arrayList2.add(new a1.e(8, (r) ((ba.b) hashMap.get(tVar)), bVar2));
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList j() {
        HashMap hashMap = this.f2163c;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : this.f2161a.entrySet()) {
            b bVar = (b) entry.getKey();
            if (bVar.e != 0) {
                ba.b bVar2 = (ba.b) entry.getValue();
                for (t tVar : bVar.f2149b) {
                    if (!hashMap2.containsKey(tVar)) {
                        hashMap2.put(tVar, new HashSet());
                    }
                    ((Set) hashMap2.get(tVar)).add(bVar2);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (!hashMap.containsKey(entry2.getKey())) {
                ?? obj = new Object();
                obj.f2180b = null;
                obj.f2179a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.f2179a.addAll((Set) ((Collection) entry2.getValue()));
                hashMap.put((t) entry2.getKey(), obj);
            } else {
                q qVar = (q) hashMap.get(entry2.getKey());
                for (ba.b bVar3 : (Set) entry2.getValue()) {
                    arrayList.add(new a1.e(9, qVar, bVar3));
                }
            }
        }
        return arrayList;
    }

    @Override
    public final Set k(t tVar) {
        ba.b bVar;
        synchronized (this) {
            bVar = (q) this.f2163c.get(tVar);
            if (bVar == null) {
                bVar = f2160n;
            }
        }
        return (Set) bVar.get();
    }
}
