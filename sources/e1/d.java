package e1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import v0.i;
public final class d extends b1.d {
    public final Context f8517e;
    public i f8518f;
    public Executor f8519g;
    public CancellationSignal h;
    public final c1.d f8520i;

    public d(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        this.f8517e = context;
        this.f8520i = new c1.d(this, new Handler(Looper.getMainLooper()), 2);
    }
}
