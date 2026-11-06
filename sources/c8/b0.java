package c8;
public abstract class b0 {
    public static void a(int i7, int i10, int i11) {
        if (i7 >= 0 && i10 <= i11) {
            if (i7 <= i10) {
                return;
            }
            throw new IllegalArgumentException(a8.p0.m(i7, i10, "fromIndex: ", " > toIndex: "));
        }
        StringBuilder o4 = jg.g.o("fromIndex: ", i7, ", toIndex: ", i10, ", size: ");
        o4.append(i11);
        throw new IndexOutOfBoundsException(o4.toString());
    }
}
