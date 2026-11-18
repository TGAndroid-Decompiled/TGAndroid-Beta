package c8;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public abstract class ke {
    public static long f4861a;
    public static Method f4862b;

    public static void a(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static boolean b() {
        if (Build.VERSION.SDK_INT >= 29) {
            return z4.a.a();
        }
        try {
            if (f4862b == null) {
                f4861a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f4862b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f4862b.invoke(null, Long.valueOf(f4861a))).booleanValue();
        } catch (Exception e10) {
            if (e10 instanceof InvocationTargetException) {
                Throwable cause = e10.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
            Log.v("Trace", "Unable to call isTagEnabled via reflection", e10);
            return false;
        }
    }
}
