package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
public abstract class cib {
    public final o94[] a;
    public final boolean b;
    public final char c;

    public cib(o94[] o94VarArr, boolean z, int i) {
        this.a = o94VarArr;
        boolean z2 = false;
        if (o94VarArr != null && z) {
            z2 = true;
        }
        this.b = z2;
        this.c = i;
    }

    public static bib b() {
        ?? obj = new Object();
        obj.b = true;
        obj.d = (char) 0;
        return obj;
    }

    public abstract void c(zz4 zz4Var, TaskCompletionSource taskCompletionSource);
}
