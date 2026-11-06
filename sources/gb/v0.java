package gb;

import java.util.Locale;
import java.util.UUID;
public final class v0 {
    public final j1 f13765a;
    public final k1 f13766b;

    public v0(j1 timeProvider, k1 uuidGenerator) {
        kotlin.jvm.internal.j.e(timeProvider, "timeProvider");
        kotlin.jvm.internal.j.e(uuidGenerator, "uuidGenerator");
        this.f13765a = timeProvider;
        this.f13766b = uuidGenerator;
    }

    public final o0 a(o0 o0Var) {
        String str;
        int i7;
        String str2;
        this.f13766b.getClass();
        UUID randomUUID = UUID.randomUUID();
        kotlin.jvm.internal.j.d(randomUUID, "randomUUID(...)");
        String uuid = randomUUID.toString();
        kotlin.jvm.internal.j.d(uuid, "toString(...)");
        String lowerCase = xd.l.c(uuid, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.j.d(lowerCase, "toLowerCase(...)");
        if (o0Var != null && (str2 = o0Var.f13737b) != null) {
            str = str2;
        } else {
            str = lowerCase;
        }
        if (o0Var != null) {
            i7 = o0Var.f13738c + 1;
        } else {
            i7 = 0;
        }
        return new o0(i7, this.f13765a.a().f13712b, lowerCase, str);
    }
}
