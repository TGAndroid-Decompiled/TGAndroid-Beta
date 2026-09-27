package bb;

import java.util.regex.Pattern;
public final class d {
    public final qa.d f3457a;
    public final aa.a f3458b;
    public final l f3459c;
    public final ie.d d = ie.e.a();

    public d(id.h hVar, qa.d dVar, za.b bVar, aa.a aVar, k1.f fVar) {
        this.f3457a = dVar;
        this.f3458b = aVar;
        this.f3459c = new l(fVar);
    }

    public static String b(String str) {
        Pattern compile = Pattern.compile("/");
        kotlin.jvm.internal.i.d(compile, "compile(...)");
        String replaceAll = compile.matcher(str).replaceAll("");
        kotlin.jvm.internal.i.d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final Boolean a() {
        e eVar = this.f3459c.f3483b;
        if (eVar != null) {
            return eVar.f3460a;
        }
        kotlin.jvm.internal.i.h("sessionConfigs");
        throw null;
    }

    public final java.lang.Object c(id.c r25) {
        throw new UnsupportedOperationException("Method not decompiled: bb.d.c(id.c):java.lang.Object");
    }
}
