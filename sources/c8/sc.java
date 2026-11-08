package c8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public abstract class sc {
    public static void a(ArrayList arrayList) {
        boolean z9;
        boolean z10;
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            u9.a aVar = (u9.a) obj;
            u9.h hVar = new u9.h(aVar);
            for (u9.r rVar : aVar.f56453b) {
                if (aVar.f56455e == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u9.i iVar = new u9.i(rVar, !z10);
                if (!hashMap.containsKey(iVar)) {
                    hashMap.put(iVar, new HashSet());
                }
                Set set = (Set) hashMap.get(iVar);
                if (!set.isEmpty() && z10) {
                    throw new IllegalArgumentException("Multiple components provide " + rVar + ".");
                }
                set.add(hVar);
            }
        }
        for (Set<u9.h> set2 : hashMap.values()) {
            for (u9.h hVar2 : set2) {
                for (u9.j jVar : hVar2.f56469a.f56454c) {
                    if (jVar.f56476c == 0) {
                        u9.r rVar2 = jVar.f56474a;
                        if (jVar.f56475b == 2) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        Set<u9.h> set3 = (Set) hashMap.get(new u9.i(rVar2, z9));
                        if (set3 != null) {
                            for (u9.h hVar3 : set3) {
                                hVar2.f56470b.add(hVar3);
                                hVar3.f56471c.add(hVar2);
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
            u9.h hVar4 = (u9.h) it.next();
            if (hVar4.f56471c.isEmpty()) {
                hashSet2.add(hVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            u9.h hVar5 = (u9.h) hashSet2.iterator().next();
            hashSet2.remove(hVar5);
            i7++;
            Iterator it2 = hVar5.f56470b.iterator();
            while (it2.hasNext()) {
                u9.h hVar6 = (u9.h) it2.next();
                hVar6.f56471c.remove(hVar5);
                if (hVar6.f56471c.isEmpty()) {
                    hashSet2.add(hVar6);
                }
            }
        }
        if (i7 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            u9.h hVar7 = (u9.h) it3.next();
            if (!hVar7.f56471c.isEmpty() && !hVar7.f56470b.isEmpty()) {
                arrayList2.add(hVar7.f56469a);
            }
        }
        throw new RuntimeException("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }
}
