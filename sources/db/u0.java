package db;

import java.util.Locale;
import java.util.UUID;
public final class u0 {
    public final i1 f8735a;
    public final j1 f8736b;

    public u0(i1 timeProvider, j1 uuidGenerator) {
        kotlin.jvm.internal.j.e(timeProvider, "timeProvider");
        kotlin.jvm.internal.j.e(uuidGenerator, "uuidGenerator");
        this.f8735a = timeProvider;
        this.f8736b = uuidGenerator;
    }

    public final n0 a(n0 n0Var) {
        String str;
        int i3;
        String str2;
        this.f8736b.getClass();
        UUID randomUUID = UUID.randomUUID();
        kotlin.jvm.internal.j.d(randomUUID, "randomUUID(...)");
        String uuid = randomUUID.toString();
        kotlin.jvm.internal.j.d(uuid, "toString(...)");
        String lowerCase = ud.l.c(uuid, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.j.d(lowerCase, "toLowerCase(...)");
        if (n0Var != null && (str2 = n0Var.f8707b) != null) {
            str = str2;
        } else {
            str = lowerCase;
        }
        if (n0Var != null) {
            i3 = n0Var.f8708c + 1;
        } else {
            i3 = 0;
        }
        return new n0(i3, this.f8735a.a().f8670b, lowerCase, str);
    }
}
