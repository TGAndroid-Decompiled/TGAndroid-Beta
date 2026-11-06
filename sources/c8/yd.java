package c8;
public abstract class yd {
    public static void a(int i7, int i10) {
        String a10;
        if (i7 >= 0 && i7 < i10) {
            return;
        }
        if (i7 >= 0) {
            if (i10 < 0) {
                throw new IllegalArgumentException(jg.g.j(i10, "negative size: "));
            }
            a10 = zd.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i7), Integer.valueOf(i10));
        } else {
            a10 = zd.a("%s (%s) must not be negative", "index", Integer.valueOf(i7));
        }
        throw new IndexOutOfBoundsException(a10);
    }

    public static void b(int i7, int i10, int i11) {
        String c10;
        if (i7 >= 0 && i10 >= i7 && i10 <= i11) {
            return;
        }
        if (i7 >= 0 && i7 <= i11) {
            if (i10 >= 0 && i10 <= i11) {
                c10 = zd.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i7));
            } else {
                c10 = c(i10, i11, "end index");
            }
        } else {
            c10 = c(i7, i11, "start index");
        }
        throw new IndexOutOfBoundsException(c10);
    }

    public static String c(int i7, int i10, String str) {
        if (i7 < 0) {
            return zd.a("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i10 >= 0) {
            return zd.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(jg.g.j(i10, "negative size: "));
    }
}
