package ha;

import java.util.Locale;
import java.util.UUID;
public final class m0 {
    public final t0 f10345a;
    public final zc.a f10346b;
    public final String f10347c;
    public int d;
    public d0 f10348e;

    public m0() {
        l0 l0Var = l0.f10342a;
        this.f10345a = t0.f10370a;
        this.f10346b = l0Var;
        this.f10347c = a();
        this.d = -1;
    }

    public final String a() {
        String uuid = ((UUID) this.f10346b.invoke()).toString();
        kotlin.jvm.internal.i.d(uuid, "uuidGenerator().toString()");
        String lowerCase = fd.j.g(uuid, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final d0 b() {
        d0 d0Var = this.f10348e;
        if (d0Var != null) {
            return d0Var;
        }
        kotlin.jvm.internal.i.h("currentSession");
        throw null;
    }
}
