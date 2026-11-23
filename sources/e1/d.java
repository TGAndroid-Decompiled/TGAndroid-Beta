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
    public final Context f10321e;
    public g f10322f;
    public Executor f10323g;
    public CancellationSignal h;
    public final e f10324i;

    public d(Context context) {
        j.e(context, "context");
        this.f10321e = context;
        this.f10324i = new e(this, new Handler(Looper.getMainLooper()), 2);
    }
}
