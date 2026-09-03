package ng;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;
public abstract class g0 {
    public static Runnable f16071c;
    public static Boolean h;
    public static final HashSet f16069a = new HashSet();
    public static volatile boolean f16070b = false;
    public static boolean d = true;
    public static boolean f16072e = false;
    public static boolean f16073f = false;
    public static boolean f16074g = false;

    public static void a() {
        re.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f46833b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f46833b = null;
        }
        f16070b = false;
        f16072e = false;
        f16074g = false;
        f16071c = null;
        Iterator it = f16069a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f16069a.clear();
    }

    public static boolean b(View view) {
        if (f16070b) {
            f16069a.add(view);
        }
        return f16070b;
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
        if (f16070b) {
            f16069a.addAll(Arrays.asList(viewArr));
        }
        return f16070b;
    }

    public static boolean d() {
        if (!f16070b && !f16072e && !f16074g) {
            return false;
        }
        return true;
    }
}
