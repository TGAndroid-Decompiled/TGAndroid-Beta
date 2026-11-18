package ab;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public final class p0 implements ServiceConnection {
    public final Context f981a;
    public final Intent f982b;
    public final ScheduledThreadPoolExecutor f983c;
    public final ArrayDeque d;
    public n0 f984e;
    public boolean f985f;

    public p0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new f5.s("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = new ArrayDeque();
        this.f985f = false;
        Context applicationContext = context.getApplicationContext();
        this.f981a = applicationContext;
        this.f982b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f983c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                n0 n0Var = this.f984e;
                if (n0Var != null && n0Var.isBinderAlive()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                    }
                    this.f984e.a((o0) this.d.poll());
                } else {
                    c();
                    return;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized Task b(Intent intent) {
        o0 o0Var;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            o0Var = new o0(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f983c;
            o0Var.f978b.getTask().addOnCompleteListener(scheduledThreadPoolExecutor, new a1.c(scheduledThreadPoolExecutor.schedule(new a3.f(o0Var, 2), 20L, TimeUnit.SECONDS), 7));
            this.d.add(o0Var);
            a();
        } catch (Throwable th2) {
            throw th2;
        }
        return o0Var.f978b.getTask();
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: ab.p0.c():void");
    }

    @Override
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f985f = false;
            if (!(iBinder instanceof n0)) {
                Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
                ArrayDeque arrayDeque = this.d;
                while (!arrayDeque.isEmpty()) {
                    ((o0) arrayDeque.poll()).f978b.trySetResult(null);
                }
                return;
            }
            this.f984e = (n0) iBinder;
            a();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}
