package ch;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.gc;
import org.telegram.messenger.iz;
public abstract class e0 {
    public static Runnable f6231c;
    public static Boolean h;
    public static final HashSet f6229a = new HashSet();
    public static volatile boolean f6230b = false;
    public static boolean d = true;
    public static boolean f6232e = false;
    public static boolean f6233f = false;
    public static boolean f6234g = false;

    public static void a() {
        com.google.android.gms.internal.cast.b0 b0Var = gc.D().f22648p;
        CountDownLatch countDownLatch = (CountDownLatch) b0Var.f6813c;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            b0Var.f6813c = null;
        }
        f6230b = false;
        f6232e = false;
        f6234g = false;
        f6231c = null;
        Iterator it = f6229a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f6229a.clear();
    }

    public static boolean b(View view) {
        if (f6230b) {
            f6229a.add(view);
        }
        return f6230b;
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
        if (f6230b) {
            f6229a.addAll(Arrays.asList(viewArr));
        }
        return f6230b;
    }

    public static boolean d() {
        if (!f6230b && !f6232e && !f6234g) {
            return false;
        }
        return true;
    }
}
