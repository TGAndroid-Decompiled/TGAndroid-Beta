package b1;

import dd.k;
import ed.p;
import ed.s;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import v0.h;
import v0.n;
public final class f implements od.a {
    public final int f2335a;
    public final Object f2336b;
    public final Object f2337c;

    public f(int i3, Object obj, Object obj2) {
        this.f2335a = i3;
        this.f2336b = obj;
        this.f2337c = obj2;
    }

    @Override
    public final Object invoke() {
        Object obj;
        String[] names;
        String str;
        switch (this.f2335a) {
            case 0:
                ((Executor) this.f2336b).execute(new a1.e((h) this.f2337c, 7));
                break;
            case 1:
                c1.e eVar = (c1.e) this.f2336b;
                eVar.f().execute(new a1.f(24, eVar, (n) this.f2337c));
                break;
            default:
                je.d dVar = (je.d) this.f2336b;
                me.b bVar = (me.b) this.f2337c;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                bVar.f19277a.getClass();
                ne.f.e(dVar, bVar);
                int f10 = dVar.f();
                for (int i3 = 0; i3 < f10; i3++) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : dVar.h(i3)) {
                        if (obj2 instanceof me.d) {
                            arrayList.add(obj2);
                        }
                    }
                    if (arrayList.size() == 1) {
                        obj = arrayList.get(0);
                    } else {
                        obj = null;
                    }
                    me.d dVar2 = (me.d) obj;
                    if (dVar2 != null && (names = dVar2.names()) != null) {
                        for (String str2 : names) {
                            if (j.a(dVar.e(), je.e.f16244c)) {
                                str = "enum value";
                            } else {
                                str = "property";
                            }
                            if (!linkedHashMap.containsKey(str2)) {
                                linkedHashMap.put(str2, Integer.valueOf(i3));
                            } else {
                                String message = "The suggested name '" + str2 + "' for " + str + ' ' + dVar.g(i3) + " is already one of the names for " + str + ' ' + dVar.g(((Number) s.a(linkedHashMap, str2)).intValue()) + " in " + dVar;
                                j.e(message, "message");
                                throw new IllegalArgumentException(message);
                            }
                        }
                        continue;
                    }
                }
                if (linkedHashMap.isEmpty()) {
                    return p.f9954a;
                }
                return linkedHashMap;
        }
        return k.f8801a;
    }
}
