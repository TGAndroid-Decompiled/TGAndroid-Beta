package j6;

import ai.q4;
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
    public static PendingIntent f13995i;
    public static final Pattern f13996j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context f13998b;
    public final b4.d f13999c;
    public final ScheduledThreadPoolExecutor d;
    public Messenger f14001f;
    public f f14002g;
    public final a0.m f13997a = new a0.m(0);
    public final Messenger f14000e = new Messenger(new c(this, Looper.getMainLooper()));

    public a(Context context) {
        this.f13998b = context;
        this.f13999c = new b4.d(context);
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
                if (f13995i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f13995i = PendingIntent.getBroadcast(context, 0, intent2, l7.a.f15378a);
                }
                intent.putExtra("app", f13995i);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Task a(Bundle bundle) {
        String b10 = b();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.f13997a) {
            this.f13997a.put(b10, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f13999c.g() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        c(this.f13998b, intent);
        intent.putExtra("kid", "|ID|" + b10 + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f14000e);
        if (this.f14001f != null || this.f14002g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f14001f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.f14002g.f14006a;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            taskCompletionSource.getTask().addOnCompleteListener(m.f14027a, new aa.a((Object) this, b10, (Object) this.d.schedule(new q4(taskCompletionSource, 22), 30L, TimeUnit.SECONDS), 22));
            return taskCompletionSource.getTask();
        }
        if (this.f13999c.g() == 2) {
            this.f13998b.sendBroadcast(intent);
        } else {
            this.f13998b.startService(intent);
        }
        taskCompletionSource.getTask().addOnCompleteListener(m.f14027a, new aa.a((Object) this, b10, (Object) this.d.schedule(new q4(taskCompletionSource, 22), 30L, TimeUnit.SECONDS), 22));
        return taskCompletionSource.getTask();
    }

    public final void d(String str, Bundle bundle) {
        synchronized (this.f13997a) {
            try {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f13997a.remove(str);
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
