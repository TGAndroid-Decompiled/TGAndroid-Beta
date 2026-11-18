package org.telegram.messenger;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class ka {
    public final long f25018a;
    public final int f25019b;

    public ka(TLRPC.Message message) {
        long B0 = fj.B0(message);
        int i7 = message.f28426id;
        this.f25018a = B0;
        this.f25019b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ka.class == obj.getClass()) {
            ka kaVar = (ka) obj;
            if (this.f25018a == kaVar.f25018a && this.f25019b == kaVar.f25019b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f25018a), Integer.valueOf(this.f25019b));
    }
}
