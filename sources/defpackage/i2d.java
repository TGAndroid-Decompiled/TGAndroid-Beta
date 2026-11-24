package defpackage;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.internal.zzdm;
import com.google.android.recaptcha.internal.zzsw;
import com.google.android.recaptcha.internal.zzsx;
import java.io.IOException;
public final class i2d implements Continuation {
    public static void a() {
        throw new zzsw("Protocol message tag had invalid wire type.");
    }

    public static void b(int i, int i2) {
        throw new IllegalArgumentException("Length too large: " + i + i2);
    }

    public static void c(int i, int i2, Object obj) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(obj);
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void d(int i, int i2, Throwable th) {
        throw new zzdm(i, i2, th);
    }

    public static void e(int i, String str) {
        throw new IllegalStateException(str + i);
    }

    public static void f(long j) {
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + j);
    }

    public static void g(String str) {
        throw new IOException(str);
    }

    public static void h(Throwable th) {
        throw new RuntimeException(th);
    }

    public static void i(int i, int i2) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + i2);
    }

    public static void j(String str) {
        throw new zzsx(str);
    }

    @Override
    public final Object then(Task task) {
        int i;
        Task forException;
        String message;
        task.getClass();
        cd4 cd4Var = cd4.e;
        boolean isSuccessful = task.isSuccessful();
        li0 li0Var = j2d.b;
        if (isSuccessful) {
            li0Var.a("Successfully completed the operation", new Object[0]);
            Task forResult = Tasks.forResult(cd4Var.invoke(task.getResult()));
            forResult.getClass();
            return forResult;
        }
        Log.e(li0Var.b, li0Var.b("Failed to fetch the Verification Support Info: " + task.getException(), new Object[0]));
        Exception exception = task.getException();
        if (exception != null && (message = exception.getMessage()) != null && hbb.f(0, 2, message, "test_number_token is invalid") >= 0) {
            li0Var.a("Backend rejected the test number token.", new Object[0]);
            forException = Tasks.forException(new hi4(55507, "Invalid test number ID(s) - might be empty, expired or duplicated."));
        } else {
            if (exception instanceof ap) {
                i = ((ap) exception).getStatus().a;
            } else {
                i = 55501;
            }
            forException = Tasks.forException(new hi4(i, "Failed to fetch the Verification Support Info"));
        }
        forException.getClass();
        return forException;
    }
}
