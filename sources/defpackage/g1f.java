package defpackage;
public abstract class g1f {
    public static z0f a;

    public static synchronized uze a(jye jyeVar) {
        uze uzeVar;
        synchronized (g1f.class) {
            z0f z0fVar = a;
            if (z0fVar == null) {
                z0fVar = new z0f((byte) 0);
                a = z0fVar;
            }
            uzeVar = (uze) z0fVar.c(jyeVar);
        }
        return uzeVar;
    }

    public static void b(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 9);
                sb.append("at index ");
                sb.append(i2);
                throw new NullPointerException(sb.toString());
            }
        }
    }
}
