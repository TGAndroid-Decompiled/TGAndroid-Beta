package ha;

import android.util.Base64;
public abstract class s {
    public static final String f10365a;
    public static final String f10366b;

    static {
        byte[] bytes = r.c().getBytes(fd.a.f6039a);
        kotlin.jvm.internal.i.d(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 10);
        f10365a = aa.d.o("firebase_session_", encodeToString, "_data");
        f10366b = aa.d.o("firebase_session_", encodeToString, "_settings");
    }
}
