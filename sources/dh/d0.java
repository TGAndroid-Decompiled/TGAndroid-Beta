package dh;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.az;
import org.telegram.messenger.zb;
public abstract class d0 {
    public static Runnable f8984c;
    public static Boolean h;
    public static final HashSet f8982a = new HashSet();
    public static volatile boolean f8983b = false;
    public static boolean d = true;
    public static boolean f8985e = false;
    public static boolean f8986f = false;
    public static boolean f8987g = false;

    public static void a() {
        com.google.android.gms.internal.cast.c0 c0Var = zb.D().f26770p;
        CountDownLatch countDownLatch = (CountDownLatch) c0Var.f6883c;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            c0Var.f6883c = null;
        }
        f8983b = false;
        f8985e = false;
        f8987g = false;
        f8984c = null;
        Iterator it = f8982a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f8982a.clear();
    }

    public static boolean b(View view) {
        if (f8983b) {
            f8982a.add(view);
        }
        return f8983b;
    }

    public static boolean c(View... viewArr) {
        boolean z10;
        if (h == null) {
            if (az.o() != 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            h = Boolean.valueOf(z10);
        }
        if (!h.booleanValue()) {
            return false;
        }
        if (f8983b) {
            f8982a.addAll(Arrays.asList(viewArr));
        }
        return f8983b;
    }

    public static boolean d() {
        if (!f8983b && !f8985e && !f8987g) {
            return false;
        }
        return true;
    }
}
