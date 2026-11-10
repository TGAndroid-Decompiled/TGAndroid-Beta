package ch;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.gc;
import org.telegram.messenger.iz;
public abstract class e0 {
    public static Runnable f6236c;
    public static Boolean h;
    public static final HashSet f6234a = new HashSet();
    public static volatile boolean f6235b = false;
    public static boolean d = true;
    public static boolean f6237e = false;
    public static boolean f6238f = false;
    public static boolean f6239g = false;

    public static void a() {
        com.google.android.gms.internal.cast.b0 b0Var = gc.D().f22652p;
        CountDownLatch countDownLatch = (CountDownLatch) b0Var.f6818c;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            b0Var.f6818c = null;
        }
        f6235b = false;
        f6237e = false;
        f6239g = false;
        f6236c = null;
        Iterator it = f6234a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f6234a.clear();
    }

    public static boolean b(View view) {
        if (f6235b) {
            f6234a.add(view);
        }
        return f6235b;
    }

    public static boolean c(View... viewArr) {
        boolean z9;
        if (h == null) {
            if (iz.o() != 2) {
                z9 = true;
            } else {
                z9 = false;
            }
            h = Boolean.valueOf(z9);
        }
        if (!h.booleanValue()) {
            return false;
        }
        if (f6235b) {
            f6234a.addAll(Arrays.asList(viewArr));
        }
        return f6235b;
    }

    public static boolean d() {
        if (!f6235b && !f6237e && !f6239g) {
            return false;
        }
        return true;
    }
}
