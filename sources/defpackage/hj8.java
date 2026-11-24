package defpackage;
public final class hj8 {
    public final String a;
    public final String b;
    public final int c;

    public hj8(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = str2.hashCode() + (str.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hj8) {
            hj8 hj8Var = (hj8) obj;
            if (this.a.equals(hj8Var.a) && this.b.equals(hj8Var.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }
}
