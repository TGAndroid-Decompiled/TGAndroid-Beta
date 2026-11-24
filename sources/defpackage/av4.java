package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class av4 implements mya {
    public final TaskCompletionSource a;

    public av4(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        return false;
    }

    @Override
    public final boolean b(gb0 gb0Var) {
        int i = gb0Var.b;
        if (i == 3 || i == 4 || i == 5) {
            this.a.trySetResult(gb0Var.a);
            return true;
        }
        return false;
    }
}
