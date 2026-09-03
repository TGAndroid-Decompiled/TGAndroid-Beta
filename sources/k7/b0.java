package k7;
public abstract class b0 {
    public static void a(int i10, Object[] objArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(kf.k0.j(i11, "at index "));
            }
        }
    }
}
