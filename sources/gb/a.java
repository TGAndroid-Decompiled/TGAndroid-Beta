package gb;

import j7.c9;
import j7.g9;
import j7.z8;
public final class a {
    public final c9 f6984a;
    public final e f6985b;
    public final cb.d f6986c;

    public a(e eVar, cb.d dVar) {
        String str;
        c9 a2;
        this.f6985b = eVar;
        this.f6986c = dVar;
        if (true != eVar.f6996g) {
            str = "play-services-mlkit-language-id";
        } else {
            str = "language-id";
        }
        synchronized (g9.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 == 3) {
                a2 = g9.a(new z8(str));
            } else {
                StringBuilder sb = new StringBuilder();
                if ((b10 & 1) == 0) {
                    sb.append(" enableFirelog");
                }
                if ((b10 & 2) == 0) {
                    sb.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
        }
        this.f6984a = a2;
    }
}
