package f1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import b1.d;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import v0.i;
public final class b extends d {
    public final Context f6264e;
    public i f6265f;
    public Executor f6266g;
    public CancellationSignal h;
    public final c1.d f6267i;

    public b(Context context) {
        j.e(context, "context");
        this.f6264e = context;
        this.f6267i = new c1.d(this, new Handler(Looper.getMainLooper()), 3);
    }
}
