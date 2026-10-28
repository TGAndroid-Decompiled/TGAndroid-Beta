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
import org.telegram.ui.Components.b10;
import org.xmlpull.v1.XmlPullParser;
public abstract class a {
    public static ExecutorService f9620a;
    public static final Object f9621b = new Object();

    public static String a(String str, Throwable th2) {
        String replace;
        if (th2 == null) {
            replace = null;
        } else {
            synchronized (f9621b) {
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
            StringBuilder l4 = b10.l(str, "\n  ");
            l4.append(replace.replace("\n", "\n  "));
            l4.append('\n');
            return l4.toString();
        }
        return str;
    }

    public static void b(String str, String str2) {
        synchronized (f9621b) {
            Log.d(str, a(str2, null));
        }
    }

    public static void c(String str, String str2) {
        synchronized (f9621b) {
            Log.e(str, a(str2, null));
        }
    }

    public static void d(String str, String str2, Throwable th2) {
        synchronized (f9621b) {
            Log.e(str, a(str2, th2));
        }
    }

    public static synchronized Executor e() {
        ExecutorService executorService;
        synchronized (a.class) {
            try {
                if (f9620a == null) {
                    String str = n0.f9691a;
                    f9620a = Executors.newSingleThreadExecutor(new androidx.emoji2.text.a("ExoPlayer:BackgroundExecutor", 1));
                }
                executorService = f9620a;
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
        synchronized (f9621b) {
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
            mediaFormat.setByteBuffer(ic.a.i(i10, "csd-"), ByteBuffer.wrap((byte[]) list.get(i10)));
        }
    }

    public static void l(String str, String str2) {
        synchronized (f9621b) {
            Log.w(str, a(str2, null));
        }
    }

    public static void m(String str, String str2, Throwable th2) {
        synchronized (f9621b) {
            Log.w(str, a(str2, th2));
        }
    }
}
