package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
public abstract class qi6 {
    public static Object a(Map map, Object obj) {
        map.getClass();
        if (map instanceof ii6) {
            return ((ii6) map).a();
        }
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            throw new NoSuchElementException("Key " + obj + " is missing in the map.");
        }
        return obj2;
    }

    public static int b(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map c(ku7... ku7VarArr) {
        if (ku7VarArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(b(ku7VarArr.length));
            d(linkedHashMap, ku7VarArr);
            return linkedHashMap;
        }
        return d24.a;
    }

    public static final void d(LinkedHashMap linkedHashMap, ku7[] ku7VarArr) {
        for (ku7 ku7Var : ku7VarArr) {
            linkedHashMap.put(ku7Var.a, ku7Var.b);
        }
    }

    public static Map e(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            int i = 0;
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(b(arrayList.size()));
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj = arrayList.get(i);
                    i++;
                    ku7 ku7Var = (ku7) obj;
                    linkedHashMap.put(ku7Var.a, ku7Var.b);
                }
                return linkedHashMap;
            }
            ku7 ku7Var2 = (ku7) arrayList.get(0);
            ku7Var2.getClass();
            Map singletonMap = Collections.singletonMap(ku7Var2.a, ku7Var2.b);
            singletonMap.getClass();
            return singletonMap;
        }
        return d24.a;
    }
}
