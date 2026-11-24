package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class sme extends dzc {
    public final byte b;
    public final TaskCompletionSource c;

    public sme(TaskCompletionSource taskCompletionSource, byte b) {
        super((byte) 13);
        this.b = b;
        this.c = taskCompletionSource;
    }

    @Override
    public final void P(Status status, nn5 nn5Var) {
        switch (this.b) {
            case 0:
                return;
            default:
                status.getClass();
                dve.a(status, nn5Var, this.c);
                return;
        }
    }

    @Override
    public final void f(Status status, r44 r44Var) {
        switch (this.b) {
            case 0:
                status.getClass();
                dve.a(status, r44Var, this.c);
                return;
            default:
                return;
        }
    }

    private final void T(Status status, r44 r44Var) {
    }

    private final void U(Status status, nn5 nn5Var) {
    }
}
