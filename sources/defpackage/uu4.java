package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class uu4 implements m0b {
    public final tcc a;
    public final TaskCompletionSource b;

    public uu4(tcc tccVar, TaskCompletionSource taskCompletionSource) {
        this.a = tccVar;
        this.b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(ia0 ia0Var) {
        if (ia0Var.b == 4 && !this.a.a(ia0Var)) {
            String str = ia0Var.c;
            if (str != null) {
                this.b.setResult(new z90(ia0Var.e, ia0Var.f, str));
                return true;
            }
            p3d.h("Null token");
        }
        return false;
    }
}
