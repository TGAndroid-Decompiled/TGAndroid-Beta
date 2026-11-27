package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class dv4 implements m0b {
    public final TaskCompletionSource a;

    public dv4(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        return false;
    }

    @Override
    public final boolean b(ia0 ia0Var) {
        int i = ia0Var.b;
        if (i == 3 || i == 4 || i == 5) {
            this.a.trySetResult(ia0Var.a);
            return true;
        }
        return false;
    }
}
