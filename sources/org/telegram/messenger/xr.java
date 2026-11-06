package org.telegram.messenger;

import j$.util.Objects;
public final class xr {
    public long f26513a;
    public long f26514b;

    public static xr a(long j3, long j10) {
        ?? obj = new Object();
        obj.f26513a = j3;
        obj.f26514b = j10;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xr.class == obj.getClass()) {
            xr xrVar = (xr) obj;
            if (this.f26513a == xrVar.f26513a && this.f26514b == xrVar.f26514b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f26513a), Long.valueOf(this.f26514b));
    }

    public final String toString() {
        return "TopicKey{dialogId=" + this.f26513a + ", topicId=" + this.f26514b + '}';
    }
}
