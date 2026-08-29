package l7;
public abstract class yf {
    public static f7.s f15079a;

    public static synchronized wf a(sf sfVar) {
        wf wfVar;
        synchronized (yf.class) {
            try {
                if (f15079a == null) {
                    f15079a = new f7.s(4);
                }
                wfVar = (wf) f15079a.G(sfVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wfVar;
    }

    public static synchronized wf b() {
        wf a2;
        synchronized (yf.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 == 3) {
                a2 = a(new Object());
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
        return a2;
    }
}
