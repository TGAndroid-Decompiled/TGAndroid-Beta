package e2;

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
    public static ExecutorService f8306a;
    public static final Object f8307b = new Object();

    public static String a(String str, Throwable th2) {
        String replace;
        if (th2 == null) {
            replace = null;
        } else {
            synchronized (f8307b) {
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
            StringBuilder i10 = t8.b.i(str, "\n  ");
            i10.append(replace.replace("\n", "\n  "));
            i10.append('\n');
            return i10.toString();
        }
        return str;
    }

    public static void b(String str, String str2) {
        synchronized (f8307b) {
            Log.d(str, a(str2, null));
        }
    }

    public static void c(String str, String str2) {
        synchronized (f8307b) {
            Log.e(str, a(str2, null));
        }
    }

    public static void d(String str, String str2, Throwable th2) {
        synchronized (f8307b) {
            Log.e(str, a(str2, th2));
        }
    }

    public static synchronized Executor e() {
        ExecutorService executorService;
        synchronized (a.class) {
            try {
                if (f8306a == null) {
                    String str = m0.f8372a;
                    f8306a = Executors.newSingleThreadExecutor(new androidx.emoji2.text.a("ExoPlayer:BackgroundExecutor", 1));
                }
                executorService = f8306a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return executorService;
    }

    public static String f(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (xmlPullParser.getAttributeName(i10).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    public static void g(String str, String str2) {
        synchronized (f8307b) {
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

    public static void j(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static void k(MediaFormat mediaFormat, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer(i2.d.i(i10, "csd-"), ByteBuffer.wrap((byte[]) list.get(i10)));
        }
    }

    public static void l(String str, String str2) {
        synchronized (f8307b) {
            Log.w(str, a(str2, null));
        }
    }

    public static void m(String str, String str2, Throwable th2) {
        synchronized (f8307b) {
            Log.w(str, a(str2, th2));
        }
    }
}
