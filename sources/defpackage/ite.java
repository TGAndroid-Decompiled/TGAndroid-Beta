package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
public final class ite {
    public static ate a(Object obj, Object obj2) {
        ate ateVar = (ate) obj;
        ate ateVar2 = (ate) obj2;
        if (!ateVar2.isEmpty()) {
            if (!ateVar.a) {
                if (ateVar.isEmpty()) {
                    ateVar = new ate();
                } else {
                    ?? linkedHashMap = new LinkedHashMap(ateVar);
                    linkedHashMap.a = true;
                    ateVar = linkedHashMap;
                }
            }
            ateVar.c();
            if (!ateVar2.isEmpty()) {
                ateVar.putAll(ateVar2);
            }
        }
        return ateVar;
    }

    public static void b(Object obj, Object obj2) {
        ate ateVar = (ate) obj;
        if (obj2 == null) {
            if (!ateVar.isEmpty()) {
                Iterator it = ateVar.entrySet().iterator();
                if (!it.hasNext()) {
                    return;
                }
                Map.Entry entry = (Map.Entry) it.next();
                entry.getKey();
                entry.getValue();
                throw new NoSuchMethodError();
            }
            return;
        }
        fyb.g();
    }
}
