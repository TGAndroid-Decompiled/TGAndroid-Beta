package defpackage;
public abstract class wj {
    public static final Class a;
    public static final boolean b;

    static {
        Class<?> cls;
        boolean z;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        if (cls2 != null) {
            z = true;
        } else {
            z = false;
        }
        b = z;
    }

    public static boolean a() {
        if (a != null && !b) {
            return true;
        }
        return false;
    }
}
