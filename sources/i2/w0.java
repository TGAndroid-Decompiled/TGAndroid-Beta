package i2;

import j$.util.Objects;
public final class w0 {
    public final long f8107a;
    public final float f8108b;
    public final long f8109c;

    public w0(v0 v0Var) {
        this.f8107a = v0Var.f8098a;
        this.f8108b = v0Var.f8099b;
        this.f8109c = v0Var.f8100c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (this.f8107a == w0Var.f8107a && this.f8108b == w0Var.f8108b && this.f8109c == w0Var.f8109c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f8107a), Float.valueOf(this.f8108b), Long.valueOf(this.f8109c));
    }
}
