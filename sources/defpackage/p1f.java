package defpackage;
public abstract class p1f {
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
            a = s1f.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            a = s1f.a("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(a);
    }

    public static void b(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return;
        }
        k93.i(d(i, i2, "index"));
    }

    public static void c(int i, int i2, int i3) {
        String d;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                d = s1f.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                d = d(i2, i3, "end index");
            }
        } else {
            d = d(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(d);
    }

    public static String d(int i, int i2, String str) {
        if (i < 0) {
            return s1f.a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return s1f.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        w26.j(de9.k(i2, "negative size: "));
        return null;
    }
}
