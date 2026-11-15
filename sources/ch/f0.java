package ch;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.fc;
import org.telegram.messenger.gz;
public abstract class f0 {
    public static Runnable f5066c;
    public static Boolean h;
    public static final HashSet f5064a = new HashSet();
    public static volatile boolean f5065b = false;
    public static boolean d = true;
    public static boolean f5067e = false;
    public static boolean f5068f = false;
    public static boolean f5069g = false;

    public static void a() {
        com.google.android.gms.internal.cast.b0 b0Var = fc.D().f23473p;
        CountDownLatch countDownLatch = (CountDownLatch) b0Var.f6204c;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            b0Var.f6204c = null;
        }
        f5065b = false;
        f5067e = false;
        f5069g = false;
        f5066c = null;
        Iterator it = f5064a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f5064a.clear();
    }

    public static boolean b(View view) {
        if (f5065b) {
            f5064a.add(view);
        }
        return f5065b;
    }

    public static boolean c(View... viewArr) {
        boolean z10;
        if (h == null) {
            if (gz.o() != 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            h = Boolean.valueOf(z10);
        }
        if (!h.booleanValue()) {
            return false;
        }
        if (f5065b) {
            f5064a.addAll(Arrays.asList(viewArr));
        }
        return f5065b;
    }

    public static boolean d() {
        if (!f5065b && !f5067e && !f5069g) {
            return false;
        }
        return true;
    }
}
