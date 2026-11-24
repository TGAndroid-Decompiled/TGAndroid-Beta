package defpackage;

import j$.util.Objects;
public final class fs6 {
    public final boolean a;
    public final String b;
    public final String c;

    public fs6(String str, String str2, boolean z) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && fs6.class == obj.getClass()) {
                fs6 fs6Var = (fs6) obj;
                if (this.a == fs6Var.a && Objects.equals(this.b, fs6Var.b) && Objects.equals(this.c, fs6Var.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b, this.c);
    }
}
