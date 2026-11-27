package defpackage;
public abstract class pif {
    public static o3f a;

    public static synchronized xhf a(ahf ahfVar) {
        xhf xhfVar;
        synchronized (pif.class) {
            o3f o3fVar = a;
            if (o3fVar == null) {
                o3fVar = new o3f((byte) 3);
                a = o3fVar;
            }
            xhfVar = (xhf) o3fVar.c(ahfVar);
        }
        return xhfVar;
    }
}
