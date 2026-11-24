package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;
public final class ac3 implements of5, pf5 {
    public final e26 a;
    public final Context b;
    public final nv8 c;
    public final Set d;
    public final Executor e;

    public ac3(Context context, String str, Set set, nv8 nv8Var, Executor executor) {
        this.a = new e26(new or2(context, str, (byte) 1));
        this.d = set;
        this.e = executor;
        this.c = nv8Var;
        this.b = context;
    }

    public final synchronized int a() {
        long currentTimeMillis = System.currentTimeMillis();
        rf5 rf5Var = (rf5) this.a.get();
        if (rf5Var.g(currentTimeMillis)) {
            rf5Var.e();
            return 3;
        }
        return 1;
    }

    public final Task b() {
        boolean z;
        if (Build.VERSION.SDK_INT >= 24) {
            z = ki0.j(this.b);
        } else {
            z = true;
        }
        if (!z) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.e, new zb3(this, (byte) 0));
    }

    public final void c() {
        boolean z;
        if (this.d.size() <= 0) {
            Tasks.forResult(null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            z = ki0.j(this.b);
        } else {
            z = true;
        }
        if (!z) {
            Tasks.forResult(null);
            return;
        }
        Tasks.call(this.e, new zb3(this, (byte) 1));
    }
}
