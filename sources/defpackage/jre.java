package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class jre extends u3d {
    public final byte b;
    public final TaskCompletionSource c;

    public jre(TaskCompletionSource taskCompletionSource, byte b) {
        super((byte) 13);
        this.b = b;
        this.c = taskCompletionSource;
    }

    @Override
    public final void P(Status status, qp5 qp5Var) {
        switch (this.b) {
            case 0:
                return;
            default:
                status.getClass();
                vze.a(status, qp5Var, this.c);
                return;
        }
    }

    @Override
    public final void f(Status status, n54 n54Var) {
        switch (this.b) {
            case 0:
                status.getClass();
                vze.a(status, n54Var, this.c);
                return;
            default:
                return;
        }
    }

    private final void T(Status status, n54 n54Var) {
    }

    private final void U(Status status, qp5 qp5Var) {
    }
}
