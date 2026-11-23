package org.telegram.messenger;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class la {
    public final long f25209a;
    public final int f25210b;

    public la(TLRPC.Message message) {
        long B0 = gj.B0(message);
        int i7 = message.f28455id;
        this.f25209a = B0;
        this.f25210b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && la.class == obj.getClass()) {
            la laVar = (la) obj;
            if (this.f25209a == laVar.f25209a && this.f25210b == laVar.f25210b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f25209a), Integer.valueOf(this.f25210b));
    }
}
