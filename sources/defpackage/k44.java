package defpackage;

import java.util.Map;
public final class k44 {
    public final String a;
    public final long b;
    public final Map c;

    public k44(String str, long j, Map map) {
        map.getClass();
        this.a = str;
        this.b = j;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k44) {
                k44 k44Var = (k44) obj;
                if (!this.a.equals(k44Var.a) || this.b != k44Var.b || !rp5.a(this.c, k44Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.b;
        return this.c.hashCode() + (((this.a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.a + ", timestamp=" + this.b + ", additionalCustomKeys=" + this.c + ')';
    }
}
