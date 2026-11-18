package m6;

import android.app.BroadcastOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import f5.s;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class c {
    public static int h;
    public static PendingIntent f20846i;
    public static final Pattern f20847j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context f20849b;
    public final cc.c f20850c;
    public final ScheduledThreadPoolExecutor d;
    public Messenger f20852f;
    public g f20853g;
    public final a0.l f20848a = new a0.l(0);
    public final Messenger f20851e = new Messenger(new o(this, Looper.getMainLooper()));

    public c(Context context) {
        this.f20849b = context;
        this.f20850c = new cc.c(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new s("fcm-rpc-timeout-executor"));
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    public static synchronized void a(Context context, Intent intent) {
        synchronized (c.class) {
            try {
                if (f20846i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f20846i = PendingIntent.getBroadcast(context, 0, intent2, o7.e.f21741a);
                }
                intent.putExtra("app", f20846i);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized String c() {
        String num;
        synchronized (c.class) {
            int i7 = h;
            h = i7 + 1;
            num = Integer.toString(i7);
        }
        return num;
    }

    public final void b(String str, Bundle bundle) {
        a0.l lVar = this.f20848a;
        synchronized (lVar) {
            try {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) lVar.remove(str);
                if (taskCompletionSource == null) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 21);
                    sb2.append("Missing callback for ");
                    sb2.append(str);
                    Log.w("Rpc", sb2.toString());
                    return;
                }
                taskCompletionSource.setResult(bundle);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Task d(Bundle bundle) {
        String c10 = c();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a0.l lVar = this.f20848a;
        synchronized (lVar) {
            lVar.put(c10, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f20850c.h() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        a(this.f20849b, intent);
        intent.putExtra("kid", p5.c.m("|ID|", c10, "|", new StringBuilder(String.valueOf(c10).length() + 5)));
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f20851e);
        if (this.f20852f != null || this.f20853g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f20852f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f20853g.f20858a.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            taskCompletionSource.getTask().addOnCompleteListener(d.f20854b, new h6.m(this, c10, this.d.schedule(new j6.o(taskCompletionSource, 3), 30L, TimeUnit.SECONDS), false, 14));
            return taskCompletionSource.getTask();
        }
        if (this.f20850c.h() == 2) {
            Context context = this.f20849b;
            if (Build.VERSION.SDK_INT < 34) {
                context.sendBroadcast(intent);
            } else {
                context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
            }
        } else {
            this.f20849b.startService(intent);
        }
        taskCompletionSource.getTask().addOnCompleteListener(d.f20854b, new h6.m(this, c10, this.d.schedule(new j6.o(taskCompletionSource, 3), 30L, TimeUnit.SECONDS), false, 14));
        return taskCompletionSource.getTask();
    }
}
