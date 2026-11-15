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
    public final Context f10699e;
    public g f10700f;
    public Executor f10701g;
    public CancellationSignal h;
    public final e f10702i;

    public a(Context context) {
        j.e(context, "context");
        this.f10699e = context;
        this.f10702i = new e(this, new Handler(Looper.getMainLooper()), 3);
    }
}
