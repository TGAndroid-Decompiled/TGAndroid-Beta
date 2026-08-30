package na;

import java.util.regex.Pattern;
import l7.w0;
public final class d {
    public final ca.d f14873a;
    public final w0 f14874b;
    public final k f14875c;
    public final ud.d d = ud.e.a();

    public d(uc.h hVar, ca.d dVar, la.b bVar, w0 w0Var, k1.g gVar) {
        this.f14873a = dVar;
        this.f14874b = w0Var;
        this.f14875c = new k(gVar);
    }

    public static String b(String str) {
        Pattern compile = Pattern.compile("/");
        kotlin.jvm.internal.j.d(compile, "compile(...)");
        String replaceAll = compile.matcher(str).replaceAll("");
        kotlin.jvm.internal.j.d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final Boolean a() {
        e eVar = this.f14875c.f14896b;
        if (eVar != null) {
            return eVar.f14876a;
        }
        kotlin.jvm.internal.j.h("sessionConfigs");
        throw null;
    }

    public final java.lang.Object c(uc.c r25) {
        throw new UnsupportedOperationException("Method not decompiled: na.d.c(uc.c):java.lang.Object");
    }
}
