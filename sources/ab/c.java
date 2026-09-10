package ab;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.i;
public final class c {
    public static final c f368a = new Object();
    public static final Map f369b = DesugarCollections.synchronizedMap(new LinkedHashMap());

    public static a a(d dVar) {
        Map dependencies = f369b;
        i.d(dependencies, "dependencies");
        Object obj = dependencies.get(dVar);
        if (obj != null) {
            return (a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + dVar + ". Dependencies should be added at class load time.");
    }

    public final java.lang.Object b(kd.c r11) {
        throw new UnsupportedOperationException("Method not decompiled: ab.c.b(kd.c):java.lang.Object");
    }
}
