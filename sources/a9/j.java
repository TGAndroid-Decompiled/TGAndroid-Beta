package a9;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import j$.util.concurrent.ConcurrentHashMap;
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
public final class j implements c {
    public static final h f246n = new h(0);
    public final o f250e;
    public final g h;
    public final HashMap f247a = new HashMap();
    public final HashMap f248b = new HashMap();
    public final HashMap f249c = new HashMap();
    public final HashSet d = new HashSet();
    public final AtomicReference f251f = new AtomicReference();

    public j(Executor executor, ArrayList arrayList, ArrayList arrayList2, g gVar) {
        o oVar = new o(executor);
        this.f250e = oVar;
        this.h = gVar;
        ArrayList arrayList3 = new ArrayList();
        int i10 = 0;
        arrayList3.add(b.c(oVar, o.class, w9.b.class, w9.a.class));
        arrayList3.add(b.c(this, j.class, new Class[0]));
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
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((z9.b) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.h.e(componentRegistrar));
                        it.remove();
                    }
                } catch (p e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((b) it2.next()).f233b.toArray();
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
            if (this.f247a.isEmpty()) {
                h7.m.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f247a.keySet());
                arrayList6.addAll(arrayList3);
                h7.m.a(arrayList6);
            }
            int size3 = arrayList3.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj4 = arrayList3.get(i14);
                i14++;
                b bVar2 = (b) obj4;
                this.f247a.put(bVar2, new q(new i(0, this, bVar2)));
            }
            arrayList5.addAll(j(arrayList3));
            arrayList5.addAll(k());
            i();
        }
        int size4 = arrayList5.size();
        while (i10 < size4) {
            Object obj5 = arrayList5.get(i10);
            i10++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) this.f251f.get();
        if (bool != null) {
            e(this.f247a, bool.booleanValue());
        }
    }

    @Override
    public final Object a(Class cls) {
        return d(v.a(cls));
    }

    @Override
    public final t b(v vVar) {
        z9.b g10 = g(vVar);
        if (g10 == null) {
            return new t(t.f271c, t.d);
        }
        if (g10 instanceof t) {
            return (t) g10;
        }
        return new t(null, g10);
    }

    @Override
    public final z9.b c(Class cls) {
        return g(v.a(cls));
    }

    @Override
    public final Object d(v vVar) {
        z9.b g10 = g(vVar);
        if (g10 == null) {
            return null;
        }
        return g10.get();
    }

    public final void e(HashMap hashMap, boolean z10) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            z9.b bVar = (z9.b) entry.getValue();
            int i10 = ((b) entry.getKey()).d;
            if (i10 == 1 || (i10 == 2 && z10)) {
                bVar.get();
            }
        }
        o oVar = this.f250e;
        synchronized (oVar) {
            try {
                arrayDeque = oVar.f261b;
                if (arrayDeque != null) {
                    oVar.f261b = null;
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
    public final Set f(v vVar) {
        z9.b bVar;
        synchronized (this) {
            bVar = (r) this.f249c.get(vVar);
            if (bVar == null) {
                bVar = f246n;
            }
        }
        return (Set) bVar.get();
    }

    @Override
    public final synchronized z9.b g(v vVar) {
        h7.n.a(vVar, "Null interface requested.");
        return (z9.b) this.f248b.get(vVar);
    }

    public final void h(boolean z10) {
        HashMap hashMap;
        AtomicReference atomicReference = this.f251f;
        Boolean valueOf = Boolean.valueOf(z10);
        while (!atomicReference.compareAndSet(null, valueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            hashMap = new HashMap(this.f247a);
        }
        e(hashMap, z10);
    }

    public final void i() {
        boolean z10;
        HashMap hashMap = this.f248b;
        HashMap hashMap2 = this.f249c;
        for (b bVar : this.f247a.keySet()) {
            for (m mVar : bVar.f234c) {
                if (mVar.f258b == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                v vVar = mVar.f257a;
                if (z10 && !hashMap2.containsKey(vVar)) {
                    Set set = Collections.EMPTY_SET;
                    ?? obj = new Object();
                    obj.f267b = null;
                    obj.f266a = Collections.newSetFromMap(new ConcurrentHashMap());
                    obj.f266a.addAll(set);
                    hashMap2.put(vVar, obj);
                } else if (hashMap.containsKey(vVar)) {
                    continue;
                } else {
                    int i10 = mVar.f258b;
                    if (i10 != 1) {
                        if (i10 != 2) {
                            hashMap.put(vVar, new t(t.f271c, t.d));
                        }
                    } else {
                        throw new RuntimeException("Unsatisfied dependency for component " + bVar + ": " + vVar);
                    }
                }
            }
        }
    }

    public final ArrayList j(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            b bVar = (b) obj;
            if (bVar.f235e == 0) {
                z9.b bVar2 = (z9.b) this.f247a.get(bVar);
                for (v vVar : bVar.f233b) {
                    HashMap hashMap = this.f248b;
                    if (!hashMap.containsKey(vVar)) {
                        hashMap.put(vVar, bVar2);
                    } else {
                        arrayList2.add(new a1.e(2, (t) ((z9.b) hashMap.get(vVar)), bVar2));
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList k() {
        HashMap hashMap = this.f249c;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : this.f247a.entrySet()) {
            b bVar = (b) entry.getKey();
            if (bVar.f235e != 0) {
                z9.b bVar2 = (z9.b) entry.getValue();
                for (v vVar : bVar.f233b) {
                    if (!hashMap2.containsKey(vVar)) {
                        hashMap2.put(vVar, new HashSet());
                    }
                    ((Set) hashMap2.get(vVar)).add(bVar2);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (!hashMap.containsKey(entry2.getKey())) {
                ?? obj = new Object();
                obj.f267b = null;
                obj.f266a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.f266a.addAll((Set) ((Collection) entry2.getValue()));
                hashMap.put((v) entry2.getKey(), obj);
            } else {
                r rVar = (r) hashMap.get(entry2.getKey());
                for (z9.b bVar3 : (Set) entry2.getValue()) {
                    arrayList.add(new a1.e(3, rVar, bVar3));
                }
            }
        }
        return arrayList;
    }
}
