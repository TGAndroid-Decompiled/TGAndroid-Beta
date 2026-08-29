package kg;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;
public abstract class g0 {
    public static Runnable f13717c;
    public static Boolean h;
    public static final HashSet f13715a = new HashSet();
    public static volatile boolean f13716b = false;
    public static boolean d = true;
    public static boolean f13718e = false;
    public static boolean f13719f = false;
    public static boolean f13720g = false;

    public static void a() {
        pe.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f45722b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f45722b = null;
        }
        f13716b = false;
        f13718e = false;
        f13720g = false;
        f13717c = null;
        Iterator it = f13715a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f13715a.clear();
    }

    public static boolean b(View view) {
        if (f13716b) {
            f13715a.add(view);
        }
        return f13716b;
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
        if (f13716b) {
            f13715a.addAll(Arrays.asList(viewArr));
        }
        return f13716b;
    }

    public static boolean d() {
        if (!f13716b && !f13718e && !f13720g) {
            return false;
        }
        return true;
    }
}
