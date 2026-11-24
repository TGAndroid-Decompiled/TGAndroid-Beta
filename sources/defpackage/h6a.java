package defpackage;

import java.util.Locale;
import java.util.UUID;
public final class h6a {
    public final snb a;
    public final v8c b;

    public h6a(snb snbVar, v8c v8cVar) {
        snbVar.getClass();
        v8cVar.getClass();
        this.a = snbVar;
        this.b = v8cVar;
    }

    public final a6a a(a6a a6aVar) {
        String str;
        int i;
        String str2;
        this.b.getClass();
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        String uuid = randomUUID.toString();
        uuid.getClass();
        String lowerCase = n9b.c(uuid, "-", "").toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (a6aVar != null && (str2 = a6aVar.b) != null) {
            str = str2;
        } else {
            str = lowerCase;
        }
        if (a6aVar != null) {
            i = a6aVar.c + 1;
        } else {
            i = 0;
        }
        int i2 = i;
        this.a.getClass();
        return new a6a(snb.a().b, lowerCase, str, i2);
    }
}
