package db;

import g7.b9;
import g7.f9;
import g7.y8;

public final class a {

    public final b9 f4876a;

    public final e f4877b;

    public final za.d f4878c;

    public a(e eVar, za.d dVar) {
        b9 b9VarA;
        this.f4877b = eVar;
        this.f4878c = dVar;
        String str = true != eVar.f4888g ? "play-services-mlkit-language-id" : "language-id";
        synchronized (f9.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            try {
                if (b10 != 3) {
                    StringBuilder sb2 = new StringBuilder();
                    if ((b10 & 1) == 0) {
                        sb2.append(" enableFirelog");
                    }
                    if ((b10 & 2) == 0) {
                        sb2.append(" firelogEventType");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
                }
                b9VarA = f9.a(new y8(str));
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f4876a = b9VarA;
    }
}
