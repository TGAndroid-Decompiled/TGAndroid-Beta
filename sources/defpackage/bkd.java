package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class bkd extends ej5 {
    public final Boolean b;
    public final TaskCompletionSource c;

    public bkd(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.b = bool;
        this.c = taskCompletionSource;
    }

    @Override
    public final void T(Status status) {
        dve.a(status, this.b, this.c);
    }
}
