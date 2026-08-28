package g7;
public abstract class m6 {
    public static void a(int i9, int i10, int i11) {
        if (i9 >= 0 && i10 <= i11) {
            if (i9 <= i10) {
                return;
            }
            throw new IllegalArgumentException(aa.d.k(i9, i10, "fromIndex: ", " > toIndex: "));
        }
        StringBuilder o6 = e2.c.o("fromIndex: ", i9, ", toIndex: ", i10, ", size: ");
        o6.append(i11);
        throw new IndexOutOfBoundsException(o6.toString());
    }
}
