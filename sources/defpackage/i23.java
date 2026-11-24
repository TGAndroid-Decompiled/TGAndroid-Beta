package defpackage;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class i23 extends y13 {
    public final Context e;
    public o13 f;
    public Executor g;
    public CancellationSignal h;
    public final x03 i;

    public i23(Context context) {
        context.getClass();
        this.e = context;
        this.i = new x03(this, new Handler(Looper.getMainLooper()), (byte) 3);
    }
}
