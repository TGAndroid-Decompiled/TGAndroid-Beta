package f1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import b1.d;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import v0.g;
public final class a extends d {
    public final Context f10883e;
    public g f10884f;
    public Executor f10885g;
    public CancellationSignal h;
    public final c1.d f10886i;

    public a(Context context) {
        j.e(context, "context");
        this.f10883e = context;
        this.f10886i = new c1.d(this, new Handler(Looper.getMainLooper()), 3);
    }
}
