package defpackage;
public abstract class t5f {
    public static int a(dnd dndVar) {
        int i;
        int i2 = 0;
        for (Object obj : dndVar) {
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
