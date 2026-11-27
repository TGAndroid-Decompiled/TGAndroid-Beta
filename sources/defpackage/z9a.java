package defpackage;

import java.util.Locale;
import java.util.UUID;
public final class z9a {
    public final srb a;
    public final vcc b;

    public z9a(srb srbVar, vcc vccVar) {
        srbVar.getClass();
        vccVar.getClass();
        this.a = srbVar;
        this.b = vccVar;
    }

    public final s9a a(s9a s9aVar) {
        String str;
        int i;
        String str2;
        this.b.getClass();
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        String uuid = randomUUID.toString();
        uuid.getClass();
        String lowerCase = ldb.c(uuid, "-", "").toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (s9aVar != null && (str2 = s9aVar.b) != null) {
            str = str2;
        } else {
            str = lowerCase;
        }
        if (s9aVar != null) {
            i = s9aVar.c + 1;
        } else {
            i = 0;
        }
        int i2 = i;
        this.a.getClass();
        return new s9a(srb.a().b, lowerCase, str, i2);
    }
}
