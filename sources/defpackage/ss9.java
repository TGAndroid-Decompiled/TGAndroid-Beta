package defpackage;
public final class ss9 {
    public h19 a;
    public int b;
    public String c;
    public int d;

    public final boolean equals(Object obj) {
        if (obj instanceof ss9) {
            ss9 ss9Var = (ss9) obj;
            if (this.b == ss9Var.b && this.a.h == ss9Var.a.h && this.d == ss9Var.d) {
                return true;
            }
            return false;
        }
        return false;
    }
}
