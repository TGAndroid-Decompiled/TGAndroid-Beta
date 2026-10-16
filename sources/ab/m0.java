package ab;

import java.util.Locale;
import java.util.UUID;
public final class m0 {
    public final u0 f442a;
    public final td.a f443b;
    public final String f444c;
    public int d;
    public d0 e;

    public m0() {
        l0 l0Var = l0.f439a;
        this.f442a = u0.f469a;
        this.f443b = l0Var;
        this.f444c = a();
        this.d = -1;
    }

    public final String a() {
        String uuid = ((UUID) this.f443b.invoke()).toString();
        kotlin.jvm.internal.i.d(uuid, "uuidGenerator().toString()");
        String lowerCase = zd.j.g(uuid, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final d0 b() {
        d0 d0Var = this.e;
        if (d0Var != null) {
            return d0Var;
        }
        kotlin.jvm.internal.i.h("currentSession");
        throw null;
    }
}
