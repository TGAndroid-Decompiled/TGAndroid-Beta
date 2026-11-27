package defpackage;

import j$.util.Objects;
public final class en2 extends wl5 {
    public final String b;
    public final String c;
    public final String d;

    public en2(String str, String str2, String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && en2.class == obj.getClass()) {
                en2 en2Var = (en2) obj;
                if (this.c.equals(en2Var.c) && this.b.equals(en2Var.b) && Objects.equals(this.d, en2Var.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int j = bs2.j(bs2.j(527, 31, this.b), 31, this.c);
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return j + i;
    }

    @Override
    public final String toString() {
        return this.a + ": language=" + this.b + ", description=" + this.c + ", text=" + this.d;
    }
}
