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
    public final Context f10284e;
    public g f10285f;
    public Executor f10286g;
    public CancellationSignal h;
    public final e f10287i;

    public d(Context context) {
        j.e(context, "context");
        this.f10284e = context;
        this.f10287i = new e(this, new Handler(Looper.getMainLooper()), 2);
    }
}
