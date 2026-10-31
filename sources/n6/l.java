package n6;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.ui.Cells.f1;
import v7.h5;
public abstract class l {
    public static final Object f13615a = new Object();
    public static boolean f13616b;
    public static int f13617c;

    public static void a(String str, boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(str));
    }

    public static void b(boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void c(Handler handler) {
        String str;
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            throw new IllegalStateException(f1.o("Must be called on ", handler.getLooper().getThread().getName(), " thread, but got ", str, "."));
        }
    }

    public static void d(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        throw new IllegalStateException(str);
    }

    public static void e(String str) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public static void f(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalArgumentException(str2);
    }

    public static void g(Object obj) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException("null reference");
    }

    public static void h(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    public static void i(String str, boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalStateException(String.valueOf(str));
    }

    public static void j(boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalStateException();
    }

    public static boolean k(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static com.google.android.gms.common.api.f l(Status status) {
        if (status.f4336c != null) {
            return new com.google.android.gms.common.api.f(status);
        }
        return new com.google.android.gms.common.api.f(status);
    }

    public static Task m(h5 h5Var, k kVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        h5Var.b(new t(h5Var, taskCompletionSource, kVar));
        return taskCompletionSource.getTask();
    }
}
