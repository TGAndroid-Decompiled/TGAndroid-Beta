package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class qs4 implements jwa {
    public final t8c a;
    public final TaskCompletionSource b;

    public qs4(t8c t8cVar, TaskCompletionSource taskCompletionSource) {
        this.a = t8cVar;
        this.b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(ga0 ga0Var) {
        if (ga0Var.b == 4 && !this.a.a(ga0Var)) {
            String str = ga0Var.c;
            if (str != null) {
                this.b.setResult(new x90(ga0Var.e, str, ga0Var.f));
                return true;
            }
            fvc.f("Null token");
        }
        return false;
    }
}
