package a8;
public abstract class sd {
    public static void a(int i10, int i11, int i12) {
        if (i10 >= 0 && i11 <= i12) {
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException(a1.g.l(i10, i11, "fromIndex: ", " > toIndex: "));
        }
        StringBuilder n10 = c3.h0.n("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
        n10.append(i12);
        throw new IndexOutOfBoundsException(n10.toString());
    }
}
