package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.Set;
public abstract class c05 {
    public final Context a;
    public final String b;
    public final gz c;
    public final zo d;
    public final wo e;
    public final gp f;
    public final Looper g;
    public final int h;
    public final z3d i;
    public final fgf j;
    public final i05 k;

    public c05(Context context, zo zoVar, wo woVar, b05 b05Var) {
        String str;
        ite.i(context, "Null context is not permitted.");
        ite.i(zoVar, "Api must not be null.");
        ite.i(b05Var, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        ite.i(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && i >= 30) {
            str = context.getAttributionTag();
        } else {
            str = null;
        }
        this.b = str;
        this.c = i >= 31 ? new gz(context.getAttributionSource()) : null;
        this.d = zoVar;
        this.e = woVar;
        this.g = b05Var.b;
        this.f = new gp(zoVar, woVar, str);
        this.i = new z3d(this);
        i05 e = i05.e(applicationContext);
        this.k = e;
        this.h = e.n.getAndIncrement();
        this.j = b05Var.a;
        q79 q79Var = e.y;
        q79Var.sendMessage(q79Var.obtainMessage(7, this));
    }

    public final mx6 a() {
        mx6 mx6Var = new mx6((byte) 24);
        Set set = Collections.EMPTY_SET;
        st stVar = (st) mx6Var.b;
        if (stVar == null) {
            stVar = new st(0);
            mx6Var.b = stVar;
        }
        stVar.addAll(set);
        Context context = this.a;
        mx6Var.d = context.getClass().getName();
        mx6Var.c = context.getPackageName();
        return mx6Var;
    }

    public final Task b(wm4 wm4Var) {
        ite.i(((j4d) wm4Var.b).a.b, "Listener has already been released.");
        xab xabVar = (xab) wm4Var.c;
        ite.i((u76) xabVar.b, "Listener has already been released.");
        j4d j4dVar = (j4d) wm4Var.b;
        i05 i05Var = this.k;
        i05Var.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        i05Var.c(taskCompletionSource, j4dVar.d, this);
        h4d h4dVar = new h4d(new u4d(new i4d(j4dVar, xabVar), taskCompletionSource), i05Var.r.get(), this);
        q79 q79Var = i05Var.y;
        q79Var.sendMessage(q79Var.obtainMessage(8, h4dVar));
        return taskCompletionSource.getTask();
    }

    public final Task c(u76 u76Var, int i) {
        ite.i(u76Var, "Listener key cannot be null.");
        i05 i05Var = this.k;
        i05Var.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        i05Var.c(taskCompletionSource, i, this);
        h4d h4dVar = new h4d(new u4d(u76Var, taskCompletionSource), i05Var.r.get(), this);
        q79 q79Var = i05Var.y;
        q79Var.sendMessage(q79Var.obtainMessage(13, h4dVar));
        return taskCompletionSource.getTask();
    }

    public final void d(int i, jh0 jh0Var) {
        jh0Var.l();
        i05 i05Var = this.k;
        i05Var.getClass();
        h4d h4dVar = new h4d(new q4d(i, jh0Var), i05Var.r.get(), this);
        q79 q79Var = i05Var.y;
        q79Var.sendMessage(q79Var.obtainMessage(4, h4dVar));
    }

    public final Task e(int i, cib cibVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        i05 i05Var = this.k;
        i05Var.getClass();
        i05Var.c(taskCompletionSource, cibVar.c, this);
        h4d h4dVar = new h4d(new x4d(i, cibVar, taskCompletionSource, this.j), i05Var.r.get(), this);
        q79 q79Var = i05Var.y;
        q79Var.sendMessage(q79Var.obtainMessage(4, h4dVar));
        return taskCompletionSource.getTask();
    }

    public c05(Context context, zo zoVar, wo woVar, fgf fgfVar) {
        this(context, zoVar, woVar, new b05(fgfVar, Looper.getMainLooper()));
    }
}
