package gb;

import java.util.Locale;
import java.util.UUID;
public final class u0 {
    public final h1 f13422a;
    public final i1 f13423b;

    public u0(h1 timeProvider, i1 uuidGenerator) {
        kotlin.jvm.internal.j.e(timeProvider, "timeProvider");
        kotlin.jvm.internal.j.e(uuidGenerator, "uuidGenerator");
        this.f13422a = timeProvider;
        this.f13423b = uuidGenerator;
    }

    public final n0 a(n0 n0Var) {
        String str;
        int i7;
        String str2;
        this.f13423b.getClass();
        UUID randomUUID = UUID.randomUUID();
        kotlin.jvm.internal.j.d(randomUUID, "randomUUID(...)");
        String uuid = randomUUID.toString();
        kotlin.jvm.internal.j.d(uuid, "toString(...)");
        String lowerCase = xd.l.c(uuid, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.j.d(lowerCase, "toLowerCase(...)");
        if (n0Var != null && (str2 = n0Var.f13391b) != null) {
            str = str2;
        } else {
            str = lowerCase;
        }
        if (n0Var != null) {
            i7 = n0Var.f13392c + 1;
        } else {
            i7 = 0;
        }
        return new n0(this.f13422a.a().f13347b, lowerCase, str, i7);
    }
}
