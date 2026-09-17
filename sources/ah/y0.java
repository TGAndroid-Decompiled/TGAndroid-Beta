package ah;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;
public abstract class y0 {
    public static Runnable f721c;
    public static Boolean h;
    public static final HashSet f719a = new HashSet();
    public static volatile boolean f720b = false;
    public static boolean d = true;
    public static boolean f722e = false;
    public static boolean f723f = false;
    public static boolean f724g = false;

    public static void a() {
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f9471b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f9471b = null;
        }
        f720b = false;
        f722e = false;
        f724g = false;
        f721c = null;
        Iterator it = f719a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f719a.clear();
    }

    public static boolean b(View view) {
        if (f720b) {
            f719a.add(view);
        }
        return f720b;
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
        if (f720b) {
            f719a.addAll(Arrays.asList(viewArr));
        }
        return f720b;
    }

    public static boolean d() {
        if (!f720b && !f722e && !f724g) {
            return false;
        }
        return true;
    }
}
