package defpackage;

import j$.util.Objects;
public final class bf7 {
    public long a;
    public long b;

    public static bf7 a(long j, long j2) {
        ?? obj = new Object();
        obj.a = j;
        obj.b = j2;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bf7.class == obj.getClass()) {
            bf7 bf7Var = (bf7) obj;
            if (this.a == bf7Var.a && this.b == bf7Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b));
    }

    public final String toString() {
        return "TopicKey{dialogId=" + this.a + ", topicId=" + this.b + '}';
    }
}
