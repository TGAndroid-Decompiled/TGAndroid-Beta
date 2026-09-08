package ah;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;
public abstract class y0 {
    public static Runnable f733c;
    public static Boolean h;
    public static final HashSet f731a = new HashSet();
    public static volatile boolean f732b = false;
    public static boolean d = true;
    public static boolean f734e = false;
    public static boolean f735f = false;
    public static boolean f736g = false;

    public static void a() {
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f9499b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f9499b = null;
        }
        f732b = false;
        f734e = false;
        f736g = false;
        f733c = null;
        Iterator it = f731a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f731a.clear();
    }

    public static boolean b(View view) {
        if (f732b) {
            f731a.add(view);
        }
        return f732b;
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
        if (f732b) {
            f731a.addAll(Arrays.asList(viewArr));
        }
        return f732b;
    }

    public static boolean d() {
        if (!f732b && !f734e && !f736g) {
            return false;
        }
        return true;
    }
}
