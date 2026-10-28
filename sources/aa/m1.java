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
            s9.i iVar = new s9.i(aVar);
            for (s9.s sVar : aVar.f48019b) {
                if (aVar.e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                s9.j jVar = new s9.j(sVar, !z11);
                if (!hashMap.containsKey(jVar)) {
                    hashMap.put(jVar, new HashSet());
                }
                Set set = (Set) hashMap.get(jVar);
                if (!set.isEmpty() && z11) {
                    throw new IllegalArgumentException("Multiple components provide " + sVar + ".");
                }
                set.add(iVar);
            }
        }
        for (Set<s9.i> set2 : hashMap.values()) {
            for (s9.i iVar2 : set2) {
                for (s9.k kVar : iVar2.f48034a.f48020c) {
                    if (kVar.f48041c == 0) {
                        s9.s sVar2 = kVar.f48039a;
                        if (kVar.f48040b == 2) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        Set<s9.i> set3 = (Set) hashMap.get(new s9.j(sVar2, z10));
                        if (set3 != null) {
                            for (s9.i iVar3 : set3) {
                                iVar2.f48035b.add(iVar3);
                                iVar3.f48036c.add(iVar2);
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
            s9.i iVar4 = (s9.i) it.next();
            if (iVar4.f48036c.isEmpty()) {
                hashSet2.add(iVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            s9.i iVar5 = (s9.i) hashSet2.iterator().next();
            hashSet2.remove(iVar5);
            i10++;
            Iterator it2 = iVar5.f48035b.iterator();
            while (it2.hasNext()) {
                s9.i iVar6 = (s9.i) it2.next();
                iVar6.f48036c.remove(iVar5);
                if (iVar6.f48036c.isEmpty()) {
                    hashSet2.add(iVar6);
                }
            }
        }
        if (i10 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            s9.i iVar7 = (s9.i) it3.next();
            if (!iVar7.f48036c.isEmpty() && !iVar7.f48035b.isEmpty()) {
                arrayList2.add(iVar7.f48034a);
            }
        }
        throw new RuntimeException("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }
}
