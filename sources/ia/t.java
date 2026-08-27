package ia;

import android.util.Base64;

public abstract class t {

    public static final String f11077a;

    public static final String f11078b;

    static {
        byte[] bytes = s.c().getBytes(gd.a.f6839a);
        kotlin.jvm.internal.j.d(bytes, "getBytes(...)");
        String strEncodeToString = Base64.encodeToString(bytes, 10);
        f11077a = a9.p.m("firebase_session_", strEncodeToString, "_data");
        f11078b = a9.p.m("firebase_session_", strEncodeToString, "_settings");
    }
}
