package org.telegram.messenger;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class ma {
    public final long f23990a;
    public final int f23991b;

    public ma(TLRPC.Message message) {
        long B0 = ij.B0(message);
        int i7 = message.f26973id;
        this.f23990a = B0;
        this.f23991b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ma.class == obj.getClass()) {
            ma maVar = (ma) obj;
            if (this.f23990a == maVar.f23990a && this.f23991b == maVar.f23991b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f23990a), Integer.valueOf(this.f23991b));
    }
}
