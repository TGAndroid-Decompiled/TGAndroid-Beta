package f7;
public abstract class p7 {
    public static void a(int i9, int i10) {
        String a2;
        if (i9 >= 0 && i9 < i10) {
            return;
        }
        if (i9 >= 0) {
            if (i10 < 0) {
                throw new IllegalArgumentException(j3.r0.l(i10, "negative size: "));
            }
            a2 = q7.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i9), Integer.valueOf(i10));
        } else {
            a2 = q7.a("%s (%s) must not be negative", "index", Integer.valueOf(i9));
        }
        throw new IndexOutOfBoundsException(a2);
    }

    public static void b(int i9, int i10, int i11) {
        String c10;
        if (i9 >= 0 && i10 >= i9 && i10 <= i11) {
            return;
        }
        if (i9 >= 0 && i9 <= i11) {
            if (i10 >= 0 && i10 <= i11) {
                c10 = q7.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i9));
            } else {
                c10 = c(i10, i11, "end index");
            }
        } else {
            c10 = c(i9, i11, "start index");
        }
        throw new IndexOutOfBoundsException(c10);
    }

    public static String c(int i9, int i10, String str) {
        if (i9 < 0) {
            return q7.a("%s (%s) must not be negative", str, Integer.valueOf(i9));
        }
        if (i10 >= 0) {
            return q7.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i9), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(j3.r0.l(i10, "negative size: "));
    }
}
