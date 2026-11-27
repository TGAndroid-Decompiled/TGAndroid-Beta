package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
public final class p23 implements sr4 {
    public final byte a;
    public final Object b;
    public final Object c;

    public p23(Object obj, Object obj2, byte b) {
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
        g9c g9cVar = g9c.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((ur4) obj3).invoke(((p89) obj2).a);
                return g9cVar;
            case 1:
                ((ur4) obj3).invoke(((p89) obj2).a);
                return g9cVar;
            default:
                o8a o8aVar = (o8a) obj3;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                dfd.a((qw5) obj2, o8aVar);
                int f = o8aVar.f();
                for (int i = 0; i < f; i++) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : o8aVar.h(i)) {
                        if (obj4 instanceof zw5) {
                            arrayList.add(obj4);
                        }
                    }
                    if (arrayList.size() == 1) {
                        obj = arrayList.get(0);
                    } else {
                        obj = null;
                    }
                    zw5 zw5Var = (zw5) obj;
                    if (zw5Var != null && (names = zw5Var.names()) != null) {
                        for (String str2 : names) {
                            if (ur5.a(o8aVar.e(), q8a.c)) {
                                str = "enum value";
                            } else {
                                str = "property";
                            }
                            if (!linkedHashMap.containsKey(str2)) {
                                linkedHashMap.put(str2, Integer.valueOf(i));
                            } else {
                                throw new IllegalArgumentException("The suggested name '" + str2 + "' for " + str + ' ' + o8aVar.g(i) + " is already one of the names for " + str + ' ' + o8aVar.g(((Number) uk6.a(linkedHashMap, str2)).intValue()) + " in " + o8aVar);
                            }
                        }
                        continue;
                    }
                }
                if (linkedHashMap.isEmpty()) {
                    return y24.a;
                }
                return linkedHashMap;
        }
    }
}
