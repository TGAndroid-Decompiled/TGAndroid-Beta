package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;
public final class o2d extends x2d {
    public final ig0 b;

    public o2d(int i, ig0 ig0Var) {
        super(i);
        this.b = ig0Var;
    }

    @Override
    public final void a(Status status) {
        try {
            this.b.o(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override
    public final void b(RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        try {
            this.b.o(new Status(10, ls6.o(simpleName, ": ", localizedMessage, new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length())), null, null));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override
    public final void c(aec aecVar, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        ig0 ig0Var = this.b;
        ((Map) aecVar.b).put(ig0Var, valueOf);
        ig0Var.b(new m3d(aecVar, ig0Var));
    }

    @Override
    public final void d(u1d u1dVar) {
        try {
            ig0 ig0Var = this.b;
            try {
                try {
                    ig0Var.n(u1dVar.b);
                } catch (DeadObjectException e) {
                    ig0Var.o(new Status(8, e.getLocalizedMessage(), null, null));
                    throw e;
                }
            } catch (RemoteException e2) {
                ig0Var.o(new Status(8, e2.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e3) {
            b(e3);
        }
    }
}
