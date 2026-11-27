package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class q7d extends q5d {
    public final byte c;
    public final TaskCompletionSource d;

    public q7d(qa4 qa4Var, TaskCompletionSource taskCompletionSource, byte b) {
        super((byte) 0);
        this.c = b;
        this.d = taskCompletionSource;
    }

    @Override
    public final void T(Status status, vg7 vg7Var) {
        switch (this.c) {
            case 0:
                vze.b(status, vg7Var, this.d);
                return;
            default:
                super.T(status, vg7Var);
                return;
        }
    }

    @Override
    public final void V(Status status, xg7 xg7Var) {
        switch (this.c) {
            case 1:
                vze.b(status, xg7Var, this.d);
                return;
            default:
                super.V(status, xg7Var);
                return;
        }
    }
}
