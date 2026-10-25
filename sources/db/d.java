package db;

import a8.h0;
import java.util.regex.Pattern;
public final class d {
    public final sa.d f8285a;
    public final h0 f8286b;
    public final k f8287c;
    public final le.d d = le.e.a();

    public d(ld.h hVar, sa.d dVar, bb.b bVar, h0 h0Var, k1.f fVar) {
        this.f8285a = dVar;
        this.f8286b = h0Var;
        this.f8287c = new k(fVar);
    }

    public static String b(String str) {
        Pattern compile = Pattern.compile("/");
        kotlin.jvm.internal.i.d(compile, "compile(...)");
        String replaceAll = compile.matcher(str).replaceAll("");
        kotlin.jvm.internal.i.d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final Boolean a() {
        e eVar = this.f8287c.f8308b;
        if (eVar != null) {
            return eVar.f8288a;
        }
        kotlin.jvm.internal.i.h("sessionConfigs");
        throw null;
    }

    public final java.lang.Object c(ld.c r25) {
        throw new UnsupportedOperationException("Method not decompiled: db.d.c(ld.c):java.lang.Object");
    }
}
