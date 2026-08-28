package g7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public abstract class s8 {
    public static void a(ArrayList arrayList) {
        boolean z10;
        boolean z11;
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            y8.a aVar = (y8.a) obj;
            y8.h hVar = new y8.h(aVar);
            for (y8.r rVar : aVar.f49622b) {
                if (aVar.f49624e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                y8.i iVar = new y8.i(rVar, !z11);
                if (!hashMap.containsKey(iVar)) {
                    hashMap.put(iVar, new HashSet());
                }
                Set set = (Set) hashMap.get(iVar);
                if (!set.isEmpty() && z11) {
                    throw new IllegalArgumentException("Multiple components provide " + rVar + ".");
                }
                set.add(hVar);
            }
        }
        for (Set<y8.h> set2 : hashMap.values()) {
            for (y8.h hVar2 : set2) {
                for (y8.j jVar : hVar2.f49637a.f49623c) {
                    if (jVar.f49644c == 0) {
                        y8.r rVar2 = jVar.f49642a;
                        if (jVar.f49643b == 2) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        Set<y8.h> set3 = (Set) hashMap.get(new y8.i(rVar2, z10));
                        if (set3 != null) {
                            for (y8.h hVar3 : set3) {
                                hVar2.f49638b.add(hVar3);
                                hVar3.f49639c.add(hVar2);
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
            y8.h hVar4 = (y8.h) it.next();
            if (hVar4.f49639c.isEmpty()) {
                hashSet2.add(hVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            y8.h hVar5 = (y8.h) hashSet2.iterator().next();
            hashSet2.remove(hVar5);
            i9++;
            Iterator it2 = hVar5.f49638b.iterator();
            while (it2.hasNext()) {
                y8.h hVar6 = (y8.h) it2.next();
                hVar6.f49639c.remove(hVar5);
                if (hVar6.f49639c.isEmpty()) {
                    hashSet2.add(hVar6);
                }
            }
        }
        if (i9 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            y8.h hVar7 = (y8.h) it3.next();
            if (!hVar7.f49639c.isEmpty() && !hVar7.f49638b.isEmpty()) {
                arrayList2.add(hVar7.f49637a);
            }
        }
        throw new RuntimeException("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }
}
