package b1;

import gd.k;
import hd.o;
import hd.r;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import v0.n;
public final class f implements rd.a {
    public final int f2858a;
    public final Object f2859b;
    public final Object f2860c;

    public f(int i7, Object obj, Object obj2) {
        this.f2858a = i7;
        this.f2859b = obj;
        this.f2860c = obj2;
    }

    @Override
    public final Object invoke() {
        Object obj;
        String[] names;
        String str;
        switch (this.f2858a) {
            case 0:
                ((Executor) this.f2859b).execute(new a1.b((v0.g) this.f2860c, 7));
                break;
            case 1:
                c1.f fVar = (c1.f) this.f2859b;
                fVar.g().execute(new c1.c(1, fVar, (n) this.f2860c));
                break;
            default:
                me.d dVar = (me.d) this.f2859b;
                pe.b bVar = (pe.b) this.f2860c;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                bVar.f54996a.getClass();
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
                            if (j.a(dVar.e(), me.e.f20609c)) {
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
                    return o.f13832a;
                }
                return linkedHashMap;
        }
        return k.f13173a;
    }
}
