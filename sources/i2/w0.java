package i2;

import j$.util.Objects;
public final class w0 {
    public final long f13783a;
    public final float f13784b;
    public final long f13785c;

    public w0(v0 v0Var) {
        this.f13783a = v0Var.f13778a;
        this.f13784b = v0Var.f13779b;
        this.f13785c = v0Var.f13780c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (this.f13783a == w0Var.f13783a && this.f13784b == w0Var.f13784b && this.f13785c == w0Var.f13785c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f13783a), Float.valueOf(this.f13784b), Long.valueOf(this.f13785c));
    }
}
