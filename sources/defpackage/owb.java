package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public final class owb {
    public final Context a;
    public final kd7 b;
    public final vk9 c;
    public final ScheduledThreadPoolExecutor e;
    public final mwb g;
    public final ps d = new aia(0);
    public boolean f = false;

    public owb(kd7 kd7Var, mwb mwbVar, vk9 vk9Var, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.b = kd7Var;
        this.g = mwbVar;
        this.c = vk9Var;
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

    public final void b(xtb xtbVar) {
        synchronized (this.d) {
            String str = xtbVar.c;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.owb.d():boolean");
    }

    public final void e(long j) {
        this.e.schedule(new qwb(this, this.a, this.b, Math.min(Math.max(30L, j << 1), 28800L)), j, TimeUnit.SECONDS);
        c(true);
    }
}
