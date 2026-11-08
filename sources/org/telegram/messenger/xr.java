package org.telegram.messenger;

import j$.util.Objects;
public final class xr {
    public long f26520a;
    public long f26521b;

    public static xr a(long j3, long j10) {
        ?? obj = new Object();
        obj.f26520a = j3;
        obj.f26521b = j10;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xr.class == obj.getClass()) {
            xr xrVar = (xr) obj;
            if (this.f26520a == xrVar.f26520a && this.f26521b == xrVar.f26521b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f26520a), Long.valueOf(this.f26521b));
    }

    public final String toString() {
        return "TopicKey{dialogId=" + this.f26520a + ", topicId=" + this.f26521b + '}';
    }
}
