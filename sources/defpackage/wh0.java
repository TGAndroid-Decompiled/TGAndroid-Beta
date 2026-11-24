package defpackage;

import j$.util.Objects;
public final class wh0 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public wh0(int i, int i2, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wh0)) {
            return false;
        }
        wh0 wh0Var = (wh0) obj;
        if (this.c == wh0Var.c && this.d == wh0Var.d && Objects.equals(this.a, wh0Var.a) && Objects.equals(this.b, wh0Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
    }
}
