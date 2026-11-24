package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class dmd extends dl5 {
    public final Boolean b;
    public final TaskCompletionSource c;

    public dmd(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.b = bool;
        this.c = taskCompletionSource;
    }

    @Override
    public final void T(Status status) {
        fxe.a(status, this.b, this.c);
    }
}
