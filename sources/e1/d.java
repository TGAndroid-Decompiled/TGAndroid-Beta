package e1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import v0.i;
public final class d extends b1.d {
    public final Context e;
    public i f7169f;
    public Executor f7170g;
    public CancellationSignal h;
    public final c1.d f7171i;

    public d(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        this.e = context;
        this.f7171i = new c1.d(this, new Handler(Looper.getMainLooper()), 2);
    }
}
