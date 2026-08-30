package k7;
public abstract class e0 {
    public static void a(int i10, int i11) {
        String a2;
        if (i10 >= 0 && i10 < i11) {
            return;
        }
        if (i10 >= 0) {
            if (i11 < 0) {
                throw new IllegalArgumentException(kh.a2.j(i11, "negative size: "));
            }
            a2 = f0.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        } else {
            a2 = f0.a("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(a2);
    }

    public static void b(int i10, int i11, int i12) {
        String c3;
        if (i10 >= 0 && i11 >= i10 && i11 <= i12) {
            return;
        }
        if (i10 >= 0 && i10 <= i12) {
            if (i11 >= 0 && i11 <= i12) {
                c3 = f0.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            } else {
                c3 = c(i11, i12, "end index");
            }
        } else {
            c3 = c(i10, i12, "start index");
        }
        throw new IndexOutOfBoundsException(c3);
    }

    public static String c(int i10, int i11, String str) {
        if (i10 < 0) {
            return f0.a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return f0.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(kh.a2.j(i11, "negative size: "));
    }
}
