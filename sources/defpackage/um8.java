package defpackage;
public final class um8 {
    public final String a;
    public final String b;
    public final int c;

    public um8(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = str2.hashCode() + (str.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof um8) {
            um8 um8Var = (um8) obj;
            if (this.a.equals(um8Var.a) && this.b.equals(um8Var.b)) {
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
