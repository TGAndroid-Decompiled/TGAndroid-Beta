package f1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import b1.d;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import v0.i;

public final class b extends d {

    public final Context f5607e;

    public i f5608f;

    public Executor f5609g;
    public CancellationSignal h;

    public final c1.d f5610i;

    public b(Context context) {
        j.e(context, "context");
        this.f5607e = context;
        this.f5610i = new c1.d(this, new Handler(Looper.getMainLooper()), 3);
    }
}
