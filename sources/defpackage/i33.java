package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
public final class i33 implements pr4 {
    public final byte a;
    public final Object b;
    public final Object c;

    public i33(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final Object invoke() {
        Object obj;
        String[] names;
        String str;
        byte b = this.a;
        g7c g7cVar = g7c.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((rr4) obj3).invoke(((e79) obj2).a);
                return g7cVar;
            case 1:
                ((rr4) obj3).invoke(((e79) obj2).a);
                return g7cVar;
            default:
                y6a y6aVar = (y6a) obj3;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                mcd.a((lw5) obj2, y6aVar);
                int f = y6aVar.f();
                for (int i = 0; i < f; i++) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : y6aVar.h(i)) {
                        if (obj4 instanceof uw5) {
                            arrayList.add(obj4);
                        }
                    }
                    if (arrayList.size() == 1) {
                        obj = arrayList.get(0);
                    } else {
                        obj = null;
                    }
                    uw5 uw5Var = (uw5) obj;
                    if (uw5Var != null && (names = uw5Var.names()) != null) {
                        for (String str2 : names) {
                            if (rr5.a(y6aVar.e(), a7a.c)) {
                                str = "enum value";
                            } else {
                                str = "property";
                            }
                            if (!linkedHashMap.containsKey(str2)) {
                                linkedHashMap.put(str2, Integer.valueOf(i));
                            } else {
                                throw new IllegalArgumentException("The suggested name '" + str2 + "' for " + str + ' ' + y6aVar.g(i) + " is already one of the names for " + str + ' ' + y6aVar.g(((Number) sk6.a(linkedHashMap, str2)).intValue()) + " in " + y6aVar);
                            }
                        }
                        continue;
                    }
                }
                if (linkedHashMap.isEmpty()) {
                    return o34.a;
                }
                return linkedHashMap;
        }
    }
}
