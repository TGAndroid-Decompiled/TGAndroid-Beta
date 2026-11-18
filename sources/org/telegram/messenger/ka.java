package org.telegram.messenger;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class ka {
    public final long f25015a;
    public final int f25016b;

    public ka(TLRPC.Message message) {
        long B0 = fj.B0(message);
        int i7 = message.f28424id;
        this.f25015a = B0;
        this.f25016b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ka.class == obj.getClass()) {
            ka kaVar = (ka) obj;
            if (this.f25015a == kaVar.f25015a && this.f25016b == kaVar.f25016b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f25015a), Integer.valueOf(this.f25016b));
    }
}
