package org.telegram.messenger;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class ka {
    public final long f25043a;
    public final int f25044b;

    public ka(TLRPC.Message message) {
        long B0 = fj.B0(message);
        int i7 = message.f28452id;
        this.f25043a = B0;
        this.f25044b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ka.class == obj.getClass()) {
            ka kaVar = (ka) obj;
            if (this.f25043a == kaVar.f25043a && this.f25044b == kaVar.f25044b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f25043a), Integer.valueOf(this.f25044b));
    }
}
