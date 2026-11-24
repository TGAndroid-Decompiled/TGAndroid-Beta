package defpackage;
public abstract class c3f {
    public static int a(okd okdVar) {
        int i;
        int i2 = 0;
        for (Object obj : okdVar) {
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
