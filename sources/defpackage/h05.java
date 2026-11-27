package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.Set;
public abstract class h05 {
    public final Context a;
    public final String b;
    public final hy c;
    public final zn d;
    public final wn e;
    public final ho f;
    public final Looper g;
    public final int h;
    public final o6d i;
    public final uif j;
    public final n05 k;

    public h05(Context context, zn znVar, wn wnVar, g05 g05Var) {
        String str;
        xve.i(context, "Null context is not permitted.");
        xve.i(znVar, "Api must not be null.");
        xve.i(g05Var, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        xve.i(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && i >= 30) {
            str = context.getAttributionTag();
        } else {
            str = null;
        }
        this.b = str;
        this.c = i >= 31 ? new hy(context.getAttributionSource()) : null;
        this.d = znVar;
        this.e = wnVar;
        this.g = g05Var.b;
        this.f = new ho(znVar, wnVar, str);
        this.i = new o6d(this);
        n05 e = n05.e(applicationContext);
        this.k = e;
        this.h = e.n.getAndIncrement();
        this.j = g05Var.a;
        b99 b99Var = e.y;
        b99Var.sendMessage(b99Var.obtainMessage(7, this));
    }

    public final rx6 a() {
        rx6 rx6Var = new rx6((byte) 24);
        Set set = Collections.EMPTY_SET;
        ss ssVar = (ss) rx6Var.b;
        if (ssVar == null) {
            ssVar = new ss(0);
            rx6Var.b = ssVar;
        }
        ssVar.addAll(set);
        Context context = this.a;
        rx6Var.d = context.getClass().getName();
        rx6Var.c = context.getPackageName();
        return rx6Var;
    }

    public final Task b(um4 um4Var) {
        xve.i(((y6d) um4Var.b).a.b, "Listener has already been released.");
        k7b k7bVar = (k7b) um4Var.c;
        xve.i((y76) k7bVar.b, "Listener has already been released.");
        y6d y6dVar = (y6d) um4Var.b;
        n05 n05Var = this.k;
        n05Var.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        n05Var.c(taskCompletionSource, y6dVar.d, this);
        w6d w6dVar = new w6d(new j7d(new x6d(y6dVar, k7bVar), taskCompletionSource), n05Var.r.get(), this);
        b99 b99Var = n05Var.y;
        b99Var.sendMessage(b99Var.obtainMessage(8, w6dVar));
        return taskCompletionSource.getTask();
    }

    public final Task c(y76 y76Var, int i) {
        xve.i(y76Var, "Listener key cannot be null.");
        n05 n05Var = this.k;
        n05Var.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        n05Var.c(taskCompletionSource, i, this);
        w6d w6dVar = new w6d(new j7d(y76Var, taskCompletionSource), n05Var.r.get(), this);
        b99 b99Var = n05Var.y;
        b99Var.sendMessage(b99Var.obtainMessage(13, w6dVar));
        return taskCompletionSource.getTask();
    }

    public final void d(int i, jg0 jg0Var) {
        jg0Var.l();
        n05 n05Var = this.k;
        n05Var.getClass();
        w6d w6dVar = new w6d(new f7d(i, jg0Var), n05Var.r.get(), this);
        b99 b99Var = n05Var.y;
        b99Var.sendMessage(b99Var.obtainMessage(4, w6dVar));
    }

    public final Task e(int i, xjb xjbVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        n05 n05Var = this.k;
        n05Var.getClass();
        n05Var.c(taskCompletionSource, xjbVar.c, this);
        w6d w6dVar = new w6d(new m7d(i, xjbVar, taskCompletionSource, this.j), n05Var.r.get(), this);
        b99 b99Var = n05Var.y;
        b99Var.sendMessage(b99Var.obtainMessage(4, w6dVar));
        return taskCompletionSource.getTask();
    }

    public h05(Context context, zn znVar, wn wnVar, uif uifVar) {
        this(context, znVar, wnVar, new g05(uifVar, Looper.getMainLooper()));
    }
}
