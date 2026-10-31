package org.telegram.messenger;

import j$.util.Objects;
public final class gs {
    public long f15760a;
    public long f15761b;

    public static gs a(long j10, long j11) {
        ?? obj = new Object();
        obj.f15760a = j10;
        obj.f15761b = j11;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gs.class == obj.getClass()) {
            gs gsVar = (gs) obj;
            if (this.f15760a == gsVar.f15760a && this.f15761b == gsVar.f15761b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f15760a), Long.valueOf(this.f15761b));
    }

    public final String toString() {
        return "TopicKey{dialogId=" + this.f15760a + ", topicId=" + this.f15761b + '}';
    }
}
