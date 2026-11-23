package org.telegram.messenger;

import j$.util.Objects;
public final class tr {
    public long f27073a;
    public long f27074b;

    public static tr a(long j3, long j10) {
        ?? obj = new Object();
        obj.f27073a = j3;
        obj.f27074b = j10;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tr.class == obj.getClass()) {
            tr trVar = (tr) obj;
            if (this.f27073a == trVar.f27073a && this.f27074b == trVar.f27074b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f27073a), Long.valueOf(this.f27074b));
    }

    public final String toString() {
        return "TopicKey{dialogId=" + this.f27073a + ", topicId=" + this.f27074b + '}';
    }
}
