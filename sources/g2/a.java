package g2;

import android.media.MediaFormat;
import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import k2.p1;
import org.xmlpull.v1.XmlPullParser;
public abstract class a {
    public static ExecutorService f11795a;
    public static final Object f11796b = new Object();

    public static String a(String str, Throwable th2) {
        String replace;
        if (th2 == null) {
            replace = null;
        } else {
            synchronized (f11796b) {
                Throwable th3 = th2;
                while (true) {
                    if (th3 != null) {
                        try {
                            if (th3 instanceof UnknownHostException) {
                                replace = "UnknownHostException (no network)";
                            } else {
                                th3 = th3.getCause();
                            }
                        } finally {
                        }
                    } else {
                        replace = Log.getStackTraceString(th2).trim().replace("\t", "    ");
                        break;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(replace)) {
            StringBuilder h = t4.c.h(str, "\n  ");
            h.append(replace.replace("\n", "\n  "));
            h.append('\n');
            return h.toString();
        }
        return str;
    }

    public static void b(String str, String str2) {
        synchronized (f11796b) {
            Log.d(str, a(str2, null));
        }
    }

    public static void c(String str, String str2) {
        synchronized (f11796b) {
            Log.e(str, a(str2, null));
        }
    }

    public static void d(String str, String str2, Throwable th2) {
        synchronized (f11796b) {
            Log.e(str, a(str2, th2));
        }
    }

    public static synchronized Executor e() {
        ExecutorService executorService;
        synchronized (a.class) {
            try {
                if (f11795a == null) {
                    String str = n0.f11873a;
                    f11795a = Executors.newSingleThreadExecutor(new androidx.emoji2.text.a("ExoPlayer:BackgroundExecutor", 1));
                }
                executorService = f11795a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return executorService;
    }

    public static String f(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i3 = 0; i3 < attributeCount; i3++) {
            if (xmlPullParser.getAttributeName(i3).equals(str)) {
                return xmlPullParser.getAttributeValue(i3);
            }
        }
        return null;
    }

    public static void g(String str, String str2) {
        synchronized (f11796b) {
            Log.i(str, a(str2, null));
        }
    }

    public static boolean h(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean i(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    public static void j(MediaFormat mediaFormat, String str, int i3) {
        if (i3 != -1) {
            mediaFormat.setInteger(str, i3);
        }
    }

    public static void k(MediaFormat mediaFormat, List list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            mediaFormat.setByteBuffer(p1.i(i3, "csd-"), ByteBuffer.wrap((byte[]) list.get(i3)));
        }
    }

    public static void l(String str, String str2) {
        synchronized (f11796b) {
            Log.w(str, a(str2, null));
        }
    }

    public static void m(String str, String str2, Throwable th2) {
        synchronized (f11796b) {
            Log.w(str, a(str2, th2));
        }
    }
}
