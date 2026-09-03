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
public final class j implements c {
    public static final h f2184n = new h(0);
    public final o e;
    public final g h;
    public final HashMap f2185a = new HashMap();
    public final HashMap f2186b = new HashMap();
    public final HashMap f2187c = new HashMap();
    public final HashSet d = new HashSet();
    public final AtomicReference f2188f = new AtomicReference();

    public j(Executor executor, ArrayList arrayList, ArrayList arrayList2, g gVar) {
        o oVar = new o(executor);
        this.e = oVar;
        this.h = gVar;
        ArrayList arrayList3 = new ArrayList();
        int i10 = 0;
        arrayList3.add(b.c(oVar, o.class, y9.b.class, y9.a.class));
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
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((ba.b) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.h.b(componentRegistrar));
                        it.remove();
                    }
                } catch (p e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((b) it2.next()).f2172b.toArray();
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
            if (this.f2185a.isEmpty()) {
                i5.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f2185a.keySet());
                arrayList6.addAll(arrayList3);
                i5.a(arrayList6);
            }
            int size3 = arrayList3.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj4 = arrayList3.get(i14);
                i14++;
                b bVar2 = (b) obj4;
                this.f2185a.put(bVar2, new q(new i(0, this, bVar2)));
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
        Boolean bool = (Boolean) this.f2188f.get();
        if (bool != null) {
            e(this.f2185a, bool.booleanValue());
        }
    }

    @Override
    public final Object a(Class cls) {
        return f(u.a(cls));
    }

    @Override
    public final synchronized ba.b b(u uVar) {
        j5.a(uVar, "Null interface requested.");
        return (ba.b) this.f2186b.get(uVar);
    }

    @Override
    public final ba.b c(Class cls) {
        return b(u.a(cls));
    }

    @Override
    public final s d(u uVar) {
        ba.b b10 = b(uVar);
        if (b10 == null) {
            return new s(s.f2205c, s.d);
        }
        if (b10 instanceof s) {
            return (s) b10;
        }
        return new s(null, b10);
    }

    public final void e(HashMap hashMap, boolean z4) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            ba.b bVar = (ba.b) entry.getValue();
            int i10 = ((b) entry.getKey()).d;
            if (i10 == 1 || (i10 == 2 && z4)) {
                bVar.get();
            }
        }
        o oVar = this.e;
        synchronized (oVar) {
            try {
                arrayDeque = oVar.f2198b;
                if (arrayDeque != null) {
                    oVar.f2198b = null;
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
    public final Object f(u uVar) {
        ba.b b10 = b(uVar);
        if (b10 == null) {
            return null;
        }
        return b10.get();
    }

    @Override
    public final Set g(u uVar) {
        ba.b bVar;
        synchronized (this) {
            bVar = (r) this.f2187c.get(uVar);
            if (bVar == null) {
                bVar = f2184n;
            }
        }
        return (Set) bVar.get();
    }

    public final void h(boolean z4) {
        HashMap hashMap;
        AtomicReference atomicReference = this.f2188f;
        Boolean valueOf = Boolean.valueOf(z4);
        while (!atomicReference.compareAndSet(null, valueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            hashMap = new HashMap(this.f2185a);
        }
        e(hashMap, z4);
    }

    public final void i() {
        boolean z4;
        HashMap hashMap = this.f2186b;
        HashMap hashMap2 = this.f2187c;
        for (b bVar : this.f2185a.keySet()) {
            for (m mVar : bVar.f2173c) {
                if (mVar.f2195b == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                u uVar = mVar.f2194a;
                if (z4 && !hashMap2.containsKey(uVar)) {
                    Set set = Collections.EMPTY_SET;
                    ?? obj = new Object();
                    obj.f2204b = null;
                    obj.f2203a = Collections.newSetFromMap(new ConcurrentHashMap());
                    obj.f2203a.addAll(set);
                    hashMap2.put(uVar, obj);
                } else if (hashMap.containsKey(uVar)) {
                    continue;
                } else {
                    int i10 = mVar.f2195b;
                    if (i10 != 1) {
                        if (i10 != 2) {
                            hashMap.put(uVar, new s(s.f2205c, s.d));
                        }
                    } else {
                        throw new RuntimeException("Unsatisfied dependency for component " + bVar + ": " + uVar);
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
            if (bVar.e == 0) {
                ba.b bVar2 = (ba.b) this.f2185a.get(bVar);
                for (u uVar : bVar.f2172b) {
                    HashMap hashMap = this.f2186b;
                    if (!hashMap.containsKey(uVar)) {
                        hashMap.put(uVar, bVar2);
                    } else {
                        arrayList2.add(new a1.e(8, (s) ((ba.b) hashMap.get(uVar)), bVar2));
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList k() {
        HashMap hashMap = this.f2187c;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : this.f2185a.entrySet()) {
            b bVar = (b) entry.getKey();
            if (bVar.e != 0) {
                ba.b bVar2 = (ba.b) entry.getValue();
                for (u uVar : bVar.f2172b) {
                    if (!hashMap2.containsKey(uVar)) {
                        hashMap2.put(uVar, new HashSet());
                    }
                    ((Set) hashMap2.get(uVar)).add(bVar2);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (!hashMap.containsKey(entry2.getKey())) {
                ?? obj = new Object();
                obj.f2204b = null;
                obj.f2203a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.f2203a.addAll((Set) ((Collection) entry2.getValue()));
                hashMap.put((u) entry2.getKey(), obj);
            } else {
                r rVar = (r) hashMap.get(entry2.getKey());
                for (ba.b bVar3 : (Set) entry2.getValue()) {
                    arrayList.add(new a1.e(9, rVar, bVar3));
                }
            }
        }
        return arrayList;
    }
}
