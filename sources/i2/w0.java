package i2;

import j$.util.Objects;
public final class w0 {
    public final long f13782a;
    public final float f13783b;
    public final long f13784c;

    public w0(v0 v0Var) {
        this.f13782a = v0Var.f13777a;
        this.f13783b = v0Var.f13778b;
        this.f13784c = v0Var.f13779c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (this.f13782a == w0Var.f13782a && this.f13783b == w0Var.f13783b && this.f13784c == w0Var.f13784c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f13782a), Float.valueOf(this.f13783b), Long.valueOf(this.f13784c));
    }
}
