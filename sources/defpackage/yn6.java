package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
public final class yn6 {
    public final int a;
    public boolean b;
    public final String c;
    public final jo6 d;
    public final ArrayList e = new ArrayList();
    public final SparseArray f = new SparseArray();

    public yn6(int i, String str, jo6 jo6Var) {
        this.a = i;
        this.c = str;
        this.d = jo6Var;
    }

    public final void a(jo6 jo6Var) {
        this.e.add(jo6Var);
        this.f.put(jo6Var.C, jo6Var);
    }
}
