package l6;

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
import e5.r;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.telegram.ui.Cells.f1;
public final class c {
    public static int h;
    public static PendingIntent f18057i;
    public static final Pattern f18058j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context f18060b;
    public final d4.d f18061c;
    public final ScheduledThreadPoolExecutor d;
    public Messenger f18063f;
    public f f18064g;
    public final a0.l f18059a = new a0.l(0);
    public final Messenger f18062e = new Messenger(new o(this, Looper.getMainLooper()));

    public c(Context context) {
        this.f18060b = context;
        this.f18061c = new d4.d(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new r("fcm-rpc-timeout-executor"));
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    public static synchronized void a(Context context, Intent intent) {
        synchronized (c.class) {
            try {
                if (f18057i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f18057i = PendingIntent.getBroadcast(context, 0, intent2, n7.e.f20275a);
                }
                intent.putExtra("app", f18057i);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized String c() {
        String num;
        synchronized (c.class) {
            int i3 = h;
            h = i3 + 1;
            num = Integer.toString(i3);
        }
        return num;
    }

    public final void b(String str, Bundle bundle) {
        a0.l lVar = this.f18059a;
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
        String c2 = c();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a0.l lVar = this.f18059a;
        synchronized (lVar) {
            lVar.put(c2, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f18061c.h() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        a(this.f18060b, intent);
        intent.putExtra("kid", f1.r("|ID|", c2, "|", new StringBuilder(String.valueOf(c2).length() + 5)));
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f18062e);
        if (this.f18063f != null || this.f18064g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f18063f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f18064g.f18068a.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            taskCompletionSource.getTask().addOnCompleteListener(d.f18065b, new k4.j(this, c2, this.d.schedule(new a3.o(taskCompletionSource, 27), 30L, TimeUnit.SECONDS)));
            return taskCompletionSource.getTask();
        }
        if (this.f18061c.h() == 2) {
            Context context = this.f18060b;
            if (Build.VERSION.SDK_INT < 34) {
                context.sendBroadcast(intent);
            } else {
                context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
            }
        } else {
            this.f18060b.startService(intent);
        }
        taskCompletionSource.getTask().addOnCompleteListener(d.f18065b, new k4.j(this, c2, this.d.schedule(new a3.o(taskCompletionSource, 27), 30L, TimeUnit.SECONDS)));
        return taskCompletionSource.getTask();
    }
}
