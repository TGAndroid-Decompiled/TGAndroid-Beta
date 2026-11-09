package c8;
public abstract class wf {
    public static a8.za f5925a;

    public static synchronized uf a(qf qfVar) {
        uf ufVar;
        synchronized (wf.class) {
            try {
                if (f5925a == null) {
                    f5925a = new a8.za(1);
                }
                ufVar = (uf) f5925a.R0(qfVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ufVar;
    }

    public static synchronized uf b() {
        uf a10;
        synchronized (wf.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 == 3) {
                a10 = a(new Object());
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
        return a10;
    }
}
