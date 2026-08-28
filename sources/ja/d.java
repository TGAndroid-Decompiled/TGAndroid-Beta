package ja;

import java.util.regex.Pattern;
public final class d {
    public final y9.d f14259a;
    public final j4.c f14260b;
    public final k f14261c;
    public final qd.d d = qd.e.a();

    public d(qc.h hVar, y9.d dVar, ha.b bVar, j4.c cVar, k1.f fVar) {
        this.f14259a = dVar;
        this.f14260b = cVar;
        this.f14261c = new k(fVar);
    }

    public static String b(String str) {
        Pattern compile = Pattern.compile("/");
        kotlin.jvm.internal.i.d(compile, "compile(...)");
        String replaceAll = compile.matcher(str).replaceAll("");
        kotlin.jvm.internal.i.d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final Boolean a() {
        e eVar = this.f14261c.f14284b;
        if (eVar != null) {
            return eVar.f14262a;
        }
        kotlin.jvm.internal.i.h("sessionConfigs");
        throw null;
    }

    public final java.lang.Object c(qc.c r25) {
        throw new UnsupportedOperationException("Method not decompiled: ja.d.c(qc.c):java.lang.Object");
    }
}
