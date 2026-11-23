package org.telegram.messenger;

import j$.util.Objects;
public final class tr {
    public long f27037a;
    public long f27038b;

    public static tr a(long j3, long j10) {
        ?? obj = new Object();
        obj.f27037a = j3;
        obj.f27038b = j10;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tr.class == obj.getClass()) {
            tr trVar = (tr) obj;
            if (this.f27037a == trVar.f27037a && this.f27038b == trVar.f27038b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f27037a), Long.valueOf(this.f27038b));
    }

    public final String toString() {
        return "TopicKey{dialogId=" + this.f27037a + ", topicId=" + this.f27038b + '}';
    }
}
