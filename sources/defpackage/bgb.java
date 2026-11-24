package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
public abstract class bgb {
    public final f84[] a;
    public final boolean b;
    public final char c;

    public bgb(f84[] f84VarArr, boolean z, int i) {
        this.a = f84VarArr;
        boolean z2 = false;
        if (f84VarArr != null && z) {
            z2 = true;
        }
        this.b = z2;
        this.c = i;
    }

    public static agb b() {
        ?? obj = new Object();
        obj.b = true;
        obj.d = (char) 0;
        return obj;
    }

    public abstract void c(xx4 xx4Var, TaskCompletionSource taskCompletionSource);
}
