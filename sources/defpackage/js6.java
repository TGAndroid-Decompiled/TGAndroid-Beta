package defpackage;

import j$.util.Objects;
public final class js6 {
    public final boolean a;
    public final String b;
    public final String c;

    public js6(String str, String str2, boolean z) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && js6.class == obj.getClass()) {
                js6 js6Var = (js6) obj;
                if (this.a == js6Var.a && Objects.equals(this.b, js6Var.b) && Objects.equals(this.c, js6Var.c)) {
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
