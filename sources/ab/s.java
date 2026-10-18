package ab;

import android.util.Base64;
public abstract class s {
    public static final String f460a;
    public static final String f461b;

    static {
        byte[] bytes = r.c().getBytes(zd.a.f51555a);
        kotlin.jvm.internal.i.d(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 10);
        f460a = a1.g.p("firebase_session_", encodeToString, "_data");
        f461b = a1.g.p("firebase_session_", encodeToString, "_settings");
    }
}
