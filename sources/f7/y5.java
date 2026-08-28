package f7;
public abstract class y5 {
    public static void a(int i9, Object[] objArr) {
        for (int i10 = 0; i10 < i9; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(j3.r0.l(i10, "at index "));
            }
        }
    }
}
