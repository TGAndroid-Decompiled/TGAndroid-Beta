package e1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import v0.i;
public final class d extends b1.d {
    public final Context e;
    public i f8306f;
    public Executor f8307g;
    public CancellationSignal h;
    public final c1.d f8308i;

    public d(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        this.e = context;
        this.f8308i = new c1.d(this, new Handler(Looper.getMainLooper()), 2);
    }
}
