package org.telegram.messenger;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class la {
    public final long f25173a;
    public final int f25174b;

    public la(TLRPC.Message message) {
        long B0 = gj.B0(message);
        int i7 = message.f28419id;
        this.f25173a = B0;
        this.f25174b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && la.class == obj.getClass()) {
            la laVar = (la) obj;
            if (this.f25173a == laVar.f25173a && this.f25174b == laVar.f25174b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f25173a), Integer.valueOf(this.f25174b));
    }
}
