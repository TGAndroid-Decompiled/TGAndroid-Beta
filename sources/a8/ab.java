package a8;
public abstract class ab {
    public static za f324a;

    public static gd.c a(rd.a aVar) {
        gd.d[] dVarArr = gd.d.f13819a;
        gd.j jVar = gd.j.f13830a;
        ?? obj = new Object();
        obj.f13825a = aVar;
        obj.f13826b = jVar;
        return obj;
    }

    public static gd.i b(rd.a initializer) {
        kotlin.jvm.internal.j.e(initializer, "initializer");
        return new gd.i(initializer);
    }

    public static synchronized ta c(ma maVar) {
        ta taVar;
        synchronized (ab.class) {
            try {
                if (f324a == null) {
                    f324a = new za(0);
                }
                taVar = (ta) f324a.R0(maVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return taVar;
    }

    public static synchronized ta d() {
        ta c10;
        synchronized (ab.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 == 3) {
                c10 = c(new Object());
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
        return c10;
    }
}
