package org.telegram.messenger;

import j$.util.Objects;
public final class pr {
    public long f24797a;
    public long f24798b;

    public static pr a(long j10, long j11) {
        ?? obj = new Object();
        obj.f24797a = j10;
        obj.f24798b = j11;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pr.class == obj.getClass()) {
            pr prVar = (pr) obj;
            if (this.f24797a == prVar.f24797a && this.f24798b == prVar.f24798b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f24797a), Long.valueOf(this.f24798b));
    }

    public final String toString() {
        return "TopicKey{dialogId=" + this.f24797a + ", topicId=" + this.f24798b + '}';
    }
}
