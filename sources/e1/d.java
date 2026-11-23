package e1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import c1.e;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import v0.g;
public final class d extends b1.d {
    public final Context f10282e;
    public g f10283f;
    public Executor f10284g;
    public CancellationSignal h;
    public final e f10285i;

    public d(Context context) {
        j.e(context, "context");
        this.f10282e = context;
        this.f10285i = new e(this, new Handler(Looper.getMainLooper()), 2);
    }
}
