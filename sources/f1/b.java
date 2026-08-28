package f1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import b1.d;
import java.util.concurrent.Executor;
import v0.i;
public final class b extends d {
    public final Context f5302e;
    public i f5303f;
    public Executor f5304g;
    public CancellationSignal h;
    public final c1.d f5305i;

    public b(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        this.f5302e = context;
        this.f5305i = new c1.d(this, new Handler(Looper.getMainLooper()), 3);
    }
}
