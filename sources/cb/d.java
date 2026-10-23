package cb;

import java.util.regex.Pattern;
public final class d {
    public final ra.d f5062a;
    public final androidx.biometric.e f5063b;
    public final k f5064c;
    public final ke.d d = ke.e.a();

    public d(kd.h hVar, ra.d dVar, ab.b bVar, androidx.biometric.e eVar, k1.f fVar) {
        this.f5062a = dVar;
        this.f5063b = eVar;
        this.f5064c = new k(fVar);
    }

    public static String b(String str) {
        Pattern compile = Pattern.compile("/");
        kotlin.jvm.internal.i.d(compile, "compile(...)");
        String replaceAll = compile.matcher(str).replaceAll("");
        kotlin.jvm.internal.i.d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final Boolean a() {
        e eVar = this.f5064c.f5085b;
        if (eVar != null) {
            return eVar.f5065a;
        }
        kotlin.jvm.internal.i.h("sessionConfigs");
        throw null;
    }

    public final java.lang.Object c(kd.c r25) {
        throw new UnsupportedOperationException("Method not decompiled: cb.d.c(kd.c):java.lang.Object");
    }
}
