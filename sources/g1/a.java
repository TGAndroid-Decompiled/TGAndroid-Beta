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
    public final Context f13070e;
    public g f13071f;
    public Executor f13072g;
    public CancellationSignal h;
    public final e f13073i;

    public a(Context context) {
        j.e(context, "context");
        this.f13070e = context;
        this.f13073i = new e(this, new Handler(Looper.getMainLooper()), 4);
    }
}
