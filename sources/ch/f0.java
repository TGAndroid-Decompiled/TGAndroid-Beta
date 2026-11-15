package ch;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.fc;
import org.telegram.messenger.gz;
public abstract class f0 {
    public static Runnable f5069c;
    public static Boolean h;
    public static final HashSet f5067a = new HashSet();
    public static volatile boolean f5068b = false;
    public static boolean d = true;
    public static boolean f5070e = false;
    public static boolean f5071f = false;
    public static boolean f5072g = false;

    public static void a() {
        com.google.android.gms.internal.cast.b0 b0Var = fc.D().f23476p;
        CountDownLatch countDownLatch = (CountDownLatch) b0Var.f6207c;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            b0Var.f6207c = null;
        }
        f5068b = false;
        f5070e = false;
        f5072g = false;
        f5069c = null;
        Iterator it = f5067a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f5067a.clear();
    }

    public static boolean b(View view) {
        if (f5068b) {
            f5067a.add(view);
        }
        return f5068b;
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
        if (f5068b) {
            f5067a.addAll(Arrays.asList(viewArr));
        }
        return f5068b;
    }

    public static boolean d() {
        if (!f5068b && !f5070e && !f5072g) {
            return false;
        }
        return true;
    }
}
