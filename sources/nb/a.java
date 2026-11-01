package nb;

import v7.b9;
import v7.u8;
import v7.x8;
public final class a {
    public final x8 f13736a;
    public final e f13737b;
    public final jb.d f13738c;

    public a(e eVar, jb.d dVar) {
        String str;
        x8 b10;
        this.f13737b = eVar;
        this.f13738c = dVar;
        if (true != eVar.f13747g) {
            str = "play-services-mlkit-language-id";
        } else {
            str = "language-id";
        }
        synchronized (b9.class) {
            byte b11 = (byte) (((byte) 1) | 2);
            if (b11 == 3) {
                b10 = b9.b(new u8(str));
            } else {
                StringBuilder sb2 = new StringBuilder();
                if ((b11 & 1) == 0) {
                    sb2.append(" enableFirelog");
                }
                if ((b11 & 2) == 0) {
                    sb2.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            }
        }
        this.f13736a = b10;
    }
}
