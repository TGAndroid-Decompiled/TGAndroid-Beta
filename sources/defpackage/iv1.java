package defpackage;
public final class iv1 {
    public wq1 a;
    public int b;
    public long c;
    public int d;
    public boolean e;

    public final boolean a(r47 r47Var) {
        if (r47Var != null) {
            if (r47Var.e1() != this.b) {
                if (this.c != 0 && r47Var.c1() == this.c) {
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
