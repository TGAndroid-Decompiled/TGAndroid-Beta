package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class voe extends e1d {
    public final byte b;
    public final TaskCompletionSource c;

    public voe(TaskCompletionSource taskCompletionSource, byte b) {
        super((byte) 13);
        this.b = b;
        this.c = taskCompletionSource;
    }

    @Override
    public final void P(Status status, np5 np5Var) {
        switch (this.b) {
            case 0:
                return;
            default:
                status.getClass();
                fxe.a(status, np5Var, this.c);
                return;
        }
    }

    @Override
    public final void f(Status status, c64 c64Var) {
        switch (this.b) {
            case 0:
                status.getClass();
                fxe.a(status, c64Var, this.c);
                return;
            default:
                return;
        }
    }

    private final void T(Status status, c64 c64Var) {
    }

    private final void U(Status status, np5 np5Var) {
    }
}
