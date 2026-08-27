package e1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import v0.i;

public final class d extends b1.d {

    public final Context f5155e;

    public i f5156f;

    public Executor f5157g;
    public CancellationSignal h;

    public final c1.d f5158i;

    public d(Context context) {
        j.e(context, "context");
        this.f5155e = context;
        this.f5158i = new c1.d(this, new Handler(Looper.getMainLooper()), 2);
    }
}
