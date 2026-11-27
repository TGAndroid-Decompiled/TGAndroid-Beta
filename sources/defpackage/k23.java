package defpackage;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;
public interface k23 {
    boolean isAvailableOnDevice();

    void onCreateCredential(Context context, b13 b13Var, CancellationSignal cancellationSignal, Executor executor, h23 h23Var);

    void onGetCredential(Context context, av4 av4Var, CancellationSignal cancellationSignal, Executor executor, h23 h23Var);

    void onGetCredential(Context context, fm8 fm8Var, CancellationSignal cancellationSignal, Executor executor, h23 h23Var);

    void onPrepareCredential(av4 av4Var, CancellationSignal cancellationSignal, Executor executor, h23 h23Var);
}
