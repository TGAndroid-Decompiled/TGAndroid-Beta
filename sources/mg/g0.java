package mg;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;
public abstract class g0 {
    public static Runnable f13993c;
    public static Boolean h;
    public static final HashSet f13991a = new HashSet();
    public static volatile boolean f13992b = false;
    public static boolean d = true;
    public static boolean e = false;
    public static boolean f13994f = false;
    public static boolean f13995g = false;

    public static void a() {
        re.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f43470b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f43470b = null;
        }
        f13992b = false;
        e = false;
        f13995g = false;
        f13993c = null;
        Iterator it = f13991a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f13991a.clear();
    }

    public static boolean b(View view) {
        if (f13992b) {
            f13991a.add(view);
        }
        return f13992b;
    }

    public static boolean c(View... viewArr) {
        boolean z4;
        if (h == null) {
            if (SharedConfig.getDevicePerformanceClass() != 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            h = Boolean.valueOf(z4);
        }
        if (!h.booleanValue()) {
            return false;
        }
        if (f13992b) {
            f13991a.addAll(Arrays.asList(viewArr));
        }
        return f13992b;
    }

    public static boolean d() {
        if (!f13992b && !e && !f13995g) {
            return false;
        }
        return true;
    }
}
