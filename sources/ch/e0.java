package ch;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.gc;
import org.telegram.messenger.iz;
public abstract class e0 {
    public static Runnable f6233c;
    public static Boolean h;
    public static final HashSet f6231a = new HashSet();
    public static volatile boolean f6232b = false;
    public static boolean d = true;
    public static boolean f6234e = false;
    public static boolean f6235f = false;
    public static boolean f6236g = false;

    public static void a() {
        com.google.android.gms.internal.cast.b0 b0Var = gc.D().f22622p;
        CountDownLatch countDownLatch = (CountDownLatch) b0Var.f6815c;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            b0Var.f6815c = null;
        }
        f6232b = false;
        f6234e = false;
        f6236g = false;
        f6233c = null;
        Iterator it = f6231a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f6231a.clear();
    }

    public static boolean b(View view) {
        if (f6232b) {
            f6231a.add(view);
        }
        return f6232b;
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
        if (f6232b) {
            f6231a.addAll(Arrays.asList(viewArr));
        }
        return f6232b;
    }

    public static boolean d() {
        if (!f6232b && !f6234e && !f6236g) {
            return false;
        }
        return true;
    }
}
