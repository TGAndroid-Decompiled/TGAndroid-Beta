package i2;

import j$.util.Objects;
public final class w0 {
    public final long f8108a;
    public final float f8109b;
    public final long f8110c;

    public w0(v0 v0Var) {
        this.f8108a = v0Var.f8099a;
        this.f8109b = v0Var.f8100b;
        this.f8110c = v0Var.f8101c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (this.f8108a == w0Var.f8108a && this.f8109b == w0Var.f8109b && this.f8110c == w0Var.f8110c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f8108a), Float.valueOf(this.f8109b), Long.valueOf(this.f8110c));
    }
}
