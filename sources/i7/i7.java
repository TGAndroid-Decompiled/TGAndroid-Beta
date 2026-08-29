package i7;
public abstract class i7 {
    public static void a(int i10, int i11, int i12) {
        if (i10 >= 0 && i11 <= i12) {
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException(a4.w.k(i10, i11, "fromIndex: ", " > toIndex: "));
        }
        StringBuilder o10 = com.google.android.recaptcha.internal.a.o("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
        o10.append(i12);
        throw new IndexOutOfBoundsException(o10.toString());
    }
}
