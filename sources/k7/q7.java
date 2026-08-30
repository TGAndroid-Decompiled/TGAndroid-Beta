package k7;
public abstract class q7 {
    public static void a(int i10, int i11, int i12) {
        if (i10 >= 0 && i11 <= i12) {
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException(android.support.v4.media.a.k(i10, i11, "fromIndex: ", " > toIndex: "));
        }
        StringBuilder m9 = e2.c.m("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
        m9.append(i12);
        throw new IndexOutOfBoundsException(m9.toString());
    }
}
