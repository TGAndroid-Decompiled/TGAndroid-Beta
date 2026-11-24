package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
public final class q46 implements cv5 {
    public final cv5 a;
    public final p46 b;

    public q46(cv5 cv5Var) {
        c9b c9bVar = c9b.a;
        this.a = cv5Var;
        this.b = new p46(c9b.b, cv5Var.d());
    }

    @Override
    public final void b(c30 c30Var, Object obj) {
        Map map = (Map) obj;
        map.getClass();
        map.size();
        p46 p46Var = this.b;
        c30 a = c30Var.a(p46Var);
        Map map2 = (Map) obj;
        map2.getClass();
        int i = 0;
        for (Map.Entry entry : map2.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            a.i(p46Var, i, c9b.a, key);
            i += 2;
            a.i(p46Var, i2, this.a, value);
        }
        a.l(p46Var);
    }

    @Override
    public final Object c(igf igfVar) {
        Object k;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = linkedHashMap.size() << 1;
        igf a = igfVar.a(d());
        while (true) {
            int b = a.b(d());
            if (b != -1) {
                int i = b + size;
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                c9b c9bVar = c9b.a;
                p46 p46Var = this.b;
                Object k2 = a.k(p46Var, i, c9bVar, null);
                int b2 = a.b(p46Var);
                if (b2 == i + 1) {
                    boolean containsKey = linkedHashMap2.containsKey(k2);
                    cv5 cv5Var = this.a;
                    if (containsKey && !(cv5Var.d().e() instanceof aj8)) {
                        k = a.k(p46Var, b2, cv5Var, qi6.a(linkedHashMap2, k2));
                    } else {
                        k = a.k(p46Var, b2, cv5Var, null);
                    }
                    linkedHashMap2.put(k2, k);
                } else {
                    v0b.a(b00.g(i, b2, "Value must follow key in a map, index for key: ", ", returned index for value: "));
                }
            } else {
                a.o(d());
                return linkedHashMap;
            }
        }
    }

    @Override
    public final w4a d() {
        return this.b;
    }
}
