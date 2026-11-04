package b8;
public abstract class oa {
    public static void a(int i3, Object[] objArr) {
        for (int i10 = 0; i10 < i3; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(k2.p1.i(i10, "at index "));
            }
        }
    }
}
