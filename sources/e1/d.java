package e1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import c1.e;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import v0.i;
public final class d extends b1.d {
    public final Context e;
    public i f5051f;
    public Executor f5052g;
    public CancellationSignal h;
    public final e f5053i;

    public d(Context context) {
        j.e(context, "context");
        this.e = context;
        this.f5053i = new e(this, new Handler(Looper.getMainLooper()), 2);
    }
}
