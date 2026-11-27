package defpackage;
public abstract class q6f {
    public static o3f a;

    public static synchronized w5f a(b5f b5fVar) {
        w5f w5fVar;
        synchronized (q6f.class) {
            o3f o3fVar = a;
            if (o3fVar == null) {
                o3fVar = new o3f((byte) 1);
                a = o3fVar;
            }
            w5fVar = (w5f) o3fVar.c(b5fVar);
        }
        return w5fVar;
    }
}
