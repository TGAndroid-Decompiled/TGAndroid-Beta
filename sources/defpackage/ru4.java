package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class ru4 implements mya {
    public final uac a;
    public final TaskCompletionSource b;

    public ru4(uac uacVar, TaskCompletionSource taskCompletionSource) {
        this.a = uacVar;
        this.b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(gb0 gb0Var) {
        if (gb0Var.b == 4 && !this.a.a(gb0Var)) {
            String str = gb0Var.c;
            if (str != null) {
                this.b.setResult(new xa0(gb0Var.e, str, gb0Var.f));
                return true;
            }
            gxc.d("Null token");
        }
        return false;
    }
}
