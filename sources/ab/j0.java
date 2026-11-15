package ab;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public final class j0 {
    public static final long h = TimeUnit.HOURS.toSeconds(8);
    public static final int f951i = 0;
    public final Context f952a;
    public final v f953b;
    public final android.support.v4.media.session.a0 f954c;
    public final ScheduledThreadPoolExecutor f955e;
    public final h0 f957g;
    public final a0.f d = new a0.l(0);
    public boolean f956f = false;

    public j0(v vVar, h0 h0Var, android.support.v4.media.session.a0 a0Var, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f953b = vVar;
        this.f957g = h0Var;
        this.f954c = a0Var;
        this.f952a = context;
        this.f955e = scheduledThreadPoolExecutor;
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

    public final void b(g0 g0Var) {
        synchronized (this.d) {
            try {
                String str = g0Var.f931c;
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
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void c(boolean z10) {
        this.f956f = z10;
    }

    public final boolean d() {
        throw new UnsupportedOperationException("Method not decompiled: ab.j0.d():boolean");
    }

    public final void e(long j3) {
        this.f955e.schedule(new l0(this, this.f952a, this.f953b, Math.min(Math.max(30L, 2 * j3), h)), j3, TimeUnit.SECONDS);
        c(true);
    }
}
