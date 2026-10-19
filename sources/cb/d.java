package cb;

import java.util.regex.Pattern;
public final class d {
    public final ra.d f5057a;
    public final androidx.biometric.e f5058b;
    public final k f5059c;
    public final ke.d d = ke.e.a();

    public d(kd.h hVar, ra.d dVar, ab.b bVar, androidx.biometric.e eVar, k1.f fVar) {
        this.f5057a = dVar;
        this.f5058b = eVar;
        this.f5059c = new k(fVar);
    }

    public static String b(String str) {
        Pattern compile = Pattern.compile("/");
        kotlin.jvm.internal.i.d(compile, "compile(...)");
        String replaceAll = compile.matcher(str).replaceAll("");
        kotlin.jvm.internal.i.d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final Boolean a() {
        e eVar = this.f5059c.f5080b;
        if (eVar != null) {
            return eVar.f5060a;
        }
        kotlin.jvm.internal.i.h("sessionConfigs");
        throw null;
    }

    public final java.lang.Object c(kd.c r25) {
        throw new UnsupportedOperationException("Method not decompiled: cb.d.c(kd.c):java.lang.Object");
    }
}
