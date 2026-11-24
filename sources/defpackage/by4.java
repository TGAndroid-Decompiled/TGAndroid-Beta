package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.Set;
public abstract class by4 {
    public final Context a;
    public final String b;
    public final gy c;
    public final yn d;
    public final vn e;
    public final go f;
    public final Looper g;
    public final int h;
    public final x1d i;
    public final eef j;
    public final hy4 k;

    public by4(Context context, yn ynVar, vn vnVar, ay4 ay4Var) {
        String str;
        fre.i(context, "Null context is not permitted.");
        fre.i(ynVar, "Api must not be null.");
        fre.i(ay4Var, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        fre.i(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && i >= 30) {
            str = context.getAttributionTag();
        } else {
            str = null;
        }
        this.b = str;
        this.c = i >= 31 ? new gy(context.getAttributionSource()) : null;
        this.d = ynVar;
        this.e = vnVar;
        this.g = ay4Var.b;
        this.f = new go(ynVar, vnVar, str);
        this.i = new x1d(this);
        hy4 e = hy4.e(applicationContext);
        this.k = e;
        this.h = e.n.getAndIncrement();
        this.j = ay4Var.a;
        o59 o59Var = e.y;
        o59Var.sendMessage(o59Var.obtainMessage(7, this));
    }

    public final mv6 a() {
        mv6 mv6Var = new mv6((byte) 24);
        Set set = Collections.EMPTY_SET;
        rs rsVar = (rs) mv6Var.b;
        if (rsVar == null) {
            rsVar = new rs(0);
            mv6Var.b = rsVar;
        }
        rsVar.addAll(set);
        Context context = this.a;
        mv6Var.d = context.getClass().getName();
        mv6Var.c = context.getPackageName();
        return mv6Var;
    }

    public final Task b(wk4 wk4Var) {
        fre.i(((h2d) wk4Var.b).a.b, "Listener has already been released.");
        v8b v8bVar = (v8b) wk4Var.c;
        fre.i((u56) v8bVar.b, "Listener has already been released.");
        h2d h2dVar = (h2d) wk4Var.b;
        hy4 hy4Var = this.k;
        hy4Var.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        hy4Var.c(taskCompletionSource, h2dVar.d, this);
        f2d f2dVar = new f2d(new s2d(new g2d(h2dVar, v8bVar), taskCompletionSource), hy4Var.r.get(), this);
        o59 o59Var = hy4Var.y;
        o59Var.sendMessage(o59Var.obtainMessage(8, f2dVar));
        return taskCompletionSource.getTask();
    }

    public final Task c(u56 u56Var, int i) {
        fre.i(u56Var, "Listener key cannot be null.");
        hy4 hy4Var = this.k;
        hy4Var.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        hy4Var.c(taskCompletionSource, i, this);
        f2d f2dVar = new f2d(new s2d(u56Var, taskCompletionSource), hy4Var.r.get(), this);
        o59 o59Var = hy4Var.y;
        o59Var.sendMessage(o59Var.obtainMessage(13, f2dVar));
        return taskCompletionSource.getTask();
    }

    public final void d(int i, ig0 ig0Var) {
        ig0Var.l();
        hy4 hy4Var = this.k;
        hy4Var.getClass();
        f2d f2dVar = new f2d(new o2d(i, ig0Var), hy4Var.r.get(), this);
        o59 o59Var = hy4Var.y;
        o59Var.sendMessage(o59Var.obtainMessage(4, f2dVar));
    }

    public final Task e(int i, bgb bgbVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        hy4 hy4Var = this.k;
        hy4Var.getClass();
        hy4Var.c(taskCompletionSource, bgbVar.c, this);
        f2d f2dVar = new f2d(new v2d(i, bgbVar, taskCompletionSource, this.j), hy4Var.r.get(), this);
        o59 o59Var = hy4Var.y;
        o59Var.sendMessage(o59Var.obtainMessage(4, f2dVar));
        return taskCompletionSource.getTask();
    }

    public by4(Context context, yn ynVar, vn vnVar, eef eefVar) {
        this(context, ynVar, vnVar, new ay4(eefVar, Looper.getMainLooper()));
    }
}
