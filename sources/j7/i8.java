package j7;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public abstract class i8 {
    public static long f9038a;
    public static Method f9039b;

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
            if (f9039b == null) {
                f9038a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f9039b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f9039b.invoke(null, Long.valueOf(f9038a))).booleanValue();
        } catch (Exception e) {
            if (e instanceof InvocationTargetException) {
                Throwable cause = e.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
            Log.v("Trace", "Unable to call isTagEnabled via reflection", e);
            return false;
        }
    }
}
