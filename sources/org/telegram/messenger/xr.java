package org.telegram.messenger;

import j$.util.Objects;
public final class xr {
    public long f26505a;
    public long f26506b;

    public static xr a(long j3, long j10) {
        ?? obj = new Object();
        obj.f26505a = j3;
        obj.f26506b = j10;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xr.class == obj.getClass()) {
            xr xrVar = (xr) obj;
            if (this.f26505a == xrVar.f26505a && this.f26506b == xrVar.f26506b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f26505a), Long.valueOf(this.f26506b));
    }

    public final String toString() {
        return "TopicKey{dialogId=" + this.f26505a + ", topicId=" + this.f26506b + '}';
    }
}
