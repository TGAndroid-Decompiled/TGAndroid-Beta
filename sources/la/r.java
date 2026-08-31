package la;

import android.util.Base64;
public abstract class r {
    public static final String f12235a;
    public static final String f12236b;

    static {
        byte[] bytes = q.c().getBytes(jd.a.f9993a);
        kotlin.jvm.internal.j.d(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 10);
        f12235a = android.support.v4.media.a.o("firebase_session_", encodeToString, "_data");
        f12236b = android.support.v4.media.a.o("firebase_session_", encodeToString, "_settings");
    }
}
