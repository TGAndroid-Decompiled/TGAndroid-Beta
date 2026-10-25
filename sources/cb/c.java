package cb;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.i;
public final class c {
    public static final c f6179a = new Object();
    public static final Map f6180b = DesugarCollections.synchronizedMap(new LinkedHashMap());

    public static a a(d dVar) {
        Map dependencies = f6180b;
        i.d(dependencies, "dependencies");
        Object obj = dependencies.get(dVar);
        if (obj != null) {
            return (a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + dVar + ". Dependencies should be added at class load time.");
    }

    public final java.lang.Object b(nd.c r11) {
        throw new UnsupportedOperationException("Method not decompiled: cb.c.b(nd.c):java.lang.Object");
    }
}
