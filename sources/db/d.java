package db;

import android.support.v4.media.session.a0;
import java.util.regex.Pattern;
public final class d {
    public final ra.d f5838a;
    public final a0 f5839b;
    public final k f5840c;
    public final ce.d d = ce.e.a();

    public d(cd.h hVar, ra.d dVar, bb.b bVar, a0 a0Var, k1.f fVar) {
        this.f5838a = dVar;
        this.f5839b = a0Var;
        this.f5840c = new k(fVar);
    }

    public static String b(String str) {
        Pattern compile = Pattern.compile("/");
        kotlin.jvm.internal.i.d(compile, "compile(...)");
        String replaceAll = compile.matcher(str).replaceAll("");
        kotlin.jvm.internal.i.d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final Boolean a() {
        e eVar = this.f5840c.f5861b;
        if (eVar != null) {
            return eVar.f5841a;
        }
        kotlin.jvm.internal.i.h("sessionConfigs");
        throw null;
    }

    public final java.lang.Object c(cd.c r25) {
        throw new UnsupportedOperationException("Method not decompiled: db.d.c(cd.c):java.lang.Object");
    }
}
