package k7;
public abstract class h {
    public static void a(int i10, Object[] objArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(l.d.j(i11, "at index "));
            }
        }
    }
}
