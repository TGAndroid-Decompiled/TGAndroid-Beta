package a8;
public abstract class ra {
    public static void a(int i10, Object[] objArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(ic.a.i(i11, "at index "));
            }
        }
    }
}
