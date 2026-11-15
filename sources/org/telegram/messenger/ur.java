package org.telegram.messenger;

import j$.util.Objects;
public final class ur {
    public long f26861a;
    public long f26862b;

    public static ur a(long j3, long j10) {
        ?? obj = new Object();
        obj.f26861a = j3;
        obj.f26862b = j10;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ur.class == obj.getClass()) {
            ur urVar = (ur) obj;
            if (this.f26861a == urVar.f26861a && this.f26862b == urVar.f26862b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f26861a), Long.valueOf(this.f26862b));
    }

    public final String toString() {
        return "TopicKey{dialogId=" + this.f26861a + ", topicId=" + this.f26862b + '}';
    }
}
