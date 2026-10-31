package e1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.i;
import v0.h;
public final class d extends b1.d {
    public final Context e;
    public h f6097f;
    public Executor f6098g;
    public CancellationSignal h;
    public final c1.c f6099i;

    public d(Context context) {
        i.e(context, "context");
        this.e = context;
        this.f6099i = new c1.c(this, new Handler(Looper.getMainLooper()), 2);
    }
}
