package defpackage;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
public abstract class pg5 {
    public static Runnable c;
    public static Boolean h;
    public static final HashSet a = new HashSet();
    public static volatile boolean b = false;
    public static boolean d = true;
    public static boolean e = false;
    public static boolean f = false;
    public static boolean g = false;

    public static void a() {
        yv2 yv2Var = fl5.z().p;
        CountDownLatch countDownLatch = (CountDownLatch) yv2Var.c;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            yv2Var.c = null;
        }
        b = false;
        e = false;
        g = false;
        c = null;
        Iterator it = a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        a.clear();
    }

    public static boolean b(View view) {
        if (b) {
            a.add(view);
        }
        return b;
    }

    public static boolean c(View... viewArr) {
        boolean z;
        Boolean bool = h;
        if (bool == null) {
            if (gba.o() != 2) {
                z = true;
            } else {
                z = false;
            }
            bool = Boolean.valueOf(z);
            h = bool;
        }
        if (!bool.booleanValue()) {
            return false;
        }
        if (b) {
            a.addAll(Arrays.asList(viewArr));
        }
        return b;
    }

    public static boolean d() {
        if (!b && !e && !g) {
            return false;
        }
        return true;
    }
}
