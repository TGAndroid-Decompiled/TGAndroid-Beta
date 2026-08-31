package e1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import c1.e;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import v0.i;
public final class d extends b1.d {
    public final Context f4884e;
    public i f4885f;
    public Executor f4886g;
    public CancellationSignal h;
    public final e f4887i;

    public d(Context context) {
        j.e(context, "context");
        this.f4884e = context;
        this.f4887i = new e(this, new Handler(Looper.getMainLooper()), 2);
    }
}
