package b8;
public abstract class rb {
    public static void a(int i3, int i10, int i11) {
        if (i3 >= 0 && i10 <= i11) {
            if (i3 <= i10) {
                return;
            }
            throw new IllegalArgumentException(a1.g.n(i3, i10, "fromIndex: ", " > toIndex: "));
        }
        StringBuilder m10 = com.google.android.recaptcha.internal.a.m("fromIndex: ", i3, ", toIndex: ", i10, ", size: ");
        m10.append(i11);
        throw new IndexOutOfBoundsException(m10.toString());
    }
}
