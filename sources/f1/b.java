package f1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import b1.d;
import c1.e;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import v0.i;
public final class b extends d {
    public final Context f5721e;
    public i f5722f;
    public Executor f5723g;
    public CancellationSignal h;
    public final e f5724i;

    public b(Context context) {
        j.e(context, "context");
        this.f5721e = context;
        this.f5724i = new e(this, new Handler(Looper.getMainLooper()), 3);
    }
}
