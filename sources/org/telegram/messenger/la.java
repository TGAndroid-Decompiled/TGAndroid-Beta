package org.telegram.messenger;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class la {
    public final long f24815a;
    public final int f24816b;

    public la(TLRPC.Message message) {
        long B0 = gj.B0(message);
        int i7 = message.f28072id;
        this.f24815a = B0;
        this.f24816b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && la.class == obj.getClass()) {
            la laVar = (la) obj;
            if (this.f24815a == laVar.f24815a && this.f24816b == laVar.f24816b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f24815a), Integer.valueOf(this.f24816b));
    }
}
