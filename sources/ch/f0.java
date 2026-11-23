package ch;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.cz;
import org.telegram.messenger.fc;
public abstract class f0 {
    public static Runnable f5347c;
    public static Boolean h;
    public static final HashSet f5345a = new HashSet();
    public static volatile boolean f5346b = false;
    public static boolean d = true;
    public static boolean f5348e = false;
    public static boolean f5349f = false;
    public static boolean f5350g = false;

    public static void a() {
        com.google.android.gms.internal.cast.b0 b0Var = fc.D().f23862p;
        CountDownLatch countDownLatch = (CountDownLatch) b0Var.f6482c;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            b0Var.f6482c = null;
        }
        f5346b = false;
        f5348e = false;
        f5350g = false;
        f5347c = null;
        Iterator it = f5345a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f5345a.clear();
    }

    public static boolean b(View view) {
        if (f5346b) {
            f5345a.add(view);
        }
        return f5346b;
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
        if (f5346b) {
            f5345a.addAll(Arrays.asList(viewArr));
        }
        return f5346b;
    }

    public static boolean d() {
        if (!f5346b && !f5348e && !f5350g) {
            return false;
        }
        return true;
    }
}
