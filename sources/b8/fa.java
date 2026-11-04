package b8;
public abstract class fa {
    public static int a(int i3, int i10) {
        if (i10 >= 0) {
            int i11 = i3 + (i3 >> 1) + 1;
            if (i11 < i10) {
                int highestOneBit = Integer.highestOneBit(i10 - 1);
                i11 = highestOneBit + highestOneBit;
            }
            if (i11 < 0) {
                return Integer.MAX_VALUE;
            }
            return i11;
        }
        throw new AssertionError("cannot store more than MAX_VALUE elements");
    }
}
