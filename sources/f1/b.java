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
    public i f7676f;
    public Executor f7677g;
    public CancellationSignal h;
    public final c1.d f7678i;

    public b(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        this.e = context;
        this.f7678i = new c1.d(this, new Handler(Looper.getMainLooper()), 3);
    }
}
