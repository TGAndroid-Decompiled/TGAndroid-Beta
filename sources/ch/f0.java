package ch;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.bz;
import org.telegram.messenger.ec;
public abstract class f0 {
    public static Runnable f5355c;
    public static Boolean h;
    public static final HashSet f5353a = new HashSet();
    public static volatile boolean f5354b = false;
    public static boolean d = true;
    public static boolean f5356e = false;
    public static boolean f5357f = false;
    public static boolean f5358g = false;

    public static void a() {
        com.google.android.gms.internal.cast.b0 b0Var = ec.D().f23692p;
        CountDownLatch countDownLatch = (CountDownLatch) b0Var.f6490c;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            b0Var.f6490c = null;
        }
        f5354b = false;
        f5356e = false;
        f5358g = false;
        f5355c = null;
        Iterator it = f5353a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f5353a.clear();
    }

    public static boolean b(View view) {
        if (f5354b) {
            f5353a.add(view);
        }
        return f5354b;
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
        if (f5354b) {
            f5353a.addAll(Arrays.asList(viewArr));
        }
        return f5354b;
    }

    public static boolean d() {
        if (!f5354b && !f5356e && !f5358g) {
            return false;
        }
        return true;
    }
}
