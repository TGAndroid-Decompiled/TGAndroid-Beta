package defpackage;

import j$.util.Objects;
public final class wn2 extends tl5 {
    public final String b;
    public final String c;
    public final String d;

    public wn2(String str, String str2, String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && wn2.class == obj.getClass()) {
                wn2 wn2Var = (wn2) obj;
                if (this.c.equals(wn2Var.c) && this.b.equals(wn2Var.b) && Objects.equals(this.d, wn2Var.d)) {
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
        int j = ts2.j(ts2.j(527, 31, this.b), 31, this.c);
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
