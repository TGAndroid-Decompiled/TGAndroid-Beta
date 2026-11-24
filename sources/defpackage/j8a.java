package defpackage;

import java.util.Locale;
import java.util.UUID;
public final class j8a {
    public final tpb a;
    public final wac b;

    public j8a(tpb tpbVar, wac wacVar) {
        tpbVar.getClass();
        wacVar.getClass();
        this.a = tpbVar;
        this.b = wacVar;
    }

    public final c8a a(c8a c8aVar) {
        String str;
        int i;
        String str2;
        this.b.getClass();
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        String uuid = randomUUID.toString();
        uuid.getClass();
        String lowerCase = pbb.c(uuid, "-", "").toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (c8aVar != null && (str2 = c8aVar.b) != null) {
            str = str2;
        } else {
            str = lowerCase;
        }
        if (c8aVar != null) {
            i = c8aVar.c + 1;
        } else {
            i = 0;
        }
        int i2 = i;
        this.a.getClass();
        return new c8a(tpb.a().b, lowerCase, str, i2);
    }
}
