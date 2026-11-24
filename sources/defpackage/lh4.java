package defpackage;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
public final class lh4 {
    public static final lh4 a = new Object();
    public static final Map b = DesugarCollections.synchronizedMap(new LinkedHashMap());

    public static jh4 a(q6a q6aVar) {
        Map map = b;
        map.getClass();
        Object obj = map.get(q6aVar);
        if (obj != null) {
            return (jh4) obj;
        }
        w44.d(q6aVar, ". Dependencies should be added at class load time.", "Cannot get dependency ");
        return null;
    }

    public final java.lang.Object b(defpackage.fw2 r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lh4.b(fw2):java.lang.Object");
    }
}
