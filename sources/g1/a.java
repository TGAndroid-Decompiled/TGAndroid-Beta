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
    public final Context f12762e;
    public g f12763f;
    public Executor f12764g;
    public CancellationSignal h;
    public final e f12765i;

    public a(Context context) {
        j.e(context, "context");
        this.f12762e = context;
        this.f12765i = new e(this, new Handler(Looper.getMainLooper()), 4);
    }
}
