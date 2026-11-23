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
    public final Context f13108e;
    public g f13109f;
    public Executor f13110g;
    public CancellationSignal h;
    public final e f13111i;

    public a(Context context) {
        j.e(context, "context");
        this.f13108e = context;
        this.f13111i = new e(this, new Handler(Looper.getMainLooper()), 4);
    }
}
