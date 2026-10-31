package nb;

import v7.b9;
import v7.u8;
import v7.x8;
public final class a {
    public final x8 f13735a;
    public final e f13736b;
    public final jb.d f13737c;

    public a(e eVar, jb.d dVar) {
        String str;
        x8 b10;
        this.f13736b = eVar;
        this.f13737c = dVar;
        if (true != eVar.f13746g) {
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
        this.f13735a = b10;
    }
}
