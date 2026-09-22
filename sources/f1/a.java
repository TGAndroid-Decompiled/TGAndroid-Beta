package f1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import b1.d;
import java.util.concurrent.Executor;
import v0.i;
public final class a extends d {
    public final Context e;
    public i f8791f;
    public Executor f8792g;
    public CancellationSignal h;
    public final c1.d f8793i;

    public a(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        this.e = context;
        this.f8793i = new c1.d(this, new Handler(Looper.getMainLooper()), 3);
    }
}
