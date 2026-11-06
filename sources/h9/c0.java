package h9;
public abstract class c0 {
    public static int b(int i7, int i10) {
        if (i10 >= 0) {
            if (i10 <= i7) {
                return i7;
            }
            int i11 = i7 + (i7 >> 1) + 1;
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
