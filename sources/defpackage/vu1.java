package defpackage;
public final class vu1 {
    public jq1 a;
    public int b;
    public long c;
    public int d;
    public boolean e;

    public final boolean a(k27 k27Var) {
        if (k27Var != null) {
            if (k27Var.e1() != this.b) {
                if (this.c != 0 && k27Var.c1() == this.c) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean b(int i, long j) {
        if (this.b == i && this.c == j) {
            return false;
        }
        this.b = i;
        this.c = j;
        if (i == 0) {
            this.e = false;
            return true;
        }
        return true;
    }
}
