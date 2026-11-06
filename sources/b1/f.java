package b1;

import bi.a4;
import gd.k;
import hd.r;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import v0.o;
public final class f implements rd.a {
    public final int f2901a;
    public final Object f2902b;
    public final Object f2903c;

    public f(int i7, Object obj, Object obj2) {
        this.f2901a = i7;
        this.f2902b = obj;
        this.f2903c = obj2;
    }

    @Override
    public final Object invoke() {
        Object obj;
        String[] names;
        String str;
        switch (this.f2901a) {
            case 0:
                ((Executor) this.f2902b).execute(new a1.b((v0.g) this.f2903c, 7));
                break;
            case 1:
                c1.e eVar = (c1.e) this.f2902b;
                eVar.g().execute(new a4(14, eVar, (o) this.f2903c));
                break;
            default:
                me.d dVar = (me.d) this.f2902b;
                pe.b bVar = (pe.b) this.f2903c;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                bVar.f53459a.getClass();
                qe.f.e(dVar, bVar);
                int f10 = dVar.f();
                for (int i7 = 0; i7 < f10; i7++) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : dVar.h(i7)) {
                        if (obj2 instanceof pe.d) {
                            arrayList.add(obj2);
                        }
                    }
                    if (arrayList.size() == 1) {
                        obj = arrayList.get(0);
                    } else {
                        obj = null;
                    }
                    pe.d dVar2 = (pe.d) obj;
                    if (dVar2 != null && (names = dVar2.names()) != null) {
                        for (String str2 : names) {
                            if (j.a(dVar.e(), me.e.f20009c)) {
                                str = "enum value";
                            } else {
                                str = "property";
                            }
                            if (!linkedHashMap.containsKey(str2)) {
                                linkedHashMap.put(str2, Integer.valueOf(i7));
                            } else {
                                String message = "The suggested name '" + str2 + "' for " + str + ' ' + dVar.g(i7) + " is already one of the names for " + str + ' ' + dVar.g(((Number) r.a(linkedHashMap, str2)).intValue()) + " in " + dVar;
                                j.e(message, "message");
                                throw new IllegalArgumentException(message);
                            }
                        }
                        continue;
                    }
                }
                if (linkedHashMap.isEmpty()) {
                    return hd.o.f14475a;
                }
                return linkedHashMap;
        }
        return k.f13829a;
    }
}
