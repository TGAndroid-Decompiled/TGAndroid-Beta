package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
public final class lve {
    public static dve a(Object obj, Object obj2) {
        dve dveVar = (dve) obj;
        dve dveVar2 = (dve) obj2;
        if (!dveVar2.isEmpty()) {
            if (!dveVar.a) {
                if (dveVar.isEmpty()) {
                    dveVar = new dve();
                } else {
                    ?? linkedHashMap = new LinkedHashMap(dveVar);
                    linkedHashMap.a = true;
                    dveVar = linkedHashMap;
                }
            }
            dveVar.c();
            if (!dveVar2.isEmpty()) {
                dveVar.putAll(dveVar2);
            }
        }
        return dveVar;
    }

    public static void b(Object obj, Object obj2) {
        dve dveVar = (dve) obj;
        if (obj2 == null) {
            if (!dveVar.isEmpty()) {
                Iterator it = dveVar.entrySet().iterator();
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
        rjb.p();
    }
}
