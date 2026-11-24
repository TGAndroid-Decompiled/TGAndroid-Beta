package defpackage;
public abstract class aff {
    public static xye a;

    public static synchronized sef a(gef gefVar) {
        sef sefVar;
        synchronized (aff.class) {
            xye xyeVar = a;
            if (xyeVar == null) {
                xyeVar = new xye((byte) 4);
                a = xyeVar;
            }
            sefVar = (sef) xyeVar.c(gefVar);
        }
        return sefVar;
    }

    public static synchronized sef b() {
        sef a2;
        synchronized (aff.class) {
            a2 = a(new Object());
        }
        return a2;
    }
}
