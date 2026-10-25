package bb;

import android.util.Base64;
public abstract class s {
    public static final String f3816a;
    public static final String f3817b;

    static {
        byte[] bytes = r.c().getBytes(ae.a.f1238a);
        kotlin.jvm.internal.i.d(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 10);
        f3816a = a1.g.p("firebase_session_", encodeToString, "_data");
        f3817b = a1.g.p("firebase_session_", encodeToString, "_settings");
    }
}
