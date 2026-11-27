package defpackage;

import j$.util.Objects;
public final class if7 {
    public long a;
    public long b;

    public static if7 a(long j, long j2) {
        ?? obj = new Object();
        obj.a = j;
        obj.b = j2;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && if7.class == obj.getClass()) {
            if7 if7Var = (if7) obj;
            if (this.a == if7Var.a && this.b == if7Var.b) {
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
