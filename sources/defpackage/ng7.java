package defpackage;

import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class ng7 extends FutureTask {
    public final oy a;

    public ng7(oy oyVar, mg7 mg7Var) {
        super(mg7Var);
        this.a = oyVar;
    }

    @Override
    public final void done() {
        oy oyVar = this.a;
        AtomicBoolean atomicBoolean = oyVar.d;
        try {
            Object obj = get();
            if (!atomicBoolean.get()) {
                oyVar.b(obj);
            }
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (CancellationException unused) {
            if (!atomicBoolean.get()) {
                oyVar.b(null);
            }
        } catch (ExecutionException e2) {
            rjb.k("An error occurred while executing doInBackground()", e2.getCause());
        } catch (Throwable th) {
            rjb.k("An error occurred while executing doInBackground()", th);
        }
    }
}
