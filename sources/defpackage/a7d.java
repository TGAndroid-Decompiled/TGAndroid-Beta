package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class a7d extends xjb {
    public final wjb d;

    public a7d(wjb wjbVar, a94[] a94VarArr, boolean z, int i) {
        super(a94VarArr, z, i);
        this.d = wjbVar;
    }

    @Override
    public final void c(d05 d05Var, TaskCompletionSource taskCompletionSource) {
        this.d.a.accept(d05Var, taskCompletionSource);
    }
}
