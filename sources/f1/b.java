package f1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import b1.d;
import c1.c;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.i;
import v0.h;
public final class b extends d {
    public final Context e;
    public h f6725f;
    public Executor f6726g;
    public CancellationSignal h;
    public final c f6727i;

    public b(Context context) {
        i.e(context, "context");
        this.e = context;
        this.f6727i = new c(this, new Handler(Looper.getMainLooper()), 3);
    }
}
