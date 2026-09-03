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
    public final Context e;
    public i f5640f;
    public Executor f5641g;
    public CancellationSignal h;
    public final e f5642i;

    public b(Context context) {
        j.e(context, "context");
        this.e = context;
        this.f5642i = new e(this, new Handler(Looper.getMainLooper()), 3);
    }
}
