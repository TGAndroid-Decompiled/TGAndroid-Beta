package ch;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.cz;
import org.telegram.messenger.fc;
public abstract class f0 {
    public static Runnable f5384c;
    public static Boolean h;
    public static final HashSet f5382a = new HashSet();
    public static volatile boolean f5383b = false;
    public static boolean d = true;
    public static boolean f5385e = false;
    public static boolean f5386f = false;
    public static boolean f5387g = false;

    public static void a() {
        com.google.android.gms.internal.cast.b0 b0Var = fc.D().f23898p;
        CountDownLatch countDownLatch = (CountDownLatch) b0Var.f6519c;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            b0Var.f6519c = null;
        }
        f5383b = false;
        f5385e = false;
        f5387g = false;
        f5384c = null;
        Iterator it = f5382a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f5382a.clear();
    }

    public static boolean b(View view) {
        if (f5383b) {
            f5382a.add(view);
        }
        return f5383b;
    }

    public static boolean c(View... viewArr) {
        boolean z10;
        if (h == null) {
            if (cz.o() != 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            h = Boolean.valueOf(z10);
        }
        if (!h.booleanValue()) {
            return false;
        }
        if (f5383b) {
            f5382a.addAll(Arrays.asList(viewArr));
        }
        return f5383b;
    }

    public static boolean d() {
        if (!f5383b && !f5385e && !f5387g) {
            return false;
        }
        return true;
    }
}
