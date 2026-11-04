package e1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import v0.h;
public final class d extends b1.d {
    public final Context f9322e;
    public h f9323f;
    public Executor f9324g;
    public CancellationSignal h;
    public final c1.d f9325i;

    public d(Context context) {
        j.e(context, "context");
        this.f9322e = context;
        this.f9325i = new c1.d(this, new Handler(Looper.getMainLooper()), 2);
    }
}
