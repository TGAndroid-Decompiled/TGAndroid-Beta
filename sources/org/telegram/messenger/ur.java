package org.telegram.messenger;

import j$.util.Objects;
public final class ur {
    public long f26860a;
    public long f26861b;

    public static ur a(long j3, long j10) {
        ?? obj = new Object();
        obj.f26860a = j3;
        obj.f26861b = j10;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ur.class == obj.getClass()) {
            ur urVar = (ur) obj;
            if (this.f26860a == urVar.f26860a && this.f26861b == urVar.f26861b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f26860a), Long.valueOf(this.f26861b));
    }

    public final String toString() {
        return "TopicKey{dialogId=" + this.f26860a + ", topicId=" + this.f26861b + '}';
    }
}
