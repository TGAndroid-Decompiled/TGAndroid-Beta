package ed;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
public abstract class s {
    public static Object a(Map map, Object obj) {
        kotlin.jvm.internal.j.e(map, "<this>");
        if (map instanceof r) {
            return ((r) map).a();
        }
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            throw new NoSuchElementException("Key " + obj + " is missing in the map.");
        }
        return obj2;
    }

    public static int b(int i3) {
        if (i3 < 0) {
            return i3;
        }
        if (i3 < 3) {
            return i3 + 1;
        }
        if (i3 < 1073741824) {
            return (int) ((i3 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map c(dd.e pair) {
        kotlin.jvm.internal.j.e(pair, "pair");
        Map singletonMap = Collections.singletonMap(pair.f8790a, pair.f8791b);
        kotlin.jvm.internal.j.d(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static Map d(dd.e... eVarArr) {
        if (eVarArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(b(eVarArr.length));
            e(linkedHashMap, eVarArr);
            return linkedHashMap;
        }
        return p.f9954a;
    }

    public static final void e(LinkedHashMap linkedHashMap, dd.e[] eVarArr) {
        for (dd.e eVar : eVarArr) {
            linkedHashMap.put(eVar.f8790a, eVar.f8791b);
        }
    }

    public static Map f(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(b(arrayList.size()));
                int size2 = arrayList.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    dd.e eVar = (dd.e) obj;
                    linkedHashMap.put(eVar.f8790a, eVar.f8791b);
                }
                return linkedHashMap;
            }
            return c((dd.e) arrayList.get(0));
        }
        return p.f9954a;
    }

    public static final Map g(Map map) {
        kotlin.jvm.internal.j.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        kotlin.jvm.internal.j.d(singletonMap, "with(...)");
        return singletonMap;
    }
}
