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
    public final Context f11048e;
    public g f11049f;
    public Executor f11050g;
    public CancellationSignal h;
    public final e f11051i;

    public a(Context context) {
        j.e(context, "context");
        this.f11048e = context;
        this.f11051i = new e(this, new Handler(Looper.getMainLooper()), 3);
    }
}
