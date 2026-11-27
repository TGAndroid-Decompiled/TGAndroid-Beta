package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
public abstract class uk6 {
    public static Object a(Map map, Object obj) {
        map.getClass();
        if (map instanceof mk6) {
            return ((mk6) map).a();
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

    public static Map c(rx7... rx7VarArr) {
        if (rx7VarArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(b(rx7VarArr.length));
            d(linkedHashMap, rx7VarArr);
            return linkedHashMap;
        }
        return y24.a;
    }

    public static final void d(LinkedHashMap linkedHashMap, rx7[] rx7VarArr) {
        for (rx7 rx7Var : rx7VarArr) {
            linkedHashMap.put(rx7Var.a, rx7Var.b);
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
                    rx7 rx7Var = (rx7) obj;
                    linkedHashMap.put(rx7Var.a, rx7Var.b);
                }
                return linkedHashMap;
            }
            rx7 rx7Var2 = (rx7) arrayList.get(0);
            rx7Var2.getClass();
            Map singletonMap = Collections.singletonMap(rx7Var2.a, rx7Var2.b);
            singletonMap.getClass();
            return singletonMap;
        }
        return y24.a;
    }
}
