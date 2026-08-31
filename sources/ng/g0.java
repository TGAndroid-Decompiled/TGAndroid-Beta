package ng;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;
public abstract class g0 {
    public static Runnable f16069c;
    public static Boolean h;
    public static final HashSet f16067a = new HashSet();
    public static volatile boolean f16068b = false;
    public static boolean d = true;
    public static boolean f16070e = false;
    public static boolean f16071f = false;
    public static boolean f16072g = false;

    public static void a() {
        re.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f46802b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f46802b = null;
        }
        f16068b = false;
        f16070e = false;
        f16072g = false;
        f16069c = null;
        Iterator it = f16067a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f16067a.clear();
    }

    public static boolean b(View view) {
        if (f16068b) {
            f16067a.add(view);
        }
        return f16068b;
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
        if (f16068b) {
            f16067a.addAll(Arrays.asList(viewArr));
        }
        return f16068b;
    }

    public static boolean d() {
        if (!f16068b && !f16070e && !f16072g) {
            return false;
        }
        return true;
    }
}
