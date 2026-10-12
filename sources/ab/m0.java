package ab;

import java.util.Locale;
import java.util.UUID;
public final class m0 {
    public final u0 f438a;
    public final td.a f439b;
    public final String f440c;
    public int d;
    public d0 e;

    public m0() {
        l0 l0Var = l0.f435a;
        this.f438a = u0.f465a;
        this.f439b = l0Var;
        this.f440c = a();
        this.d = -1;
    }

    public final String a() {
        String uuid = ((UUID) this.f439b.invoke()).toString();
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
