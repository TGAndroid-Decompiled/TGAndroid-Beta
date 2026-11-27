package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public final class q0c {
    public final Context a;
    public final uf7 b;
    public final ko9 c;
    public final ScheduledThreadPoolExecutor e;
    public final o0c g;
    public final qs d = new vla(0);
    public boolean f = false;

    public q0c(uf7 uf7Var, o0c o0cVar, ko9 ko9Var, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.b = uf7Var;
        this.g = o0cVar;
        this.c = ko9Var;
        this.a = context;
        this.e = scheduledThreadPoolExecutor;
    }

    public static boolean a() {
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            if (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void b(yxb yxbVar) {
        synchronized (this.d) {
            String str = yxbVar.c;
            if (!this.d.containsKey(str)) {
                return;
            }
            ArrayDeque arrayDeque = (ArrayDeque) this.d.get(str);
            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
            if (taskCompletionSource != null) {
                taskCompletionSource.setResult(null);
            }
            if (arrayDeque.isEmpty()) {
                this.d.remove(str);
            }
        }
    }

    public final synchronized void c(boolean z) {
        this.f = z;
    }

    public final boolean d() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q0c.d():boolean");
    }

    public final void e(long j) {
        this.e.schedule(new s0c(this, this.a, this.b, Math.min(Math.max(30L, j << 1), 28800L)), j, TimeUnit.SECONDS);
        c(true);
    }
}
