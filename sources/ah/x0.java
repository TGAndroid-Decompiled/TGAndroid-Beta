package ah;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;
public abstract class x0 {
    public static Runnable f902c;
    public static Boolean h;
    public static final HashSet f900a = new HashSet();
    public static volatile boolean f901b = false;
    public static boolean d = true;
    public static boolean e = false;
    public static boolean f903f = false;
    public static boolean f904g = false;

    public static void a() {
        hf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f11787b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f11787b = null;
        }
        f901b = false;
        e = false;
        f904g = false;
        f902c = null;
        Iterator it = f900a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f900a.clear();
    }

    public static boolean b(View view) {
        if (f901b) {
            f900a.add(view);
        }
        return f901b;
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
        if (f901b) {
            f900a.addAll(Arrays.asList(viewArr));
        }
        return f901b;
    }

    public static boolean d() {
        if (!f901b && !e && !f904g) {
            return false;
        }
        return true;
    }
}
