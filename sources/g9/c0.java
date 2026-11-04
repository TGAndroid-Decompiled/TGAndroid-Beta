package g9;
public abstract class c0 {
    public static int b(int i3, int i10) {
        if (i10 >= 0) {
            if (i10 <= i3) {
                return i3;
            }
            int i11 = i3 + (i3 >> 1) + 1;
            if (i11 < i10) {
                i11 = Integer.highestOneBit(i10 - 1) << 1;
            }
            if (i11 < 0) {
                return Integer.MAX_VALUE;
            }
            return i11;
        }
        throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
    }

    public abstract c0 a(Object obj);
}
