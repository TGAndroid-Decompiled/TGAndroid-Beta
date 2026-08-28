package hg;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;
public abstract class h0 {
    public static Runnable f10610c;
    public static Boolean h;
    public static final HashSet f10608a = new HashSet();
    public static volatile boolean f10609b = false;
    public static boolean d = true;
    public static boolean f10611e = false;
    public static boolean f10612f = false;
    public static boolean f10613g = false;

    public static void a() {
        me.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f17684b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f17684b = null;
        }
        f10609b = false;
        f10611e = false;
        f10613g = false;
        f10610c = null;
        Iterator it = f10608a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f10608a.clear();
    }

    public static boolean b(View view) {
        if (f10609b) {
            f10608a.add(view);
        }
        return f10609b;
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
        if (f10609b) {
            f10608a.addAll(Arrays.asList(viewArr));
        }
        return f10609b;
    }

    public static boolean d() {
        if (!f10609b && !f10611e && !f10613g) {
            return false;
        }
        return true;
    }
}
