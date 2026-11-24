package defpackage;
public abstract class a1f {
    public static int a(mid midVar) {
        int i;
        int i2 = 0;
        for (Object obj : midVar) {
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }
}
