package ka;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.j;
public final class c {
    public static final c f13595a = new Object();
    public static final Map f13596b = DesugarCollections.synchronizedMap(new LinkedHashMap());

    public static a a(d dVar) {
        Map dependencies = f13596b;
        j.d(dependencies, "dependencies");
        Object obj = dependencies.get(dVar);
        if (obj != null) {
            return (a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + dVar + ". Dependencies should be added at class load time.");
    }

    public final java.lang.Object b(uc.c r11) {
        throw new UnsupportedOperationException("Method not decompiled: ka.c.b(uc.c):java.lang.Object");
    }
}
