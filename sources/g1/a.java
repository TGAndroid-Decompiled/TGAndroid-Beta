package g1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import b1.d;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import v0.g;
public final class a extends d {
    public final Context f13412e;
    public g f13413f;
    public Executor f13414g;
    public CancellationSignal h;
    public final c1.d f13415i;

    public a(Context context) {
        j.e(context, "context");
        this.f13412e = context;
        this.f13415i = new c1.d(this, new Handler(Looper.getMainLooper()), 4);
    }
}
