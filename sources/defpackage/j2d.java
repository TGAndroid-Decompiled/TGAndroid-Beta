package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class j2d extends bgb {
    public final agb d;

    public j2d(agb agbVar, f84[] f84VarArr, boolean z, int i) {
        super(f84VarArr, z, i);
        this.d = agbVar;
    }

    @Override
    public final void c(xx4 xx4Var, TaskCompletionSource taskCompletionSource) {
        this.d.a.accept(xx4Var, taskCompletionSource);
    }
}
