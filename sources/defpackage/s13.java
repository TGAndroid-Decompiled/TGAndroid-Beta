package defpackage;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;
public interface s13 {
    boolean isAvailableOnDevice();

    void onCreateCredential(Context context, i03 i03Var, CancellationSignal cancellationSignal, Executor executor, o13 o13Var);

    void onGetCredential(Context context, si8 si8Var, CancellationSignal cancellationSignal, Executor executor, o13 o13Var);

    void onGetCredential(Context context, ws4 ws4Var, CancellationSignal cancellationSignal, Executor executor, o13 o13Var);

    void onPrepareCredential(ws4 ws4Var, CancellationSignal cancellationSignal, Executor executor, o13 o13Var);
}
