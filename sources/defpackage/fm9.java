package defpackage;

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
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class fm9 {
    public static int h;
    public static PendingIntent i;
    public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context b;
    public final zgf c;
    public final ScheduledThreadPoolExecutor d;
    public Messenger f;
    public hnd g;
    public final aia a = new aia(0);
    public final Messenger e = new Messenger(new phf(this, Looper.getMainLooper()));

    public fm9(Context context) {
        this.b = context;
        this.c = new zgf(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new kn7("fcm-rpc-timeout-executor"));
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    public static synchronized void a(Context context, Intent intent) {
        synchronized (fm9.class) {
            PendingIntent pendingIntent = i;
            if (pendingIntent == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, gbf.a);
                i = pendingIntent;
            }
            intent.putExtra("app", pendingIntent);
        }
    }

    public static synchronized String c() {
        String num;
        synchronized (fm9.class) {
            int i2 = h;
            h = i2 + 1;
            num = Integer.toString(i2);
        }
        return num;
    }

    public final void b(String str, Bundle bundle) {
        aia aiaVar = this.a;
        synchronized (aiaVar) {
            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) aiaVar.remove(str);
            if (taskCompletionSource == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
                sb.append("Missing callback for ");
                sb.append(str);
                Log.w("Rpc", sb.toString());
                return;
            }
            taskCompletionSource.setResult(bundle);
        }
    }

    public final Task d(Bundle bundle) {
        String c = c();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        aia aiaVar = this.a;
        synchronized (aiaVar) {
            aiaVar.put(c, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.c.a() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        a(this.b, intent);
        intent.putExtra("kid", ls6.o("|ID|", c, "|", new StringBuilder(String.valueOf(c).length() + 5)));
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.e);
        if (this.f != null || this.g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.g.a.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            taskCompletionSource.getTask().addOnCompleteListener(wn3.d, new vk9(this, c, this.d.schedule(new xia(taskCompletionSource, (byte) 26), 30L, TimeUnit.SECONDS), (byte) 18));
            return taskCompletionSource.getTask();
        }
        int a = this.c.a();
        Context context = this.b;
        if (a == 2) {
            if (Build.VERSION.SDK_INT < 34) {
                context.sendBroadcast(intent);
            } else {
                context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
            }
        } else {
            context.startService(intent);
        }
        taskCompletionSource.getTask().addOnCompleteListener(wn3.d, new vk9(this, c, this.d.schedule(new xia(taskCompletionSource, (byte) 26), 30L, TimeUnit.SECONDS), (byte) 18));
        return taskCompletionSource.getTask();
    }
}
