package i7;
public abstract class o {
    public static void a(int i10, Object[] objArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(j7.l1.k(i11, "at index "));
            }
        }
    }
}
