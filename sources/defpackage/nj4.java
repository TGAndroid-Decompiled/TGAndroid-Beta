package defpackage;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
public final class nj4 {
    public static final nj4 a = new Object();
    public static final Map b = DesugarCollections.synchronizedMap(new LinkedHashMap());

    public static lj4 a(iaa iaaVar) {
        Map map = b;
        map.getClass();
        Object obj = map.get(iaaVar);
        if (obj != null) {
            return (lj4) obj;
        }
        xi4.j(iaaVar, ". Dependencies should be added at class load time.", "Cannot get dependency ");
        return null;
    }

    public final java.lang.Object b(defpackage.zw2 r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nj4.b(zw2):java.lang.Object");
    }
}
