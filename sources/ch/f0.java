package ch;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.bz;
import org.telegram.messenger.ec;
public abstract class f0 {
    public static Runnable f5352c;
    public static Boolean h;
    public static final HashSet f5350a = new HashSet();
    public static volatile boolean f5351b = false;
    public static boolean d = true;
    public static boolean f5353e = false;
    public static boolean f5354f = false;
    public static boolean f5355g = false;

    public static void a() {
        com.google.android.gms.internal.cast.b0 b0Var = ec.D().f23689p;
        CountDownLatch countDownLatch = (CountDownLatch) b0Var.f6487c;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            b0Var.f6487c = null;
        }
        f5351b = false;
        f5353e = false;
        f5355g = false;
        f5352c = null;
        Iterator it = f5350a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f5350a.clear();
    }

    public static boolean b(View view) {
        if (f5351b) {
            f5350a.add(view);
        }
        return f5351b;
    }

    public static boolean c(View... viewArr) {
        boolean z10;
        if (h == null) {
            if (bz.o() != 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            h = Boolean.valueOf(z10);
        }
        if (!h.booleanValue()) {
            return false;
        }
        if (f5351b) {
            f5350a.addAll(Arrays.asList(viewArr));
        }
        return f5351b;
    }

    public static boolean d() {
        if (!f5351b && !f5353e && !f5355g) {
            return false;
        }
        return true;
    }
}
