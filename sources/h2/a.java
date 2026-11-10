package h2;

import android.media.MediaFormat;
import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.xmlpull.v1.XmlPullParser;
public abstract class a {
    public static ExecutorService f14041a;
    public static final Object f14042b = new Object();

    public static String a(String str, Throwable th2) {
        String replace;
        if (th2 == null) {
            replace = null;
        } else {
            synchronized (f14042b) {
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
            StringBuilder j3 = rf.b.j(str, "\n  ");
            j3.append(replace.replace("\n", "\n  "));
            j3.append('\n');
            return j3.toString();
        }
        return str;
    }

    public static void b(String str, String str2) {
        synchronized (f14042b) {
            Log.d(str, a(str2, null));
        }
    }

    public static void c(String str, String str2) {
        synchronized (f14042b) {
            Log.e(str, a(str2, null));
        }
    }

    public static void d(String str, String str2, Throwable th2) {
        synchronized (f14042b) {
            Log.e(str, a(str2, th2));
        }
    }

    public static synchronized Executor e() {
        ExecutorService executorService;
        synchronized (a.class) {
            try {
                if (f14041a == null) {
                    String str = m0.f14114a;
                    f14041a = Executors.newSingleThreadExecutor(new androidx.emoji2.text.a("ExoPlayer:BackgroundExecutor", 1));
                }
                executorService = f14041a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return executorService;
    }

    public static String f(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i7 = 0; i7 < attributeCount; i7++) {
            if (xmlPullParser.getAttributeName(i7).equals(str)) {
                return xmlPullParser.getAttributeValue(i7);
            }
        }
        return null;
    }

    public static void g(String str, String str2) {
        synchronized (f14042b) {
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

    public static void j(MediaFormat mediaFormat, String str, int i7) {
        if (i7 != -1) {
            mediaFormat.setInteger(str, i7);
        }
    }

    public static void k(MediaFormat mediaFormat, List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            mediaFormat.setByteBuffer(jg.g.j(i7, "csd-"), ByteBuffer.wrap((byte[]) list.get(i7)));
        }
    }

    public static void l(String str, String str2) {
        synchronized (f14042b) {
            Log.w(str, a(str2, null));
        }
    }

    public static void m(String str, String str2, Throwable th2) {
        synchronized (f14042b) {
            Log.w(str, a(str2, th2));
        }
    }
}
