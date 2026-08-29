package eb;

import h7.a9;
import h7.e9;
import h7.x8;
public final class a {
    public final a9 f5844a;
    public final e f5845b;
    public final ab.d f5846c;

    public a(e eVar, ab.d dVar) {
        String str;
        a9 a2;
        this.f5845b = eVar;
        this.f5846c = dVar;
        if (true != eVar.f5856g) {
            str = "play-services-mlkit-language-id";
        } else {
            str = "language-id";
        }
        synchronized (e9.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 == 3) {
                a2 = e9.a(new x8(str));
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
        this.f5844a = a2;
    }
}
