package mg;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;
public abstract class g0 {
    public static Runnable f14005c;
    public static Boolean h;
    public static final HashSet f14003a = new HashSet();
    public static volatile boolean f14004b = false;
    public static boolean d = true;
    public static boolean e = false;
    public static boolean f14006f = false;
    public static boolean f14007g = false;

    public static void a() {
        re.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f43446b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f43446b = null;
        }
        f14004b = false;
        e = false;
        f14007g = false;
        f14005c = null;
        Iterator it = f14003a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f14003a.clear();
    }

    public static boolean b(View view) {
        if (f14004b) {
            f14003a.add(view);
        }
        return f14004b;
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
        if (f14004b) {
            f14003a.addAll(Arrays.asList(viewArr));
        }
        return f14004b;
    }

    public static boolean d() {
        if (!f14004b && !e && !f14007g) {
            return false;
        }
        return true;
    }
}
