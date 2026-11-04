package eb;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.j;
public final class c {
    public static final c f9925a = new Object();
    public static final Map f9926b = DesugarCollections.synchronizedMap(new LinkedHashMap());

    public static a a(d dVar) {
        Map dependencies = f9926b;
        j.d(dependencies, "dependencies");
        Object obj = dependencies.get(dVar);
        if (obj != null) {
            return (a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + dVar + ". Dependencies should be added at class load time.");
    }

    public final java.lang.Object b(hd.c r11) {
        throw new UnsupportedOperationException("Method not decompiled: eb.c.b(hd.c):java.lang.Object");
    }
}
