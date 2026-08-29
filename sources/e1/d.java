package e1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import v0.i;
public final class d extends b1.d {
    public final Context f5768e;
    public i f5769f;
    public Executor f5770g;
    public CancellationSignal h;
    public final c1.d f5771i;

    public d(Context context) {
        j.e(context, "context");
        this.f5768e = context;
        this.f5771i = new c1.d(this, new Handler(Looper.getMainLooper()), 2);
    }
}
