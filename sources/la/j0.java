package la;

import java.util.Locale;
import java.util.UUID;
public final class j0 {
    public final q0 f11901a;
    public final dd.a f11902b;
    public final String f11903c;
    public int d;
    public a0 e;

    public j0() {
        i0 i0Var = i0.f11897a;
        this.f11901a = q0.f11927a;
        this.f11902b = i0Var;
        this.f11903c = a();
        this.d = -1;
    }

    public final String a() {
        String uuid = ((UUID) this.f11902b.invoke()).toString();
        kotlin.jvm.internal.j.d(uuid, "uuidGenerator().toString()");
        String lowerCase = jd.j.g(uuid, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.j.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final a0 b() {
        a0 a0Var = this.e;
        if (a0Var != null) {
            return a0Var;
        }
        kotlin.jvm.internal.j.h("currentSession");
        throw null;
    }
}
