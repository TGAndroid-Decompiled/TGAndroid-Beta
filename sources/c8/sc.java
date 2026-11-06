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
            u9.g gVar = new u9.g(aVar);
            for (u9.q qVar : aVar.f56363b) {
                if (aVar.f56365e == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u9.h hVar = new u9.h(qVar, !z10);
                if (!hashMap.containsKey(hVar)) {
                    hashMap.put(hVar, new HashSet());
                }
                Set set = (Set) hashMap.get(hVar);
                if (!set.isEmpty() && z10) {
                    throw new IllegalArgumentException("Multiple components provide " + qVar + ".");
                }
                set.add(gVar);
            }
        }
        for (Set<u9.g> set2 : hashMap.values()) {
            for (u9.g gVar2 : set2) {
                for (u9.i iVar : gVar2.f56376a.f56364c) {
                    if (iVar.f56383c == 0) {
                        u9.q qVar2 = iVar.f56381a;
                        if (iVar.f56382b == 2) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        Set<u9.g> set3 = (Set) hashMap.get(new u9.h(qVar2, z9));
                        if (set3 != null) {
                            for (u9.g gVar3 : set3) {
                                gVar2.f56377b.add(gVar3);
                                gVar3.f56378c.add(gVar2);
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
            u9.g gVar4 = (u9.g) it.next();
            if (gVar4.f56378c.isEmpty()) {
                hashSet2.add(gVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            u9.g gVar5 = (u9.g) hashSet2.iterator().next();
            hashSet2.remove(gVar5);
            i7++;
            Iterator it2 = gVar5.f56377b.iterator();
            while (it2.hasNext()) {
                u9.g gVar6 = (u9.g) it2.next();
                gVar6.f56378c.remove(gVar5);
                if (gVar6.f56378c.isEmpty()) {
                    hashSet2.add(gVar6);
                }
            }
        }
        if (i7 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            u9.g gVar7 = (u9.g) it3.next();
            if (!gVar7.f56378c.isEmpty() && !gVar7.f56377b.isEmpty()) {
                arrayList2.add(gVar7.f56376a);
            }
        }
        throw new RuntimeException("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }
}
