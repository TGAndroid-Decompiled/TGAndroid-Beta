package ah;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;
public abstract class x0 {
    public static Runnable f898c;
    public static Boolean h;
    public static final HashSet f896a = new HashSet();
    public static volatile boolean f897b = false;
    public static boolean d = true;
    public static boolean e = false;
    public static boolean f899f = false;
    public static boolean f900g = false;

    public static void a() {
        hf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f10477b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f10477b = null;
        }
        f897b = false;
        e = false;
        f900g = false;
        f898c = null;
        Iterator it = f896a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f896a.clear();
    }

    public static boolean b(View view) {
        if (f897b) {
            f896a.add(view);
        }
        return f897b;
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
        if (f897b) {
            f896a.addAll(Arrays.asList(viewArr));
        }
        return f897b;
    }

    public static boolean d() {
        if (!f897b && !e && !f900g) {
            return false;
        }
        return true;
    }
}
