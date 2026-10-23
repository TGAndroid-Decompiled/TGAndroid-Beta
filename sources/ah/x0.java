package ah;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;
public abstract class x0 {
    public static Runnable f903c;
    public static Boolean h;
    public static final HashSet f901a = new HashSet();
    public static volatile boolean f902b = false;
    public static boolean d = true;
    public static boolean e = false;
    public static boolean f904f = false;
    public static boolean f905g = false;

    public static void a() {
        hf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f11812b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f11812b = null;
        }
        f902b = false;
        e = false;
        f905g = false;
        f903c = null;
        Iterator it = f901a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f901a.clear();
    }

    public static boolean b(View view) {
        if (f902b) {
            f901a.add(view);
        }
        return f902b;
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
        if (f902b) {
            f901a.addAll(Arrays.asList(viewArr));
        }
        return f902b;
    }

    public static boolean d() {
        if (!f902b && !e && !f905g) {
            return false;
        }
        return true;
    }
}
