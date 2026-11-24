package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
public abstract class ite {
    public static void a(String str, boolean z) {
        if (z) {
            return;
        }
        u36.j(str);
    }

    public static void b(boolean z) {
        if (z) {
            return;
        }
        i98.g();
    }

    public static void c(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static void d(Handler handler) {
        String str;
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            String name = handler.getLooper().getThread().getName();
            int length = String.valueOf(name).length();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + length + 35 + 1);
            kt6.v(sb, "Must be called on ", name, " thread, but got ", str);
            rjb.l(sb, ".");
        }
    }

    public static void e(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        dq9.m(str);
    }

    public static void f(String str) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        u36.j("Given String is empty or null");
    }

    public static void g(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        u36.j(str2);
    }

    public static void h(Object obj) {
        if (obj != null) {
            return;
        }
        gxc.d("null reference");
    }

    public static void i(Object obj, String str) {
        if (obj != null) {
            return;
        }
        gxc.d(str);
    }

    public static void j(String str, boolean z) {
        if (z) {
            return;
        }
        dq9.m(str);
    }

    public static void k(boolean z) {
        if (z) {
            return;
        }
        rjb.h();
    }
}
