package la;

import java.util.regex.Pattern;
import l3.g0;
public final class d {
    public final aa.d f15117a;
    public final g0 f15118b;
    public final k f15119c;
    public final sd.d d = sd.e.a();

    public d(sc.h hVar, aa.d dVar, ja.b bVar, g0 g0Var, k1.f fVar) {
        this.f15117a = dVar;
        this.f15118b = g0Var;
        this.f15119c = new k(fVar);
    }

    public static String b(String str) {
        Pattern compile = Pattern.compile("/");
        kotlin.jvm.internal.j.d(compile, "compile(...)");
        String replaceAll = compile.matcher(str).replaceAll("");
        kotlin.jvm.internal.j.d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final Boolean a() {
        e eVar = this.f15119c.f15142b;
        if (eVar != null) {
            return eVar.f15120a;
        }
        kotlin.jvm.internal.j.h("sessionConfigs");
        throw null;
    }

    public final java.lang.Object c(sc.c r25) {
        throw new UnsupportedOperationException("Method not decompiled: la.d.c(sc.c):java.lang.Object");
    }
}
