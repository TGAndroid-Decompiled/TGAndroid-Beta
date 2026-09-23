package e1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import v0.i;
public final class d extends b1.d {
    public final Context e;
    public i f7852f;
    public Executor f7853g;
    public CancellationSignal h;
    public final c1.d f7854i;

    public d(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        this.e = context;
        this.f7854i = new c1.d(this, new Handler(Looper.getMainLooper()), 2);
    }
}
