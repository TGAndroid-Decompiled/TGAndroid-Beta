package j7;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public abstract class j8 {
    public static long f9665a;
    public static Method f9666b;

    public static void a(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static boolean b() {
        if (Build.VERSION.SDK_INT >= 29) {
            return j2.a.a();
        }
        try {
            if (f9666b == null) {
                f9665a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f9666b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f9666b.invoke(null, Long.valueOf(f9665a))).booleanValue();
        } catch (Exception e6) {
            if (e6 instanceof InvocationTargetException) {
                Throwable cause = e6.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
            Log.v("Trace", "Unable to call isTagEnabled via reflection", e6);
            return false;
        }
    }
}
