package org.telegram.messenger;

import j$.util.Objects;
public final class sr {
    public long f26946a;
    public long f26947b;

    public static sr a(long j3, long j10) {
        ?? obj = new Object();
        obj.f26946a = j3;
        obj.f26947b = j10;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sr.class == obj.getClass()) {
            sr srVar = (sr) obj;
            if (this.f26946a == srVar.f26946a && this.f26947b == srVar.f26947b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f26946a), Long.valueOf(this.f26947b));
    }

    public final String toString() {
        return "TopicKey{dialogId=" + this.f26946a + ", topicId=" + this.f26947b + '}';
    }
}
