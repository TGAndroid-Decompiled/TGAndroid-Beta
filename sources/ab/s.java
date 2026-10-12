package ab;

import android.util.Base64;
public abstract class s {
    public static final String f457a;
    public static final String f458b;

    static {
        byte[] bytes = r.c().getBytes(zd.a.f50124a);
        kotlin.jvm.internal.i.d(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 10);
        f457a = a1.g.p("firebase_session_", encodeToString, "_data");
        f458b = a1.g.p("firebase_session_", encodeToString, "_settings");
    }
}
