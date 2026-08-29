package ja;

import android.util.Base64;
public abstract class s {
    public static final String f11400a;
    public static final String f11401b;

    static {
        byte[] bytes = r.c().getBytes(hd.a.f7986a);
        kotlin.jvm.internal.j.d(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 10);
        f11400a = a4.w.n("firebase_session_", encodeToString, "_data");
        f11401b = a4.w.n("firebase_session_", encodeToString, "_settings");
    }
}
