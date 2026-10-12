package jd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
public abstract class r {
    public static int a(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map b(id.d... dVarArr) {
        if (dVarArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(a(dVarArr.length));
            c(linkedHashMap, dVarArr);
            return linkedHashMap;
        }
        return p.f12975a;
    }

    public static final void c(LinkedHashMap linkedHashMap, id.d[] dVarArr) {
        for (id.d dVar : dVarArr) {
            linkedHashMap.put(dVar.f11378a, dVar.f11379b);
        }
    }

    public static Map d(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(a(arrayList.size()));
                int size2 = arrayList.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    id.d dVar = (id.d) obj;
                    linkedHashMap.put(dVar.f11378a, dVar.f11379b);
                }
                return linkedHashMap;
            }
            id.d pair = (id.d) arrayList.get(0);
            kotlin.jvm.internal.i.e(pair, "pair");
            Map singletonMap = Collections.singletonMap(pair.f11378a, pair.f11379b);
            kotlin.jvm.internal.i.d(singletonMap, "singletonMap(...)");
            return singletonMap;
        }
        return p.f12975a;
    }
}
