package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
public final class u66 implements hx5 {
    public final hx5 a;
    public final t66 b;

    public u66(hx5 hx5Var) {
        adb adbVar = adb.a;
        this.a = hx5Var;
        this.b = new t66(adb.b, hx5Var.d());
    }

    @Override
    public final void b(d30 d30Var, Object obj) {
        Map map = (Map) obj;
        map.getClass();
        map.size();
        t66 t66Var = this.b;
        d30 a = d30Var.a(t66Var);
        Map map2 = (Map) obj;
        map2.getClass();
        int i = 0;
        for (Map.Entry entry : map2.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            a.i(t66Var, i, adb.a, key);
            i += 2;
            a.i(t66Var, i2, this.a, value);
        }
        a.l(t66Var);
    }

    @Override
    public final Object c(ykf ykfVar) {
        Object k;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = linkedHashMap.size() << 1;
        ykf a = ykfVar.a(d());
        while (true) {
            int b = a.b(d());
            if (b != -1) {
                int i = b + size;
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                adb adbVar = adb.a;
                t66 t66Var = this.b;
                Object k2 = a.k(t66Var, i, adbVar, null);
                int b2 = a.b(t66Var);
                if (b2 == i + 1) {
                    boolean containsKey = linkedHashMap2.containsKey(k2);
                    hx5 hx5Var = this.a;
                    if (containsKey && !(hx5Var.d().e() instanceof nm8)) {
                        k = a.k(t66Var, b2, hx5Var, uk6.a(linkedHashMap2, k2));
                    } else {
                        k = a.k(t66Var, b2, hx5Var, null);
                    }
                    linkedHashMap2.put(k2, k);
                } else {
                    bya.a(c00.h(i, b2, "Value must follow key in a map, index for key: ", ", returned index for value: "));
                }
            } else {
                a.o(d());
                return linkedHashMap;
            }
        }
    }

    @Override
    public final o8a d() {
        return this.b;
    }
}
