package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
public final class x13 implements op4 {
    public final byte a;
    public final Object b;
    public final Object c;

    public x13(Object obj, Object obj2, byte b) {
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
        g5c g5cVar = g5c.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((qp4) obj3).invoke(((c59) obj2).a);
                return g5cVar;
            case 1:
                ((qp4) obj3).invoke(((c59) obj2).a);
                return g5cVar;
            default:
                w4a w4aVar = (w4a) obj3;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                kad.a((lu5) obj2, w4aVar);
                int f = w4aVar.f();
                for (int i = 0; i < f; i++) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : w4aVar.h(i)) {
                        if (obj4 instanceof uu5) {
                            arrayList.add(obj4);
                        }
                    }
                    if (arrayList.size() == 1) {
                        obj = arrayList.get(0);
                    } else {
                        obj = null;
                    }
                    uu5 uu5Var = (uu5) obj;
                    if (uu5Var != null && (names = uu5Var.names()) != null) {
                        for (String str2 : names) {
                            if (rp5.a(w4aVar.e(), y4a.c)) {
                                str = "enum value";
                            } else {
                                str = "property";
                            }
                            if (!linkedHashMap.containsKey(str2)) {
                                linkedHashMap.put(str2, Integer.valueOf(i));
                            } else {
                                throw new IllegalArgumentException("The suggested name '" + str2 + "' for " + str + ' ' + w4aVar.g(i) + " is already one of the names for " + str + ' ' + w4aVar.g(((Number) qi6.a(linkedHashMap, str2)).intValue()) + " in " + w4aVar);
                            }
                        }
                        continue;
                    }
                }
                if (linkedHashMap.isEmpty()) {
                    return d24.a;
                }
                return linkedHashMap;
        }
    }
}
