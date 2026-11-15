package a8;
public abstract class bb {
    public static ab f346a;

    public static gd.c a(rd.a aVar) {
        gd.d[] dVarArr = gd.d.f13161a;
        gd.j jVar = gd.j.f13172a;
        ?? obj = new Object();
        obj.f13167a = aVar;
        obj.f13168b = jVar;
        return obj;
    }

    public static gd.i b(rd.a initializer) {
        kotlin.jvm.internal.j.e(initializer, "initializer");
        return new gd.i(initializer);
    }

    public static synchronized ua c(na naVar) {
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

    public static synchronized ua d() {
        ua c10;
        synchronized (bb.class) {
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
