package ig;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;

public abstract class g0 {

    public static Runnable f11304c;
    public static Boolean h;

    public static final HashSet f11302a = new HashSet();

    public static volatile boolean f11303b = false;
    public static boolean d = true;

    public static boolean f11305e = false;

    public static boolean f11306f = false;

    public static boolean f11307g = false;

    public static void a() {
        ne.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f18520b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f18520b = null;
        }
        f11303b = false;
        f11305e = false;
        f11307g = false;
        f11304c = null;
        Iterator it = f11302a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f11302a.clear();
    }

    public static boolean b(View view) {
        if (f11303b) {
            f11302a.add(view);
        }
        return f11303b;
    }

    public static boolean c(View... viewArr) {
        if (h == null) {
            h = Boolean.valueOf(SharedConfig.getDevicePerformanceClass() != 2);
        }
        if (!h.booleanValue()) {
            return false;
        }
        if (f11303b) {
            f11302a.addAll(Arrays.asList(viewArr));
        }
        return f11303b;
    }

    public static boolean d() {
        return f11303b || f11305e || f11307g;
    }
}
