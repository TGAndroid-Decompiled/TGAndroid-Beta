package e1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import v0.g;
public final class d extends b1.d {
    public final Context f10143e;
    public g f10144f;
    public Executor f10145g;
    public CancellationSignal h;
    public final c1.d f10146i;

    public d(Context context) {
        j.e(context, "context");
        this.f10143e = context;
        this.f10146i = new c1.d(this, new Handler(Looper.getMainLooper()), 2);
    }
}
