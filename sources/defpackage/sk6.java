package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
public abstract class sk6 {
    public static Object a(Map map, Object obj) {
        map.getClass();
        if (map instanceof kk6) {
            return ((kk6) map).a();
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

    public static Map c(lw7... lw7VarArr) {
        if (lw7VarArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(b(lw7VarArr.length));
            d(linkedHashMap, lw7VarArr);
            return linkedHashMap;
        }
        return o34.a;
    }

    public static final void d(LinkedHashMap linkedHashMap, lw7[] lw7VarArr) {
        for (lw7 lw7Var : lw7VarArr) {
            linkedHashMap.put(lw7Var.a, lw7Var.b);
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
                    lw7 lw7Var = (lw7) obj;
                    linkedHashMap.put(lw7Var.a, lw7Var.b);
                }
                return linkedHashMap;
            }
            lw7 lw7Var2 = (lw7) arrayList.get(0);
            lw7Var2.getClass();
            Map singletonMap = Collections.singletonMap(lw7Var2.a, lw7Var2.b);
            singletonMap.getClass();
            return singletonMap;
        }
        return o34.a;
    }
}
