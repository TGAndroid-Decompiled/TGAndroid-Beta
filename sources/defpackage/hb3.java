package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;
public final class hb3 implements rf5, sf5 {
    public final i26 a;
    public final Context b;
    public final vw8 c;
    public final Set d;
    public final Executor e;

    public hb3(Context context, String str, Set set, vw8 vw8Var, Executor executor) {
        this.a = new i26(new wq2(context, str, (byte) 1));
        this.d = set;
        this.e = executor;
        this.c = vw8Var;
        this.b = context;
    }

    public final synchronized int a() {
        long currentTimeMillis = System.currentTimeMillis();
        uf5 uf5Var = (uf5) this.a.get();
        if (uf5Var.g(currentTimeMillis)) {
            uf5Var.e();
            return 3;
        }
        return 1;
    }

    public final Task b() {
        boolean z;
        if (Build.VERSION.SDK_INT >= 24) {
            z = lh0.j(this.b);
        } else {
            z = true;
        }
        if (!z) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.e, new gb3(this, (byte) 0));
    }

    public final void c() {
        boolean z;
        if (this.d.size() <= 0) {
            Tasks.forResult(null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            z = lh0.j(this.b);
        } else {
            z = true;
        }
        if (!z) {
            Tasks.forResult(null);
            return;
        }
        Tasks.call(this.e, new gb3(this, (byte) 1));
    }
}
