package bb;

import java.util.regex.Pattern;
public final class e {
    public final qa.d f2569a;
    public final aa.a f2570b;
    public final m f2571c;
    public final ie.d d = ie.e.a();

    public e(id.h hVar, qa.d dVar, za.b bVar, aa.a aVar, k1.f fVar) {
        this.f2569a = dVar;
        this.f2570b = aVar;
        this.f2571c = new m(fVar);
    }

    public static String b(String str) {
        Pattern compile = Pattern.compile("/");
        kotlin.jvm.internal.i.d(compile, "compile(...)");
        String replaceAll = compile.matcher(str).replaceAll("");
        kotlin.jvm.internal.i.d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final Boolean a() {
        f fVar = this.f2571c.f2597b;
        if (fVar != null) {
            return fVar.f2572a;
        }
        kotlin.jvm.internal.i.h("sessionConfigs");
        throw null;
    }

    public final java.lang.Object c(id.c r25) {
        throw new UnsupportedOperationException("Method not decompiled: bb.e.c(id.c):java.lang.Object");
    }
}
