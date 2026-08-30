package j7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public abstract class i5 {
    public static void a(ArrayList arrayList) {
        boolean z4;
        boolean z10;
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            c9.b bVar = (c9.b) obj;
            c9.j jVar = new c9.j(bVar);
            for (c9.t tVar : bVar.f2149b) {
                if (bVar.e == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                c9.k kVar = new c9.k(tVar, !z10);
                if (!hashMap.containsKey(kVar)) {
                    hashMap.put(kVar, new HashSet());
                }
                Set set = (Set) hashMap.get(kVar);
                if (!set.isEmpty() && z10) {
                    throw new IllegalArgumentException("Multiple components provide " + tVar + ".");
                }
                set.add(jVar);
            }
        }
        for (Set<c9.j> set2 : hashMap.values()) {
            for (c9.j jVar2 : set2) {
                for (c9.l lVar : jVar2.f2165a.f2150c) {
                    if (lVar.f2172c == 0) {
                        c9.t tVar2 = lVar.f2170a;
                        if (lVar.f2171b == 2) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        Set<c9.j> set3 = (Set) hashMap.get(new c9.k(tVar2, z4));
                        if (set3 != null) {
                            for (c9.j jVar3 : set3) {
                                jVar2.f2166b.add(jVar3);
                                jVar3.f2167c.add(jVar2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set set4 : hashMap.values()) {
            hashSet.addAll(set4);
        }
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            c9.j jVar4 = (c9.j) it.next();
            if (jVar4.f2167c.isEmpty()) {
                hashSet2.add(jVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            c9.j jVar5 = (c9.j) hashSet2.iterator().next();
            hashSet2.remove(jVar5);
            i10++;
            Iterator it2 = jVar5.f2166b.iterator();
            while (it2.hasNext()) {
                c9.j jVar6 = (c9.j) it2.next();
                jVar6.f2167c.remove(jVar5);
                if (jVar6.f2167c.isEmpty()) {
                    hashSet2.add(jVar6);
                }
            }
        }
        if (i10 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            c9.j jVar7 = (c9.j) it3.next();
            if (!jVar7.f2167c.isEmpty() && !jVar7.f2166b.isEmpty()) {
                arrayList2.add(jVar7.f2165a);
            }
        }
        throw new RuntimeException("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }
}
