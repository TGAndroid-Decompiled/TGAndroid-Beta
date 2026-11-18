package org.telegram.messenger;

import j$.util.Objects;
public final class sr {
    public long f26847a;
    public long f26848b;

    public static sr a(long j3, long j10) {
        ?? obj = new Object();
        obj.f26847a = j3;
        obj.f26848b = j10;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sr.class == obj.getClass()) {
            sr srVar = (sr) obj;
            if (this.f26847a == srVar.f26847a && this.f26848b == srVar.f26848b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f26847a), Long.valueOf(this.f26848b));
    }

    public final String toString() {
        return "TopicKey{dialogId=" + this.f26847a + ", topicId=" + this.f26848b + '}';
    }
}
