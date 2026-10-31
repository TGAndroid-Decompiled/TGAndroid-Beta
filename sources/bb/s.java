package bb;

import android.util.Base64;
public abstract class s {
    public static final String f2617a;
    public static final String f2618b;

    static {
        byte[] bytes = r.c().getBytes(rd.a.f46479a);
        kotlin.jvm.internal.i.d(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 10);
        f2617a = a1.g.n("firebase_session_", encodeToString, "_data");
        f2618b = a1.g.n("firebase_session_", encodeToString, "_settings");
    }
}
