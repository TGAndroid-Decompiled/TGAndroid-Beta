package na;

import java.util.regex.Pattern;
import l7.w0;
public final class d {
    public final ca.d f15888a;
    public final w0 f15889b;
    public final k f15890c;
    public final ud.d d = ud.e.a();

    public d(uc.h hVar, ca.d dVar, la.b bVar, w0 w0Var, k1.g gVar) {
        this.f15888a = dVar;
        this.f15889b = w0Var;
        this.f15890c = new k(gVar);
    }

    public static String b(String str) {
        Pattern compile = Pattern.compile("/");
        kotlin.jvm.internal.j.d(compile, "compile(...)");
        String replaceAll = compile.matcher(str).replaceAll("");
        kotlin.jvm.internal.j.d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final Boolean a() {
        e eVar = this.f15890c.f15913b;
        if (eVar != null) {
            return eVar.f15891a;
        }
        kotlin.jvm.internal.j.h("sessionConfigs");
        throw null;
    }

    public final java.lang.Object c(uc.c r25) {
        throw new UnsupportedOperationException("Method not decompiled: na.d.c(uc.c):java.lang.Object");
    }
}
