package defpackage;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
public final class pj4 {
    public static final pj4 a = new Object();
    public static final Map b = DesugarCollections.synchronizedMap(new LinkedHashMap());

    public static nj4 a(s8a s8aVar) {
        Map map = b;
        map.getClass();
        Object obj = map.get(s8aVar);
        if (obj != null) {
            return (nj4) obj;
        }
        zo4.i(s8aVar, ". Dependencies should be added at class load time.", "Cannot get dependency ");
        return null;
    }

    public final java.lang.Object b(defpackage.px2 r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pj4.b(px2):java.lang.Object");
    }
}
