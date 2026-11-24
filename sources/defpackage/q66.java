package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
public final class q66 implements cx5 {
    public final cx5 a;
    public final p66 b;

    public q66(cx5 cx5Var) {
        ebb ebbVar = ebb.a;
        this.a = cx5Var;
        this.b = new p66(ebb.b, cx5Var.d());
    }

    @Override
    public final void b(c40 c40Var, Object obj) {
        Map map = (Map) obj;
        map.getClass();
        map.size();
        p66 p66Var = this.b;
        c40 a = c40Var.a(p66Var);
        Map map2 = (Map) obj;
        map2.getClass();
        int i = 0;
        for (Map.Entry entry : map2.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            a.i(p66Var, i, ebb.a, key);
            i += 2;
            a.i(p66Var, i2, this.a, value);
        }
        a.l(p66Var);
    }

    @Override
    public final Object c(jif jifVar) {
        Object k;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = linkedHashMap.size() << 1;
        jif a = jifVar.a(d());
        while (true) {
            int b = a.b(d());
            if (b != -1) {
                int i = b + size;
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                ebb ebbVar = ebb.a;
                p66 p66Var = this.b;
                Object k2 = a.k(p66Var, i, ebbVar, null);
                int b2 = a.b(p66Var);
                if (b2 == i + 1) {
                    boolean containsKey = linkedHashMap2.containsKey(k2);
                    cx5 cx5Var = this.a;
                    if (containsKey && !(cx5Var.d().e() instanceof dl8)) {
                        k = a.k(p66Var, b2, cx5Var, sk6.a(linkedHashMap2, k2));
                    } else {
                        k = a.k(p66Var, b2, cx5Var, null);
                    }
                    linkedHashMap2.put(k2, k);
                } else {
                    c1b.a(b10.g(i, b2, "Value must follow key in a map, index for key: ", ", returned index for value: "));
                }
            } else {
                a.o(d());
                return linkedHashMap;
            }
        }
    }

    @Override
    public final y6a d() {
        return this.b;
    }
}
