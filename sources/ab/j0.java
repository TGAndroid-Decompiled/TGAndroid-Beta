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
    public static final int f950i = 0;
    public final Context f951a;
    public final v f952b;
    public final android.support.v4.media.session.a0 f953c;
    public final ScheduledThreadPoolExecutor f954e;
    public final h0 f956g;
    public final a0.f d = new a0.l(0);
    public boolean f955f = false;

    public j0(v vVar, h0 h0Var, android.support.v4.media.session.a0 a0Var, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f952b = vVar;
        this.f956g = h0Var;
        this.f953c = a0Var;
        this.f951a = context;
        this.f954e = scheduledThreadPoolExecutor;
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
                String str = g0Var.f930c;
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
        this.f955f = z10;
    }

    public final boolean d() {
        throw new UnsupportedOperationException("Method not decompiled: ab.j0.d():boolean");
    }

    public final void e(long j3) {
        this.f954e.schedule(new l0(this, this.f951a, this.f952b, Math.min(Math.max(30L, 2 * j3), h)), j3, TimeUnit.SECONDS);
        c(true);
    }
}
