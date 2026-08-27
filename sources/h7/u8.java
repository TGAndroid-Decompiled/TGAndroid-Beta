package h7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class u8 {
    public static void a(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            z8.a aVar = (z8.a) obj;
            z8.g gVar = new z8.g(aVar);
            for (z8.q qVar : aVar.f50219b) {
                boolean z10 = aVar.f50221e == 0;
                z8.h hVar = new z8.h(qVar, !z10);
                if (!map.containsKey(hVar)) {
                    map.put(hVar, new HashSet());
                }
                Set set = (Set) map.get(hVar);
                if (!set.isEmpty() && z10) {
                    throw new IllegalArgumentException("Multiple components provide " + qVar + ".");
                }
                set.add(gVar);
            }
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            for (z8.g gVar2 : (Set) it.next()) {
                for (z8.i iVar : gVar2.f50233a.f50220c) {
                    if (iVar.f50240c == 0) {
                        Set<z8.g> set2 = (Set) map.get(new z8.h(iVar.f50238a, iVar.f50239b == 2));
                        if (set2 != null) {
                            for (z8.g gVar3 : set2) {
                                gVar2.f50234b.add(gVar3);
                                gVar3.f50235c.add(gVar2);
                            }
                        }
                    }
                }
            }
        }
        HashSet<z8.g> hashSet = new HashSet();
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll((Set) it2.next());
        }
        HashSet hashSet2 = new HashSet();
        for (z8.g gVar4 : hashSet) {
            if (gVar4.f50235c.isEmpty()) {
                hashSet2.add(gVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            z8.g gVar5 = (z8.g) hashSet2.iterator().next();
            hashSet2.remove(gVar5);
            i10++;
            for (z8.g gVar6 : gVar5.f50234b) {
                gVar6.f50235c.remove(gVar5);
                if (gVar6.f50235c.isEmpty()) {
                    hashSet2.add(gVar6);
                }
            }
        }
        if (i10 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (z8.g gVar7 : hashSet) {
            if (!gVar7.f50235c.isEmpty() && !gVar7.f50234b.isEmpty()) {
                arrayList2.add(gVar7.f50233a);
            }
        }
        throw new z8.j("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }
}
