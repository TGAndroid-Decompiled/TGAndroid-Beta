package defpackage;
public abstract class bhf {
    public static z0f a;

    public static synchronized tgf a(hgf hgfVar) {
        tgf tgfVar;
        synchronized (bhf.class) {
            z0f z0fVar = a;
            if (z0fVar == null) {
                z0fVar = new z0f((byte) 4);
                a = z0fVar;
            }
            tgfVar = (tgf) z0fVar.c(hgfVar);
        }
        return tgfVar;
    }

    public static synchronized tgf b() {
        tgf a2;
        synchronized (bhf.class) {
            a2 = a(new Object());
        }
        return a2;
    }
}
