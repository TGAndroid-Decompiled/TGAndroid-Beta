package org.telegram.messenger.voip;

import android.text.TextUtils;
import java.io.PrintWriter;
import java.io.StringWriter;

class VLog {
    public static native void m27d(String str);

    public static native void m26e(String str);

    public static native void m23i(String str);

    public static native void m22v(String str);

    public static native void m21w(String str);

    VLog() {
    }

    public static void m24e(Throwable th) {
        m25e(null, th);
    }

    public static void m25e(String str, Throwable th) {
        StringWriter stringWriter = new StringWriter();
        if (!TextUtils.isEmpty(str)) {
            stringWriter.append((CharSequence) str);
            stringWriter.append((CharSequence) ": ");
        }
        th.printStackTrace(new PrintWriter(stringWriter));
        String[] split = stringWriter.toString().split("\n");
        for (String str2 : split) {
            m26e(str2);
        }
    }
}
