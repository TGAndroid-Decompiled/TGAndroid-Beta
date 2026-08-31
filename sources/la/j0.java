package la;

import java.util.Locale;
import java.util.UUID;
public final class j0 {
    public final q0 f12206a;
    public final dd.a f12207b;
    public final String f12208c;
    public int d;
    public a0 f12209e;

    public j0() {
        i0 i0Var = i0.f12202a;
        this.f12206a = q0.f12234a;
        this.f12207b = i0Var;
        this.f12208c = a();
        this.d = -1;
    }

    public final String a() {
        String uuid = ((UUID) this.f12207b.invoke()).toString();
        kotlin.jvm.internal.j.d(uuid, "uuidGenerator().toString()");
        String lowerCase = jd.j.g(uuid, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.j.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final a0 b() {
        a0 a0Var = this.f12209e;
        if (a0Var != null) {
            return a0Var;
        }
        kotlin.jvm.internal.j.h("currentSession");
        throw null;
    }
}
