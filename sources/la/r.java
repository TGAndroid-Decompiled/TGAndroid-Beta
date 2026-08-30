package la;

import android.util.Base64;
public abstract class r {
    public static final String f11818a;
    public static final String f11819b;

    static {
        byte[] bytes = q.c().getBytes(jd.a.f9359a);
        kotlin.jvm.internal.j.d(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 10);
        f11818a = android.support.v4.media.a.o("firebase_session_", encodeToString, "_data");
        f11819b = android.support.v4.media.a.o("firebase_session_", encodeToString, "_settings");
    }
}
