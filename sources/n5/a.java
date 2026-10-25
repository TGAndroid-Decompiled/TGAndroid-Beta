package n5;

import a1.g;
import m1.j;
public final class a {
    public final int f18717a;
    public final long f18718b;

    public a(int i10, long j10) {
        if (i10 != 0) {
            this.f18717a = i10;
            this.f18718b = j10;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (j.b(this.f18717a, aVar.f18717a) && this.f18718b == aVar.f18718b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j10 = this.f18718b;
        return ((j.c(this.f18717a) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        int i10 = this.f18717a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
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
        return g.r(sb2, this.f18718b, "}");
    }
}
