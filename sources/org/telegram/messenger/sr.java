package org.telegram.messenger;

import j$.util.Objects;
public final class sr {
    public long f26845a;
    public long f26846b;

    public static sr a(long j3, long j10) {
        ?? obj = new Object();
        obj.f26845a = j3;
        obj.f26846b = j10;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sr.class == obj.getClass()) {
            sr srVar = (sr) obj;
            if (this.f26845a == srVar.f26845a && this.f26846b == srVar.f26846b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f26845a), Long.valueOf(this.f26846b));
    }

    public final String toString() {
        return "TopicKey{dialogId=" + this.f26845a + ", topicId=" + this.f26846b + '}';
    }
}
