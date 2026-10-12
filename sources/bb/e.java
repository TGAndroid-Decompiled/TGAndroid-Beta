package bb;

import java.util.regex.Pattern;
public final class e {
    public final qa.d f3813a;
    public final aa.a f3814b;
    public final m f3815c;
    public final je.d d = je.e.a();

    public e(jd.h hVar, qa.d dVar, za.b bVar, aa.a aVar, k1.f fVar) {
        this.f3813a = dVar;
        this.f3814b = aVar;
        this.f3815c = new m(fVar);
    }

    public static String b(String str) {
        Pattern compile = Pattern.compile("/");
        kotlin.jvm.internal.i.d(compile, "compile(...)");
        String replaceAll = compile.matcher(str).replaceAll("");
        kotlin.jvm.internal.i.d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final Boolean a() {
        f fVar = this.f3815c.f3841b;
        if (fVar != null) {
            return fVar.f3816a;
        }
        kotlin.jvm.internal.i.h("sessionConfigs");
        throw null;
    }

    public final java.lang.Object c(jd.c r25) {
        throw new UnsupportedOperationException("Method not decompiled: bb.e.c(jd.c):java.lang.Object");
    }
}
