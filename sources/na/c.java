package na;

import android.content.Context;
import android.os.Build;
import androidx.emoji2.text.v;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;
public final class c implements e, f {
    public final k9.d f16829a;
    public final Context f16830b;
    public final pa.b f16831c;
    public final Set d;
    public final Executor f16832e;

    public c(Context context, String str, Set set, pa.b bVar, Executor executor) {
        this.f16829a = new k9.d(context, str);
        this.d = set;
        this.f16832e = executor;
        this.f16831c = bVar;
        this.f16830b = context;
    }

    public final synchronized int a() {
        long currentTimeMillis = System.currentTimeMillis();
        g gVar = (g) this.f16829a.get();
        if (gVar.i(currentTimeMillis)) {
            gVar.g();
            return 3;
        }
        return 1;
    }

    public final Task b() {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 24) {
            z10 = v.g(this.f16830b);
        } else {
            z10 = true;
        }
        if (!z10) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f16832e, new b(this, 0));
    }

    public final void c() {
        boolean z10;
        if (this.d.size() <= 0) {
            Tasks.forResult(null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            z10 = v.g(this.f16830b);
        } else {
            z10 = true;
        }
        if (!z10) {
            Tasks.forResult(null);
            return;
        }
        Tasks.call(this.f16832e, new b(this, 1));
    }
}
