package b6;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j7.q5;
import org.telegram.ui.ai;
public abstract class m {
    public static final Object f1635a = new Object();
    public static boolean f1636b;
    public static int f1637c;

    public static void a(String str, boolean z4) {
        if (z4) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(str));
    }

    public static void b(boolean z4) {
        if (z4) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void c(boolean z4, String str, Object... objArr) {
        if (z4) {
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
            throw new IllegalStateException(ai.k("Must be called on ", handler.getLooper().getThread().getName(), " thread, but got ", str, "."));
        }
    }

    public static void e(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        throw new IllegalStateException(str);
    }

    public static void f(String str) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public static void g(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalArgumentException(str2);
    }

    public static void h(Object obj) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException("null reference");
    }

    public static void i(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    public static void j(String str, boolean z4) {
        if (z4) {
            return;
        }
        throw new IllegalStateException(String.valueOf(str));
    }

    public static void k(boolean z4) {
        if (z4) {
            return;
        }
        throw new IllegalStateException();
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static com.google.android.gms.common.api.f m(Status status) {
        if (status.f2703c != null) {
            return new com.google.android.gms.common.api.f(status);
        }
        return new com.google.android.gms.common.api.f(status);
    }

    public static Task n(q5 q5Var, l lVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        q5Var.b(new u(q5Var, taskCompletionSource, lVar));
        return taskCompletionSource.getTask();
    }
}
