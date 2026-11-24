package defpackage;

import android.util.SparseArray;
public final class s71 {
    public long a;
    public int b;
    public long c;
    public final SparseArray d = new SparseArray();

    public s71(long j) {
        this.a = j;
    }

    public final void a(b81 b81Var, int i) {
        SparseArray sparseArray = this.d;
        t71 t71Var = (t71) sparseArray.get(i, null);
        if (t71Var == null) {
            t71Var = new t71();
            sparseArray.put(i, t71Var);
        }
        long j = b81Var.c;
        t71Var.a += j;
        this.c += j;
        this.b++;
        t71Var.b.add(b81Var);
    }

    public final void b(b81 b81Var) {
        t71 t71Var = (t71) this.d.get(b81Var.d, null);
        if (t71Var != null && t71Var.b.remove(b81Var)) {
            long j = t71Var.a;
            long j2 = b81Var.c;
            t71Var.a = j - j2;
            this.c -= j2;
            this.b--;
        }
    }
}
