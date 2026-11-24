package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class b5d extends b3d {
    public final byte c;
    public final TaskCompletionSource d;

    public b5d(ua4 ua4Var, TaskCompletionSource taskCompletionSource, byte b) {
        super((byte) 0);
        this.c = b;
        this.d = taskCompletionSource;
    }

    @Override
    public final void T(Status status, og7 og7Var) {
        switch (this.c) {
            case 0:
                fxe.b(status, og7Var, this.d);
                return;
            default:
                super.T(status, og7Var);
                return;
        }
    }

    @Override
    public final void V(Status status, qg7 qg7Var) {
        switch (this.c) {
            case 1:
                fxe.b(status, qg7Var, this.d);
                return;
            default:
                super.V(status, qg7Var);
                return;
        }
    }
}
