package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class l5d extends dzc {
    public final byte b;
    public final TaskCompletionSource c;

    public l5d(TaskCompletionSource taskCompletionSource, byte b) {
        super((byte) 14);
        this.b = b;
        this.c = taskCompletionSource;
    }

    @Override
    public final void Q(Status status, boolean z) {
        switch (this.b) {
            case 1:
                dve.a(status, Boolean.valueOf(z), this.c);
                return;
            default:
                return;
        }
    }

    @Override
    public final void R(Status status, oy7 oy7Var) {
        switch (this.b) {
            case 0:
                int i = l70.b;
                boolean b = status.b();
                TaskCompletionSource taskCompletionSource = this.c;
                if (b) {
                    taskCompletionSource.setResult(oy7Var);
                    return;
                } else {
                    taskCompletionSource.setException(bmd.a(status));
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
                dve.a(new Status(i, null, null, null), Boolean.valueOf(z), this.c);
                return;
            default:
                return;
        }
    }
}
