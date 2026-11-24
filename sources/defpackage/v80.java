package defpackage;
public final class v80 {
    public final int a;
    public final long b;

    public v80(int i, long j) {
        if (i != 0) {
            this.a = i;
            this.b = j;
            return;
        }
        gxc.d("Null status");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof v80) {
                v80 v80Var = (v80) obj;
                if (wi8.c(this.a, v80Var.a) && this.b == v80Var.b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.b;
        return ((wi8.F(this.a) ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.a;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        str = "null";
                    } else {
                        str = "INVALID_PAYLOAD";
                    }
                } else {
                    str = "FATAL_ERROR";
                }
            } else {
                str = "TRANSIENT_ERROR";
            }
        } else {
            str = "OK";
        }
        sb.append(str);
        sb.append(", nextRequestWaitMillis=");
        return kt6.q(sb, this.b, "}");
    }
}
