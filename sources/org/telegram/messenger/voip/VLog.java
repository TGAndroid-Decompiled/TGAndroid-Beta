package org.telegram.messenger.voip;

import android.text.TextUtils;
import java.io.PrintWriter;
import java.io.StringWriter;

class VLog {
    public static native void m28d(String str);

    public static native void m27e(String str);

    public static native void m24i(String str);

    public static native void m23v(String str);

    public static native void m22w(String str);

    VLog() {
    }

    public static void m25e(Throwable th) {
        m26e(null, th);
    }

    public static void m26e(String str, Throwable th) {
        StringWriter stringWriter = new StringWriter();
        if (!TextUtils.isEmpty(str)) {
            stringWriter.append((CharSequence) str);
            stringWriter.append((CharSequence) ": ");
        }
        th.printStackTrace(new PrintWriter(stringWriter));
        String[] split = stringWriter.toString().split("\n");
        for (String str2 : split) {
            m27e(str2);
        }
    }
}
