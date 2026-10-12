package j6;

import ai.r4;
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
    public static PendingIntent f14029i;
    public static final Pattern f14030j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context f14032b;
    public final b4.d f14033c;
    public final ScheduledThreadPoolExecutor d;
    public Messenger f14035f;
    public f f14036g;
    public final a0.m f14031a = new a0.m(0);
    public final Messenger f14034e = new Messenger(new c(this, Looper.getMainLooper()));

    public a(Context context) {
        this.f14032b = context;
        this.f14033c = new b4.d(context);
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
                if (f14029i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f14029i = PendingIntent.getBroadcast(context, 0, intent2, l7.a.f15191a);
                }
                intent.putExtra("app", f14029i);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Task a(Bundle bundle) {
        String b10 = b();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.f14031a) {
            this.f14031a.put(b10, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f14033c.g() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        c(this.f14032b, intent);
        intent.putExtra("kid", "|ID|" + b10 + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f14034e);
        if (this.f14035f != null || this.f14036g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f14035f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.f14036g.f14040a;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            taskCompletionSource.getTask().addOnCompleteListener(m.f14061a, new aa.a(22, this, this.d.schedule(new r4(taskCompletionSource, 22), 30L, TimeUnit.SECONDS), b10));
            return taskCompletionSource.getTask();
        }
        if (this.f14033c.g() == 2) {
            this.f14032b.sendBroadcast(intent);
        } else {
            this.f14032b.startService(intent);
        }
        taskCompletionSource.getTask().addOnCompleteListener(m.f14061a, new aa.a(22, this, this.d.schedule(new r4(taskCompletionSource, 22), 30L, TimeUnit.SECONDS), b10));
        return taskCompletionSource.getTask();
    }

    public final void d(String str, Bundle bundle) {
        synchronized (this.f14031a) {
            try {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f14031a.remove(str);
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
