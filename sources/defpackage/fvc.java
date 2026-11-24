package defpackage;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.internal.zzdm;
import com.google.android.recaptcha.internal.zzsx;
import java.io.IOException;
public final class fvc implements Continuation {
    public static void b() {
        throw new UnsupportedOperationException();
    }

    public static void c(int i, int i2, Throwable th) {
        throw new zzdm(i, i2, th);
    }

    public static void d(int i, String str) {
        throw new IllegalStateException(str + i);
    }

    public static void e(int i, StringBuilder sb) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void f(String str) {
        throw new NullPointerException(str);
    }

    public static void g(Throwable th) {
        throw new RuntimeException(th);
    }

    public static void h(String str) {
        throw new IOException(str);
    }

    public static void i(String str) {
        throw new zzsx(str);
    }

    @Override
    public final Object then(Task task) {
        int i;
        Task forException;
        String message;
        task.getClass();
        cb4 cb4Var = cb4.e;
        boolean isSuccessful = task.isSuccessful();
        lh0 lh0Var = h0d.b;
        if (isSuccessful) {
            lh0Var.a("Successfully completed the operation", new Object[0]);
            Task forResult = Tasks.forResult(cb4Var.invoke(task.getResult()));
            forResult.getClass();
            return forResult;
        }
        Log.e(lh0Var.b, lh0Var.b("Failed to fetch the Verification Support Info: " + task.getException(), new Object[0]));
        Exception exception = task.getException();
        if (exception != null && (message = exception.getMessage()) != null && f9b.f(0, 2, message, "test_number_token is invalid") >= 0) {
            lh0Var.a("Backend rejected the test number token.", new Object[0]);
            forException = Tasks.forException(new fg4(55507, "Invalid test number ID(s) - might be empty, expired or duplicated."));
        } else {
            if (exception instanceof zn) {
                i = ((zn) exception).getStatus().a;
            } else {
                i = 55501;
            }
            forException = Tasks.forException(new fg4(i, "Failed to fetch the Verification Support Info"));
        }
        forException.getClass();
        return forException;
    }
}
