package defpackage;

import android.content.Context;
import com.google.android.gms.tasks.TaskExecutors;
import org.telegram.messenger.a;
public abstract class cme {
    public static void a(String str, zw5 zw5Var, yw5 yw5Var) {
        b(str, zw5Var, yw5Var, false);
    }

    public static void b(String str, zw5 zw5Var, yw5 yw5Var, boolean z) {
        if (z) {
            try {
                Context context = a.b;
                synchronized (ae7.b) {
                    try {
                        ae7.d(context, TaskExecutors.MAIN_THREAD);
                    } finally {
                    }
                }
            } catch (IllegalStateException e) {
                if (!z) {
                    b(str, zw5Var, yw5Var, true);
                    return;
                }
                yw5Var.n(e);
                fa4.g(e, false);
                return;
            } catch (Exception e2) {
                yw5Var.n(e2);
                fa4.g(e2, true);
                return;
            } catch (Throwable th) {
                yw5Var.n(null);
                fa4.g(th, false);
                return;
            }
        }
        gme.a().c(str).addOnSuccessListener(new ry4(zw5Var, (byte) 18)).addOnFailureListener(new ry4(yw5Var, (byte) 19));
    }
}
