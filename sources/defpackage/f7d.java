package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;
public final class f7d extends o7d {
    public final jg0 b;

    public f7d(int i, jg0 jg0Var) {
        super(i);
        this.b = jg0Var;
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
            this.b.o(new Status(10, qu6.o(simpleName, ": ", localizedMessage, new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length())), null, null));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override
    public final void c(zhc zhcVar, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        jg0 jg0Var = this.b;
        ((Map) zhcVar.b).put(jg0Var, valueOf);
        jg0Var.b(new d8d(zhcVar, jg0Var));
    }

    @Override
    public final void d(l6d l6dVar) {
        try {
            jg0 jg0Var = this.b;
            try {
                try {
                    jg0Var.n(l6dVar.b);
                } catch (DeadObjectException e) {
                    jg0Var.o(new Status(8, e.getLocalizedMessage(), null, null));
                    throw e;
                }
            } catch (RemoteException e2) {
                jg0Var.o(new Status(8, e2.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e3) {
            b(e3);
        }
    }
}
