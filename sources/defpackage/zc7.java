package defpackage;

import j$.util.Objects;
public final class zc7 {
    public long a;
    public long b;

    public static zc7 a(long j, long j2) {
        ?? obj = new Object();
        obj.a = j;
        obj.b = j2;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zc7.class == obj.getClass()) {
            zc7 zc7Var = (zc7) obj;
            if (this.a == zc7Var.a && this.b == zc7Var.b) {
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
