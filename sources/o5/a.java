package o5;

import o1.g;
public final class a {
    public final int f20906a;
    public final long f20907b;

    public a(int i3, long j10) {
        if (i3 != 0) {
            this.f20906a = i3;
            this.f20907b = j10;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (g.b(this.f20906a, aVar.f20906a) && this.f20907b == aVar.f20907b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j10 = this.f20907b;
        return ((g.c(this.f20906a) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        int i3 = this.f20906a;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
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
        sb2.append(str);
        sb2.append(", nextRequestWaitMillis=");
        return a1.g.r(sb2, this.f20907b, "}");
    }
}
