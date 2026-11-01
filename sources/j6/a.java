package j6;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.session.a0;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class a {
    public static int h;
    public static PendingIntent f9675i;
    public static final Pattern f9676j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context f9678b;
    public final b4.d f9679c;
    public final ScheduledThreadPoolExecutor d;
    public Messenger f9680f;
    public f f9681g;
    public final a0.l f9677a = new a0.l(0);
    public final Messenger e = new Messenger(new c(this, Looper.getMainLooper()));

    public a(Context context) {
        this.f9678b = context;
        this.f9679c = new b4.d(context);
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
                if (f9675i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f9675i = PendingIntent.getBroadcast(context, 0, intent2, l7.a.f11689a);
                }
                intent.putExtra("app", f9675i);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Task a(Bundle bundle) {
        String b10 = b();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.f9677a) {
            this.f9677a.put(b10, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f9679c.i() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        c(this.f9678b, intent);
        intent.putExtra("kid", "|ID|" + b10 + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.e);
        if (this.f9680f != null || this.f9681g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f9680f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.f9681g.f9685a;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            taskCompletionSource.getTask().addOnCompleteListener(n.f9702a, new a0(this, b10, this.d.schedule(new androidx.activity.i(taskCompletionSource, 22), 30L, TimeUnit.SECONDS), 24));
            return taskCompletionSource.getTask();
        }
        if (this.f9679c.i() == 2) {
            this.f9678b.sendBroadcast(intent);
        } else {
            this.f9678b.startService(intent);
        }
        taskCompletionSource.getTask().addOnCompleteListener(n.f9702a, new a0(this, b10, this.d.schedule(new androidx.activity.i(taskCompletionSource, 22), 30L, TimeUnit.SECONDS), 24));
        return taskCompletionSource.getTask();
    }

    public final void d(String str, Bundle bundle) {
        synchronized (this.f9677a) {
            try {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f9677a.remove(str);
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
