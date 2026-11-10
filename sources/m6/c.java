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
import f5.r;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import m.f3;
import org.telegram.ui.Cells.f1;
public final class c {
    public static int h;
    public static PendingIntent f19893i;
    public static final Pattern f19894j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context f19896b;
    public final cc.c f19897c;
    public final ScheduledThreadPoolExecutor d;
    public Messenger f19899f;
    public g f19900g;
    public final a0.l f19895a = new a0.l(0);
    public final Messenger f19898e = new Messenger(new o(this, Looper.getMainLooper()));

    public c(Context context) {
        this.f19896b = context;
        this.f19897c = new cc.c(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new r("fcm-rpc-timeout-executor"));
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    public static synchronized void a(Context context, Intent intent) {
        synchronized (c.class) {
            try {
                if (f19893i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f19893i = PendingIntent.getBroadcast(context, 0, intent2, o7.e.f20861a);
                }
                intent.putExtra("app", f19893i);
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
        a0.l lVar = this.f19895a;
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
        a0.l lVar = this.f19895a;
        synchronized (lVar) {
            lVar.put(c10, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f19897c.h() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        a(this.f19896b, intent);
        intent.putExtra("kid", f1.n("|ID|", c10, "|", new StringBuilder(String.valueOf(c10).length() + 5)));
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f19898e);
        if (this.f19899f != null || this.f19900g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f19899f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f19900g.f19905a.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            taskCompletionSource.getTask().addOnCompleteListener(d.f19901b, new h6.m(this, c10, this.d.schedule(new f3(taskCompletionSource, 1), 30L, TimeUnit.SECONDS), 14));
            return taskCompletionSource.getTask();
        }
        if (this.f19897c.h() == 2) {
            Context context = this.f19896b;
            if (Build.VERSION.SDK_INT < 34) {
                context.sendBroadcast(intent);
            } else {
                context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
            }
        } else {
            this.f19896b.startService(intent);
        }
        taskCompletionSource.getTask().addOnCompleteListener(d.f19901b, new h6.m(this, c10, this.d.schedule(new f3(taskCompletionSource, 1), 30L, TimeUnit.SECONDS), 14));
        return taskCompletionSource.getTask();
    }
}
