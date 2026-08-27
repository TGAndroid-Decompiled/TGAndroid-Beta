package ia;

import java.util.Locale;
import java.util.UUID;

public final class n0 {

    public final u0 f11057a;

    public final ad.a f11058b;

    public final String f11059c;
    public int d;

    public e0 f11060e;

    public n0() {
        m0 m0Var = m0.f11054a;
        this.f11057a = u0.f11082a;
        this.f11058b = m0Var;
        this.f11059c = a();
        this.d = -1;
    }

    public final String a() {
        String string = ((UUID) this.f11058b.invoke()).toString();
        kotlin.jvm.internal.j.d(string, "uuidGenerator().toString()");
        String lowerCase = gd.j.g(string, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.j.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final e0 b() {
        e0 e0Var = this.f11060e;
        if (e0Var != null) {
            return e0Var;
        }
        kotlin.jvm.internal.j.h("currentSession");
        throw null;
    }
}
