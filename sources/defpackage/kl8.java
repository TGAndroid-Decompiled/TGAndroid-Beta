package defpackage;
public final class kl8 {
    public final String a;
    public final String b;
    public final int c;

    public kl8(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = str2.hashCode() + (str.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kl8) {
            kl8 kl8Var = (kl8) obj;
            if (this.a.equals(kl8Var.a) && this.b.equals(kl8Var.b)) {
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
