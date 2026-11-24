package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class l4d extends cib {
    public final bib d;

    public l4d(bib bibVar, o94[] o94VarArr, boolean z, int i) {
        super(o94VarArr, z, i);
        this.d = bibVar;
    }

    @Override
    public final void c(zz4 zz4Var, TaskCompletionSource taskCompletionSource) {
        this.d.a.accept(zz4Var, taskCompletionSource);
    }
}
