package ab;

import android.util.Base64;
public abstract class s {
    public static final String f459a;
    public static final String f460b;

    static {
        byte[] bytes = r.c().getBytes(zd.a.f51979a);
        kotlin.jvm.internal.i.d(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 10);
        f459a = a1.g.p("firebase_session_", encodeToString, "_data");
        f460b = a1.g.p("firebase_session_", encodeToString, "_settings");
    }
}
