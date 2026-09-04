package hd;

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

    public static Map b(gd.d... dVarArr) {
        if (dVarArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(a(dVarArr.length));
            c(linkedHashMap, dVarArr);
            return linkedHashMap;
        }
        return p.f10957a;
    }

    public static final void c(LinkedHashMap linkedHashMap, gd.d[] dVarArr) {
        for (gd.d dVar : dVarArr) {
            linkedHashMap.put(dVar.f10580a, dVar.f10581b);
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
                    gd.d dVar = (gd.d) obj;
                    linkedHashMap.put(dVar.f10580a, dVar.f10581b);
                }
                return linkedHashMap;
            }
            gd.d pair = (gd.d) arrayList.get(0);
            kotlin.jvm.internal.i.e(pair, "pair");
            Map singletonMap = Collections.singletonMap(pair.f10580a, pair.f10581b);
            kotlin.jvm.internal.i.d(singletonMap, "singletonMap(...)");
            return singletonMap;
        }
        return p.f10957a;
    }
}
