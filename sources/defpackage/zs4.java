package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class zs4 implements jwa {
    public final TaskCompletionSource a;

    public zs4(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        return false;
    }

    @Override
    public final boolean b(ga0 ga0Var) {
        int i = ga0Var.b;
        if (i == 3 || i == 4 || i == 5) {
            this.a.trySetResult(ga0Var.a);
            return true;
        }
        return false;
    }
}
