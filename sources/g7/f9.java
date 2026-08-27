package g7;

public abstract class f9 {

    public static e7.s f6482a;

    public static synchronized b9 a(y8 y8Var) {
        try {
            if (f6482a == null) {
                f6482a = new e7.s(1);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (b9) f6482a.G(y8Var);
    }

    public static void b(int i10, int i11) {
        String strA;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strA = h7.g.a("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(i0.a.k(i11, "negative size: "));
                }
                strA = h7.g.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strA);
        }
    }

    public static void c(int i10, int i11, int i12) {
        String strD;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strD = d(i10, i12, "start index");
            } else {
                strD = (i11 < 0 || i11 > i12) ? d(i11, i12, "end index") : h7.g.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strD);
        }
    }

    public static String d(int i10, int i11, String str) {
        if (i10 < 0) {
            return h7.g.a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return h7.g.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(i0.a.k(i11, "negative size: "));
    }
}
