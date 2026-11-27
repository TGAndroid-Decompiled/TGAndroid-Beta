package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class ead extends u3d {
    public final byte b;
    public final TaskCompletionSource c;

    public ead(TaskCompletionSource taskCompletionSource, byte b) {
        super((byte) 14);
        this.b = b;
        this.c = taskCompletionSource;
    }

    @Override
    public final void Q(Status status, boolean z) {
        switch (this.b) {
            case 1:
                vze.a(status, Boolean.valueOf(z), this.c);
                return;
            default:
                return;
        }
    }

    @Override
    public final void R(Status status, u18 u18Var) {
        switch (this.b) {
            case 0:
                int i = n70.b;
                boolean b = status.b();
                TaskCompletionSource taskCompletionSource = this.c;
                if (b) {
                    taskCompletionSource.setResult(u18Var);
                    return;
                } else {
                    taskCompletionSource.setException(sqd.a(status));
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public final void S(int i, boolean z) {
        switch (this.b) {
            case 1:
                vze.a(new Status(i, null, null, null), Boolean.valueOf(z), this.c);
                return;
            default:
                return;
        }
    }
}
