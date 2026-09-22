package bb;

import java.util.regex.Pattern;
public final class d {
    public final qa.d f3462a;
    public final aa.a f3463b;
    public final l f3464c;
    public final ie.d d = ie.e.a();

    public d(id.h hVar, qa.d dVar, za.b bVar, aa.a aVar, k1.f fVar) {
        this.f3462a = dVar;
        this.f3463b = aVar;
        this.f3464c = new l(fVar);
    }

    public static String b(String str) {
        Pattern compile = Pattern.compile("/");
        kotlin.jvm.internal.i.d(compile, "compile(...)");
        String replaceAll = compile.matcher(str).replaceAll("");
        kotlin.jvm.internal.i.d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final Boolean a() {
        e eVar = this.f3464c.f3488b;
        if (eVar != null) {
            return eVar.f3465a;
        }
        kotlin.jvm.internal.i.h("sessionConfigs");
        throw null;
    }

    public final java.lang.Object c(id.c r25) {
        throw new UnsupportedOperationException("Method not decompiled: bb.d.c(id.c):java.lang.Object");
    }
}
