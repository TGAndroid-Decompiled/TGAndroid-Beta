package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public final class ryb {
    public final Context a;
    public final mf7 b;
    public final wm9 c;
    public final ScheduledThreadPoolExecutor e;
    public final pyb g;
    public final qt d = new cka(0);
    public boolean f = false;

    public ryb(mf7 mf7Var, pyb pybVar, wm9 wm9Var, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.b = mf7Var;
        this.g = pybVar;
        this.c = wm9Var;
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

    public final void b(yvb yvbVar) {
        synchronized (this.d) {
            String str = yvbVar.c;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ryb.d():boolean");
    }

    public final void e(long j) {
        this.e.schedule(new tyb(this, this.a, this.b, Math.min(Math.max(30L, j << 1), 28800L)), j, TimeUnit.SECONDS);
        c(true);
    }
}
