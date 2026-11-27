package defpackage;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class r13 extends q23 {
    public final Context e;
    public h23 f;
    public Executor g;
    public CancellationSignal h;
    public final q13 i;

    public r13(Context context) {
        context.getClass();
        this.e = context;
        this.i = new q13(this, new Handler(Looper.getMainLooper()), (byte) 0);
    }
}
