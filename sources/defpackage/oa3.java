package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;
public final class oa3 implements qd5, rd5 {
    public final e06 a;
    public final Context b;
    public final mt8 c;
    public final Set d;
    public final Executor e;

    public oa3(Context context, String str, Set set, mt8 mt8Var, Executor executor) {
        this.a = new e06(new dq2(context, str, (byte) 1));
        this.d = set;
        this.e = executor;
        this.c = mt8Var;
        this.b = context;
    }

    public final synchronized int a() {
        long currentTimeMillis = System.currentTimeMillis();
        td5 td5Var = (td5) this.a.get();
        if (td5Var.g(currentTimeMillis)) {
            td5Var.e();
            return 3;
        }
        return 1;
    }

    public final Task b() {
        boolean z;
        if (Build.VERSION.SDK_INT >= 24) {
            z = kh0.j(this.b);
        } else {
            z = true;
        }
        if (!z) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.e, new na3(this, (byte) 0));
    }

    public final void c() {
        boolean z;
        if (this.d.size() <= 0) {
            Tasks.forResult(null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            z = kh0.j(this.b);
        } else {
            z = true;
        }
        if (!z) {
            Tasks.forResult(null);
            return;
        }
        Tasks.call(this.e, new na3(this, (byte) 1));
    }
}
