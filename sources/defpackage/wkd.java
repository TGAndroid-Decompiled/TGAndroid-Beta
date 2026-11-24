package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class wkd extends ane {
    public final TaskCompletionSource b;
    public final dmd c;

    public wkd(TaskCompletionSource taskCompletionSource, dmd dmdVar) {
        this.b = taskCompletionSource;
        this.c = dmdVar;
    }

    @Override
    public final void t(w5e w5eVar) {
        dve.a(w5eVar.a, null, this.b);
    }

    @Override
    public final void zze() {
        this.c.T();
    }
}
