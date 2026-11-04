package f1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import b1.d;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import v0.h;
public final class a extends d {
    public final Context f11335e;
    public h f11336f;
    public Executor f11337g;
    public CancellationSignal h;
    public final c1.d f11338i;

    public a(Context context) {
        j.e(context, "context");
        this.f11335e = context;
        this.f11338i = new c1.d(this, new Handler(Looper.getMainLooper()), 3);
    }
}
