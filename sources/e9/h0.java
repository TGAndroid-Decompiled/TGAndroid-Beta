package e9;
public abstract class h0 {
    public static int b(int i10, int i11) {
        if (i11 >= 0) {
            if (i11 <= i10) {
                return i10;
            }
            int i12 = i10 + (i10 >> 1) + 1;
            if (i12 < i11) {
                i12 = Integer.highestOneBit(i11 - 1) << 1;
            }
            if (i12 < 0) {
                return Integer.MAX_VALUE;
            }
            return i12;
        }
        throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
    }

    public abstract h0 a(Object obj);
}
