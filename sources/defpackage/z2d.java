package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class z2d extends z0d {
    public final byte c;
    public final TaskCompletionSource d;

    public z2d(u84 u84Var, TaskCompletionSource taskCompletionSource, byte b) {
        super((byte) 0);
        this.c = b;
        this.d = taskCompletionSource;
    }

    @Override
    public final void T(Status status, me7 me7Var) {
        switch (this.c) {
            case 0:
                dve.b(status, me7Var, this.d);
                return;
            default:
                super.T(status, me7Var);
                return;
        }
    }

    @Override
    public final void V(Status status, oe7 oe7Var) {
        switch (this.c) {
            case 1:
                dve.b(status, oe7Var, this.d);
                return;
            default:
                super.V(status, oe7Var);
                return;
        }
    }
}
