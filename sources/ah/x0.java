package ah;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;
public abstract class x0 {
    public static Runnable f904c;
    public static Boolean h;
    public static final HashSet f902a = new HashSet();
    public static volatile boolean f903b = false;
    public static boolean d = true;
    public static boolean e = false;
    public static boolean f905f = false;
    public static boolean f906g = false;

    public static void a() {
        hf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f11788b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f11788b = null;
        }
        f903b = false;
        e = false;
        f906g = false;
        f904c = null;
        Iterator it = f902a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f902a.clear();
    }

    public static boolean b(View view) {
        if (f903b) {
            f902a.add(view);
        }
        return f903b;
    }

    public static boolean c(View... viewArr) {
        boolean z10;
        if (h == null) {
            if (SharedConfig.getDevicePerformanceClass() != 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            h = Boolean.valueOf(z10);
        }
        if (!h.booleanValue()) {
            return false;
        }
        if (f903b) {
            f902a.addAll(Arrays.asList(viewArr));
        }
        return f903b;
    }

    public static boolean d() {
        if (!f903b && !e && !f906g) {
            return false;
        }
        return true;
    }
}
