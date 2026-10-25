package bb;

import java.util.Locale;
import java.util.UUID;
public final class m0 {
    public final t0 f3798a;
    public final ud.a f3799b;
    public final String f3800c;
    public int d;
    public d0 e;

    public m0() {
        l0 l0Var = l0.f3795a;
        this.f3798a = t0.f3821a;
        this.f3799b = l0Var;
        this.f3800c = a();
        this.d = -1;
    }

    public final String a() {
        String uuid = ((UUID) this.f3799b.invoke()).toString();
        kotlin.jvm.internal.i.d(uuid, "uuidGenerator().toString()");
        String lowerCase = ae.k.g(uuid, "-", "").toLowerCase(Locale.ROOT);
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
