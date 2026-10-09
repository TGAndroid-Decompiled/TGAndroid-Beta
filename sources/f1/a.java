package f1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import b1.d;
import java.util.concurrent.Executor;
import v0.i;
public final class a extends d {
    public final Context f9554e;
    public i f9555f;
    public Executor f9556g;
    public CancellationSignal h;
    public final c1.d f9557i;

    public a(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        this.f9554e = context;
        this.f9557i = new c1.d(this, new Handler(Looper.getMainLooper()), 3);
    }
}
