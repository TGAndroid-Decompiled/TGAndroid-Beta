package g1;

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
    public final Context f13079e;
    public g f13080f;
    public Executor f13081g;
    public CancellationSignal h;
    public final e f13082i;

    public a(Context context) {
        j.e(context, "context");
        this.f13079e = context;
        this.f13082i = new e(this, new Handler(Looper.getMainLooper()), 4);
    }
}
