package n7;
public abstract class zf {
    public static h7.r f14839a;

    public static synchronized xf a(tf tfVar) {
        xf xfVar;
        synchronized (zf.class) {
            try {
                if (f14839a == null) {
                    f14839a = new h7.r(4);
                }
                xfVar = (xf) f14839a.F(tfVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xfVar;
    }

    public static synchronized xf b() {
        xf a2;
        synchronized (zf.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 == 3) {
                a2 = a(new Object());
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
        return a2;
    }
}
