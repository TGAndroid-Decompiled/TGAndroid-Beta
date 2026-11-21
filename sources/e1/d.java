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
    public final Context f10318e;
    public g f10319f;
    public Executor f10320g;
    public CancellationSignal h;
    public final e f10321i;

    public d(Context context) {
        j.e(context, "context");
        this.f10318e = context;
        this.f10321i = new e(this, new Handler(Looper.getMainLooper()), 2);
    }
}
