package a8;

import java.io.Serializable;
public abstract class bb {
    public static ab f346a;

    public static g9.t a(g9.t tVar) {
        if (!(tVar instanceof g9.v)) {
            if (tVar instanceof g9.u) {
                return tVar;
            }
            if (tVar instanceof Serializable) {
                return new g9.u(tVar);
            }
            return new g9.v(tVar);
        }
        return tVar;
    }

    public static synchronized ua b(na naVar) {
        ua uaVar;
        synchronized (bb.class) {
            try {
                if (f346a == null) {
                    f346a = new ab(0);
                }
                uaVar = (ua) f346a.R0(naVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uaVar;
    }

    public static synchronized ua c() {
        ua b10;
        synchronized (bb.class) {
            byte b11 = (byte) (((byte) 1) | 2);
            if (b11 == 3) {
                b10 = b(new Object());
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
        return b10;
    }
}
