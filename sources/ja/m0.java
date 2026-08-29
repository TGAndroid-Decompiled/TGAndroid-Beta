package ja;

import java.util.Locale;
import java.util.UUID;
public final class m0 {
    public final t0 f11380a;
    public final bd.a f11381b;
    public final String f11382c;
    public int d;
    public d0 f11383e;

    public m0() {
        l0 l0Var = l0.f11377a;
        this.f11380a = t0.f11405a;
        this.f11381b = l0Var;
        this.f11382c = a();
        this.d = -1;
    }

    public final String a() {
        String uuid = ((UUID) this.f11381b.invoke()).toString();
        kotlin.jvm.internal.j.d(uuid, "uuidGenerator().toString()");
        String lowerCase = hd.j.g(uuid, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.j.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final d0 b() {
        d0 d0Var = this.f11383e;
        if (d0Var != null) {
            return d0Var;
        }
        kotlin.jvm.internal.j.h("currentSession");
        throw null;
    }
}
