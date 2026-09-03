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
            c9.k kVar = new c9.k(bVar);
            for (c9.u uVar : bVar.f2172b) {
                if (bVar.e == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                c9.l lVar = new c9.l(uVar, !z10);
                if (!hashMap.containsKey(lVar)) {
                    hashMap.put(lVar, new HashSet());
                }
                Set set = (Set) hashMap.get(lVar);
                if (!set.isEmpty() && z10) {
                    throw new IllegalArgumentException("Multiple components provide " + uVar + ".");
                }
                set.add(kVar);
            }
        }
        for (Set<c9.k> set2 : hashMap.values()) {
            for (c9.k kVar2 : set2) {
                for (c9.m mVar : kVar2.f2189a.f2173c) {
                    if (mVar.f2196c == 0) {
                        c9.u uVar2 = mVar.f2194a;
                        if (mVar.f2195b == 2) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        Set<c9.k> set3 = (Set) hashMap.get(new c9.l(uVar2, z4));
                        if (set3 != null) {
                            for (c9.k kVar3 : set3) {
                                kVar2.f2190b.add(kVar3);
                                kVar3.f2191c.add(kVar2);
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
            c9.k kVar4 = (c9.k) it.next();
            if (kVar4.f2191c.isEmpty()) {
                hashSet2.add(kVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            c9.k kVar5 = (c9.k) hashSet2.iterator().next();
            hashSet2.remove(kVar5);
            i10++;
            Iterator it2 = kVar5.f2190b.iterator();
            while (it2.hasNext()) {
                c9.k kVar6 = (c9.k) it2.next();
                kVar6.f2191c.remove(kVar5);
                if (kVar6.f2191c.isEmpty()) {
                    hashSet2.add(kVar6);
                }
            }
        }
        if (i10 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            c9.k kVar7 = (c9.k) it3.next();
            if (!kVar7.f2191c.isEmpty() && !kVar7.f2190b.isEmpty()) {
                arrayList2.add(kVar7.f2189a);
            }
        }
        throw new RuntimeException("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }
}
