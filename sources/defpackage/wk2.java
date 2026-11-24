package defpackage;
public final class wk2 {
    public final String a;
    public final String b;

    public wk2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wk2) {
            wk2 wk2Var = (wk2) obj;
            if (this.a.equals(wk2Var.a) && this.b.equals(wk2Var.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
