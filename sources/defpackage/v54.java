package defpackage;

import java.util.Map;
public final class v54 {
    public final String a;
    public final long b;
    public final Map c;

    public v54(String str, long j, Map map) {
        map.getClass();
        this.a = str;
        this.b = j;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof v54) {
                v54 v54Var = (v54) obj;
                if (!this.a.equals(v54Var.a) || this.b != v54Var.b || !rr5.a(this.c, v54Var.c)) {
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
