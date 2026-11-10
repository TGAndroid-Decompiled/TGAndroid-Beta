package org.telegram.messenger;

import j$.util.Objects;
public final class xr {
    public long f26524a;
    public long f26525b;

    public static xr a(long j3, long j10) {
        ?? obj = new Object();
        obj.f26524a = j3;
        obj.f26525b = j10;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xr.class == obj.getClass()) {
            xr xrVar = (xr) obj;
            if (this.f26524a == xrVar.f26524a && this.f26525b == xrVar.f26525b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f26524a), Long.valueOf(this.f26525b));
    }

    public final String toString() {
        return "TopicKey{dialogId=" + this.f26524a + ", topicId=" + this.f26525b + '}';
    }
}
