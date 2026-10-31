package bb;

import java.util.Locale;
import java.util.UUID;
public final class m0 {
    public final t0 f2599a;
    public final ld.a f2600b;
    public final String f2601c;
    public int d;
    public d0 e;

    public m0() {
        l0 l0Var = l0.f2596a;
        this.f2599a = t0.f2622a;
        this.f2600b = l0Var;
        this.f2601c = a();
        this.d = -1;
    }

    public final String a() {
        String uuid = ((UUID) this.f2600b.invoke()).toString();
        kotlin.jvm.internal.i.d(uuid, "uuidGenerator().toString()");
        String lowerCase = rd.j.g(uuid, "-", "").toLowerCase(Locale.ROOT);
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
