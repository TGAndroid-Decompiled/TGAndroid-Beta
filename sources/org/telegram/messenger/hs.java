package org.telegram.messenger;

import j$.util.Objects;
public final class hs {
    public long f16109a;
    public long f16110b;

    public static hs a(long j10, long j11) {
        ?? obj = new Object();
        obj.f16109a = j10;
        obj.f16110b = j11;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hs.class == obj.getClass()) {
            hs hsVar = (hs) obj;
            if (this.f16109a == hsVar.f16109a && this.f16110b == hsVar.f16110b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f16109a), Long.valueOf(this.f16110b));
    }

    public final String toString() {
        return "TopicKey{dialogId=" + this.f16109a + ", topicId=" + this.f16110b + '}';
    }
}
