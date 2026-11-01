package org.telegram.messenger;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class na {
    public final long f17277a;
    public final int f17278b;

    public na(TLRPC.Message message) {
        long B0 = kj.B0(message);
        int i10 = message.f19815id;
        this.f17277a = B0;
        this.f17278b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && na.class == obj.getClass()) {
            na naVar = (na) obj;
            if (this.f17277a == naVar.f17277a && this.f17278b == naVar.f17278b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f17277a), Integer.valueOf(this.f17278b));
    }
}
