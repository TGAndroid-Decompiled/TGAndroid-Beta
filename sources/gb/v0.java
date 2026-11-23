package gb;

import java.util.Locale;
import java.util.UUID;
public final class v0 {
    public final i1 f13418a;
    public final j1 f13419b;

    public v0(i1 timeProvider, j1 uuidGenerator) {
        kotlin.jvm.internal.j.e(timeProvider, "timeProvider");
        kotlin.jvm.internal.j.e(uuidGenerator, "uuidGenerator");
        this.f13418a = timeProvider;
        this.f13419b = uuidGenerator;
    }

    public final o0 a(o0 o0Var) {
        String str;
        int i7;
        String str2;
        this.f13419b.getClass();
        UUID randomUUID = UUID.randomUUID();
        kotlin.jvm.internal.j.d(randomUUID, "randomUUID(...)");
        String uuid = randomUUID.toString();
        kotlin.jvm.internal.j.d(uuid, "toString(...)");
        String lowerCase = xd.l.c(uuid, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.j.d(lowerCase, "toLowerCase(...)");
        if (o0Var != null && (str2 = o0Var.f13386b) != null) {
            str = str2;
        } else {
            str = lowerCase;
        }
        if (o0Var != null) {
            i7 = o0Var.f13387c + 1;
        } else {
            i7 = 0;
        }
        return new o0(this.f13418a.a().f13347b, lowerCase, str, i7);
    }
}
