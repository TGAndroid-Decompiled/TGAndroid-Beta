package a8;
public abstract class ia {
    public static String a(int i7, int i10, String str) {
        if (i7 < 0) {
            return ja.a("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i10 >= 0) {
            return ja.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(jg.g.j(i10, "negative size: "));
    }

    public static void b(int i7, int i10, String str, boolean z9) {
        if (z9) {
            return;
        }
        throw new IllegalArgumentException(ja.a(str, Integer.valueOf(i7), Integer.valueOf(i10)));
    }

    public static void c(int i7, String str, boolean z9) {
        if (z9) {
            return;
        }
        throw new IllegalArgumentException(ja.a(str, Integer.valueOf(i7)));
    }

    public static void d(long j3, String str, boolean z9) {
        if (z9) {
            return;
        }
        throw new IllegalArgumentException(ja.a(str, Long.valueOf(j3)));
    }

    public static void e(String str, boolean z9) {
        if (z9) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(str));
    }

    public static void f(boolean z9) {
        if (z9) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void g(boolean z9, String str, long j3, long j10) {
        if (z9) {
            return;
        }
        throw new IllegalArgumentException(ja.a(str, Long.valueOf(j3), Long.valueOf(j10)));
    }

    public static void h(boolean z9, String str, Object obj) {
        if (z9) {
            return;
        }
        throw new IllegalArgumentException(ja.a(str, obj));
    }

    public static void i(boolean z9, String str, Object obj, Comparable comparable) {
        if (z9) {
            return;
        }
        throw new IllegalArgumentException(ja.a(str, obj, comparable));
    }

    public static void j(int i7, int i10) {
        String a10;
        if (i7 >= 0 && i7 < i10) {
            return;
        }
        if (i7 >= 0) {
            if (i10 >= 0) {
                a10 = ja.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i7), Integer.valueOf(i10));
            } else {
                throw new IllegalArgumentException(jg.g.j(i10, "negative size: "));
            }
        } else {
            a10 = ja.a("%s (%s) must not be negative", "index", Integer.valueOf(i7));
        }
        throw new IndexOutOfBoundsException(a10);
    }

    public static void k(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    public static void l(l2.x0 x0Var) {
        x0Var.getClass();
    }

    public static void m(int i7, int i10) {
        if (i7 >= 0 && i7 <= i10) {
            return;
        }
        throw new IndexOutOfBoundsException(a(i7, i10, "index"));
    }

    public static void n(int i7, int i10, int i11) {
        String a10;
        if (i7 >= 0 && i10 >= i7 && i10 <= i11) {
            return;
        }
        if (i7 >= 0 && i7 <= i11) {
            if (i10 >= 0 && i10 <= i11) {
                a10 = ja.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i7));
            } else {
                a10 = a(i10, i11, "end index");
            }
        } else {
            a10 = a(i7, i11, "start index");
        }
        throw new IndexOutOfBoundsException(a10);
    }

    public static void o(String str, boolean z9) {
        if (z9) {
            return;
        }
        throw new IllegalStateException(String.valueOf(str));
    }

    public static void p(boolean z9) {
        if (z9) {
            return;
        }
        throw new IllegalStateException();
    }
}
