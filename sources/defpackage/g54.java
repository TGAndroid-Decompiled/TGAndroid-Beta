package defpackage;

import java.util.Map;
public final class g54 {
    public final String a;
    public final long b;
    public final Map c;

    public g54(String str, long j, Map map) {
        map.getClass();
        this.a = str;
        this.b = j;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g54) {
                g54 g54Var = (g54) obj;
                if (!this.a.equals(g54Var.a) || this.b != g54Var.b || !ur5.a(this.c, g54Var.c)) {
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
