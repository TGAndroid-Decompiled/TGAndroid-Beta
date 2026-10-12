package f1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import b1.d;
import java.util.concurrent.Executor;
import v0.i;
public final class b extends d {
    public final Context e;
    public i f8831f;
    public Executor f8832g;
    public CancellationSignal h;
    public final c1.d f8833i;

    public b(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        this.e = context;
        this.f8833i = new c1.d(this, new Handler(Looper.getMainLooper()), 3);
    }
}
