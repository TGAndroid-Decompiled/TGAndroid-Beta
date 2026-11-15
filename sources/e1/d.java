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
    public final Context f9974e;
    public g f9975f;
    public Executor f9976g;
    public CancellationSignal h;
    public final e f9977i;

    public d(Context context) {
        j.e(context, "context");
        this.f9974e = context;
        this.f9977i = new e(this, new Handler(Looper.getMainLooper()), 2);
    }
}
