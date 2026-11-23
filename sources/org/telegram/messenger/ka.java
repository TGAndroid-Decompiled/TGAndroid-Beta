package org.telegram.messenger;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class ka {
    public final long f25114a;
    public final int f25115b;

    public ka(TLRPC.Message message) {
        long B0 = fj.B0(message);
        int i7 = message.f28513id;
        this.f25114a = B0;
        this.f25115b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ka.class == obj.getClass()) {
            ka kaVar = (ka) obj;
            if (this.f25114a == kaVar.f25114a && this.f25115b == kaVar.f25115b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f25114a), Integer.valueOf(this.f25115b));
    }
}
