package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class sod extends gl5 {
    public final Boolean b;
    public final TaskCompletionSource c;

    public sod(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.b = bool;
        this.c = taskCompletionSource;
    }

    @Override
    public final void T(Status status) {
        vze.a(status, this.b, this.c);
    }
}
