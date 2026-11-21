package ch;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.bz;
import org.telegram.messenger.ec;
public abstract class f0 {
    public static Runnable f5381c;
    public static Boolean h;
    public static final HashSet f5379a = new HashSet();
    public static volatile boolean f5380b = false;
    public static boolean d = true;
    public static boolean f5382e = false;
    public static boolean f5383f = false;
    public static boolean f5384g = false;

    public static void a() {
        com.google.android.gms.internal.cast.b0 b0Var = ec.D().f23717p;
        CountDownLatch countDownLatch = (CountDownLatch) b0Var.f6516c;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            b0Var.f6516c = null;
        }
        f5380b = false;
        f5382e = false;
        f5384g = false;
        f5381c = null;
        Iterator it = f5379a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f5379a.clear();
    }

    public static boolean b(View view) {
        if (f5380b) {
            f5379a.add(view);
        }
        return f5380b;
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
        if (f5380b) {
            f5379a.addAll(Arrays.asList(viewArr));
        }
        return f5380b;
    }

    public static boolean d() {
        if (!f5380b && !f5382e && !f5384g) {
            return false;
        }
        return true;
    }
}
