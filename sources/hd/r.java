package hd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
public abstract class r {
    public static Object a(Map map, Object obj) {
        kotlin.jvm.internal.j.e(map, "<this>");
        if (map instanceof q) {
            return ((q) map).a();
        }
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            throw new NoSuchElementException("Key " + obj + " is missing in the map.");
        }
        return obj2;
    }

    public static int b(int i7) {
        if (i7 < 0) {
            return i7;
        }
        if (i7 < 3) {
            return i7 + 1;
        }
        if (i7 < 1073741824) {
            return (int) ((i7 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map c(gd.e pair) {
        kotlin.jvm.internal.j.e(pair, "pair");
        Map singletonMap = Collections.singletonMap(pair.f13818a, pair.f13819b);
        kotlin.jvm.internal.j.d(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static Map d(gd.e... eVarArr) {
        if (eVarArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(b(eVarArr.length));
            e(linkedHashMap, eVarArr);
            return linkedHashMap;
        }
        return o.f14475a;
    }

    public static final void e(LinkedHashMap linkedHashMap, gd.e[] eVarArr) {
        for (gd.e eVar : eVarArr) {
            linkedHashMap.put(eVar.f13818a, eVar.f13819b);
        }
    }

    public static Map f(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(b(arrayList.size()));
                int size2 = arrayList.size();
                int i7 = 0;
                while (i7 < size2) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    gd.e eVar = (gd.e) obj;
                    linkedHashMap.put(eVar.f13818a, eVar.f13819b);
                }
                return linkedHashMap;
            }
            return c((gd.e) arrayList.get(0));
        }
        return o.f14475a;
    }

    public static final Map g(Map map) {
        kotlin.jvm.internal.j.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        kotlin.jvm.internal.j.d(singletonMap, "with(...)");
        return singletonMap;
    }
}
