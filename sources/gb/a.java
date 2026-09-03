package gb;

import j7.c9;
import j7.g9;
import j7.z8;
public final class a {
    public final c9 f6490a;
    public final e f6491b;
    public final cb.d f6492c;

    public a(e eVar, cb.d dVar) {
        String str;
        c9 b10;
        this.f6491b = eVar;
        this.f6492c = dVar;
        if (true != eVar.f6501g) {
            str = "play-services-mlkit-language-id";
        } else {
            str = "language-id";
        }
        synchronized (g9.class) {
            byte b11 = (byte) (((byte) 1) | 2);
            if (b11 == 3) {
                b10 = g9.b(new z8(str));
            } else {
                StringBuilder sb = new StringBuilder();
                if ((b11 & 1) == 0) {
                    sb.append(" enableFirelog");
                }
                if ((b11 & 2) == 0) {
                    sb.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
        }
        this.f6490a = b10;
    }
}
