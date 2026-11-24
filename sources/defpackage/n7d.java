package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class n7d extends e1d {
    public final byte b;
    public final TaskCompletionSource c;

    public n7d(TaskCompletionSource taskCompletionSource, byte b) {
        super((byte) 14);
        this.b = b;
        this.c = taskCompletionSource;
    }

    @Override
    public final void Q(Status status, boolean z) {
        switch (this.b) {
            case 1:
                fxe.a(status, Boolean.valueOf(z), this.c);
                return;
            default:
                return;
        }
    }

    @Override
    public final void R(Status status, q08 q08Var) {
        switch (this.b) {
            case 0:
                int i = l80.b;
                boolean b = status.b();
                TaskCompletionSource taskCompletionSource = this.c;
                if (b) {
                    taskCompletionSource.setResult(q08Var);
                    return;
                } else {
                    taskCompletionSource.setException(dod.a(status));
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
                fxe.a(new Status(i, null, null, null), Boolean.valueOf(z), this.c);
                return;
            default:
                return;
        }
    }
}
