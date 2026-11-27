package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
public abstract class xjb {
    public final a94[] a;
    public final boolean b;
    public final char c;

    public xjb(a94[] a94VarArr, boolean z, int i) {
        this.a = a94VarArr;
        boolean z2 = false;
        if (a94VarArr != null && z) {
            z2 = true;
        }
        this.b = z2;
        this.c = i;
    }

    public static wjb b() {
        ?? obj = new Object();
        obj.b = true;
        obj.d = (char) 0;
        return obj;
    }

    public abstract void c(d05 d05Var, TaskCompletionSource taskCompletionSource);
}
