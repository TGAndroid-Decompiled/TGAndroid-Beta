package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public abstract class xfe {
    public static void a(ArrayList arrayList) {
        boolean z;
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            fq2 fq2Var = (fq2) obj;
            r53 r53Var = new r53(fq2Var);
            for (i09 i09Var : fq2Var.b) {
                boolean z2 = fq2Var.e;
                s53 s53Var = new s53(i09Var, z2);
                if (!hashMap.containsKey(s53Var)) {
                    hashMap.put(s53Var, new HashSet());
                }
                Set set = (Set) hashMap.get(s53Var);
                if (!set.isEmpty() && !z2) {
                    throw new IllegalArgumentException("Multiple components provide " + i09Var + ".");
                }
                set.add(r53Var);
            }
        }
        for (Set<r53> set2 : hashMap.values()) {
            for (r53 r53Var2 : set2) {
                for (qe3 qe3Var : r53Var2.a.c) {
                    if (qe3Var.c == 0) {
                        i09 i09Var2 = qe3Var.a;
                        if (qe3Var.b == 2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Set<r53> set3 = (Set) hashMap.get(new s53(i09Var2, z));
                        if (set3 != null) {
                            for (r53 r53Var3 : set3) {
                                r53Var2.b.add(r53Var3);
                                r53Var3.c.add(r53Var2);
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
            r53 r53Var4 = (r53) it.next();
            if (r53Var4.c.isEmpty()) {
                hashSet2.add(r53Var4);
            }
        }
        while (!hashSet2.isEmpty()) {
            r53 r53Var5 = (r53) hashSet2.iterator().next();
            hashSet2.remove(r53Var5);
            i++;
            Iterator it2 = r53Var5.b.iterator();
            while (it2.hasNext()) {
                r53 r53Var6 = (r53) it2.next();
                r53Var6.c.remove(r53Var5);
                if (r53Var6.c.isEmpty()) {
                    hashSet2.add(r53Var6);
                }
            }
        }
        if (i == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            r53 r53Var7 = (r53) it3.next();
            if (!r53Var7.c.isEmpty() && !r53Var7.b.isEmpty()) {
                arrayList2.add(r53Var7.a);
            }
        }
        throw new RuntimeException("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }
}
