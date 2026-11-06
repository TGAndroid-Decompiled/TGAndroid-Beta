package e1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import v0.g;
public final class d extends b1.d {
    public final Context f10138e;
    public g f10139f;
    public Executor f10140g;
    public CancellationSignal h;
    public final c1.d f10141i;

    public d(Context context) {
        j.e(context, "context");
        this.f10138e = context;
        this.f10141i = new c1.d(this, new Handler(Looper.getMainLooper()), 2);
    }
}
