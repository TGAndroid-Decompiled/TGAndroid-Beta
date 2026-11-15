package org.telegram.messenger;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class la {
    public final long f24821a;
    public final int f24822b;

    public la(TLRPC.Message message) {
        long B0 = gj.B0(message);
        int i7 = message.f28072id;
        this.f24821a = B0;
        this.f24822b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && la.class == obj.getClass()) {
            la laVar = (la) obj;
            if (this.f24821a == laVar.f24821a && this.f24822b == laVar.f24822b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f24821a), Integer.valueOf(this.f24822b));
    }
}
