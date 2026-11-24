package defpackage;
public abstract class agf {
    public static z0f a;

    public static synchronized iff a(lef lefVar) {
        iff iffVar;
        synchronized (agf.class) {
            z0f z0fVar = a;
            if (z0fVar == null) {
                z0fVar = new z0f((byte) 3);
                a = z0fVar;
            }
            iffVar = (iff) z0fVar.c(lefVar);
        }
        return iffVar;
    }
}
