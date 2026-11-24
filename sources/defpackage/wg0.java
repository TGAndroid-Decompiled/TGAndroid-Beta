package defpackage;

import j$.util.Objects;
public final class wg0 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public wg0(int i, int i2, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg0)) {
            return false;
        }
        wg0 wg0Var = (wg0) obj;
        if (this.c == wg0Var.c && this.d == wg0Var.d && Objects.equals(this.a, wg0Var.a) && Objects.equals(this.b, wg0Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
    }
}
