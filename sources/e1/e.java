package e1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import v0.i;
public final class e extends b1.d {
    public final Context e;
    public i f9618f;
    public Executor f9619g;
    public CancellationSignal h;
    public final c1.d f9620i;

    public e(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        this.e = context;
        this.f9620i = new c1.d(this, new Handler(Looper.getMainLooper()), 2);
    }
}
