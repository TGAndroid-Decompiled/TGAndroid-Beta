package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
public final class zxe {
    public static rxe a(Object obj, Object obj2) {
        rxe rxeVar = (rxe) obj;
        rxe rxeVar2 = (rxe) obj2;
        if (!rxeVar2.isEmpty()) {
            if (!rxeVar.a) {
                if (rxeVar.isEmpty()) {
                    rxeVar = new rxe();
                } else {
                    ?? linkedHashMap = new LinkedHashMap(rxeVar);
                    linkedHashMap.a = true;
                    rxeVar = linkedHashMap;
                }
            }
            rxeVar.c();
            if (!rxeVar2.isEmpty()) {
                rxeVar.putAll(rxeVar2);
            }
        }
        return rxeVar;
    }

    public static void b(Object obj, Object obj2) {
        rxe rxeVar = (rxe) obj;
        if (obj2 == null) {
            if (!rxeVar.isEmpty()) {
                Iterator it = rxeVar.entrySet().iterator();
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
        grb.o();
    }
}
