package la;

import java.util.Locale;
import java.util.UUID;
public final class j0 {
    public final q0 f11791a;
    public final dd.a f11792b;
    public final String f11793c;
    public int d;
    public a0 e;

    public j0() {
        i0 i0Var = i0.f11787a;
        this.f11791a = q0.f11817a;
        this.f11792b = i0Var;
        this.f11793c = a();
        this.d = -1;
    }

    public final String a() {
        String uuid = ((UUID) this.f11792b.invoke()).toString();
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
