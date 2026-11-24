package defpackage;

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
public final class oyc implements ServiceConnection {
    public final Context a;
    public final Intent b;
    public final ScheduledThreadPoolExecutor c;
    public final ArrayDeque d;
    public myc e;
    public boolean f;

    public oyc(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new kn7("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = new ArrayDeque();
        this.f = false;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.d.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            myc mycVar = this.e;
            if (mycVar != null && mycVar.isBinderAlive()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.e.a((nyc) this.d.poll());
            } else {
                c();
                return;
            }
        }
    }

    public final synchronized Task b(Intent intent) {
        nyc nycVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        nycVar = new nyc(intent);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.c;
        nycVar.b.getTask().addOnCompleteListener(scheduledThreadPoolExecutor, new dkc(scheduledThreadPoolExecutor.schedule(new frc(nycVar, (byte) 10), 20L, TimeUnit.SECONDS), (byte) 12));
        this.d.add(nycVar);
        a();
        return nycVar.b.getTask();
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oyc.c():void");
    }

    @Override
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.f = false;
        if (!(iBinder instanceof myc)) {
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.d;
            while (!arrayDeque.isEmpty()) {
                ((nyc) arrayDeque.poll()).b.trySetResult(null);
            }
            return;
        }
        this.e = (myc) iBinder;
        a();
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}
