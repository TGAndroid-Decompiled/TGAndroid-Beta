package org.telegram.messenger;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class ma {
    public final long f16935a;
    public final int f16936b;

    public ma(TLRPC.Message message) {
        long B0 = jj.B0(message);
        int i10 = message.f19814id;
        this.f16935a = B0;
        this.f16936b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ma.class == obj.getClass()) {
            ma maVar = (ma) obj;
            if (this.f16935a == maVar.f16935a && this.f16936b == maVar.f16936b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f16935a), Integer.valueOf(this.f16936b));
    }
}
