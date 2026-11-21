package org.telegram.messenger;

import j$.util.Objects;
public final class sr {
    public long f26873a;
    public long f26874b;

    public static sr a(long j3, long j10) {
        ?? obj = new Object();
        obj.f26873a = j3;
        obj.f26874b = j10;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sr.class == obj.getClass()) {
            sr srVar = (sr) obj;
            if (this.f26873a == srVar.f26873a && this.f26874b == srVar.f26874b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f26873a), Long.valueOf(this.f26874b));
    }

    public final String toString() {
        return "TopicKey{dialogId=" + this.f26873a + ", topicId=" + this.f26874b + '}';
    }
}
