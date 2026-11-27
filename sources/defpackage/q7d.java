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
    public final void T(Status status, wg7 wg7Var) {
        switch (this.c) {
            case 0:
                vze.b(status, wg7Var, this.d);
                return;
            default:
                super.T(status, wg7Var);
                return;
        }
    }

    @Override
    public final void V(Status status, yg7 yg7Var) {
        switch (this.c) {
            case 1:
                vze.b(status, yg7Var, this.d);
                return;
            default:
                super.V(status, yg7Var);
                return;
        }
    }
}
