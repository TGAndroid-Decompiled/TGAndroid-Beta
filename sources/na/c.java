package na;

import android.content.Context;
import android.os.Build;
import androidx.emoji2.text.v;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;
public final class c implements e, f {
    public final k9.d f16865a;
    public final Context f16866b;
    public final pa.b f16867c;
    public final Set d;
    public final Executor f16868e;

    public c(Context context, String str, Set set, pa.b bVar, Executor executor) {
        this.f16865a = new k9.d(context, str);
        this.d = set;
        this.f16868e = executor;
        this.f16867c = bVar;
        this.f16866b = context;
    }

    public final synchronized int a() {
        long currentTimeMillis = System.currentTimeMillis();
        g gVar = (g) this.f16865a.get();
        if (gVar.i(currentTimeMillis)) {
            gVar.g();
            return 3;
        }
        return 1;
    }

    public final Task b() {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 24) {
            z10 = v.g(this.f16866b);
        } else {
            z10 = true;
        }
        if (!z10) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f16868e, new b(this, 0));
    }

    public final void c() {
        boolean z10;
        if (this.d.size() <= 0) {
            Tasks.forResult(null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            z10 = v.g(this.f16866b);
        } else {
            z10 = true;
        }
        if (!z10) {
            Tasks.forResult(null);
            return;
        }
        Tasks.call(this.f16868e, new b(this, 1));
    }
}
