package i7;
public abstract class p6 {
    public static String a(int i10, int i11, String str) {
        if (i10 < 0) {
            return q6.a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return q6.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i11);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static void b(int i10, int i11) {
        String a2;
        if (i10 >= 0 && i10 < i11) {
            return;
        }
        if (i10 >= 0) {
            if (i11 >= 0) {
                a2 = q6.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            } else {
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("negative size: ");
                sb2.append(i11);
                throw new IllegalArgumentException(sb2.toString());
            }
        } else {
            a2 = q6.a("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(a2);
    }

    public static void c(int i10, int i11) {
        if (i10 >= 0 && i10 <= i11) {
            return;
        }
        throw new IndexOutOfBoundsException(a(i10, i11, "index"));
    }

    public static void d(int i10, int i11, int i12) {
        String a2;
        if (i10 >= 0 && i11 >= i10 && i11 <= i12) {
            return;
        }
        if (i10 >= 0 && i10 <= i12) {
            if (i11 >= 0 && i11 <= i12) {
                a2 = q6.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            } else {
                a2 = a(i11, i12, "end index");
            }
        } else {
            a2 = a(i10, i12, "start index");
        }
        throw new IndexOutOfBoundsException(a2);
    }
}
