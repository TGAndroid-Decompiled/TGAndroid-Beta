package aa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public abstract class m1 {
    public static void a(ArrayList arrayList) {
        boolean z10;
        boolean z11;
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            s9.a aVar = (s9.a) obj;
            s9.h hVar = new s9.h(aVar);
            for (s9.r rVar : aVar.f47984b) {
                if (aVar.e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                s9.i iVar = new s9.i(rVar, !z11);
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
        for (Set<s9.h> set2 : hashMap.values()) {
            for (s9.h hVar2 : set2) {
                for (s9.j jVar : hVar2.f47996a.f47985c) {
                    if (jVar.f48003c == 0) {
                        s9.r rVar2 = jVar.f48001a;
                        if (jVar.f48002b == 2) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        Set<s9.h> set3 = (Set) hashMap.get(new s9.i(rVar2, z10));
                        if (set3 != null) {
                            for (s9.h hVar3 : set3) {
                                hVar2.f47997b.add(hVar3);
                                hVar3.f47998c.add(hVar2);
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
            s9.h hVar4 = (s9.h) it.next();
            if (hVar4.f47998c.isEmpty()) {
                hashSet2.add(hVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            s9.h hVar5 = (s9.h) hashSet2.iterator().next();
            hashSet2.remove(hVar5);
            i10++;
            Iterator it2 = hVar5.f47997b.iterator();
            while (it2.hasNext()) {
                s9.h hVar6 = (s9.h) it2.next();
                hVar6.f47998c.remove(hVar5);
                if (hVar6.f47998c.isEmpty()) {
                    hashSet2.add(hVar6);
                }
            }
        }
        if (i10 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            s9.h hVar7 = (s9.h) it3.next();
            if (!hVar7.f47998c.isEmpty() && !hVar7.f47997b.isEmpty()) {
                arrayList2.add(hVar7.f47996a);
            }
        }
        throw new RuntimeException("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }
}
