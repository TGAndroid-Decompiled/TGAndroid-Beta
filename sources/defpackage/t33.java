package defpackage;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class t33 extends j33 {
    public final Context e;
    public a33 f;
    public Executor g;
    public CancellationSignal h;
    public final j23 i;

    public t33(Context context) {
        context.getClass();
        this.e = context;
        this.i = new j23(this, new Handler(Looper.getMainLooper()), (byte) 3);
    }
}
