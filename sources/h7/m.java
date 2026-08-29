package h7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public abstract class m {
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
            a9.b bVar = (a9.b) obj;
            a9.k kVar = new a9.k(bVar);
            for (a9.v vVar : bVar.f233b) {
                if (bVar.f235e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                a9.l lVar = new a9.l(vVar, !z11);
                if (!hashMap.containsKey(lVar)) {
                    hashMap.put(lVar, new HashSet());
                }
                Set set = (Set) hashMap.get(lVar);
                if (!set.isEmpty() && z11) {
                    throw new IllegalArgumentException("Multiple components provide " + vVar + ".");
                }
                set.add(kVar);
            }
        }
        for (Set<a9.k> set2 : hashMap.values()) {
            for (a9.k kVar2 : set2) {
                for (a9.m mVar : kVar2.f252a.f234c) {
                    if (mVar.f259c == 0) {
                        a9.v vVar2 = mVar.f257a;
                        if (mVar.f258b == 2) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        Set<a9.k> set3 = (Set) hashMap.get(new a9.l(vVar2, z10));
                        if (set3 != null) {
                            for (a9.k kVar3 : set3) {
                                kVar2.f253b.add(kVar3);
                                kVar3.f254c.add(kVar2);
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
            a9.k kVar4 = (a9.k) it.next();
            if (kVar4.f254c.isEmpty()) {
                hashSet2.add(kVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            a9.k kVar5 = (a9.k) hashSet2.iterator().next();
            hashSet2.remove(kVar5);
            i10++;
            Iterator it2 = kVar5.f253b.iterator();
            while (it2.hasNext()) {
                a9.k kVar6 = (a9.k) it2.next();
                kVar6.f254c.remove(kVar5);
                if (kVar6.f254c.isEmpty()) {
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
            a9.k kVar7 = (a9.k) it3.next();
            if (!kVar7.f254c.isEmpty() && !kVar7.f253b.isEmpty()) {
                arrayList2.add(kVar7.f252a);
            }
        }
        throw new RuntimeException("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }
}
