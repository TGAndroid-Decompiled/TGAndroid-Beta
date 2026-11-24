package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;
public final class q4d extends z4d {
    public final jh0 b;

    public q4d(int i, jh0 jh0Var) {
        super(i);
        this.b = jh0Var;
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
            this.b.o(new Status(10, kt6.p(simpleName, ": ", localizedMessage, new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length())), null, null));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override
    public final void c(rhb rhbVar, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        jh0 jh0Var = this.b;
        ((Map) rhbVar.b).put(jh0Var, valueOf);
        jh0Var.b(new o5d(rhbVar, jh0Var));
    }

    @Override
    public final void d(w3d w3dVar) {
        try {
            jh0 jh0Var = this.b;
            try {
                try {
                    jh0Var.n(w3dVar.b);
                } catch (DeadObjectException e) {
                    jh0Var.o(new Status(8, e.getLocalizedMessage(), null, null));
                    throw e;
                }
            } catch (RemoteException e2) {
                jh0Var.o(new Status(8, e2.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e3) {
            b(e3);
        }
    }
}
