package h7;

public abstract class o6 {
    public static void a(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder sbP = com.google.android.recaptcha.internal.a.p("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
            sbP.append(i12);
            throw new IndexOutOfBoundsException(sbP.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(a9.p.j(i10, i11, "fromIndex: ", " > toIndex: "));
        }
    }
}
