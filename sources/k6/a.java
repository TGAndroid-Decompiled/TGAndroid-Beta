package k6;

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
    public static PendingIntent f16395i;
    public static final Pattern f16396j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context f16398b;
    public final b4.d f16399c;
    public final ScheduledThreadPoolExecutor d;
    public Messenger f16400f;
    public g f16401g;
    public final a0.l f16397a = new a0.l(0);
    public final Messenger e = new Messenger(new d(this, Looper.getMainLooper()));

    public a(Context context) {
        this.f16398b = context;
        this.f16399c = new b4.d(context);
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
                if (f16395i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f16395i = PendingIntent.getBroadcast(context, 0, intent2, m7.a.f18360a);
                }
                intent.putExtra("app", f16395i);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Task a(Bundle bundle) {
        String b10 = b();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.f16397a) {
            this.f16397a.put(b10, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f16399c.g() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        c(this.f16398b, intent);
        intent.putExtra("kid", "|ID|" + b10 + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.e);
        if (this.f16400f != null || this.f16401g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f16400f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.f16401g.f16408a;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            taskCompletionSource.getTask().addOnCompleteListener(n.f16425a, new c(this, b10, this.d.schedule(new a5.d(taskCompletionSource, 26), 30L, TimeUnit.SECONDS), 0));
            return taskCompletionSource.getTask();
        }
        if (this.f16399c.g() == 2) {
            this.f16398b.sendBroadcast(intent);
        } else {
            this.f16398b.startService(intent);
        }
        taskCompletionSource.getTask().addOnCompleteListener(n.f16425a, new c(this, b10, this.d.schedule(new a5.d(taskCompletionSource, 26), 30L, TimeUnit.SECONDS), 0));
        return taskCompletionSource.getTask();
    }

    public final void d(String str, Bundle bundle) {
        synchronized (this.f16397a) {
            try {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f16397a.remove(str);
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
