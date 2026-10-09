package e1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import v0.i;
public final class d extends b1.d {
    public final Context f8510e;
    public i f8511f;
    public Executor f8512g;
    public CancellationSignal h;
    public final c1.d f8513i;

    public d(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        this.f8510e = context;
        this.f8513i = new c1.d(this, new Handler(Looper.getMainLooper()), 2);
    }
}
