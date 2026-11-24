package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
public final class xl6 {
    public final int a;
    public boolean b;
    public final String c;
    public final jm6 d;
    public final ArrayList e = new ArrayList();
    public final SparseArray f = new SparseArray();

    public xl6(int i, String str, jm6 jm6Var) {
        this.a = i;
        this.c = str;
        this.d = jm6Var;
    }

    public final void a(jm6 jm6Var) {
        this.e.add(jm6Var);
        this.f.put(jm6Var.C, jm6Var);
    }
}
