package f1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import b1.d;
import c1.e;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import v0.g;
public final class a extends d {
    public final Context f11045e;
    public g f11046f;
    public Executor f11047g;
    public CancellationSignal h;
    public final e f11048i;

    public a(Context context) {
        j.e(context, "context");
        this.f11045e = context;
        this.f11048i = new e(this, new Handler(Looper.getMainLooper()), 3);
    }
}
