package defpackage;
public abstract class yye {
    public static void a(int i, int i2) {
        String a;
        if (i >= 0 && i < i2) {
            return;
        }
        if (i >= 0) {
            if (i2 < 0) {
                w26.j(de9.k(i2, "negative size: "));
                return;
            }
            a = zye.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            a = zye.a("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(a);
    }

    public static void b(int i, int i2, int i3) {
        String c;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                c = zye.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                c = c(i2, i3, "end index");
            }
        } else {
            c = c(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(c);
    }

    public static String c(int i, int i2, String str) {
        if (i < 0) {
            return zye.a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zye.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        w26.j(de9.k(i2, "negative size: "));
        return null;
    }
}
