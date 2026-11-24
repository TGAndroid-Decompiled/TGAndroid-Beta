package defpackage;
public abstract class fm5 {
    public static int b(int i, int i2) {
        if (i2 >= 0) {
            if (i2 <= i) {
                return i;
            }
            int i3 = i + (i >> 1) + 1;
            if (i3 < i2) {
                i3 = Integer.highestOneBit(i2 - 1) << 1;
            }
            if (i3 < 0) {
                return Integer.MAX_VALUE;
            }
            return i3;
        }
        w26.j("cannot store more than MAX_VALUE elements");
        return 0;
    }

    public abstract fm5 a(Object obj);
}
