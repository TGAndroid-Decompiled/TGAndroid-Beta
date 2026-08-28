package cb;

import f7.c9;
import f7.g9;
import f7.z8;
public final class a {
    public final c9 f2332a;
    public final e f2333b;
    public final ya.d f2334c;

    public a(e eVar, ya.d dVar) {
        String str;
        c9 a2;
        this.f2333b = eVar;
        this.f2334c = dVar;
        if (true != eVar.f2344g) {
            str = "play-services-mlkit-language-id";
        } else {
            str = "language-id";
        }
        synchronized (g9.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 == 3) {
                a2 = g9.a(new z8(str));
            } else {
                StringBuilder sb2 = new StringBuilder();
                if ((b10 & 1) == 0) {
                    sb2.append(" enableFirelog");
                }
                if ((b10 & 2) == 0) {
                    sb2.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            }
        }
        this.f2332a = a2;
    }
}
