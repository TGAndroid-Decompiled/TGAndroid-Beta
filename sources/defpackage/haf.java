package defpackage;

import com.google.android.recaptcha.internal.zzsw;
public final class haf {
    public static void a() {
        throw new zzsw("Protocol message tag had invalid wire type.");
    }

    public static void b(int i, int i2) {
        throw new IllegalArgumentException("Length too large: " + i + i2);
    }

    public static void c(int i, int i2, Object obj) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(obj);
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void d(long j) {
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + j);
    }

    public static void e(int i, int i2) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + i2);
    }
}
