package defpackage;
public final class lw9 {
    public w49 a;
    public int b;
    public String c;
    public int d;

    public final boolean equals(Object obj) {
        if (obj instanceof lw9) {
            lw9 lw9Var = (lw9) obj;
            if (this.b == lw9Var.b && this.a.h == lw9Var.a.h && this.d == lw9Var.d) {
                return true;
            }
            return false;
        }
        return false;
    }
}
