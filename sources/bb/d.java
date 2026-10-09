package bb;

import java.util.regex.Pattern;
public final class d {
    public final qa.d f3814a;
    public final aa.a f3815b;
    public final l f3816c;
    public final je.d d = je.e.a();

    public d(jd.h hVar, qa.d dVar, za.b bVar, aa.a aVar, k1.f fVar) {
        this.f3814a = dVar;
        this.f3815b = aVar;
        this.f3816c = new l(fVar);
    }

    public static String b(String str) {
        Pattern compile = Pattern.compile("/");
        kotlin.jvm.internal.i.d(compile, "compile(...)");
        String replaceAll = compile.matcher(str).replaceAll("");
        kotlin.jvm.internal.i.d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final Boolean a() {
        e eVar = this.f3816c.f3842b;
        if (eVar != null) {
            return eVar.f3817a;
        }
        kotlin.jvm.internal.i.h("sessionConfigs");
        throw null;
    }

    public final java.lang.Object c(jd.c r25) {
        throw new UnsupportedOperationException("Method not decompiled: bb.d.c(jd.c):java.lang.Object");
    }
}
