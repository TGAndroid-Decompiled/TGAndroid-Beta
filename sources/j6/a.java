package j6;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class a {
    public static int h;
    public static PendingIntent f11777i;
    public static final Pattern f11778j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context f11780b;
    public final b4.d f11781c;
    public final ScheduledThreadPoolExecutor d;
    public Messenger f11782f;
    public f f11783g;
    public final a0.l f11779a = new a0.l(0);
    public final Messenger e = new Messenger(new c(this, Looper.getMainLooper()));

    public a(Context context) {
        this.f11780b = context;
        this.f11781c = new b4.d(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    public static synchronized String b() {
        String num;
        synchronized (a.class) {
            int i10 = h;
            h = i10 + 1;
            num = Integer.toString(i10);
        }
        return num;
    }

    public static synchronized void c(Context context, Intent intent) {
        synchronized (a.class) {
            try {
                if (f11777i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f11777i = PendingIntent.getBroadcast(context, 0, intent2, l7.a.f12820a);
                }
                intent.putExtra("app", f11777i);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Task a(Bundle bundle) {
        String b10 = b();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.f11779a) {
            this.f11779a.put(b10, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f11781c.g() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        c(this.f11780b, intent);
        intent.putExtra("kid", "|ID|" + b10 + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.e);
        if (this.f11782f != null || this.f11783g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f11782f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.f11783g.f11787a;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            taskCompletionSource.getTask().addOnCompleteListener(m.f11804a, new aa.a((Object) this, b10, (Object) this.d.schedule(new androidx.activity.i(taskCompletionSource, 19), 30L, TimeUnit.SECONDS), 22));
            return taskCompletionSource.getTask();
        }
        if (this.f11781c.g() == 2) {
            this.f11780b.sendBroadcast(intent);
        } else {
            this.f11780b.startService(intent);
        }
        taskCompletionSource.getTask().addOnCompleteListener(m.f11804a, new aa.a((Object) this, b10, (Object) this.d.schedule(new androidx.activity.i(taskCompletionSource, 19), 30L, TimeUnit.SECONDS), 22));
        return taskCompletionSource.getTask();
    }

    public final void d(String str, Bundle bundle) {
        synchronized (this.f11779a) {
            try {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f11779a.remove(str);
                if (taskCompletionSource == null) {
                    Log.w("Rpc", "Missing callback for " + str);
                    return;
                }
                taskCompletionSource.setResult(bundle);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
