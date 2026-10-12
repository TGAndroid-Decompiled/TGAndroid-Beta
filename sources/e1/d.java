package e1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import v0.i;
public final class d extends b1.d {
    public final Context f8507e;
    public i f8508f;
    public Executor f8509g;
    public CancellationSignal h;
    public final c1.d f8510i;

    public d(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        this.f8507e = context;
        this.f8510i = new c1.d(this, new Handler(Looper.getMainLooper()), 2);
    }
}
